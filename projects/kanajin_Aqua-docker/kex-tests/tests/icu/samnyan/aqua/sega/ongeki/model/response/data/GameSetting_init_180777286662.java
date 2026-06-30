package icu.samnyan.aqua.sega.ongeki.model.response.data;

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
import static icu.samnyan.aqua.sega.ongeki.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Integer;

public class GameSetting_init_180777286662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7394;
     Object term7396;
     Object term7398;
     Object term7400;
     Object term7402;
     Object term7404;
     Object term7406;
     Object term7408;
     Object term7410;

    public GameSetting_init_180777286662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7394 = new Boolean(false);
        term7396 = new Integer(0);
        term7398 = new Boolean(false);
        term7400 = new Integer(0);
        term7402 = new Integer(0);
        term7404 = new Integer(0);
        term7406 = new Integer(0);
        term7408 = new Integer(0);
        term7410 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[13];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = boolean.class;
        argTypes[7] = int.class;
        argTypes[8] = int.class;
        argTypes[9] = int.class;
        argTypes[10] = int.class;
        argTypes[11] = int.class;
        argTypes[12] = int.class;
        Object[] args = new Object[13];
        args[0] = null;
        args[1] = null;
        args[2] = term7394;
        args[3] = term7396;
        args[4] = null;
        args[5] = null;
        args[6] = term7398;
        args[7] = term7400;
        args[8] = term7402;
        args[9] = term7404;
        args[10] = term7406;
        args[11] = term7408;
        args[12] = term7410;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


