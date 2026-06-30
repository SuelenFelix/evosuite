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

public class UploadUserPhoto_equals_12241162302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2383;
     Object term2428;

    public UploadUserPhoto_equals_12241162302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2383 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.UploadUserPhoto"));
        Object term2384 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term2384, term2384.getClass(), "orderId", -25637976);
        setLongField(term2384, term2384.getClass(), "userId", -3838084482494604218L);
        setIntField(term2384, term2384.getClass(), "divNumber", 1555897383);
        setIntField(term2384, term2384.getClass(), "divLength", 202001407);
        setField(term2384, term2384.getClass(), "divData", "TimdotUuNC");
        setIntField(term2384, term2384.getClass(), "placeId", 158873461);
        setField(term2384, term2384.getClass(), "clientId", "PkWMRdJcBb");
        setField(term2384, term2384.getClass(), "uploadDate", "jSpAteRute");
        setLongField(term2384, term2384.getClass(), "playlogId", 3892018155439224435L);
        setIntField(term2384, term2384.getClass(), "trackNo", -430151637);
        setField(term2383, term2383.getClass(), "userPhoto", term2384);
        term2428 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.UploadUserPhoto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2428;
        callMethod(klass, "equals", argTypes, term2383, args);
    }

};


