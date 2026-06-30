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

public class UserFavorite_init_180961590232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term573245;
     Object term573247;
     Object term573249;

    public UserFavorite_init_180961590232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term573245 = new Long(0L);
        term573247 = new Long(0L);
        term573249 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFavorite");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        argTypes[2] = long.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.util.List");
        Object[] args = new Object[5];
        args[0] = term573245;
        args[1] = null;
        args[2] = term573247;
        args[3] = term573249;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


