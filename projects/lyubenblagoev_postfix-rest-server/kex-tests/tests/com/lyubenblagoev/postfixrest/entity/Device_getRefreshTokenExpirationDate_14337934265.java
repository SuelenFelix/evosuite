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

public class Device_getRefreshTokenExpirationDate_14337934265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1363;

    public Device_getRefreshTokenExpirationDate_14337934265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1394 = new Long(1368340889161782793L);
        Object term1393 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term1393, term1393.getClass(), "name", null);
        setField(term1393, term1393.getClass(), "users", null);
        setField(term1393, term1393.getClass(), "id", term1394);
        setBooleanField(term1393, term1393.getClass(), "enabled", true);
        setField(term1393, term1393.getClass(), "created", null);
        setField(term1393, term1393.getClass(), "updated", null);
        Object term1397 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term1397, term1397.getClass(), "name", null);
        setField(term1397, term1397.getClass(), "users", null);
        setField(term1397, term1397.getClass(), "id", null);
        setBooleanField(term1397, term1397.getClass(), "enabled", false);
        setField(term1397, term1397.getClass(), "created", null);
        setField(term1397, term1397.getClass(), "updated", null);
        Long term1400 = new Long(-8033714905181142681L);
        Object term1399 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term1399, term1399.getClass(), "name", null);
        setField(term1399, term1399.getClass(), "users", null);
        setField(term1399, term1399.getClass(), "id", term1400);
        setBooleanField(term1399, term1399.getClass(), "enabled", false);
        setField(term1399, term1399.getClass(), "created", null);
        setField(term1399, term1399.getClass(), "updated", null);
        Object term1403 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term1403, term1403.getClass(), "name", null);
        setField(term1403, term1403.getClass(), "users", null);
        setField(term1403, term1403.getClass(), "id", null);
        setBooleanField(term1403, term1403.getClass(), "enabled", false);
        setField(term1403, term1403.getClass(), "created", null);
        setField(term1403, term1403.getClass(), "updated", null);
        ArrayList term1391 = new ArrayList();
        ((ArrayList) term1391).add(term1393);
        ((ArrayList) term1391).add(term1397);
        ((ArrayList) term1391).add(term1399);
        ((ArrayList) term1391).add(term1403);
        Long term1407 = new Long(-5786861555969446503L);
        Long term1464 = new Long(2354625302846375590L);
        term1363 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Device"));
        Object term1364 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.User"));
        Object term1389 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term1410 = newInstance(Class.forName("java.util.Date"));
        Object term1412 = newInstance(Class.forName("java.util.Date"));
        Object term1426 = newInstance(Class.forName("java.util.Date"));
        Object term1467 = newInstance(Class.forName("java.util.Date"));
        Object term1469 = newInstance(Class.forName("java.util.Date"));
        setField(term1364, term1364.getClass(), "email", "HWkpTmtlrc");
        setField(term1364, term1364.getClass(), "password", "hMmaoREuCK");
        setIntField(term1389, term1389.getClass(), "modCount", 0);
        setField(term1364, term1364.getClass(), "devices", term1389);
        setField(term1364, term1364.getClass(), "roles", term1391);
        setField(term1364, term1364.getClass(), "id", term1407);
        setBooleanField(term1364, term1364.getClass(), "enabled", true);
        setLongField(term1410, term1410.getClass(), "fastTime", 1337283931231L);
        setField(term1410, term1410.getClass(), "cdate", null);
        setField(term1364, term1364.getClass(), "created", term1410);
        setLongField(term1412, term1412.getClass(), "fastTime", 1291742269425L);
        setField(term1412, term1412.getClass(), "cdate", null);
        setField(term1364, term1364.getClass(), "updated", term1412);
        setField(term1363, term1363.getClass(), "user", term1364);
        setField(term1363, term1363.getClass(), "refreshToken", "ekxGuOYIwi");
        setLongField(term1426, term1426.getClass(), "fastTime", 1372844831512L);
        setField(term1426, term1426.getClass(), "cdate", null);
        setField(term1363, term1363.getClass(), "refreshTokenExpirationDate", term1426);
        setField(term1363, term1363.getClass(), "remoteAddress", "RbVQXSpxXy");
        setField(term1363, term1363.getClass(), "type", "YpJbIgJWWv");
        setField(term1363, term1363.getClass(), "os", "JppkknKVOw");
        setField(term1363, term1363.getClass(), "id", term1464);
        setBooleanField(term1363, term1363.getClass(), "enabled", true);
        setLongField(term1467, term1467.getClass(), "fastTime", 1854285818602L);
        setField(term1467, term1467.getClass(), "cdate", null);
        setField(term1363, term1363.getClass(), "created", term1467);
        setLongField(term1469, term1469.getClass(), "fastTime", 1330527043188L);
        setField(term1469, term1469.getClass(), "cdate", null);
        setField(term1363, term1363.getClass(), "updated", term1469);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Device");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRefreshTokenExpirationDate", argTypes, term1363, args);
    }

};


