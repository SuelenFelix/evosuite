package tech.jiayezheng.miniJuliaSonar;

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
import static tech.jiayezheng.miniJuliaSonar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Outliner_Entry_toString_11664313639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term328023;
     Object term328043;

    public Outliner_Entry_toString_11664313639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term328023 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term328024 = (byte[]) newByteArray(16);
        setField(term328023, term328023.getClass(), "value", term328024);
        setByteField(term328023, term328023.getClass(), "coder", (byte) -71);
        setIntField(term328023, term328023.getClass(), "count", -1793997256);
        term328043 = new Integer(-1271598018);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Outliner$Entry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term328023;
        args[1] = term328043;
        callMethod(klass, "toString", argTypes, null, args);
    }

};


