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

public class UserPhoto_getPlaceId_19858120545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term371;

    public UserPhoto_getPlaceId_19858120545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term371 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term371, term371.getClass(), "orderId", 1135664017);
        setLongField(term371, term371.getClass(), "userId", -2813493605142626659L);
        setIntField(term371, term371.getClass(), "divNumber", 590364439);
        setIntField(term371, term371.getClass(), "divLength", 865208305);
        setField(term371, term371.getClass(), "divData", "aJlieCFVtF");
        setIntField(term371, term371.getClass(), "placeId", -1275173084);
        setField(term371, term371.getClass(), "clientId", "ZiaGIbnzTs");
        setField(term371, term371.getClass(), "uploadDate", "tbcdzjIfER");
        setLongField(term371, term371.getClass(), "playlogId", -8885298608300233488L);
        setIntField(term371, term371.getClass(), "trackNo", -244121226);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlaceId", argTypes, term371, args);
    }

};


