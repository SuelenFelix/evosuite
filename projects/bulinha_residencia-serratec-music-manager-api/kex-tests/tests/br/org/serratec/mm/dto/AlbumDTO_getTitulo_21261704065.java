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

public class AlbumDTO_getTitulo_21261704065 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11579;

    public AlbumDTO_getTitulo_21261704065() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11580 = new Long(-2955854401507097864L);
        Long term11594 = new Long(329213208496958131L);
        Long term11611 = new Long(8107921244631636572L);
        Long term11614 = new Long(-7904053112604879960L);
        Integer term11617 = new Integer(-478195677);
        Object term11610 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term11610, term11610.getClass(), "idArtista", term11611);
        setField(term11610, term11610.getClass(), "nomeArtista", "");
        setField(term11610, term11610.getClass(), "id", term11614);
        setField(term11610, term11610.getClass(), "titulo", "");
        setField(term11610, term11610.getClass(), "minutos", term11617);
        Long term11620 = new Long(-6602460430714339690L);
        Long term11623 = new Long(21047099434645581L);
        Integer term11626 = new Integer(972867650);
        Object term11619 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term11619, term11619.getClass(), "idArtista", term11620);
        setField(term11619, term11619.getClass(), "nomeArtista", "");
        setField(term11619, term11619.getClass(), "id", term11623);
        setField(term11619, term11619.getClass(), "titulo", "");
        setField(term11619, term11619.getClass(), "minutos", term11626);
        Long term11629 = new Long(-8862087040734407227L);
        Long term11632 = new Long(-6394943900800506753L);
        Integer term11635 = new Integer(1655935355);
        Object term11628 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term11628, term11628.getClass(), "idArtista", term11629);
        setField(term11628, term11628.getClass(), "nomeArtista", "");
        setField(term11628, term11628.getClass(), "id", term11632);
        setField(term11628, term11628.getClass(), "titulo", "");
        setField(term11628, term11628.getClass(), "minutos", term11635);
        Long term11638 = new Long(-4867941246533901410L);
        Long term11641 = new Long(1044883697493326351L);
        Integer term11644 = new Integer(-481533957);
        Object term11637 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term11637, term11637.getClass(), "idArtista", term11638);
        setField(term11637, term11637.getClass(), "nomeArtista", "");
        setField(term11637, term11637.getClass(), "id", term11641);
        setField(term11637, term11637.getClass(), "titulo", "");
        setField(term11637, term11637.getClass(), "minutos", term11644);
        ArrayList term11608 = new ArrayList();
        ((ArrayList) term11608).add(term11610);
        ((ArrayList) term11608).add(term11619);
        ((ArrayList) term11608).add(term11628);
        ((ArrayList) term11608).add(term11637);
        term11579 = newInstance(Class.forName("br.org.serratec.mm.dto.AlbumDTO"));
        setField(term11579, term11579.getClass(), "id", term11580);
        setField(term11579, term11579.getClass(), "titulo", "lJoltmsadS");
        setField(term11579, term11579.getClass(), "idArtista", term11594);
        setField(term11579, term11579.getClass(), "nomeArtista", "mvfDtZNEHr");
        setField(term11579, term11579.getClass(), "musicas", term11608);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.AlbumDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitulo", argTypes, term11579, args);
    }

};


