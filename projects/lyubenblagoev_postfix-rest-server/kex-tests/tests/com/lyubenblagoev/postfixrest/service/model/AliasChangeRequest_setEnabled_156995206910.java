package com.lyubenblagoev.postfixrest.service.model;

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
import static com.lyubenblagoev.postfixrest.service.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Boolean;

public class AliasChangeRequest_setEnabled_156995206910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term508;
     Object term539;

    public AliasChangeRequest_setEnabled_156995206910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term509 = new Long(8428634514691209827L);
        Long term511 = new Long(-2585684163342970173L);
        Boolean term513 = new Boolean(true);
        term508 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasChangeRequest"));
        setField(term508, term508.getClass(), "id", term509);
        setField(term508, term508.getClass(), "domainId", term511);
        setField(term508, term508.getClass(), "enabled", term513);
        setField(term508, term508.getClass(), "name", "hNxWaHcfhY");
        setField(term508, term508.getClass(), "email", "RkybSrpybU");
        term539 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasChangeRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term539;
        callMethod(klass, "setEnabled", argTypes, term508, args);
    }

};


