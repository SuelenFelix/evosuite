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

public class UserPhoto_setTrackNo_149541465819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1485;
     Object term1529;

    public UserPhoto_setTrackNo_149541465819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1485 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term1485, term1485.getClass(), "orderId", 304775596);
        setLongField(term1485, term1485.getClass(), "userId", 4178434741742309755L);
        setIntField(term1485, term1485.getClass(), "divNumber", -1347665717);
        setIntField(term1485, term1485.getClass(), "divLength", -1888585309);
        setField(term1485, term1485.getClass(), "divData", "ieCtQFdkii");
        setIntField(term1485, term1485.getClass(), "placeId", 683666002);
        setField(term1485, term1485.getClass(), "clientId", "dEnhdmILtU");
        setField(term1485, term1485.getClass(), "uploadDate", "hoicvmsovO");
        setLongField(term1485, term1485.getClass(), "playlogId", -2068172595987555756L);
        setIntField(term1485, term1485.getClass(), "trackNo", 1596213415);
        term1529 = new Integer(-268815336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1529;
        callMethod(klass, "setTrackNo", argTypes, term1485, args);
    }

};


