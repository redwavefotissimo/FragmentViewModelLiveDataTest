package com.android.personal.fragmentviewmodellivedatatest.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.android.personal.fragmentviewmodellivedatatest.model.Player;
import com.android.personal.fragmentviewmodellivedatatest.model.PlayerList;

public class PlayerViewModel extends ViewModel {

    private final MutableLiveData<String> selectedPlayer = new MutableLiveData<String>();

    private PlayerList repository = new PlayerList();

    public void selectPlayer(String playerName) {
        selectedPlayer.setValue(playerName);
    }

    public MutableLiveData<String> getSelectedPlayer() {
        return selectedPlayer;
    }

    public String[] getPlayerList(){
        return repository.getPlayers();
    }

    public Player getPlayerDetails(String name){
        return repository.getPlayerDetails(name);
    }
}
