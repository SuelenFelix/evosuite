package org.graph4j.shortestpath;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.graph4j.shortestpath.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JohnsonShortestPath_computeAll_19984983216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71112;

    public JohnsonShortestPath_computeAll_19984983216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71112 = newInstance(Class.forName("org.graph4j.shortestpath.JohnsonShortestPath"));
        double[] term71113 = (double[]) newDoubleArray(9);
        Object[] term71123 = (Object[]) newArray("org.graph4j.shortestpath.SingleSourceShortestPath", 8);
        Object[] term71124 = (Object[]) newArray("[D", 8);
        double[] term71125 = (double[]) newDoubleArray(3);
        double[] term71129 = (double[]) newDoubleArray(8);
        double[] term71138 = (double[]) newDoubleArray(4);
        double[] term71143 = (double[]) newDoubleArray(7);
        double[] term71151 = (double[]) newDoubleArray(4);
        double[] term71156 = (double[]) newDoubleArray(3);
        double[] term71160 = (double[]) newDoubleArray(9);
        double[] term71170 = (double[]) newDoubleArray(9);
        setField(term71112, term71112.getClass(), "auxGraph", null);
        setDoubleElement(term71113, 0, 0.19182769076820738);
        setDoubleElement(term71113, 1, 0.14967740144007602);
        setDoubleElement(term71113, 2, 0.6188522219151431);
        setDoubleElement(term71113, 3, 0.9364040668251995);
        setDoubleElement(term71113, 4, 0.4397449044980519);
        setDoubleElement(term71113, 5, 0.8540320027373548);
        setDoubleElement(term71113, 6, 0.7642290118995686);
        setDoubleElement(term71113, 7, 0.5789206136911016);
        setDoubleElement(term71113, 8, 0.08060977757620846);
        setField(term71112, term71112.getClass(), "h", term71113);
        setField(term71112, term71112.getClass(), "algs", term71123);
        setDoubleElement(term71125, 0, 0.21206003767905468);
        setDoubleElement(term71125, 1, 0.10300432900589962);
        setDoubleElement(term71125, 2, 0.23871743601051365);
        setElement(term71124, 0, term71125);
        setDoubleElement(term71129, 0, 0.8672353546426242);
        setDoubleElement(term71129, 1, 0.14569589714771802);
        setDoubleElement(term71129, 2, 0.08346936054630405);
        setDoubleElement(term71129, 3, 0.7313275549010834);
        setDoubleElement(term71129, 4, 0.8436037181842124);
        setDoubleElement(term71129, 5, 0.790404802394107);
        setDoubleElement(term71129, 6, 0.25835542322234795);
        setDoubleElement(term71129, 7, 0.9221001671814134);
        setElement(term71124, 1, term71129);
        setDoubleElement(term71138, 0, 0.07723289443510573);
        setDoubleElement(term71138, 1, 0.6906025979631155);
        setDoubleElement(term71138, 2, 0.01646709987340733);
        setDoubleElement(term71138, 3, 0.9659038001475833);
        setElement(term71124, 2, term71138);
        setDoubleElement(term71143, 0, 0.4060444536554363);
        setDoubleElement(term71143, 1, 0.639222781750972);
        setDoubleElement(term71143, 2, 0.965855140501414);
        setDoubleElement(term71143, 3, 0.9004035443557745);
        setDoubleElement(term71143, 4, 0.4594058608693542);
        setDoubleElement(term71143, 5, 0.19283271050187334);
        setDoubleElement(term71143, 6, 0.6564258611557235);
        setElement(term71124, 3, term71143);
        setDoubleElement(term71151, 0, 0.8376934773137313);
        setDoubleElement(term71151, 1, 0.296029140882235);
        setDoubleElement(term71151, 2, 0.10952254321816357);
        setDoubleElement(term71151, 3, 0.49101663241124494);
        setElement(term71124, 4, term71151);
        setDoubleElement(term71156, 0, 0.41801109337324593);
        setDoubleElement(term71156, 1, 0.4906660956177926);
        setDoubleElement(term71156, 2, 0.8288594497325514);
        setElement(term71124, 5, term71156);
        setDoubleElement(term71160, 0, 0.7413499189638652);
        setDoubleElement(term71160, 1, 0.7644561536628628);
        setDoubleElement(term71160, 2, 0.3970471722858633);
        setDoubleElement(term71160, 3, 0.6415212665904825);
        setDoubleElement(term71160, 4, 0.5589106470554994);
        setDoubleElement(term71160, 5, 0.909081015238334);
        setDoubleElement(term71160, 6, 0.6162694207675845);
        setDoubleElement(term71160, 7, 0.38079300141621786);
        setDoubleElement(term71160, 8, 0.7506754039800764);
        setElement(term71124, 6, term71160);
        setDoubleElement(term71170, 0, 0.5484154259322254);
        setDoubleElement(term71170, 1, 0.40784677132864333);
        setDoubleElement(term71170, 2, 0.30893042320325725);
        setDoubleElement(term71170, 3, 0.8757538504571355);
        setDoubleElement(term71170, 4, 0.0304337454792859);
        setDoubleElement(term71170, 5, 0.8948934371687458);
        setDoubleElement(term71170, 6, 0.3684654029205544);
        setDoubleElement(term71170, 7, 0.9113861347550493);
        setDoubleElement(term71170, 8, 0.6751680197933825);
        setElement(term71124, 7, term71170);
        setField(term71112, term71112.getClass(), "weights", term71124);
        setField(term71112, term71112.getClass(), "graph", null);
        setBooleanField(term71112, term71112.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.JohnsonShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "computeAll", argTypes, term71112, args);
    }

};


