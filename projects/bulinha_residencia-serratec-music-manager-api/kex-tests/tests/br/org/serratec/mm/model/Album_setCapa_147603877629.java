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

public class Album_setCapa_147603877629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36275;

    public Album_setCapa_147603877629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36275 = newInstance(Class.forName("br.org.serratec.mm.model.Album"));
        setField(term36275, term36275.getClass(), "id", null);
        setField(term36275, term36275.getClass(), "titulo", null);
        setField(term36275, term36275.getClass(), "artista", null);
        setField(term36275, term36275.getClass(), "capa", null);
        setField(term36275, term36275.getClass(), "musicas", null);
        setField(term36275, term36275.getClass(), "usuario", null);
        setField(term36275, term36275.getClass(), "dataCadastro", null);
        setField(term36275, term36275.getClass(), "dataAlteracao", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Album");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("br.org.serratec.mm.model.Capa");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCapa", argTypes, term36275, args);
    }

};


