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

public class Book_Builder_isbn10_20490299695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42329;

    public Book_Builder_isbn10_20490299695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term42403 = new Integer(794352120);
        ArrayList term42423 = new ArrayList();
        ((ArrayList) term42423).add((Object)null);
        ((ArrayList) term42423).add((Object)null);
        ((ArrayList) term42423).add((Object)null);
        ((ArrayList) term42423).add((Object)null);
        ((ArrayList) term42423).add((Object)null);
        ((ArrayList) term42423).add((Object)null);
        ((ArrayList) term42423).add((Object)null);
        ((ArrayList) term42423).add((Object)null);
        Object term42419 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term42419, term42419.getClass(), "id", "");
        setField(term42419, term42419.getClass(), "fullName", "");
        setField(term42419, term42419.getClass(), "about", "");
        setField(term42419, term42419.getClass(), "books", term42423);
        ArrayList term42430 = new ArrayList();
        ((ArrayList) term42430).add((Object)null);
        ((ArrayList) term42430).add((Object)null);
        ((ArrayList) term42430).add((Object)null);
        ((ArrayList) term42430).add((Object)null);
        Object term42426 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term42426, term42426.getClass(), "id", "");
        setField(term42426, term42426.getClass(), "fullName", "");
        setField(term42426, term42426.getClass(), "about", "");
        setField(term42426, term42426.getClass(), "books", term42430);
        ArrayList term42437 = new ArrayList();
        ((ArrayList) term42437).add((Object)null);
        ((ArrayList) term42437).add((Object)null);
        ((ArrayList) term42437).add((Object)null);
        ((ArrayList) term42437).add((Object)null);
        ((ArrayList) term42437).add((Object)null);
        ((ArrayList) term42437).add((Object)null);
        Object term42433 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term42433, term42433.getClass(), "id", "");
        setField(term42433, term42433.getClass(), "fullName", "");
        setField(term42433, term42433.getClass(), "about", "");
        setField(term42433, term42433.getClass(), "books", term42437);
        ArrayList term42444 = new ArrayList();
        ((ArrayList) term42444).add((Object)null);
        ((ArrayList) term42444).add((Object)null);
        ((ArrayList) term42444).add((Object)null);
        Object term42440 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term42440, term42440.getClass(), "id", "");
        setField(term42440, term42440.getClass(), "fullName", "");
        setField(term42440, term42440.getClass(), "about", "");
        setField(term42440, term42440.getClass(), "books", term42444);
        ArrayList term42451 = new ArrayList();
        ((ArrayList) term42451).add((Object)null);
        ((ArrayList) term42451).add((Object)null);
        ((ArrayList) term42451).add((Object)null);
        ((ArrayList) term42451).add((Object)null);
        Object term42447 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term42447, term42447.getClass(), "id", "");
        setField(term42447, term42447.getClass(), "fullName", "");
        setField(term42447, term42447.getClass(), "about", "");
        setField(term42447, term42447.getClass(), "books", term42451);
        ArrayList term42458 = new ArrayList();
        ((ArrayList) term42458).add((Object)null);
        ((ArrayList) term42458).add((Object)null);
        ((ArrayList) term42458).add((Object)null);
        ((ArrayList) term42458).add((Object)null);
        ((ArrayList) term42458).add((Object)null);
        ((ArrayList) term42458).add((Object)null);
        Object term42454 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term42454, term42454.getClass(), "id", "");
        setField(term42454, term42454.getClass(), "fullName", "");
        setField(term42454, term42454.getClass(), "about", "");
        setField(term42454, term42454.getClass(), "books", term42458);
        ArrayList term42417 = new ArrayList();
        ((ArrayList) term42417).add(term42419);
        ((ArrayList) term42417).add(term42426);
        ((ArrayList) term42417).add(term42433);
        ((ArrayList) term42417).add(term42426);
        ((ArrayList) term42417).add(term42440);
        ((ArrayList) term42417).add(term42447);
        ((ArrayList) term42417).add(term42454);
        ArrayList term42468 = new ArrayList();
        ((ArrayList) term42468).add((Object)null);
        ((ArrayList) term42468).add((Object)null);
        ((ArrayList) term42468).add((Object)null);
        Object term42465 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term42465, term42465.getClass(), "id", "");
        setField(term42465, term42465.getClass(), "name", "");
        setField(term42465, term42465.getClass(), "books", term42468);
        ArrayList term42463 = new ArrayList();
        ((ArrayList) term42463).add(term42465);
        Class<? extends Object> term42751 = Class.forName((String) "com.acme.types.AwardName");
        Field term42750 = ((Class) term42751).getDeclaredField((String) "DYLAN_PRIZE");
        ((Field) term42750).setAccessible(true);
        Object enum110 = ((Field) term42750).get((Object) null);
        Object term42574 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term42574, term42574.getClass(), "id", "");
        setField(term42574, term42574.getClass(), "awardName", enum110);
        setField(term42574, term42574.getClass(), "category", "");
        setIntField(term42574, term42574.getClass(), "year", 895255351);
        Class<? extends Object> term42911 = Class.forName((String) "com.acme.types.AwardName");
        Field term42910 = ((Class) term42911).getDeclaredField((String) "WOMENS_PRIZE");
        ((Field) term42910).setAccessible(true);
        Object enum111 = ((Field) term42910).get((Object) null);
        Object term42580 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term42580, term42580.getClass(), "id", "");
        setField(term42580, term42580.getClass(), "awardName", enum111);
        setField(term42580, term42580.getClass(), "category", "");
        setIntField(term42580, term42580.getClass(), "year", -1271375703);
        ArrayList term42572 = new ArrayList();
        ((ArrayList) term42572).add(term42574);
        ((ArrayList) term42572).add(term42580);
        term42329 = newInstance(Class.forName("com.acme.types.Book$Builder"));
        Object term42378 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term42473 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term42498 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term42523 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term42329, term42329.getClass(), "id", "FBOfAPLuIC");
        setField(term42329, term42329.getClass(), "title", "xbYgogKAOs");
        setField(term42329, term42329.getClass(), "isbn13", "UnZDIuIXHA");
        setField(term42329, term42329.getClass(), "isbn10", "eMDKISPEZX");
        setField(term42378, term42378.getClass(), "id", "MIEslfcwLI");
        setField(term42378, term42378.getClass(), "name", "rRfAmPuglL");
        setField(term42329, term42329.getClass(), "genre", term42378);
        setField(term42329, term42329.getClass(), "yearOfPublication", term42403);
        setField(term42329, term42329.getClass(), "blurb", "sGsdsrdUQi");
        setField(term42329, term42329.getClass(), "authors", term42417);
        setField(term42329, term42329.getClass(), "publishers", term42463);
        setField(term42473, term42473.getClass(), "id", "EeIJlPEevc");
        setField(term42473, term42473.getClass(), "name", "dKIQEFzYdb");
        setField(term42329, term42329.getClass(), "lang", term42473);
        setField(term42498, term42498.getClass(), "id", "vTHGXQRmdx");
        setField(term42498, term42498.getClass(), "formatName", "uUqNYoBspc");
        setField(term42329, term42329.getClass(), "publishingFormat", term42498);
        setField(term42523, term42523.getClass(), "id", "IkzGQgLbPx");
        setField(term42523, term42523.getClass(), "smallUrl", "FPJZmNwXeA");
        setField(term42523, term42523.getClass(), "mediumUrl", "KGEYpqhyix");
        setField(term42523, term42523.getClass(), "largeUrl", "aGfTbfKkta");
        setField(term42329, term42329.getClass(), "cover", term42523);
        setField(term42329, term42329.getClass(), "awards", term42572);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Book$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "gPjxhkCfLk";
        callMethod(klass, "isbn10", argTypes, term42329, args);
    }

};


