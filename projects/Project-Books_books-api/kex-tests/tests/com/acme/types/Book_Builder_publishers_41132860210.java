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
import java.util.LinkedList;

public class Book_Builder_publishers_41132860210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46304;
     Object term46563;

    public Book_Builder_publishers_41132860210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term46378 = new Integer(-1551355284);
        ArrayList term46398 = new ArrayList();
        ((ArrayList) term46398).add((Object)null);
        Object term46394 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term46394, term46394.getClass(), "id", "");
        setField(term46394, term46394.getClass(), "fullName", "");
        setField(term46394, term46394.getClass(), "about", "");
        setField(term46394, term46394.getClass(), "books", term46398);
        ArrayList term46405 = new ArrayList();
        ((ArrayList) term46405).add((Object)null);
        ((ArrayList) term46405).add((Object)null);
        ((ArrayList) term46405).add((Object)null);
        ((ArrayList) term46405).add((Object)null);
        ((ArrayList) term46405).add((Object)null);
        ((ArrayList) term46405).add((Object)null);
        Object term46401 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term46401, term46401.getClass(), "id", "");
        setField(term46401, term46401.getClass(), "fullName", "");
        setField(term46401, term46401.getClass(), "about", "");
        setField(term46401, term46401.getClass(), "books", term46405);
        ArrayList term46392 = new ArrayList();
        ((ArrayList) term46392).add(term46394);
        ((ArrayList) term46392).add(term46401);
        ArrayList term46415 = new ArrayList();
        ((ArrayList) term46415).add((Object)null);
        ((ArrayList) term46415).add((Object)null);
        ((ArrayList) term46415).add((Object)null);
        ((ArrayList) term46415).add((Object)null);
        ((ArrayList) term46415).add((Object)null);
        Object term46412 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term46412, term46412.getClass(), "id", "");
        setField(term46412, term46412.getClass(), "name", "");
        setField(term46412, term46412.getClass(), "books", term46415);
        ArrayList term46421 = new ArrayList();
        ((ArrayList) term46421).add((Object)null);
        ((ArrayList) term46421).add((Object)null);
        ((ArrayList) term46421).add((Object)null);
        ((ArrayList) term46421).add((Object)null);
        ((ArrayList) term46421).add((Object)null);
        ((ArrayList) term46421).add((Object)null);
        ((ArrayList) term46421).add((Object)null);
        ((ArrayList) term46421).add((Object)null);
        ((ArrayList) term46421).add((Object)null);
        Object term46418 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term46418, term46418.getClass(), "id", "");
        setField(term46418, term46418.getClass(), "name", "");
        setField(term46418, term46418.getClass(), "books", term46421);
        ArrayList term46427 = new ArrayList();
        ((ArrayList) term46427).add((Object)null);
        Object term46424 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term46424, term46424.getClass(), "id", "");
        setField(term46424, term46424.getClass(), "name", "");
        setField(term46424, term46424.getClass(), "books", term46427);
        ArrayList term46433 = new ArrayList();
        ((ArrayList) term46433).add((Object)null);
        ((ArrayList) term46433).add((Object)null);
        ((ArrayList) term46433).add((Object)null);
        Object term46430 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term46430, term46430.getClass(), "id", "");
        setField(term46430, term46430.getClass(), "name", "");
        setField(term46430, term46430.getClass(), "books", term46433);
        ArrayList term46439 = new ArrayList();
        ((ArrayList) term46439).add((Object)null);
        ((ArrayList) term46439).add((Object)null);
        ((ArrayList) term46439).add((Object)null);
        ((ArrayList) term46439).add((Object)null);
        ((ArrayList) term46439).add((Object)null);
        ((ArrayList) term46439).add((Object)null);
        ((ArrayList) term46439).add((Object)null);
        ((ArrayList) term46439).add((Object)null);
        ((ArrayList) term46439).add((Object)null);
        Object term46436 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term46436, term46436.getClass(), "id", "");
        setField(term46436, term46436.getClass(), "name", "");
        setField(term46436, term46436.getClass(), "books", term46439);
        ArrayList term46410 = new ArrayList();
        ((ArrayList) term46410).add(term46412);
        ((ArrayList) term46410).add(term46418);
        ((ArrayList) term46410).add(term46424);
        ((ArrayList) term46410).add(term46430);
        ((ArrayList) term46410).add(term46436);
        ((ArrayList) term46410).add(term46418);
        Class<? extends Object> term46717 = Class.forName((String) "com.acme.types.AwardName");
        Field term46716 = ((Class) term46717).getDeclaredField((String) "BOOKER_INTER_PRIZE");
        ((Field) term46716).setAccessible(true);
        Object enum121 = ((Field) term46716).get((Object) null);
        Object term46545 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term46545, term46545.getClass(), "id", "");
        setField(term46545, term46545.getClass(), "awardName", enum121);
        setField(term46545, term46545.getClass(), "category", "");
        setIntField(term46545, term46545.getClass(), "year", -457396133);
        Class<? extends Object> term46898 = Class.forName((String) "com.acme.types.AwardName");
        Field term46897 = ((Class) term46898).getDeclaredField((String) "WOMENS_PRIZE");
        ((Field) term46897).setAccessible(true);
        Object enum122 = ((Field) term46897).get((Object) null);
        Object term46551 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term46551, term46551.getClass(), "id", "");
        setField(term46551, term46551.getClass(), "awardName", enum122);
        setField(term46551, term46551.getClass(), "category", "");
        setIntField(term46551, term46551.getClass(), "year", 1131398807);
        Object term46557 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term46557, term46557.getClass(), "id", "");
        setField(term46557, term46557.getClass(), "awardName", enum122);
        setField(term46557, term46557.getClass(), "category", "");
        setIntField(term46557, term46557.getClass(), "year", 1091954101);
        ArrayList term46543 = new ArrayList();
        ((ArrayList) term46543).add(term46545);
        ((ArrayList) term46543).add(term46545);
        ((ArrayList) term46543).add(term46551);
        ((ArrayList) term46543).add(term46557);
        term46304 = newInstance(Class.forName("com.acme.types.Book$Builder"));
        Object term46353 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term46444 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term46469 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term46494 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term46304, term46304.getClass(), "id", "CYIpFuDamr");
        setField(term46304, term46304.getClass(), "title", "sxJcsGVuNR");
        setField(term46304, term46304.getClass(), "isbn13", "BOumwUXrue");
        setField(term46304, term46304.getClass(), "isbn10", "cdlFVFluta");
        setField(term46353, term46353.getClass(), "id", "UqxvaMoKgA");
        setField(term46353, term46353.getClass(), "name", "EBMZKuhVUp");
        setField(term46304, term46304.getClass(), "genre", term46353);
        setField(term46304, term46304.getClass(), "yearOfPublication", term46378);
        setField(term46304, term46304.getClass(), "blurb", "hlimeEcsNp");
        setField(term46304, term46304.getClass(), "authors", term46392);
        setField(term46304, term46304.getClass(), "publishers", term46410);
        setField(term46444, term46444.getClass(), "id", "TJamUXzKwL");
        setField(term46444, term46444.getClass(), "name", "NefUeTpLNQ");
        setField(term46304, term46304.getClass(), "lang", term46444);
        setField(term46469, term46469.getClass(), "id", "fkoYwHvULG");
        setField(term46469, term46469.getClass(), "formatName", "hCGkeVUnyl");
        setField(term46304, term46304.getClass(), "publishingFormat", term46469);
        setField(term46494, term46494.getClass(), "id", "cXGPSCFmzx");
        setField(term46494, term46494.getClass(), "smallUrl", "StllJtCsUw");
        setField(term46494, term46494.getClass(), "mediumUrl", "vWQQZntGOv");
        setField(term46494, term46494.getClass(), "largeUrl", "yxlVzXBuqU");
        setField(term46304, term46304.getClass(), "cover", term46494);
        setField(term46304, term46304.getClass(), "awards", term46543);
        term46563 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Book$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term46563;
        callMethod(klass, "publishers", argTypes, term46304, args);
    }

};


