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

public class UpsertUserAll_setUserId_57176546121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21533;
     Object term21538;

    public UpsertUserAll_setUserId_57176546121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21533 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.UpsertUserAll"));
        setLongField(term21533, term21533.getClass(), "userId", 0L);
        setLongField(term21533, term21533.getClass(), "playlogId", 0L);
        setBooleanField(term21533, term21533.getClass(), "isEventMode", false);
        setBooleanField(term21533, term21533.getClass(), "isFreePlay", false);
        setField(term21533, term21533.getClass(), "upsertUserAll", null);
        term21538 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term21538;
        callMethod(klass, "setUserId", argTypes, term21533, args);
    }

};


