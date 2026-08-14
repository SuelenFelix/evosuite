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

public class CameraInfo_setUrlTag_173719876612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6122;

    public CameraInfo_setUrlTag_173719876612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6123 = new Long(-4325723315152823407L);
        term6122 = newInstance(Class.forName("net.vrfun.homiecenter.model.CameraInfo"));
        setField(term6122, term6122.getClass(), "id", term6123);
        setField(term6122, term6122.getClass(), "name", "PCipZnmBOF");
        setField(term6122, term6122.getClass(), "previewUrl", "zcorEihhLK");
        setField(term6122, term6122.getClass(), "previewUrlTag", "GrqozDKFOk");
        setField(term6122, term6122.getClass(), "url", "CFyoseFGLF");
        setField(term6122, term6122.getClass(), "urlTag", "SFqCrhEWLm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.CameraInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GZdcJyZntS";
        callMethod(klass, "setUrlTag", argTypes, term6122, args);
    }

};


