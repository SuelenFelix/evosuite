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

public class UserPhoto_setTrackNo_149541465845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2103;
     Object term2111;

    public UserPhoto_setTrackNo_149541465845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2103 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term2103, term2103.getClass(), "orderId", 0);
        setLongField(term2103, term2103.getClass(), "userId", 0L);
        setIntField(term2103, term2103.getClass(), "divNumber", 0);
        setIntField(term2103, term2103.getClass(), "divLength", 0);
        setField(term2103, term2103.getClass(), "divData", null);
        setIntField(term2103, term2103.getClass(), "placeId", 0);
        setField(term2103, term2103.getClass(), "clientId", null);
        setField(term2103, term2103.getClass(), "uploadDate", null);
        setLongField(term2103, term2103.getClass(), "playlogId", 0L);
        setIntField(term2103, term2103.getClass(), "trackNo", 0);
        term2111 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2111;
        callMethod(klass, "setTrackNo", argTypes, term2103, args);
    }

};


