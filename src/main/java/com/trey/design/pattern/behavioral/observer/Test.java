package com.trey.design.pattern.behavioral.observer;

public class Test {
    public static void main(String[] args) {
        Course course = new Course("JVM的组成结构");
        Teacher teacher = new Teacher("Alpha");

        course.addObserver(teacher);

        // 业务逻辑代码
        Question question = new Question();
        question.setUserName("Trey");
        question.setQuestionContent("GC有哪几种类型");

        course.produceQuestion(course, question);
    }
}