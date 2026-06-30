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

public class UpsertUserAll_setPlaylogId_116784644222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21540;
     Object term21545;

    public UpsertUserAll_setPlaylogId_116784644222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21540 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.UpsertUserAll"));
        setLongField(term21540, term21540.getClass(), "userId", 0L);
        setLongField(term21540, term21540.getClass(), "playlogId", 0L);
        setBooleanField(term21540, term21540.getClass(), "isEventMode", false);
        setBooleanField(term21540, term21540.getClass(), "isFreePlay", false);
        setField(term21540, term21540.getClass(), "upsertUserAll", null);
        term21545 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term21545;
        callMethod(klass, "setPlaylogId", argTypes, term21540, args);
    }

};


