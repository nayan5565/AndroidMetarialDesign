package android.support.design.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnAppBarCollapsePin, btnBottomSheetBehaviorWithInsets
            , btnSnacTrans, btnFabFollowsWidget, btnBottomSheetBehaviour,btnFabAndSnackbar,btnCustomBehavior,btnCollapsingToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBottomSheetBehaviour = (Button) findViewById(R.id.btnBottomSheetBehaviour);
        btnAppBarCollapsePin = (Button) findViewById(R.id.btnAppBarCollapsePin);
        btnBottomSheetBehaviorWithInsets = (Button) findViewById(R.id.btnBottomSheetBehaviorWithInsets);
        btnSnacTrans = (Button) findViewById(R.id.btnSnacTrans);
        btnCustomBehavior = (Button) findViewById(R.id.btnCustomBehavior);
        btnFabAndSnackbar = (Button) findViewById(R.id.btnFabAndSnackbar);
        btnFabFollowsWidget = (Button) findViewById(R.id.btnFabFollowsWidget);
        btnCollapsingToolbar = (Button) findViewById(R.id.btnCollapsingToolbar);
        btnBottomSheetBehaviour.setOnClickListener(this);
        btnCustomBehavior.setOnClickListener(this);
        btnCollapsingToolbar.setOnClickListener(this);
        btnFabFollowsWidget.setOnClickListener(this);
        btnAppBarCollapsePin.setOnClickListener(this);
        btnBottomSheetBehaviorWithInsets.setOnClickListener(this);
        btnSnacTrans.setOnClickListener(this);
        btnFabAndSnackbar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnBottomSheetBehaviour) {
            startActivity(new Intent(this, BottomSheetBehaviorActivity.class));
        } else if (view.getId() == R.id.btnAppBarCollapsePin) {
            startActivity(new Intent(this, AppBarLayoutCollapsePinActivity.class));
        } else if (view.getId() == R.id.btnBottomSheetBehaviorWithInsets) {
            startActivity(new Intent(this, BottomSheetBehaviorWithInsetsActivity.class));
        } else if (view.getId() == R.id.btnSnacTrans) {
            startActivity(new Intent(this, TextInputLayoutActivity.class));
        }else if (view.getId() == R.id.btnFabAndSnackbar) {
            startActivity(new Intent(this, FabAndSnackbarActivity.class));
        }else if (view.getId() == R.id.btnFabFollowsWidget) {
            startActivity(new Intent(this, FabFollowsWidgetActivity.class));
        }else if (view.getId() == R.id.btnCollapsingToolbar) {
            startActivity(new Intent(this, CollapsingToolbarActivity.class));
        }else if (view.getId() == R.id.btnCustomBehavior) {
            startActivity(new Intent(this, CustomBehaviorActivity.class));
        }
    }
}
