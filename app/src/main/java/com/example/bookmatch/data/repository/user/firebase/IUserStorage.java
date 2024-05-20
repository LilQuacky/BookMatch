package com.example.bookmatch.data.repository.user.firebase;

import com.example.bookmatch.utils.callbacks.UserResponseCallback;

public abstract class IUserStorage {
    protected UserResponseCallback responseCallback;

    public void setUserResponseCallback(UserResponseCallback responseCallback) {
        this.responseCallback = responseCallback;
    }

    public abstract void saveImageInStorage();
}
