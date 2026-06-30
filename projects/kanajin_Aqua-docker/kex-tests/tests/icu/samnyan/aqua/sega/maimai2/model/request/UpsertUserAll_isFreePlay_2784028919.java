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

public class UpsertUserAll_isFreePlay_2784028919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21523;

    public UpsertUserAll_isFreePlay_2784028919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21523 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.UpsertUserAll"));
        setLongField(term21523, term21523.getClass(), "userId", 0L);
        setLongField(term21523, term21523.getClass(), "playlogId", 0L);
        setBooleanField(term21523, term21523.getClass(), "isEventMode", false);
        setBooleanField(term21523, term21523.getClass(), "isFreePlay", false);
        setField(term21523, term21523.getClass(), "upsertUserAll", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFreePlay", argTypes, term21523, args);
    }

};


