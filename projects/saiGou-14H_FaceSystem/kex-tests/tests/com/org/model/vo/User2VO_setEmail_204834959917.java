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

public class User2VO_setEmail_204834959917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21335;

    public User2VO_setEmail_204834959917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term21336 = new Integer(1863910269);
        Integer term21410 = new Integer(864645689);
        Class<? extends Object> term21666 = Class.forName((String) "java.io.File$PathStatus");
        Field term21665 = ((Class) term21666).getDeclaredField((String) "CHECKED");
        ((Field) term21665).setAccessible(true);
        Object enum16 = ((Field) term21665).get((Object) null);
        ArrayList term21497 = new ArrayList();
        ((ArrayList) term21497).add("ePFnljQSHU");
        ((ArrayList) term21497).add("wedLWAuOOY");
        ((ArrayList) term21497).add("oZDNpnQlCv");
        ((ArrayList) term21497).add("NdPeQAHWKN");
        ((ArrayList) term21497).add("giGQTpcQuV");
        ((ArrayList) term21497).add("IWCccrYFQd");
        term21335 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        Object term21424 = newInstance(Class.forName("java.io.File"));
        setField(term21335, term21335.getClass(), "id", term21336);
        setField(term21335, term21335.getClass(), "email", "rWOKjAUIvS");
        setField(term21335, term21335.getClass(), "password", "IcpfsIGlDf");
        setField(term21335, term21335.getClass(), "username", "xCfGcRdHTK");
        setField(term21335, term21335.getClass(), "power", "KKHQCvKTvF");
        setField(term21335, term21335.getClass(), "nickname", "XBhNIIxiNP");
        setField(term21335, term21335.getClass(), "sex", "JljyXnwkuC");
        setField(term21335, term21335.getClass(), "age", term21410);
        setField(term21335, term21335.getClass(), "phone", "XLOxkLyvMY");
        setField(term21424, term21424.getClass(), "path", "pjUyKHjjKH");
        setField(term21424, term21424.getClass(), "status", enum16);
        setIntField(term21424, term21424.getClass(), "prefixLength", -1685132342);
        setField(term21424, term21424.getClass(), "filePath", null);
        setField(term21335, term21335.getClass(), "facePic", term21424);
        setField(term21335, term21335.getClass(), "faceUrl", "JApuaiAykc");
        setField(term21335, term21335.getClass(), "headUrl", "NJWFosJfXl");
        setField(term21335, term21335.getClass(), "introduce", "JraVClZLWB");
        setField(term21335, term21335.getClass(), "ip", "PxscjEhxGk");
        setField(term21335, term21335.getClass(), "partnames", term21497);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zpkdYKWkCa";
        callMethod(klass, "setEmail", argTypes, term21335, args);
    }

};


