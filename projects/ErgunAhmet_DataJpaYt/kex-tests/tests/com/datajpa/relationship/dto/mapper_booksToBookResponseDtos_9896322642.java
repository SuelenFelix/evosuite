package com.datajpa.relationship.dto;

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
import static com.datajpa.relationship.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;

public class mapper_booksToBookResponseDtos_9896322642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5482;

    public mapper_booksToBookResponseDtos_9896322642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5486 = new Long(3825396310311739952L);
        ArrayList term5500 = new ArrayList();
        Long term5505 = new Long(-3838084482494604218L);
        ArrayList term5508 = new ArrayList();
        Object term5485 = newInstance(Class.forName("com.datajpa.relationship.model.Book"));
        Object term5504 = newInstance(Class.forName("com.datajpa.relationship.model.Category"));
        setField(term5485, term5485.getClass(), "id", term5486);
        setField(term5485, term5485.getClass(), "name", "OcJCIDNIXA");
        setField(term5485, term5485.getClass(), "authors", term5500);
        setField(term5504, term5504.getClass(), "id", term5505);
        setField(term5504, term5504.getClass(), "name", "");
        setField(term5504, term5504.getClass(), "books", term5508);
        setField(term5485, term5485.getClass(), "category", term5504);
        Long term5513 = new Long(3892018155439224435L);
        ArrayList term5516 = new ArrayList();
        Long term5520 = new Long(5953383087795962419L);
        Object term5512 = newInstance(Class.forName("com.datajpa.relationship.model.Book"));
        Object term5519 = newInstance(Class.forName("com.datajpa.relationship.model.Category"));
        setField(term5512, term5512.getClass(), "id", term5513);
        setField(term5512, term5512.getClass(), "name", "");
        setField(term5512, term5512.getClass(), "authors", term5516);
        setField(term5519, term5519.getClass(), "id", term5520);
        setField(term5519, term5519.getClass(), "name", null);
        setField(term5519, term5519.getClass(), "books", null);
        setField(term5512, term5512.getClass(), "category", term5519);
        Long term5524 = new Long(7994303628307559416L);
        Object term5523 = newInstance(Class.forName("com.datajpa.relationship.model.Book"));
        setField(term5523, term5523.getClass(), "id", term5524);
        setField(term5523, term5523.getClass(), "name", null);
        setField(term5523, term5523.getClass(), "authors", null);
        setField(term5523, term5523.getClass(), "category", null);
        term5482 = new LinkedList();
        ((LinkedList) term5482).add(term5485);
        ((LinkedList) term5482).add(term5512);
        ((LinkedList) term5482).add(term5523);
        ((LinkedList) term5482).add((Object)null);
        ((LinkedList) term5482).add((Object)null);
        ((LinkedList) term5482).add((Object)null);
        ((LinkedList) term5482).add((Object)null);
        ((LinkedList) term5482).add((Object)null);
        ((LinkedList) term5482).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.mapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term5482;
        callMethod(klass, "booksToBookResponseDtos", argTypes, null, args);
    }

};


