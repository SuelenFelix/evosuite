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

public class Album_setTitulo_35789940917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30626;

    public Album_setTitulo_35789940917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30626 = newInstance(Class.forName("br.org.serratec.mm.model.Album"));
        setField(term30626, term30626.getClass(), "id", null);
        setField(term30626, term30626.getClass(), "titulo", null);
        setField(term30626, term30626.getClass(), "artista", null);
        setField(term30626, term30626.getClass(), "capa", null);
        setField(term30626, term30626.getClass(), "musicas", null);
        setField(term30626, term30626.getClass(), "usuario", null);
        setField(term30626, term30626.getClass(), "dataCadastro", null);
        setField(term30626, term30626.getClass(), "dataAlteracao", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Album");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTitulo", argTypes, term30626, args);
    }

};


