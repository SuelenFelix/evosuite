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

public class Album_getMusicas_8596166235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49627;

    public Album_getMusicas_8596166235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49627 = newInstance(Class.forName("br.org.serratec.mm.model.Album"));
        setField(term49627, term49627.getClass(), "id", null);
        setField(term49627, term49627.getClass(), "titulo", null);
        setField(term49627, term49627.getClass(), "artista", null);
        setField(term49627, term49627.getClass(), "capa", null);
        setField(term49627, term49627.getClass(), "musicas", null);
        setField(term49627, term49627.getClass(), "usuario", null);
        setField(term49627, term49627.getClass(), "dataCadastro", null);
        setField(term49627, term49627.getClass(), "dataAlteracao", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Album");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMusicas", argTypes, term49627, args);
    }

};


