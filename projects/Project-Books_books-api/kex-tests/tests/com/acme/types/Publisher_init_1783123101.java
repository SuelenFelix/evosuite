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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Integer;
import java.util.ArrayList;

public class Publisher_init_1783123101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;

    public Publisher_init_1783123101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term80 = new Integer(568599855);
        ArrayList term94 = new ArrayList();
        ((ArrayList) term94).add((Object)null);
        ((ArrayList) term94).add((Object)null);
        ((ArrayList) term94).add((Object)null);
        ((ArrayList) term94).add((Object)null);
        ((ArrayList) term94).add((Object)null);
        ((ArrayList) term94).add((Object)null);
        ((ArrayList) term94).add((Object)null);
        ((ArrayList) term94).add((Object)null);
        ((ArrayList) term94).add((Object)null);
        ArrayList term98 = new ArrayList();
        ((ArrayList) term98).add((Object)null);
        ArrayList term113 = new ArrayList();
        Object term28 = newInstance(Class.forName("com.acme.types.Book"));
        Object term77 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term102 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term105 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term108 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term28, term28.getClass(), "id", "MuLcgQHgqz");
        setField(term28, term28.getClass(), "title", "xxtlPwDYFs");
        setField(term28, term28.getClass(), "isbn13", "jJCZpVmanW");
        setField(term28, term28.getClass(), "isbn10", "EGtDIRbSSb");
        setField(term77, term77.getClass(), "id", "");
        setField(term77, term77.getClass(), "name", "");
        setField(term28, term28.getClass(), "genre", term77);
        setField(term28, term28.getClass(), "yearOfPublication", term80);
        setField(term28, term28.getClass(), "blurb", "hRNSzYYIrc");
        setField(term28, term28.getClass(), "authors", term94);
        setField(term28, term28.getClass(), "publishers", term98);
        setField(term102, term102.getClass(), "id", "");
        setField(term102, term102.getClass(), "name", "");
        setField(term28, term28.getClass(), "lang", term102);
        setField(term105, term105.getClass(), "id", "");
        setField(term105, term105.getClass(), "formatName", "");
        setField(term28, term28.getClass(), "publishingFormat", term105);
        setField(term108, term108.getClass(), "id", "");
        setField(term108, term108.getClass(), "smallUrl", "");
        setField(term108, term108.getClass(), "mediumUrl", "");
        setField(term108, term108.getClass(), "largeUrl", "");
        setField(term28, term28.getClass(), "cover", term108);
        setField(term28, term28.getClass(), "awards", term113);
        Integer term124 = new Integer(-1955890973);
        ArrayList term127 = new ArrayList();
        ((ArrayList) term127).add((Object)null);
        ((ArrayList) term127).add((Object)null);
        ((ArrayList) term127).add((Object)null);
        ((ArrayList) term127).add((Object)null);
        ((ArrayList) term127).add((Object)null);
        ((ArrayList) term127).add((Object)null);
        ((ArrayList) term127).add((Object)null);
        ((ArrayList) term127).add((Object)null);
        ArrayList term130 = new ArrayList();
        ((ArrayList) term130).add((Object)null);
        ((ArrayList) term130).add((Object)null);
        ((ArrayList) term130).add((Object)null);
        ArrayList term136 = new ArrayList();
        ((ArrayList) term136).add((Object)null);
        ((ArrayList) term136).add((Object)null);
        ((ArrayList) term136).add((Object)null);
        ((ArrayList) term136).add((Object)null);
        ((ArrayList) term136).add((Object)null);
        ((ArrayList) term136).add((Object)null);
        ((ArrayList) term136).add((Object)null);
        Object term118 = newInstance(Class.forName("com.acme.types.Book"));
        Object term123 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term133 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term134 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term135 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term118, term118.getClass(), "id", "");
        setField(term118, term118.getClass(), "title", "");
        setField(term118, term118.getClass(), "isbn13", "");
        setField(term118, term118.getClass(), "isbn10", "");
        setField(term123, term123.getClass(), "id", null);
        setField(term123, term123.getClass(), "name", null);
        setField(term118, term118.getClass(), "genre", term123);
        setField(term118, term118.getClass(), "yearOfPublication", term124);
        setField(term118, term118.getClass(), "blurb", "");
        setField(term118, term118.getClass(), "authors", term127);
        setField(term118, term118.getClass(), "publishers", term130);
        setField(term133, term133.getClass(), "id", null);
        setField(term133, term133.getClass(), "name", null);
        setField(term118, term118.getClass(), "lang", term133);
        setField(term134, term134.getClass(), "id", null);
        setField(term134, term134.getClass(), "formatName", null);
        setField(term118, term118.getClass(), "publishingFormat", term134);
        setField(term135, term135.getClass(), "id", null);
        setField(term135, term135.getClass(), "smallUrl", null);
        setField(term135, term135.getClass(), "mediumUrl", null);
        setField(term135, term135.getClass(), "largeUrl", null);
        setField(term118, term118.getClass(), "cover", term135);
        setField(term118, term118.getClass(), "awards", term136);
        Integer term141 = new Integer(-522618178);
        Object term140 = newInstance(Class.forName("com.acme.types.Book"));
        setField(term140, term140.getClass(), "id", null);
        setField(term140, term140.getClass(), "title", null);
        setField(term140, term140.getClass(), "isbn13", null);
        setField(term140, term140.getClass(), "isbn10", null);
        setField(term140, term140.getClass(), "genre", null);
        setField(term140, term140.getClass(), "yearOfPublication", term141);
        setField(term140, term140.getClass(), "blurb", null);
        setField(term140, term140.getClass(), "authors", null);
        setField(term140, term140.getClass(), "publishers", null);
        setField(term140, term140.getClass(), "lang", null);
        setField(term140, term140.getClass(), "publishingFormat", null);
        setField(term140, term140.getClass(), "cover", null);
        setField(term140, term140.getClass(), "awards", null);
        term25 = new LinkedList();
        ((LinkedList) term25).add(term28);
        ((LinkedList) term25).add(term118);
        ((LinkedList) term25).add(term140);
        ((LinkedList) term25).add((Object)null);
        ((LinkedList) term25).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Publisher");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = "PAEBtnZtTD";
        args[1] = "sjlJAEtRrb";
        args[2] = term25;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


