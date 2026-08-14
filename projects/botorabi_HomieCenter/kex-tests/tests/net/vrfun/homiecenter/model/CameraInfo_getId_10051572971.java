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

public class CameraInfo_getId_10051572971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4789;

    public CameraInfo_getId_10051572971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4790 = new Long(2442117782898005296L);
        term4789 = newInstance(Class.forName("net.vrfun.homiecenter.model.CameraInfo"));
        setField(term4789, term4789.getClass(), "id", term4790);
        setField(term4789, term4789.getClass(), "name", "HHmNoYxIGj");
        setField(term4789, term4789.getClass(), "previewUrl", "PtirvZmsGt");
        setField(term4789, term4789.getClass(), "previewUrlTag", "HWkpTmtlrc");
        setField(term4789, term4789.getClass(), "url", "hMmaoREuCK");
        setField(term4789, term4789.getClass(), "urlTag", "VeDtgDzGAN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.CameraInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term4789, args);
    }

};


