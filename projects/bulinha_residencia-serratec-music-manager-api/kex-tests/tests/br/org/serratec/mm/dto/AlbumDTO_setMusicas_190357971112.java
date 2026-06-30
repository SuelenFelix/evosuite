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
import java.util.LinkedList;

public class AlbumDTO_setMusicas_190357971112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12275;
     Object term12317;

    public AlbumDTO_setMusicas_190357971112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12276 = new Long(-3130003589475815807L);
        Long term12290 = new Long(-5344598381371854750L);
        Long term12307 = new Long(-3718250311794019732L);
        Long term12310 = new Long(-5935517391653614345L);
        Integer term12313 = new Integer(-341962980);
        Object term12306 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term12306, term12306.getClass(), "idArtista", term12307);
        setField(term12306, term12306.getClass(), "nomeArtista", "");
        setField(term12306, term12306.getClass(), "id", term12310);
        setField(term12306, term12306.getClass(), "titulo", "");
        setField(term12306, term12306.getClass(), "minutos", term12313);
        ArrayList term12304 = new ArrayList();
        ((ArrayList) term12304).add(term12306);
        term12275 = newInstance(Class.forName("br.org.serratec.mm.dto.AlbumDTO"));
        setField(term12275, term12275.getClass(), "id", term12276);
        setField(term12275, term12275.getClass(), "titulo", "LvztehSlhM");
        setField(term12275, term12275.getClass(), "idArtista", term12290);
        setField(term12275, term12275.getClass(), "nomeArtista", "njvnWFTMxN");
        setField(term12275, term12275.getClass(), "musicas", term12304);
        Long term12321 = new Long(-6521561238735301071L);
        Long term12335 = new Long(-6609679920238945303L);
        Integer term12349 = new Integer(1532716628);
        Object term12320 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term12320, term12320.getClass(), "idArtista", term12321);
        setField(term12320, term12320.getClass(), "nomeArtista", "PtIjKpiSix");
        setField(term12320, term12320.getClass(), "id", term12335);
        setField(term12320, term12320.getClass(), "titulo", "NZdTuwSCIM");
        setField(term12320, term12320.getClass(), "minutos", term12349);
        Long term12353 = new Long(-7296330380944173376L);
        Long term12356 = new Long(-8890284990655172580L);
        Integer term12359 = new Integer(-1801760683);
        Object term12352 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term12352, term12352.getClass(), "idArtista", term12353);
        setField(term12352, term12352.getClass(), "nomeArtista", "");
        setField(term12352, term12352.getClass(), "id", term12356);
        setField(term12352, term12352.getClass(), "titulo", "");
        setField(term12352, term12352.getClass(), "minutos", term12359);
        term12317 = new LinkedList();
        ((LinkedList) term12317).add(term12320);
        ((LinkedList) term12317).add(term12352);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.AlbumDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term12317;
        callMethod(klass, "setMusicas", argTypes, term12275, args);
    }

};


