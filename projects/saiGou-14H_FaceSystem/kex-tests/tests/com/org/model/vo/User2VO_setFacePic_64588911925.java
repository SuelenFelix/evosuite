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

public class User2VO_setFacePic_64588911925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26089;
     Object term26291;

    public User2VO_setFacePic_64588911925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term26090 = new Integer(-1973791064);
        Integer term26164 = new Integer(-2072158633);
        Class<? extends Object> term26397 = Class.forName((String) "java.io.File$PathStatus");
        Field term26396 = ((Class) term26397).getDeclaredField((String) "CHECKED");
        ((Field) term26396).setAccessible(true);
        Object enum24 = ((Field) term26396).get((Object) null);
        ArrayList term26251 = new ArrayList();
        ((ArrayList) term26251).add("IfOJiWUkHp");
        ((ArrayList) term26251).add("YQNWnfnWil");
        ((ArrayList) term26251).add("ChmRdUmCnQ");
        term26089 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        Object term26178 = newInstance(Class.forName("java.io.File"));
        setField(term26089, term26089.getClass(), "id", term26090);
        setField(term26089, term26089.getClass(), "email", "ONotPjASxK");
        setField(term26089, term26089.getClass(), "password", "LzgtTgYOFG");
        setField(term26089, term26089.getClass(), "username", "ouCBOakoEl");
        setField(term26089, term26089.getClass(), "power", "wQVWUCbSgW");
        setField(term26089, term26089.getClass(), "nickname", "tHzdWkkvkE");
        setField(term26089, term26089.getClass(), "sex", "OeOnaLqxoy");
        setField(term26089, term26089.getClass(), "age", term26164);
        setField(term26089, term26089.getClass(), "phone", "buRlIDjuAa");
        setField(term26178, term26178.getClass(), "path", "qDicwPaclz");
        setField(term26178, term26178.getClass(), "status", enum24);
        setIntField(term26178, term26178.getClass(), "prefixLength", -1007160944);
        setField(term26178, term26178.getClass(), "filePath", null);
        setField(term26089, term26089.getClass(), "facePic", term26178);
        setField(term26089, term26089.getClass(), "faceUrl", "eZlPEKWGYm");
        setField(term26089, term26089.getClass(), "headUrl", "KuunqhygWm");
        setField(term26089, term26089.getClass(), "introduce", "wKOfSnwiZS");
        setField(term26089, term26089.getClass(), "ip", "oIlPhWewqE");
        setField(term26089, term26089.getClass(), "partnames", term26251);
        Class<? extends Object> term26620 = Class.forName((String) "java.io.File$PathStatus");
        Field term26619 = ((Class) term26620).getDeclaredField((String) "INVALID");
        ((Field) term26619).setAccessible(true);
        Object enum25 = ((Field) term26619).get((Object) null);
        term26291 = newInstance(Class.forName("java.io.File"));
        setField(term26291, term26291.getClass(), "path", "WbDSdFiKLp");
        setField(term26291, term26291.getClass(), "status", enum25);
        setIntField(term26291, term26291.getClass(), "prefixLength", 1135664017);
        setField(term26291, term26291.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term26291;
        callMethod(klass, "setFacePic", argTypes, term26089, args);
    }

};


