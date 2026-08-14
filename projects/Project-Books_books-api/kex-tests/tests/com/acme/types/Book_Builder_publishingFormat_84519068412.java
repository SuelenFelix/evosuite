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

public class Book_Builder_publishingFormat_84519068412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48053;
     Object term48266;

    public Book_Builder_publishingFormat_84519068412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term48127 = new Integer(-1385748168);
        ArrayList term48147 = new ArrayList();
        Object term48143 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term48143, term48143.getClass(), "id", "");
        setField(term48143, term48143.getClass(), "fullName", "");
        setField(term48143, term48143.getClass(), "about", "");
        setField(term48143, term48143.getClass(), "books", term48147);
        ArrayList term48154 = new ArrayList();
        ((ArrayList) term48154).add((Object)null);
        ((ArrayList) term48154).add((Object)null);
        ((ArrayList) term48154).add((Object)null);
        ((ArrayList) term48154).add((Object)null);
        ((ArrayList) term48154).add((Object)null);
        ((ArrayList) term48154).add((Object)null);
        ((ArrayList) term48154).add((Object)null);
        ((ArrayList) term48154).add((Object)null);
        Object term48150 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term48150, term48150.getClass(), "id", "");
        setField(term48150, term48150.getClass(), "fullName", "");
        setField(term48150, term48150.getClass(), "about", "");
        setField(term48150, term48150.getClass(), "books", term48154);
        ArrayList term48141 = new ArrayList();
        ((ArrayList) term48141).add(term48143);
        ((ArrayList) term48141).add(term48150);
        ArrayList term48159 = new ArrayList();
        ArrayList term48262 = new ArrayList();
        term48053 = newInstance(Class.forName("com.acme.types.Book$Builder"));
        Object term48102 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term48163 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term48188 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term48213 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term48053, term48053.getClass(), "id", "PhitAXFqCo");
        setField(term48053, term48053.getClass(), "title", "qEPvDkuGIc");
        setField(term48053, term48053.getClass(), "isbn13", "ssCMFzVcsO");
        setField(term48053, term48053.getClass(), "isbn10", "fhJGnpfhvy");
        setField(term48102, term48102.getClass(), "id", "bQensQtcHI");
        setField(term48102, term48102.getClass(), "name", "VPHXmJPSMk");
        setField(term48053, term48053.getClass(), "genre", term48102);
        setField(term48053, term48053.getClass(), "yearOfPublication", term48127);
        setField(term48053, term48053.getClass(), "blurb", "hynorzJtIc");
        setField(term48053, term48053.getClass(), "authors", term48141);
        setField(term48053, term48053.getClass(), "publishers", term48159);
        setField(term48163, term48163.getClass(), "id", "fAIiyNXvbk");
        setField(term48163, term48163.getClass(), "name", "GifpbbREHt");
        setField(term48053, term48053.getClass(), "lang", term48163);
        setField(term48188, term48188.getClass(), "id", "NcawrazChV");
        setField(term48188, term48188.getClass(), "formatName", "pltFaROPIz");
        setField(term48053, term48053.getClass(), "publishingFormat", term48188);
        setField(term48213, term48213.getClass(), "id", "aseVSmVnWP");
        setField(term48213, term48213.getClass(), "smallUrl", "eHjdkZXLiV");
        setField(term48213, term48213.getClass(), "mediumUrl", "NPXpCCNYEY");
        setField(term48213, term48213.getClass(), "largeUrl", "FVJYWiQQMg");
        setField(term48053, term48053.getClass(), "cover", term48213);
        setField(term48053, term48053.getClass(), "awards", term48262);
        term48266 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        setField(term48266, term48266.getClass(), "id", "sjwMyEpFun");
        setField(term48266, term48266.getClass(), "formatName", "ihxCQlXqfM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Book$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.acme.types.PublishingFormat");
        Object[] args = new Object[1];
        args[0] = term48266;
        callMethod(klass, "publishingFormat", argTypes, term48053, args);
    }

};


