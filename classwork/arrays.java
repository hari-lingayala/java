{\rtf1\ansi\ansicpg1252\cocoartf2870
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww29200\viewh17740\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.util.Arrays;\
\
public class Anagram \{\
    public static void main(String[] args) \{\
        String s1 = "eccto";\
        String s2 = "techo";\
\
        char[] a1 = s1.toCharArray();\
        char[] a2 = s2.toCharArray();\
\
        Arrays.sort(a1);\
        Arrays.sort(a2);\
\
        if (Arrays.equals(a1, a2)) \{\
            System.out.println("Anagrams");\
        \} else \{\
            System.out.println("Not Anagrams");\
        \}\
    \}\
\}}