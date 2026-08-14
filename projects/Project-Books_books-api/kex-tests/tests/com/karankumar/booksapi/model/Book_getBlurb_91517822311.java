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

public class Book_getBlurb_91517822311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5489;

    public Book_getBlurb_91517822311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5490 = new Long(-8658027316505137504L);
        HashMap term5505 = new HashMap();
        Set<Object> term5654 =  ((Map) term5505).keySet();
        HashSet term5504 = new HashSet((Collection<? extends Object>) term5654);
        Long term5511 = new Long(414749984815662075L);
        Long term5550 = new Long(463622836963501975L);
        Integer term5564 = new Integer(1725571209);
        HashMap term5579 = new HashMap();
        Set<Object> term5705 =  ((Map) term5579).keySet();
        HashSet term5578 = new HashSet((Collection<? extends Object>) term5705);
        Long term5585 = new Long(305759998609888272L);
        Long term5600 = new Long(-8654565919063661957L);
        HashMap term5639 = new HashMap();
        Set<Object> term5746 =  ((Map) term5639).keySet();
        HashSet term5638 = new HashSet((Collection<? extends Object>) term5746);
        term5489 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term5510 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term5549 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term5584 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term5599 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term5489, term5489.getClass(), "id", term5490);
        setField(term5489, term5489.getClass(), "title", "pXOkjyeIRb");
        setField(term5489, term5489.getClass(), "authors", term5504);
        setField(term5510, term5510.getClass(), "id", term5511);
        setField(term5510, term5510.getClass(), "name", "GgZWSjxjyE");
        setField(term5489, term5489.getClass(), "lang", term5510);
        setField(term5489, term5489.getClass(), "isbn10", "EeBVbzjcCI");
        setField(term5489, term5489.getClass(), "isbn13", "UfQtPRyWRC");
        setField(term5549, term5549.getClass(), "id", term5550);
        setField(term5549, term5549.getClass(), "name", "FPvxVzzSvD");
        setField(term5489, term5489.getClass(), "genre", term5549);
        setField(term5489, term5489.getClass(), "yearOfPublication", term5564);
        setField(term5489, term5489.getClass(), "blurb", "WHcwFgsGFC");
        setField(term5489, term5489.getClass(), "publishers", term5578);
        setField(term5584, term5584.getClass(), "id", term5585);
        setField(term5584, term5584.getClass(), "formatName", "HzqpegHiRq");
        setField(term5489, term5489.getClass(), "publishingFormat", term5584);
        setField(term5599, term5599.getClass(), "id", term5600);
        setField(term5599, term5599.getClass(), "smallUrl", "jwsfVjMoJT");
        setField(term5599, term5599.getClass(), "mediumUrl", "ZfdXfCCFDf");
        setField(term5599, term5599.getClass(), "largeUrl", "MwwjNtdOFT");
        setField(term5489, term5489.getClass(), "cover", term5599);
        setField(term5489, term5489.getClass(), "awards", term5638);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBlurb", argTypes, term5489, args);
    }

};


