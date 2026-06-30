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

public class UploadUserPhoto_toString_2646698655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2610;

    public UploadUserPhoto_toString_2646698655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2610 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.UploadUserPhoto"));
        Object term2611 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term2611, term2611.getClass(), "orderId", 1283079251);
        setLongField(term2611, term2611.getClass(), "userId", 2062173786000223358L);
        setIntField(term2611, term2611.getClass(), "divNumber", -523949691);
        setIntField(term2611, term2611.getClass(), "divLength", 1398204340);
        setField(term2611, term2611.getClass(), "divData", "XqgfKFvPSD");
        setIntField(term2611, term2611.getClass(), "placeId", 229204365);
        setField(term2611, term2611.getClass(), "clientId", "JiVRgTZvKc");
        setField(term2611, term2611.getClass(), "uploadDate", "XPKmummaqg");
        setLongField(term2611, term2611.getClass(), "playlogId", -8658027316505137504L);
        setIntField(term2611, term2611.getClass(), "trackNo", -461771056);
        setField(term2610, term2610.getClass(), "userPhoto", term2611);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.UploadUserPhoto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2610, args);
    }

};


