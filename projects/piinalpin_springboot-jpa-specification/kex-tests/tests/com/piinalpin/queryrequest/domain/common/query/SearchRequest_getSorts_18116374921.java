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

public class SearchRequest_getSorts_18116374921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6366;

    public SearchRequest_getSorts_18116374921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6421 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term6420 = ((Class) term6421).getDeclaredField((String) "CHAR");
        ((Field) term6420).setAccessible(true);
        Object enum19 = ((Field) term6420).get((Object) null);
        ArrayList term6375 = new ArrayList();
        ((ArrayList) term6375).add((Object)null);
        ((ArrayList) term6375).add((Object)null);
        ((ArrayList) term6375).add((Object)null);
        ((ArrayList) term6375).add((Object)null);
        ((ArrayList) term6375).add((Object)null);
        Object term6369 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term6373 = newInstance(Class.forName("java.lang.Object"));
        Object term6374 = newInstance(Class.forName("java.lang.Object"));
        setField(term6369, term6369.getClass(), "key", "");
        setField(term6369, term6369.getClass(), "operator", null);
        setField(term6369, term6369.getClass(), "fieldType", enum19);
        setField(term6369, term6369.getClass(), "value", term6373);
        setField(term6369, term6369.getClass(), "valueTo", term6374);
        setField(term6369, term6369.getClass(), "values", term6375);
        ArrayList term6382 = new ArrayList();
        ((ArrayList) term6382).add((Object)null);
        ((ArrayList) term6382).add((Object)null);
        ((ArrayList) term6382).add((Object)null);
        ((ArrayList) term6382).add((Object)null);
        Object term6378 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term6380 = newInstance(Class.forName("java.lang.Object"));
        Object term6381 = newInstance(Class.forName("java.lang.Object"));
        setField(term6378, term6378.getClass(), "key", "");
        setField(term6378, term6378.getClass(), "operator", null);
        setField(term6378, term6378.getClass(), "fieldType", enum19);
        setField(term6378, term6378.getClass(), "value", term6380);
        setField(term6378, term6378.getClass(), "valueTo", term6381);
        setField(term6378, term6378.getClass(), "values", term6382);
        Class<? extends Object> term6720 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term6719 = ((Class) term6720).getDeclaredField((String) "LONG");
        ((Field) term6719).setAccessible(true);
        Object enum20 = ((Field) term6719).get((Object) null);
        ArrayList term6391 = new ArrayList();
        ((ArrayList) term6391).add((Object)null);
        Object term6385 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term6389 = newInstance(Class.forName("java.lang.Object"));
        Object term6390 = newInstance(Class.forName("java.lang.Object"));
        setField(term6385, term6385.getClass(), "key", "");
        setField(term6385, term6385.getClass(), "operator", null);
        setField(term6385, term6385.getClass(), "fieldType", enum20);
        setField(term6385, term6385.getClass(), "value", term6389);
        setField(term6385, term6385.getClass(), "valueTo", term6390);
        setField(term6385, term6385.getClass(), "values", term6391);
        Class<? extends Object> term7019 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term7018 = ((Class) term7019).getDeclaredField((String) "DATE");
        ((Field) term7018).setAccessible(true);
        Object enum21 = ((Field) term7018).get((Object) null);
        ArrayList term6399 = new ArrayList();
        ((ArrayList) term6399).add((Object)null);
        ((ArrayList) term6399).add((Object)null);
        Object term6394 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term6398 = newInstance(Class.forName("java.lang.Object"));
        setField(term6394, term6394.getClass(), "key", "");
        setField(term6394, term6394.getClass(), "operator", null);
        setField(term6394, term6394.getClass(), "fieldType", enum21);
        setField(term6394, term6394.getClass(), "value", term6374);
        setField(term6394, term6394.getClass(), "valueTo", term6398);
        setField(term6394, term6394.getClass(), "values", term6399);
        ArrayList term6405 = new ArrayList();
        ((ArrayList) term6405).add((Object)null);
        ((ArrayList) term6405).add((Object)null);
        ((ArrayList) term6405).add((Object)null);
        ((ArrayList) term6405).add((Object)null);
        ((ArrayList) term6405).add((Object)null);
        ((ArrayList) term6405).add((Object)null);
        Object term6402 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term6404 = newInstance(Class.forName("java.lang.Object"));
        setField(term6402, term6402.getClass(), "key", "");
        setField(term6402, term6402.getClass(), "operator", null);
        setField(term6402, term6402.getClass(), "fieldType", enum21);
        setField(term6402, term6402.getClass(), "value", term6404);
        setField(term6402, term6402.getClass(), "valueTo", term6398);
        setField(term6402, term6402.getClass(), "values", term6405);
        ArrayList term6367 = new ArrayList();
        ((ArrayList) term6367).add(term6369);
        ((ArrayList) term6367).add(term6378);
        ((ArrayList) term6367).add(term6385);
        ((ArrayList) term6367).add(term6394);
        ((ArrayList) term6367).add(term6402);
        Object term6412 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term6412, term6412.getClass(), "key", "");
        setField(term6412, term6412.getClass(), "direction", null);
        ArrayList term6410 = new ArrayList();
        ((ArrayList) term6410).add(term6412);
        Integer term6416 = new Integer(1484323161);
        Integer term6418 = new Integer(391863371);
        term6366 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SearchRequest"));
        setField(term6366, term6366.getClass(), "filters", term6367);
        setField(term6366, term6366.getClass(), "sorts", term6410);
        setField(term6366, term6366.getClass(), "page", term6416);
        setField(term6366, term6366.getClass(), "size", term6418);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.SearchRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSorts", argTypes, term6366, args);
    }

};


