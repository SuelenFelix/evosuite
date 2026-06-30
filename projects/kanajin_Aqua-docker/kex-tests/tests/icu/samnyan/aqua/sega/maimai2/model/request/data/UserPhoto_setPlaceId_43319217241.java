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
import java.lang.Integer;

public class UserPhoto_setPlaceId_43319217241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2067;
     Object term2075;

    public UserPhoto_setPlaceId_43319217241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2067 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term2067, term2067.getClass(), "orderId", 0);
        setLongField(term2067, term2067.getClass(), "userId", 0L);
        setIntField(term2067, term2067.getClass(), "divNumber", 0);
        setIntField(term2067, term2067.getClass(), "divLength", 0);
        setField(term2067, term2067.getClass(), "divData", null);
        setIntField(term2067, term2067.getClass(), "placeId", 0);
        setField(term2067, term2067.getClass(), "clientId", null);
        setField(term2067, term2067.getClass(), "uploadDate", null);
        setLongField(term2067, term2067.getClass(), "playlogId", 0L);
        setIntField(term2067, term2067.getClass(), "trackNo", 0);
        term2075 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2075;
        callMethod(klass, "setPlaceId", argTypes, term2067, args);
    }

};


