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

public class PackageEntity_toProject_612370572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103149;

    public PackageEntity_toProject_612370572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term103150 = new ArrayList();
        ((ArrayList) term103150).add((Object)null);
        ((ArrayList) term103150).add((Object)null);
        ((ArrayList) term103150).add((Object)null);
        ((ArrayList) term103150).add((Object)null);
        ((ArrayList) term103150).add((Object)null);
        ((ArrayList) term103150).add((Object)null);
        ((ArrayList) term103150).add((Object)null);
        ((ArrayList) term103150).add((Object)null);
        ArrayList term103178 = new ArrayList();
        ((ArrayList) term103178).add((Object)null);
        ((ArrayList) term103178).add((Object)null);
        ((ArrayList) term103178).add((Object)null);
        ((ArrayList) term103178).add((Object)null);
        ((ArrayList) term103178).add((Object)null);
        ((ArrayList) term103178).add((Object)null);
        ((ArrayList) term103178).add((Object)null);
        ((ArrayList) term103178).add((Object)null);
        ((ArrayList) term103178).add((Object)null);
        term103149 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.PackageEntity"));
        setField(term103149, term103149.getClass(), "memberEntities", term103150);
        setField(term103149, term103149.getClass(), "id", "aUJLXfcWME");
        setField(term103149, term103149.getClass(), "name", "ixeIpUaVug");
        setField(term103149, term103149.getClass(), "relationEntities", term103178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.PackageEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toProject", argTypes, term103149, args);
    }

};


