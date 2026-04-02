package com.lyubenblagoev.postfixrest.service;

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
import static com.lyubenblagoev.postfixrest.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Boolean;

public class AliasServiceImpl_save_6809590764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11993;

    public AliasServiceImpl_save_6809590764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11994 = new Long(846579494941632714L);
        Long term11996 = new Long(6689117472719450333L);
        Boolean term11998 = new Boolean(false);
        term11993 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasChangeRequest"));
        setField(term11993, term11993.getClass(), "id", term11994);
        setField(term11993, term11993.getClass(), "domainId", term11996);
        setField(term11993, term11993.getClass(), "enabled", term11998);
        setField(term11993, term11993.getClass(), "name", "WHcwFgsGFC");
        setField(term11993, term11993.getClass(), "email", "HzqpegHiRq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.AliasServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasChangeRequest");
        Object[] args = new Object[1];
        args[0] = term11993;
        callMethod(klass, "save", argTypes, null, args);
    }

};


