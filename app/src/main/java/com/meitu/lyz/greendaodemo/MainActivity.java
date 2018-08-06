package com.meitu.lyz.greendaodemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.meitu.lyz.greendaodemo.db.UserDaoHelper;
import com.meitu.lyz.greendaodemo.entity.User;

public class MainActivity extends AppCompatActivity {

    private Button mRefreshBtn;
    private Button mAddBtn;
    private Button mDeleteBtn;
    private RecyclerView mDataRv;

    private UserAdapter mUserAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mRefreshBtn = findViewById(R.id.refresh_btn);
        mAddBtn = findViewById(R.id.add_btn);
        mDeleteBtn = findViewById(R.id.delete_btn);
        mDataRv = findViewById(R.id.data_rv);

        mUserAdapter = new UserAdapter();

        mDataRv.setAdapter(mUserAdapter);


        mRefreshBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mUserAdapter.setData(UserDaoHelper.queryAll());
            }
        });

        mAddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User user = new User();
                user.setName(System.currentTimeMillis() + "");
                user.setSex(System.currentTimeMillis() % 2 == 0);
                UserDaoHelper.insert(user);
            }
        });
    }
}
