package com.leanstacks.ws.security;

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
import static com.leanstacks.ws.security.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Long;
import java.util.LinkedList;

public class CorsProperties_setAllowedHeaders_15204252056 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term789;
     Object term914;

    public CorsProperties_setAllowedHeaders_15204252056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term795 = new Boolean(false);
        ArrayList term836 = new ArrayList();
        ((ArrayList) term836).add("HyxfbSQYBe");
        ((ArrayList) term836).add("pCTimMblYc");
        ((ArrayList) term836).add("hNxWaHcfhY");
        ((ArrayList) term836).add("RkybSrpybU");
        ((ArrayList) term836).add("xOEqzGAmDU");
        ((ArrayList) term836).add("eZFUvlxvGV");
        Long term912 = new Long(1800L);
        term789 = newInstance(Class.forName("com.leanstacks.ws.security.CorsProperties"));
        Object term797 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term798 = (Object[]) newArray("java.lang.String", 2);
        Object term822 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term823 = (Object[]) newArray("java.lang.String", 1);
        Object term830 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term831 = (Object[]) newArray("java.lang.String", 1);
        setField(term789, term789.getClass(), "filterRegistrationPath", "/**");
        setField(term789, term789.getClass(), "allowCredentials", term795);
        setElement(term798, 0, "accept");
        setElement(term798, 1, "content-type");
        setField(term797, term797.getClass(), "a", term798);
        setIntField(term797, term797.getClass(), "modCount", 0);
        setField(term789, term789.getClass(), "allowedHeaders", term797);
        setElement(term823, 0, "GET");
        setField(term822, term822.getClass(), "a", term823);
        setIntField(term822, term822.getClass(), "modCount", 0);
        setField(term789, term789.getClass(), "allowedMethods", term822);
        setElement(term831, 0, "*");
        setField(term830, term830.getClass(), "a", term831);
        setIntField(term830, term830.getClass(), "modCount", 0);
        setField(term789, term789.getClass(), "allowedOrigins", term830);
        setField(term789, term789.getClass(), "exposedHeaders", term836);
        setField(term789, term789.getClass(), "maxAgeSeconds", term912);
        term914 = new LinkedList();
        ((LinkedList) term914).add("BYqFIqCKAV");
        ((LinkedList) term914).add("vrQLuWIDJX");
        ((LinkedList) term914).add("");
        ((LinkedList) term914).add((Object)null);
        ((LinkedList) term914).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.security.CorsProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term914;
        callMethod(klass, "setAllowedHeaders", argTypes, term789, args);
    }

};


