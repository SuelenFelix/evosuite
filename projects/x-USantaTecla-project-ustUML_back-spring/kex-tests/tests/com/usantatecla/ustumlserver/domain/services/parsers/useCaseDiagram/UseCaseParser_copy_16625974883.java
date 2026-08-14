package com.usantatecla.ustumlserver.domain.services.parsers.useCaseDiagram;

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
import static com.usantatecla.ustumlserver.domain.services.parsers.useCaseDiagram.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class UseCaseParser_copy_16625974883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1234;
     Object term1321;

    public UseCaseParser_copy_16625974883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1399 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term1398 = ((Class) term1399).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term1398).setAccessible(true);
        Object enum3 = ((Field) term1398).get((Object) null);
        ArrayList term1277 = new ArrayList();
        ArrayList term1305 = new ArrayList();
        ((ArrayList) term1305).add((Object)null);
        ((ArrayList) term1305).add((Object)null);
        ((ArrayList) term1305).add((Object)null);
        ((ArrayList) term1305).add((Object)null);
        term1234 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.useCaseDiagram.UseCaseParser"));
        Object term1235 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term1235, term1235.getClass(), "email", "oVcInYnLWB");
        setField(term1235, term1235.getClass(), "password", "aJlieCFVtF");
        setField(term1235, term1235.getClass(), "role", enum3);
        setField(term1235, term1235.getClass(), "projects", term1277);
        setField(term1235, term1235.getClass(), "id", "ZiaGIbnzTs");
        setField(term1235, term1235.getClass(), "name", "tbcdzjIfER");
        setField(term1235, term1235.getClass(), "relations", term1305);
        setField(term1234, term1234.getClass(), "account", term1235);
        setField(term1234, term1234.getClass(), "name", "HyxfbSQYBe");
        ArrayList term1346 = new ArrayList();
        ArrayList term1374 = new ArrayList();
        ((ArrayList) term1374).add((Object)null);
        term1321 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term1321, term1321.getClass(), "email", "pCTimMblYc");
        setField(term1321, term1321.getClass(), "password", "hNxWaHcfhY");
        setField(term1321, term1321.getClass(), "role", enum3);
        setField(term1321, term1321.getClass(), "projects", term1346);
        setField(term1321, term1321.getClass(), "id", "RkybSrpybU");
        setField(term1321, term1321.getClass(), "name", "xOEqzGAmDU");
        setField(term1321, term1321.getClass(), "relations", term1374);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.useCaseDiagram.UseCaseParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Object[] args = new Object[1];
        args[0] = term1321;
        callMethod(klass, "copy", argTypes, term1234, args);
    }

};


