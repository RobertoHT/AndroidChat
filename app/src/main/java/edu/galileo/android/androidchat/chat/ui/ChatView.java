package edu.galileo.android.androidchat.chat.ui;

import edu.galileo.android.androidchat.chat.entities.ChatMessage;

/**
 * Created by Roberto Hdez. on 12/06/16.
 * <roberto.htamayo@gmail.com>
 */

public interface ChatView {
    void sendMessage();
    void onMessageReceived(ChatMessage msg);
}
