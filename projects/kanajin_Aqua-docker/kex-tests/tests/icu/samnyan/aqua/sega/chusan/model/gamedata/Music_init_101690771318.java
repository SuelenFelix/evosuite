package icu.samnyan.aqua.sega.chusan.model.gamedata;

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
import static icu.samnyan.aqua.sega.chusan.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;
import java.util.LinkedHashMap;

public class Music_init_101690771318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12938;
     Object enum19;
     Object term13022;

    public Music_init_101690771318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12938 = new Integer(520504102);
        Class<? extends Object> term13113 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term13112 = ((Class) term13113).getDeclaredField((String) "KOTONOHA");
        ((Field) term13112).setAccessible(true);
        enum19 = ((Field) term13112).get((Object) null);
        term13022 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.util.Map");
        Object[] args = new Object[7];
        args[0] = term12938;
        args[1] = "ndAITnOsny";
        args[2] = "CVZnTiJucs";
        args[3] = "ecHEQufXoq";
        args[4] = enum19;
        args[5] = "btBLMvHzJg";
        args[6] = term13022;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


