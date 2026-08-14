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

public class CameraInfo_setUrlTag_173719876626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6381;

    public CameraInfo_setUrlTag_173719876626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6381 = newInstance(Class.forName("net.vrfun.homiecenter.model.CameraInfo"));
        setField(term6381, term6381.getClass(), "id", null);
        setField(term6381, term6381.getClass(), "name", null);
        setField(term6381, term6381.getClass(), "previewUrl", null);
        setField(term6381, term6381.getClass(), "previewUrlTag", null);
        setField(term6381, term6381.getClass(), "url", null);
        setField(term6381, term6381.getClass(), "urlTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.CameraInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUrlTag", argTypes, term6381, args);
    }

};


