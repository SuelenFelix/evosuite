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

public class AlbumDTO_getIdArtista_3334981016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4931;

    public AlbumDTO_getIdArtista_3334981016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4932 = new Long(2135754395358000892L);
        Long term4946 = new Long(-8085190702504231560L);
        Long term4963 = new Long(1672578078364590450L);
        Long term4966 = new Long(4949335493504695457L);
        Integer term4969 = new Integer(-1530420153);
        Object term4962 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term4962, term4962.getClass(), "idArtista", term4963);
        setField(term4962, term4962.getClass(), "nomeArtista", "");
        setField(term4962, term4962.getClass(), "id", term4966);
        setField(term4962, term4962.getClass(), "titulo", "");
        setField(term4962, term4962.getClass(), "minutos", term4969);
        Long term4972 = new Long(-5216789073301458893L);
        Long term4975 = new Long(-1832940336320585644L);
        Integer term4978 = new Integer(-469968304);
        Object term4971 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term4971, term4971.getClass(), "idArtista", term4972);
        setField(term4971, term4971.getClass(), "nomeArtista", "");
        setField(term4971, term4971.getClass(), "id", term4975);
        setField(term4971, term4971.getClass(), "titulo", "");
        setField(term4971, term4971.getClass(), "minutos", term4978);
        Long term4981 = new Long(-8033714905181142681L);
        Long term4984 = new Long(-9040825890007374809L);
        Integer term4987 = new Integer(-1145578966);
        Object term4980 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term4980, term4980.getClass(), "idArtista", term4981);
        setField(term4980, term4980.getClass(), "nomeArtista", "");
        setField(term4980, term4980.getClass(), "id", term4984);
        setField(term4980, term4980.getClass(), "titulo", "");
        setField(term4980, term4980.getClass(), "minutos", term4987);
        ArrayList term4960 = new ArrayList();
        ((ArrayList) term4960).add(term4962);
        ((ArrayList) term4960).add(term4971);
        ((ArrayList) term4960).add(term4980);
        term4931 = newInstance(Class.forName("br.org.serratec.mm.dto.AlbumDTO"));
        setField(term4931, term4931.getClass(), "id", term4932);
        setField(term4931, term4931.getClass(), "titulo", "JmcmxoGhIK");
        setField(term4931, term4931.getClass(), "idArtista", term4946);
        setField(term4931, term4931.getClass(), "nomeArtista", "jXzmYyrnnT");
        setField(term4931, term4931.getClass(), "musicas", term4960);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.AlbumDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIdArtista", argTypes, term4931, args);
    }

};


