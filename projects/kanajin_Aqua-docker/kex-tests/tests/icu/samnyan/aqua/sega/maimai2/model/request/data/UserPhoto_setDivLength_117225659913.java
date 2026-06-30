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

public class UserPhoto_setDivLength_117225659913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term969;
     Object term1013;

    public UserPhoto_setDivLength_117225659913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term969 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term969, term969.getClass(), "orderId", -93135961);
        setLongField(term969, term969.getClass(), "userId", -4502405999831680926L);
        setIntField(term969, term969.getClass(), "divNumber", -112921587);
        setIntField(term969, term969.getClass(), "divLength", 933028652);
        setField(term969, term969.getClass(), "divData", "aKnKipADSo");
        setIntField(term969, term969.getClass(), "placeId", 287287233);
        setField(term969, term969.getClass(), "clientId", "wSQxaModmm");
        setField(term969, term969.getClass(), "uploadDate", "UlajhuVLaP");
        setLongField(term969, term969.getClass(), "playlogId", 1967728129628047933L);
        setIntField(term969, term969.getClass(), "trackNo", 962840079);
        term1013 = new Integer(1540719661);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1013;
        callMethod(klass, "setDivLength", argTypes, term969, args);
    }

};


