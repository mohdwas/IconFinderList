package com.app.waseem.iconfinderapp.Rest;

public interface ResponseCallback<T> {

    void success(T t);

    void  failure(T t);

}
