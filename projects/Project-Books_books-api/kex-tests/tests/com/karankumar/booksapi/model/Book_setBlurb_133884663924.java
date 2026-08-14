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

public class Book_setBlurb_133884663924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8977;

    public Book_setBlurb_133884663924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8978 = new Long(-4023935540989049732L);
        HashMap term8993 = new HashMap();
        Set<Object> term9154 =  ((Map) term8993).keySet();
        HashSet term8992 = new HashSet((Collection<? extends Object>) term9154);
        Long term8999 = new Long(855932984568615096L);
        Long term9038 = new Long(-1616722610139554082L);
        Integer term9052 = new Integer(-1007160944);
        HashMap term9067 = new HashMap();
        Set<Object> term9205 =  ((Map) term9067).keySet();
        HashSet term9066 = new HashSet((Collection<? extends Object>) term9205);
        Long term9073 = new Long(7495904023107549024L);
        Long term9088 = new Long(8802866251294305945L);
        HashMap term9127 = new HashMap();
        Set<Object> term9246 =  ((Map) term9127).keySet();
        HashSet term9126 = new HashSet((Collection<? extends Object>) term9246);
        term8977 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term8998 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term9037 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term9072 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term9087 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term8977, term8977.getClass(), "id", term8978);
        setField(term8977, term8977.getClass(), "title", "NBrvVzvQHe");
        setField(term8977, term8977.getClass(), "authors", term8992);
        setField(term8998, term8998.getClass(), "id", term8999);
        setField(term8998, term8998.getClass(), "name", "FjOiNAfBOc");
        setField(term8977, term8977.getClass(), "lang", term8998);
        setField(term8977, term8977.getClass(), "isbn10", "iCCsaLHohG");
        setField(term8977, term8977.getClass(), "isbn13", "NJhGgctbdj");
        setField(term9037, term9037.getClass(), "id", term9038);
        setField(term9037, term9037.getClass(), "name", "MYWYUeLGOp");
        setField(term8977, term8977.getClass(), "genre", term9037);
        setField(term8977, term8977.getClass(), "yearOfPublication", term9052);
        setField(term8977, term8977.getClass(), "blurb", "tsTGdgQYUL");
        setField(term8977, term8977.getClass(), "publishers", term9066);
        setField(term9072, term9072.getClass(), "id", term9073);
        setField(term9072, term9072.getClass(), "formatName", "TtGbVmKcnX");
        setField(term8977, term8977.getClass(), "publishingFormat", term9072);
        setField(term9087, term9087.getClass(), "id", term9088);
        setField(term9087, term9087.getClass(), "smallUrl", "GJVkUrCVdD");
        setField(term9087, term9087.getClass(), "mediumUrl", "zNdorvdUgu");
        setField(term9087, term9087.getClass(), "largeUrl", "oPxuZbkYio");
        setField(term8977, term8977.getClass(), "cover", term9087);
        setField(term8977, term8977.getClass(), "awards", term9126);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vKitydDVnM";
        callMethod(klass, "setBlurb", argTypes, term8977, args);
    }

};


