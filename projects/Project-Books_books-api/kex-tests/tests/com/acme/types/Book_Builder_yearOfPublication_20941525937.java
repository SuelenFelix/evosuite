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

public class Book_Builder_yearOfPublication_20941525937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44200;
     Object term44460;

    public Book_Builder_yearOfPublication_20941525937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term44274 = new Integer(-1793950607);
        ArrayList term44294 = new ArrayList();
        ((ArrayList) term44294).add((Object)null);
        ((ArrayList) term44294).add((Object)null);
        ((ArrayList) term44294).add((Object)null);
        ((ArrayList) term44294).add((Object)null);
        ((ArrayList) term44294).add((Object)null);
        ((ArrayList) term44294).add((Object)null);
        ((ArrayList) term44294).add((Object)null);
        Object term44290 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term44290, term44290.getClass(), "id", "");
        setField(term44290, term44290.getClass(), "fullName", "");
        setField(term44290, term44290.getClass(), "about", "");
        setField(term44290, term44290.getClass(), "books", term44294);
        ArrayList term44288 = new ArrayList();
        ((ArrayList) term44288).add(term44290);
        ArrayList term44304 = new ArrayList();
        ((ArrayList) term44304).add((Object)null);
        ((ArrayList) term44304).add((Object)null);
        ((ArrayList) term44304).add((Object)null);
        ((ArrayList) term44304).add((Object)null);
        ((ArrayList) term44304).add((Object)null);
        ((ArrayList) term44304).add((Object)null);
        ((ArrayList) term44304).add((Object)null);
        ((ArrayList) term44304).add((Object)null);
        Object term44301 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term44301, term44301.getClass(), "id", "");
        setField(term44301, term44301.getClass(), "name", "");
        setField(term44301, term44301.getClass(), "books", term44304);
        ArrayList term44310 = new ArrayList();
        ((ArrayList) term44310).add((Object)null);
        ((ArrayList) term44310).add((Object)null);
        ((ArrayList) term44310).add((Object)null);
        ((ArrayList) term44310).add((Object)null);
        ((ArrayList) term44310).add((Object)null);
        Object term44307 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term44307, term44307.getClass(), "id", "");
        setField(term44307, term44307.getClass(), "name", "");
        setField(term44307, term44307.getClass(), "books", term44310);
        ArrayList term44316 = new ArrayList();
        ((ArrayList) term44316).add((Object)null);
        Object term44313 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term44313, term44313.getClass(), "id", "");
        setField(term44313, term44313.getClass(), "name", "");
        setField(term44313, term44313.getClass(), "books", term44316);
        ArrayList term44322 = new ArrayList();
        ((ArrayList) term44322).add((Object)null);
        ((ArrayList) term44322).add((Object)null);
        ((ArrayList) term44322).add((Object)null);
        ((ArrayList) term44322).add((Object)null);
        Object term44319 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term44319, term44319.getClass(), "id", "");
        setField(term44319, term44319.getClass(), "name", "");
        setField(term44319, term44319.getClass(), "books", term44322);
        ArrayList term44328 = new ArrayList();
        ((ArrayList) term44328).add((Object)null);
        ((ArrayList) term44328).add((Object)null);
        ((ArrayList) term44328).add((Object)null);
        ((ArrayList) term44328).add((Object)null);
        ((ArrayList) term44328).add((Object)null);
        ((ArrayList) term44328).add((Object)null);
        ((ArrayList) term44328).add((Object)null);
        ((ArrayList) term44328).add((Object)null);
        ((ArrayList) term44328).add((Object)null);
        Object term44325 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term44325, term44325.getClass(), "id", "");
        setField(term44325, term44325.getClass(), "name", "");
        setField(term44325, term44325.getClass(), "books", term44328);
        ArrayList term44334 = new ArrayList();
        Object term44331 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term44331, term44331.getClass(), "id", "");
        setField(term44331, term44331.getClass(), "name", "");
        setField(term44331, term44331.getClass(), "books", term44334);
        ArrayList term44299 = new ArrayList();
        ((ArrayList) term44299).add(term44301);
        ((ArrayList) term44299).add(term44307);
        ((ArrayList) term44299).add(term44313);
        ((ArrayList) term44299).add(term44319);
        ((ArrayList) term44299).add(term44319);
        ((ArrayList) term44299).add(term44307);
        ((ArrayList) term44299).add(term44301);
        ((ArrayList) term44299).add(term44325);
        ((ArrayList) term44299).add(term44331);
        Class<? extends Object> term44613 = Class.forName((String) "com.acme.types.AwardName");
        Field term44612 = ((Class) term44613).getDeclaredField((String) "BOOKER_INTER_PRIZE");
        ((Field) term44612).setAccessible(true);
        Object enum116 = ((Field) term44612).get((Object) null);
        Object term44440 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term44440, term44440.getClass(), "id", "");
        setField(term44440, term44440.getClass(), "awardName", enum116);
        setField(term44440, term44440.getClass(), "category", "");
        setIntField(term44440, term44440.getClass(), "year", -1079020032);
        Class<? extends Object> term44794 = Class.forName((String) "com.acme.types.AwardName");
        Field term44793 = ((Class) term44794).getDeclaredField((String) "PORTICO_PRIZE");
        ((Field) term44793).setAccessible(true);
        Object enum117 = ((Field) term44793).get((Object) null);
        Object term44446 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term44446, term44446.getClass(), "id", "");
        setField(term44446, term44446.getClass(), "awardName", enum117);
        setField(term44446, term44446.getClass(), "category", "");
        setIntField(term44446, term44446.getClass(), "year", 5603560);
        Class<? extends Object> term44960 = Class.forName((String) "com.acme.types.AwardName");
        Field term44959 = ((Class) term44960).getDeclaredField((String) "BOOKER_INTER_PRIZE");
        ((Field) term44959).setAccessible(true);
        Object enum118 = ((Field) term44959).get((Object) null);
        Object term44452 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term44452, term44452.getClass(), "id", "");
        setField(term44452, term44452.getClass(), "awardName", enum118);
        setField(term44452, term44452.getClass(), "category", "");
        setIntField(term44452, term44452.getClass(), "year", -1999787419);
        ArrayList term44438 = new ArrayList();
        ((ArrayList) term44438).add(term44440);
        ((ArrayList) term44438).add(term44446);
        ((ArrayList) term44438).add(term44452);
        ((ArrayList) term44438).add(term44440);
        term44200 = newInstance(Class.forName("com.acme.types.Book$Builder"));
        Object term44249 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term44339 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term44364 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term44389 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term44200, term44200.getClass(), "id", "PtpYNDHLFn");
        setField(term44200, term44200.getClass(), "title", "yfiSeJGQTt");
        setField(term44200, term44200.getClass(), "isbn13", "eRnfQjCPQW");
        setField(term44200, term44200.getClass(), "isbn10", "WfQSpMWeNA");
        setField(term44249, term44249.getClass(), "id", "IeCauATlRt");
        setField(term44249, term44249.getClass(), "name", "ivTeWLYaUy");
        setField(term44200, term44200.getClass(), "genre", term44249);
        setField(term44200, term44200.getClass(), "yearOfPublication", term44274);
        setField(term44200, term44200.getClass(), "blurb", "IayPqIheRj");
        setField(term44200, term44200.getClass(), "authors", term44288);
        setField(term44200, term44200.getClass(), "publishers", term44299);
        setField(term44339, term44339.getClass(), "id", "GMGidYubtA");
        setField(term44339, term44339.getClass(), "name", "XMeuWXmVPZ");
        setField(term44200, term44200.getClass(), "lang", term44339);
        setField(term44364, term44364.getClass(), "id", "XuuxkOYilK");
        setField(term44364, term44364.getClass(), "formatName", "tsvfsndxoq");
        setField(term44200, term44200.getClass(), "publishingFormat", term44364);
        setField(term44389, term44389.getClass(), "id", "qIPfYhswjk");
        setField(term44389, term44389.getClass(), "smallUrl", "GfLrnDqvDC");
        setField(term44389, term44389.getClass(), "mediumUrl", "KyHgoUFRqH");
        setField(term44389, term44389.getClass(), "largeUrl", "zkrDTwpwyP");
        setField(term44200, term44200.getClass(), "cover", term44389);
        setField(term44200, term44200.getClass(), "awards", term44438);
        term44460 = new Integer(470895808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Book$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term44460;
        callMethod(klass, "yearOfPublication", argTypes, term44200, args);
    }

};


