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

public class Usuario_hashCode_128851161532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1902;

    public Usuario_hashCode_128851161532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1902 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        setField(term1902, term1902.getClass(), "id", null);
        setField(term1902, term1902.getClass(), "email", null);
        setField(term1902, term1902.getClass(), "nome", null);
        setField(term1902, term1902.getClass(), "senha", null);
        setField(term1902, term1902.getClass(), "perfilUsuario", null);
        setField(term1902, term1902.getClass(), "dataCadastro", null);
        setField(term1902, term1902.getClass(), "dataAlteracao", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Usuario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1902, args);
    }

};


