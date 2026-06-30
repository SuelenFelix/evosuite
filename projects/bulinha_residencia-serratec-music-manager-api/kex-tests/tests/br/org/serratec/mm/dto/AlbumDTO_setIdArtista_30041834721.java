package br.org.serratec.mm.dto;

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
import static br.org.serratec.mm.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AlbumDTO_setIdArtista_30041834721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5717;

    public AlbumDTO_setIdArtista_30041834721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5717 = newInstance(Class.forName("br.org.serratec.mm.dto.AlbumDTO"));
        setField(term5717, term5717.getClass(), "id", null);
        setField(term5717, term5717.getClass(), "titulo", null);
        setField(term5717, term5717.getClass(), "idArtista", null);
        setField(term5717, term5717.getClass(), "nomeArtista", null);
        setField(term5717, term5717.getClass(), "musicas", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.AlbumDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setIdArtista", argTypes, term5717, args);
    }

};


