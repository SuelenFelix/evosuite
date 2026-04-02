package com.alkemy.ong.infrastructure.rest.mapper.contact;

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
import static com.alkemy.ong.infrastructure.rest.mapper.contact.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Long;

public class GetContactMapper_toResponse_18494603252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term441;
     Object term442;

    public GetContactMapper_toResponse_18494603252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term441 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.contact.GetContactMapper"));
        Long term446 = new Long(6811161968424632369L);
        Object term445 = newInstance(Class.forName("com.alkemy.ong.domain.Contact"));
        setField(term445, term445.getClass(), "id", term446);
        setField(term445, term445.getClass(), "name", "AijpHYOFuy");
        setField(term445, term445.getClass(), "phone", "SbAoxhfrkn");
        setField(term445, term445.getClass(), "email", "kuTXqwMtDB");
        setField(term445, term445.getClass(), "message", "Ghbwtircqb");
        Long term498 = new Long(-7237588299778557629L);
        Object term497 = newInstance(Class.forName("com.alkemy.ong.domain.Contact"));
        setField(term497, term497.getClass(), "id", term498);
        setField(term497, term497.getClass(), "name", "");
        setField(term497, term497.getClass(), "phone", "");
        setField(term497, term497.getClass(), "email", "");
        setField(term497, term497.getClass(), "message", "");
        Long term506 = new Long(6967924379644551255L);
        Object term505 = newInstance(Class.forName("com.alkemy.ong.domain.Contact"));
        setField(term505, term505.getClass(), "id", term506);
        setField(term505, term505.getClass(), "name", null);
        setField(term505, term505.getClass(), "phone", null);
        setField(term505, term505.getClass(), "email", null);
        setField(term505, term505.getClass(), "message", null);
        term442 = new LinkedList();
        ((LinkedList) term442).add(term445);
        ((LinkedList) term442).add(term497);
        ((LinkedList) term442).add(term505);
        ((LinkedList) term442).add((Object)null);
        ((LinkedList) term442).add((Object)null);
        ((LinkedList) term442).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.contact.GetContactMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term442;
        callMethod(klass, "toResponse", argTypes, term441, args);
    }

};


