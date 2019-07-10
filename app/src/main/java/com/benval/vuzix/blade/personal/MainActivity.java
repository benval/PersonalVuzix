package com.benval.vuzix.blade.personal;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.vuzix.hud.actionmenu.ActionMenuActivity;

public class MainActivity extends ActionMenuActivity {

    private MenuItem emotionItem;
    private MenuItem weatherItem;
    private MenuItem calendarItem;
    private MenuItem transportationItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // sett inn en velkommen tekst, som forklarer appen?
        // motivasjon, tilsvarende det som er i Magic Mirror Modules

        // legg til innlogging mot dine egne kontoer som google, etc?
        // koble opp mot treningsapplikasjoner?
        // voice commands?
        // nyheter fra din leverandør?
        // speech to text støtte, for personer med hørselvansker?
    }

    @Override
    protected boolean onCreateActionMenu(Menu menu) {
        super.onCreateActionMenu(menu);
        emotionItem = menu.findItem(R.id.emotionMenuItem);
        weatherItem = menu.findItem(R.id.weatherMenuItem);
        calendarItem = menu.findItem(R.id.calendarMenuItem);
        transportationItem = menu.findItem(R.id.calendarMenuItem);
        return true;
    }
}
