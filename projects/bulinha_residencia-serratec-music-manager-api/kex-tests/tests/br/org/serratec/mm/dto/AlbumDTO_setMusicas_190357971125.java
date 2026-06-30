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

public class AlbumDTO_setMusicas_190357971125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5721;

    public AlbumDTO_setMusicas_190357971125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5721 = newInstance(Class.forName("br.org.serratec.mm.dto.AlbumDTO"));
        setField(term5721, term5721.getClass(), "id", null);
        setField(term5721, term5721.getClass(), "titulo", null);
        setField(term5721, term5721.getClass(), "idArtista", null);
        setField(term5721, term5721.getClass(), "nomeArtista", null);
        setField(term5721, term5721.getClass(), "musicas", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.AlbumDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMusicas", argTypes, term5721, args);
    }

};


