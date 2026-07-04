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

public class User2VO_getEmail_16246811832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13622;

    public User2VO_getEmail_16246811832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13623 = new Integer(-695279311);
        Integer term13697 = new Integer(114279242);
        Class<? extends Object> term13869 = Class.forName((String) "java.io.File$PathStatus");
        Field term13868 = ((Class) term13869).getDeclaredField((String) "INVALID");
        ((Field) term13868).setAccessible(true);
        Object enum1 = ((Field) term13868).get((Object) null);
        ArrayList term13784 = new ArrayList();
        term13622 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        Object term13711 = newInstance(Class.forName("java.io.File"));
        setField(term13622, term13622.getClass(), "id", term13623);
        setField(term13622, term13622.getClass(), "email", "wIDeyLnekQ");
        setField(term13622, term13622.getClass(), "password", "tOGPTIqSMm");
        setField(term13622, term13622.getClass(), "username", "cFwZnaLmLP");
        setField(term13622, term13622.getClass(), "power", "cBtfnWBMkE");
        setField(term13622, term13622.getClass(), "nickname", "sFixkFlMhw");
        setField(term13622, term13622.getClass(), "sex", "wNaCYPwDGZ");
        setField(term13622, term13622.getClass(), "age", term13697);
        setField(term13622, term13622.getClass(), "phone", "CFojehEtAR");
        setField(term13711, term13711.getClass(), "path", "EYeLeoxDrM");
        setField(term13711, term13711.getClass(), "status", enum1);
        setIntField(term13711, term13711.getClass(), "prefixLength", 1162663216);
        setField(term13711, term13711.getClass(), "filePath", null);
        setField(term13622, term13622.getClass(), "facePic", term13711);
        setField(term13622, term13622.getClass(), "faceUrl", "zIPJJJubgX");
        setField(term13622, term13622.getClass(), "headUrl", "WRbxmSFTaO");
        setField(term13622, term13622.getClass(), "introduce", "ZekQCuvPXT");
        setField(term13622, term13622.getClass(), "ip", "GUXdlpmVNQ");
        setField(term13622, term13622.getClass(), "partnames", term13784);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term13622, args);
    }

};


