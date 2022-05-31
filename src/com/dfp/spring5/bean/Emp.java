package com.dfp.spring5.bean;

public class Emp
{
    private String ename;
    private String gender;
    //员工属于某一个部门，使用对象形式表示
    private Dep dep;

    //生成dept的get方法
    public Dep getDep() {
        return dep;
    }

    public void setDep(Dep dep) {
        this.dep = dep;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void add() {
        System.out.println(ename+"::"+gender+"::"+dep);
    }

}
