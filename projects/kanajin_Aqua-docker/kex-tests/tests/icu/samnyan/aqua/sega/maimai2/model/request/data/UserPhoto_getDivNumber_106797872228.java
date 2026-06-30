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

public class UserPhoto_getDivNumber_106797872228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1955;

    public UserPhoto_getDivNumber_106797872228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1955 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term1955, term1955.getClass(), "orderId", 0);
        setLongField(term1955, term1955.getClass(), "userId", 0L);
        setIntField(term1955, term1955.getClass(), "divNumber", 0);
        setIntField(term1955, term1955.getClass(), "divLength", 0);
        setField(term1955, term1955.getClass(), "divData", null);
        setIntField(term1955, term1955.getClass(), "placeId", 0);
        setField(term1955, term1955.getClass(), "clientId", null);
        setField(term1955, term1955.getClass(), "uploadDate", null);
        setLongField(term1955, term1955.getClass(), "playlogId", 0L);
        setIntField(term1955, term1955.getClass(), "trackNo", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDivNumber", argTypes, term1955, args);
    }

};


