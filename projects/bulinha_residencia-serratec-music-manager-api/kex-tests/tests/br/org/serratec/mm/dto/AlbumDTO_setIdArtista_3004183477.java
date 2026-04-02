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

public class AlbumDTO_setIdArtista_3004183477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5011;
     Object term5053;

    public AlbumDTO_setIdArtista_3004183477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5012 = new Long(1368340889161782793L);
        Long term5026 = new Long(-5786861555969446503L);
        Long term5043 = new Long(2354625302846375590L);
        Long term5046 = new Long(7276637106827860087L);
        Integer term5049 = new Integer(679763016);
        Object term5042 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term5042, term5042.getClass(), "idArtista", term5043);
        setField(term5042, term5042.getClass(), "nomeArtista", "");
        setField(term5042, term5042.getClass(), "id", term5046);
        setField(term5042, term5042.getClass(), "titulo", "");
        setField(term5042, term5042.getClass(), "minutos", term5049);
        ArrayList term5040 = new ArrayList();
        ((ArrayList) term5040).add(term5042);
        term5011 = newInstance(Class.forName("br.org.serratec.mm.dto.AlbumDTO"));
        setField(term5011, term5011.getClass(), "id", term5012);
        setField(term5011, term5011.getClass(), "titulo", "YpJbIgJWWv");
        setField(term5011, term5011.getClass(), "idArtista", term5026);
        setField(term5011, term5011.getClass(), "nomeArtista", "JppkknKVOw");
        setField(term5011, term5011.getClass(), "musicas", term5040);
        term5053 = new Long(-3936701866695933852L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.AlbumDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term5053;
        callMethod(klass, "setIdArtista", argTypes, term5011, args);
    }

};


