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

public class AlbumDTO_getId_1743604613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11354;

    public AlbumDTO_getId_1743604613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11355 = new Long(9205327385733285058L);
        Long term11369 = new Long(4199886998224701110L);
        Long term11386 = new Long(8540994973773607992L);
        Long term11389 = new Long(-2338103433822116635L);
        Integer term11392 = new Integer(-1588772968);
        Object term11385 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term11385, term11385.getClass(), "idArtista", term11386);
        setField(term11385, term11385.getClass(), "nomeArtista", "");
        setField(term11385, term11385.getClass(), "id", term11389);
        setField(term11385, term11385.getClass(), "titulo", "");
        setField(term11385, term11385.getClass(), "minutos", term11392);
        Long term11395 = new Long(-1885698929232124806L);
        Long term11398 = new Long(5731563613239387113L);
        Integer term11401 = new Integer(-93135961);
        Object term11394 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term11394, term11394.getClass(), "idArtista", term11395);
        setField(term11394, term11394.getClass(), "nomeArtista", "");
        setField(term11394, term11394.getClass(), "id", term11398);
        setField(term11394, term11394.getClass(), "titulo", "");
        setField(term11394, term11394.getClass(), "minutos", term11401);
        Long term11404 = new Long(3381333711768010594L);
        Long term11407 = new Long(3580984732036213717L);
        Integer term11410 = new Integer(-112921587);
        Object term11403 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term11403, term11403.getClass(), "idArtista", term11404);
        setField(term11403, term11403.getClass(), "nomeArtista", "");
        setField(term11403, term11403.getClass(), "id", term11407);
        setField(term11403, term11403.getClass(), "titulo", "");
        setField(term11403, term11403.getClass(), "minutos", term11410);
        Long term11413 = new Long(5330761990446327930L);
        Long term11416 = new Long(-3954795081650780841L);
        Integer term11419 = new Integer(933028652);
        Object term11412 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term11412, term11412.getClass(), "idArtista", term11413);
        setField(term11412, term11412.getClass(), "nomeArtista", "");
        setField(term11412, term11412.getClass(), "id", term11416);
        setField(term11412, term11412.getClass(), "titulo", "");
        setField(term11412, term11412.getClass(), "minutos", term11419);
        ArrayList term11383 = new ArrayList();
        ((ArrayList) term11383).add(term11385);
        ((ArrayList) term11383).add(term11394);
        ((ArrayList) term11383).add(term11403);
        ((ArrayList) term11383).add(term11412);
        term11354 = newInstance(Class.forName("br.org.serratec.mm.dto.AlbumDTO"));
        setField(term11354, term11354.getClass(), "id", term11355);
        setField(term11354, term11354.getClass(), "titulo", "EKpdCBubDE");
        setField(term11354, term11354.getClass(), "idArtista", term11369);
        setField(term11354, term11354.getClass(), "nomeArtista", "zMsSLTfGhl");
        setField(term11354, term11354.getClass(), "musicas", term11383);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.AlbumDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term11354, args);
    }

};


