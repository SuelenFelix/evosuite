package com.karankumar.booksapi.model;

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
import static com.karankumar.booksapi.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Integer;

public class Book_setIsbn13_210377751821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8154;

    public Book_setIsbn13_210377751821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8155 = new Long(-5386201758403679145L);
        HashMap term8170 = new HashMap();
        Set<Object> term8331 =  ((Map) term8170).keySet();
        HashSet term8169 = new HashSet((Collection<? extends Object>) term8331);
        Long term8176 = new Long(-7268507582722666254L);
        Long term8215 = new Long(5671808784468963649L);
        Integer term8229 = new Integer(-655067527);
        HashMap term8244 = new HashMap();
        Set<Object> term8382 =  ((Map) term8244).keySet();
        HashSet term8243 = new HashSet((Collection<? extends Object>) term8382);
        Long term8250 = new Long(2297097306706899827L);
        Long term8265 = new Long(-900457279156388404L);
        HashMap term8304 = new HashMap();
        Set<Object> term8423 =  ((Map) term8304).keySet();
        HashSet term8303 = new HashSet((Collection<? extends Object>) term8423);
        term8154 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term8175 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term8214 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term8249 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term8264 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term8154, term8154.getClass(), "id", term8155);
        setField(term8154, term8154.getClass(), "title", "vOuMEpOQAg");
        setField(term8154, term8154.getClass(), "authors", term8169);
        setField(term8175, term8175.getClass(), "id", term8176);
        setField(term8175, term8175.getClass(), "name", "SIODFGaQhr");
        setField(term8154, term8154.getClass(), "lang", term8175);
        setField(term8154, term8154.getClass(), "isbn10", "qYzsiuXOgS");
        setField(term8154, term8154.getClass(), "isbn13", "bxrCBbrrct");
        setField(term8214, term8214.getClass(), "id", term8215);
        setField(term8214, term8214.getClass(), "name", "CKWpJaaaxX");
        setField(term8154, term8154.getClass(), "genre", term8214);
        setField(term8154, term8154.getClass(), "yearOfPublication", term8229);
        setField(term8154, term8154.getClass(), "blurb", "UBRmXJmfrt");
        setField(term8154, term8154.getClass(), "publishers", term8243);
        setField(term8249, term8249.getClass(), "id", term8250);
        setField(term8249, term8249.getClass(), "formatName", "WZzvmIHhzZ");
        setField(term8154, term8154.getClass(), "publishingFormat", term8249);
        setField(term8264, term8264.getClass(), "id", term8265);
        setField(term8264, term8264.getClass(), "smallUrl", "doQLHkjpNm");
        setField(term8264, term8264.getClass(), "mediumUrl", "lCyLIcSuom");
        setField(term8264, term8264.getClass(), "largeUrl", "CGOpQSZZwI");
        setField(term8154, term8154.getClass(), "cover", term8264);
        setField(term8154, term8154.getClass(), "awards", term8303);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ypEdrstygY";
        callMethod(klass, "setIsbn13", argTypes, term8154, args);
    }

};


