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

public class Album_getDataCadastro_12812349896 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37316;

    public Album_getDataCadastro_12812349896() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37316 = newInstance(Class.forName("br.org.serratec.mm.model.Album"));
        setField(term37316, term37316.getClass(), "id", null);
        setField(term37316, term37316.getClass(), "titulo", null);
        setField(term37316, term37316.getClass(), "artista", null);
        setField(term37316, term37316.getClass(), "capa", null);
        setField(term37316, term37316.getClass(), "musicas", null);
        setField(term37316, term37316.getClass(), "usuario", null);
        setField(term37316, term37316.getClass(), "dataCadastro", null);
        setField(term37316, term37316.getClass(), "dataAlteracao", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Album");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataCadastro", argTypes, term37316, args);
    }

};


