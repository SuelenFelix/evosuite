package icu.samnyan.aqua.sega.maimai2.model.request.data;

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
import static icu.samnyan.aqua.sega.maimai2.model.request.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserPhoto_equals_117816116446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2113;

    public UserPhoto_equals_117816116446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2113 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term2113, term2113.getClass(), "orderId", 0);
        setLongField(term2113, term2113.getClass(), "userId", 0L);
        setIntField(term2113, term2113.getClass(), "divNumber", 0);
        setIntField(term2113, term2113.getClass(), "divLength", 0);
        setField(term2113, term2113.getClass(), "divData", null);
        setIntField(term2113, term2113.getClass(), "placeId", 0);
        setField(term2113, term2113.getClass(), "clientId", null);
        setField(term2113, term2113.getClass(), "uploadDate", null);
        setLongField(term2113, term2113.getClass(), "playlogId", 0L);
        setIntField(term2113, term2113.getClass(), "trackNo", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term2113, args);
    }

};


