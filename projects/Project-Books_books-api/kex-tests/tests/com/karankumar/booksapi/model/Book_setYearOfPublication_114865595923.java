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

public class Book_setYearOfPublication_114865595923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8717;
     Object term8872;

    public Book_setYearOfPublication_114865595923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8718 = new Long(-6432617521836576658L);
        HashMap term8733 = new HashMap();
        Set<Object> term8884 =  ((Map) term8733).keySet();
        HashSet term8732 = new HashSet((Collection<? extends Object>) term8884);
        Long term8739 = new Long(-2255965562447970862L);
        Long term8778 = new Long(148047808219672941L);
        Integer term8792 = new Integer(-2068769794);
        HashMap term8807 = new HashMap();
        Set<Object> term8935 =  ((Map) term8807).keySet();
        HashSet term8806 = new HashSet((Collection<? extends Object>) term8935);
        Long term8813 = new Long(7489064039921396098L);
        Long term8828 = new Long(6843866297465638866L);
        HashMap term8867 = new HashMap();
        Set<Object> term8976 =  ((Map) term8867).keySet();
        HashSet term8866 = new HashSet((Collection<? extends Object>) term8976);
        term8717 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term8738 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term8777 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term8812 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term8827 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term8717, term8717.getClass(), "id", term8718);
        setField(term8717, term8717.getClass(), "title", "SPtPatHeOm");
        setField(term8717, term8717.getClass(), "authors", term8732);
        setField(term8738, term8738.getClass(), "id", term8739);
        setField(term8738, term8738.getClass(), "name", "ywmcuThdfL");
        setField(term8717, term8717.getClass(), "lang", term8738);
        setField(term8717, term8717.getClass(), "isbn10", "GBOEuByOfr");
        setField(term8717, term8717.getClass(), "isbn13", "NHbOFFjyVK");
        setField(term8777, term8777.getClass(), "id", term8778);
        setField(term8777, term8777.getClass(), "name", "zaloBqlrSo");
        setField(term8717, term8717.getClass(), "genre", term8777);
        setField(term8717, term8717.getClass(), "yearOfPublication", term8792);
        setField(term8717, term8717.getClass(), "blurb", "vvoLrMGCoN");
        setField(term8717, term8717.getClass(), "publishers", term8806);
        setField(term8812, term8812.getClass(), "id", term8813);
        setField(term8812, term8812.getClass(), "formatName", "pXdglvyrQe");
        setField(term8717, term8717.getClass(), "publishingFormat", term8812);
        setField(term8827, term8827.getClass(), "id", term8828);
        setField(term8827, term8827.getClass(), "smallUrl", "OcfNzHYdki");
        setField(term8827, term8827.getClass(), "mediumUrl", "uPuCVuZYOI");
        setField(term8827, term8827.getClass(), "largeUrl", "TweMFhxNdj");
        setField(term8717, term8717.getClass(), "cover", term8827);
        setField(term8717, term8717.getClass(), "awards", term8866);
        term8872 = new Integer(-117576464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term8872;
        callMethod(klass, "setYearOfPublication", argTypes, term8717, args);
    }

};


