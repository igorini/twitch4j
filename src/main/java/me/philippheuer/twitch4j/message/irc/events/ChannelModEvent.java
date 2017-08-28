package me.philippheuer.twitch4j.message.irc.events;

import lombok.Getter;
import me.philippheuer.twitch4j.message.irc.IRCParser;

@Getter
public class ChannelModEvent {
	private final String channel;
	private final String username;

	public ChannelModEvent(IRCParser parser) {
		username = parser.getMessage().split(" ")[1];
		channel = parser.getChannelName();
	}
}