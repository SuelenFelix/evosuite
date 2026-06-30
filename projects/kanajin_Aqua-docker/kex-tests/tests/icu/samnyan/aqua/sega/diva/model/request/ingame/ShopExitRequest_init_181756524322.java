package icu.samnyan.aqua.sega.diva.model.request.ingame;

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
import static icu.samnyan.aqua.sega.diva.model.request.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ShopExitRequest_init_181756524322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270145;
     Object term270147;
     Object term270149;
     Object term270151;
     Object term270153;
     Object term270155;
     Object term270161;
     Object term270164;
     Object term270171;
     Object term270177;
     Object term270186;

    public ShopExitRequest_init_181756524322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270145 = new Integer(-1724386751);
        term270147 = new Integer(-1109550950);
        term270149 = new Integer(1250264075);
        term270151 = new Integer(1579020518);
        term270153 = new Integer(-1659699093);
        term270155 = (int[]) newIntArray(5);
        setIntElement(term270155, 0, -1081947589);
        setIntElement(term270155, 1, 442775959);
        setIntElement(term270155, 2, -398261129);
        setIntElement(term270155, 3, -761053869);
        setIntElement(term270155, 4, 776211073);
        term270161 = (int[]) newIntArray(2);
        setIntElement(term270161, 0, -1787590390);
        setIntElement(term270161, 1, -1143853743);
        term270164 = (int[]) newIntArray(6);
        setIntElement(term270164, 0, 2578669);
        setIntElement(term270164, 1, 1231565176);
        setIntElement(term270164, 2, 790663541);
        setIntElement(term270164, 3, 2047602923);
        setIntElement(term270164, 4, -1275377737);
        setIntElement(term270164, 5, -1074123057);
        term270171 = (int[]) newIntArray(5);
        setIntElement(term270171, 0, -1719724964);
        setIntElement(term270171, 1, -1625099876);
        setIntElement(term270171, 2, -740034990);
        setIntElement(term270171, 3, -1681164325);
        setIntElement(term270171, 4, -405150366);
        term270177 = (int[]) newIntArray(8);
        setIntElement(term270177, 0, 268908092);
        setIntElement(term270177, 1, -500555181);
        setIntElement(term270177, 2, -2011115039);
        setIntElement(term270177, 3, 1387143492);
        setIntElement(term270177, 4, -2136225780);
        setIntElement(term270177, 5, 1531538523);
        setIntElement(term270177, 6, 32177300);
        setIntElement(term270177, 7, 1387159560);
        term270186 = (int[]) newIntArray(1);
        setIntElement(term270186, 0, 862833362);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.ShopExitRequest");
        Class<?>[] argTypes = new Class<?>[11];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = Array.newInstance(int.class, 0).getClass();
        argTypes[6] = Array.newInstance(int.class, 0).getClass();
        argTypes[7] = Array.newInstance(int.class, 0).getClass();
        argTypes[8] = Array.newInstance(int.class, 0).getClass();
        argTypes[9] = Array.newInstance(int.class, 0).getClass();
        argTypes[10] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[11];
        args[0] = term270145;
        args[1] = term270147;
        args[2] = term270149;
        args[3] = term270151;
        args[4] = term270153;
        args[5] = term270155;
        args[6] = term270161;
        args[7] = term270164;
        args[8] = term270171;
        args[9] = term270177;
        args[10] = term270186;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


