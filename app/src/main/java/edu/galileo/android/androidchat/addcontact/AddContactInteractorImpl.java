package edu.galileo.android.androidchat.addcontact;

/**
 * Created by Roberto Hdez. on 12/06/16.
 * <roberto.htamayo@gmail.com>
 */

public class AddContactInteractorImpl implements AddContactInteractor {
    AddContactRepositoryImpl addContactRepository;

    public AddContactInteractorImpl(AddContactRepositoryImpl addContactRepository) {
        this.addContactRepository = addContactRepository;
    }

    @Override
    public void addContact(String email) {
        addContactRepository.addContact(email);
    }
}
