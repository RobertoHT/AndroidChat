package edu.galileo.android.androidchat.contactlist;

/**
 * Created by Roberto Hdez. on 12/06/16.
 * <roberto.htamayo@gmail.com>
 */

public interface ContactListRepository {
    void signOff();
    String getCurrentEmail();
    void removeContact(String email);
    void destroyContactListListener();
    void subscribeForContactListUpdates();
    void unSubscribeForContactListUpdates();
    void changeUserConnectionStatus(boolean online);
}
