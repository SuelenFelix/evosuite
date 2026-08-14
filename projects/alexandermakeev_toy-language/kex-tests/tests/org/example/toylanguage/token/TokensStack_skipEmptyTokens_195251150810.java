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

public class TokensStack_skipEmptyTokens_195251150810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14702;

    public TokensStack_skipEmptyTokens_195251150810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14731 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term14730 = ((Class) term14731).getDeclaredField((String) "Keyword");
        ((Field) term14730).setAccessible(true);
        Object enum53 = ((Field) term14730).get((Object) null);
        Integer term14709 = new Integer(679763016);
        Object term14705 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term14705, term14705.getClass(), "type", enum53);
        setField(term14705, term14705.getClass(), "value", "");
        setField(term14705, term14705.getClass(), "rowNumber", term14709);
        Class<? extends Object> term14954 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term14953 = ((Class) term14954).getDeclaredField((String) "Null");
        ((Field) term14953).setAccessible(true);
        Object enum54 = ((Field) term14953).get((Object) null);
        Integer term14715 = new Integer(1962444399);
        Object term14711 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term14711, term14711.getClass(), "type", enum54);
        setField(term14711, term14711.getClass(), "value", "");
        setField(term14711, term14711.getClass(), "rowNumber", term14715);
        Integer term14719 = new Integer(767834723);
        Object term14717 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term14717, term14717.getClass(), "type", enum53);
        setField(term14717, term14717.getClass(), "value", "");
        setField(term14717, term14717.getClass(), "rowNumber", term14719);
        Class<? extends Object> term15168 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term15167 = ((Class) term15168).getDeclaredField((String) "Text");
        ((Field) term15167).setAccessible(true);
        Object enum55 = ((Field) term15167).get((Object) null);
        Integer term14725 = new Integer(-602026508);
        Object term14721 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term14721, term14721.getClass(), "type", enum55);
        setField(term14721, term14721.getClass(), "value", "");
        setField(term14721, term14721.getClass(), "rowNumber", term14725);
        ArrayList term14703 = new ArrayList();
        ((ArrayList) term14703).add(term14705);
        ((ArrayList) term14703).add(term14711);
        ((ArrayList) term14703).add(term14717);
        ((ArrayList) term14703).add(term14721);
        term14702 = newInstance(Class.forName("org.example.toylanguage.token.TokensStack"));
        setField(term14702, term14702.getClass(), "tokens", term14703);
        setIntField(term14702, term14702.getClass(), "position", 1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.token.TokensStack");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "skipEmptyTokens", argTypes, term14702, args);
    }

};


