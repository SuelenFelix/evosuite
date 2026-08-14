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

public class CameraInfo_getPreviewUrl_9511693585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5265;

    public CameraInfo_getPreviewUrl_9511693585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5266 = new Long(7411271909051562686L);
        term5265 = newInstance(Class.forName("net.vrfun.homiecenter.model.CameraInfo"));
        setField(term5265, term5265.getClass(), "id", term5266);
        setField(term5265, term5265.getClass(), "name", "JmcmxoGhIK");
        setField(term5265, term5265.getClass(), "previewUrl", "jXzmYyrnnT");
        setField(term5265, term5265.getClass(), "previewUrlTag", "igCAtimmYB");
        setField(term5265, term5265.getClass(), "url", "DyiXbeYIaN");
        setField(term5265, term5265.getClass(), "urlTag", "VGizxZnyHX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.CameraInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPreviewUrl", argTypes, term5265, args);
    }

};


