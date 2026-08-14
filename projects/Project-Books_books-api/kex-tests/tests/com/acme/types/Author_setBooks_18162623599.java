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
import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Integer;

public class Author_setBooks_18162623599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34774;
     Object term34815;

    public Author_setBooks_18162623599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term34811 = new ArrayList();
        term34774 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term34774, term34774.getClass(), "id", "uLrjpWhGzA");
        setField(term34774, term34774.getClass(), "fullName", "vwfIkOlVZd");
        setField(term34774, term34774.getClass(), "about", "MceqIBCmbY");
        setField(term34774, term34774.getClass(), "books", term34811);
        Integer term34870 = new Integer(-1639041228);
        ArrayList term34884 = new ArrayList();
        ((ArrayList) term34884).add((Object)null);
        ((ArrayList) term34884).add((Object)null);
        ArrayList term34888 = new ArrayList();
        ((ArrayList) term34888).add((Object)null);
        ArrayList term34903 = new ArrayList();
        ((ArrayList) term34903).add((Object)null);
        Object term34818 = newInstance(Class.forName("com.acme.types.Book"));
        Object term34867 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term34892 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term34895 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term34898 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term34818, term34818.getClass(), "id", "rlUBuxBZan");
        setField(term34818, term34818.getClass(), "title", "xcfVTYHLJQ");
        setField(term34818, term34818.getClass(), "isbn13", "pcqiKdOHBV");
        setField(term34818, term34818.getClass(), "isbn10", "rXuZuSwWYH");
        setField(term34867, term34867.getClass(), "id", "");
        setField(term34867, term34867.getClass(), "name", "");
        setField(term34818, term34818.getClass(), "genre", term34867);
        setField(term34818, term34818.getClass(), "yearOfPublication", term34870);
        setField(term34818, term34818.getClass(), "blurb", "SIFtikilxs");
        setField(term34818, term34818.getClass(), "authors", term34884);
        setField(term34818, term34818.getClass(), "publishers", term34888);
        setField(term34892, term34892.getClass(), "id", "");
        setField(term34892, term34892.getClass(), "name", "");
        setField(term34818, term34818.getClass(), "lang", term34892);
        setField(term34895, term34895.getClass(), "id", "");
        setField(term34895, term34895.getClass(), "formatName", "");
        setField(term34818, term34818.getClass(), "publishingFormat", term34895);
        setField(term34898, term34898.getClass(), "id", "");
        setField(term34898, term34898.getClass(), "smallUrl", "");
        setField(term34898, term34898.getClass(), "mediumUrl", "");
        setField(term34898, term34898.getClass(), "largeUrl", "");
        setField(term34818, term34818.getClass(), "cover", term34898);
        setField(term34818, term34818.getClass(), "awards", term34903);
        Integer term34914 = new Integer(990883365);
        ArrayList term34917 = new ArrayList();
        ((ArrayList) term34917).add((Object)null);
        ((ArrayList) term34917).add((Object)null);
        ((ArrayList) term34917).add((Object)null);
        ((ArrayList) term34917).add((Object)null);
        ((ArrayList) term34917).add((Object)null);
        ArrayList term34920 = new ArrayList();
        ArrayList term34926 = new ArrayList();
        ((ArrayList) term34926).add((Object)null);
        ((ArrayList) term34926).add((Object)null);
        ((ArrayList) term34926).add((Object)null);
        ((ArrayList) term34926).add((Object)null);
        ((ArrayList) term34926).add((Object)null);
        ((ArrayList) term34926).add((Object)null);
        Object term34908 = newInstance(Class.forName("com.acme.types.Book"));
        Object term34913 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term34923 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term34924 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term34925 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term34908, term34908.getClass(), "id", "");
        setField(term34908, term34908.getClass(), "title", "");
        setField(term34908, term34908.getClass(), "isbn13", "");
        setField(term34908, term34908.getClass(), "isbn10", "");
        setField(term34913, term34913.getClass(), "id", null);
        setField(term34913, term34913.getClass(), "name", null);
        setField(term34908, term34908.getClass(), "genre", term34913);
        setField(term34908, term34908.getClass(), "yearOfPublication", term34914);
        setField(term34908, term34908.getClass(), "blurb", "");
        setField(term34908, term34908.getClass(), "authors", term34917);
        setField(term34908, term34908.getClass(), "publishers", term34920);
        setField(term34923, term34923.getClass(), "id", null);
        setField(term34923, term34923.getClass(), "name", null);
        setField(term34908, term34908.getClass(), "lang", term34923);
        setField(term34924, term34924.getClass(), "id", null);
        setField(term34924, term34924.getClass(), "formatName", null);
        setField(term34908, term34908.getClass(), "publishingFormat", term34924);
        setField(term34925, term34925.getClass(), "id", null);
        setField(term34925, term34925.getClass(), "smallUrl", null);
        setField(term34925, term34925.getClass(), "mediumUrl", null);
        setField(term34925, term34925.getClass(), "largeUrl", null);
        setField(term34908, term34908.getClass(), "cover", term34925);
        setField(term34908, term34908.getClass(), "awards", term34926);
        Integer term34931 = new Integer(1713573821);
        Object term34930 = newInstance(Class.forName("com.acme.types.Book"));
        setField(term34930, term34930.getClass(), "id", null);
        setField(term34930, term34930.getClass(), "title", null);
        setField(term34930, term34930.getClass(), "isbn13", null);
        setField(term34930, term34930.getClass(), "isbn10", null);
        setField(term34930, term34930.getClass(), "genre", null);
        setField(term34930, term34930.getClass(), "yearOfPublication", term34931);
        setField(term34930, term34930.getClass(), "blurb", null);
        setField(term34930, term34930.getClass(), "authors", null);
        setField(term34930, term34930.getClass(), "publishers", null);
        setField(term34930, term34930.getClass(), "lang", null);
        setField(term34930, term34930.getClass(), "publishingFormat", null);
        setField(term34930, term34930.getClass(), "cover", null);
        setField(term34930, term34930.getClass(), "awards", null);
        term34815 = new LinkedList();
        ((LinkedList) term34815).add(term34818);
        ((LinkedList) term34815).add(term34908);
        ((LinkedList) term34815).add(term34930);
        ((LinkedList) term34815).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Author");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term34815;
        callMethod(klass, "setBooks", argTypes, term34774, args);
    }

};


