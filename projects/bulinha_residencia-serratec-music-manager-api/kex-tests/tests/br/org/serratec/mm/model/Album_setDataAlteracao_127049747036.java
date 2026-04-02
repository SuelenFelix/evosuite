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

public class Album_setDataAlteracao_127049747036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37960;

    public Album_setDataAlteracao_127049747036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37960 = newInstance(Class.forName("br.org.serratec.mm.model.Album"));
        setField(term37960, term37960.getClass(), "id", null);
        setField(term37960, term37960.getClass(), "titulo", null);
        setField(term37960, term37960.getClass(), "artista", null);
        setField(term37960, term37960.getClass(), "capa", null);
        setField(term37960, term37960.getClass(), "musicas", null);
        setField(term37960, term37960.getClass(), "usuario", null);
        setField(term37960, term37960.getClass(), "dataCadastro", null);
        setField(term37960, term37960.getClass(), "dataAlteracao", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Album");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDataAlteracao", argTypes, term37960, args);
    }

};


