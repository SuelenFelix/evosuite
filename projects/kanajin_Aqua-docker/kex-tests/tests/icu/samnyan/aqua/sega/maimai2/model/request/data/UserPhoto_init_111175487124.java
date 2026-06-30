package icu.samnyan.aqua.sega.maimai2.model.request.data;

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
import static icu.samnyan.aqua.sega.maimai2.model.request.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Long;

public class UserPhoto_init_111175487124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1859;
     Object term1861;
     Object term1863;
     Object term1865;
     Object term1879;
     Object term1905;
     Object term1907;

    public UserPhoto_init_111175487124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1859 = new Integer(53410913);
        term1861 = new Long(-5788180182343976541L);
        term1863 = new Integer(-375014958);
        term1865 = new Integer(1107176718);
        term1879 = new Integer(480137250);
        term1905 = new Long(2936323121573284007L);
        term1907 = new Integer(-341152642);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto");
        Class<?>[] argTypes = new Class<?>[10];
        argTypes[0] = int.class;
        argTypes[1] = long.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = int.class;
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = long.class;
        argTypes[9] = int.class;
        Object[] args = new Object[10];
        args[0] = term1859;
        args[1] = term1861;
        args[2] = term1863;
        args[3] = term1865;
        args[4] = "MAcUBcBckh";
        args[5] = term1879;
        args[6] = "oVgzLbrsFr";
        args[7] = "vQVyKLdtaz";
        args[8] = term1905;
        args[9] = term1907;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


