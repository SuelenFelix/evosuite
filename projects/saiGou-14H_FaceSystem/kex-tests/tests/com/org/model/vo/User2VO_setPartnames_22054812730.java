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
import java.util.LinkedList;

public class User2VO_setPartnames_22054812730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28896;
     Object term29134;

    public User2VO_setPartnames_22054812730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term28897 = new Integer(-1972033388);
        Integer term28971 = new Integer(-1005024758);
        Class<? extends Object> term29244 = Class.forName((String) "java.io.File$PathStatus");
        Field term29243 = ((Class) term29244).getDeclaredField((String) "CHECKED");
        ((Field) term29243).setAccessible(true);
        Object enum30 = ((Field) term29243).get((Object) null);
        ArrayList term29058 = new ArrayList();
        ((ArrayList) term29058).add("wcVhMnVVMH");
        ((ArrayList) term29058).add("EUWyNZxbWR");
        ((ArrayList) term29058).add("TaoriKlxVP");
        ((ArrayList) term29058).add("CDKCMwdzTR");
        ((ArrayList) term29058).add("ehviwWrUip");
        ((ArrayList) term29058).add("LNsNBvvYgQ");
        term28896 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        Object term28985 = newInstance(Class.forName("java.io.File"));
        setField(term28896, term28896.getClass(), "id", term28897);
        setField(term28896, term28896.getClass(), "email", "eEXpzGjDgl");
        setField(term28896, term28896.getClass(), "password", "vGLuBgtHzA");
        setField(term28896, term28896.getClass(), "username", "iOiyjODkqg");
        setField(term28896, term28896.getClass(), "power", "pgpXJLwACM");
        setField(term28896, term28896.getClass(), "nickname", "JgrZdrciib");
        setField(term28896, term28896.getClass(), "sex", "mjPUAINebK");
        setField(term28896, term28896.getClass(), "age", term28971);
        setField(term28896, term28896.getClass(), "phone", "QdBJxwpNcu");
        setField(term28985, term28985.getClass(), "path", "jdwewuUtBW");
        setField(term28985, term28985.getClass(), "status", enum30);
        setIntField(term28985, term28985.getClass(), "prefixLength", -203030934);
        setField(term28985, term28985.getClass(), "filePath", null);
        setField(term28896, term28896.getClass(), "facePic", term28985);
        setField(term28896, term28896.getClass(), "faceUrl", "CXekzSdVWc");
        setField(term28896, term28896.getClass(), "headUrl", "heJZxFqAJC");
        setField(term28896, term28896.getClass(), "introduce", "DGNjGJtXwQ");
        setField(term28896, term28896.getClass(), "ip", "BIFQrvbqSd");
        setField(term28896, term28896.getClass(), "partnames", term29058);
        term29134 = new LinkedList();
        ((LinkedList) term29134).add("VGKsvldNNB");
        ((LinkedList) term29134).add("pfyJIgGkiH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term29134;
        callMethod(klass, "setPartnames", argTypes, term28896, args);
    }

};


