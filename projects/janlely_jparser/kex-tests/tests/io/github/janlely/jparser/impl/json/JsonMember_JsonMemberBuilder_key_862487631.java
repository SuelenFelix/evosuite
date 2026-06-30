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
import java.lang.Object;
import java.lang.String;

public class JsonMember_JsonMemberBuilder_key_862487631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3094;

    public JsonMember_JsonMemberBuilder_key_862487631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3141 = Class.forName((String) "io.github.janlely.jparser.impl.json.JsonType");
        Field term3140 = ((Class) term3141).getDeclaredField((String) "ARRAY");
        ((Field) term3140).setAccessible(true);
        Object enum11 = ((Field) term3140).get((Object) null);
        term3094 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonMember$JsonMemberBuilder"));
        Object term3107 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonValue"));
        Object term3117 = newInstance(Class.forName("java.lang.Object"));
        setField(term3094, term3094.getClass(), "key", "NRdvgJlhkX");
        setField(term3107, term3107.getClass(), "type", enum11);
        setField(term3107, term3107.getClass(), "value", term3117);
        setField(term3094, term3094.getClass(), "value", term3107);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.json.JsonMember$JsonMemberBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uuaPigETmJ";
        callMethod(klass, "key", argTypes, term3094, args);
    }

};


