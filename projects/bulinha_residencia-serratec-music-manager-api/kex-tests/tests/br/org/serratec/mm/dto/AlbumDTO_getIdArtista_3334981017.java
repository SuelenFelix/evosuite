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

public class AlbumDTO_getIdArtista_3334981017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11806;

    public AlbumDTO_getIdArtista_3334981017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11807 = new Long(6248239231585852341L);
        Long term11821 = new Long(-88538481937688851L);
        Long term11838 = new Long(4069264186851023313L);
        Long term11841 = new Long(5184635470881147510L);
        Integer term11844 = new Integer(-1772434990);
        Object term11837 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term11837, term11837.getClass(), "idArtista", term11838);
        setField(term11837, term11837.getClass(), "nomeArtista", "");
        setField(term11837, term11837.getClass(), "id", term11841);
        setField(term11837, term11837.getClass(), "titulo", "");
        setField(term11837, term11837.getClass(), "minutos", term11844);
        ArrayList term11835 = new ArrayList();
        ((ArrayList) term11835).add(term11837);
        term11806 = newInstance(Class.forName("br.org.serratec.mm.dto.AlbumDTO"));
        setField(term11806, term11806.getClass(), "id", term11807);
        setField(term11806, term11806.getClass(), "titulo", "FvUCZgTXhq");
        setField(term11806, term11806.getClass(), "idArtista", term11821);
        setField(term11806, term11806.getClass(), "nomeArtista", "wWWidPCHzx");
        setField(term11806, term11806.getClass(), "musicas", term11835);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.AlbumDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIdArtista", argTypes, term11806, args);
    }

};


