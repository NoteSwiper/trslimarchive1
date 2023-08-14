package git_ntesp.trslim.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;

import java.util.HashMap;

import git_ntesp.trslim.world.inventory.RadioGUIMenu;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class RadioGUIScreen extends AbstractContainerScreen<RadioGUIMenu> {
	private final static HashMap<String, Object> guistate = RadioGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox frequency_sel;
	Button button_jump;

	public RadioGUIScreen(RadioGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 324;
		this.imageHeight = 211;
	}

	private static final ResourceLocation texture = new ResourceLocation("trslim:textures/screens/radio_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		frequency_sel.render(ms, mouseX, mouseY, partialTicks);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (frequency_sel.isFocused())
			return frequency_sel.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		frequency_sel.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.trslim.radio_gui.label_freq"), 3, 87, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.trslim.radio_gui.label_frequency_selector"), 168, 104, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.trslim.radio_gui.label_radio"), 3, 4, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.trslim.radio_gui.label_radiofreqkhz"), 37, 87, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.trslim.radio_gui.label_connections"), 4, 18, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.trslim.radio_gui.label_rx_s"), 4, 44, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		frequency_sel = new EditBox(this.font, this.leftPos + 167, this.topPos + 119, 120, 20, Component.translatable("gui.trslim.radio_gui.frequency_sel")) {
			{
				setSuggestion(Component.translatable("gui.trslim.radio_gui.frequency_sel").getString());
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.trslim.radio_gui.frequency_sel").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.trslim.radio_gui.frequency_sel").getString());
				else
					setSuggestion(null);
			}
		};
		frequency_sel.setMaxLength(32767);
		guistate.put("text:frequency_sel", frequency_sel);
		this.addWidget(this.frequency_sel);
		button_jump = Button.builder(Component.translatable("gui.trslim.radio_gui.button_jump"), e -> {
		}).bounds(this.leftPos + 167, this.topPos + 141, 46, 20).build();
		guistate.put("button:button_jump", button_jump);
		this.addRenderableWidget(button_jump);
	}
}
