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

public class ExpressionReader_readFunctionInvocation_18403510667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13458;
     Object term13525;

    public ExpressionReader_readFunctionInvocation_18403510667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13669 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term13668 = ((Class) term13669).getDeclaredField((String) "RightParen");
        ((Field) term13668).setAccessible(true);
        Object enum27 = ((Field) term13668).get((Object) null);
        Class<? extends Object> term13966 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term13965 = ((Class) term13966).getDeclaredField((String) "GreaterThan");
        ((Field) term13965).setAccessible(true);
        Object enum28 = ((Field) term13965).get((Object) null);
        Class<? extends Object> term14266 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term14265 = ((Class) term14266).getDeclaredField((String) "ClassCast");
        ((Field) term14265).setAccessible(true);
        Object enum29 = ((Field) term14265).get((Object) null);
        Class<? extends Object> term14560 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term14559 = ((Class) term14560).getDeclaredField((String) "ClassCast");
        ((Field) term14559).setAccessible(true);
        Object enum30 = ((Field) term14559).get((Object) null);
        Class<? extends Object> term14854 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term14853 = ((Class) term14854).getDeclaredField((String) "Addition");
        ((Field) term14853).setAccessible(true);
        Object enum31 = ((Field) term14853).get((Object) null);
        Integer term13511 = new Integer(1193880199);
        Object term13510 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term13510, term13510.getClass(), "type", null);
        setField(term13510, term13510.getClass(), "value", null);
        setField(term13510, term13510.getClass(), "rowNumber", term13511);
        Integer term13514 = new Integer(-1087774327);
        Object term13513 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term13513, term13513.getClass(), "type", null);
        setField(term13513, term13513.getClass(), "value", null);
        setField(term13513, term13513.getClass(), "rowNumber", term13514);
        Integer term13517 = new Integer(-1530420153);
        Object term13516 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term13516, term13516.getClass(), "type", null);
        setField(term13516, term13516.getClass(), "value", null);
        setField(term13516, term13516.getClass(), "rowNumber", term13517);
        Integer term13520 = new Integer(-469968304);
        Object term13519 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term13519, term13519.getClass(), "type", null);
        setField(term13519, term13519.getClass(), "value", null);
        setField(term13519, term13519.getClass(), "rowNumber", term13520);
        ArrayList term13508 = new ArrayList();
        ((ArrayList) term13508).add(term13510);
        ((ArrayList) term13508).add(term13513);
        ((ArrayList) term13508).add(term13516);
        ((ArrayList) term13508).add(term13519);
        term13458 = newInstance(Class.forName("org.example.toylanguage.expression.ExpressionReader"));
        Object term13459 = newInstance(Class.forName("java.util.Stack"));
        Object[] term13460 = (Object[]) newArray("java.lang.Object", 10);
        Object term13464 = newInstance(Class.forName("java.util.Stack"));
        Object[] term13465 = (Object[]) newArray("java.lang.Object", 10);
        Object term13507 = newInstance(Class.forName("org.example.toylanguage.token.TokensStack"));
        setField(term13459, term13459.getClass(), "elementData", term13460);
        setIntField(term13459, term13459.getClass(), "elementCount", 1);
        setIntField(term13459, term13459.getClass(), "capacityIncrement", 0);
        setIntField(term13459, term13459.getClass(), "modCount", 1);
        setField(term13458, term13458.getClass(), "operands", term13459);
        setElement(term13465, 0, enum27);
        setElement(term13465, 1, enum28);
        setElement(term13465, 2, enum29);
        setElement(term13465, 3, enum30);
        setElement(term13465, 4, enum31);
        setElement(term13465, 5, enum30);
        setField(term13464, term13464.getClass(), "elementData", term13465);
        setIntField(term13464, term13464.getClass(), "elementCount", 6);
        setIntField(term13464, term13464.getClass(), "capacityIncrement", 0);
        setIntField(term13464, term13464.getClass(), "modCount", 6);
        setField(term13458, term13458.getClass(), "operators", term13464);
        setField(term13507, term13507.getClass(), "tokens", term13508);
        setIntField(term13507, term13507.getClass(), "position", 1725571209);
        setField(term13458, term13458.getClass(), "tokens", term13507);
        Class<? extends Object> term15145 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term15144 = ((Class) term15145).getDeclaredField((String) "Keyword");
        ((Field) term15144).setAccessible(true);
        Object enum32 = ((Field) term15144).get((Object) null);
        Integer term13666 = new Integer(-1145578966);
        term13525 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term13525, term13525.getClass(), "type", enum32);
        setField(term13525, term13525.getClass(), "value", "OEXDRUKcFl");
        setField(term13525, term13525.getClass(), "rowNumber", term13666);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.ExpressionReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.example.toylanguage.token.Token");
        Object[] args = new Object[1];
        args[0] = term13525;
        callMethod(klass, "readFunctionInvocation", argTypes, term13458, args);
    }

};


