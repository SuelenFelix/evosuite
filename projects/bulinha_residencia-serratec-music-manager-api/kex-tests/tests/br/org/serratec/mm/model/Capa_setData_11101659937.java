package br.org.serratec.mm.model;

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
import static br.org.serratec.mm.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Capa_setData_11101659937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28485;

    public Capa_setData_11101659937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28485 = newInstance(Class.forName("br.org.serratec.mm.model.Capa"));
        setField(term28485, term28485.getClass(), "id", null);
        setField(term28485, term28485.getClass(), "album", null);
        setField(term28485, term28485.getClass(), "mimetype", null);
        setField(term28485, term28485.getClass(), "data", null);
        setField(term28485, term28485.getClass(), "usuario", null);
        setField(term28485, term28485.getClass(), "dataCadastro", null);
        setField(term28485, term28485.getClass(), "dataAlteracao", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Capa");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setData", argTypes, term28485, args);
    }

};


