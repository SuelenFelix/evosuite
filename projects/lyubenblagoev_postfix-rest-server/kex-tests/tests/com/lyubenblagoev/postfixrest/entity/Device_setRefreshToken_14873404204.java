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

public class Device_setRefreshToken_14873404204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1171;

    public Device_setRefreshToken_14873404204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1202 = new Long(-8876856890348836498L);
        Object term1201 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term1201, term1201.getClass(), "name", null);
        setField(term1201, term1201.getClass(), "users", null);
        setField(term1201, term1201.getClass(), "id", term1202);
        setBooleanField(term1201, term1201.getClass(), "enabled", false);
        setField(term1201, term1201.getClass(), "created", null);
        setField(term1201, term1201.getClass(), "updated", null);
        Long term1206 = new Long(4474998035090263139L);
        Object term1205 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term1205, term1205.getClass(), "name", null);
        setField(term1205, term1205.getClass(), "users", null);
        setField(term1205, term1205.getClass(), "id", term1206);
        setBooleanField(term1205, term1205.getClass(), "enabled", true);
        setField(term1205, term1205.getClass(), "created", null);
        setField(term1205, term1205.getClass(), "updated", null);
        Object term1209 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term1209, term1209.getClass(), "name", null);
        setField(term1209, term1209.getClass(), "users", null);
        setField(term1209, term1209.getClass(), "id", null);
        setBooleanField(term1209, term1209.getClass(), "enabled", false);
        setField(term1209, term1209.getClass(), "created", null);
        setField(term1209, term1209.getClass(), "updated", null);
        Object term1211 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term1211, term1211.getClass(), "name", null);
        setField(term1211, term1211.getClass(), "users", null);
        setField(term1211, term1211.getClass(), "id", null);
        setBooleanField(term1211, term1211.getClass(), "enabled", false);
        setField(term1211, term1211.getClass(), "created", null);
        setField(term1211, term1211.getClass(), "updated", null);
        Object term1213 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term1213, term1213.getClass(), "name", null);
        setField(term1213, term1213.getClass(), "users", null);
        setField(term1213, term1213.getClass(), "id", null);
        setBooleanField(term1213, term1213.getClass(), "enabled", false);
        setField(term1213, term1213.getClass(), "created", null);
        setField(term1213, term1213.getClass(), "updated", null);
        ArrayList term1199 = new ArrayList();
        ((ArrayList) term1199).add(term1201);
        ((ArrayList) term1199).add(term1205);
        ((ArrayList) term1199).add(term1209);
        ((ArrayList) term1199).add(term1211);
        ((ArrayList) term1199).add(term1205);
        ((ArrayList) term1199).add(term1213);
        Long term1217 = new Long(846579494941632714L);
        Long term1274 = new Long(6689117472719450333L);
        term1171 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Device"));
        Object term1172 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.User"));
        Object term1197 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term1220 = newInstance(Class.forName("java.util.Date"));
        Object term1222 = newInstance(Class.forName("java.util.Date"));
        Object term1236 = newInstance(Class.forName("java.util.Date"));
        Object term1277 = newInstance(Class.forName("java.util.Date"));
        Object term1279 = newInstance(Class.forName("java.util.Date"));
        setField(term1172, term1172.getClass(), "email", "SdCKLMIYnX");
        setField(term1172, term1172.getClass(), "password", "OJJtVNPyKZ");
        setIntField(term1197, term1197.getClass(), "modCount", 0);
        setField(term1172, term1172.getClass(), "devices", term1197);
        setField(term1172, term1172.getClass(), "roles", term1199);
        setField(term1172, term1172.getClass(), "id", term1217);
        setBooleanField(term1172, term1172.getClass(), "enabled", true);
        setLongField(term1220, term1220.getClass(), "fastTime", 1836082079512L);
        setField(term1220, term1220.getClass(), "cdate", null);
        setField(term1172, term1172.getClass(), "created", term1220);
        setLongField(term1222, term1222.getClass(), "fastTime", 1426397467745L);
        setField(term1222, term1222.getClass(), "cdate", null);
        setField(term1172, term1172.getClass(), "updated", term1222);
        setField(term1171, term1171.getClass(), "user", term1172);
        setField(term1171, term1171.getClass(), "refreshToken", "VYkqXKVlAJ");
        setLongField(term1236, term1236.getClass(), "fastTime", 1755551549042L);
        setField(term1236, term1236.getClass(), "cdate", null);
        setField(term1171, term1171.getClass(), "refreshTokenExpirationDate", term1236);
        setField(term1171, term1171.getClass(), "remoteAddress", "XkIoWJRNwN");
        setField(term1171, term1171.getClass(), "type", "aNWLJdrZMq");
        setField(term1171, term1171.getClass(), "os", "HHmNoYxIGj");
        setField(term1171, term1171.getClass(), "id", term1274);
        setBooleanField(term1171, term1171.getClass(), "enabled", true);
        setLongField(term1277, term1277.getClass(), "fastTime", 1619398774189L);
        setField(term1277, term1277.getClass(), "cdate", null);
        setField(term1171, term1171.getClass(), "created", term1277);
        setLongField(term1279, term1279.getClass(), "fastTime", 1665119808787L);
        setField(term1279, term1279.getClass(), "cdate", null);
        setField(term1171, term1171.getClass(), "updated", term1279);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Device");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PtirvZmsGt";
        callMethod(klass, "setRefreshToken", argTypes, term1171, args);
    }

};


