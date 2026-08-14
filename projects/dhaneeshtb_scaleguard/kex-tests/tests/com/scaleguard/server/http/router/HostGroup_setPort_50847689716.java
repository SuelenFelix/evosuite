package com.scaleguard.server.http.router;

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
import static com.scaleguard.server.http.router.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class HostGroup_setPort_50847689716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24579;

    public HostGroup_setPort_50847689716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24579 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term24579, term24579.getClass(), "id", "pcQcluzQgA");
        setField(term24579, term24579.getClass(), "host", "iWOGNdtCLH");
        setField(term24579, term24579.getClass(), "port", "KoDRiNjUMj");
        setField(term24579, term24579.getClass(), "health", "LtnegjrHqS");
        setField(term24579, term24579.getClass(), "scheme", "iSrYZvDgVF");
        setIntField(term24579, term24579.getClass(), "priority", -1410220680);
        setBooleanField(term24579, term24579.getClass(), "isActive", true);
        setField(term24579, term24579.getClass(), "type", "uVYuAEBgZy");
        setField(term24579, term24579.getClass(), "groupId", "pOAxvXmQfD");
        setFloatField(term24579, term24579.getClass(), "loadFactor", 0.55778444F);
        setBooleanField(term24579, term24579.getClass(), "isReachable", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.HostGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mvWHHiGYmD";
        callMethod(klass, "setPort", argTypes, term24579, args);
    }

};


