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

public class Album_setId_63941855415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41232;

    public Album_setId_63941855415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41232 = newInstance(Class.forName("br.org.serratec.mm.model.Album"));
        setField(term41232, term41232.getClass(), "id", null);
        setField(term41232, term41232.getClass(), "titulo", null);
        setField(term41232, term41232.getClass(), "artista", null);
        setField(term41232, term41232.getClass(), "capa", null);
        setField(term41232, term41232.getClass(), "musicas", null);
        setField(term41232, term41232.getClass(), "usuario", null);
        setField(term41232, term41232.getClass(), "dataCadastro", null);
        setField(term41232, term41232.getClass(), "dataAlteracao", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Album");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setId", argTypes, term41232, args);
    }

};


