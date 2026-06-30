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

public class AlbumDTO_hashCode_9953160312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5578;

    public AlbumDTO_hashCode_9953160312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5579 = new Long(-948292411727204525L);
        Long term5593 = new Long(-8892586408602479513L);
        Long term5610 = new Long(4616440478358528406L);
        Long term5613 = new Long(3427570961451840069L);
        Integer term5616 = new Integer(1324040357);
        Object term5609 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term5609, term5609.getClass(), "idArtista", term5610);
        setField(term5609, term5609.getClass(), "nomeArtista", "");
        setField(term5609, term5609.getClass(), "id", term5613);
        setField(term5609, term5609.getClass(), "titulo", "");
        setField(term5609, term5609.getClass(), "minutos", term5616);
        ArrayList term5607 = new ArrayList();
        ((ArrayList) term5607).add(term5609);
        term5578 = newInstance(Class.forName("br.org.serratec.mm.dto.AlbumDTO"));
        setField(term5578, term5578.getClass(), "id", term5579);
        setField(term5578, term5578.getClass(), "titulo", "vOuMEpOQAg");
        setField(term5578, term5578.getClass(), "idArtista", term5593);
        setField(term5578, term5578.getClass(), "nomeArtista", "SIODFGaQhr");
        setField(term5578, term5578.getClass(), "musicas", term5607);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.AlbumDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term5578, args);
    }

};


