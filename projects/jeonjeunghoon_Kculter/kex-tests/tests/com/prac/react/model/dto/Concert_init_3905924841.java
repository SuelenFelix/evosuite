package com.prac.react.model.dto;

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
import static com.prac.react.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Double;

public class Concert_init_3905924841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17819;
     Object term17857;
     Object term17859;
     Object term17861;
     Object term17863;
     Object term17865;
     Object term17891;

    public Concert_init_3905924841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17819 = new Integer(354196060);
        term17857 = newInstance(Class.forName("java.util.Date"));
        setLongField(term17857, term17857.getClass(), "fastTime", 1345871412244L);
        setField(term17857, term17857.getClass(), "cdate", null);
        term17859 = newInstance(Class.forName("java.util.Date"));
        setLongField(term17859, term17859.getClass(), "fastTime", 1480438351369L);
        setField(term17859, term17859.getClass(), "cdate", null);
        term17861 = new Double(0.6420798930164424);
        term17863 = new Double(0.0011409626665044303);
        term17865 = new Integer(-1840305774);
        term17891 = new Integer(1365087144);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[15];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.util.Date");
        argTypes[5] = Class.forName("java.util.Date");
        argTypes[6] = double.class;
        argTypes[7] = double.class;
        argTypes[8] = int.class;
        argTypes[9] = Class.forName("java.lang.String");
        argTypes[10] = Class.forName("java.lang.String");
        argTypes[11] = int.class;
        argTypes[12] = Class.forName("java.lang.String");
        argTypes[13] = Class.forName("java.lang.String");
        argTypes[14] = Class.forName("java.lang.String");
        Object[] args = new Object[15];
        args[0] = term17819;
        args[1] = "gHRMJRsBGm";
        args[2] = "rZyrfnMvHa";
        args[3] = "GMyMhTZeDC";
        args[4] = term17857;
        args[5] = term17859;
        args[6] = term17861;
        args[7] = term17863;
        args[8] = term17865;
        args[9] = "KqQOTshBOL";
        args[10] = "cuWgFcYkPC";
        args[11] = term17891;
        args[12] = "HfbcOKkXBm";
        args[13] = "pLbTzSMbsN";
        args[14] = "lFSbxerCPP";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


