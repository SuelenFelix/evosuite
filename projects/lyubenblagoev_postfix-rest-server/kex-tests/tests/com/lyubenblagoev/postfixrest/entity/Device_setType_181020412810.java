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

public class Device_setType_181020412810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2227;

    public Device_setType_181020412810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2258 = new Long(-948292411727204525L);
        Object term2257 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term2257, term2257.getClass(), "name", null);
        setField(term2257, term2257.getClass(), "users", null);
        setField(term2257, term2257.getClass(), "id", term2258);
        setBooleanField(term2257, term2257.getClass(), "enabled", true);
        setField(term2257, term2257.getClass(), "created", null);
        setField(term2257, term2257.getClass(), "updated", null);
        ArrayList term2255 = new ArrayList();
        ((ArrayList) term2255).add(term2257);
        Long term2263 = new Long(-8892586408602479513L);
        Long term2320 = new Long(4616440478358528406L);
        term2227 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Device"));
        Object term2228 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.User"));
        Object term2253 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term2266 = newInstance(Class.forName("java.util.Date"));
        Object term2268 = newInstance(Class.forName("java.util.Date"));
        Object term2282 = newInstance(Class.forName("java.util.Date"));
        Object term2323 = newInstance(Class.forName("java.util.Date"));
        Object term2325 = newInstance(Class.forName("java.util.Date"));
        setField(term2228, term2228.getClass(), "email", "TweMFhxNdj");
        setField(term2228, term2228.getClass(), "password", "NBrvVzvQHe");
        setIntField(term2253, term2253.getClass(), "modCount", 0);
        setField(term2228, term2228.getClass(), "devices", term2253);
        setField(term2228, term2228.getClass(), "roles", term2255);
        setField(term2228, term2228.getClass(), "id", term2263);
        setBooleanField(term2228, term2228.getClass(), "enabled", true);
        setLongField(term2266, term2266.getClass(), "fastTime", 1653505339445L);
        setField(term2266, term2266.getClass(), "cdate", null);
        setField(term2228, term2228.getClass(), "created", term2266);
        setLongField(term2268, term2268.getClass(), "fastTime", 1781258116495L);
        setField(term2268, term2268.getClass(), "cdate", null);
        setField(term2228, term2228.getClass(), "updated", term2268);
        setField(term2227, term2227.getClass(), "user", term2228);
        setField(term2227, term2227.getClass(), "refreshToken", "DzHVBMqWtE");
        setLongField(term2282, term2282.getClass(), "fastTime", 1671403905627L);
        setField(term2282, term2282.getClass(), "cdate", null);
        setField(term2227, term2227.getClass(), "refreshTokenExpirationDate", term2282);
        setField(term2227, term2227.getClass(), "remoteAddress", "THZSpzBRYP");
        setField(term2227, term2227.getClass(), "type", "ZfBIVGBQOE");
        setField(term2227, term2227.getClass(), "os", "QSrDQfEsTR");
        setField(term2227, term2227.getClass(), "id", term2320);
        setBooleanField(term2227, term2227.getClass(), "enabled", false);
        setLongField(term2323, term2323.getClass(), "fastTime", 1653925601527L);
        setField(term2323, term2323.getClass(), "cdate", null);
        setField(term2227, term2227.getClass(), "created", term2323);
        setLongField(term2325, term2325.getClass(), "fastTime", 1367603522080L);
        setField(term2325, term2325.getClass(), "cdate", null);
        setField(term2227, term2227.getClass(), "updated", term2325);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Device");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PsqusYmejD";
        callMethod(klass, "setType", argTypes, term2227, args);
    }

};


