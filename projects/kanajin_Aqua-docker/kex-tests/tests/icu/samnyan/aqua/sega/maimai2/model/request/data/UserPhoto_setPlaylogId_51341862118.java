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

public class UserPhoto_setPlaylogId_51341862118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1409;
     Object term1453;

    public UserPhoto_setPlaylogId_51341862118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1409 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term1409, term1409.getClass(), "orderId", 941650513);
        setLongField(term1409, term1409.getClass(), "userId", 1439298019805881866L);
        setIntField(term1409, term1409.getClass(), "divNumber", 444029505);
        setIntField(term1409, term1409.getClass(), "divLength", -1034506028);
        setField(term1409, term1409.getClass(), "divData", "MLqYREekMl");
        setIntField(term1409, term1409.getClass(), "placeId", -1263114719);
        setField(term1409, term1409.getClass(), "clientId", "ytSBIKXogI");
        setField(term1409, term1409.getClass(), "uploadDate", "nHXjMycHlU");
        setLongField(term1409, term1409.getClass(), "playlogId", -8708192233349544946L);
        setIntField(term1409, term1409.getClass(), "trackNo", -894662986);
        term1453 = new Long(5907001541142728739L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1453;
        callMethod(klass, "setPlaylogId", argTypes, term1409, args);
    }

};


