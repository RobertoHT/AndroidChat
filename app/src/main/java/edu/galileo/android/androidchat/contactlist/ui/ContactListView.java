package edu.galileo.android.androidchat.contactlist.ui;

import edu.galileo.android.androidchat.contactlist.entities.User;

/**
 * Created by Roberto Hdez. on 12/06/16.
 * <roberto.htamayo@gmail.com>
 */

public interface ContactListView {
    void onContactAdded(User user);
    void onContactChanged(User user);
    void onContactRemoved(User user);
}
