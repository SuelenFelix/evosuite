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

public class GameSetting_init_180777286630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6994;
     Object term6996;
     Object term7022;
     Object term7024;
     Object term7026;
     Object term7028;
     Object term7030;
     Object term7032;
     Object term7034;

    public GameSetting_init_180777286630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6994 = new Boolean(true);
        term6996 = new Integer(27780241);
        term7022 = new Boolean(false);
        term7024 = new Integer(-683868408);
        term7026 = new Integer(-381130069);
        term7028 = new Integer(885769749);
        term7030 = new Integer(-1021168716);
        term7032 = new Integer(-1238055654);
        term7034 = new Integer(1561513428);
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
        args[0] = "JKGueoHesL";
        args[1] = "CRAUqtVBkU";
        args[2] = term6994;
        args[3] = term6996;
        args[4] = "DddqUYfomL";
        args[5] = "YQwoogpPyi";
        args[6] = term7022;
        args[7] = term7024;
        args[8] = term7026;
        args[9] = term7028;
        args[10] = term7030;
        args[11] = term7032;
        args[12] = term7034;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


