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

public class UserDuel_init_128505258457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17706;
     Object term17708;
     Object term17710;
     Object term17712;
     Object term17714;
     Object term17716;
     Object term17718;
     Object term17720;
     Object term17722;

    public UserDuel_init_128505258457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17706 = new Long(0L);
        term17708 = new Integer(0);
        term17710 = new Integer(0);
        term17712 = new Integer(0);
        term17714 = new Boolean(false);
        term17716 = new Integer(0);
        term17718 = new Integer(0);
        term17720 = new Integer(0);
        term17722 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[11];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = boolean.class;
        argTypes[6] = Class.forName("java.time.LocalDateTime");
        argTypes[7] = int.class;
        argTypes[8] = int.class;
        argTypes[9] = int.class;
        argTypes[10] = int.class;
        Object[] args = new Object[11];
        args[0] = term17706;
        args[1] = null;
        args[2] = term17708;
        args[3] = term17710;
        args[4] = term17712;
        args[5] = term17714;
        args[6] = null;
        args[7] = term17716;
        args[8] = term17718;
        args[9] = term17720;
        args[10] = term17722;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


