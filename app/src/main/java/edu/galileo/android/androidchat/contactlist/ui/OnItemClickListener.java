package edu.galileo.android.androidchat.contactlist.ui;

import edu.galileo.android.androidchat.contactlist.entities.User;

/**
 * Created by Roberto Hdez. on 12/06/16.
 * <roberto.htamayo@gmail.com>
 */

public interface OnItemClickListener {
    void onItemClick(User user);
    void onItemLongClick(User user);
}
