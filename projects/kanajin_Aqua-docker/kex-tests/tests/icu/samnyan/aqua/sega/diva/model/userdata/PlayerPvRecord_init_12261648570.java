package icu.samnyan.aqua.sega.diva.model.userdata;

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
import static icu.samnyan.aqua.sega.diva.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;

public class PlayerPvRecord_init_12261648570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term564105;
     Object enum1232;

    public PlayerPvRecord_init_12261648570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term564105 = new Integer(-1384058110);
        Class<? extends Object> term564121 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term564120 = ((Class) term564121).getDeclaredField((String) "ORIGINAL");
        ((Field) term564120).setAccessible(true);
        enum1232 = ((Field) term564120).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Edition");
        Object[] args = new Object[2];
        args[0] = term564105;
        args[1] = enum1232;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


