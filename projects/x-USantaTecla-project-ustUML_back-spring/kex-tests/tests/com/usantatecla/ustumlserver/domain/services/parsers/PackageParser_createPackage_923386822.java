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

public class PackageParser_createPackage_923386822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term849;

    public PackageParser_createPackage_923386822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term850 = new ArrayList();
        ((ArrayList) term850).add((Object)null);
        ((ArrayList) term850).add((Object)null);
        ((ArrayList) term850).add((Object)null);
        ((ArrayList) term850).add((Object)null);
        Class<? extends Object> term961 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term960 = ((Class) term961).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term960).setAccessible(true);
        Object enum2 = ((Field) term960).get((Object) null);
        ArrayList term896 = new ArrayList();
        ArrayList term924 = new ArrayList();
        ((ArrayList) term924).add((Object)null);
        term849 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.PackageParser"));
        Object term854 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term849, term849.getClass(), "members", term850);
        setField(term854, term854.getClass(), "email", "NRdvgJlhkX");
        setField(term854, term854.getClass(), "password", "uuaPigETmJ");
        setField(term854, term854.getClass(), "role", enum2);
        setField(term854, term854.getClass(), "projects", term896);
        setField(term854, term854.getClass(), "id", "MxlszYVzRf");
        setField(term854, term854.getClass(), "name", "LQFpaHEwXR");
        setField(term854, term854.getClass(), "relations", term924);
        setField(term849, term849.getClass(), "account", term854);
        setField(term849, term849.getClass(), "name", "oVcInYnLWB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.PackageParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createPackage", argTypes, term849, args);
    }

};


