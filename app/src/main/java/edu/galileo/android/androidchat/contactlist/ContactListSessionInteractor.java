package edu.galileo.android.androidchat.contactlist;

/**
 * Created by Roberto Hdez. on 12/06/16.
 * <roberto.htamayo@gmail.com>
 */

public interface ContactListSessionInteractor {
    void signOff();
    String getCurrentUserEmail();
    void changeConnectionStatus(boolean online);
}
