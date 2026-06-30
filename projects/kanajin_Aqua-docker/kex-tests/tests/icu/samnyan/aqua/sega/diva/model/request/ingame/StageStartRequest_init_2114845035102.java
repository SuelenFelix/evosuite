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
import java.lang.Boolean;

public class StageStartRequest_init_2114845035102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246137;
     Object term246139;
     Object term246141;
     Object term246143;
     Object term246145;
     Object term246147;

    public StageStartRequest_init_2114845035102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term246137 = new Integer(0);
        term246139 = new Integer(0);
        term246141 = new Integer(0);
        term246143 = new Boolean(false);
        term246145 = new Integer(0);
        term246147 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.StageStartRequest");
        Class<?>[] argTypes = new Class<?>[25];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        argTypes[4] = int.class;
        argTypes[5] = Array.newInstance(int.class, 0).getClass();
        argTypes[6] = Array.newInstance(int.class, 0).getClass();
        argTypes[7] = Array.newInstance(int.class, 0).getClass();
        argTypes[8] = Array.newInstance(int.class, 0).getClass();
        argTypes[9] = Array.newInstance(int.class, 0).getClass();
        argTypes[10] = Array.newInstance(int.class, 0).getClass();
        argTypes[11] = Array.newInstance(int.class, 0).getClass();
        argTypes[12] = Array.newInstance(int.class, 0).getClass();
        argTypes[13] = Array.newInstance(int.class, 0).getClass();
        argTypes[14] = Array.newInstance(int.class, 0).getClass();
        argTypes[15] = Array.newInstance(int.class, 0).getClass();
        argTypes[16] = Array.newInstance(int.class, 0).getClass();
        argTypes[17] = Array.newInstance(int.class, 0).getClass();
        argTypes[18] = Array.newInstance(int.class, 0).getClass();
        argTypes[19] = Array.newInstance(int.class, 0).getClass();
        argTypes[20] = Array.newInstance(int.class, 0).getClass();
        argTypes[21] = Array.newInstance(int.class, 0).getClass();
        argTypes[22] = Array.newInstance(int.class, 0).getClass();
        argTypes[23] = Array.newInstance(int.class, 0).getClass();
        argTypes[24] = int.class;
        Object[] args = new Object[25];
        args[0] = term246137;
        args[1] = term246139;
        args[2] = term246141;
        args[3] = term246143;
        args[4] = term246145;
        args[5] = null;
        args[6] = null;
        args[7] = null;
        args[8] = null;
        args[9] = null;
        args[10] = null;
        args[11] = null;
        args[12] = null;
        args[13] = null;
        args[14] = null;
        args[15] = null;
        args[16] = null;
        args[17] = null;
        args[18] = null;
        args[19] = null;
        args[20] = null;
        args[21] = null;
        args[22] = null;
        args[23] = null;
        args[24] = term246147;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


