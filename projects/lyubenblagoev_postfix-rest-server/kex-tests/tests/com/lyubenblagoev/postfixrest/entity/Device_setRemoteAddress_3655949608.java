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

public class Device_setRemoteAddress_3655949608 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1877;

    public Device_setRemoteAddress_3655949608() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1905 = new ArrayList();
        Long term1909 = new Long(8802866251294305945L);
        Long term1966 = new Long(4513004407927379358L);
        term1877 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Device"));
        Object term1878 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.User"));
        Object term1903 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term1912 = newInstance(Class.forName("java.util.Date"));
        Object term1914 = newInstance(Class.forName("java.util.Date"));
        Object term1928 = newInstance(Class.forName("java.util.Date"));
        Object term1969 = newInstance(Class.forName("java.util.Date"));
        Object term1971 = newInstance(Class.forName("java.util.Date"));
        setField(term1878, term1878.getClass(), "email", "rYbtIDVdnd");
        setField(term1878, term1878.getClass(), "password", "UKAReurpHG");
        setIntField(term1903, term1903.getClass(), "modCount", 0);
        setField(term1878, term1878.getClass(), "devices", term1903);
        setField(term1878, term1878.getClass(), "roles", term1905);
        setField(term1878, term1878.getClass(), "id", term1909);
        setBooleanField(term1878, term1878.getClass(), "enabled", true);
        setLongField(term1912, term1912.getClass(), "fastTime", 1263138252859L);
        setField(term1912, term1912.getClass(), "cdate", null);
        setField(term1878, term1878.getClass(), "created", term1912);
        setLongField(term1914, term1914.getClass(), "fastTime", 1603415189333L);
        setField(term1914, term1914.getClass(), "cdate", null);
        setField(term1878, term1878.getClass(), "updated", term1914);
        setField(term1877, term1877.getClass(), "user", term1878);
        setField(term1877, term1877.getClass(), "refreshToken", "WVRMUmrljA");
        setLongField(term1928, term1928.getClass(), "fastTime", 1841230035815L);
        setField(term1928, term1928.getClass(), "cdate", null);
        setField(term1877, term1877.getClass(), "refreshTokenExpirationDate", term1928);
        setField(term1877, term1877.getClass(), "remoteAddress", "NTlKJDDWlk");
        setField(term1877, term1877.getClass(), "type", "vOuMEpOQAg");
        setField(term1877, term1877.getClass(), "os", "SIODFGaQhr");
        setField(term1877, term1877.getClass(), "id", term1966);
        setBooleanField(term1877, term1877.getClass(), "enabled", true);
        setLongField(term1969, term1969.getClass(), "fastTime", 1502420909766L);
        setField(term1969, term1969.getClass(), "cdate", null);
        setField(term1877, term1877.getClass(), "created", term1969);
        setLongField(term1971, term1971.getClass(), "fastTime", 1685492640220L);
        setField(term1971, term1971.getClass(), "cdate", null);
        setField(term1877, term1877.getClass(), "updated", term1971);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Device");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qYzsiuXOgS";
        callMethod(klass, "setRemoteAddress", argTypes, term1877, args);
    }

};


