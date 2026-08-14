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

public class PackageParser_get_17186396991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term432;

    public PackageParser_get_17186396991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term433 = new ArrayList();
        ((ArrayList) term433).add((Object)null);
        ((ArrayList) term433).add((Object)null);
        ((ArrayList) term433).add((Object)null);
        ((ArrayList) term433).add((Object)null);
        Class<? extends Object> term544 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term543 = ((Class) term544).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term543).setAccessible(true);
        Object enum1 = ((Field) term543).get((Object) null);
        ArrayList term479 = new ArrayList();
        ArrayList term507 = new ArrayList();
        ((ArrayList) term507).add((Object)null);
        ((ArrayList) term507).add((Object)null);
        ((ArrayList) term507).add((Object)null);
        term432 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.PackageParser"));
        Object term437 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term432, term432.getClass(), "members", term433);
        setField(term437, term437.getClass(), "email", "EGtDIRbSSb");
        setField(term437, term437.getClass(), "password", "SzjVpOQTyS");
        setField(term437, term437.getClass(), "role", enum1);
        setField(term437, term437.getClass(), "projects", term479);
        setField(term437, term437.getClass(), "id", "MjGYSRKTNF");
        setField(term437, term437.getClass(), "name", "hRNSzYYIrc");
        setField(term437, term437.getClass(), "relations", term507);
        setField(term432, term432.getClass(), "account", term437);
        setField(term432, term432.getClass(), "name", "RMFIsYGgne");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.PackageParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.Command");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "get", argTypes, term432, args);
    }

};


