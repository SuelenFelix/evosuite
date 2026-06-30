package icu.samnyan.aqua.sega.maimai.model.request;

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
import static icu.samnyan.aqua.sega.maimai.model.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class UpsertUserAll_setEventMode_160018351819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13742;
     Object term13746;

    public UpsertUserAll_setEventMode_160018351819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13742 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.request.UpsertUserAll"));
        setLongField(term13742, term13742.getClass(), "userId", 0L);
        setBooleanField(term13742, term13742.getClass(), "isEventMode", false);
        setBooleanField(term13742, term13742.getClass(), "isFreePlay", false);
        setField(term13742, term13742.getClass(), "upsertUserAll", null);
        term13746 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term13746;
        callMethod(klass, "setEventMode", argTypes, term13742, args);
    }

};


