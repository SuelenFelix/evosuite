package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;

public class UserCourse_init_159883293168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94311;
     Object term94313;
     Object term94315;
     Object term94317;
     Object term94319;
     Object term94321;
     Object term94323;
     Object term94325;
     Object term94327;

    public UserCourse_init_159883293168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94311 = new Long(0L);
        term94313 = new Integer(0);
        term94315 = new Boolean(false);
        term94317 = new Integer(0);
        term94319 = new Integer(0);
        term94321 = new Integer(0);
        term94323 = new Integer(0);
        term94325 = new Integer(0);
        term94327 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[14];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = Class.forName("java.lang.String");
        argTypes[10] = int.class;
        argTypes[11] = Class.forName("java.lang.String");
        argTypes[12] = int.class;
        argTypes[13] = Class.forName("java.lang.String");
        Object[] args = new Object[14];
        args[0] = term94311;
        args[1] = null;
        args[2] = term94313;
        args[3] = term94315;
        args[4] = term94317;
        args[5] = term94319;
        args[6] = term94321;
        args[7] = term94323;
        args[8] = null;
        args[9] = null;
        args[10] = term94325;
        args[11] = null;
        args[12] = term94327;
        args[13] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


