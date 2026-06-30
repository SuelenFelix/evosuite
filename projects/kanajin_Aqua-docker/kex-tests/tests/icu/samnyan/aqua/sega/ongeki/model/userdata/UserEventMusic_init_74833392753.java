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

public class UserEventMusic_init_74833392753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term381530;
     Object term381532;
     Object term381534;
     Object term381536;
     Object term381538;
     Object term381540;
     Object term381542;
     Object term381544;

    public UserEventMusic_init_74833392753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term381530 = new Long(0L);
        term381532 = new Integer(0);
        term381534 = new Integer(0);
        term381536 = new Integer(0);
        term381538 = new Integer(0);
        term381540 = new Integer(0);
        term381542 = new Integer(0);
        term381544 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic");
        Class<?>[] argTypes = new Class<?>[10];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = boolean.class;
        Object[] args = new Object[10];
        args[0] = term381530;
        args[1] = null;
        args[2] = term381532;
        args[3] = term381534;
        args[4] = term381536;
        args[5] = term381538;
        args[6] = term381540;
        args[7] = term381542;
        args[8] = null;
        args[9] = term381544;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


