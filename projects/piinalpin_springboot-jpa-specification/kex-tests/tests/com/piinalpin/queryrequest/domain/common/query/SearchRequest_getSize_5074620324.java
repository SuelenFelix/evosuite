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

public class SearchRequest_getSize_5074620324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8585;

    public SearchRequest_getSize_5074620324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8656 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term8655 = ((Class) term8656).getDeclaredField((String) "DOUBLE");
        ((Field) term8655).setAccessible(true);
        Object enum26 = ((Field) term8655).get((Object) null);
        ArrayList term8594 = new ArrayList();
        ((ArrayList) term8594).add((Object)null);
        ((ArrayList) term8594).add((Object)null);
        ((ArrayList) term8594).add((Object)null);
        ((ArrayList) term8594).add((Object)null);
        ((ArrayList) term8594).add((Object)null);
        Object term8588 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term8592 = newInstance(Class.forName("java.lang.Object"));
        Object term8593 = newInstance(Class.forName("java.lang.Object"));
        setField(term8588, term8588.getClass(), "key", "");
        setField(term8588, term8588.getClass(), "operator", null);
        setField(term8588, term8588.getClass(), "fieldType", enum26);
        setField(term8588, term8588.getClass(), "value", term8592);
        setField(term8588, term8588.getClass(), "valueTo", term8593);
        setField(term8588, term8588.getClass(), "values", term8594);
        Class<? extends Object> term8961 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term8960 = ((Class) term8961).getDeclaredField((String) "LONG");
        ((Field) term8960).setAccessible(true);
        Object enum27 = ((Field) term8960).get((Object) null);
        ArrayList term8603 = new ArrayList();
        ((ArrayList) term8603).add((Object)null);
        Object term8597 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term8601 = newInstance(Class.forName("java.lang.Object"));
        Object term8602 = newInstance(Class.forName("java.lang.Object"));
        setField(term8597, term8597.getClass(), "key", "");
        setField(term8597, term8597.getClass(), "operator", null);
        setField(term8597, term8597.getClass(), "fieldType", enum27);
        setField(term8597, term8597.getClass(), "value", term8601);
        setField(term8597, term8597.getClass(), "valueTo", term8602);
        setField(term8597, term8597.getClass(), "values", term8603);
        Class<? extends Object> term9260 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term9259 = ((Class) term9260).getDeclaredField((String) "STRING");
        ((Field) term9259).setAccessible(true);
        Object enum28 = ((Field) term9259).get((Object) null);
        ArrayList term8610 = new ArrayList();
        Object term8606 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        setField(term8606, term8606.getClass(), "key", "");
        setField(term8606, term8606.getClass(), "operator", null);
        setField(term8606, term8606.getClass(), "fieldType", enum28);
        setField(term8606, term8606.getClass(), "value", term8601);
        setField(term8606, term8606.getClass(), "valueTo", term8602);
        setField(term8606, term8606.getClass(), "values", term8610);
        Class<? extends Object> term9565 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term9564 = ((Class) term9565).getDeclaredField((String) "CHAR");
        ((Field) term9564).setAccessible(true);
        Object enum29 = ((Field) term9564).get((Object) null);
        ArrayList term8618 = new ArrayList();
        ((ArrayList) term8618).add((Object)null);
        ((ArrayList) term8618).add((Object)null);
        ((ArrayList) term8618).add((Object)null);
        ((ArrayList) term8618).add((Object)null);
        ((ArrayList) term8618).add((Object)null);
        ((ArrayList) term8618).add((Object)null);
        ((ArrayList) term8618).add((Object)null);
        ((ArrayList) term8618).add((Object)null);
        ((ArrayList) term8618).add((Object)null);
        Object term8613 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term8617 = newInstance(Class.forName("java.lang.Object"));
        setField(term8613, term8613.getClass(), "key", "");
        setField(term8613, term8613.getClass(), "operator", null);
        setField(term8613, term8613.getClass(), "fieldType", enum29);
        setField(term8613, term8613.getClass(), "value", term8592);
        setField(term8613, term8613.getClass(), "valueTo", term8617);
        setField(term8613, term8613.getClass(), "values", term8618);
        Class<? extends Object> term9864 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term9863 = ((Class) term9864).getDeclaredField((String) "INTEGER");
        ((Field) term9863).setAccessible(true);
        Object enum30 = ((Field) term9863).get((Object) null);
        ArrayList term8626 = new ArrayList();
        ((ArrayList) term8626).add((Object)null);
        ((ArrayList) term8626).add((Object)null);
        ((ArrayList) term8626).add((Object)null);
        ((ArrayList) term8626).add((Object)null);
        Object term8621 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term8625 = newInstance(Class.forName("java.lang.Object"));
        setField(term8621, term8621.getClass(), "key", "");
        setField(term8621, term8621.getClass(), "operator", null);
        setField(term8621, term8621.getClass(), "fieldType", enum30);
        setField(term8621, term8621.getClass(), "value", term8617);
        setField(term8621, term8621.getClass(), "valueTo", term8625);
        setField(term8621, term8621.getClass(), "values", term8626);
        ArrayList term8586 = new ArrayList();
        ((ArrayList) term8586).add(term8588);
        ((ArrayList) term8586).add(term8597);
        ((ArrayList) term8586).add(term8606);
        ((ArrayList) term8586).add(term8613);
        ((ArrayList) term8586).add(term8621);
        Object term8633 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term8633, term8633.getClass(), "key", "");
        setField(term8633, term8633.getClass(), "direction", null);
        Object term8635 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term8635, term8635.getClass(), "key", "");
        setField(term8635, term8635.getClass(), "direction", null);
        Object term8637 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term8637, term8637.getClass(), "key", "");
        setField(term8637, term8637.getClass(), "direction", null);
        Object term8639 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term8639, term8639.getClass(), "key", "");
        setField(term8639, term8639.getClass(), "direction", null);
        Object term8641 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term8641, term8641.getClass(), "key", "");
        setField(term8641, term8641.getClass(), "direction", null);
        Object term8643 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term8643, term8643.getClass(), "key", "");
        setField(term8643, term8643.getClass(), "direction", null);
        Object term8645 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term8645, term8645.getClass(), "key", "");
        setField(term8645, term8645.getClass(), "direction", null);
        Object term8647 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SortRequest"));
        setField(term8647, term8647.getClass(), "key", "");
        setField(term8647, term8647.getClass(), "direction", null);
        ArrayList term8631 = new ArrayList();
        ((ArrayList) term8631).add(term8633);
        ((ArrayList) term8631).add(term8635);
        ((ArrayList) term8631).add(term8637);
        ((ArrayList) term8631).add(term8639);
        ((ArrayList) term8631).add(term8641);
        ((ArrayList) term8631).add(term8643);
        ((ArrayList) term8631).add(term8645);
        ((ArrayList) term8631).add(term8647);
        Integer term8651 = new Integer(-1955890973);
        Integer term8653 = new Integer(-2038273078);
        term8585 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.SearchRequest"));
        setField(term8585, term8585.getClass(), "filters", term8586);
        setField(term8585, term8585.getClass(), "sorts", term8631);
        setField(term8585, term8585.getClass(), "page", term8651);
        setField(term8585, term8585.getClass(), "size", term8653);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.SearchRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSize", argTypes, term8585, args);
    }

};


