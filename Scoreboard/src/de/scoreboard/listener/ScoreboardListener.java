package de.scoreboard.listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;

public class ScoreboardListener implements Listener{
	
	@EventHandler
	public void handlePlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		event.setJoinMessage("");
		
		Scoreboard board = Bukkit.getScoreboardManager().getNewScoreboard();
		Objective objectiv = board.registerNewObjective("abcd", "abcd");
		objectiv.setDisplaySlot(DisplaySlot.SIDEBAR);
		objectiv.setDisplayName("�6�lEnderGamesMC.de");
		objectiv.getScore("�c�lRang:").setScore(9);
		if(player.hasPermission("Prefix.Owner")) {
			objectiv.getScore("�4�lOwner").setScore(8);
		} else if(player.hasPermission("Prefix.Spieler")) {
			objectiv.getScore("�c�lFreund").setScore(8);
		} else if(player.hasPermission("Prefix.Freund")) {
			objectiv.getScore("�c�lSpieler").setScore(8);
		} else if(player.hasPermission("Prefix.Youtuber")) {
			objectiv.getScore("�5�lYoutuber").setScore(8);
		} else if(player.hasPermission("Prefix.MasterBuilder")) {
			objectiv.getScore("�1�lMBuilder").setScore(8);
		} else if(player.hasPermission("Prefix.DI/TSAdmin")) {
			objectiv.getScore("�6�lDI/TSAdmin").setScore(8);
		} else if(player.hasPermission("Prefix.DevAzubi")) {
			objectiv.getScore("�d�lDevAzubi").setScore(8);
		} else if(player.hasPermission("Prefix.BuildAzubi")) {
			objectiv.getScore("�d�lBuildAzubi").setScore(8);
		} else if(player.hasPermission("Prefix.Developer")) {
			objectiv.getScore("�b�lDeveveloper").setScore(8);
		} else if(player.hasPermission("Prefix.Admin")) {
			objectiv.getScore("�c�lAdmin").setScore(8);
		} else if(player.hasPermission("Prefix.Builder")) {
			objectiv.getScore("�a�lBuilder").setScore(8);
		} else if(player.hasPermission("Prefix.Moderator")) {
			objectiv.getScore("�3�lModerator").setScore(8);
		} else if(player.hasPermission("Prefix.Supporter")) {
			objectiv.getScore("�2�lSupporter").setScore(8);
		} else if(player.hasPermission("Prefix.Youtuber+")) {
			objectiv.getScore("�5�lYoutuber�4�l+").setScore(8);
		} else if(player.hasPermission("Prefix.Legende")) {
			objectiv.getScore("�c�lLegende").setScore(8);
		} else if(player.hasPermission("Prefix.Titan")) {
			objectiv.getScore("�9�lTitan").setScore(8);
		} else if(player.hasPermission("Prefix.Drache")) {
			objectiv.getScore("�4�lDrache").setScore(8);
		} else if(player.hasPermission("Prefix.Champ")) {
			objectiv.getScore("�e�lChampion").setScore(8);
		} else if(player.hasPermission("Prefix.Ultra")) {
			objectiv.getScore("�b�lUltra").setScore(8);
		} else if(player.hasPermission("Prefix.Premium")) {
			objectiv.getScore("�6�lPremium").setScore(8);
		}
		objectiv.getScore("").setScore(7);
		objectiv.getScore("�c�lName:").setScore(6);
		objectiv.getScore("�b�l" + player.getName()).setScore(5);
		objectiv.getScore("").setScore(4);
		objectiv.getScore("�c�lSpieler:").setScore(3);
		objectiv.getScore("�c�l" + player.getServer().getMaxPlayers()).setScore(2);
		objectiv.getScore("�aViel Spa� auf dem Server!").setScore(1);
		player.setScoreboard(board);
	}
}
