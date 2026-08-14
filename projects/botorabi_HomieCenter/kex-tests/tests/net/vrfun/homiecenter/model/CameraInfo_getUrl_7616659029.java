package net.vrfun.homiecenter.model;

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
import static net.vrfun.homiecenter.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class CameraInfo_getUrl_7616659029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5761;

    public CameraInfo_getUrl_7616659029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5762 = new Long(6967924379644551255L);
        term5761 = newInstance(Class.forName("net.vrfun.homiecenter.model.CameraInfo"));
        setField(term5761, term5761.getClass(), "id", term5762);
        setField(term5761, term5761.getClass(), "name", "HDaezxQfQR");
        setField(term5761, term5761.getClass(), "previewUrl", "iikZEapDlu");
        setField(term5761, term5761.getClass(), "previewUrlTag", "nhoHrZfnIN");
        setField(term5761, term5761.getClass(), "url", "ZkMALXpEAZ");
        setField(term5761, term5761.getClass(), "urlTag", "tXfQjSqDzN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.CameraInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUrl", argTypes, term5761, args);
    }

};


