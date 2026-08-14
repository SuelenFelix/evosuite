package com.acme.types;

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
import static com.acme.types.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class Publisher_setName_13943666865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term768;

    public Publisher_setName_13943666865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term801 = new Integer(-184153539);
        ArrayList term804 = new ArrayList();
        ((ArrayList) term804).add((Object)null);
        ((ArrayList) term804).add((Object)null);
        ((ArrayList) term804).add((Object)null);
        ((ArrayList) term804).add((Object)null);
        ((ArrayList) term804).add((Object)null);
        ((ArrayList) term804).add((Object)null);
        ArrayList term807 = new ArrayList();
        ((ArrayList) term807).add((Object)null);
        ((ArrayList) term807).add((Object)null);
        ArrayList term813 = new ArrayList();
        ((ArrayList) term813).add((Object)null);
        ((ArrayList) term813).add((Object)null);
        ((ArrayList) term813).add((Object)null);
        ((ArrayList) term813).add((Object)null);
        ((ArrayList) term813).add((Object)null);
        ((ArrayList) term813).add((Object)null);
        ((ArrayList) term813).add((Object)null);
        ((ArrayList) term813).add((Object)null);
        Object term795 = newInstance(Class.forName("com.acme.types.Book"));
        Object term800 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term810 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term811 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term812 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term795, term795.getClass(), "id", "");
        setField(term795, term795.getClass(), "title", "");
        setField(term795, term795.getClass(), "isbn13", "");
        setField(term795, term795.getClass(), "isbn10", "");
        setField(term800, term800.getClass(), "id", null);
        setField(term800, term800.getClass(), "name", null);
        setField(term795, term795.getClass(), "genre", term800);
        setField(term795, term795.getClass(), "yearOfPublication", term801);
        setField(term795, term795.getClass(), "blurb", "");
        setField(term795, term795.getClass(), "authors", term804);
        setField(term795, term795.getClass(), "publishers", term807);
        setField(term810, term810.getClass(), "id", null);
        setField(term810, term810.getClass(), "name", null);
        setField(term795, term795.getClass(), "lang", term810);
        setField(term811, term811.getClass(), "id", null);
        setField(term811, term811.getClass(), "formatName", null);
        setField(term795, term795.getClass(), "publishingFormat", term811);
        setField(term812, term812.getClass(), "id", null);
        setField(term812, term812.getClass(), "smallUrl", null);
        setField(term812, term812.getClass(), "mediumUrl", null);
        setField(term812, term812.getClass(), "largeUrl", null);
        setField(term795, term795.getClass(), "cover", term812);
        setField(term795, term795.getClass(), "awards", term813);
        ArrayList term793 = new ArrayList();
        ((ArrayList) term793).add(term795);
        term768 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term768, term768.getClass(), "id", "YJhnPtWtJR");
        setField(term768, term768.getClass(), "name", "xzGnrvbExX");
        setField(term768, term768.getClass(), "books", term793);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Publisher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XgJzBOYfQB";
        callMethod(klass, "setName", argTypes, term768, args);
    }

};


