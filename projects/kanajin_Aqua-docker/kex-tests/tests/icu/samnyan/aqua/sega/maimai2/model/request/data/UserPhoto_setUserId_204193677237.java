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
import java.lang.Long;

public class UserPhoto_setUserId_204193677237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2029;
     Object term2037;

    public UserPhoto_setUserId_204193677237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2029 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term2029, term2029.getClass(), "orderId", 0);
        setLongField(term2029, term2029.getClass(), "userId", 0L);
        setIntField(term2029, term2029.getClass(), "divNumber", 0);
        setIntField(term2029, term2029.getClass(), "divLength", 0);
        setField(term2029, term2029.getClass(), "divData", null);
        setIntField(term2029, term2029.getClass(), "placeId", 0);
        setField(term2029, term2029.getClass(), "clientId", null);
        setField(term2029, term2029.getClass(), "uploadDate", null);
        setLongField(term2029, term2029.getClass(), "playlogId", 0L);
        setIntField(term2029, term2029.getClass(), "trackNo", 0);
        term2037 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term2037;
        callMethod(klass, "setUserId", argTypes, term2029, args);
    }

};


