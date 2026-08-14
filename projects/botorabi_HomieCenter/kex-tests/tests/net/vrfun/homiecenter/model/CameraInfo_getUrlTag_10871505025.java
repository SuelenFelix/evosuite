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

public class CameraInfo_getUrlTag_10871505025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6380;

    public CameraInfo_getUrlTag_10871505025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6380 = newInstance(Class.forName("net.vrfun.homiecenter.model.CameraInfo"));
        setField(term6380, term6380.getClass(), "id", null);
        setField(term6380, term6380.getClass(), "name", null);
        setField(term6380, term6380.getClass(), "previewUrl", null);
        setField(term6380, term6380.getClass(), "previewUrlTag", null);
        setField(term6380, term6380.getClass(), "url", null);
        setField(term6380, term6380.getClass(), "urlTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.CameraInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUrlTag", argTypes, term6380, args);
    }

};


