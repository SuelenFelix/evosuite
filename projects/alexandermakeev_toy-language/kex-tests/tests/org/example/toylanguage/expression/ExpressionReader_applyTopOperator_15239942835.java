package org.example.toylanguage.expression;

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
import static org.example.toylanguage.expression.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Integer;

public class ExpressionReader_applyTopOperator_15239942835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10920;

    public ExpressionReader_applyTopOperator_15239942835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11001 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term11000 = ((Class) term11001).getDeclaredField((String) "ClassCast");
        ((Field) term11000).setAccessible(true);
        Object enum19 = ((Field) term11000).get((Object) null);
        Class<? extends Object> term11295 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term11294 = ((Class) term11295).getDeclaredField((String) "ClassProperty");
        ((Field) term11294).setAccessible(true);
        Object enum20 = ((Field) term11294).get((Object) null);
        Class<? extends Object> term11601 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term11600 = ((Class) term11601).getDeclaredField((String) "LessThan");
        ((Field) term11600).setAccessible(true);
        Object enum21 = ((Field) term11600).get((Object) null);
        Class<? extends Object> term11892 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term11891 = ((Class) term11892).getDeclaredField((String) "Subtraction");
        ((Field) term11891).setAccessible(true);
        Object enum22 = ((Field) term11891).get((Object) null);
        Class<? extends Object> term12192 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term12191 = ((Class) term12192).getDeclaredField((String) "LogicalOr");
        ((Field) term12191).setAccessible(true);
        Object enum23 = ((Field) term12191).get((Object) null);
        Class<? extends Object> term12486 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term12485 = ((Class) term12486).getDeclaredField((String) "LeftParen");
        ((Field) term12485).setAccessible(true);
        Object enum24 = ((Field) term12485).get((Object) null);
        Integer term10983 = new Integer(-655067527);
        Object term10982 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term10982, term10982.getClass(), "type", null);
        setField(term10982, term10982.getClass(), "value", null);
        setField(term10982, term10982.getClass(), "rowNumber", term10983);
        Integer term10986 = new Integer(-6029667);
        Object term10985 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term10985, term10985.getClass(), "type", null);
        setField(term10985, term10985.getClass(), "value", null);
        setField(term10985, term10985.getClass(), "rowNumber", term10986);
        Integer term10989 = new Integer(-2068769794);
        Object term10988 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term10988, term10988.getClass(), "type", null);
        setField(term10988, term10988.getClass(), "value", null);
        setField(term10988, term10988.getClass(), "rowNumber", term10989);
        Integer term10992 = new Integer(-117576464);
        Object term10991 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term10991, term10991.getClass(), "type", null);
        setField(term10991, term10991.getClass(), "value", null);
        setField(term10991, term10991.getClass(), "rowNumber", term10992);
        Integer term10995 = new Integer(-1007160944);
        Object term10994 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term10994, term10994.getClass(), "type", null);
        setField(term10994, term10994.getClass(), "value", null);
        setField(term10994, term10994.getClass(), "rowNumber", term10995);
        ArrayList term10980 = new ArrayList();
        ((ArrayList) term10980).add(term10982);
        ((ArrayList) term10980).add(term10985);
        ((ArrayList) term10980).add(term10988);
        ((ArrayList) term10980).add(term10991);
        ((ArrayList) term10980).add(term10994);
        term10920 = newInstance(Class.forName("org.example.toylanguage.expression.ExpressionReader"));
        Object term10921 = newInstance(Class.forName("java.util.Stack"));
        Object[] term10922 = (Object[]) newArray("java.lang.Object", 10);
        Object term10926 = newInstance(Class.forName("java.util.Stack"));
        Object[] term10927 = (Object[]) newArray("java.lang.Object", 10);
        Object term10979 = newInstance(Class.forName("org.example.toylanguage.token.TokensStack"));
        setField(term10921, term10921.getClass(), "elementData", term10922);
        setIntField(term10921, term10921.getClass(), "elementCount", 3);
        setIntField(term10921, term10921.getClass(), "capacityIncrement", 0);
        setIntField(term10921, term10921.getClass(), "modCount", 3);
        setField(term10920, term10920.getClass(), "operands", term10921);
        setElement(term10927, 0, enum19);
        setElement(term10927, 1, enum20);
        setElement(term10927, 2, enum21);
        setElement(term10927, 3, enum20);
        setElement(term10927, 4, enum22);
        setElement(term10927, 5, enum23);
        setElement(term10927, 6, enum24);
        setField(term10926, term10926.getClass(), "elementData", term10927);
        setIntField(term10926, term10926.getClass(), "elementCount", 7);
        setIntField(term10926, term10926.getClass(), "capacityIncrement", 0);
        setIntField(term10926, term10926.getClass(), "modCount", 7);
        setField(term10920, term10920.getClass(), "operators", term10926);
        setField(term10979, term10979.getClass(), "tokens", term10980);
        setIntField(term10979, term10979.getClass(), "position", 1227103734);
        setField(term10920, term10920.getClass(), "tokens", term10979);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.ExpressionReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "applyTopOperator", argTypes, term10920, args);
    }

};


