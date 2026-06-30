package icu.samnyan.aqua.api.model.resp.sega.chuni.v2;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;

public class ScoreResp_init_179766101070 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53535;
     Object term53537;
     Object term53539;
     Object term53541;
     Object term53543;
     Object term53545;
     Object term53547;
     Object term53549;
     Object term53551;
     Object term53553;
     Object term53555;
     Object term53557;
     Object term53559;
     Object term53561;
     Object term53563;

    public ScoreResp_init_179766101070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53535 = new Integer(0);
        term53537 = new Integer(0);
        term53539 = new Integer(0);
        term53541 = new Integer(0);
        term53543 = new Integer(0);
        term53545 = new Integer(0);
        term53547 = new Integer(0);
        term53549 = new Integer(0);
        term53551 = new Integer(0);
        term53553 = new Boolean(false);
        term53555 = new Boolean(false);
        term53557 = new Boolean(false);
        term53559 = new Integer(0);
        term53561 = new Integer(0);
        term53563 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[15];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = int.class;
        argTypes[9] = boolean.class;
        argTypes[10] = boolean.class;
        argTypes[11] = boolean.class;
        argTypes[12] = int.class;
        argTypes[13] = int.class;
        argTypes[14] = int.class;
        Object[] args = new Object[15];
        args[0] = term53535;
        args[1] = term53537;
        args[2] = term53539;
        args[3] = term53541;
        args[4] = term53543;
        args[5] = term53545;
        args[6] = term53547;
        args[7] = term53549;
        args[8] = term53551;
        args[9] = term53553;
        args[10] = term53555;
        args[11] = term53557;
        args[12] = term53559;
        args[13] = term53561;
        args[14] = term53563;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


