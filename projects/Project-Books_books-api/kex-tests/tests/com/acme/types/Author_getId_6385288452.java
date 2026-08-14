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

public class Author_getId_6385288452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33644;

    public Author_getId_6385288452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term33689 = new Integer(1003743923);
        ArrayList term33692 = new ArrayList();
        ((ArrayList) term33692).add((Object)null);
        ((ArrayList) term33692).add((Object)null);
        ((ArrayList) term33692).add((Object)null);
        ((ArrayList) term33692).add((Object)null);
        ((ArrayList) term33692).add((Object)null);
        ((ArrayList) term33692).add((Object)null);
        ((ArrayList) term33692).add((Object)null);
        ArrayList term33695 = new ArrayList();
        ((ArrayList) term33695).add((Object)null);
        ((ArrayList) term33695).add((Object)null);
        ((ArrayList) term33695).add((Object)null);
        ((ArrayList) term33695).add((Object)null);
        ArrayList term33701 = new ArrayList();
        ((ArrayList) term33701).add((Object)null);
        ((ArrayList) term33701).add((Object)null);
        ((ArrayList) term33701).add((Object)null);
        ((ArrayList) term33701).add((Object)null);
        ((ArrayList) term33701).add((Object)null);
        ((ArrayList) term33701).add((Object)null);
        ((ArrayList) term33701).add((Object)null);
        ((ArrayList) term33701).add((Object)null);
        Object term33683 = newInstance(Class.forName("com.acme.types.Book"));
        Object term33688 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term33698 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term33699 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term33700 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term33683, term33683.getClass(), "id", "");
        setField(term33683, term33683.getClass(), "title", "");
        setField(term33683, term33683.getClass(), "isbn13", "");
        setField(term33683, term33683.getClass(), "isbn10", "");
        setField(term33688, term33688.getClass(), "id", null);
        setField(term33688, term33688.getClass(), "name", null);
        setField(term33683, term33683.getClass(), "genre", term33688);
        setField(term33683, term33683.getClass(), "yearOfPublication", term33689);
        setField(term33683, term33683.getClass(), "blurb", "");
        setField(term33683, term33683.getClass(), "authors", term33692);
        setField(term33683, term33683.getClass(), "publishers", term33695);
        setField(term33698, term33698.getClass(), "id", null);
        setField(term33698, term33698.getClass(), "name", null);
        setField(term33683, term33683.getClass(), "lang", term33698);
        setField(term33699, term33699.getClass(), "id", null);
        setField(term33699, term33699.getClass(), "formatName", null);
        setField(term33683, term33683.getClass(), "publishingFormat", term33699);
        setField(term33700, term33700.getClass(), "id", null);
        setField(term33700, term33700.getClass(), "smallUrl", null);
        setField(term33700, term33700.getClass(), "mediumUrl", null);
        setField(term33700, term33700.getClass(), "largeUrl", null);
        setField(term33683, term33683.getClass(), "cover", term33700);
        setField(term33683, term33683.getClass(), "awards", term33701);
        ArrayList term33681 = new ArrayList();
        ((ArrayList) term33681).add(term33683);
        term33644 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term33644, term33644.getClass(), "id", "eSqgLQrNqK");
        setField(term33644, term33644.getClass(), "fullName", "wOeEJTeZMX");
        setField(term33644, term33644.getClass(), "about", "AcApCVcwZJ");
        setField(term33644, term33644.getClass(), "books", term33681);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Author");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term33644, args);
    }

};


