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

public class User2VO_getUsername_10261401674 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14524;

    public User2VO_getUsername_10261401674() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term14525 = new Integer(1862841859);
        Integer term14599 = new Integer(-1114668574);
        Class<? extends Object> term14783 = Class.forName((String) "java.io.File$PathStatus");
        Field term14782 = ((Class) term14783).getDeclaredField((String) "INVALID");
        ((Field) term14782).setAccessible(true);
        Object enum3 = ((Field) term14782).get((Object) null);
        ArrayList term14686 = new ArrayList();
        ((ArrayList) term14686).add("pEZeQhLjKN");
        term14524 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        Object term14613 = newInstance(Class.forName("java.io.File"));
        setField(term14524, term14524.getClass(), "id", term14525);
        setField(term14524, term14524.getClass(), "email", "hYmQxPxTFd");
        setField(term14524, term14524.getClass(), "password", "Clkrygzvpw");
        setField(term14524, term14524.getClass(), "username", "TPzGOBNENK");
        setField(term14524, term14524.getClass(), "power", "ADhlvQDtuh");
        setField(term14524, term14524.getClass(), "nickname", "rvUfMhtNrD");
        setField(term14524, term14524.getClass(), "sex", "tVJNKfGPYg");
        setField(term14524, term14524.getClass(), "age", term14599);
        setField(term14524, term14524.getClass(), "phone", "AlAUNSOTmH");
        setField(term14613, term14613.getClass(), "path", "IeuSZGvhvH");
        setField(term14613, term14613.getClass(), "status", enum3);
        setIntField(term14613, term14613.getClass(), "prefixLength", 391863371);
        setField(term14613, term14613.getClass(), "filePath", null);
        setField(term14524, term14524.getClass(), "facePic", term14613);
        setField(term14524, term14524.getClass(), "faceUrl", "zCejWZdaIc");
        setField(term14524, term14524.getClass(), "headUrl", "aCfzlsgXhB");
        setField(term14524, term14524.getClass(), "introduce", "HmhoMiUgEv");
        setField(term14524, term14524.getClass(), "ip", "MuJvYyPzjX");
        setField(term14524, term14524.getClass(), "partnames", term14686);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term14524, args);
    }

};


