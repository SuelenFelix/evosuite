package icu.samnyan.aqua.sega.maimai.model.response.data;

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
import static icu.samnyan.aqua.sega.maimai.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Integer;

public class GameSetting_init_52289250324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5995;
     Object term5997;
     Object term6023;
     Object term6025;

    public GameSetting_init_52289250324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5995 = new Boolean(false);
        term5997 = new Integer(1780958641);
        term6023 = new Integer(1890582085);
        term6025 = new Integer(2146568808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[10];
        argTypes[0] = boolean.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = Class.forName("java.lang.String");
        Object[] args = new Object[10];
        args[0] = term5995;
        args[1] = term5997;
        args[2] = "fKhrQsJToZ";
        args[3] = "wsysQLGFnl";
        args[4] = term6023;
        args[5] = term6025;
        args[6] = "ckQLZGFjMX";
        args[7] = "qphdrqUtNx";
        args[8] = "bwlLFAfNWx";
        args[9] = "JWodNQzjjV";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


