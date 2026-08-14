package com.iwamih31;

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
import static com.iwamih31.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PlanWorkSheet_init_5063949741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44984;
     Object term44986;

    public PlanWorkSheet_init_5063949741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44984 = (int[]) newIntArray(1);
        setIntElement(term44984, 0, -430151637);
        term44986 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 6);
        Object[] term44987 = (Object[]) newArray("java.lang.String", 8);
        Object[] term45084 = (Object[]) newArray("java.lang.String", 6);
        Object[] term45157 = (Object[]) newArray("java.lang.String", 8);
        Object[] term45254 = (Object[]) newArray("java.lang.String", 6);
        Object[] term45327 = (Object[]) newArray("java.lang.String", 3);
        Object[] term45364 = (Object[]) newArray("java.lang.String", 9);
        setElement(term44987, 0, "HnLeZhnLzz");
        setElement(term44987, 1, "ziYEsRkZmD");
        setElement(term44987, 2, "RFbJNwiLtv");
        setElement(term44987, 3, "eCxWMOpomA");
        setElement(term44987, 4, "pkQawlBtEF");
        setElement(term44987, 5, "rdKTcvHHnV");
        setElement(term44987, 6, "ELfUfLbXZf");
        setElement(term44987, 7, "SAglaHkagn");
        setElement(term44986, 0, term44987);
        setElement(term45084, 0, "eZGxUfdoFn");
        setElement(term45084, 1, "yCWSlaOrSv");
        setElement(term45084, 2, "PFpWKxDIRz");
        setElement(term45084, 3, "qePuOCwoCf");
        setElement(term45084, 4, "vJPujDInGq");
        setElement(term45084, 5, "cHZGcMhatT");
        setElement(term44986, 1, term45084);
        setElement(term45157, 0, "OZGyrUPedG");
        setElement(term45157, 1, "GAxMzRqmXU");
        setElement(term45157, 2, "XMhUDGKSWO");
        setElement(term45157, 3, "jLgzxtuvVo");
        setElement(term45157, 4, "wmmxjOkPnH");
        setElement(term45157, 5, "jgRohUQWxJ");
        setElement(term45157, 6, "CJlAiZDIQO");
        setElement(term45157, 7, "osgWaTBVoE");
        setElement(term44986, 2, term45157);
        setElement(term45254, 0, "mvkMYcgAod");
        setElement(term45254, 1, "esbhDGQDgF");
        setElement(term45254, 2, "tKlyiBloWu");
        setElement(term45254, 3, "uIgRFcwqLd");
        setElement(term45254, 4, "AvdsiEyCve");
        setElement(term45254, 5, "XMArCaVAEc");
        setElement(term44986, 3, term45254);
        setElement(term45327, 0, "URWnZtbrQH");
        setElement(term45327, 1, "hpTAdtnQku");
        setElement(term45327, 2, "GdMAXFBAtl");
        setElement(term44986, 4, term45327);
        setElement(term45364, 0, "KWVRAlcIqd");
        setElement(term45364, 1, "GeVOqtDiGv");
        setElement(term45364, 2, "vbRAJCwftU");
        setElement(term45364, 3, "baJbjUImxp");
        setElement(term45364, 4, "lPERFqPpGz");
        setElement(term45364, 5, "jleFBTYSNb");
        setElement(term45364, 6, "WmSSWHEELj");
        setElement(term45364, 7, "ggFhMyQvdw");
        setElement(term45364, 8, "vZpMxQNHKu");
        setElement(term44986, 5, term45364);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.PlanWorkSheet");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        argTypes[2] = Array.newInstance(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 0).getClass();
        Object[] args = new Object[3];
        args[0] = "uqDEIRoVVf";
        args[1] = term44984;
        args[2] = term44986;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


