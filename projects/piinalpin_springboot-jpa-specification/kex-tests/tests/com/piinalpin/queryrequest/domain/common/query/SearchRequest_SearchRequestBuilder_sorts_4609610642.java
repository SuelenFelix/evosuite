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

public class SearchRequest_SearchRequestBuilder_sorts_4609610642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22399;
     Object term22452;

    public SearchRequest_SearchRequestBuilder_sorts_4609610642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22490 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term22489 = ((Class) term22490).getDeclaredField((String) "DATE");
        ((Field) term22489).setAccessible(true);
        Object enum69 = ((Field) term22489).get((Object) null);
        ArrayList term22408 = new ArrayList();
        ((ArrayList) term22408).add((Object)null);
        ((ArrayList) term22408).add((Object)null);
        Object term22402 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term22406 = newInstance(Class.forName("java.lang.Object"));
        Object term22407 = newInstance(Class.forName("java.lang.Object"));
        setField(term22402, term22402.getClass(), "key", "");
        setField(term22402, term22402.getClass(), "operator", null);
        setField(term22402, term22402.getClass(), "fieldType", enum69);
        setField(term22402, term22402.getClass(), "value", term22406);
        setField(term22402, term22402.getClass(), "valueTo", term22407);
        setField(term22402, term22402.getClass(), "values", term22408);
        ArrayList term22415 = new ArrayList();
        ((ArrayList) term22415).add((Object)null);
        ((ArrayList) term22415).add((Object)null);
        ((ArrayList) term22415).add((Object)null);
        ((ArrayList) term22415).add((Object)null);
        ((ArrayList) term22415).add((Object)null);
        Object term22411 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term22413 = newInstance(Class.forName("java.lang.Object"));
        Object term22414 = newInstance(Class.forName("java.lang.Object"));
        setField(term22411, term22411.getClass(), "key", "");
        setField(term22411, term22411.getClass(), "operator", null);
        setField(term22411, term22411.getClass(), "fieldType", enum69);
        setField(term22411, term22411.getClass(), "value", term22413);
        setField(term22411, term22411.getClass(), "valueTo", term22414);
        setField(term22411, term22411.getClass(), "values", term22415);
        Class<? extends Object> term22789 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term22788 = ((Class) term22789).getDeclaredField((String) "DOUBLE");
        ((Field) term22788).setAccessible(true);
        Object enum70 = ((Field) term22788).get((Object) null);
        ArrayList term22423 = new ArrayList();
        ((ArrayList) term22423).add((Object)null);
        Object term22418 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term22422 = newInstance(Class.forName("java.lang.Object"));
        setField(term22418, term22418.getClass(), "key", "");
        setField(term22418, term22418.getClass(), "operator", null);
        setField(term22418, term22418.getClass(), "fieldType", enum70);
        setField(term22418, term22418.getClass(), "value", term22422);
        setField(term22418, term22418.getClass(), "valueTo", term22406);
        setField(term22418, term22418.getClass(), "values", term22423);
        ArrayList term22400 = new ArrayList();
        ((ArrayList) term22400).add(term22402);
        ((ArrayList) term22400).add(term22411);
        ((ArrayList) term22400).add(term22418);
        Object term22430 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term22430, term22430.getClass(), "key", "");
        setField(term22430, term22430.getClass(), "direction", null);
        Object term22432 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term22432, term22432.getClass(), "key", "");
        setField(term22432, term22432.getClass(), "direction", null);
        Object term22434 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term22434, term22434.getClass(), "key", "");
        setField(term22434, term22434.getClass(), "direction", null);
        Object term22436 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term22436, term22436.getClass(), "key", "");
        setField(term22436, term22436.getClass(), "direction", null);
        Object term22438 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term22438, term22438.getClass(), "key", "");
        setField(term22438, term22438.getClass(), "direction", null);
        Object term22440 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term22440, term22440.getClass(), "key", "");
        setField(term22440, term22440.getClass(), "direction", null);
        Object term22442 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term22442, term22442.getClass(), "key", "");
        setField(term22442, term22442.getClass(), "direction", null);
        Object term22444 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term22444, term22444.getClass(), "key", "");
        setField(term22444, term22444.getClass(), "direction", null);
        ArrayList term22428 = new ArrayList();
        ((ArrayList) term22428).add(term22430);
        ((ArrayList) term22428).add(term22432);
        ((ArrayList) term22428).add(term22434);
        ((ArrayList) term22428).add(term22436);
        ((ArrayList) term22428).add(term22438);
        ((ArrayList) term22428).add(term22440);
        ((ArrayList) term22428).add(term22442);
        ((ArrayList) term22428).add(term22444);
        Integer term22448 = new Integer(-203030934);
        Integer term22450 = new Integer(-1179120542);
        term22399 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SearchRequest$SearchRequestBuilder"));
        setField(term22399, term22399.getClass(), "filters", term22400);
        setField(term22399, term22399.getClass(), "sorts", term22428);
        setField(term22399, term22399.getClass(), "page", term22448);
        setField(term22399, term22399.getClass(), "size", term22450);
        Object term22455 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term22455, term22455.getClass(), "key", "cudZvLMQon");
        setField(term22455, term22455.getClass(), "direction", null);
        Object term22469 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term22469, term22469.getClass(), "key", "");
        setField(term22469, term22469.getClass(), "direction", null);
        Object term22472 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term22472, term22472.getClass(), "key", null);
        setField(term22472, term22472.getClass(), "direction", null);
        term22452 = new LinkedList();
        ((LinkedList) term22452).add(term22455);
        ((LinkedList) term22452).add(term22469);
        ((LinkedList) term22452).add(term22472);
        ((LinkedList) term22452).add((Object)null);
        ((LinkedList) term22452).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.SearchRequest$SearchRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term22452;
        callMethod(klass, "sorts", argTypes, term22399, args);
    }

};


