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

public class UseCaseParser_createUseCase_10712505812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term821;

    public UseCaseParser_createUseCase_10712505812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term929 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term928 = ((Class) term929).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term928).setAccessible(true);
        Object enum2 = ((Field) term928).get((Object) null);
        ArrayList term864 = new ArrayList();
        ArrayList term892 = new ArrayList();
        ((ArrayList) term892).add((Object)null);
        ((ArrayList) term892).add((Object)null);
        ((ArrayList) term892).add((Object)null);
        term821 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.useCaseDiagram.UseCaseParser"));
        Object term822 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term822, term822.getClass(), "email", "RMFIsYGgne");
        setField(term822, term822.getClass(), "password", "NRdvgJlhkX");
        setField(term822, term822.getClass(), "role", enum2);
        setField(term822, term822.getClass(), "projects", term864);
        setField(term822, term822.getClass(), "id", "uuaPigETmJ");
        setField(term822, term822.getClass(), "name", "MxlszYVzRf");
        setField(term822, term822.getClass(), "relations", term892);
        setField(term821, term821.getClass(), "account", term822);
        setField(term821, term821.getClass(), "name", "LQFpaHEwXR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.useCaseDiagram.UseCaseParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createUseCase", argTypes, term821, args);
    }

};


