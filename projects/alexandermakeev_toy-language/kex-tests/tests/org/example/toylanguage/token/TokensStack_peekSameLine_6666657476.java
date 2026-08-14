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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class TokensStack_peekSameLine_6666657476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9977;
     Object enum39;
     Object term10061;

    public TokensStack_peekSameLine_6666657476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10123 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term10122 = ((Class) term10123).getDeclaredField((String) "Comment");
        ((Field) term10122).setAccessible(true);
        Object enum35 = ((Field) term10122).get((Object) null);
        Integer term9984 = new Integer(-1275173084);
        Object term9980 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term9980, term9980.getClass(), "type", enum35);
        setField(term9980, term9980.getClass(), "value", "");
        setField(term9980, term9980.getClass(), "rowNumber", term9984);
        Class<? extends Object> term10346 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term10345 = ((Class) term10346).getDeclaredField((String) "Null");
        ((Field) term10345).setAccessible(true);
        Object enum36 = ((Field) term10345).get((Object) null);
        Integer term9990 = new Integer(-244121226);
        Object term9986 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term9986, term9986.getClass(), "type", enum36);
        setField(term9986, term9986.getClass(), "value", "");
        setField(term9986, term9986.getClass(), "rowNumber", term9990);
        Class<? extends Object> term10560 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term10559 = ((Class) term10560).getDeclaredField((String) "Logical");
        ((Field) term10559).setAccessible(true);
        Object enum37 = ((Field) term10559).get((Object) null);
        Integer term9996 = new Integer(-203030934);
        Object term9992 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term9992, term9992.getClass(), "type", enum37);
        setField(term9992, term9992.getClass(), "value", "");
        setField(term9992, term9992.getClass(), "rowNumber", term9996);
        Integer term10000 = new Integer(-1179120542);
        Object term9998 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term9998, term9998.getClass(), "type", enum36);
        setField(term9998, term9998.getClass(), "value", "");
        setField(term9998, term9998.getClass(), "rowNumber", term10000);
        Class<? extends Object> term10783 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term10782 = ((Class) term10783).getDeclaredField((String) "Operator");
        ((Field) term10782).setAccessible(true);
        Object enum38 = ((Field) term10782).get((Object) null);
        Integer term10006 = new Integer(-73683645);
        Object term10002 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term10002, term10002.getClass(), "type", enum38);
        setField(term10002, term10002.getClass(), "value", "");
        setField(term10002, term10002.getClass(), "rowNumber", term10006);
        ArrayList term9978 = new ArrayList();
        ((ArrayList) term9978).add(term9980);
        ((ArrayList) term9978).add(term9986);
        ((ArrayList) term9978).add(term9992);
        ((ArrayList) term9978).add(term9998);
        ((ArrayList) term9978).add(term10002);
        term9977 = newInstance(Class.forName("org.example.toylanguage.token.TokensStack"));
        setField(term9977, term9977.getClass(), "tokens", term9978);
        setIntField(term9977, term9977.getClass(), "position", -1955890973);
        Class<? extends Object> term11009 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term11008 = ((Class) term11009).getDeclaredField((String) "Logical");
        ((Field) term11008).setAccessible(true);
        enum39 = ((Field) term11008).get((Object) null);
        term10061 = (Object[]) newArray("java.lang.String", 5);
        setElement(term10061, 0, "GzFkzHGYFt");
        setElement(term10061, 1, "tShwQLRGNe");
        setElement(term10061, 2, "LvtrsXUliU");
        setElement(term10061, 3, "xLbjWUgOIL");
        setElement(term10061, 4, "jDtqGUpnZN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.token.TokensStack");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.example.toylanguage.token.TokenType");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = enum39;
        args[1] = "BndsHwAFMv";
        args[2] = term10061;
        callMethod(klass, "peekSameLine", argTypes, term9977, args);
    }

};


