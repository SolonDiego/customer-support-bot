package br.com.solondiego.customersupportbot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class Responder extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {
        return RegisterBot.BOT_USERNAME;
    }

    @Override
    public String getBotToken() {
        return RegisterBot.BOT_TOKEN;
    }

    @Override
    public void onUpdateReceived(Update update) {

    }
}
