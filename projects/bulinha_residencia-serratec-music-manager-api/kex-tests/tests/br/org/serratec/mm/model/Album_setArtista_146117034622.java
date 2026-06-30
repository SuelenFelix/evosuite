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

public class Album_setArtista_146117034622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44536;

    public Album_setArtista_146117034622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44536 = newInstance(Class.forName("br.org.serratec.mm.model.Album"));
        setField(term44536, term44536.getClass(), "id", null);
        setField(term44536, term44536.getClass(), "titulo", null);
        setField(term44536, term44536.getClass(), "artista", null);
        setField(term44536, term44536.getClass(), "capa", null);
        setField(term44536, term44536.getClass(), "musicas", null);
        setField(term44536, term44536.getClass(), "usuario", null);
        setField(term44536, term44536.getClass(), "dataCadastro", null);
        setField(term44536, term44536.getClass(), "dataAlteracao", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Album");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("br.org.serratec.mm.model.Artista");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setArtista", argTypes, term44536, args);
    }

};


