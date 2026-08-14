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

public class Cliente_canEqual_188497731310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1179;
     Object term1218;

    public Cliente_canEqual_188497731310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1180 = new Integer(-1456670397);
        term1179 = newInstance(Class.forName("br.com.feltex.excel.modelo.Cliente"));
        setField(term1179, term1179.getClass(), "id", term1180);
        setField(term1179, term1179.getClass(), "nome", "UiUYnPrcCi");
        setField(term1179, term1179.getClass(), "email", "UoYtihxVaS");
        setField(term1179, term1179.getClass(), "telefone", "JDswTTCZHV");
        term1218 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.feltex.excel.modelo.Cliente");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1218;
        callMethod(klass, "canEqual", argTypes, term1179, args);
    }

};


