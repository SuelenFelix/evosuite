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

public class CameraInfo_setName_11573452944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5130;

    public CameraInfo_setName_11573452944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5131 = new Long(5270370404989704783L);
        term5130 = newInstance(Class.forName("net.vrfun.homiecenter.model.CameraInfo"));
        setField(term5130, term5130.getClass(), "id", term5131);
        setField(term5130, term5130.getClass(), "name", "rLHAoqXgPh");
        setField(term5130, term5130.getClass(), "previewUrl", "zUlRdimJtU");
        setField(term5130, term5130.getClass(), "previewUrlTag", "vwbEQQNQrx");
        setField(term5130, term5130.getClass(), "url", "xtftXXMbem");
        setField(term5130, term5130.getClass(), "urlTag", "cudZvLMQon");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.CameraInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lihXWlGDxk";
        callMethod(klass, "setName", argTypes, term5130, args);
    }

};


