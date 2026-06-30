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

public class JsonMember_JsonMemberBuilder_toString_2267622144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4197;

    public JsonMember_JsonMemberBuilder_toString_2267622144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4233 = Class.forName((String) "io.github.janlely.jparser.impl.json.JsonType");
        Field term4232 = ((Class) term4233).getDeclaredField((String) "NUMBER");
        ((Field) term4232).setAccessible(true);
        Object enum15 = ((Field) term4232).get((Object) null);
        term4197 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonMember$JsonMemberBuilder"));
        Object term4210 = newInstance(Class.forName("io.github.janlely.jparser.impl.json.JsonValue"));
        Object term4221 = newInstance(Class.forName("java.lang.Object"));
        setField(term4197, term4197.getClass(), "key", "oVcInYnLWB");
        setField(term4210, term4210.getClass(), "type", enum15);
        setField(term4210, term4210.getClass(), "value", term4221);
        setField(term4197, term4197.getClass(), "value", term4210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.json.JsonMember$JsonMemberBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4197, args);
    }

};


