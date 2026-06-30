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
import java.lang.Object;
import java.lang.Integer;

public class AlbumDTO_setNomeArtista_17399984989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5128;

    public AlbumDTO_setNomeArtista_17399984989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5129 = new Long(-685023850445639859L);
        Long term5143 = new Long(-6950146046121430355L);
        Long term5160 = new Long(1667122142089513324L);
        Long term5163 = new Long(-6342139649364011743L);
        Integer term5166 = new Integer(1962444399);
        Object term5159 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term5159, term5159.getClass(), "idArtista", term5160);
        setField(term5159, term5159.getClass(), "nomeArtista", "");
        setField(term5159, term5159.getClass(), "id", term5163);
        setField(term5159, term5159.getClass(), "titulo", "");
        setField(term5159, term5159.getClass(), "minutos", term5166);
        Long term5169 = new Long(-4924950707540628022L);
        Long term5172 = new Long(-4393710401270724527L);
        Integer term5175 = new Integer(767834723);
        Object term5168 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term5168, term5168.getClass(), "idArtista", term5169);
        setField(term5168, term5168.getClass(), "nomeArtista", "");
        setField(term5168, term5168.getClass(), "id", term5172);
        setField(term5168, term5168.getClass(), "titulo", "");
        setField(term5168, term5168.getClass(), "minutos", term5175);
        ArrayList term5157 = new ArrayList();
        ((ArrayList) term5157).add(term5159);
        ((ArrayList) term5157).add(term5168);
        term5128 = newInstance(Class.forName("br.org.serratec.mm.dto.AlbumDTO"));
        setField(term5128, term5128.getClass(), "id", term5129);
        setField(term5128, term5128.getClass(), "titulo", "sZdUNdggUW");
        setField(term5128, term5128.getClass(), "idArtista", term5143);
        setField(term5128, term5128.getClass(), "nomeArtista", "OqbwYQfvAe");
        setField(term5128, term5128.getClass(), "musicas", term5157);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.AlbumDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kGMQdqJYyB";
        callMethod(klass, "setNomeArtista", argTypes, term5128, args);
    }

};


