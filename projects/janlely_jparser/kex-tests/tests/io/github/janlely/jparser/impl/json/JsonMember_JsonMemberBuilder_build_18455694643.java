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

public class JsonMember_JsonMemberBuilder_build_18455694643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3925;

    public JsonMember_JsonMemberBuilder_build_18455694643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3959 = Class.forName((String) "io.github.janlely.jparser.impl.json.JsonType");
        Field term3958 = ((Class) term3959).getDeclaredField((String) "BOOL");
        ((Field) term3958).setAccessible(true);
        Object enum14 = ((Field) term3958).get((Object) null);
        term3925 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonMember$JsonMemberBuilder"));
        Object term3938 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonValue"));
        Object term3947 = newInstance(Class.forName("java.lang.Object"));
        setField(term3925, term3925.getClass(), "key", "LQFpaHEwXR");
        setField(term3938, term3938.getClass(), "type", enum14);
        setField(term3938, term3938.getClass(), "value", term3947);
        setField(term3925, term3925.getClass(), "value", term3938);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.json.JsonMember$JsonMemberBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term3925, args);
    }

};


