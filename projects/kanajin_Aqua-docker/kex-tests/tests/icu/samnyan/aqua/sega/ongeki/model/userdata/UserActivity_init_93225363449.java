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

public class UserActivity_init_93225363449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293752;
     Object term293754;
     Object term293756;
     Object term293758;
     Object term293760;
     Object term293762;
     Object term293764;
     Object term293766;

    public UserActivity_init_93225363449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293752 = new Long(0L);
        term293754 = new Integer(0);
        term293756 = new Integer(0);
        term293758 = new Integer(0);
        term293760 = new Integer(0);
        term293762 = new Integer(0);
        term293764 = new Integer(0);
        term293766 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = int.class;
        Object[] args = new Object[9];
        args[0] = term293752;
        args[1] = null;
        args[2] = term293754;
        args[3] = term293756;
        args[4] = term293758;
        args[5] = term293760;
        args[6] = term293762;
        args[7] = term293764;
        args[8] = term293766;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


