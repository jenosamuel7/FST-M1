����   4 \  examples/Activity1  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lexamples/Activity1; main ([Ljava/lang/String;)V
    )io/github/bonigarcia/wdm/WebDriverManager   firefoxdriver -()Lio/github/bonigarcia/wdm/WebDriverManager;
     setup  )org/openqa/selenium/firefox/FirefoxDriver
  	  https://v1.training-support.net  !   org/openqa/selenium/WebDriver " # get (Ljava/lang/String;)V	 % ' & java/lang/System ( ) out Ljava/io/PrintStream; + java/lang/StringBuilder - Home page title: 
 * /  #  1 2 3 getTitle ()Ljava/lang/String;
 * 5 6 7 append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 * 9 : 3 toString
 < > = java/io/PrintStream ? # println A 
about-link
 C E D org/openqa/selenium/By F G id ,(Ljava/lang/String;)Lorg/openqa/selenium/By;  I J K findElement :(Lorg/openqa/selenium/By;)Lorg/openqa/selenium/WebElement; M O N org/openqa/selenium/WebElement P  click R About page title:   T U  quit args [Ljava/lang/String; driver Lorg/openqa/selenium/WebDriver; 
SourceFile Activity1.java !               /     *� �    
       	             	       �     c� � � Y� L+�  � $� *Y,� .+� 0 � 4� 8� ;+@� B� H � L � $� *YQ� .+� 0 � 4� 8� ;+� S �    
   "           1  A  \  b         c V W    U X Y   Z    [