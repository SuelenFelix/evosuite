package com.datajpa.relationship.service;

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
import static com.datajpa.relationship.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Long;

public class BookServiceImpl_addBook_1263641440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187;

    public BookServiceImpl_addBook_1263641440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term202 = new Long(-872011222785455006L);
        Long term204 = new Long(-316468845751588286L);
        Long term206 = new Long(5127676408959197577L);
        Long term208 = new Long(-6573104506744284592L);
        Long term210 = new Long(-4920224193275732920L);
        ArrayList term200 = new ArrayList();
        ((ArrayList) term200).add(term202);
        ((ArrayList) term200).add(term204);
        ((ArrayList) term200).add(term206);
        ((ArrayList) term200).add(term208);
        ((ArrayList) term200).add(term210);
        Long term214 = new Long(8428634514691209827L);
        term187 = newInstance(Class.forName("com.datajpa.relationship.dto.requestDto.BookRequestDto"));
        setField(term187, term187.getClass(), "name", "SzjVpOQTyS");
        setField(term187, term187.getClass(), "authorIds", term200);
        setField(term187, term187.getClass(), "categoryId", term214);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.service.BookServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.datajpa.relationship.dto.requestDto.BookRequestDto");
        Object[] args = new Object[1];
        args[0] = term187;
        callMethod(klass, "addBook", argTypes, null, args);
    }

};


