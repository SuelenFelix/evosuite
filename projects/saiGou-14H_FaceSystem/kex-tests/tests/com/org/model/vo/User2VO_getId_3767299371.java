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

public class User2VO_getId_3767299371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13083;

    public User2VO_getId_3767299371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13084 = new Integer(2027686272);
        Integer term13158 = new Integer(-1494356104);
        Class<? extends Object> term13400 = Class.forName((String) "java.io.File$PathStatus");
        Field term13399 = ((Class) term13400).getDeclaredField((String) "INVALID");
        ((Field) term13399).setAccessible(true);
        Object enum0 = ((Field) term13399).get((Object) null);
        ArrayList term13245 = new ArrayList();
        ((ArrayList) term13245).add("YTnlgdIqfA");
        ((ArrayList) term13245).add("gcKmFclftu");
        ((ArrayList) term13245).add("lfREOBPEuD");
        ((ArrayList) term13245).add("JAGjDlTwTa");
        term13083 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        Object term13172 = newInstance(Class.forName("java.io.File"));
        setField(term13083, term13083.getClass(), "id", term13084);
        setField(term13083, term13083.getClass(), "email", "QWknVCpJTU");
        setField(term13083, term13083.getClass(), "password", "XhnCbWwpIr");
        setField(term13083, term13083.getClass(), "username", "BVMUadSiyU");
        setField(term13083, term13083.getClass(), "power", "OhWrgFwvJi");
        setField(term13083, term13083.getClass(), "nickname", "DfKWXfTINQ");
        setField(term13083, term13083.getClass(), "sex", "KqusFIxuyo");
        setField(term13083, term13083.getClass(), "age", term13158);
        setField(term13083, term13083.getClass(), "phone", "CDpvEYMuDg");
        setField(term13172, term13172.getClass(), "path", "YaZCAiIUPe");
        setField(term13172, term13172.getClass(), "status", enum0);
        setIntField(term13172, term13172.getClass(), "prefixLength", 568599855);
        setField(term13172, term13172.getClass(), "filePath", null);
        setField(term13083, term13083.getClass(), "facePic", term13172);
        setField(term13083, term13083.getClass(), "faceUrl", "KsCWHUcJDd");
        setField(term13083, term13083.getClass(), "headUrl", "zkYsnzzwJu");
        setField(term13083, term13083.getClass(), "introduce", "hxHKgOYyQD");
        setField(term13083, term13083.getClass(), "ip", "opEyNuSzgs");
        setField(term13083, term13083.getClass(), "partnames", term13245);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term13083, args);
    }

};


