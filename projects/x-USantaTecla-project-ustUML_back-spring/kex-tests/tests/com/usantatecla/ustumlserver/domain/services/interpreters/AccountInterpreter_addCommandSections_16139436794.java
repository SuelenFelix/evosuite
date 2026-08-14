package com.usantatecla.ustumlserver.domain.services.interpreters;

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
import static com.usantatecla.ustumlserver.domain.services.interpreters.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AccountInterpreter_addCommandSections_16139436794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22354;

    public AccountInterpreter_addCommandSections_16139436794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22354 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.AccountInterpreter"));
        setField(term22354, term22354.getClass(), "gitRepositoryImporter", null);
        setField(term22354, term22354.getClass(), "withMembersMemberPersistence", null);
        setField(term22354, term22354.getClass(), "memberPersistence", null);
        setField(term22354, term22354.getClass(), "account", null);
        setField(term22354, term22354.getClass(), "member", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.AccountInterpreter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.Command");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addCommandSections", argTypes, term22354, args);
    }

};


