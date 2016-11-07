package com.selimssevgi;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {

  public static void main(String[] args) {
    SparkConf conf = new SparkConf().setAppName("My application").setMaster("local[2]");
    JavaSparkContext sc = new JavaSparkContext(conf);

    JavaRDD<Integer> numbers = sc.parallelize(IntStream.range(0, 5).boxed().collect(Collectors.toList()));
    Integer total = numbers.reduce((v1, v2) -> (v1 + v2));
    System.out.println("Total: " + total);
  }
}
