package abex.os.keepassxc;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("keepassxc")
public interface KeePassXcConfig extends Config
{
	@ConfigItem(
		keyName = "defaultTitle",
		name = "Auto fill entry title",
		description = "The title of the Entry to automatically populate into the login screen"
	)
	default String defaultTitle()
	{
		return "";
	}

	@ConfigItem(
		keyName = "autoOpenPanel",
		name = "Auto open panel",
		description = "Whether or not to open the sidebar panel on the login screen"
	)
	default boolean autoOpenPanel()
	{
		return true;
	}
}
