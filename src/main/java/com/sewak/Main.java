package com.sewak;

public class Main {
    public static void main(String args[]) {
        //Question 1
        Hello hello = new Hello();
        hello.helloProgram();
        //Question 2
        Sum sum = new Sum();
        sum.sumOfTwoNumbers();
        //Question 3
        Division division = new Division();
        division.divideTwoNumbers();
        //Question 4
        Question4 question4 = new Question4();
        question4.questionFour();
        //Question 5
        Product product = new Product();
        product.productOfTwoNumbers();
        //Qustion 6
        BasicOperations basicOperations = new BasicOperations();
        basicOperations.basicOperationsOfTwoNumbers();
        //Question 7
        Table table = new Table();
        table.multiplicationTable();
        //Question 8
        JavaPattern javaPattern = new JavaPattern();
        javaPattern.javaPattern();
        //Question 9
        QuestionNine questionNine = new QuestionNine();
        questionNine.questionNineMethod();
        //Question 11
        CIrcle circle = new CIrcle();
        circle.circleAreaPerimeter();
        //Question 12
        Average average = new Average();
        average.average();
        //Question 13
        Rectangle rectangle = new Rectangle();
        rectangle.rectangleAreaPerimeter();
        //Question 14
        AmericaFlag americaFlag = new AmericaFlag();
        americaFlag.USA();
        //Question 15
        Swap swap = new Swap();
        swap.swapTwoNumbers();
        //Question 16
        Face face = new Face();
        face.face();
        //Question 17
        AddBinaryNumbers addBinaryNumbers = new AddBinaryNumbers();
        addBinaryNumbers.sumOfBinaryNumbers();
        // Question 18,19,20
        Conversions conversions = new Conversions();
        conversions.coversionsOfDecimalNumbers();
        //Lambda Demo
        LambdaDemo lambdaDemo = new LambdaDemo();
        lambdaDemo.array();
    }
}

