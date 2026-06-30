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

public class Usuario_setEmail_202201198521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1891;

    public Usuario_setEmail_202201198521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1891 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        setField(term1891, term1891.getClass(), "id", null);
        setField(term1891, term1891.getClass(), "email", null);
        setField(term1891, term1891.getClass(), "nome", null);
        setField(term1891, term1891.getClass(), "senha", null);
        setField(term1891, term1891.getClass(), "perfilUsuario", null);
        setField(term1891, term1891.getClass(), "dataCadastro", null);
        setField(term1891, term1891.getClass(), "dataAlteracao", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Usuario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEmail", argTypes, term1891, args);
    }

};


