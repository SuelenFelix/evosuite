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

public class User2VO_getHeadUrl_126118868412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18528;

    public User2VO_getHeadUrl_126118868412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term18529 = new Integer(-1556527718);
        Integer term18603 = new Integer(895255351);
        Class<? extends Object> term18859 = Class.forName((String) "java.io.File$PathStatus");
        Field term18858 = ((Class) term18859).getDeclaredField((String) "CHECKED");
        ((Field) term18858).setAccessible(true);
        Object enum11 = ((Field) term18858).get((Object) null);
        ArrayList term18690 = new ArrayList();
        ((ArrayList) term18690).add("ZBafuLDRDM");
        ((ArrayList) term18690).add("VDnsNuhEvG");
        ((ArrayList) term18690).add("DMrfMwXyYT");
        ((ArrayList) term18690).add("GAzZvzjuXP");
        ((ArrayList) term18690).add("WoFrMqAUlT");
        ((ArrayList) term18690).add("RtHOddPkOW");
        ((ArrayList) term18690).add("LAaHVAeRPU");
        term18528 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        Object term18617 = newInstance(Class.forName("java.io.File"));
        setField(term18528, term18528.getClass(), "id", term18529);
        setField(term18528, term18528.getClass(), "email", "vUVScKcyFY");
        setField(term18528, term18528.getClass(), "password", "DCSMbuGiaM");
        setField(term18528, term18528.getClass(), "username", "wtOVzMPrFU");
        setField(term18528, term18528.getClass(), "power", "CBnamgJrJS");
        setField(term18528, term18528.getClass(), "nickname", "uJhRRqAnDP");
        setField(term18528, term18528.getClass(), "sex", "hJCqADrhuV");
        setField(term18528, term18528.getClass(), "age", term18603);
        setField(term18528, term18528.getClass(), "phone", "RyPUBlRpNZ");
        setField(term18617, term18617.getClass(), "path", "ardfVpCueq");
        setField(term18617, term18617.getClass(), "status", enum11);
        setIntField(term18617, term18617.getClass(), "prefixLength", -522618178);
        setField(term18617, term18617.getClass(), "filePath", null);
        setField(term18528, term18528.getClass(), "facePic", term18617);
        setField(term18528, term18528.getClass(), "faceUrl", "wEYAmGJIEF");
        setField(term18528, term18528.getClass(), "headUrl", "iXEhfXJomO");
        setField(term18528, term18528.getClass(), "introduce", "KEoUMzNdMA");
        setField(term18528, term18528.getClass(), "ip", "SOsGYAgpgW");
        setField(term18528, term18528.getClass(), "partnames", term18690);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHeadUrl", argTypes, term18528, args);
    }

};


