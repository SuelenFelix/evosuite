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

public class CameraInfo_setId_5751155392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4902;
     Object term4965;

    public CameraInfo_setId_5751155392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4903 = new Long(6375119433582206027L);
        term4902 = newInstance(Class.forName("net.vrfun.homiecenter.model.CameraInfo"));
        setField(term4902, term4902.getClass(), "id", term4903);
        setField(term4902, term4902.getClass(), "name", "aWYOWZFyaX");
        setField(term4902, term4902.getClass(), "previewUrl", "BRIVNtfUWU");
        setField(term4902, term4902.getClass(), "previewUrlTag", "DbiCVtPPCT");
        setField(term4902, term4902.getClass(), "url", "WzFopsaDuG");
        setField(term4902, term4902.getClass(), "urlTag", "PapWxkhEWe");
        term4965 = new Long(-8257434502486459194L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.CameraInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term4965;
        callMethod(klass, "setId", argTypes, term4902, args);
    }

};


