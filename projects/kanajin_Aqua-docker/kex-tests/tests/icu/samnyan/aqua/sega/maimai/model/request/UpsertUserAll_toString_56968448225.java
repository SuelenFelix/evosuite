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

public class UpsertUserAll_toString_56968448225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13770;

    public UpsertUserAll_toString_56968448225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13770 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.request.UpsertUserAll"));
        setLongField(term13770, term13770.getClass(), "userId", 0L);
        setBooleanField(term13770, term13770.getClass(), "isEventMode", false);
        setBooleanField(term13770, term13770.getClass(), "isFreePlay", false);
        setField(term13770, term13770.getClass(), "upsertUserAll", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term13770, args);
    }

};


