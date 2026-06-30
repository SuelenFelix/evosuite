package com.datajpa.relationship.dto.requestDto;

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
import static com.datajpa.relationship.dto.requestDto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Long;
import java.util.LinkedList;
import java.lang.Object;

public class BookRequestDto_setAuthorIds_17735566455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term975;
     Object term996;

    public BookRequestDto_setAuthorIds_17735566455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term990 = new Long(-8708192233349544946L);
        ArrayList term988 = new ArrayList();
        ((ArrayList) term988).add(term990);
        Long term994 = new Long(5907001541142728739L);
        term975 = newInstance(Class.forName("com.datajpa.relationship.dto.requestDto.BookRequestDto"));
        setField(term975, term975.getClass(), "name", "IDCWpPLRkE");
        setField(term975, term975.getClass(), "authorIds", term988);
        setField(term975, term975.getClass(), "categoryId", term994);
        Long term999 = new Long(4178434741742309755L);
        Long term1002 = new Long(-2068172595987555756L);
        Long term1005 = new Long(-6292278961887936280L);
        Long term1008 = new Long(-6645965768855543712L);
        term996 = new LinkedList();
        ((LinkedList) term996).add(term999);
        ((LinkedList) term996).add(term1002);
        ((LinkedList) term996).add(term1005);
        ((LinkedList) term996).add(term1008);
        ((LinkedList) term996).add((Object)null);
        ((LinkedList) term996).add((Object)null);
        ((LinkedList) term996).add((Object)null);
        ((LinkedList) term996).add((Object)null);
        ((LinkedList) term996).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.requestDto.BookRequestDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term996;
        callMethod(klass, "setAuthorIds", argTypes, term975, args);
    }

};


