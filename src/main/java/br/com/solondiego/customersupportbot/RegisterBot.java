package br.com.solondiego.customersupportbot;

public class RegisterBot {
    public static String BOT_TOKEN;
    public static String BOT_USERNAME;

    private RegisterBot(){

    }

    static{
        BOT_TOKEN = PropertiesReader.getProperty("bot.token");
        BOT_USERNAME = PropertiesReader.getProperty("bot.username");
    }
}
