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

public class UploadUserPhoto_canEqual_20282788593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2459;
     Object term2504;

    public UploadUserPhoto_canEqual_20282788593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2459 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.UploadUserPhoto"));
        Object term2460 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term2460, term2460.getClass(), "orderId", -1697741339);
        setLongField(term2460, term2460.getClass(), "userId", 5953383087795962419L);
        setIntField(term2460, term2460.getClass(), "divNumber", 98922530);
        setIntField(term2460, term2460.getClass(), "divLength", -1388471422);
        setField(term2460, term2460.getClass(), "divData", "swZVeJAxjt");
        setIntField(term2460, term2460.getClass(), "placeId", -1498296052);
        setField(term2460, term2460.getClass(), "clientId", "xOcJIiQQDu");
        setField(term2460, term2460.getClass(), "uploadDate", "GVizqqzXpy");
        setLongField(term2460, term2460.getClass(), "playlogId", 7994303628307559416L);
        setIntField(term2460, term2460.getClass(), "trackNo", 2098647989);
        setField(term2459, term2459.getClass(), "userPhoto", term2460);
        term2504 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.UploadUserPhoto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2504;
        callMethod(klass, "canEqual", argTypes, term2459, args);
    }

};


