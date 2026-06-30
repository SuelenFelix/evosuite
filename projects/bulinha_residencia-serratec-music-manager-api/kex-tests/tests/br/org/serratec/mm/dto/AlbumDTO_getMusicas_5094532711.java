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

public class AlbumDTO_getMusicas_5094532711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12204;

    public AlbumDTO_getMusicas_5094532711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12205 = new Long(-1964501434345816975L);
        Long term12219 = new Long(4689907154423223972L);
        Long term12236 = new Long(8512025621149521819L);
        Long term12239 = new Long(2022482096970820459L);
        Integer term12242 = new Integer(-615654495);
        Object term12235 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term12235, term12235.getClass(), "idArtista", term12236);
        setField(term12235, term12235.getClass(), "nomeArtista", "");
        setField(term12235, term12235.getClass(), "id", term12239);
        setField(term12235, term12235.getClass(), "titulo", "");
        setField(term12235, term12235.getClass(), "minutos", term12242);
        Long term12245 = new Long(6315101499811179240L);
        Long term12248 = new Long(-3033337370154155851L);
        Integer term12251 = new Integer(-1476117762);
        Object term12244 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term12244, term12244.getClass(), "idArtista", term12245);
        setField(term12244, term12244.getClass(), "nomeArtista", "");
        setField(term12244, term12244.getClass(), "id", term12248);
        setField(term12244, term12244.getClass(), "titulo", "");
        setField(term12244, term12244.getClass(), "minutos", term12251);
        ArrayList term12233 = new ArrayList();
        ((ArrayList) term12233).add(term12235);
        ((ArrayList) term12233).add(term12244);
        term12204 = newInstance(Class.forName("br.org.serratec.mm.dto.AlbumDTO"));
        setField(term12204, term12204.getClass(), "id", term12205);
        setField(term12204, term12204.getClass(), "titulo", "lnvLKbtveE");
        setField(term12204, term12204.getClass(), "idArtista", term12219);
        setField(term12204, term12204.getClass(), "nomeArtista", "FfrrEhTHzQ");
        setField(term12204, term12204.getClass(), "musicas", term12233);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.AlbumDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMusicas", argTypes, term12204, args);
    }

};


