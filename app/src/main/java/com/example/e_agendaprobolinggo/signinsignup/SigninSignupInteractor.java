package com.example.e_agendaprobolinggo.signinsignup;

import android.os.Handler;

import com.example.e_agendaprobolinggo.model.response.UserResponse;
import com.example.e_agendaprobolinggo.network.NetworkApi;
import com.example.e_agendaprobolinggo.network.UtilsApi;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class SigninSignupInteractor implements SigninSignupContract.Interactor {

    private NetworkApi networkApi = UtilsApi.getApiService();

    @Override
    public void doSignin(final SigninSignupContract.SigninCallback signinCallback) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
//                networkApi.loginUser(email, password).subscribeOn(Schedulers.io()).subscribe(new Observer<UserResponse>() {
//                    @Override
//                    public void onSubscribe(@NonNull Disposable d) {
//
//                    }
//
//                    @Override
//                    public void onNext(@NonNull UserResponse userResponse) {
//                        if (userResponse.isStatus()){
//                            signinCallback.onSigninSuccess(userResponse.getMessage());
//                        } else {
//                            signinCallback.onSignupFailure(userResponse.getMessage());
//                        }
//                    }
//
//                    @Override
//                    public void onError(@NonNull Throwable e) {
//
//                    }
//
//                    @Override
//                    public void onComplete() {
//
//                    }
//                });
//                if (false){
//                    signinCallback.onSigninSuccess("Berhasil masuk");
//                } else {
//                    signinCallback.onSignupFailure("Gagal masuk");
//                }
            }
        }, 2000);
    }

    @Override
    public void doSignup(final SigninSignupContract.SignupCallback signupCallback) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (true){
                    signupCallback.onSignupSuccess("Berhasil mendaftar");
                } else {
                    signupCallback.onSignupFailure("Gagal mendaftar");
                }
            }
        }, 2000);
    }

}
