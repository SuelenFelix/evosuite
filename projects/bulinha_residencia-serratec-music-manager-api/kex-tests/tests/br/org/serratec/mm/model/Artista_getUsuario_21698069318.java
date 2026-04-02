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

public class Artista_getUsuario_21698069318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13089;

    public Artista_getUsuario_21698069318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13089 = newInstance(Class.forName("br.org.serratec.mm.model.Artista"));
        setField(term13089, term13089.getClass(), "id", null);
        setField(term13089, term13089.getClass(), "nome", null);
        setField(term13089, term13089.getClass(), "tipo", null);
        setField(term13089, term13089.getClass(), "usuario", null);
        setField(term13089, term13089.getClass(), "dataCadastro", null);
        setField(term13089, term13089.getClass(), "dataAlteracao", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Artista");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsuario", argTypes, term13089, args);
    }

};


