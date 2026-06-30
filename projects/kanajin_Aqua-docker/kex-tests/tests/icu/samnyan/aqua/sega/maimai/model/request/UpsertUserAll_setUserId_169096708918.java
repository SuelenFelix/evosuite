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
import java.lang.Long;

public class UpsertUserAll_setUserId_169096708918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13736;
     Object term13740;

    public UpsertUserAll_setUserId_169096708918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13736 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.request.UpsertUserAll"));
        setLongField(term13736, term13736.getClass(), "userId", 0L);
        setBooleanField(term13736, term13736.getClass(), "isEventMode", false);
        setBooleanField(term13736, term13736.getClass(), "isFreePlay", false);
        setField(term13736, term13736.getClass(), "upsertUserAll", null);
        term13740 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.request.UpsertUserAll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term13740;
        callMethod(klass, "setUserId", argTypes, term13736, args);
    }

};


