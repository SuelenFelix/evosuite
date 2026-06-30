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

public class UserPhoto_equals_117816116420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1561;
     Object term1605;

    public UserPhoto_equals_117816116420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1561 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term1561, term1561.getClass(), "orderId", -1210583429);
        setLongField(term1561, term1561.getClass(), "userId", -6292278961887936280L);
        setIntField(term1561, term1561.getClass(), "divNumber", -663691365);
        setIntField(term1561, term1561.getClass(), "divLength", 339854490);
        setField(term1561, term1561.getClass(), "divData", "eqJfYWRaEL");
        setIntField(term1561, term1561.getClass(), "placeId", -615654495);
        setField(term1561, term1561.getClass(), "clientId", "fhkbdRViHi");
        setField(term1561, term1561.getClass(), "uploadDate", "uWHnvSvaPl");
        setLongField(term1561, term1561.getClass(), "playlogId", -6645965768855543712L);
        setIntField(term1561, term1561.getClass(), "trackNo", -1476117762);
        term1605 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1605;
        callMethod(klass, "equals", argTypes, term1561, args);
    }

};


