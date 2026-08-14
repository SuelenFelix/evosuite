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

public class Cliente_setId_7679897835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term765;
     Object term804;

    public Cliente_setId_7679897835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term766 = new Integer(-522618178);
        term765 = newInstance(Class.forName("br.com.feltex.excel.modelo.Cliente"));
        setField(term765, term765.getClass(), "id", term766);
        setField(term765, term765.getClass(), "nome", "SbAoxhfrkn");
        setField(term765, term765.getClass(), "email", "kuTXqwMtDB");
        setField(term765, term765.getClass(), "telefone", "Ghbwtircqb");
        term804 = new Integer(1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.feltex.excel.modelo.Cliente");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term804;
        callMethod(klass, "setId", argTypes, term765, args);
    }

};


