package org.com.infotech.annotation;

//A Java program to demonstrate user defined or custom annotation
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//user-defined or custom annotation
@Documented
@Retention(RetentionPolicy.RUNTIME)// will be retained at runtime
public @interface MyAnnotation
{
 public abstract String developerName() default "Joshua Bloch"; 
 public abstract String expirydate();
} 