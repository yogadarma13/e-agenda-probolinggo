package com.example.e_agendaprobolinggo.ui.home;

import com.example.e_agendaprobolinggo.model.body.AgendaType;
import com.example.e_agendaprobolinggo.model.response.Agenda;

import java.util.ArrayList;

public class HomePresenter implements HomeContract.Presenter {

    private HomeContract.View mView;
    private HomeContract.Interactor mInteractor;

    public HomePresenter(HomeContract.View view) {
        mView = view;
        mInteractor = new HomeInteractor();
    }

    @Override
    public void requestAgendaList() {
        mInteractor.requestAgendaList(new HomeContract.AgendaRequestCallback() {
            @Override
            public void onAgendaRequestCompleted(Agenda agenda) {
                mView.populateAgenda(agenda);
            }

            @Override
            public void onAgendaRequestFailure(String message) {
                // Must in main thread
                mView.showAgendaFailure(message);
            }
        });
    }

    @Override
    public void requestAgendaTypeList() {
        mInteractor.requestAgendaTypeList(new HomeContract.AgendaTypeRequestCallback() {
            @Override
            public void onAgendaTypeRequestCompleted(ArrayList<AgendaType> agendaTypes) {
                // Must in main thread
                mView.populateAgendaType(agendaTypes);
            }

            @Override
            public void onAgendaTypeRequestFailure(String message) {
                // Must in main thread
                mView.showAgendaTypeFailure(message);
            }
        });
    }
}
