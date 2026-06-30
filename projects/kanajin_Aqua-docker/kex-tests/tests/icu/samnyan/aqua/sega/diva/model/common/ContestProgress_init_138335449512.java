package icu.samnyan.aqua.sega.diva.model.common;

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
import static icu.samnyan.aqua.sega.diva.model.common.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ContestProgress_init_138335449512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3133;
     Object term3135;
     Object term3137;
     Object term3139;
     Object term3141;
     Object term3143;

    public ContestProgress_init_138335449512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3133 = new Integer(-1347665717);
        term3135 = new Integer(-1888585309);
        term3137 = new Integer(683666002);
        term3139 = new Integer(1596213415);
        term3141 = new Integer(-268815336);
        term3143 = new Integer(-1210583429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.ContestProgress");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = term3133;
        args[1] = term3135;
        args[2] = term3137;
        args[3] = term3139;
        args[4] = term3141;
        args[5] = term3143;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


