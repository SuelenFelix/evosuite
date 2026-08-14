package com.usantatecla.ustumlserver.domain.services.parsers;

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
import static com.usantatecla.ustumlserver.domain.services.parsers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class PackageParser_copy_12755479423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1266;
     Object term1357;

    public PackageParser_copy_12755479423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1267 = new ArrayList();
        ((ArrayList) term1267).add((Object)null);
        ((ArrayList) term1267).add((Object)null);
        ((ArrayList) term1267).add((Object)null);
        ((ArrayList) term1267).add((Object)null);
        ((ArrayList) term1267).add((Object)null);
        ((ArrayList) term1267).add((Object)null);
        Class<? extends Object> term1435 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term1434 = ((Class) term1435).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term1434).setAccessible(true);
        Object enum3 = ((Field) term1434).get((Object) null);
        ArrayList term1313 = new ArrayList();
        ArrayList term1341 = new ArrayList();
        ((ArrayList) term1341).add((Object)null);
        ((ArrayList) term1341).add((Object)null);
        term1266 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.PackageParser"));
        Object term1271 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term1266, term1266.getClass(), "members", term1267);
        setField(term1271, term1271.getClass(), "email", "aJlieCFVtF");
        setField(term1271, term1271.getClass(), "password", "ZiaGIbnzTs");
        setField(term1271, term1271.getClass(), "role", enum3);
        setField(term1271, term1271.getClass(), "projects", term1313);
        setField(term1271, term1271.getClass(), "id", "tbcdzjIfER");
        setField(term1271, term1271.getClass(), "name", "HyxfbSQYBe");
        setField(term1271, term1271.getClass(), "relations", term1341);
        setField(term1266, term1266.getClass(), "account", term1271);
        setField(term1266, term1266.getClass(), "name", "pCTimMblYc");
        ArrayList term1382 = new ArrayList();
        ArrayList term1410 = new ArrayList();
        ((ArrayList) term1410).add((Object)null);
        ((ArrayList) term1410).add((Object)null);
        ((ArrayList) term1410).add((Object)null);
        ((ArrayList) term1410).add((Object)null);
        ((ArrayList) term1410).add((Object)null);
        ((ArrayList) term1410).add((Object)null);
        term1357 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term1357, term1357.getClass(), "email", "hNxWaHcfhY");
        setField(term1357, term1357.getClass(), "password", "RkybSrpybU");
        setField(term1357, term1357.getClass(), "role", enum3);
        setField(term1357, term1357.getClass(), "projects", term1382);
        setField(term1357, term1357.getClass(), "id", "xOEqzGAmDU");
        setField(term1357, term1357.getClass(), "name", "eZFUvlxvGV");
        setField(term1357, term1357.getClass(), "relations", term1410);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.PackageParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Object[] args = new Object[1];
        args[0] = term1357;
        callMethod(klass, "copy", argTypes, term1266, args);
    }

};


