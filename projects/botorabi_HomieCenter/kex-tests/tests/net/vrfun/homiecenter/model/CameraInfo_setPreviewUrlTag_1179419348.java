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

public class CameraInfo_setPreviewUrlTag_1179419348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5626;

    public CameraInfo_setPreviewUrlTag_1179419348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5627 = new Long(-7237588299778557629L);
        term5626 = newInstance(Class.forName("net.vrfun.homiecenter.model.CameraInfo"));
        setField(term5626, term5626.getClass(), "id", term5627);
        setField(term5626, term5626.getClass(), "name", "tRxZafjqIx");
        setField(term5626, term5626.getClass(), "previewUrl", "DhjNLmRMCu");
        setField(term5626, term5626.getClass(), "previewUrlTag", "PgPzMSEjjX");
        setField(term5626, term5626.getClass(), "url", "wzsPSPcRdj");
        setField(term5626, term5626.getClass(), "urlTag", "kGMQdqJYyB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.CameraInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XJJNClzHRf";
        callMethod(klass, "setPreviewUrlTag", argTypes, term5626, args);
    }

};


