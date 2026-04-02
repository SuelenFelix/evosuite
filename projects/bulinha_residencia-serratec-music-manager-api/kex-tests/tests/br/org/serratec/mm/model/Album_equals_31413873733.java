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

public class Album_equals_31413873733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37958;

    public Album_equals_31413873733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37958 = newInstance(Class.forName("br.org.serratec.mm.model.Album"));
        setField(term37958, term37958.getClass(), "id", null);
        setField(term37958, term37958.getClass(), "titulo", null);
        setField(term37958, term37958.getClass(), "artista", null);
        setField(term37958, term37958.getClass(), "capa", null);
        setField(term37958, term37958.getClass(), "musicas", null);
        setField(term37958, term37958.getClass(), "usuario", null);
        setField(term37958, term37958.getClass(), "dataCadastro", null);
        setField(term37958, term37958.getClass(), "dataAlteracao", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Album");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term37958, args);
    }

};


