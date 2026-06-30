package io.github.janlely.jparser.impl.json;

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
import static io.github.janlely.jparser.impl.json.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.String;

public class JsonArray_addAll_3349835551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4481;
     Object term4486;

    public JsonArray_addAll_3349835551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4482 = new ArrayList();
        term4481 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonArray"));
        setField(term4481, term4481.getClass(), "array", term4482);
        Class<? extends Object> term4510 = Class.forName((String) "io.github.janlely.jparser.impl.json.JsonType");
        Field term4509 = ((Class) term4510).getDeclaredField((String) "BOOL");
        ((Field) term4509).setAccessible(true);
        Object enum16 = ((Field) term4509).get((Object) null);
        Object term4489 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonValue"));
        Object term4493 = newInstance(Class.forName("java.lang.Object"));
        setField(term4489, term4489.getClass(), "type", enum16);
        setField(term4489, term4489.getClass(), "value", term4493);
        Class<? extends Object> term4749 = Class.forName((String) "io.github.janlely.jparser.impl.json.JsonType");
        Field term4748 = ((Class) term4749).getDeclaredField((String) "NUMBER");
        ((Field) term4748).setAccessible(true);
        Object enum17 = ((Field) term4748).get((Object) null);
        Object term4495 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonValue"));
        Object term4498 = newInstance(Class.forName("java.lang.Object"));
        setField(term4495, term4495.getClass(), "type", enum17);
        setField(term4495, term4495.getClass(), "value", term4498);
        Object term4500 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonValue"));
        setField(term4500, term4500.getClass(), "type", enum17);
        setField(term4500, term4500.getClass(), "value", null);
        term4486 = new LinkedList();
        ((LinkedList) term4486).add(term4489);
        ((LinkedList) term4486).add(term4495);
        ((LinkedList) term4486).add(term4500);
        ((LinkedList) term4486).add((Object)null);
        ((LinkedList) term4486).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.json.JsonArray");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term4486;
        callMethod(klass, "addAll", argTypes, term4481, args);
    }

};


