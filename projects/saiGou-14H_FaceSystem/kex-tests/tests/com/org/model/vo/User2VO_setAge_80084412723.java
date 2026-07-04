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

public class User2VO_setAge_80084412723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24899;
     Object term25125;

    public User2VO_setAge_80084412723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term24900 = new Integer(-1999787419);
        Integer term24974 = new Integer(-1224443634);
        Class<? extends Object> term25208 = Class.forName((String) "java.io.File$PathStatus");
        Field term25207 = ((Class) term25208).getDeclaredField((String) "CHECKED");
        ((Field) term25207).setAccessible(true);
        Object enum22 = ((Field) term25207).get((Object) null);
        ArrayList term25061 = new ArrayList();
        ((ArrayList) term25061).add("VkjCLLOwvZ");
        ((ArrayList) term25061).add("YQaoPDOhWH");
        ((ArrayList) term25061).add("SJPzCePrEj");
        ((ArrayList) term25061).add("tYasEQgFbL");
        ((ArrayList) term25061).add("hqURWIdULb");
        term24899 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        Object term24988 = newInstance(Class.forName("java.io.File"));
        setField(term24899, term24899.getClass(), "id", term24900);
        setField(term24899, term24899.getClass(), "email", "jCEXysSVZf");
        setField(term24899, term24899.getClass(), "password", "jWrmcNnNoB");
        setField(term24899, term24899.getClass(), "username", "MoncgugUfo");
        setField(term24899, term24899.getClass(), "power", "OdbuOWCJTS");
        setField(term24899, term24899.getClass(), "nickname", "ksvfEdmpqg");
        setField(term24899, term24899.getClass(), "sex", "mNzFmmNjDi");
        setField(term24899, term24899.getClass(), "age", term24974);
        setField(term24899, term24899.getClass(), "phone", "UxkbStdccR");
        setField(term24988, term24988.getClass(), "path", "kizVhsjIpC");
        setField(term24988, term24988.getClass(), "status", enum22);
        setIntField(term24988, term24988.getClass(), "prefixLength", -2068769794);
        setField(term24988, term24988.getClass(), "filePath", null);
        setField(term24899, term24899.getClass(), "facePic", term24988);
        setField(term24899, term24899.getClass(), "faceUrl", "uDuPkYdemJ");
        setField(term24899, term24899.getClass(), "headUrl", "FfynoMXicS");
        setField(term24899, term24899.getClass(), "introduce", "mbofhtwtHb");
        setField(term24899, term24899.getClass(), "ip", "goCKhChLTQ");
        setField(term24899, term24899.getClass(), "partnames", term25061);
        term25125 = new Integer(1048451946);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term25125;
        callMethod(klass, "setAge", argTypes, term24899, args);
    }

};


