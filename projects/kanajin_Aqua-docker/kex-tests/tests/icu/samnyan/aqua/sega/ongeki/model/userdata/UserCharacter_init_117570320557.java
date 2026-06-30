package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;

public class UserCharacter_init_117570320557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181200;
     Object term181202;
     Object term181204;
     Object term181206;
     Object term181208;
     Object term181210;
     Object term181212;
     Object term181214;
     Object term181216;

    public UserCharacter_init_117570320557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181200 = new Long(0L);
        term181202 = new Integer(0);
        term181204 = new Integer(0);
        term181206 = new Integer(0);
        term181208 = new Integer(0);
        term181210 = new Integer(0);
        term181212 = new Integer(0);
        term181214 = new Integer(0);
        term181216 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[11];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = int.class;
        argTypes[9] = Class.forName("java.lang.String");
        argTypes[10] = boolean.class;
        Object[] args = new Object[11];
        args[0] = term181200;
        args[1] = null;
        args[2] = term181202;
        args[3] = term181204;
        args[4] = term181206;
        args[5] = term181208;
        args[6] = term181210;
        args[7] = term181212;
        args[8] = term181214;
        args[9] = null;
        args[10] = term181216;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


