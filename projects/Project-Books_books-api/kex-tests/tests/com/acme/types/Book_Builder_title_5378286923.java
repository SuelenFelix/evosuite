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

public class Book_Builder_title_5378286923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40828;

    public Book_Builder_title_5378286923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term40902 = new Integer(173952451);
        ArrayList term40916 = new ArrayList();
        ArrayList term40925 = new ArrayList();
        ((ArrayList) term40925).add((Object)null);
        ((ArrayList) term40925).add((Object)null);
        ((ArrayList) term40925).add((Object)null);
        ((ArrayList) term40925).add((Object)null);
        ((ArrayList) term40925).add((Object)null);
        ((ArrayList) term40925).add((Object)null);
        ((ArrayList) term40925).add((Object)null);
        Object term40922 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term40922, term40922.getClass(), "id", "");
        setField(term40922, term40922.getClass(), "name", "");
        setField(term40922, term40922.getClass(), "books", term40925);
        ArrayList term40931 = new ArrayList();
        ((ArrayList) term40931).add((Object)null);
        ((ArrayList) term40931).add((Object)null);
        Object term40928 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term40928, term40928.getClass(), "id", "");
        setField(term40928, term40928.getClass(), "name", "");
        setField(term40928, term40928.getClass(), "books", term40931);
        ArrayList term40937 = new ArrayList();
        ((ArrayList) term40937).add((Object)null);
        ((ArrayList) term40937).add((Object)null);
        ((ArrayList) term40937).add((Object)null);
        ((ArrayList) term40937).add((Object)null);
        ((ArrayList) term40937).add((Object)null);
        ((ArrayList) term40937).add((Object)null);
        Object term40934 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term40934, term40934.getClass(), "id", "");
        setField(term40934, term40934.getClass(), "name", "");
        setField(term40934, term40934.getClass(), "books", term40937);
        ArrayList term40943 = new ArrayList();
        ((ArrayList) term40943).add((Object)null);
        ((ArrayList) term40943).add((Object)null);
        ((ArrayList) term40943).add((Object)null);
        ((ArrayList) term40943).add((Object)null);
        Object term40940 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term40940, term40940.getClass(), "id", "");
        setField(term40940, term40940.getClass(), "name", "");
        setField(term40940, term40940.getClass(), "books", term40943);
        ArrayList term40920 = new ArrayList();
        ((ArrayList) term40920).add(term40922);
        ((ArrayList) term40920).add(term40928);
        ((ArrayList) term40920).add(term40934);
        ((ArrayList) term40920).add(term40940);
        ((ArrayList) term40920).add(term40928);
        Class<? extends Object> term41226 = Class.forName((String) "com.acme.types.AwardName");
        Field term41225 = ((Class) term41226).getDeclaredField((String) "BOOKER_PRIZE");
        ((Field) term41225).setAccessible(true);
        Object enum106 = ((Field) term41225).get((Object) null);
        Object term41049 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term41049, term41049.getClass(), "id", "");
        setField(term41049, term41049.getClass(), "awardName", enum106);
        setField(term41049, term41049.getClass(), "category", "");
        setIntField(term41049, term41049.getClass(), "year", 990883365);
        Class<? extends Object> term41389 = Class.forName((String) "com.acme.types.AwardName");
        Field term41388 = ((Class) term41389).getDeclaredField((String) "BOOKER_INTER_PRIZE");
        ((Field) term41388).setAccessible(true);
        Object enum107 = ((Field) term41388).get((Object) null);
        Object term41055 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term41055, term41055.getClass(), "id", "");
        setField(term41055, term41055.getClass(), "awardName", enum107);
        setField(term41055, term41055.getClass(), "category", "");
        setIntField(term41055, term41055.getClass(), "year", 1467356494);
        ArrayList term41047 = new ArrayList();
        ((ArrayList) term41047).add(term41049);
        ((ArrayList) term41047).add(term41055);
        ((ArrayList) term41047).add(term41049);
        term40828 = newInstance(Class.forName("com.acme.types.Book$Builder"));
        Object term40877 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term40948 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term40973 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term40998 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term40828, term40828.getClass(), "id", "jxDxvRhFCL");
        setField(term40828, term40828.getClass(), "title", "GAedBERJiH");
        setField(term40828, term40828.getClass(), "isbn13", "FIPLXKyBVK");
        setField(term40828, term40828.getClass(), "isbn10", "QJefaGUvza");
        setField(term40877, term40877.getClass(), "id", "RlmgTSaZbY");
        setField(term40877, term40877.getClass(), "name", "vPFrEpbZbR");
        setField(term40828, term40828.getClass(), "genre", term40877);
        setField(term40828, term40828.getClass(), "yearOfPublication", term40902);
        setField(term40828, term40828.getClass(), "blurb", "DdlbPJoSMI");
        setField(term40828, term40828.getClass(), "authors", term40916);
        setField(term40828, term40828.getClass(), "publishers", term40920);
        setField(term40948, term40948.getClass(), "id", "kWjsKPCzRu");
        setField(term40948, term40948.getClass(), "name", "YsuKWZuxrx");
        setField(term40828, term40828.getClass(), "lang", term40948);
        setField(term40973, term40973.getClass(), "id", "nTKQaYhTDl");
        setField(term40973, term40973.getClass(), "formatName", "HHIoTJfFaY");
        setField(term40828, term40828.getClass(), "publishingFormat", term40973);
        setField(term40998, term40998.getClass(), "id", "kplFQjJBJv");
        setField(term40998, term40998.getClass(), "smallUrl", "WhViOMdYzv");
        setField(term40998, term40998.getClass(), "mediumUrl", "IMJKWmXUUI");
        setField(term40998, term40998.getClass(), "largeUrl", "UXdzlSiePo");
        setField(term40828, term40828.getClass(), "cover", term40998);
        setField(term40828, term40828.getClass(), "awards", term41047);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Book$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WHnGKqDFxQ";
        callMethod(klass, "title", argTypes, term40828, args);
    }

};


