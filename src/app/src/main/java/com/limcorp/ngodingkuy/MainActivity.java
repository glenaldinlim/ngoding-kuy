package com.limcorp.ngodingkuy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCourse;
    private ArrayList<Course> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCourse = findViewById(R.id.rv_course);
        rvCourse.setHasFixedSize(true);

        list.addAll(CoursesData.getListData());
        showRecycleList();
    }

    private void showRecycleList() {
        rvCourse.setLayoutManager(new LinearLayoutManager(this));
        ListCourseAdapter listCourseAdapter = new ListCourseAdapter(list);
        rvCourse.setAdapter(listCourseAdapter);

        listCourseAdapter.setOnItemClickCallback(new ListCourseAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Course data) {
                showSelectedCourse(data);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void showSelectedCourse(Course course) {
        Intent moveIntent = new Intent(MainActivity.this, DetailActivity.class);
        moveIntent.putExtra(DetailActivity.EXTRA_NAME, course.getName());
        moveIntent.putExtra(DetailActivity.EXTRA_PLATFORM, course.getPlatform());
        moveIntent.putExtra(DetailActivity.EXTRA_AVAILABLE, course.getAvailable_course());
        moveIntent.putExtra(DetailActivity.EXTRA_LEARNING, course.getLearning_method());
        moveIntent.putExtra(DetailActivity.EXTRA_SITE, course.getSite_url());
        startActivity(moveIntent);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_about:
                Intent moveIntent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(moveIntent);
                break;
        }
    }
}
