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

public class UserMemoryChapter_init_71575835565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403724;
     Object term403726;
     Object term403728;
     Object term403730;
     Object term403732;
     Object term403734;
     Object term403736;
     Object term403738;
     Object term403740;
     Object term403742;
     Object term403744;
     Object term403746;

    public UserMemoryChapter_init_71575835565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403724 = new Long(0L);
        term403726 = new Integer(0);
        term403728 = new Integer(0);
        term403730 = new Integer(0);
        term403732 = new Integer(0);
        term403734 = new Integer(0);
        term403736 = new Boolean(false);
        term403738 = new Boolean(false);
        term403740 = new Boolean(false);
        term403742 = new Boolean(false);
        term403744 = new Integer(0);
        term403746 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[13];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = boolean.class;
        argTypes[8] = boolean.class;
        argTypes[9] = boolean.class;
        argTypes[10] = boolean.class;
        argTypes[11] = int.class;
        argTypes[12] = int.class;
        Object[] args = new Object[13];
        args[0] = term403724;
        args[1] = null;
        args[2] = term403726;
        args[3] = term403728;
        args[4] = term403730;
        args[5] = term403732;
        args[6] = term403734;
        args[7] = term403736;
        args[8] = term403738;
        args[9] = term403740;
        args[10] = term403742;
        args[11] = term403744;
        args[12] = term403746;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


