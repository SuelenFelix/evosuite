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

public class StoreSsRequest_init_68342992316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254235;
     Object term254249;
     Object term254251;
     Object term254253;
     Object term254262;
     Object term254265;
     Object term254274;

    public StoreSsRequest_init_68342992316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term254235 = new Integer(915907266);
        term254249 = new Integer(1366775094);
        term254251 = new Integer(-1892255146);
        term254253 = (int[]) newIntArray(8);
        setIntElement(term254253, 0, 1897105801);
        setIntElement(term254253, 1, 1229352725);
        setIntElement(term254253, 2, -1932641325);
        setIntElement(term254253, 3, 176635371);
        setIntElement(term254253, 4, 1176058064);
        setIntElement(term254253, 5, 40930655);
        setIntElement(term254253, 6, -1832645371);
        setIntElement(term254253, 7, -1649255708);
        term254262 = (int[]) newIntArray(2);
        setIntElement(term254262, 0, -88394984);
        setIntElement(term254262, 1, -167569814);
        term254265 = (int[]) newIntArray(8);
        setIntElement(term254265, 0, -672291214);
        setIntElement(term254265, 1, -268931768);
        setIntElement(term254265, 2, 364660777);
        setIntElement(term254265, 3, 511430131);
        setIntElement(term254265, 4, -1559787641);
        setIntElement(term254265, 5, 1739952168);
        setIntElement(term254265, 6, 1907004582);
        setIntElement(term254265, 7, -999425687);
        term254274 = (int[]) newIntArray(7);
        setIntElement(term254274, 0, -299279628);
        setIntElement(term254274, 1, -1446962173);
        setIntElement(term254274, 2, -1176409434);
        setIntElement(term254274, 3, 800546549);
        setIntElement(term254274, 4, 119808859);
        setIntElement(term254274, 5, -878680212);
        setIntElement(term254274, 6, 845721474);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.StoreSsRequest");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Array.newInstance(int.class, 0).getClass();
        argTypes[5] = Array.newInstance(int.class, 0).getClass();
        argTypes[6] = Array.newInstance(int.class, 0).getClass();
        argTypes[7] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[8];
        args[0] = term254235;
        args[1] = "ePtDnXODVc";
        args[2] = term254249;
        args[3] = term254251;
        args[4] = term254253;
        args[5] = term254262;
        args[6] = term254265;
        args[7] = term254274;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


