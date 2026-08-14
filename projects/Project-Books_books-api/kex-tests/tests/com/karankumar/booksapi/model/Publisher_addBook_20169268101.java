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

public class Publisher_addBook_20169268101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16829;
     Object term16850;

    public Publisher_addBook_20169268101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16830 = new Long(-1505191021111100819L);
        HashMap term16845 = new HashMap();
        Set<Object> term17015 =  ((Map) term16845).keySet();
        HashSet term16844 = new HashSet((Collection<? extends Object>) term17015);
        term16829 = newInstance(Class.forName("com.karankumar.booksapi.model.Publisher"));
        setField(term16829, term16829.getClass(), "id", term16830);
        setField(term16829, term16829.getClass(), "name", "mGRiYhnMcR");
        setField(term16829, term16829.getClass(), "books", term16844);
        Long term16851 = new Long(-1000830646340880796L);
        HashMap term16866 = new HashMap();
        Set<Object> term17026 =  ((Map) term16866).keySet();
        HashSet term16865 = new HashSet((Collection<? extends Object>) term17026);
        Long term16872 = new Long(5973526439563541711L);
        Long term16911 = new Long(5246058710498845622L);
        Integer term16925 = new Integer(-73683645);
        HashMap term16940 = new HashMap();
        Set<Object> term17077 =  ((Map) term16940).keySet();
        HashSet term16939 = new HashSet((Collection<? extends Object>) term17077);
        Long term16946 = new Long(4394651392080968777L);
        Long term16961 = new Long(-7310273014364148916L);
        HashMap term17000 = new HashMap();
        Set<Object> term17118 =  ((Map) term17000).keySet();
        HashSet term16999 = new HashSet((Collection<? extends Object>) term17118);
        term16850 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term16871 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term16910 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term16945 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term16960 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term16850, term16850.getClass(), "id", term16851);
        setField(term16850, term16850.getClass(), "title", "NFlvfJCVPO");
        setField(term16850, term16850.getClass(), "authors", term16865);
        setField(term16871, term16871.getClass(), "id", term16872);
        setField(term16871, term16871.getClass(), "name", "KarbTXFmUU");
        setField(term16850, term16850.getClass(), "lang", term16871);
        setField(term16850, term16850.getClass(), "isbn10", "jiUSjqwSIQ");
        setField(term16850, term16850.getClass(), "isbn13", "MgLCedQfoj");
        setField(term16910, term16910.getClass(), "id", term16911);
        setField(term16910, term16910.getClass(), "name", "zgKiINdgNu");
        setField(term16850, term16850.getClass(), "genre", term16910);
        setField(term16850, term16850.getClass(), "yearOfPublication", term16925);
        setField(term16850, term16850.getClass(), "blurb", "zLMTXDQHYH");
        setField(term16850, term16850.getClass(), "publishers", term16939);
        setField(term16945, term16945.getClass(), "id", term16946);
        setField(term16945, term16945.getClass(), "formatName", "PqywFWJlpE");
        setField(term16850, term16850.getClass(), "publishingFormat", term16945);
        setField(term16960, term16960.getClass(), "id", term16961);
        setField(term16960, term16960.getClass(), "smallUrl", "OzXRsFGTIp");
        setField(term16960, term16960.getClass(), "mediumUrl", "TjWpyghUWN");
        setField(term16960, term16960.getClass(), "largeUrl", "dkZFDZxcde");
        setField(term16850, term16850.getClass(), "cover", term16960);
        setField(term16850, term16850.getClass(), "awards", term16999);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Publisher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.karankumar.booksapi.model.Book");
        Object[] args = new Object[1];
        args[0] = term16850;
        callMethod(klass, "addBook", argTypes, term16829, args);
    }

};


