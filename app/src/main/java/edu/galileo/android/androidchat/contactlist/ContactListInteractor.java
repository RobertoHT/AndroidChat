package edu.galileo.android.androidchat.contactlist;

/**
 * Created by Roberto Hdez. on 12/06/16.
 * <roberto.htamayo@gmail.com>
 */

public interface ContactListInteractor {
    void subscribeForContactEvents();
    void unSubscribeForContactEvents();
    void destroyContactListListener();
    void removeContact(String email);
}
