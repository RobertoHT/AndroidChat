package edu.galileo.android.androidchat.contactlist;

import edu.galileo.android.androidchat.contactlist.events.ContactListEvent;

/**
 * Created by Roberto Hdez. on 12/06/16.
 * <roberto.htamayo@gmail.com>
 */

public interface ContactListPresenter {
    void onPause();
    void onResume();
    void onCreate();
    void onDestroy();

    void signOff();
    String getCurrentUserEmail();
    void removeContact(String email);
    void onEventMainThread(ContactListEvent event);
}
