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

public class Cliente_ClienteBuilder_telefone_11793458504 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254;

    public Cliente_ClienteBuilder_telefone_11793458504() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term255 = new Integer(-1922583790);
        term254 = newInstance(Class.forName("br.com.feltex.excel.modelo.Cliente$ClienteBuilder"));
        setField(term254, term254.getClass(), "id", term255);
        setField(term254, term254.getClass(), "nome", "uuaPigETmJ");
        setField(term254, term254.getClass(), "email", "MxlszYVzRf");
        setField(term254, term254.getClass(), "telefone", "LQFpaHEwXR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.feltex.excel.modelo.Cliente$ClienteBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oVcInYnLWB";
        callMethod(klass, "telefone", argTypes, term254, args);
    }

};


