package icu.samnyan.aqua.sega.chunithm.model.gamedata;

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
import static icu.samnyan.aqua.sega.chunithm.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;
import java.util.LinkedHashMap;

public class Music_init_210666113020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27608;
     Object enum51;
     Object term27700;

    public Music_init_210666113020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27608 = new Integer(-499699841);
        Class<? extends Object> term27860 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term27859 = ((Class) term27860).getDeclaredField((String) "TOUHOU");
        ((Field) term27859).setAccessible(true);
        enum51 = ((Field) term27859).get((Object) null);
        term27700 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.util.Map");
        Object[] args = new Object[8];
        args[0] = term27608;
        args[1] = "dVHfxjbMRK";
        args[2] = "LzwyLxKJpw";
        args[3] = "ZhWJlplAVK";
        args[4] = "pnmjTuTojv";
        args[5] = enum51;
        args[6] = "eMtshhmGEm";
        args[7] = term27700;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


