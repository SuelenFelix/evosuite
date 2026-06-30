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

public class MusicaAlbumDTO_getIdArtista_2465902871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1793;

    public MusicaAlbumDTO_getIdArtista_2465902871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1794 = new Long(6967924379644551255L);
        Long term1808 = new Long(-2813493605142626659L);
        Integer term1822 = new Integer(-1955890973);
        term1793 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term1793, term1793.getClass(), "idArtista", term1794);
        setField(term1793, term1793.getClass(), "nomeArtista", "MAcUBcBckh");
        setField(term1793, term1793.getClass(), "id", term1808);
        setField(term1793, term1793.getClass(), "titulo", "oVgzLbrsFr");
        setField(term1793, term1793.getClass(), "minutos", term1822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIdArtista", argTypes, term1793, args);
    }

};


