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
import java.lang.Long;
import java.util.ArrayList;

public class AlbumDTO_getNomeArtista_16369476828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5075;

    public AlbumDTO_getNomeArtista_16369476828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5076 = new Long(1215116475929634177L);
        Long term5090 = new Long(1597484336218508869L);
        ArrayList term5104 = new ArrayList();
        term5075 = newInstance(Class.forName("br.org.serratec.mm.dto.AlbumDTO"));
        setField(term5075, term5075.getClass(), "id", term5076);
        setField(term5075, term5075.getClass(), "titulo", "vKQukfbJUd");
        setField(term5075, term5075.getClass(), "idArtista", term5090);
        setField(term5075, term5075.getClass(), "nomeArtista", "lFRJFUMVbx");
        setField(term5075, term5075.getClass(), "musicas", term5104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.AlbumDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNomeArtista", argTypes, term5075, args);
    }

};


