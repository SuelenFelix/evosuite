package icu.samnyan.aqua.sega.maimai2.model.request;

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
import static icu.samnyan.aqua.sega.maimai2.model.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Boolean;

public class UpsertUserAll_init_134750926330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21586;
     Object term21588;
     Object term21590;
     Object term21592;

    public UpsertUserAll_init_134750926330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21586 = new Long(0L);
        term21588 = new Long(0L);
        term21590 = new Boolean(false);
        term21592 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        argTypes[4] = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserAll");
        Object[] args = new Object[5];
        args[0] = term21586;
        args[1] = term21588;
        args[2] = term21590;
        args[3] = term21592;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


