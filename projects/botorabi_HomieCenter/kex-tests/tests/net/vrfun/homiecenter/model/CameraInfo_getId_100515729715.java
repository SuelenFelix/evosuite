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

public class CameraInfo_getId_100515729715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6370;

    public CameraInfo_getId_100515729715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6370 = newInstance(Class.forName("net.vrfun.homiecenter.model.CameraInfo"));
        setField(term6370, term6370.getClass(), "id", null);
        setField(term6370, term6370.getClass(), "name", null);
        setField(term6370, term6370.getClass(), "previewUrl", null);
        setField(term6370, term6370.getClass(), "previewUrlTag", null);
        setField(term6370, term6370.getClass(), "url", null);
        setField(term6370, term6370.getClass(), "urlTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.CameraInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term6370, args);
    }

};


