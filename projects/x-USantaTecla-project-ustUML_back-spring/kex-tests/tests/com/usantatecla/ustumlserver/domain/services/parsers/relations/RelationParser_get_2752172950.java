package com.usantatecla.ustumlserver.domain.services.parsers.relations;

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
import static com.usantatecla.ustumlserver.domain.services.parsers.relations.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class RelationParser_get_2752172950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public RelationParser_get_2752172950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.relations.RelationParser"));
        Class<? extends Object> term114 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term113 = ((Class) term114).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term113).setAccessible(true);
        Object enum0 = ((Field) term113).get((Object) null);
        ArrayList term44 = new ArrayList();
        ArrayList term72 = new ArrayList();
        ((ArrayList) term72).add((Object)null);
        ((ArrayList) term72).add((Object)null);
        ((ArrayList) term72).add((Object)null);
        ((ArrayList) term72).add((Object)null);
        ((ArrayList) term72).add((Object)null);
        term2 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term2, term2.getClass(), "email", "PAEBtnZtTD");
        setField(term2, term2.getClass(), "password", "sjlJAEtRrb");
        setField(term2, term2.getClass(), "role", enum0);
        setField(term2, term2.getClass(), "projects", term44);
        setField(term2, term2.getClass(), "id", "MuLcgQHgqz");
        setField(term2, term2.getClass(), "name", "xxtlPwDYFs");
        setField(term2, term2.getClass(), "relations", term72);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.relations.RelationParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        argTypes[1] = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.Command");
        Object[] args = new Object[2];
        args[0] = term2;
        args[1] = null;
        callMethod(klass, "get", argTypes, term1, args);
    }

};


