package com.piinalpin.queryrequest.domain.common.query;

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
import static com.piinalpin.queryrequest.domain.common.query.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;
import java.util.LinkedList;

public class SearchRequest_setSorts_5307001546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11440;
     Object term11509;

    public SearchRequest_setSorts_5307001546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11550 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term11549 = ((Class) term11550).getDeclaredField((String) "DATE");
        ((Field) term11549).setAccessible(true);
        Object enum35 = ((Field) term11549).get((Object) null);
        ArrayList term11449 = new ArrayList();
        Object term11443 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term11447 = newInstance(Class.forName("java.lang.Object"));
        Object term11448 = newInstance(Class.forName("java.lang.Object"));
        setField(term11443, term11443.getClass(), "key", "");
        setField(term11443, term11443.getClass(), "operator", null);
        setField(term11443, term11443.getClass(), "fieldType", enum35);
        setField(term11443, term11443.getClass(), "value", term11447);
        setField(term11443, term11443.getClass(), "valueTo", term11448);
        setField(term11443, term11443.getClass(), "values", term11449);
        Class<? extends Object> term11849 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term11848 = ((Class) term11849).getDeclaredField((String) "DOUBLE");
        ((Field) term11848).setAccessible(true);
        Object enum36 = ((Field) term11848).get((Object) null);
        ArrayList term11458 = new ArrayList();
        ((ArrayList) term11458).add((Object)null);
        ((ArrayList) term11458).add((Object)null);
        Object term11452 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term11456 = newInstance(Class.forName("java.lang.Object"));
        Object term11457 = newInstance(Class.forName("java.lang.Object"));
        setField(term11452, term11452.getClass(), "key", "");
        setField(term11452, term11452.getClass(), "operator", null);
        setField(term11452, term11452.getClass(), "fieldType", enum36);
        setField(term11452, term11452.getClass(), "value", term11456);
        setField(term11452, term11452.getClass(), "valueTo", term11457);
        setField(term11452, term11452.getClass(), "values", term11458);
        Class<? extends Object> term12154 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term12153 = ((Class) term12154).getDeclaredField((String) "CHAR");
        ((Field) term12153).setAccessible(true);
        Object enum37 = ((Field) term12153).get((Object) null);
        ArrayList term11467 = new ArrayList();
        ((ArrayList) term11467).add((Object)null);
        ((ArrayList) term11467).add((Object)null);
        ((ArrayList) term11467).add((Object)null);
        ((ArrayList) term11467).add((Object)null);
        ((ArrayList) term11467).add((Object)null);
        ((ArrayList) term11467).add((Object)null);
        ((ArrayList) term11467).add((Object)null);
        Object term11461 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term11465 = newInstance(Class.forName("java.lang.Object"));
        Object term11466 = newInstance(Class.forName("java.lang.Object"));
        setField(term11461, term11461.getClass(), "key", "");
        setField(term11461, term11461.getClass(), "operator", null);
        setField(term11461, term11461.getClass(), "fieldType", enum37);
        setField(term11461, term11461.getClass(), "value", term11465);
        setField(term11461, term11461.getClass(), "valueTo", term11466);
        setField(term11461, term11461.getClass(), "values", term11467);
        Class<? extends Object> term12453 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term12452 = ((Class) term12453).getDeclaredField((String) "INTEGER");
        ((Field) term12452).setAccessible(true);
        Object enum38 = ((Field) term12452).get((Object) null);
        ArrayList term11474 = new ArrayList();
        ((ArrayList) term11474).add((Object)null);
        ((ArrayList) term11474).add((Object)null);
        Object term11470 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        setField(term11470, term11470.getClass(), "key", "");
        setField(term11470, term11470.getClass(), "operator", null);
        setField(term11470, term11470.getClass(), "fieldType", enum38);
        setField(term11470, term11470.getClass(), "value", term11448);
        setField(term11470, term11470.getClass(), "valueTo", term11448);
        setField(term11470, term11470.getClass(), "values", term11474);
        Class<? extends Object> term12761 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term12760 = ((Class) term12761).getDeclaredField((String) "STRING");
        ((Field) term12760).setAccessible(true);
        Object enum39 = ((Field) term12760).get((Object) null);
        ArrayList term11482 = new ArrayList();
        ((ArrayList) term11482).add((Object)null);
        ((ArrayList) term11482).add((Object)null);
        ((ArrayList) term11482).add((Object)null);
        ((ArrayList) term11482).add((Object)null);
        ((ArrayList) term11482).add((Object)null);
        ((ArrayList) term11482).add((Object)null);
        ((ArrayList) term11482).add((Object)null);
        ((ArrayList) term11482).add((Object)null);
        ((ArrayList) term11482).add((Object)null);
        Object term11477 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term11481 = newInstance(Class.forName("java.lang.Object"));
        setField(term11477, term11477.getClass(), "key", "");
        setField(term11477, term11477.getClass(), "operator", null);
        setField(term11477, term11477.getClass(), "fieldType", enum39);
        setField(term11477, term11477.getClass(), "value", term11466);
        setField(term11477, term11477.getClass(), "valueTo", term11481);
        setField(term11477, term11477.getClass(), "values", term11482);
        ArrayList term11441 = new ArrayList();
        ((ArrayList) term11441).add(term11443);
        ((ArrayList) term11441).add(term11452);
        ((ArrayList) term11441).add(term11461);
        ((ArrayList) term11441).add(term11470);
        ((ArrayList) term11441).add(term11477);
        Object term11489 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term11489, term11489.getClass(), "key", "");
        setField(term11489, term11489.getClass(), "direction", null);
        Object term11491 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term11491, term11491.getClass(), "key", "");
        setField(term11491, term11491.getClass(), "direction", null);
        Object term11493 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term11493, term11493.getClass(), "key", "");
        setField(term11493, term11493.getClass(), "direction", null);
        Object term11495 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term11495, term11495.getClass(), "key", "");
        setField(term11495, term11495.getClass(), "direction", null);
        Object term11497 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term11497, term11497.getClass(), "key", "");
        setField(term11497, term11497.getClass(), "direction", null);
        Object term11499 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term11499, term11499.getClass(), "key", "");
        setField(term11499, term11499.getClass(), "direction", null);
        Object term11501 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term11501, term11501.getClass(), "key", "");
        setField(term11501, term11501.getClass(), "direction", null);
        ArrayList term11487 = new ArrayList();
        ((ArrayList) term11487).add(term11489);
        ((ArrayList) term11487).add(term11491);
        ((ArrayList) term11487).add(term11493);
        ((ArrayList) term11487).add(term11495);
        ((ArrayList) term11487).add(term11497);
        ((ArrayList) term11487).add(term11499);
        ((ArrayList) term11487).add(term11501);
        Integer term11505 = new Integer(1725571209);
        Integer term11507 = new Integer(-522618178);
        term11440 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SearchRequest"));
        setField(term11440, term11440.getClass(), "filters", term11441);
        setField(term11440, term11440.getClass(), "sorts", term11487);
        setField(term11440, term11440.getClass(), "page", term11505);
        setField(term11440, term11440.getClass(), "size", term11507);
        Object term11512 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term11512, term11512.getClass(), "key", "wGmYcqUkgE");
        setField(term11512, term11512.getClass(), "direction", null);
        Object term11526 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term11526, term11526.getClass(), "key", "");
        setField(term11526, term11526.getClass(), "direction", null);
        Object term11529 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term11529, term11529.getClass(), "key", null);
        setField(term11529, term11529.getClass(), "direction", null);
        term11509 = new LinkedList();
        ((LinkedList) term11509).add(term11512);
        ((LinkedList) term11509).add(term11526);
        ((LinkedList) term11509).add(term11529);
        ((LinkedList) term11509).add((Object)null);
        ((LinkedList) term11509).add((Object)null);
        ((LinkedList) term11509).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.SearchRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term11509;
        callMethod(klass, "setSorts", argTypes, term11440, args);
    }

};


