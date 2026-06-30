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

public class UserPhoto_init_111175487150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2145;
     Object term2147;
     Object term2149;
     Object term2151;
     Object term2153;
     Object term2155;
     Object term2157;

    public UserPhoto_init_111175487150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2145 = new Integer(0);
        term2147 = new Long(0L);
        term2149 = new Integer(0);
        term2151 = new Integer(0);
        term2153 = new Integer(0);
        term2155 = new Long(0L);
        term2157 = new Integer(0);
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
        args[0] = term2145;
        args[1] = term2147;
        args[2] = term2149;
        args[3] = term2151;
        args[4] = null;
        args[5] = term2153;
        args[6] = null;
        args[7] = null;
        args[8] = term2155;
        args[9] = term2157;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


