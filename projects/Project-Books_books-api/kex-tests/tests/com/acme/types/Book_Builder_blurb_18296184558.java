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

public class Book_Builder_blurb_18296184558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45140;

    public Book_Builder_blurb_18296184558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term45214 = new Integer(1787325291);
        ArrayList term45234 = new ArrayList();
        ((ArrayList) term45234).add((Object)null);
        ((ArrayList) term45234).add((Object)null);
        ((ArrayList) term45234).add((Object)null);
        ((ArrayList) term45234).add((Object)null);
        ((ArrayList) term45234).add((Object)null);
        ((ArrayList) term45234).add((Object)null);
        ((ArrayList) term45234).add((Object)null);
        Object term45230 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term45230, term45230.getClass(), "id", "");
        setField(term45230, term45230.getClass(), "fullName", "");
        setField(term45230, term45230.getClass(), "about", "");
        setField(term45230, term45230.getClass(), "books", term45234);
        ArrayList term45241 = new ArrayList();
        ((ArrayList) term45241).add((Object)null);
        ((ArrayList) term45241).add((Object)null);
        ((ArrayList) term45241).add((Object)null);
        ((ArrayList) term45241).add((Object)null);
        ((ArrayList) term45241).add((Object)null);
        Object term45237 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term45237, term45237.getClass(), "id", "");
        setField(term45237, term45237.getClass(), "fullName", "");
        setField(term45237, term45237.getClass(), "about", "");
        setField(term45237, term45237.getClass(), "books", term45241);
        ArrayList term45248 = new ArrayList();
        ((ArrayList) term45248).add((Object)null);
        ((ArrayList) term45248).add((Object)null);
        ((ArrayList) term45248).add((Object)null);
        ((ArrayList) term45248).add((Object)null);
        Object term45244 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term45244, term45244.getClass(), "id", "");
        setField(term45244, term45244.getClass(), "fullName", "");
        setField(term45244, term45244.getClass(), "about", "");
        setField(term45244, term45244.getClass(), "books", term45248);
        ArrayList term45255 = new ArrayList();
        ((ArrayList) term45255).add((Object)null);
        ((ArrayList) term45255).add((Object)null);
        ((ArrayList) term45255).add((Object)null);
        ((ArrayList) term45255).add((Object)null);
        Object term45251 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term45251, term45251.getClass(), "id", "");
        setField(term45251, term45251.getClass(), "fullName", "");
        setField(term45251, term45251.getClass(), "about", "");
        setField(term45251, term45251.getClass(), "books", term45255);
        ArrayList term45228 = new ArrayList();
        ((ArrayList) term45228).add(term45230);
        ((ArrayList) term45228).add(term45237);
        ((ArrayList) term45228).add(term45244);
        ((ArrayList) term45228).add(term45251);
        ArrayList term45265 = new ArrayList();
        ((ArrayList) term45265).add((Object)null);
        ((ArrayList) term45265).add((Object)null);
        Object term45262 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term45262, term45262.getClass(), "id", "");
        setField(term45262, term45262.getClass(), "name", "");
        setField(term45262, term45262.getClass(), "books", term45265);
        ArrayList term45271 = new ArrayList();
        ((ArrayList) term45271).add((Object)null);
        ((ArrayList) term45271).add((Object)null);
        Object term45268 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term45268, term45268.getClass(), "id", "");
        setField(term45268, term45268.getClass(), "name", "");
        setField(term45268, term45268.getClass(), "books", term45271);
        ArrayList term45277 = new ArrayList();
        ((ArrayList) term45277).add((Object)null);
        ((ArrayList) term45277).add((Object)null);
        ((ArrayList) term45277).add((Object)null);
        ((ArrayList) term45277).add((Object)null);
        ((ArrayList) term45277).add((Object)null);
        ((ArrayList) term45277).add((Object)null);
        ((ArrayList) term45277).add((Object)null);
        Object term45274 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term45274, term45274.getClass(), "id", "");
        setField(term45274, term45274.getClass(), "name", "");
        setField(term45274, term45274.getClass(), "books", term45277);
        ArrayList term45260 = new ArrayList();
        ((ArrayList) term45260).add(term45262);
        ((ArrayList) term45260).add(term45268);
        ((ArrayList) term45260).add(term45274);
        Class<? extends Object> term45560 = Class.forName((String) "com.acme.types.AwardName");
        Field term45559 = ((Class) term45560).getDeclaredField((String) "NOBEL_PRIZE");
        ((Field) term45559).setAccessible(true);
        Object enum119 = ((Field) term45559).get((Object) null);
        Object term45383 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term45383, term45383.getClass(), "id", "");
        setField(term45383, term45383.getClass(), "awardName", enum119);
        setField(term45383, term45383.getClass(), "category", "");
        setIntField(term45383, term45383.getClass(), "year", -1626451656);
        Class<? extends Object> term45720 = Class.forName((String) "com.acme.types.AwardName");
        Field term45719 = ((Class) term45720).getDeclaredField((String) "BOOKER_PRIZE");
        ((Field) term45719).setAccessible(true);
        Object enum120 = ((Field) term45719).get((Object) null);
        Object term45389 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term45389, term45389.getClass(), "id", "");
        setField(term45389, term45389.getClass(), "awardName", enum120);
        setField(term45389, term45389.getClass(), "category", "");
        setIntField(term45389, term45389.getClass(), "year", 1465188553);
        ArrayList term45381 = new ArrayList();
        ((ArrayList) term45381).add(term45383);
        ((ArrayList) term45381).add(term45383);
        ((ArrayList) term45381).add(term45389);
        term45140 = newInstance(Class.forName("com.acme.types.Book$Builder"));
        Object term45189 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term45282 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term45307 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term45332 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term45140, term45140.getClass(), "id", "EzqLuoAErx");
        setField(term45140, term45140.getClass(), "title", "gJbghjSWZE");
        setField(term45140, term45140.getClass(), "isbn13", "lgXWUgCLEC");
        setField(term45140, term45140.getClass(), "isbn10", "ageKjiNZJF");
        setField(term45189, term45189.getClass(), "id", "pHoVNmTjsq");
        setField(term45189, term45189.getClass(), "name", "sEIrFKQEmz");
        setField(term45140, term45140.getClass(), "genre", term45189);
        setField(term45140, term45140.getClass(), "yearOfPublication", term45214);
        setField(term45140, term45140.getClass(), "blurb", "pCQEQcJECm");
        setField(term45140, term45140.getClass(), "authors", term45228);
        setField(term45140, term45140.getClass(), "publishers", term45260);
        setField(term45282, term45282.getClass(), "id", "fDckXhjKUI");
        setField(term45282, term45282.getClass(), "name", "GFnDdCTvkm");
        setField(term45140, term45140.getClass(), "lang", term45282);
        setField(term45307, term45307.getClass(), "id", "MdsaySFwcm");
        setField(term45307, term45307.getClass(), "formatName", "svaWMsCxlJ");
        setField(term45140, term45140.getClass(), "publishingFormat", term45307);
        setField(term45332, term45332.getClass(), "id", "AOsXCQuXcJ");
        setField(term45332, term45332.getClass(), "smallUrl", "IpERoDpbaC");
        setField(term45332, term45332.getClass(), "mediumUrl", "eoqcisqfPS");
        setField(term45332, term45332.getClass(), "largeUrl", "vvVYGhJxJA");
        setField(term45140, term45140.getClass(), "cover", term45332);
        setField(term45140, term45140.getClass(), "awards", term45381);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Book$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fLUVgxCPEd";
        callMethod(klass, "blurb", argTypes, term45140, args);
    }

};


