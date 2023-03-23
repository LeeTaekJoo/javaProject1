package com.shinhan.day05;

public class MemberService{
    String id;
    String pw;

    public boolean login(String id, String pw) {
        return this.id.equals(id) && this.pw.equals(pw);
    }
    
    public void logout(String id) {
        if(this.id.equals(id)) System.out.println("로그아웃 되었습니다.");
    }
}
