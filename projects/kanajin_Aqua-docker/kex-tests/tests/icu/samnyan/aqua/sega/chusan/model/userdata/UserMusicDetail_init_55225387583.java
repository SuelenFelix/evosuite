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
import java.lang.Boolean;

public class UserMusicDetail_init_55225387583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112990;
     Object term112992;
     Object term112994;
     Object term112996;
     Object term112998;
     Object term113000;
     Object term113002;
     Object term113004;
     Object term113006;
     Object term113008;
     Object term113010;
     Object term113012;
     Object term113014;
     Object term113016;
     Object term113018;
     Object term113020;

    public UserMusicDetail_init_55225387583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112990 = new Long(0L);
        term112992 = new Integer(0);
        term112994 = new Integer(0);
        term112996 = new Integer(0);
        term112998 = new Integer(0);
        term113000 = new Integer(0);
        term113002 = new Integer(0);
        term113004 = new Boolean(false);
        term113006 = new Boolean(false);
        term113008 = new Boolean(false);
        term113010 = new Integer(0);
        term113012 = new Integer(0);
        term113014 = new Integer(0);
        term113016 = new Boolean(false);
        term113018 = new Integer(0);
        term113020 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[17];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = boolean.class;
        argTypes[9] = boolean.class;
        argTypes[10] = boolean.class;
        argTypes[11] = int.class;
        argTypes[12] = int.class;
        argTypes[13] = int.class;
        argTypes[14] = boolean.class;
        argTypes[15] = int.class;
        argTypes[16] = int.class;
        Object[] args = new Object[17];
        args[0] = term112990;
        args[1] = null;
        args[2] = term112992;
        args[3] = term112994;
        args[4] = term112996;
        args[5] = term112998;
        args[6] = term113000;
        args[7] = term113002;
        args[8] = term113004;
        args[9] = term113006;
        args[10] = term113008;
        args[11] = term113010;
        args[12] = term113012;
        args[13] = term113014;
        args[14] = term113016;
        args[15] = term113018;
        args[16] = term113020;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


