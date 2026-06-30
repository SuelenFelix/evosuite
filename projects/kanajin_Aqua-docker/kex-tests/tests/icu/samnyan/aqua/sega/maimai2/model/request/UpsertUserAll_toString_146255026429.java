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

public class UpsertUserAll_toString_146255026429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21581;

    public UpsertUserAll_toString_146255026429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21581 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.UpsertUserAll"));
        setLongField(term21581, term21581.getClass(), "userId", 0L);
        setLongField(term21581, term21581.getClass(), "playlogId", 0L);
        setBooleanField(term21581, term21581.getClass(), "isEventMode", false);
        setBooleanField(term21581, term21581.getClass(), "isFreePlay", false);
        setField(term21581, term21581.getClass(), "upsertUserAll", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term21581, args);
    }

};


