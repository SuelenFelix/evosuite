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

public class SessionEntity_delete_10760352862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72289;

    public SessionEntity_delete_10760352862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term72314 = new ArrayList();
        ((ArrayList) term72314).add((Object)null);
        ((ArrayList) term72314).add((Object)null);
        ((ArrayList) term72314).add((Object)null);
        ((ArrayList) term72314).add((Object)null);
        term72289 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.SessionEntity"));
        setField(term72289, term72289.getClass(), "id", "DLFXidLbuT");
        setField(term72289, term72289.getClass(), "sessionId", "FjkxfTXGIH");
        setField(term72289, term72289.getClass(), "memberEntities", term72314);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.SessionEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.MemberEntity");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "delete", argTypes, term72289, args);
    }

};


