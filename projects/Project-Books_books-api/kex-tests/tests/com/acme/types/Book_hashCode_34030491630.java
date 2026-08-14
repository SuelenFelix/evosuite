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

public class Book_hashCode_34030491630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32208;

    public Book_hashCode_34030491630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term32282 = new Integer(2143282300);
        ArrayList term32302 = new ArrayList();
        ((ArrayList) term32302).add((Object)null);
        ((ArrayList) term32302).add((Object)null);
        ((ArrayList) term32302).add((Object)null);
        ((ArrayList) term32302).add((Object)null);
        ((ArrayList) term32302).add((Object)null);
        ((ArrayList) term32302).add((Object)null);
        Object term32298 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term32298, term32298.getClass(), "id", "");
        setField(term32298, term32298.getClass(), "fullName", "");
        setField(term32298, term32298.getClass(), "about", "");
        setField(term32298, term32298.getClass(), "books", term32302);
        ArrayList term32309 = new ArrayList();
        ((ArrayList) term32309).add((Object)null);
        ((ArrayList) term32309).add((Object)null);
        ((ArrayList) term32309).add((Object)null);
        ((ArrayList) term32309).add((Object)null);
        ((ArrayList) term32309).add((Object)null);
        ((ArrayList) term32309).add((Object)null);
        ((ArrayList) term32309).add((Object)null);
        ((ArrayList) term32309).add((Object)null);
        ((ArrayList) term32309).add((Object)null);
        Object term32305 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term32305, term32305.getClass(), "id", "");
        setField(term32305, term32305.getClass(), "fullName", "");
        setField(term32305, term32305.getClass(), "about", "");
        setField(term32305, term32305.getClass(), "books", term32309);
        ArrayList term32316 = new ArrayList();
        ((ArrayList) term32316).add((Object)null);
        ((ArrayList) term32316).add((Object)null);
        Object term32312 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term32312, term32312.getClass(), "id", "");
        setField(term32312, term32312.getClass(), "fullName", "");
        setField(term32312, term32312.getClass(), "about", "");
        setField(term32312, term32312.getClass(), "books", term32316);
        ArrayList term32323 = new ArrayList();
        ((ArrayList) term32323).add((Object)null);
        ((ArrayList) term32323).add((Object)null);
        ((ArrayList) term32323).add((Object)null);
        ((ArrayList) term32323).add((Object)null);
        ((ArrayList) term32323).add((Object)null);
        ((ArrayList) term32323).add((Object)null);
        ((ArrayList) term32323).add((Object)null);
        Object term32319 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term32319, term32319.getClass(), "id", "");
        setField(term32319, term32319.getClass(), "fullName", "");
        setField(term32319, term32319.getClass(), "about", "");
        setField(term32319, term32319.getClass(), "books", term32323);
        ArrayList term32330 = new ArrayList();
        ((ArrayList) term32330).add((Object)null);
        ((ArrayList) term32330).add((Object)null);
        ((ArrayList) term32330).add((Object)null);
        ((ArrayList) term32330).add((Object)null);
        ((ArrayList) term32330).add((Object)null);
        ((ArrayList) term32330).add((Object)null);
        Object term32326 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term32326, term32326.getClass(), "id", "");
        setField(term32326, term32326.getClass(), "fullName", "");
        setField(term32326, term32326.getClass(), "about", "");
        setField(term32326, term32326.getClass(), "books", term32330);
        ArrayList term32296 = new ArrayList();
        ((ArrayList) term32296).add(term32298);
        ((ArrayList) term32296).add(term32305);
        ((ArrayList) term32296).add(term32312);
        ((ArrayList) term32296).add(term32319);
        ((ArrayList) term32296).add(term32326);
        ((ArrayList) term32296).add(term32298);
        ((ArrayList) term32296).add(term32312);
        ArrayList term32335 = new ArrayList();
        ArrayList term32438 = new ArrayList();
        term32208 = newInstance(Class.forName("com.acme.types.Book"));
        Object term32257 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term32339 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term32364 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term32389 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term32208, term32208.getClass(), "id", "NFDAfgipvv");
        setField(term32208, term32208.getClass(), "title", "iDqyyAyaWC");
        setField(term32208, term32208.getClass(), "isbn13", "JWnRzsRhyi");
        setField(term32208, term32208.getClass(), "isbn10", "OajYNYoFoO");
        setField(term32257, term32257.getClass(), "id", "YmnfzUxjAx");
        setField(term32257, term32257.getClass(), "name", "BoxVogOjdw");
        setField(term32208, term32208.getClass(), "genre", term32257);
        setField(term32208, term32208.getClass(), "yearOfPublication", term32282);
        setField(term32208, term32208.getClass(), "blurb", "pOmruQmOzy");
        setField(term32208, term32208.getClass(), "authors", term32296);
        setField(term32208, term32208.getClass(), "publishers", term32335);
        setField(term32339, term32339.getClass(), "id", "ZWrQCNaFQY");
        setField(term32339, term32339.getClass(), "name", "vaFDDTDudR");
        setField(term32208, term32208.getClass(), "lang", term32339);
        setField(term32364, term32364.getClass(), "id", "PBRoPqwJHd");
        setField(term32364, term32364.getClass(), "formatName", "BJLEkBhnQC");
        setField(term32208, term32208.getClass(), "publishingFormat", term32364);
        setField(term32389, term32389.getClass(), "id", "yKmAEOsHku");
        setField(term32389, term32389.getClass(), "smallUrl", "omxqgDuzgA");
        setField(term32389, term32389.getClass(), "mediumUrl", "XPPobohnTM");
        setField(term32389, term32389.getClass(), "largeUrl", "BcnTjlnsHF");
        setField(term32208, term32208.getClass(), "cover", term32389);
        setField(term32208, term32208.getClass(), "awards", term32438);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term32208, args);
    }

};


