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

public class User2VO_setId_139803577516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20750;
     Object term21000;

    public User2VO_setId_139803577516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term20751 = new Integer(-687282231);
        Integer term20825 = new Integer(1200440315);
        Class<? extends Object> term21083 = Class.forName((String) "java.io.File$PathStatus");
        Field term21082 = ((Class) term21083).getDeclaredField((String) "INVALID");
        ((Field) term21082).setAccessible(true);
        Object enum15 = ((Field) term21082).get((Object) null);
        ArrayList term20912 = new ArrayList();
        ((ArrayList) term20912).add("cQnJIENJHe");
        ((ArrayList) term20912).add("ExjdCvAxlG");
        ((ArrayList) term20912).add("moMySSiBuB");
        ((ArrayList) term20912).add("iuuazALDWB");
        ((ArrayList) term20912).add("GqehccUels");
        ((ArrayList) term20912).add("llbDGujrPe");
        ((ArrayList) term20912).add("QEoeITwBfz");
        term20750 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        Object term20839 = newInstance(Class.forName("java.io.File"));
        setField(term20750, term20750.getClass(), "id", term20751);
        setField(term20750, term20750.getClass(), "email", "CFGOXMbAUn");
        setField(term20750, term20750.getClass(), "password", "OxlZVhvedR");
        setField(term20750, term20750.getClass(), "username", "eoDtSQyUsr");
        setField(term20750, term20750.getClass(), "power", "RMTgBohsAX");
        setField(term20750, term20750.getClass(), "nickname", "kdYeXJnJGG");
        setField(term20750, term20750.getClass(), "sex", "XEdoshuvxD");
        setField(term20750, term20750.getClass(), "age", term20825);
        setField(term20750, term20750.getClass(), "phone", "ljtopXMcRl");
        setField(term20839, term20839.getClass(), "path", "HHtcAGkfuz");
        setField(term20839, term20839.getClass(), "status", enum15);
        setIntField(term20839, term20839.getClass(), "prefixLength", 597278769);
        setField(term20839, term20839.getClass(), "filePath", null);
        setField(term20750, term20750.getClass(), "facePic", term20839);
        setField(term20750, term20750.getClass(), "faceUrl", "QZCuYHcIBC");
        setField(term20750, term20750.getClass(), "headUrl", "hpvoFaAyIu");
        setField(term20750, term20750.getClass(), "introduce", "dyqukIBJxC");
        setField(term20750, term20750.getClass(), "ip", "MVMiGQdgnX");
        setField(term20750, term20750.getClass(), "partnames", term20912);
        term21000 = new Integer(40571662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term21000;
        callMethod(klass, "setId", argTypes, term20750, args);
    }

};


