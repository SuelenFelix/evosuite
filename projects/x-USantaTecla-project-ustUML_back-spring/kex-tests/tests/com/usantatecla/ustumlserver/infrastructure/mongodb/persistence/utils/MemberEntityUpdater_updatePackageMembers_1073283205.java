package com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.utils;

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
import static com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class MemberEntityUpdater_updatePackageMembers_1073283205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10177;
     Object term10210;

    public MemberEntityUpdater_updatePackageMembers_1073283205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10178 = new ArrayList();
        ((ArrayList) term10178).add((Object)null);
        ((ArrayList) term10178).add((Object)null);
        ((ArrayList) term10178).add((Object)null);
        ((ArrayList) term10178).add((Object)null);
        ((ArrayList) term10178).add((Object)null);
        ArrayList term10206 = new ArrayList();
        ((ArrayList) term10206).add((Object)null);
        ((ArrayList) term10206).add((Object)null);
        ((ArrayList) term10206).add((Object)null);
        ((ArrayList) term10206).add((Object)null);
        ((ArrayList) term10206).add((Object)null);
        ((ArrayList) term10206).add((Object)null);
        ((ArrayList) term10206).add((Object)null);
        ((ArrayList) term10206).add((Object)null);
        ((ArrayList) term10206).add((Object)null);
        term10177 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.PackageEntity"));
        setField(term10177, term10177.getClass(), "memberEntities", term10178);
        setField(term10177, term10177.getClass(), "id", "WxYUTuqmIq");
        setField(term10177, term10177.getClass(), "name", "OeQLvhVERT");
        setField(term10177, term10177.getClass(), "relationEntities", term10206);
        term10210 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.utils.MemberEntityUpdater");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.PackageEntity");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term10177;
        args[1] = term10210;
        callMethod(klass, "updatePackageMembers", argTypes, null, args);
    }

};


