package com.assignment.ifdemo;

import java.util.Scanner;

public class IfDemo5 {
    public static void main(String[] args) {
        /*
        需求:
        题目5（很难）
        2019年1月1日起，国家推出新的个人所得税政策，起征点上调值5000元。
        也就是说税前工资扣除三险一金（
        三险一金数额假设是税前工资的10%）后如果不足5000元
        则不交税。如果大于5000元，那么大于5000元的部分按梯度交税，
        具体梯度比例如下：
        ​	0 ~ 3000元的部分，交税3%
        ​	3000 ~ 12000元的部分，交税10%
        ​	12000 ~ 25000的部分 ， 交税20%
        ​	25000 ~ 35000的部分，交税25%
        ​	35000 ~ 55000的部分，交税30%
        ​	55000 ~ 80000的部分，交税35%
        ​	超过80000的部分，交税45%
        比如：黑马某学员入职一家企业后，税前工资是15000，
        则他每月该交个税的部分是15000-1500-5000=8500元，
        个税缴纳数额是3000×3%+5500×10%=640元。税后工资12860元。
        请完成一个个税计算程序，
        在用户输入税前工资后，
        计算出他对应的纳税数额，以及税后工资为多少？
         */
        // 1.输入工资
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入税前工资");
        double salary = sc.nextDouble();
        // 2.计算应纳税所得额
        double taxable = calculateTaxable(salary);
        // 3.计算纳税数额
        double taxTotal = calculateTaxTotal(taxable);
        // 4.计算税后工资
        double afterTaxSalary = salary - salary * 0.1 - taxTotal;
        System.out.println("纳税数额" + taxTotal);
        System.out.println("税后工资" + afterTaxSalary);

    }
    /**
     * 计算应纳税所得额
     * @param salary 税前工资
     * @return 应纳税所得额
     */
    public static double calculateTaxable(double salary){
        return salary - salary * 0.1 - 5000;
    }

    /**
     * 计算纳税总额
     * @param taxable 应纳税所得额
     * @return 纳税总额
     */
    public static double calculateTaxTotal(double taxable){
        if(taxable <= 0){
            return 0;
        }
        int [] rank = {3000,12000,25000,35000,55000,80000};
        double [] rate = {0.03,0.1,0.2,0.25,0.3,0.35,0.45};
        double tax = 0;
        double remaining = taxable;
        for (int i = 0; i < rank.length; i++) {
            if(remaining <=0){
                break;
            }
            int currentLevel = i == 0 ? rank[i] : rank[i] - rank[i-1];
            if(remaining > currentLevel){
                tax += currentLevel * rate[i];
                remaining = remaining - currentLevel;
            } else{
                tax += remaining * rate[i];
                remaining = 0;
            }
        }
        // 超过80000的部分
        if(remaining > 0){
            tax += remaining * rate[rate.length-1];
        }

        return tax;
    }
}
