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

public class Book_Builder_isbn13_20490328524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41579;

    public Book_Builder_isbn13_20490328524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term41653 = new Integer(1801052257);
        ArrayList term41673 = new ArrayList();
        ((ArrayList) term41673).add((Object)null);
        ((ArrayList) term41673).add((Object)null);
        ((ArrayList) term41673).add((Object)null);
        ((ArrayList) term41673).add((Object)null);
        ((ArrayList) term41673).add((Object)null);
        Object term41669 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term41669, term41669.getClass(), "id", "");
        setField(term41669, term41669.getClass(), "fullName", "");
        setField(term41669, term41669.getClass(), "about", "");
        setField(term41669, term41669.getClass(), "books", term41673);
        ArrayList term41680 = new ArrayList();
        ((ArrayList) term41680).add((Object)null);
        ((ArrayList) term41680).add((Object)null);
        ((ArrayList) term41680).add((Object)null);
        ((ArrayList) term41680).add((Object)null);
        ((ArrayList) term41680).add((Object)null);
        Object term41676 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term41676, term41676.getClass(), "id", "");
        setField(term41676, term41676.getClass(), "fullName", "");
        setField(term41676, term41676.getClass(), "about", "");
        setField(term41676, term41676.getClass(), "books", term41680);
        ArrayList term41667 = new ArrayList();
        ((ArrayList) term41667).add(term41669);
        ((ArrayList) term41667).add(term41676);
        ArrayList term41690 = new ArrayList();
        ((ArrayList) term41690).add((Object)null);
        ((ArrayList) term41690).add((Object)null);
        ((ArrayList) term41690).add((Object)null);
        ((ArrayList) term41690).add((Object)null);
        ((ArrayList) term41690).add((Object)null);
        ((ArrayList) term41690).add((Object)null);
        Object term41687 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term41687, term41687.getClass(), "id", "");
        setField(term41687, term41687.getClass(), "name", "");
        setField(term41687, term41687.getClass(), "books", term41690);
        ArrayList term41696 = new ArrayList();
        ((ArrayList) term41696).add((Object)null);
        ((ArrayList) term41696).add((Object)null);
        ((ArrayList) term41696).add((Object)null);
        ((ArrayList) term41696).add((Object)null);
        Object term41693 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term41693, term41693.getClass(), "id", "");
        setField(term41693, term41693.getClass(), "name", "");
        setField(term41693, term41693.getClass(), "books", term41696);
        ArrayList term41702 = new ArrayList();
        ((ArrayList) term41702).add((Object)null);
        ((ArrayList) term41702).add((Object)null);
        ((ArrayList) term41702).add((Object)null);
        ((ArrayList) term41702).add((Object)null);
        Object term41699 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term41699, term41699.getClass(), "id", "");
        setField(term41699, term41699.getClass(), "name", "");
        setField(term41699, term41699.getClass(), "books", term41702);
        ArrayList term41708 = new ArrayList();
        ((ArrayList) term41708).add((Object)null);
        ((ArrayList) term41708).add((Object)null);
        ((ArrayList) term41708).add((Object)null);
        ((ArrayList) term41708).add((Object)null);
        ((ArrayList) term41708).add((Object)null);
        ((ArrayList) term41708).add((Object)null);
        ((ArrayList) term41708).add((Object)null);
        Object term41705 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term41705, term41705.getClass(), "id", "");
        setField(term41705, term41705.getClass(), "name", "");
        setField(term41705, term41705.getClass(), "books", term41708);
        ArrayList term41685 = new ArrayList();
        ((ArrayList) term41685).add(term41687);
        ((ArrayList) term41685).add(term41693);
        ((ArrayList) term41685).add(term41699);
        ((ArrayList) term41685).add(term41687);
        ((ArrayList) term41685).add(term41705);
        ((ArrayList) term41685).add(term41693);
        ((ArrayList) term41685).add(term41705);
        Class<? extends Object> term41991 = Class.forName((String) "com.acme.types.AwardName");
        Field term41990 = ((Class) term41991).getDeclaredField((String) "BAILLIE_PRIZE");
        ((Field) term41990).setAccessible(true);
        Object enum108 = ((Field) term41990).get((Object) null);
        Object term41814 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term41814, term41814.getClass(), "id", "");
        setField(term41814, term41814.getClass(), "awardName", enum108);
        setField(term41814, term41814.getClass(), "category", "");
        setIntField(term41814, term41814.getClass(), "year", -1556527718);
        Class<? extends Object> term42157 = Class.forName((String) "com.acme.types.AwardName");
        Field term42156 = ((Class) term42157).getDeclaredField((String) "ORWELL_PRIZE");
        ((Field) term42156).setAccessible(true);
        Object enum109 = ((Field) term42156).get((Object) null);
        Object term41820 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term41820, term41820.getClass(), "id", "");
        setField(term41820, term41820.getClass(), "awardName", enum109);
        setField(term41820, term41820.getClass(), "category", "");
        setIntField(term41820, term41820.getClass(), "year", -1945635750);
        ArrayList term41812 = new ArrayList();
        ((ArrayList) term41812).add(term41814);
        ((ArrayList) term41812).add(term41820);
        ((ArrayList) term41812).add(term41814);
        ((ArrayList) term41812).add(term41820);
        ((ArrayList) term41812).add(term41814);
        term41579 = newInstance(Class.forName("com.acme.types.Book$Builder"));
        Object term41628 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term41713 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term41738 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term41763 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term41579, term41579.getClass(), "id", "nJUognJeOm");
        setField(term41579, term41579.getClass(), "title", "ZVYacLLyJE");
        setField(term41579, term41579.getClass(), "isbn13", "HzfDWSUBff");
        setField(term41579, term41579.getClass(), "isbn10", "poPBHBcuxT");
        setField(term41628, term41628.getClass(), "id", "CbyDPgSdhm");
        setField(term41628, term41628.getClass(), "name", "RBzjwLbElU");
        setField(term41579, term41579.getClass(), "genre", term41628);
        setField(term41579, term41579.getClass(), "yearOfPublication", term41653);
        setField(term41579, term41579.getClass(), "blurb", "oaFlpmtnBH");
        setField(term41579, term41579.getClass(), "authors", term41667);
        setField(term41579, term41579.getClass(), "publishers", term41685);
        setField(term41713, term41713.getClass(), "id", "ohBszsvYfy");
        setField(term41713, term41713.getClass(), "name", "GzMkkTjEVk");
        setField(term41579, term41579.getClass(), "lang", term41713);
        setField(term41738, term41738.getClass(), "id", "ecKOzzXEVT");
        setField(term41738, term41738.getClass(), "formatName", "bCInFPNVIR");
        setField(term41579, term41579.getClass(), "publishingFormat", term41738);
        setField(term41763, term41763.getClass(), "id", "zEXxUEAIkD");
        setField(term41763, term41763.getClass(), "smallUrl", "oITckSmPus");
        setField(term41763, term41763.getClass(), "mediumUrl", "ATWqPYwarC");
        setField(term41763, term41763.getClass(), "largeUrl", "JIusqtXOss");
        setField(term41579, term41579.getClass(), "cover", term41763);
        setField(term41579, term41579.getClass(), "awards", term41812);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Book$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "cQlAWLkNee";
        callMethod(klass, "isbn13", argTypes, term41579, args);
    }

};


