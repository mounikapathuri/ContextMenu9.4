package com.android.mounika.contextmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b=(Button) findViewById(R.id.button);
        registerForContextMenu(b);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("CONTEXTMENU");
        menu.add("Action1");
        menu.add("Action2");
        menu.add("Action3");

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
         super.onContextItemSelected(item);
        Toast.makeText(this, "Selected="+item.getTitle(), Toast.LENGTH_SHORT).show();
        return true;
    }
}
