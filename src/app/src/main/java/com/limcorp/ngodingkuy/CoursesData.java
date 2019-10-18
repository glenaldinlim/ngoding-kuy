package com.limcorp.ngodingkuy;

import java.util.ArrayList;

public class CoursesData {
    private static String[] courseName = {
            "Dicoding",
            "Codepolitan",
            "Petani Kode",
            "CodeSaya",
            "Sekolah Koding",
            "IDRails",
            "Kelas Terbuka",
            "IDStack",
            "Web Programming UNPAS",
            "Kawan Koding",
            "YukCoding"
    };

    private static String[] coursePlatformType = {
            "Website",
            "Website, Youtube",
            "Website, Youtube",
            "Website",
            "Website, Youtube",
            "Website, Youtube",
            "Youtube",
            "Youtube",
            "Youtube",
            "Website, Youtube",
            "Website, Youtube"
    };

    private static String[] courseAvailable = {
            "Java, Python, Kotlin, Website Fundamental, Game Dev, Azure Dev, GCP Dev",
            "Java, Website Fundamental, PHP, Python, C",
            "Java, C, PHP, Python, Git",
            "PHP, Git",
            "HTML Fundamental, CSS Fundamental, PHP Fundamental, Firebase, Ruby, Javascript Fundamental",
            "Ruby, Ruby on Rails, ReactJS",
            "Java, C++",
            "Laravel, CSS, Lumen, PHP",
            "HTML, CSS, Javascript",
            "HTML, Laravel",
            "PHP, CodeIgniter,"
    };

    private static String[] courseLearningMethod = {
            "Online Class",
            "Online Class, Video Tutorial",
            "Blog, Video Tutorial",
            "Online Class",
            "Video Tutorial",
            "Video Tutorial",
            "Video Tutorial",
            "Video Tutorial",
            "Video Tutorial",
            "Video Tutorial",
            "Video Tutorial"
    };

    private static String[] courseSiteUrl = {
            "www.dicoding.com",
            "www.codepolitan.com",
            "www.petanikode.com",
            "www.codesaya.com",
            "www.sekolahkoding.com",
            "www.idrails.com",
            "www.kelasterbuka.id",
            "www.idstack.net",
            "www.youtube.com/webprogrammingunpas",
            "www.kawankoding.com",
            "www.yukcoding.blogspot.com"
    };

    private static int[] courseLogoImage = {
            R.drawable.dicoding_logo,
            R.drawable.codepolitan_logo,
            R.drawable.petanikode_logo,
            R.drawable.ngodingkuy_thumb,
            R.drawable.sekolahkoding_logo,
            R.drawable.idrails_logo,
            R.drawable.kelasterbuka_logo,
            R.drawable.idstack_logo,
            R.drawable.ngodingkuy_thumb,
            R.drawable.kawankoding_logo,
            R.drawable.yukcoding_logo
    };

    static ArrayList<Course> getListData() {
        ArrayList<Course> list = new ArrayList<>();
        for (int position = 0; position < courseName.length; position++) {
            Course course = new Course();
            course.setName(courseName[position]);
            course.setPlatform(coursePlatformType[position]);
            course.setAvailable_course(courseAvailable[position]);
            course.setLearning_method(courseLearningMethod[position]);
            course.setSite_url(courseSiteUrl[position]);
            course.setPhoto(courseLogoImage[position]);
            list.add(course);
        }
        return list;
    }
}
