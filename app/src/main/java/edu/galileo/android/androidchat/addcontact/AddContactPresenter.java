package edu.galileo.android.androidchat.addcontact;

import edu.galileo.android.androidchat.addcontact.events.AddContactEvent;

/**
 * Created by Roberto Hdez. on 12/06/16.
 * <roberto.htamayo@gmail.com>
 */

public interface AddContactPresenter {
    void onShow();
    void onDestroy();

    void addContact(String email);
    void onEventMainThread(AddContactEvent event);
}
