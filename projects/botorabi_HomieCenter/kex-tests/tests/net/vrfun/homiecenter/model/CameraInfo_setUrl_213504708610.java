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

public class CameraInfo_setUrl_213504708610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5874;

    public CameraInfo_setUrl_213504708610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5875 = new Long(-2813493605142626659L);
        term5874 = newInstance(Class.forName("net.vrfun.homiecenter.model.CameraInfo"));
        setField(term5874, term5874.getClass(), "id", term5875);
        setField(term5874, term5874.getClass(), "name", "BjugTaMcxJ");
        setField(term5874, term5874.getClass(), "previewUrl", "vGiuZVPJNH");
        setField(term5874, term5874.getClass(), "previewUrlTag", "tlzpzIjMib");
        setField(term5874, term5874.getClass(), "url", "AZdLeSugwv");
        setField(term5874, term5874.getClass(), "urlTag", "RMsXuyzKJV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.CameraInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FwPbDZcHmB";
        callMethod(klass, "setUrl", argTypes, term5874, args);
    }

};


