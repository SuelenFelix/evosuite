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

public class ActorParser_copy_15816948663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2963;
     Object term3050;

    public ActorParser_copy_15816948663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3128 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term3127 = ((Class) term3128).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term3127).setAccessible(true);
        Object enum7 = ((Field) term3127).get((Object) null);
        ArrayList term3006 = new ArrayList();
        ArrayList term3034 = new ArrayList();
        ((ArrayList) term3034).add((Object)null);
        ((ArrayList) term3034).add((Object)null);
        ((ArrayList) term3034).add((Object)null);
        ((ArrayList) term3034).add((Object)null);
        ((ArrayList) term3034).add((Object)null);
        ((ArrayList) term3034).add((Object)null);
        ((ArrayList) term3034).add((Object)null);
        term2963 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.useCaseDiagram.ActorParser"));
        Object term2964 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term2964, term2964.getClass(), "email", "IDCWpPLRkE");
        setField(term2964, term2964.getClass(), "password", "nyiiPDVjAc");
        setField(term2964, term2964.getClass(), "role", enum7);
        setField(term2964, term2964.getClass(), "projects", term3006);
        setField(term2964, term2964.getClass(), "id", "aKnKipADSo");
        setField(term2964, term2964.getClass(), "name", "wSQxaModmm");
        setField(term2964, term2964.getClass(), "relations", term3034);
        setField(term2963, term2963.getClass(), "account", term2964);
        setField(term2963, term2963.getClass(), "name", "UlajhuVLaP");
        ArrayList term3075 = new ArrayList();
        ArrayList term3103 = new ArrayList();
        ((ArrayList) term3103).add((Object)null);
        term3050 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term3050, term3050.getClass(), "email", "gGSMzuGICf");
        setField(term3050, term3050.getClass(), "password", "hxCBltsObl");
        setField(term3050, term3050.getClass(), "role", enum7);
        setField(term3050, term3050.getClass(), "projects", term3075);
        setField(term3050, term3050.getClass(), "id", "BndsHwAFMv");
        setField(term3050, term3050.getClass(), "name", "GzFkzHGYFt");
        setField(term3050, term3050.getClass(), "relations", term3103);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.useCaseDiagram.ActorParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Object[] args = new Object[1];
        args[0] = term3050;
        callMethod(klass, "copy", argTypes, term2963, args);
    }

};


