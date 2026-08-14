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
import java.lang.Object;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.String;

public class Book_setBlurb_134766265315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18091;

    public Book_setBlurb_134766265315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term18165 = new Integer(252575029);
        ArrayList term18179 = new ArrayList();
        ArrayList term18188 = new ArrayList();
        ((ArrayList) term18188).add((Object)null);
        Object term18185 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term18185, term18185.getClass(), "id", "");
        setField(term18185, term18185.getClass(), "name", "");
        setField(term18185, term18185.getClass(), "books", term18188);
        ArrayList term18194 = new ArrayList();
        ((ArrayList) term18194).add((Object)null);
        ((ArrayList) term18194).add((Object)null);
        ((ArrayList) term18194).add((Object)null);
        Object term18191 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term18191, term18191.getClass(), "id", "");
        setField(term18191, term18191.getClass(), "name", "");
        setField(term18191, term18191.getClass(), "books", term18194);
        ArrayList term18200 = new ArrayList();
        ((ArrayList) term18200).add((Object)null);
        ((ArrayList) term18200).add((Object)null);
        ((ArrayList) term18200).add((Object)null);
        ((ArrayList) term18200).add((Object)null);
        ((ArrayList) term18200).add((Object)null);
        ((ArrayList) term18200).add((Object)null);
        Object term18197 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term18197, term18197.getClass(), "id", "");
        setField(term18197, term18197.getClass(), "name", "");
        setField(term18197, term18197.getClass(), "books", term18200);
        ArrayList term18206 = new ArrayList();
        ((ArrayList) term18206).add((Object)null);
        ((ArrayList) term18206).add((Object)null);
        ((ArrayList) term18206).add((Object)null);
        ((ArrayList) term18206).add((Object)null);
        ((ArrayList) term18206).add((Object)null);
        ((ArrayList) term18206).add((Object)null);
        Object term18203 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term18203, term18203.getClass(), "id", "");
        setField(term18203, term18203.getClass(), "name", "");
        setField(term18203, term18203.getClass(), "books", term18206);
        ArrayList term18212 = new ArrayList();
        ((ArrayList) term18212).add((Object)null);
        ((ArrayList) term18212).add((Object)null);
        ((ArrayList) term18212).add((Object)null);
        Object term18209 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term18209, term18209.getClass(), "id", "");
        setField(term18209, term18209.getClass(), "name", "");
        setField(term18209, term18209.getClass(), "books", term18212);
        ArrayList term18183 = new ArrayList();
        ((ArrayList) term18183).add(term18185);
        ((ArrayList) term18183).add(term18191);
        ((ArrayList) term18183).add(term18197);
        ((ArrayList) term18183).add(term18203);
        ((ArrayList) term18183).add(term18191);
        ((ArrayList) term18183).add(term18209);
        ((ArrayList) term18183).add(term18197);
        ((ArrayList) term18183).add(term18209);
        ((ArrayList) term18183).add(term18203);
        Class<? extends Object> term18495 = Class.forName((String) "com.acme.types.AwardName");
        Field term18494 = ((Class) term18495).getDeclaredField((String) "DYLAN_PRIZE");
        ((Field) term18494).setAccessible(true);
        Object enum49 = ((Field) term18494).get((Object) null);
        Object term18318 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term18318, term18318.getClass(), "id", "");
        setField(term18318, term18318.getClass(), "awardName", enum49);
        setField(term18318, term18318.getClass(), "category", "");
        setIntField(term18318, term18318.getClass(), "year", -936895502);
        Class<? extends Object> term18655 = Class.forName((String) "com.acme.types.AwardName");
        Field term18654 = ((Class) term18655).getDeclaredField((String) "DYLAN_PRIZE");
        ((Field) term18654).setAccessible(true);
        Object enum50 = ((Field) term18654).get((Object) null);
        Object term18324 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term18324, term18324.getClass(), "id", "");
        setField(term18324, term18324.getClass(), "awardName", enum50);
        setField(term18324, term18324.getClass(), "category", "");
        setIntField(term18324, term18324.getClass(), "year", -1195339592);
        ArrayList term18316 = new ArrayList();
        ((ArrayList) term18316).add(term18318);
        ((ArrayList) term18316).add(term18324);
        term18091 = newInstance(Class.forName("com.acme.types.Book"));
        Object term18140 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term18217 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term18242 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term18267 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term18091, term18091.getClass(), "id", "MflCXDvTuO");
        setField(term18091, term18091.getClass(), "title", "XQFFoiySPq");
        setField(term18091, term18091.getClass(), "isbn13", "IRtNRIRHTg");
        setField(term18091, term18091.getClass(), "isbn10", "fHocghEAVR");
        setField(term18140, term18140.getClass(), "id", "FXngdpZyuo");
        setField(term18140, term18140.getClass(), "name", "DTerqIWqcp");
        setField(term18091, term18091.getClass(), "genre", term18140);
        setField(term18091, term18091.getClass(), "yearOfPublication", term18165);
        setField(term18091, term18091.getClass(), "blurb", "fpCIxbJMhb");
        setField(term18091, term18091.getClass(), "authors", term18179);
        setField(term18091, term18091.getClass(), "publishers", term18183);
        setField(term18217, term18217.getClass(), "id", "AseuIhxdgC");
        setField(term18217, term18217.getClass(), "name", "JXKflOoAwA");
        setField(term18091, term18091.getClass(), "lang", term18217);
        setField(term18242, term18242.getClass(), "id", "sqUthQtpCU");
        setField(term18242, term18242.getClass(), "formatName", "heMCJQtnSe");
        setField(term18091, term18091.getClass(), "publishingFormat", term18242);
        setField(term18267, term18267.getClass(), "id", "nozhcagtoi");
        setField(term18267, term18267.getClass(), "smallUrl", "UAotjofyqR");
        setField(term18267, term18267.getClass(), "mediumUrl", "ZVxspVELsB");
        setField(term18267, term18267.getClass(), "largeUrl", "lwBTtSWyCb");
        setField(term18091, term18091.getClass(), "cover", term18267);
        setField(term18091, term18091.getClass(), "awards", term18316);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jalAJUuHgn";
        callMethod(klass, "setBlurb", argTypes, term18091, args);
    }

};


