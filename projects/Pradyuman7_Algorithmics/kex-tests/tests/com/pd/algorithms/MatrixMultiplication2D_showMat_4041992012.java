package com.pd.algorithms;

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
import static com.pd.algorithms.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MatrixMultiplication2D_showMat_4041992012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term425;
     Object term426;

    public MatrixMultiplication2D_showMat_4041992012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term425 = newInstance(Class.forName("com.pd.algorithms.MatrixMultiplication2D"));
        term426 = (Object[]) newArray("[I", 9);
        int[] term427 = (int[]) newIntArray(4);
        int[] term432 = (int[]) newIntArray(8);
        int[] term441 = (int[]) newIntArray(6);
        int[] term448 = (int[]) newIntArray(2);
        int[] term451 = (int[]) newIntArray(8);
        int[] term460 = (int[]) newIntArray(3);
        int[] term464 = (int[]) newIntArray(6);
        int[] term471 = (int[]) newIntArray(8);
        int[] term480 = (int[]) newIntArray(9);
        setIntElement(term427, 0, 941650513);
        setIntElement(term427, 1, 444029505);
        setIntElement(term427, 2, -1034506028);
        setIntElement(term427, 3, -1263114719);
        setElement(term426, 0, term427);
        setIntElement(term432, 0, -894662986);
        setIntElement(term432, 1, 304775596);
        setIntElement(term432, 2, -1347665717);
        setIntElement(term432, 3, -1888585309);
        setIntElement(term432, 4, 683666002);
        setIntElement(term432, 5, 1596213415);
        setIntElement(term432, 6, -268815336);
        setIntElement(term432, 7, -1210583429);
        setElement(term426, 1, term432);
        setIntElement(term441, 0, -663691365);
        setIntElement(term441, 1, 339854490);
        setIntElement(term441, 2, -615654495);
        setIntElement(term441, 3, -1476117762);
        setIntElement(term441, 4, -341962980);
        setIntElement(term441, 5, 1532716628);
        setElement(term426, 2, term441);
        setIntElement(term448, 0, -1801760683);
        setIntElement(term448, 1, 1141317871);
        setElement(term426, 3, term448);
        setIntElement(term451, 0, 890669485);
        setIntElement(term451, 1, 691577392);
        setIntElement(term451, 2, -893623680);
        setIntElement(term451, 3, -1963434938);
        setIntElement(term451, 4, 906181092);
        setIntElement(term451, 5, 1045657203);
        setIntElement(term451, 6, 1386130016);
        setIntElement(term451, 7, 1072005683);
        setElement(term426, 4, term451);
        setIntElement(term460, 0, 1861318859);
        setIntElement(term460, 1, 1474524152);
        setIntElement(term460, 2, 568954359);
        setElement(term426, 5, term460);
        setIntElement(term464, 0, 53410913);
        setIntElement(term464, 1, -375014958);
        setIntElement(term464, 2, 1107176718);
        setIntElement(term464, 3, 480137250);
        setIntElement(term464, 4, -341152642);
        setIntElement(term464, 5, -2015854073);
        setElement(term426, 6, term464);
        setIntElement(term471, 0, 538259104);
        setIntElement(term471, 1, 96566506);
        setIntElement(term471, 2, -343325701);
        setIntElement(term471, 3, 107945604);
        setIntElement(term471, 4, -1963464809);
        setIntElement(term471, 5, 71190297);
        setIntElement(term471, 6, 1202361360);
        setIntElement(term471, 7, -2015048153);
        setElement(term426, 7, term471);
        setIntElement(term480, 0, -2063457669);
        setIntElement(term480, 1, -1222006000);
        setIntElement(term480, 2, 2095798786);
        setIntElement(term480, 3, -1565502840);
        setIntElement(term480, 4, 344323424);
        setIntElement(term480, 5, 9726679);
        setIntElement(term480, 6, -25637976);
        setIntElement(term480, 7, 1555897383);
        setIntElement(term480, 8, 202001407);
        setElement(term426, 8, term480);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pd.algorithms.MatrixMultiplication2D");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term426;
        callMethod(klass, "showMat", argTypes, term425, args);
    }

};


