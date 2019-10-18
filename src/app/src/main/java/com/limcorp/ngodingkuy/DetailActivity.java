package com.limcorp.ngodingkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_PLATFORM = "extra_platform";
    public static final String EXTRA_AVAILABLE = "extra_available";
    public static final String EXTRA_LEARNING = "extra_learning";
    public static final String EXTRA_SITE = "extra_site";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tvCourseName = findViewById(R.id.tv_course_name);
        TextView tvCoursePlatform = findViewById(R.id.tv_course_platform);
        TextView tvCourseAvailable = findViewById(R.id.tv_course_available);
        TextView tvCourseLearning = findViewById(R.id.tv_course_learning);
        TextView tvCourseSite = findViewById(R.id.tv_course_site);

        String courseName = getIntent().getStringExtra(EXTRA_NAME);
        String coursePlatform = getIntent().getStringExtra(EXTRA_PLATFORM);
        String courseAvailable = getIntent().getStringExtra(EXTRA_AVAILABLE);
        String courseLearning = getIntent().getStringExtra(EXTRA_LEARNING);
        String courseSite = getIntent().getStringExtra(EXTRA_SITE);

        tvCourseName.setText(courseName);
        tvCoursePlatform.setText(coursePlatform);
        tvCourseAvailable.setText(courseAvailable);
        tvCourseLearning.setText(courseLearning);
        tvCourseSite.setText(courseSite);

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle(courseName);
        }
    }
}
