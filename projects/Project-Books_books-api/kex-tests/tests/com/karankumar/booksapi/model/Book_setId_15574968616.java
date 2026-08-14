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

public class Book_setId_15574968616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6779;
     Object term6934;

    public Book_setId_15574968616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6780 = new Long(6689117472719450333L);
        HashMap term6795 = new HashMap();
        Set<Object> term6946 =  ((Map) term6795).keySet();
        HashSet term6794 = new HashSet((Collection<? extends Object>) term6946);
        Long term6801 = new Long(5836128569274066678L);
        Long term6840 = new Long(-2177368829816872572L);
        Integer term6854 = new Integer(597278769);
        HashMap term6869 = new HashMap();
        Set<Object> term6997 =  ((Map) term6869).keySet();
        HashSet term6868 = new HashSet((Collection<? extends Object>) term6997);
        Long term6875 = new Long(-8463029266761149071L);
        Long term6890 = new Long(3133860696238261492L);
        HashMap term6929 = new HashMap();
        Set<Object> term7038 =  ((Map) term6929).keySet();
        HashSet term6928 = new HashSet((Collection<? extends Object>) term7038);
        term6779 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term6800 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term6839 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term6874 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term6889 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term6779, term6779.getClass(), "id", term6780);
        setField(term6779, term6779.getClass(), "title", "tRxZafjqIx");
        setField(term6779, term6779.getClass(), "authors", term6794);
        setField(term6800, term6800.getClass(), "id", term6801);
        setField(term6800, term6800.getClass(), "name", "DhjNLmRMCu");
        setField(term6779, term6779.getClass(), "lang", term6800);
        setField(term6779, term6779.getClass(), "isbn10", "PgPzMSEjjX");
        setField(term6779, term6779.getClass(), "isbn13", "wzsPSPcRdj");
        setField(term6839, term6839.getClass(), "id", term6840);
        setField(term6839, term6839.getClass(), "name", "kGMQdqJYyB");
        setField(term6779, term6779.getClass(), "genre", term6839);
        setField(term6779, term6779.getClass(), "yearOfPublication", term6854);
        setField(term6779, term6779.getClass(), "blurb", "XJJNClzHRf");
        setField(term6779, term6779.getClass(), "publishers", term6868);
        setField(term6874, term6874.getClass(), "id", term6875);
        setField(term6874, term6874.getClass(), "formatName", "HDaezxQfQR");
        setField(term6779, term6779.getClass(), "publishingFormat", term6874);
        setField(term6889, term6889.getClass(), "id", term6890);
        setField(term6889, term6889.getClass(), "smallUrl", "iikZEapDlu");
        setField(term6889, term6889.getClass(), "mediumUrl", "nhoHrZfnIN");
        setField(term6889, term6889.getClass(), "largeUrl", "ZkMALXpEAZ");
        setField(term6779, term6779.getClass(), "cover", term6889);
        setField(term6779, term6779.getClass(), "awards", term6928);
        term6934 = new Long(7247160664318067468L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term6934;
        callMethod(klass, "setId", argTypes, term6779, args);
    }

};


