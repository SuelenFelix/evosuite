package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class UserActivity_init_206601833449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42106;
     Object term42108;
     Object term42110;
     Object term42112;
     Object term42114;
     Object term42116;
     Object term42118;
     Object term42120;

    public UserActivity_init_206601833449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42106 = new Long(0L);
        term42108 = new Integer(0);
        term42110 = new Integer(0);
        term42112 = new Integer(0);
        term42114 = new Integer(0);
        term42116 = new Integer(0);
        term42118 = new Integer(0);
        term42120 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = int.class;
        Object[] args = new Object[9];
        args[0] = term42106;
        args[1] = null;
        args[2] = term42108;
        args[3] = term42110;
        args[4] = term42112;
        args[5] = term42114;
        args[6] = term42116;
        args[7] = term42118;
        args[8] = term42120;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


