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

public class UploadUserPhoto_getUserPhoto_2548463580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2159;

    public UploadUserPhoto_getUserPhoto_2548463580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2159 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.UploadUserPhoto"));
        Object term2160 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term2160, term2160.getClass(), "orderId", -2015854073);
        setLongField(term2160, term2160.getClass(), "userId", -1154553077993834885L);
        setIntField(term2160, term2160.getClass(), "divNumber", 538259104);
        setIntField(term2160, term2160.getClass(), "divLength", 96566506);
        setField(term2160, term2160.getClass(), "divData", "OWKQODBLzb");
        setIntField(term2160, term2160.getClass(), "placeId", -343325701);
        setField(term2160, term2160.getClass(), "clientId", "wGmYcqUkgE");
        setField(term2160, term2160.getClass(), "uploadDate", "idgaQsnJpQ");
        setLongField(term2160, term2160.getClass(), "playlogId", -2850532706972744550L);
        setIntField(term2160, term2160.getClass(), "trackNo", 107945604);
        setField(term2159, term2159.getClass(), "userPhoto", term2160);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.UploadUserPhoto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserPhoto", argTypes, term2159, args);
    }

};


