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

public class Album_getCapa_119762209036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49628;

    public Album_getCapa_119762209036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49628 = newInstance(Class.forName("br.org.serratec.mm.model.Album"));
        setField(term49628, term49628.getClass(), "id", null);
        setField(term49628, term49628.getClass(), "titulo", null);
        setField(term49628, term49628.getClass(), "artista", null);
        setField(term49628, term49628.getClass(), "capa", null);
        setField(term49628, term49628.getClass(), "musicas", null);
        setField(term49628, term49628.getClass(), "usuario", null);
        setField(term49628, term49628.getClass(), "dataCadastro", null);
        setField(term49628, term49628.getClass(), "dataAlteracao", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Album");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCapa", argTypes, term49628, args);
    }

};


