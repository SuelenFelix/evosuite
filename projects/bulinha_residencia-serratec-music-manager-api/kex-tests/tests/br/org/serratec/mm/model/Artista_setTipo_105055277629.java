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

public class Artista_setTipo_105055277629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13100;

    public Artista_setTipo_105055277629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13100 = newInstance(Class.forName("br.org.serratec.mm.model.Artista"));
        setField(term13100, term13100.getClass(), "id", null);
        setField(term13100, term13100.getClass(), "nome", null);
        setField(term13100, term13100.getClass(), "tipo", null);
        setField(term13100, term13100.getClass(), "usuario", null);
        setField(term13100, term13100.getClass(), "dataCadastro", null);
        setField(term13100, term13100.getClass(), "dataAlteracao", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Artista");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("br.org.serratec.mm.enums.TipoArtista");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTipo", argTypes, term13100, args);
    }

};


