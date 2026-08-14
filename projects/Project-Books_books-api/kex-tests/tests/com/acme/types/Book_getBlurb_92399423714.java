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

public class Book_getBlurb_92399423714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16838;

    public Book_getBlurb_92399423714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term16912 = new Integer(-130649791);
        ArrayList term16926 = new ArrayList();
        ArrayList term16935 = new ArrayList();
        ((ArrayList) term16935).add((Object)null);
        ((ArrayList) term16935).add((Object)null);
        ((ArrayList) term16935).add((Object)null);
        Object term16932 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term16932, term16932.getClass(), "id", "");
        setField(term16932, term16932.getClass(), "name", "");
        setField(term16932, term16932.getClass(), "books", term16935);
        ArrayList term16941 = new ArrayList();
        ((ArrayList) term16941).add((Object)null);
        ((ArrayList) term16941).add((Object)null);
        ((ArrayList) term16941).add((Object)null);
        ((ArrayList) term16941).add((Object)null);
        ((ArrayList) term16941).add((Object)null);
        ((ArrayList) term16941).add((Object)null);
        Object term16938 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term16938, term16938.getClass(), "id", "");
        setField(term16938, term16938.getClass(), "name", "");
        setField(term16938, term16938.getClass(), "books", term16941);
        ArrayList term16947 = new ArrayList();
        ((ArrayList) term16947).add((Object)null);
        ((ArrayList) term16947).add((Object)null);
        ((ArrayList) term16947).add((Object)null);
        ((ArrayList) term16947).add((Object)null);
        ((ArrayList) term16947).add((Object)null);
        ((ArrayList) term16947).add((Object)null);
        Object term16944 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term16944, term16944.getClass(), "id", "");
        setField(term16944, term16944.getClass(), "name", "");
        setField(term16944, term16944.getClass(), "books", term16947);
        ArrayList term16953 = new ArrayList();
        ((ArrayList) term16953).add((Object)null);
        ((ArrayList) term16953).add((Object)null);
        Object term16950 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term16950, term16950.getClass(), "id", "");
        setField(term16950, term16950.getClass(), "name", "");
        setField(term16950, term16950.getClass(), "books", term16953);
        ArrayList term16959 = new ArrayList();
        Object term16956 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term16956, term16956.getClass(), "id", "");
        setField(term16956, term16956.getClass(), "name", "");
        setField(term16956, term16956.getClass(), "books", term16959);
        ArrayList term16930 = new ArrayList();
        ((ArrayList) term16930).add(term16932);
        ((ArrayList) term16930).add(term16938);
        ((ArrayList) term16930).add(term16944);
        ((ArrayList) term16930).add(term16950);
        ((ArrayList) term16930).add(term16956);
        Class<? extends Object> term17256 = Class.forName((String) "com.acme.types.AwardName");
        Field term17255 = ((Class) term17256).getDeclaredField((String) "PORTICO_PRIZE");
        ((Field) term17255).setAccessible(true);
        Object enum44 = ((Field) term17255).get((Object) null);
        Object term17065 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term17065, term17065.getClass(), "id", "");
        setField(term17065, term17065.getClass(), "awardName", enum44);
        setField(term17065, term17065.getClass(), "category", "");
        setIntField(term17065, term17065.getClass(), "year", 267763294);
        Class<? extends Object> term17422 = Class.forName((String) "com.acme.types.AwardName");
        Field term17421 = ((Class) term17422).getDeclaredField((String) "BOOKER_INTER_PRIZE");
        ((Field) term17421).setAccessible(true);
        Object enum45 = ((Field) term17421).get((Object) null);
        Object term17071 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term17071, term17071.getClass(), "id", "");
        setField(term17071, term17071.getClass(), "awardName", enum45);
        setField(term17071, term17071.getClass(), "category", "");
        setIntField(term17071, term17071.getClass(), "year", -525257914);
        Object term17077 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term17077, term17077.getClass(), "id", "");
        setField(term17077, term17077.getClass(), "awardName", enum44);
        setField(term17077, term17077.getClass(), "category", "");
        setIntField(term17077, term17077.getClass(), "year", 147209682);
        Class<? extends Object> term17603 = Class.forName((String) "com.acme.types.AwardName");
        Field term17602 = ((Class) term17603).getDeclaredField((String) "WOMENS_PRIZE");
        ((Field) term17602).setAccessible(true);
        Object enum46 = ((Field) term17602).get((Object) null);
        Object term17081 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term17081, term17081.getClass(), "id", "");
        setField(term17081, term17081.getClass(), "awardName", enum46);
        setField(term17081, term17081.getClass(), "category", "");
        setIntField(term17081, term17081.getClass(), "year", -1183353915);
        Class<? extends Object> term17766 = Class.forName((String) "com.acme.types.AwardName");
        Field term17765 = ((Class) term17766).getDeclaredField((String) "BAILLIE_PRIZE");
        ((Field) term17765).setAccessible(true);
        Object enum47 = ((Field) term17765).get((Object) null);
        Object term17087 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term17087, term17087.getClass(), "id", "");
        setField(term17087, term17087.getClass(), "awardName", enum47);
        setField(term17087, term17087.getClass(), "category", "");
        setIntField(term17087, term17087.getClass(), "year", 1507074215);
        Object term17093 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term17093, term17093.getClass(), "id", "");
        setField(term17093, term17093.getClass(), "awardName", enum44);
        setField(term17093, term17093.getClass(), "category", "");
        setIntField(term17093, term17093.getClass(), "year", 49950830);
        Class<? extends Object> term17932 = Class.forName((String) "com.acme.types.AwardName");
        Field term17931 = ((Class) term17932).getDeclaredField((String) "DYLAN_PRIZE");
        ((Field) term17931).setAccessible(true);
        Object enum48 = ((Field) term17931).get((Object) null);
        Object term17097 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term17097, term17097.getClass(), "id", "");
        setField(term17097, term17097.getClass(), "awardName", enum48);
        setField(term17097, term17097.getClass(), "category", "");
        setIntField(term17097, term17097.getClass(), "year", 1935707624);
        ArrayList term17063 = new ArrayList();
        ((ArrayList) term17063).add(term17065);
        ((ArrayList) term17063).add(term17071);
        ((ArrayList) term17063).add(term17077);
        ((ArrayList) term17063).add(term17081);
        ((ArrayList) term17063).add(term17087);
        ((ArrayList) term17063).add(term17093);
        ((ArrayList) term17063).add(term17097);
        term16838 = newInstance(Class.forName("com.acme.types.Book"));
        Object term16887 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term16964 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term16989 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term17014 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term16838, term16838.getClass(), "id", "JVxVmSrZrh");
        setField(term16838, term16838.getClass(), "title", "xHynRanbSE");
        setField(term16838, term16838.getClass(), "isbn13", "ACdUTXxFxF");
        setField(term16838, term16838.getClass(), "isbn10", "MsjtvLqctc");
        setField(term16887, term16887.getClass(), "id", "omhBZktFpR");
        setField(term16887, term16887.getClass(), "name", "zEsjjlIKrF");
        setField(term16838, term16838.getClass(), "genre", term16887);
        setField(term16838, term16838.getClass(), "yearOfPublication", term16912);
        setField(term16838, term16838.getClass(), "blurb", "XeoSSCwSfl");
        setField(term16838, term16838.getClass(), "authors", term16926);
        setField(term16838, term16838.getClass(), "publishers", term16930);
        setField(term16964, term16964.getClass(), "id", "JlSzeHQccT");
        setField(term16964, term16964.getClass(), "name", "RGbggEITDh");
        setField(term16838, term16838.getClass(), "lang", term16964);
        setField(term16989, term16989.getClass(), "id", "QUvccjNkOP");
        setField(term16989, term16989.getClass(), "formatName", "tSAXbiQHko");
        setField(term16838, term16838.getClass(), "publishingFormat", term16989);
        setField(term17014, term17014.getClass(), "id", "YVEDjJuvaY");
        setField(term17014, term17014.getClass(), "smallUrl", "zVFIRDapJz");
        setField(term17014, term17014.getClass(), "mediumUrl", "loIwFxbUPE");
        setField(term17014, term17014.getClass(), "largeUrl", "VqpICJekjO");
        setField(term16838, term16838.getClass(), "cover", term17014);
        setField(term16838, term16838.getClass(), "awards", term17063);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBlurb", argTypes, term16838, args);
    }

};


