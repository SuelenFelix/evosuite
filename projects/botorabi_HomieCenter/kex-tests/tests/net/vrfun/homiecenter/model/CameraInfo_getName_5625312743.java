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

public class CameraInfo_getName_5625312743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5017;

    public CameraInfo_getName_5625312743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5018 = new Long(-8400487765614892086L);
        term5017 = newInstance(Class.forName("net.vrfun.homiecenter.model.CameraInfo"));
        setField(term5017, term5017.getClass(), "id", term5018);
        setField(term5017, term5017.getClass(), "name", "smnHEqRFRx");
        setField(term5017, term5017.getClass(), "previewUrl", "XYtryyobou");
        setField(term5017, term5017.getClass(), "previewUrlTag", "OYbzXylRWW");
        setField(term5017, term5017.getClass(), "url", "DSNsTGYXDF");
        setField(term5017, term5017.getClass(), "urlTag", "sQvGcVjdEx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.CameraInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term5017, args);
    }

};


