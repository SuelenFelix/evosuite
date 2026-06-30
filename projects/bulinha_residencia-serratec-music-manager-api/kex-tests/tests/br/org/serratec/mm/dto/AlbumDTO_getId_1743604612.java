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

public class AlbumDTO_getId_1743604612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4533;

    public AlbumDTO_getId_1743604612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4534 = new Long(2936323121573284007L);
        Long term4548 = new Long(-1154553077993834885L);
        Long term4565 = new Long(-2850532706972744550L);
        Long term4568 = new Long(-2644215923136513282L);
        Integer term4571 = new Integer(1622346318);
        Object term4564 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term4564, term4564.getClass(), "idArtista", term4565);
        setField(term4564, term4564.getClass(), "nomeArtista", "");
        setField(term4564, term4564.getClass(), "id", term4568);
        setField(term4564, term4564.getClass(), "titulo", "");
        setField(term4564, term4564.getClass(), "minutos", term4571);
        Long term4574 = new Long(-1468719814009985452L);
        Long term4577 = new Long(-7738503207562305297L);
        Integer term4580 = new Integer(1048535127);
        Object term4573 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term4573, term4573.getClass(), "idArtista", term4574);
        setField(term4573, term4573.getClass(), "nomeArtista", "");
        setField(term4573, term4573.getClass(), "id", term4577);
        setField(term4573, term4573.getClass(), "titulo", "");
        setField(term4573, term4573.getClass(), "minutos", term4580);
        Long term4583 = new Long(3825396310311739952L);
        Long term4586 = new Long(-3838084482494604218L);
        Integer term4589 = new Integer(-655067527);
        Object term4582 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term4582, term4582.getClass(), "idArtista", term4583);
        setField(term4582, term4582.getClass(), "nomeArtista", "");
        setField(term4582, term4582.getClass(), "id", term4586);
        setField(term4582, term4582.getClass(), "titulo", "");
        setField(term4582, term4582.getClass(), "minutos", term4589);
        Long term4592 = new Long(3892018155439224435L);
        Long term4595 = new Long(5953383087795962419L);
        Integer term4598 = new Integer(-6029667);
        Object term4591 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term4591, term4591.getClass(), "idArtista", term4592);
        setField(term4591, term4591.getClass(), "nomeArtista", "");
        setField(term4591, term4591.getClass(), "id", term4595);
        setField(term4591, term4591.getClass(), "titulo", "");
        setField(term4591, term4591.getClass(), "minutos", term4598);
        Long term4601 = new Long(7994303628307559416L);
        Long term4604 = new Long(2443640364875054177L);
        Integer term4607 = new Integer(-2068769794);
        Object term4600 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term4600, term4600.getClass(), "idArtista", term4601);
        setField(term4600, term4600.getClass(), "nomeArtista", "");
        setField(term4600, term4600.getClass(), "id", term4604);
        setField(term4600, term4600.getClass(), "titulo", "");
        setField(term4600, term4600.getClass(), "minutos", term4607);
        Long term4610 = new Long(-1610676979013636850L);
        Long term4613 = new Long(2062173786000223358L);
        Integer term4616 = new Integer(-117576464);
        Object term4609 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term4609, term4609.getClass(), "idArtista", term4610);
        setField(term4609, term4609.getClass(), "nomeArtista", "");
        setField(term4609, term4609.getClass(), "id", term4613);
        setField(term4609, term4609.getClass(), "titulo", "");
        setField(term4609, term4609.getClass(), "minutos", term4616);
        ArrayList term4562 = new ArrayList();
        ((ArrayList) term4562).add(term4564);
        ((ArrayList) term4562).add(term4573);
        ((ArrayList) term4562).add(term4582);
        ((ArrayList) term4562).add(term4591);
        ((ArrayList) term4562).add(term4600);
        ((ArrayList) term4562).add(term4609);
        term4533 = newInstance(Class.forName("br.org.serratec.mm.dto.AlbumDTO"));
        setField(term4533, term4533.getClass(), "id", term4534);
        setField(term4533, term4533.getClass(), "titulo", "xJgPlLxpgC");
        setField(term4533, term4533.getClass(), "idArtista", term4548);
        setField(term4533, term4533.getClass(), "nomeArtista", "EYtfuJaxiM");
        setField(term4533, term4533.getClass(), "musicas", term4562);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.AlbumDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term4533, args);
    }

};


