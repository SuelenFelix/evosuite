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

public class Usuario_getDataAlteracao_208655039530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1900;

    public Usuario_getDataAlteracao_208655039530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1900 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        setField(term1900, term1900.getClass(), "id", null);
        setField(term1900, term1900.getClass(), "email", null);
        setField(term1900, term1900.getClass(), "nome", null);
        setField(term1900, term1900.getClass(), "senha", null);
        setField(term1900, term1900.getClass(), "perfilUsuario", null);
        setField(term1900, term1900.getClass(), "dataCadastro", null);
        setField(term1900, term1900.getClass(), "dataAlteracao", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Usuario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataAlteracao", argTypes, term1900, args);
    }

};


