package com.example.androidcrud_api;

//dùng để gửi sự kiện lại qua MainActivity
public interface ClickItemListener {
    void onItemCLick(Student student, int position);

}
