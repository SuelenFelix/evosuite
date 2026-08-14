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

public class Book_setPublishingFormat_79465972826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9522;
     Object term9677;

    public Book_setPublishingFormat_79465972826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9523 = new Long(-6587807377747738663L);
        HashMap term9538 = new HashMap();
        Set<Object> term9702 =  ((Map) term9538).keySet();
        HashSet term9537 = new HashSet((Collection<? extends Object>) term9702);
        Long term9544 = new Long(-6301101997917060727L);
        Long term9583 = new Long(8166095254618543564L);
        Integer term9597 = new Integer(590364439);
        HashMap term9612 = new HashMap();
        Set<Object> term9753 =  ((Map) term9612).keySet();
        HashSet term9611 = new HashSet((Collection<? extends Object>) term9753);
        Long term9618 = new Long(-4598158870068953328L);
        Long term9633 = new Long(138235087558060686L);
        HashMap term9672 = new HashMap();
        Set<Object> term9794 =  ((Map) term9672).keySet();
        HashSet term9671 = new HashSet((Collection<? extends Object>) term9794);
        term9522 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term9543 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term9582 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term9617 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term9632 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term9522, term9522.getClass(), "id", term9523);
        setField(term9522, term9522.getClass(), "title", "qnvxzwuGKX");
        setField(term9522, term9522.getClass(), "authors", term9537);
        setField(term9543, term9543.getClass(), "id", term9544);
        setField(term9543, term9543.getClass(), "name", "EdPAvpluZg");
        setField(term9522, term9522.getClass(), "lang", term9543);
        setField(term9522, term9522.getClass(), "isbn10", "DzHVBMqWtE");
        setField(term9522, term9522.getClass(), "isbn13", "THZSpzBRYP");
        setField(term9582, term9582.getClass(), "id", term9583);
        setField(term9582, term9582.getClass(), "name", "ZfBIVGBQOE");
        setField(term9522, term9522.getClass(), "genre", term9582);
        setField(term9522, term9522.getClass(), "yearOfPublication", term9597);
        setField(term9522, term9522.getClass(), "blurb", "QSrDQfEsTR");
        setField(term9522, term9522.getClass(), "publishers", term9611);
        setField(term9617, term9617.getClass(), "id", term9618);
        setField(term9617, term9617.getClass(), "formatName", "PsqusYmejD");
        setField(term9522, term9522.getClass(), "publishingFormat", term9617);
        setField(term9632, term9632.getClass(), "id", term9633);
        setField(term9632, term9632.getClass(), "smallUrl", "NTWMiBEaDF");
        setField(term9632, term9632.getClass(), "mediumUrl", "SPBstwKFVr");
        setField(term9632, term9632.getClass(), "largeUrl", "WxYUTuqmIq");
        setField(term9522, term9522.getClass(), "cover", term9632);
        setField(term9522, term9522.getClass(), "awards", term9671);
        Long term9678 = new Long(5381386339318883012L);
        term9677 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        setField(term9677, term9677.getClass(), "id", term9678);
        setField(term9677, term9677.getClass(), "formatName", "OeQLvhVERT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.karankumar.booksapi.model.PublishingFormat");
        Object[] args = new Object[1];
        args[0] = term9677;
        callMethod(klass, "setPublishingFormat", argTypes, term9522, args);
    }

};


