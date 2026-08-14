package com.usantatecla.ustumlserver.domain.model;

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
import static com.usantatecla.ustumlserver.domain.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Account_AccountBuilderImpl_build_5683748672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73517;

    public Account_AccountBuilderImpl_build_5683748672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term73684 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term73683 = ((Class) term73684).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term73683).setAccessible(true);
        Object enum176 = ((Field) term73683).get((Object) null);
        ArrayList term73562 = new ArrayList();
        ((ArrayList) term73562).add((Object)null);
        ((ArrayList) term73562).add((Object)null);
        ArrayList term73567 = new ArrayList();
        ((ArrayList) term73567).add((Object)null);
        ((ArrayList) term73567).add((Object)null);
        ((ArrayList) term73567).add((Object)null);
        ((ArrayList) term73567).add((Object)null);
        ((ArrayList) term73567).add((Object)null);
        ((ArrayList) term73567).add((Object)null);
        ((ArrayList) term73567).add((Object)null);
        ((ArrayList) term73567).add((Object)null);
        ((ArrayList) term73567).add((Object)null);
        Object term73561 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Project"));
        setField(term73561, term73561.getClass(), "members", term73562);
        setField(term73561, term73561.getClass(), "id", "");
        setField(term73561, term73561.getClass(), "name", "");
        setField(term73561, term73561.getClass(), "relations", term73567);
        ArrayList term73571 = new ArrayList();
        ((ArrayList) term73571).add((Object)null);
        ((ArrayList) term73571).add((Object)null);
        ((ArrayList) term73571).add((Object)null);
        ((ArrayList) term73571).add((Object)null);
        ((ArrayList) term73571).add((Object)null);
        ((ArrayList) term73571).add((Object)null);
        ((ArrayList) term73571).add((Object)null);
        ((ArrayList) term73571).add((Object)null);
        ArrayList term73576 = new ArrayList();
        ((ArrayList) term73576).add((Object)null);
        ((ArrayList) term73576).add((Object)null);
        ((ArrayList) term73576).add((Object)null);
        ((ArrayList) term73576).add((Object)null);
        ((ArrayList) term73576).add((Object)null);
        ((ArrayList) term73576).add((Object)null);
        Object term73570 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Project"));
        setField(term73570, term73570.getClass(), "members", term73571);
        setField(term73570, term73570.getClass(), "id", "");
        setField(term73570, term73570.getClass(), "name", "");
        setField(term73570, term73570.getClass(), "relations", term73576);
        ArrayList term73580 = new ArrayList();
        ((ArrayList) term73580).add((Object)null);
        ((ArrayList) term73580).add((Object)null);
        ((ArrayList) term73580).add((Object)null);
        ((ArrayList) term73580).add((Object)null);
        ((ArrayList) term73580).add((Object)null);
        ((ArrayList) term73580).add((Object)null);
        ((ArrayList) term73580).add((Object)null);
        ((ArrayList) term73580).add((Object)null);
        ArrayList term73585 = new ArrayList();
        ((ArrayList) term73585).add((Object)null);
        ((ArrayList) term73585).add((Object)null);
        ((ArrayList) term73585).add((Object)null);
        ((ArrayList) term73585).add((Object)null);
        Object term73579 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Project"));
        setField(term73579, term73579.getClass(), "members", term73580);
        setField(term73579, term73579.getClass(), "id", "");
        setField(term73579, term73579.getClass(), "name", "");
        setField(term73579, term73579.getClass(), "relations", term73585);
        ArrayList term73589 = new ArrayList();
        ((ArrayList) term73589).add((Object)null);
        ((ArrayList) term73589).add((Object)null);
        ((ArrayList) term73589).add((Object)null);
        ArrayList term73594 = new ArrayList();
        ((ArrayList) term73594).add((Object)null);
        ((ArrayList) term73594).add((Object)null);
        ((ArrayList) term73594).add((Object)null);
        ((ArrayList) term73594).add((Object)null);
        Object term73588 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Project"));
        setField(term73588, term73588.getClass(), "members", term73589);
        setField(term73588, term73588.getClass(), "id", "");
        setField(term73588, term73588.getClass(), "name", "");
        setField(term73588, term73588.getClass(), "relations", term73594);
        ArrayList term73598 = new ArrayList();
        ArrayList term73603 = new ArrayList();
        Object term73597 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Project"));
        setField(term73597, term73597.getClass(), "members", term73598);
        setField(term73597, term73597.getClass(), "id", "");
        setField(term73597, term73597.getClass(), "name", "");
        setField(term73597, term73597.getClass(), "relations", term73603);
        ArrayList term73607 = new ArrayList();
        ((ArrayList) term73607).add((Object)null);
        ((ArrayList) term73607).add((Object)null);
        ((ArrayList) term73607).add((Object)null);
        ((ArrayList) term73607).add((Object)null);
        ((ArrayList) term73607).add((Object)null);
        ((ArrayList) term73607).add((Object)null);
        ArrayList term73612 = new ArrayList();
        ((ArrayList) term73612).add((Object)null);
        ((ArrayList) term73612).add((Object)null);
        Object term73606 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Project"));
        setField(term73606, term73606.getClass(), "members", term73607);
        setField(term73606, term73606.getClass(), "id", "");
        setField(term73606, term73606.getClass(), "name", "");
        setField(term73606, term73606.getClass(), "relations", term73612);
        ArrayList term73616 = new ArrayList();
        ((ArrayList) term73616).add((Object)null);
        ArrayList term73621 = new ArrayList();
        Object term73615 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Project"));
        setField(term73615, term73615.getClass(), "members", term73616);
        setField(term73615, term73615.getClass(), "id", "");
        setField(term73615, term73615.getClass(), "name", "");
        setField(term73615, term73615.getClass(), "relations", term73621);
        ArrayList term73625 = new ArrayList();
        ((ArrayList) term73625).add((Object)null);
        ((ArrayList) term73625).add((Object)null);
        ((ArrayList) term73625).add((Object)null);
        ((ArrayList) term73625).add((Object)null);
        ((ArrayList) term73625).add((Object)null);
        ((ArrayList) term73625).add((Object)null);
        ((ArrayList) term73625).add((Object)null);
        ((ArrayList) term73625).add((Object)null);
        ((ArrayList) term73625).add((Object)null);
        ArrayList term73630 = new ArrayList();
        ((ArrayList) term73630).add((Object)null);
        ((ArrayList) term73630).add((Object)null);
        Object term73624 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Project"));
        setField(term73624, term73624.getClass(), "members", term73625);
        setField(term73624, term73624.getClass(), "id", "");
        setField(term73624, term73624.getClass(), "name", "");
        setField(term73624, term73624.getClass(), "relations", term73630);
        ArrayList term73559 = new ArrayList();
        ((ArrayList) term73559).add(term73561);
        ((ArrayList) term73559).add(term73570);
        ((ArrayList) term73559).add(term73579);
        ((ArrayList) term73559).add(term73588);
        ((ArrayList) term73559).add(term73597);
        ((ArrayList) term73559).add(term73606);
        ((ArrayList) term73559).add(term73615);
        ((ArrayList) term73559).add(term73624);
        ArrayList term73659 = new ArrayList();
        ((ArrayList) term73659).add((Object)null);
        ((ArrayList) term73659).add((Object)null);
        ((ArrayList) term73659).add((Object)null);
        ((ArrayList) term73659).add((Object)null);
        ((ArrayList) term73659).add((Object)null);
        term73517 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account$AccountBuilderImpl"));
        setField(term73517, term73517.getClass(), "email", "zzeaToyLmI");
        setField(term73517, term73517.getClass(), "password", "sKYWhmRMLx");
        setField(term73517, term73517.getClass(), "role", enum176);
        setField(term73517, term73517.getClass(), "projects", term73559);
        setField(term73517, term73517.getClass(), "id", "STofGrqXqL");
        setField(term73517, term73517.getClass(), "name", "IoRhBfdSuN");
        setField(term73517, term73517.getClass(), "relations", term73659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Account$AccountBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term73517, args);
    }

};


