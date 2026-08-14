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

public class Book_Builder_id_18483044712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39572;

    public Book_Builder_id_18483044712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term39646 = new Integer(1633913667);
        ArrayList term39666 = new ArrayList();
        ((ArrayList) term39666).add((Object)null);
        ((ArrayList) term39666).add((Object)null);
        ((ArrayList) term39666).add((Object)null);
        ((ArrayList) term39666).add((Object)null);
        ((ArrayList) term39666).add((Object)null);
        ((ArrayList) term39666).add((Object)null);
        ((ArrayList) term39666).add((Object)null);
        Object term39662 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term39662, term39662.getClass(), "id", "");
        setField(term39662, term39662.getClass(), "fullName", "");
        setField(term39662, term39662.getClass(), "about", "");
        setField(term39662, term39662.getClass(), "books", term39666);
        ArrayList term39660 = new ArrayList();
        ((ArrayList) term39660).add(term39662);
        ArrayList term39671 = new ArrayList();
        Class<? extends Object> term39971 = Class.forName((String) "com.acme.types.AwardName");
        Field term39970 = ((Class) term39971).getDeclaredField((String) "BAILLIE_PRIZE");
        ((Field) term39970).setAccessible(true);
        Object enum101 = ((Field) term39970).get((Object) null);
        Object term39776 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term39776, term39776.getClass(), "id", "");
        setField(term39776, term39776.getClass(), "awardName", enum101);
        setField(term39776, term39776.getClass(), "category", "");
        setIntField(term39776, term39776.getClass(), "year", -1494356104);
        Class<? extends Object> term40137 = Class.forName((String) "com.acme.types.AwardName");
        Field term40136 = ((Class) term40137).getDeclaredField((String) "DYLAN_PRIZE");
        ((Field) term40136).setAccessible(true);
        Object enum102 = ((Field) term40136).get((Object) null);
        Object term39782 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term39782, term39782.getClass(), "id", "");
        setField(term39782, term39782.getClass(), "awardName", enum102);
        setField(term39782, term39782.getClass(), "category", "");
        setIntField(term39782, term39782.getClass(), "year", 330043745);
        Class<? extends Object> term40297 = Class.forName((String) "com.acme.types.AwardName");
        Field term40296 = ((Class) term40297).getDeclaredField((String) "BOOKER_INTER_PRIZE");
        ((Field) term40296).setAccessible(true);
        Object enum103 = ((Field) term40296).get((Object) null);
        Object term39788 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term39788, term39788.getClass(), "id", "");
        setField(term39788, term39788.getClass(), "awardName", enum103);
        setField(term39788, term39788.getClass(), "category", "");
        setIntField(term39788, term39788.getClass(), "year", -1639041228);
        Class<? extends Object> term40478 = Class.forName((String) "com.acme.types.AwardName");
        Field term40477 = ((Class) term40478).getDeclaredField((String) "NOBEL_PRIZE");
        ((Field) term40477).setAccessible(true);
        Object enum104 = ((Field) term40477).get((Object) null);
        Object term39794 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term39794, term39794.getClass(), "id", "");
        setField(term39794, term39794.getClass(), "awardName", enum104);
        setField(term39794, term39794.getClass(), "category", "");
        setIntField(term39794, term39794.getClass(), "year", -509349195);
        Class<? extends Object> term40638 = Class.forName((String) "com.acme.types.AwardName");
        Field term40637 = ((Class) term40638).getDeclaredField((String) "BOOKER_INTER_PRIZE");
        ((Field) term40637).setAccessible(true);
        Object enum105 = ((Field) term40637).get((Object) null);
        Object term39800 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term39800, term39800.getClass(), "id", "");
        setField(term39800, term39800.getClass(), "awardName", enum105);
        setField(term39800, term39800.getClass(), "category", "");
        setIntField(term39800, term39800.getClass(), "year", -876426634);
        ArrayList term39774 = new ArrayList();
        ((ArrayList) term39774).add(term39776);
        ((ArrayList) term39774).add(term39782);
        ((ArrayList) term39774).add(term39788);
        ((ArrayList) term39774).add(term39794);
        ((ArrayList) term39774).add(term39800);
        ((ArrayList) term39774).add(term39788);
        ((ArrayList) term39774).add(term39776);
        term39572 = newInstance(Class.forName("com.acme.types.Book$Builder"));
        Object term39621 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term39675 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term39700 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term39725 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term39572, term39572.getClass(), "id", "LgMtmRmJQD");
        setField(term39572, term39572.getClass(), "title", "VahMbDgekD");
        setField(term39572, term39572.getClass(), "isbn13", "AQCfezvABR");
        setField(term39572, term39572.getClass(), "isbn10", "khfYJUMptM");
        setField(term39621, term39621.getClass(), "id", "CfEQwakHbo");
        setField(term39621, term39621.getClass(), "name", "ZsmyFqxuVj");
        setField(term39572, term39572.getClass(), "genre", term39621);
        setField(term39572, term39572.getClass(), "yearOfPublication", term39646);
        setField(term39572, term39572.getClass(), "blurb", "GeGOpdgDzW");
        setField(term39572, term39572.getClass(), "authors", term39660);
        setField(term39572, term39572.getClass(), "publishers", term39671);
        setField(term39675, term39675.getClass(), "id", "YbdVnarZPo");
        setField(term39675, term39675.getClass(), "name", "xQLVFxgreg");
        setField(term39572, term39572.getClass(), "lang", term39675);
        setField(term39700, term39700.getClass(), "id", "UaSVQkbVIa");
        setField(term39700, term39700.getClass(), "formatName", "lpDISjhNfl");
        setField(term39572, term39572.getClass(), "publishingFormat", term39700);
        setField(term39725, term39725.getClass(), "id", "eRqFPwFbQq");
        setField(term39725, term39725.getClass(), "smallUrl", "XRguuoyFal");
        setField(term39725, term39725.getClass(), "mediumUrl", "bqQfYHrpCv");
        setField(term39725, term39725.getClass(), "largeUrl", "AJvPAaMMEr");
        setField(term39572, term39572.getClass(), "cover", term39725);
        setField(term39572, term39572.getClass(), "awards", term39774);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Book$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aaccfTmePM";
        callMethod(klass, "id", argTypes, term39572, args);
    }

};


