package icu.samnyan.aqua.sega.diva.model.gamedata;

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
import static icu.samnyan.aqua.sega.diva.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.LinkedHashMap;

public class Pv_init_176647731524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3894;
     Object term3896;
     Object term3970;
     Object term3972;

    public Pv_init_176647731524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3894 = new Integer(-941356098);
        term3896 = new Integer(-201517446);
        term3970 = new Integer(-97742366);
        term3972 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv");
        Class<?>[] argTypes = new Class<?>[10];
        argTypes[0] = Class.forName("java.lang.Integer");
        argTypes[1] = Class.forName("java.lang.Integer");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = Class.forName("java.lang.Integer");
        argTypes[9] = Class.forName("java.util.Map");
        Object[] args = new Object[10];
        args[0] = term3894;
        args[1] = term3896;
        args[2] = "bqIuFFFwnP";
        args[3] = "hDxvvVgGlk";
        args[4] = "XdjSvjaTqk";
        args[5] = "ukrlYVcvsg";
        args[6] = "cpjqTCNflQ";
        args[7] = "wiYGATEfmw";
        args[8] = term3970;
        args[9] = term3972;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


