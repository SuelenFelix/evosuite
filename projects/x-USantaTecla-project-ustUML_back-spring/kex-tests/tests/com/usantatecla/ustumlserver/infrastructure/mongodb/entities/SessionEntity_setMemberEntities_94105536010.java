package com.usantatecla.ustumlserver.infrastructure.mongodb.entities;

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
import static com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class SessionEntity_setMemberEntities_94105536010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72676;
     Object term72705;

    public SessionEntity_setMemberEntities_94105536010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term72701 = new ArrayList();
        ((ArrayList) term72701).add((Object)null);
        ((ArrayList) term72701).add((Object)null);
        ((ArrayList) term72701).add((Object)null);
        ((ArrayList) term72701).add((Object)null);
        ((ArrayList) term72701).add((Object)null);
        ((ArrayList) term72701).add((Object)null);
        ((ArrayList) term72701).add((Object)null);
        ((ArrayList) term72701).add((Object)null);
        ((ArrayList) term72701).add((Object)null);
        term72676 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.SessionEntity"));
        setField(term72676, term72676.getClass(), "id", "iAIRLRjFkP");
        setField(term72676, term72676.getClass(), "sessionId", "cdXvvxXVTz");
        setField(term72676, term72676.getClass(), "memberEntities", term72701);
        term72705 = new LinkedList();
        ((LinkedList) term72705).add((Object)null);
        ((LinkedList) term72705).add((Object)null);
        ((LinkedList) term72705).add((Object)null);
        ((LinkedList) term72705).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.SessionEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term72705;
        callMethod(klass, "setMemberEntities", argTypes, term72676, args);
    }

};


