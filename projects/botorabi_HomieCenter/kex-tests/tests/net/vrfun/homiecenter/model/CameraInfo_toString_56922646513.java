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

public class CameraInfo_toString_56922646513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6257;

    public CameraInfo_toString_56922646513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6258 = new Long(2535595959091595249L);
        term6257 = newInstance(Class.forName("net.vrfun.homiecenter.model.CameraInfo"));
        setField(term6257, term6257.getClass(), "id", term6258);
        setField(term6257, term6257.getClass(), "name", "OIHoJeysUi");
        setField(term6257, term6257.getClass(), "previewUrl", "WXMWFDGcLB");
        setField(term6257, term6257.getClass(), "previewUrlTag", "wKWbJssZuG");
        setField(term6257, term6257.getClass(), "url", "NzBMMhkhpT");
        setField(term6257, term6257.getClass(), "urlTag", "qCpEbQDHdF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.CameraInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term6257, args);
    }

};


