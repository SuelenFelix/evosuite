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

public class CameraInfo_getUrlTag_10871505011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6009;

    public CameraInfo_getUrlTag_10871505011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6010 = new Long(-8885298608300233488L);
        term6009 = newInstance(Class.forName("net.vrfun.homiecenter.model.CameraInfo"));
        setField(term6009, term6009.getClass(), "id", term6010);
        setField(term6009, term6009.getClass(), "name", "hOncybyCAH");
        setField(term6009, term6009.getClass(), "previewUrl", "QduALnDSVo");
        setField(term6009, term6009.getClass(), "previewUrlTag", "izPpKDErnQ");
        setField(term6009, term6009.getClass(), "url", "NnpwZBUTvx");
        setField(term6009, term6009.getClass(), "urlTag", "tlQSNgTkQX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.CameraInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUrlTag", argTypes, term6009, args);
    }

};


