package com.scaleguard.server.application;

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
import static com.scaleguard.server.application.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class Application_WrappeApplicationRecord_getClients_14355656900 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2859;

    public Application_WrappeApplicationRecord_getClients_14355656900() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2886 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term2886, term2886.getClass(), "id", "");
        setField(term2886, term2886.getClass(), "name", "");
        setField(term2886, term2886.getClass(), "description", "");
        setField(term2886, term2886.getClass(), "appid", "");
        setField(term2886, term2886.getClass(), "clientid", "");
        setField(term2886, term2886.getClass(), "clientsecret", "");
        setLongField(term2886, term2886.getClass(), "expiry", -6573104506744284592L);
        Object term2894 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term2894, term2894.getClass(), "id", "");
        setField(term2894, term2894.getClass(), "name", "");
        setField(term2894, term2894.getClass(), "description", "");
        setField(term2894, term2894.getClass(), "appid", "");
        setField(term2894, term2894.getClass(), "clientid", "");
        setField(term2894, term2894.getClass(), "clientsecret", "");
        setLongField(term2894, term2894.getClass(), "expiry", -4920224193275732920L);
        Object term2902 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term2902, term2902.getClass(), "id", "");
        setField(term2902, term2902.getClass(), "name", "");
        setField(term2902, term2902.getClass(), "description", "");
        setField(term2902, term2902.getClass(), "appid", "");
        setField(term2902, term2902.getClass(), "clientid", "");
        setField(term2902, term2902.getClass(), "clientsecret", "");
        setLongField(term2902, term2902.getClass(), "expiry", 8428634514691209827L);
        Object term2910 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term2910, term2910.getClass(), "id", "");
        setField(term2910, term2910.getClass(), "name", "");
        setField(term2910, term2910.getClass(), "description", "");
        setField(term2910, term2910.getClass(), "appid", "");
        setField(term2910, term2910.getClass(), "clientid", "");
        setField(term2910, term2910.getClass(), "clientsecret", "");
        setLongField(term2910, term2910.getClass(), "expiry", -2585684163342970173L);
        Object term2918 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term2918, term2918.getClass(), "id", "");
        setField(term2918, term2918.getClass(), "name", "");
        setField(term2918, term2918.getClass(), "description", "");
        setField(term2918, term2918.getClass(), "appid", "");
        setField(term2918, term2918.getClass(), "clientid", "");
        setField(term2918, term2918.getClass(), "clientsecret", "");
        setLongField(term2918, term2918.getClass(), "expiry", 8059786003080744426L);
        ArrayList term2884 = new ArrayList();
        ((ArrayList) term2884).add(term2886);
        ((ArrayList) term2884).add(term2894);
        ((ArrayList) term2884).add(term2902);
        ((ArrayList) term2884).add(term2910);
        ((ArrayList) term2884).add(term2918);
        term2859 = newInstance(Class.forName("com.scaleguard.server.application.Application$WrappeApplicationRecord"));
        setField(term2859, term2859.getClass(), "name", "JDaAnsVTGV");
        setField(term2859, term2859.getClass(), "description", "mLUZFTfjle");
        setField(term2859, term2859.getClass(), "clients", term2884);
        setField(term2859, term2859.getClass(), "id", "HWkpTmtlrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.application.Application$WrappeApplicationRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClients", argTypes, term2859, args);
    }

};


