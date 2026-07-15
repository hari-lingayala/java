{\rtf1\ansi\ansicpg1252\cocoartf2870
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww29200\viewh17740\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 \
class Printer \{\
    void print() \{\
        System.out.println("Printing document...");\
    \}\
\}\
\
\
class InkjetPrinter extends Printer \{\
    @Override\
    void print() \{\
        System.out.println("Printing using Inkjet Printer");\
    \}\
\}\
\
\
class LaserPrinter extends Printer \{\
    @Override\
    void print() \{\
        System.out.println("Printing using Laser Printer");\
    \}\
\}\
\
\
class ColorPrinter extends Printer \{\
    @Override\
    void print() \{\
        System.out.println("Printing using Color Printer");\
    \}\
\}\
\
\
public class Main \{\
    public static void main(String[] args) \{\
\
        Printer p;\
\
        p = new InkjetPrinter();\
        p.print();\
\
        p = new LaserPrinter();\
        p.print();\
\
        p = new ColorPrinter();\
        p.print();\
    \}\
\}}