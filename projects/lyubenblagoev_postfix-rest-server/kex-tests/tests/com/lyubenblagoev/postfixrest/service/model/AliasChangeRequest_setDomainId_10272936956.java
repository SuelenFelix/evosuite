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

public class AliasChangeRequest_setDomainId_10272936956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280;
     Object term311;

    public AliasChangeRequest_setDomainId_10272936956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term281 = new Long(-8885298608300233488L);
        Long term283 = new Long(-4325723315152823407L);
        Boolean term285 = new Boolean(true);
        term280 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasChangeRequest"));
        setField(term280, term280.getClass(), "id", term281);
        setField(term280, term280.getClass(), "domainId", term283);
        setField(term280, term280.getClass(), "enabled", term285);
        setField(term280, term280.getClass(), "name", "uuaPigETmJ");
        setField(term280, term280.getClass(), "email", "MxlszYVzRf");
        term311 = new Long(2535595959091595249L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasChangeRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term311;
        callMethod(klass, "setDomainId", argTypes, term280, args);
    }

};


