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

public class JsonMember_JsonMemberBuilder_value_17018023962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3392;
     Object term3417;

    public JsonMember_JsonMemberBuilder_value_17018023962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3439 = Class.forName((String) "io.github.janlely.jparser.impl.json.JsonType");
        Field term3438 = ((Class) term3439).getDeclaredField((String) "OBJECT");
        ((Field) term3438).setAccessible(true);
        Object enum12 = ((Field) term3438).get((Object) null);
        term3392 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonMember$JsonMemberBuilder"));
        Object term3405 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonValue"));
        Object term3416 = newInstance(Class.forName("java.lang.Object"));
        setField(term3392, term3392.getClass(), "key", "MxlszYVzRf");
        setField(term3405, term3405.getClass(), "type", enum12);
        setField(term3405, term3405.getClass(), "value", term3416);
        setField(term3392, term3392.getClass(), "value", term3405);
        Class<? extends Object> term3684 = Class.forName((String) "io.github.janlely.jparser.impl.json.JsonType");
        Field term3683 = ((Class) term3684).getDeclaredField((String) "ARRAY");
        ((Field) term3683).setAccessible(true);
        Object enum13 = ((Field) term3683).get((Object) null);
        term3417 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonValue"));
        Object term3427 = newInstance(Class.forName("java.lang.Object"));
        setField(term3417, term3417.getClass(), "type", enum13);
        setField(term3417, term3417.getClass(), "value", term3427);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.json.JsonMember$JsonMemberBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.janlely.jparser.impl.json.JsonValue");
        Object[] args = new Object[1];
        args[0] = term3417;
        callMethod(klass, "value", argTypes, term3392, args);
    }

};


