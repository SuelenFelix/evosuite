package com.lyubenblagoev.postfixrest.entity;

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
import static com.lyubenblagoev.postfixrest.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Long;

public class User_getRoles_30371974710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4312;

    public User_getRoles_30371974710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4343 = new ArrayList();
        ((ArrayList) term4343).add((Object)null);
        ((ArrayList) term4343).add((Object)null);
        ((ArrayList) term4343).add((Object)null);
        ((ArrayList) term4343).add((Object)null);
        ((ArrayList) term4343).add((Object)null);
        ((ArrayList) term4343).add((Object)null);
        ((ArrayList) term4343).add((Object)null);
        ((ArrayList) term4343).add((Object)null);
        ((ArrayList) term4343).add((Object)null);
        Long term4346 = new Long(-5903549884298836343L);
        Object term4341 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        Object term4349 = newInstance(Class.forName("java.util.Date"));
        Object term4351 = newInstance(Class.forName("java.util.Date"));
        setField(term4341, term4341.getClass(), "name", "");
        setField(term4341, term4341.getClass(), "users", term4343);
        setField(term4341, term4341.getClass(), "id", term4346);
        setBooleanField(term4341, term4341.getClass(), "enabled", true);
        setLongField(term4349, term4349.getClass(), "fastTime", 1289595945693L);
        setField(term4349, term4349.getClass(), "cdate", null);
        setField(term4341, term4341.getClass(), "created", term4349);
        setLongField(term4351, term4351.getClass(), "fastTime", 1403996270153L);
        setField(term4351, term4351.getClass(), "cdate", null);
        setField(term4341, term4341.getClass(), "updated", term4351);
        ArrayList term4355 = new ArrayList();
        ((ArrayList) term4355).add((Object)null);
        ((ArrayList) term4355).add((Object)null);
        ((ArrayList) term4355).add((Object)null);
        Long term4358 = new Long(5818741986224130131L);
        Object term4353 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        Object term4361 = newInstance(Class.forName("java.util.Date"));
        Object term4363 = newInstance(Class.forName("java.util.Date"));
        setField(term4353, term4353.getClass(), "name", "");
        setField(term4353, term4353.getClass(), "users", term4355);
        setField(term4353, term4353.getClass(), "id", term4358);
        setBooleanField(term4353, term4353.getClass(), "enabled", true);
        setLongField(term4361, term4361.getClass(), "fastTime", 1607535156470L);
        setField(term4361, term4361.getClass(), "cdate", null);
        setField(term4353, term4353.getClass(), "created", term4361);
        setLongField(term4363, term4363.getClass(), "fastTime", 1817715247718L);
        setField(term4363, term4363.getClass(), "cdate", null);
        setField(term4353, term4353.getClass(), "updated", term4363);
        ArrayList term4339 = new ArrayList();
        ((ArrayList) term4339).add(term4341);
        ((ArrayList) term4339).add(term4353);
        ((ArrayList) term4339).add(term4353);
        Long term4367 = new Long(-3058119213533262883L);
        term4312 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.User"));
        Object term4337 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term4370 = newInstance(Class.forName("java.util.Date"));
        Object term4372 = newInstance(Class.forName("java.util.Date"));
        setField(term4312, term4312.getClass(), "email", "cDOXXottZh");
        setField(term4312, term4312.getClass(), "password", "rfqJDkDppz");
        setIntField(term4337, term4337.getClass(), "modCount", 0);
        setField(term4312, term4312.getClass(), "devices", term4337);
        setField(term4312, term4312.getClass(), "roles", term4339);
        setField(term4312, term4312.getClass(), "id", term4367);
        setBooleanField(term4312, term4312.getClass(), "enabled", false);
        setLongField(term4370, term4370.getClass(), "fastTime", 1686468584013L);
        setField(term4370, term4370.getClass(), "cdate", null);
        setField(term4312, term4312.getClass(), "created", term4370);
        setLongField(term4372, term4372.getClass(), "fastTime", 1817597555760L);
        setField(term4372, term4372.getClass(), "cdate", null);
        setField(term4312, term4312.getClass(), "updated", term4372);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoles", argTypes, term4312, args);
    }

};


