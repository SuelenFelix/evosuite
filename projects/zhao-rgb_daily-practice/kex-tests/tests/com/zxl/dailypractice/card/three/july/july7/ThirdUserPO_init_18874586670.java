package com.zxl.dailypractice.card.three.july.july7;

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
import static com.zxl.dailypractice.card.three.july.july7.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ThirdUserPO_init_18874586670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97;
     Object term123;
     Object term125;
     Object term127;
     Object term129;
     Object term131;

    public ThirdUserPO_init_18874586670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97 = newInstance(Class.forName("java.util.Date"));
        setLongField(term97, term97.getClass(), "fastTime", 1345871412244L);
        setField(term97, term97.getClass(), "cdate", null);
        term123 = newInstance(Class.forName("java.util.Date"));
        setLongField(term123, term123.getClass(), "fastTime", 1480438351369L);
        setField(term123, term123.getClass(), "cdate", null);
        term125 = newInstance(Class.forName("java.util.Date"));
        setLongField(term125, term125.getClass(), "fastTime", 1610940182830L);
        setField(term125, term125.getClass(), "cdate", null);
        term127 = newInstance(Class.forName("java.util.Date"));
        setLongField(term127, term127.getClass(), "fastTime", 1606045635837L);
        setField(term127, term127.getClass(), "cdate", null);
        term129 = new Integer(568599855);
        term131 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[18];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = Class.forName("java.util.Date");
        argTypes[9] = Class.forName("java.lang.String");
        argTypes[10] = Class.forName("java.lang.String");
        argTypes[11] = Class.forName("java.util.Date");
        argTypes[12] = Class.forName("java.util.Date");
        argTypes[13] = Class.forName("java.util.Date");
        argTypes[14] = Class.forName("java.lang.Integer");
        argTypes[15] = Class.forName("java.lang.Integer");
        argTypes[16] = Class.forName("java.lang.String");
        argTypes[17] = Class.forName("java.lang.String");
        Object[] args = new Object[18];
        args[0] = "PAEBtnZtTD";
        args[1] = "sjlJAEtRrb";
        args[2] = "MuLcgQHgqz";
        args[3] = "xxtlPwDYFs";
        args[4] = "jJCZpVmanW";
        args[5] = "EGtDIRbSSb";
        args[6] = "SzjVpOQTyS";
        args[7] = "MjGYSRKTNF";
        args[8] = term97;
        args[9] = "hRNSzYYIrc";
        args[10] = "RMFIsYGgne";
        args[11] = term123;
        args[12] = term125;
        args[13] = term127;
        args[14] = term129;
        args[15] = term131;
        args[16] = "NRdvgJlhkX";
        args[17] = "uuaPigETmJ";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


