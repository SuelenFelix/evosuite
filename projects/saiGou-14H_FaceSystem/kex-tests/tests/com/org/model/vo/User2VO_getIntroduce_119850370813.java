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

public class User2VO_getIntroduce_119850370813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19111;

    public User2VO_getIntroduce_119850370813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term19112 = new Integer(-1317044799);
        Integer term19186 = new Integer(-1428063820);
        Class<? extends Object> term19454 = Class.forName((String) "java.io.File$PathStatus");
        Field term19453 = ((Class) term19454).getDeclaredField((String) "INVALID");
        ((Field) term19453).setAccessible(true);
        Object enum12 = ((Field) term19453).get((Object) null);
        ArrayList term19273 = new ArrayList();
        ((ArrayList) term19273).add("qTiIgMQXbW");
        ((ArrayList) term19273).add("rARmHDyRHE");
        ((ArrayList) term19273).add("bvybTJUNMY");
        ((ArrayList) term19273).add("MoGyMoOkMi");
        ((ArrayList) term19273).add("qDEvNqJeGg");
        ((ArrayList) term19273).add("fUxWNxirZc");
        ((ArrayList) term19273).add("vHkrNjGRyv");
        ((ArrayList) term19273).add("PxGAOnzJzj");
        term19111 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        Object term19200 = newInstance(Class.forName("java.io.File"));
        setField(term19111, term19111.getClass(), "id", term19112);
        setField(term19111, term19111.getClass(), "email", "BLPwYfxwnm");
        setField(term19111, term19111.getClass(), "password", "zItHVuBBzy");
        setField(term19111, term19111.getClass(), "username", "pQcdIREjlp");
        setField(term19111, term19111.getClass(), "power", "WjUrdNMIOj");
        setField(term19111, term19111.getClass(), "nickname", "aQUpwHjYvS");
        setField(term19111, term19111.getClass(), "sex", "lvcTLkVhAN");
        setField(term19111, term19111.getClass(), "age", term19186);
        setField(term19111, term19111.getClass(), "phone", "BJJuVqxXjT");
        setField(term19200, term19200.getClass(), "path", "IvxbsFCczM");
        setField(term19200, term19200.getClass(), "status", enum12);
        setIntField(term19200, term19200.getClass(), "prefixLength", 1134449235);
        setField(term19200, term19200.getClass(), "filePath", null);
        setField(term19111, term19111.getClass(), "facePic", term19200);
        setField(term19111, term19111.getClass(), "faceUrl", "GkAaLUoaoL");
        setField(term19111, term19111.getClass(), "headUrl", "VSmPzUiFzd");
        setField(term19111, term19111.getClass(), "introduce", "bLpZNCaWDB");
        setField(term19111, term19111.getClass(), "ip", "knmwCEeMTY");
        setField(term19111, term19111.getClass(), "partnames", term19273);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIntroduce", argTypes, term19111, args);
    }

};


