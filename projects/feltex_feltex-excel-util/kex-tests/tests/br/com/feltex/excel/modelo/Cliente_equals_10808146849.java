package br.com.feltex.excel.modelo;

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
import static br.com.feltex.excel.modelo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Cliente_equals_10808146849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1109;
     Object term1148;

    public Cliente_equals_10808146849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1110 = new Integer(-1685132342);
        term1109 = newInstance(Class.forName("br.com.feltex.excel.modelo.Cliente"));
        setField(term1109, term1109.getClass(), "id", term1110);
        setField(term1109, term1109.getClass(), "nome", "xLbjWUgOIL");
        setField(term1109, term1109.getClass(), "email", "jDtqGUpnZN");
        setField(term1109, term1109.getClass(), "telefone", "nGKItKLYNC");
        term1148 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.feltex.excel.modelo.Cliente");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1148;
        callMethod(klass, "equals", argTypes, term1109, args);
    }

};


