package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class UserActivity_init_33848479849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50757;
     Object term50759;
     Object term50761;
     Object term50763;
     Object term50765;
     Object term50767;
     Object term50769;
     Object term50771;

    public UserActivity_init_33848479849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50757 = new Long(0L);
        term50759 = new Integer(0);
        term50761 = new Integer(0);
        term50763 = new Long(0L);
        term50765 = new Integer(0);
        term50767 = new Integer(0);
        term50769 = new Integer(0);
        term50771 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = long.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = int.class;
        Object[] args = new Object[9];
        args[0] = term50757;
        args[1] = null;
        args[2] = term50759;
        args[3] = term50761;
        args[4] = term50763;
        args[5] = term50765;
        args[6] = term50767;
        args[7] = term50769;
        args[8] = term50771;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


