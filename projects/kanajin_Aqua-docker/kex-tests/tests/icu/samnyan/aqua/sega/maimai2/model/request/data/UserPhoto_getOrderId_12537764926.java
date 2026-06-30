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

public class UserPhoto_getOrderId_12537764926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1939;

    public UserPhoto_getOrderId_12537764926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1939 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term1939, term1939.getClass(), "orderId", 0);
        setLongField(term1939, term1939.getClass(), "userId", 0L);
        setIntField(term1939, term1939.getClass(), "divNumber", 0);
        setIntField(term1939, term1939.getClass(), "divLength", 0);
        setField(term1939, term1939.getClass(), "divData", null);
        setIntField(term1939, term1939.getClass(), "placeId", 0);
        setField(term1939, term1939.getClass(), "clientId", null);
        setField(term1939, term1939.getClass(), "uploadDate", null);
        setLongField(term1939, term1939.getClass(), "playlogId", 0L);
        setIntField(term1939, term1939.getClass(), "trackNo", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrderId", argTypes, term1939, args);
    }

};


