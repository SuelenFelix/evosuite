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

public class Album_setDataAlteracao_127049747012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39855;

    public Album_setDataAlteracao_127049747012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39855 = newInstance(Class.forName("br.org.serratec.mm.model.Album"));
        setField(term39855, term39855.getClass(), "id", null);
        setField(term39855, term39855.getClass(), "titulo", null);
        setField(term39855, term39855.getClass(), "artista", null);
        setField(term39855, term39855.getClass(), "capa", null);
        setField(term39855, term39855.getClass(), "musicas", null);
        setField(term39855, term39855.getClass(), "usuario", null);
        setField(term39855, term39855.getClass(), "dataCadastro", null);
        setField(term39855, term39855.getClass(), "dataAlteracao", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Album");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDataAlteracao", argTypes, term39855, args);
    }

};


