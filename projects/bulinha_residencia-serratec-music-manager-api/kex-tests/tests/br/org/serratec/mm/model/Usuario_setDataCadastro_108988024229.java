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

public class Usuario_setDataCadastro_108988024229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1899;

    public Usuario_setDataCadastro_108988024229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1899 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        setField(term1899, term1899.getClass(), "id", null);
        setField(term1899, term1899.getClass(), "email", null);
        setField(term1899, term1899.getClass(), "nome", null);
        setField(term1899, term1899.getClass(), "senha", null);
        setField(term1899, term1899.getClass(), "perfilUsuario", null);
        setField(term1899, term1899.getClass(), "dataCadastro", null);
        setField(term1899, term1899.getClass(), "dataAlteracao", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Usuario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDataCadastro", argTypes, term1899, args);
    }

};


