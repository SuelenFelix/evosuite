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

public class UserExtend_init_22523399876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166235;
     Object term166237;
     Object term166239;
     Object term166241;
     Object term166243;
     Object term166245;
     Object term166247;
     Object term166249;
     Object term166251;
     Object term166253;
     Object term166255;
     Object term166257;
     Object term166259;

    public UserExtend_init_22523399876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166235 = new Long(0L);
        term166237 = new Integer(0);
        term166239 = new Integer(0);
        term166241 = new Integer(0);
        term166243 = new Integer(0);
        term166245 = new Integer(0);
        term166247 = new Integer(0);
        term166249 = new Long(0L);
        term166251 = new Boolean(false);
        term166253 = new Boolean(false);
        term166255 = new Boolean(false);
        term166257 = new Integer(0);
        term166259 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[16];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = long.class;
        argTypes[9] = boolean.class;
        argTypes[10] = boolean.class;
        argTypes[11] = boolean.class;
        argTypes[12] = int.class;
        argTypes[13] = int.class;
        argTypes[14] = Class.forName("java.util.List");
        argTypes[15] = Class.forName("java.util.List");
        Object[] args = new Object[16];
        args[0] = term166235;
        args[1] = null;
        args[2] = term166237;
        args[3] = term166239;
        args[4] = term166241;
        args[5] = term166243;
        args[6] = term166245;
        args[7] = term166247;
        args[8] = term166249;
        args[9] = term166251;
        args[10] = term166253;
        args[11] = term166255;
        args[12] = term166257;
        args[13] = term166259;
        args[14] = null;
        args[15] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


