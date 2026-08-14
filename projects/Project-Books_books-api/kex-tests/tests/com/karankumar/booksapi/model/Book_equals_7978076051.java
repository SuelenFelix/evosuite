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

public class Book_equals_7978076051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2908;
     Object term3063;

    public Book_equals_7978076051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2909 = new Long(-872011222785455006L);
        HashMap term2924 = new HashMap();
        Set<Object> term3074 =  ((Map) term2924).keySet();
        HashSet term2923 = new HashSet((Collection<? extends Object>) term3074);
        Long term2930 = new Long(-316468845751588286L);
        Long term2969 = new Long(5127676408959197577L);
        Integer term2983 = new Integer(568599855);
        HashMap term2998 = new HashMap();
        Set<Object> term3125 =  ((Map) term2998).keySet();
        HashSet term2997 = new HashSet((Collection<? extends Object>) term3125);
        Long term3004 = new Long(-6573104506744284592L);
        Long term3019 = new Long(-4920224193275732920L);
        HashMap term3058 = new HashMap();
        Set<Object> term3166 =  ((Map) term3058).keySet();
        HashSet term3057 = new HashSet((Collection<? extends Object>) term3166);
        term2908 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term2929 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term2968 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term3003 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term3018 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term2908, term2908.getClass(), "id", term2909);
        setField(term2908, term2908.getClass(), "title", "hxCBltsObl");
        setField(term2908, term2908.getClass(), "authors", term2923);
        setField(term2929, term2929.getClass(), "id", term2930);
        setField(term2929, term2929.getClass(), "name", "BndsHwAFMv");
        setField(term2908, term2908.getClass(), "lang", term2929);
        setField(term2908, term2908.getClass(), "isbn10", "GzFkzHGYFt");
        setField(term2908, term2908.getClass(), "isbn13", "tShwQLRGNe");
        setField(term2968, term2968.getClass(), "id", term2969);
        setField(term2968, term2968.getClass(), "name", "LvtrsXUliU");
        setField(term2908, term2908.getClass(), "genre", term2968);
        setField(term2908, term2908.getClass(), "yearOfPublication", term2983);
        setField(term2908, term2908.getClass(), "blurb", "xLbjWUgOIL");
        setField(term2908, term2908.getClass(), "publishers", term2997);
        setField(term3003, term3003.getClass(), "id", term3004);
        setField(term3003, term3003.getClass(), "formatName", "jDtqGUpnZN");
        setField(term2908, term2908.getClass(), "publishingFormat", term3003);
        setField(term3018, term3018.getClass(), "id", term3019);
        setField(term3018, term3018.getClass(), "smallUrl", "nGKItKLYNC");
        setField(term3018, term3018.getClass(), "mediumUrl", "UiUYnPrcCi");
        setField(term3018, term3018.getClass(), "largeUrl", "UoYtihxVaS");
        setField(term2908, term2908.getClass(), "cover", term3018);
        setField(term2908, term2908.getClass(), "awards", term3057);
        term3063 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3063;
        callMethod(klass, "equals", argTypes, term2908, args);
    }

};


