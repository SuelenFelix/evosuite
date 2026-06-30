package icu.samnyan.aqua.sega.maimai2.model.request;

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
import static icu.samnyan.aqua.sega.maimai2.model.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UploadUserPhoto_setUserPhoto_20891758581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2234;
     Object term2279;

    public UploadUserPhoto_setUserPhoto_20891758581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2234 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.UploadUserPhoto"));
        Object term2235 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term2235, term2235.getClass(), "orderId", -1963464809);
        setLongField(term2235, term2235.getClass(), "userId", -2644215923136513282L);
        setIntField(term2235, term2235.getClass(), "divNumber", 71190297);
        setIntField(term2235, term2235.getClass(), "divLength", 1202361360);
        setField(term2235, term2235.getClass(), "divData", "VgZnGoIFwQ");
        setIntField(term2235, term2235.getClass(), "placeId", -2015048153);
        setField(term2235, term2235.getClass(), "clientId", "jUbSRrkrYZ");
        setField(term2235, term2235.getClass(), "uploadDate", "bWWfajKbEX");
        setLongField(term2235, term2235.getClass(), "playlogId", -1468719814009985452L);
        setIntField(term2235, term2235.getClass(), "trackNo", -2063457669);
        setField(term2234, term2234.getClass(), "userPhoto", term2235);
        term2279 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term2279, term2279.getClass(), "orderId", -1222006000);
        setLongField(term2279, term2279.getClass(), "userId", -7738503207562305297L);
        setIntField(term2279, term2279.getClass(), "divNumber", 2095798786);
        setIntField(term2279, term2279.getClass(), "divLength", -1565502840);
        setField(term2279, term2279.getClass(), "divData", "cAPeiZHKGJ");
        setIntField(term2279, term2279.getClass(), "placeId", 344323424);
        setField(term2279, term2279.getClass(), "clientId", "LvJFtLBaxj");
        setField(term2279, term2279.getClass(), "uploadDate", "PHvxnGHptP");
        setLongField(term2279, term2279.getClass(), "playlogId", 3825396310311739952L);
        setIntField(term2279, term2279.getClass(), "trackNo", 9726679);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.UploadUserPhoto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto");
        Object[] args = new Object[1];
        args[0] = term2279;
        callMethod(klass, "setUserPhoto", argTypes, term2234, args);
    }

};


