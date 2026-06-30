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

public class AlbumDTO_getTitulo_21261704064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4740;

    public AlbumDTO_getTitulo_21261704064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4741 = new Long(7862575738391801707L);
        Long term4755 = new Long(50358265865610362L);
        Long term4772 = new Long(5510783420697225605L);
        Long term4775 = new Long(6005241913654469005L);
        Integer term4778 = new Integer(-244121226);
        Object term4771 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term4771, term4771.getClass(), "idArtista", term4772);
        setField(term4771, term4771.getClass(), "nomeArtista", "");
        setField(term4771, term4771.getClass(), "id", term4775);
        setField(term4771, term4771.getClass(), "titulo", "");
        setField(term4771, term4771.getClass(), "minutos", term4778);
        Long term4781 = new Long(-1983291584002806658L);
        Long term4784 = new Long(5946780097489996391L);
        Integer term4787 = new Integer(-203030934);
        Object term4780 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term4780, term4780.getClass(), "idArtista", term4781);
        setField(term4780, term4780.getClass(), "nomeArtista", "");
        setField(term4780, term4780.getClass(), "id", term4784);
        setField(term4780, term4780.getClass(), "titulo", "");
        setField(term4780, term4780.getClass(), "minutos", term4787);
        Long term4790 = new Long(-8652538484981166496L);
        Long term4793 = new Long(2701184207686293431L);
        Integer term4796 = new Integer(-1179120542);
        Object term4789 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term4789, term4789.getClass(), "idArtista", term4790);
        setField(term4789, term4789.getClass(), "nomeArtista", "");
        setField(term4789, term4789.getClass(), "id", term4793);
        setField(term4789, term4789.getClass(), "titulo", "");
        setField(term4789, term4789.getClass(), "minutos", term4796);
        Long term4799 = new Long(4474998035090263139L);
        Long term4802 = new Long(2848819812340321742L);
        Integer term4805 = new Integer(-73683645);
        Object term4798 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term4798, term4798.getClass(), "idArtista", term4799);
        setField(term4798, term4798.getClass(), "nomeArtista", "");
        setField(term4798, term4798.getClass(), "id", term4802);
        setField(term4798, term4798.getClass(), "titulo", "");
        setField(term4798, term4798.getClass(), "minutos", term4805);
        Long term4808 = new Long(-8876856890348836498L);
        Long term4811 = new Long(846579494941632714L);
        Integer term4814 = new Integer(-226514366);
        Object term4807 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term4807, term4807.getClass(), "idArtista", term4808);
        setField(term4807, term4807.getClass(), "nomeArtista", "");
        setField(term4807, term4807.getClass(), "id", term4811);
        setField(term4807, term4807.getClass(), "titulo", "");
        setField(term4807, term4807.getClass(), "minutos", term4814);
        ArrayList term4769 = new ArrayList();
        ((ArrayList) term4769).add(term4771);
        ((ArrayList) term4769).add(term4780);
        ((ArrayList) term4769).add(term4789);
        ((ArrayList) term4769).add(term4798);
        ((ArrayList) term4769).add(term4807);
        term4740 = newInstance(Class.forName("br.org.serratec.mm.dto.AlbumDTO"));
        setField(term4740, term4740.getClass(), "id", term4741);
        setField(term4740, term4740.getClass(), "titulo", "HWkpTmtlrc");
        setField(term4740, term4740.getClass(), "idArtista", term4755);
        setField(term4740, term4740.getClass(), "nomeArtista", "hMmaoREuCK");
        setField(term4740, term4740.getClass(), "musicas", term4769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.AlbumDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitulo", argTypes, term4740, args);
    }

};


