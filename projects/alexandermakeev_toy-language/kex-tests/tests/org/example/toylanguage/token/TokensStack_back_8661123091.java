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

public class TokensStack_back_8661123091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5946;

    public TokensStack_back_8661123091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5983 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term5982 = ((Class) term5983).getDeclaredField((String) "Keyword");
        ((Field) term5982).setAccessible(true);
        Object enum19 = ((Field) term5982).get((Object) null);
        Integer term5953 = new Integer(-522618178);
        Object term5949 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term5949, term5949.getClass(), "type", enum19);
        setField(term5949, term5949.getClass(), "value", "");
        setField(term5949, term5949.getClass(), "rowNumber", term5953);
        Class<? extends Object> term6206 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term6205 = ((Class) term6206).getDeclaredField((String) "GroupDivider");
        ((Field) term6205).setAccessible(true);
        Object enum20 = ((Field) term6205).get((Object) null);
        Integer term5959 = new Integer(1134449235);
        Object term5955 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term5955, term5955.getClass(), "type", enum20);
        setField(term5955, term5955.getClass(), "value", "");
        setField(term5955, term5955.getClass(), "rowNumber", term5959);
        Class<? extends Object> term6444 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term6443 = ((Class) term6444).getDeclaredField((String) "Keyword");
        ((Field) term6443).setAccessible(true);
        Object enum21 = ((Field) term6443).get((Object) null);
        Integer term5965 = new Integer(-883034806);
        Object term5961 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term5961, term5961.getClass(), "type", enum21);
        setField(term5961, term5961.getClass(), "value", "");
        setField(term5961, term5961.getClass(), "rowNumber", term5965);
        Class<? extends Object> term6667 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term6666 = ((Class) term6667).getDeclaredField((String) "LineBreak");
        ((Field) term6666).setAccessible(true);
        Object enum22 = ((Field) term6666).get((Object) null);
        Integer term5971 = new Integer(1585847225);
        Object term5967 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term5967, term5967.getClass(), "type", enum22);
        setField(term5967, term5967.getClass(), "value", "");
        setField(term5967, term5967.getClass(), "rowNumber", term5971);
        Class<? extends Object> term6896 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term6895 = ((Class) term6896).getDeclaredField((String) "Text");
        ((Field) term6895).setAccessible(true);
        Object enum23 = ((Field) term6895).get((Object) null);
        Integer term5977 = new Integer(597278769);
        Object term5973 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term5973, term5973.getClass(), "type", enum23);
        setField(term5973, term5973.getClass(), "value", "");
        setField(term5973, term5973.getClass(), "rowNumber", term5977);
        ArrayList term5947 = new ArrayList();
        ((ArrayList) term5947).add(term5949);
        ((ArrayList) term5947).add(term5955);
        ((ArrayList) term5947).add(term5961);
        ((ArrayList) term5947).add(term5967);
        ((ArrayList) term5947).add(term5973);
        term5946 = newInstance(Class.forName("org.example.toylanguage.token.TokensStack"));
        setField(term5946, term5946.getClass(), "tokens", term5947);
        setIntField(term5946, term5946.getClass(), "position", 1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.token.TokensStack");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "back", argTypes, term5946, args);
    }

};


