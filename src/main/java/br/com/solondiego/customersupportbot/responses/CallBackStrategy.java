package br.com.solondiego.customersupportbot.responses;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

public class CallBackStrategy implements Strategy{

    @Override
    public SendMessage getResponse(Update update) {
        return null;
    }
}
