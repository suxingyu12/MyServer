package com.bdqn.entity;


import java.util.Date;

public class Result {

  private int id;
  private String studentNo;
  private int subjectId;
  private int studentResult;
  private Date examDate;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getStudentNo() {
    return studentNo;
  }

  public void setStudentNo(String studentNo) {
    this.studentNo = studentNo;
  }


  public int getSubjectId() {
    return subjectId;
  }

  public void setSubjectId(int subjectId) {
    this.subjectId = subjectId;
  }


  public int getStudentResult() {
    return studentResult;
  }

  public void setStudentResult(int studentResult) {
    this.studentResult = studentResult;
  }


  public Date getExamDate() {
    return examDate;
  }

  public void setExamDate(Date examDate) {
    this.examDate = examDate;
  }

}
