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

public class Cliente_setTelefone_10131256858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1018;

    public Cliente_setTelefone_10131256858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1019 = new Integer(597278769);
        term1018 = newInstance(Class.forName("br.com.feltex.excel.modelo.Cliente"));
        setField(term1018, term1018.getClass(), "id", term1019);
        setField(term1018, term1018.getClass(), "nome", "BndsHwAFMv");
        setField(term1018, term1018.getClass(), "email", "GzFkzHGYFt");
        setField(term1018, term1018.getClass(), "telefone", "tShwQLRGNe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.feltex.excel.modelo.Cliente");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LvtrsXUliU";
        callMethod(klass, "setTelefone", argTypes, term1018, args);
    }

};


