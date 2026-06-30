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

public class AlbumDTO_equals_34915507213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5640;
     Object term5691;

    public AlbumDTO_equals_34915507213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5641 = new Long(4502292577098212311L);
        Long term5655 = new Long(-3730936709704460408L);
        Long term5672 = new Long(-8614778293741404325L);
        Long term5675 = new Long(-5447369594017685765L);
        Integer term5678 = new Integer(-1588772968);
        Object term5671 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term5671, term5671.getClass(), "idArtista", term5672);
        setField(term5671, term5671.getClass(), "nomeArtista", "");
        setField(term5671, term5671.getClass(), "id", term5675);
        setField(term5671, term5671.getClass(), "titulo", "");
        setField(term5671, term5671.getClass(), "minutos", term5678);
        Long term5681 = new Long(-5724112525188606013L);
        Long term5684 = new Long(-6100012593724108983L);
        Integer term5687 = new Integer(-93135961);
        Object term5680 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term5680, term5680.getClass(), "idArtista", term5681);
        setField(term5680, term5680.getClass(), "nomeArtista", "");
        setField(term5680, term5680.getClass(), "id", term5684);
        setField(term5680, term5680.getClass(), "titulo", "");
        setField(term5680, term5680.getClass(), "minutos", term5687);
        ArrayList term5669 = new ArrayList();
        ((ArrayList) term5669).add(term5671);
        ((ArrayList) term5669).add(term5680);
        term5640 = newInstance(Class.forName("br.org.serratec.mm.dto.AlbumDTO"));
        setField(term5640, term5640.getClass(), "id", term5641);
        setField(term5640, term5640.getClass(), "titulo", "CKWpJaaaxX");
        setField(term5640, term5640.getClass(), "idArtista", term5655);
        setField(term5640, term5640.getClass(), "nomeArtista", "UBRmXJmfrt");
        setField(term5640, term5640.getClass(), "musicas", term5669);
        term5691 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.AlbumDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5691;
        callMethod(klass, "equals", argTypes, term5640, args);
    }

};


