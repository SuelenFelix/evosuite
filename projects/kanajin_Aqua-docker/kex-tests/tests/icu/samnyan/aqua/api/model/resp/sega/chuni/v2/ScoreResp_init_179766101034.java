package icu.samnyan.aqua.api.model.resp.sega.chuni.v2;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;

public class ScoreResp_init_179766101034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52931;
     Object term52933;
     Object term52935;
     Object term52937;
     Object term52939;
     Object term52941;
     Object term52943;
     Object term52945;
     Object term52947;
     Object term52949;
     Object term52951;
     Object term52953;
     Object term52955;
     Object term52957;
     Object term52959;

    public ScoreResp_init_179766101034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52931 = new Integer(688731975);
        term52933 = new Integer(1198340749);
        term52935 = new Integer(-385710681);
        term52937 = new Integer(1624133267);
        term52939 = new Integer(-1547947305);
        term52941 = new Integer(-919225635);
        term52943 = new Integer(-1044514554);
        term52945 = new Integer(35189099);
        term52947 = new Integer(-1399937823);
        term52949 = new Boolean(false);
        term52951 = new Boolean(false);
        term52953 = new Boolean(false);
        term52955 = new Integer(1439151010);
        term52957 = new Integer(520109121);
        term52959 = new Integer(-1374704112);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[15];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = int.class;
        argTypes[9] = boolean.class;
        argTypes[10] = boolean.class;
        argTypes[11] = boolean.class;
        argTypes[12] = int.class;
        argTypes[13] = int.class;
        argTypes[14] = int.class;
        Object[] args = new Object[15];
        args[0] = term52931;
        args[1] = term52933;
        args[2] = term52935;
        args[3] = term52937;
        args[4] = term52939;
        args[5] = term52941;
        args[6] = term52943;
        args[7] = term52945;
        args[8] = term52947;
        args[9] = term52949;
        args[10] = term52951;
        args[11] = term52953;
        args[12] = term52955;
        args[13] = term52957;
        args[14] = term52959;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


