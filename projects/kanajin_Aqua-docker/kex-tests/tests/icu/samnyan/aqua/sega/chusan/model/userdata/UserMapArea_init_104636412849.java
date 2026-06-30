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

public class UserMapArea_init_104636412849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157582;
     Object term157584;
     Object term157586;
     Object term157588;
     Object term157590;
     Object term157592;
     Object term157594;
     Object term157596;

    public UserMapArea_init_104636412849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157582 = new Long(0L);
        term157584 = new Integer(0);
        term157586 = new Integer(0);
        term157588 = new Boolean(false);
        term157590 = new Integer(0);
        term157592 = new Integer(0);
        term157594 = new Integer(0);
        term157596 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserMapArea");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = boolean.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = boolean.class;
        Object[] args = new Object[9];
        args[0] = term157582;
        args[1] = null;
        args[2] = term157584;
        args[3] = term157586;
        args[4] = term157588;
        args[5] = term157590;
        args[6] = term157592;
        args[7] = term157594;
        args[8] = term157596;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


