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

public class Book_Builder_genre_20260687666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43083;
     Object term43347;

    public Book_Builder_genre_20260687666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term43157 = new Integer(-344907703);
        ArrayList term43177 = new ArrayList();
        ((ArrayList) term43177).add((Object)null);
        ((ArrayList) term43177).add((Object)null);
        ((ArrayList) term43177).add((Object)null);
        ((ArrayList) term43177).add((Object)null);
        ((ArrayList) term43177).add((Object)null);
        Object term43173 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term43173, term43173.getClass(), "id", "");
        setField(term43173, term43173.getClass(), "fullName", "");
        setField(term43173, term43173.getClass(), "about", "");
        setField(term43173, term43173.getClass(), "books", term43177);
        ArrayList term43171 = new ArrayList();
        ((ArrayList) term43171).add(term43173);
        ArrayList term43187 = new ArrayList();
        ((ArrayList) term43187).add((Object)null);
        ((ArrayList) term43187).add((Object)null);
        ((ArrayList) term43187).add((Object)null);
        Object term43184 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term43184, term43184.getClass(), "id", "");
        setField(term43184, term43184.getClass(), "name", "");
        setField(term43184, term43184.getClass(), "books", term43187);
        ArrayList term43193 = new ArrayList();
        ((ArrayList) term43193).add((Object)null);
        ((ArrayList) term43193).add((Object)null);
        ((ArrayList) term43193).add((Object)null);
        ((ArrayList) term43193).add((Object)null);
        ((ArrayList) term43193).add((Object)null);
        ((ArrayList) term43193).add((Object)null);
        Object term43190 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term43190, term43190.getClass(), "id", "");
        setField(term43190, term43190.getClass(), "name", "");
        setField(term43190, term43190.getClass(), "books", term43193);
        ArrayList term43199 = new ArrayList();
        ((ArrayList) term43199).add((Object)null);
        ((ArrayList) term43199).add((Object)null);
        ((ArrayList) term43199).add((Object)null);
        ((ArrayList) term43199).add((Object)null);
        ((ArrayList) term43199).add((Object)null);
        ((ArrayList) term43199).add((Object)null);
        ((ArrayList) term43199).add((Object)null);
        ((ArrayList) term43199).add((Object)null);
        ((ArrayList) term43199).add((Object)null);
        Object term43196 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term43196, term43196.getClass(), "id", "");
        setField(term43196, term43196.getClass(), "name", "");
        setField(term43196, term43196.getClass(), "books", term43199);
        ArrayList term43205 = new ArrayList();
        ((ArrayList) term43205).add((Object)null);
        ((ArrayList) term43205).add((Object)null);
        ((ArrayList) term43205).add((Object)null);
        Object term43202 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term43202, term43202.getClass(), "id", "");
        setField(term43202, term43202.getClass(), "name", "");
        setField(term43202, term43202.getClass(), "books", term43205);
        ArrayList term43211 = new ArrayList();
        ((ArrayList) term43211).add((Object)null);
        Object term43208 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term43208, term43208.getClass(), "id", "");
        setField(term43208, term43208.getClass(), "name", "");
        setField(term43208, term43208.getClass(), "books", term43211);
        ArrayList term43182 = new ArrayList();
        ((ArrayList) term43182).add(term43184);
        ((ArrayList) term43182).add(term43190);
        ((ArrayList) term43182).add(term43196);
        ((ArrayList) term43182).add(term43190);
        ((ArrayList) term43182).add(term43202);
        ((ArrayList) term43182).add(term43208);
        Class<? extends Object> term43523 = Class.forName((String) "com.acme.types.AwardName");
        Field term43522 = ((Class) term43523).getDeclaredField((String) "BAILLIE_PRIZE");
        ((Field) term43522).setAccessible(true);
        Object enum112 = ((Field) term43522).get((Object) null);
        Object term43317 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term43317, term43317.getClass(), "id", "");
        setField(term43317, term43317.getClass(), "awardName", enum112);
        setField(term43317, term43317.getClass(), "category", "");
        setIntField(term43317, term43317.getClass(), "year", 1973060703);
        Class<? extends Object> term43689 = Class.forName((String) "com.acme.types.AwardName");
        Field term43688 = ((Class) term43689).getDeclaredField((String) "BAILLIE_PRIZE");
        ((Field) term43688).setAccessible(true);
        Object enum113 = ((Field) term43688).get((Object) null);
        Object term43323 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term43323, term43323.getClass(), "id", "");
        setField(term43323, term43323.getClass(), "awardName", enum113);
        setField(term43323, term43323.getClass(), "category", "");
        setIntField(term43323, term43323.getClass(), "year", -138239905);
        Object term43329 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term43329, term43329.getClass(), "id", "");
        setField(term43329, term43329.getClass(), "awardName", enum112);
        setField(term43329, term43329.getClass(), "category", "");
        setIntField(term43329, term43329.getClass(), "year", 1709474063);
        Class<? extends Object> term43855 = Class.forName((String) "com.acme.types.AwardName");
        Field term43854 = ((Class) term43855).getDeclaredField((String) "DYLAN_PRIZE");
        ((Field) term43854).setAccessible(true);
        Object enum114 = ((Field) term43854).get((Object) null);
        Object term43333 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term43333, term43333.getClass(), "id", "");
        setField(term43333, term43333.getClass(), "awardName", enum114);
        setField(term43333, term43333.getClass(), "category", "");
        setIntField(term43333, term43333.getClass(), "year", 1406617209);
        Class<? extends Object> term44015 = Class.forName((String) "com.acme.types.AwardName");
        Field term44014 = ((Class) term44015).getDeclaredField((String) "PORTICO_PRIZE");
        ((Field) term44014).setAccessible(true);
        Object enum115 = ((Field) term44014).get((Object) null);
        Object term43339 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term43339, term43339.getClass(), "id", "");
        setField(term43339, term43339.getClass(), "awardName", enum115);
        setField(term43339, term43339.getClass(), "category", "");
        setIntField(term43339, term43339.getClass(), "year", 864645689);
        ArrayList term43315 = new ArrayList();
        ((ArrayList) term43315).add(term43317);
        ((ArrayList) term43315).add(term43323);
        ((ArrayList) term43315).add(term43329);
        ((ArrayList) term43315).add(term43333);
        ((ArrayList) term43315).add(term43339);
        term43083 = newInstance(Class.forName("com.acme.types.Book$Builder"));
        Object term43132 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term43216 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term43241 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term43266 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term43083, term43083.getClass(), "id", "CgaZBWEliI");
        setField(term43083, term43083.getClass(), "title", "zoGIuapUuH");
        setField(term43083, term43083.getClass(), "isbn13", "wmFNFItEDO");
        setField(term43083, term43083.getClass(), "isbn10", "zuSHCmjoJr");
        setField(term43132, term43132.getClass(), "id", "oFWSOiBgQG");
        setField(term43132, term43132.getClass(), "name", "rWcuGowgzR");
        setField(term43083, term43083.getClass(), "genre", term43132);
        setField(term43083, term43083.getClass(), "yearOfPublication", term43157);
        setField(term43083, term43083.getClass(), "blurb", "NctZSlLgAp");
        setField(term43083, term43083.getClass(), "authors", term43171);
        setField(term43083, term43083.getClass(), "publishers", term43182);
        setField(term43216, term43216.getClass(), "id", "IiaQCfQDJK");
        setField(term43216, term43216.getClass(), "name", "RbAtCNoOuf");
        setField(term43083, term43083.getClass(), "lang", term43216);
        setField(term43241, term43241.getClass(), "id", "jxzZUJHqoM");
        setField(term43241, term43241.getClass(), "formatName", "HxzPbwplGW");
        setField(term43083, term43083.getClass(), "publishingFormat", term43241);
        setField(term43266, term43266.getClass(), "id", "zNuRhGATHq");
        setField(term43266, term43266.getClass(), "smallUrl", "eyZPNIoeRw");
        setField(term43266, term43266.getClass(), "mediumUrl", "DzPDvbYrjd");
        setField(term43266, term43266.getClass(), "largeUrl", "hKHTQsUwwm");
        setField(term43083, term43083.getClass(), "cover", term43266);
        setField(term43083, term43083.getClass(), "awards", term43315);
        term43347 = newInstance(Class.forName("com.acme.types.Genre"));
        setField(term43347, term43347.getClass(), "id", "XLxOqSFQec");
        setField(term43347, term43347.getClass(), "name", "ZYYULVvGMe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Book$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.acme.types.Genre");
        Object[] args = new Object[1];
        args[0] = term43347;
        callMethod(klass, "genre", argTypes, term43083, args);
    }

};


