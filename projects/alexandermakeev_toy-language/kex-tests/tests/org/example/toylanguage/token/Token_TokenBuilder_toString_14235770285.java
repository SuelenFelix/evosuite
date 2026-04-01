package org.example.toylanguage.token;

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
import static org.example.toylanguage.token.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class Token_TokenBuilder_toString_14235770285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3536;

    public Token_TokenBuilder_toString_14235770285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3602 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term3601 = ((Class) term3602).getDeclaredField((String) "GroupDivider");
        ((Field) term3601).setAccessible(true);
        Object enum10 = ((Field) term3601).get((Object) null);
        Integer term3599 = new Integer(1725571209);
        term3536 = newInstance(Class.forName("org.example.toylanguage.token.Token$TokenBuilder"));
        setField(term3536, term3536.getClass(), "type", enum10);
        setField(term3536, term3536.getClass(), "value", "NRdvgJlhkX");
        setField(term3536, term3536.getClass(), "rowNumber", term3599);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.token.Token$TokenBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3536, args);
    }

};


