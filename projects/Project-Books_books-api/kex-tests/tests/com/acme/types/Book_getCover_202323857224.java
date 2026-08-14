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

public class Book_getCover_202323857224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26434;

    public Book_getCover_202323857224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term26508 = new Integer(-390501023);
        ArrayList term26522 = new ArrayList();
        ArrayList term26531 = new ArrayList();
        ((ArrayList) term26531).add((Object)null);
        Object term26528 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term26528, term26528.getClass(), "id", "");
        setField(term26528, term26528.getClass(), "name", "");
        setField(term26528, term26528.getClass(), "books", term26531);
        ArrayList term26526 = new ArrayList();
        ((ArrayList) term26526).add(term26528);
        Class<? extends Object> term26826 = Class.forName((String) "com.acme.types.AwardName");
        Field term26825 = ((Class) term26826).getDeclaredField((String) "BOOKER_PRIZE");
        ((Field) term26825).setAccessible(true);
        Object enum75 = ((Field) term26825).get((Object) null);
        Object term26637 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term26637, term26637.getClass(), "id", "");
        setField(term26637, term26637.getClass(), "awardName", enum75);
        setField(term26637, term26637.getClass(), "category", "");
        setIntField(term26637, term26637.getClass(), "year", 1209799204);
        Class<? extends Object> term26989 = Class.forName((String) "com.acme.types.AwardName");
        Field term26988 = ((Class) term26989).getDeclaredField((String) "PORTICO_PRIZE");
        ((Field) term26988).setAccessible(true);
        Object enum76 = ((Field) term26988).get((Object) null);
        Object term26643 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term26643, term26643.getClass(), "id", "");
        setField(term26643, term26643.getClass(), "awardName", enum76);
        setField(term26643, term26643.getClass(), "category", "");
        setIntField(term26643, term26643.getClass(), "year", -18216811);
        Class<? extends Object> term27155 = Class.forName((String) "com.acme.types.AwardName");
        Field term27154 = ((Class) term27155).getDeclaredField((String) "PORTICO_PRIZE");
        ((Field) term27154).setAccessible(true);
        Object enum77 = ((Field) term27154).get((Object) null);
        Object term26649 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term26649, term26649.getClass(), "id", "");
        setField(term26649, term26649.getClass(), "awardName", enum77);
        setField(term26649, term26649.getClass(), "category", "");
        setIntField(term26649, term26649.getClass(), "year", -2119545015);
        Object term26655 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term26655, term26655.getClass(), "id", "");
        setField(term26655, term26655.getClass(), "awardName", enum75);
        setField(term26655, term26655.getClass(), "category", "");
        setIntField(term26655, term26655.getClass(), "year", 1094107751);
        Object term26659 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term26659, term26659.getClass(), "id", "");
        setField(term26659, term26659.getClass(), "awardName", enum75);
        setField(term26659, term26659.getClass(), "category", "");
        setIntField(term26659, term26659.getClass(), "year", 1272542218);
        Class<? extends Object> term27321 = Class.forName((String) "com.acme.types.AwardName");
        Field term27320 = ((Class) term27321).getDeclaredField((String) "WOMENS_PRIZE");
        ((Field) term27320).setAccessible(true);
        Object enum78 = ((Field) term27320).get((Object) null);
        Object term26663 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term26663, term26663.getClass(), "id", "");
        setField(term26663, term26663.getClass(), "awardName", enum78);
        setField(term26663, term26663.getClass(), "category", "");
        setIntField(term26663, term26663.getClass(), "year", 719656595);
        Object term26669 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term26669, term26669.getClass(), "id", "");
        setField(term26669, term26669.getClass(), "awardName", enum78);
        setField(term26669, term26669.getClass(), "category", "");
        setIntField(term26669, term26669.getClass(), "year", 844222656);
        ArrayList term26635 = new ArrayList();
        ((ArrayList) term26635).add(term26637);
        ((ArrayList) term26635).add(term26643);
        ((ArrayList) term26635).add(term26649);
        ((ArrayList) term26635).add(term26655);
        ((ArrayList) term26635).add(term26643);
        ((ArrayList) term26635).add(term26659);
        ((ArrayList) term26635).add(term26655);
        ((ArrayList) term26635).add(term26663);
        ((ArrayList) term26635).add(term26669);
        term26434 = newInstance(Class.forName("com.acme.types.Book"));
        Object term26483 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term26536 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term26561 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term26586 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term26434, term26434.getClass(), "id", "IkItfbpcap");
        setField(term26434, term26434.getClass(), "title", "MJzpIWKpnW");
        setField(term26434, term26434.getClass(), "isbn13", "OAVOvFzQXP");
        setField(term26434, term26434.getClass(), "isbn10", "TJWLTODbwy");
        setField(term26483, term26483.getClass(), "id", "gwokBeghOs");
        setField(term26483, term26483.getClass(), "name", "gSfPReupKO");
        setField(term26434, term26434.getClass(), "genre", term26483);
        setField(term26434, term26434.getClass(), "yearOfPublication", term26508);
        setField(term26434, term26434.getClass(), "blurb", "djavJMNWzM");
        setField(term26434, term26434.getClass(), "authors", term26522);
        setField(term26434, term26434.getClass(), "publishers", term26526);
        setField(term26536, term26536.getClass(), "id", "LEAEPBtmDE");
        setField(term26536, term26536.getClass(), "name", "oUCfMEViOl");
        setField(term26434, term26434.getClass(), "lang", term26536);
        setField(term26561, term26561.getClass(), "id", "NCKuJOimgb");
        setField(term26561, term26561.getClass(), "formatName", "BbWYbJZcOk");
        setField(term26434, term26434.getClass(), "publishingFormat", term26561);
        setField(term26586, term26586.getClass(), "id", "rclaaiJLVZ");
        setField(term26586, term26586.getClass(), "smallUrl", "yQuEIHUdPd");
        setField(term26586, term26586.getClass(), "mediumUrl", "YGcdcqZBhD");
        setField(term26586, term26586.getClass(), "largeUrl", "YIiYmjYKPu");
        setField(term26434, term26434.getClass(), "cover", term26586);
        setField(term26434, term26434.getClass(), "awards", term26635);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCover", argTypes, term26434, args);
    }

};


