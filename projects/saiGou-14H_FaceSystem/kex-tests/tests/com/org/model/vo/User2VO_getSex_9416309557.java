package com.org.model.vo;

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
import static com.org.model.vo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class User2VO_getSex_9416309557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16031;

    public User2VO_getSex_9416309557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term16032 = new Integer(-26316536);
        Integer term16106 = new Integer(1716165145);
        Class<? extends Object> term16338 = Class.forName((String) "java.io.File$PathStatus");
        Field term16337 = ((Class) term16338).getDeclaredField((String) "CHECKED");
        ((Field) term16337).setAccessible(true);
        Object enum6 = ((Field) term16337).get((Object) null);
        ArrayList term16193 = new ArrayList();
        ((ArrayList) term16193).add("ggcJNlLcZb");
        ((ArrayList) term16193).add("EzhvjUZCQP");
        ((ArrayList) term16193).add("FTHebphiPR");
        ((ArrayList) term16193).add("OQjMPmyJQz");
        ((ArrayList) term16193).add("FZQimBsMNt");
        term16031 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        Object term16120 = newInstance(Class.forName("java.io.File"));
        setField(term16031, term16031.getClass(), "id", term16032);
        setField(term16031, term16031.getClass(), "email", "QyHVDeaOqb");
        setField(term16031, term16031.getClass(), "password", "ZwnEWySrcE");
        setField(term16031, term16031.getClass(), "username", "laQWfyDqCq");
        setField(term16031, term16031.getClass(), "power", "gMFGfpbPZE");
        setField(term16031, term16031.getClass(), "nickname", "QcfydYbOGP");
        setField(term16031, term16031.getClass(), "sex", "FdMzwKizAk");
        setField(term16031, term16031.getClass(), "age", term16106);
        setField(term16031, term16031.getClass(), "phone", "jjwHVTqCkP");
        setField(term16120, term16120.getClass(), "path", "uUAkxSFPyL");
        setField(term16120, term16120.getClass(), "status", enum6);
        setIntField(term16120, term16120.getClass(), "prefixLength", -1955890973);
        setField(term16120, term16120.getClass(), "filePath", null);
        setField(term16031, term16031.getClass(), "facePic", term16120);
        setField(term16031, term16031.getClass(), "faceUrl", "XfzbAdTaCO");
        setField(term16031, term16031.getClass(), "headUrl", "rDcGfVDmsE");
        setField(term16031, term16031.getClass(), "introduce", "agspBqCjgG");
        setField(term16031, term16031.getClass(), "ip", "HMJaeNiTNW");
        setField(term16031, term16031.getClass(), "partnames", term16193);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSex", argTypes, term16031, args);
    }

};


