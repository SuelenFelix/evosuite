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
import java.lang.Integer;

public class MusicaAlbumDTO_getNomeArtista_20779312262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1844;

    public MusicaAlbumDTO_getNomeArtista_20779312262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1845 = new Long(-8885298608300233488L);
        Long term1859 = new Long(-4325723315152823407L);
        Integer term1873 = new Integer(-2038273078);
        term1844 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term1844, term1844.getClass(), "idArtista", term1845);
        setField(term1844, term1844.getClass(), "nomeArtista", "vQVyKLdtaz");
        setField(term1844, term1844.getClass(), "id", term1859);
        setField(term1844, term1844.getClass(), "titulo", "OWKQODBLzb");
        setField(term1844, term1844.getClass(), "minutos", term1873);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNomeArtista", argTypes, term1844, args);
    }

};


