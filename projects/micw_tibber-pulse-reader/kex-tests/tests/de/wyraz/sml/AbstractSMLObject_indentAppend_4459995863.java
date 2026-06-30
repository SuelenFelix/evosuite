package de.wyraz.sml;

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
import static de.wyraz.sml.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class AbstractSMLObject_indentAppend_4459995863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9514;
     Object term9534;

    public AbstractSMLObject_indentAppend_4459995863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9514 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term9515 = (byte[]) newByteArray(16);
        setField(term9514, term9514.getClass(), "value", term9515);
        setByteField(term9514, term9514.getClass(), "coder", (byte) 79);
        setIntField(term9514, term9514.getClass(), "count", -2027534003);
        term9534 = new Integer(1063420942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.AbstractSMLObject");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term9514;
        args[1] = term9534;
        args[2] = "xxtlPwDYFs";
        callMethod(klass, "indentAppend", argTypes, null, args);
    }

};


