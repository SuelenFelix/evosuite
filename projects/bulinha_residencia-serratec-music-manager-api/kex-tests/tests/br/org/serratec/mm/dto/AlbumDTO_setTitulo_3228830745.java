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

public class AlbumDTO_setTitulo_3228830745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4838;

    public AlbumDTO_setTitulo_3228830745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4839 = new Long(6689117472719450333L);
        Long term4853 = new Long(5836128569274066678L);
        Long term4870 = new Long(-2177368829816872572L);
        Long term4873 = new Long(-8463029266761149071L);
        Integer term4876 = new Integer(1193880199);
        Object term4869 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term4869, term4869.getClass(), "idArtista", term4870);
        setField(term4869, term4869.getClass(), "nomeArtista", "");
        setField(term4869, term4869.getClass(), "id", term4873);
        setField(term4869, term4869.getClass(), "titulo", "");
        setField(term4869, term4869.getClass(), "minutos", term4876);
        Long term4879 = new Long(3133860696238261492L);
        Long term4882 = new Long(7247160664318067468L);
        Integer term4885 = new Integer(-1087774327);
        Object term4878 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO"));
        setField(term4878, term4878.getClass(), "idArtista", term4879);
        setField(term4878, term4878.getClass(), "nomeArtista", "");
        setField(term4878, term4878.getClass(), "id", term4882);
        setField(term4878, term4878.getClass(), "titulo", "");
        setField(term4878, term4878.getClass(), "minutos", term4885);
        ArrayList term4867 = new ArrayList();
        ((ArrayList) term4867).add(term4869);
        ((ArrayList) term4867).add(term4878);
        term4838 = newInstance(Class.forName("br.org.serratec.mm.dto.AlbumDTO"));
        setField(term4838, term4838.getClass(), "id", term4839);
        setField(term4838, term4838.getClass(), "titulo", "sQvGcVjdEx");
        setField(term4838, term4838.getClass(), "idArtista", term4853);
        setField(term4838, term4838.getClass(), "nomeArtista", "rLHAoqXgPh");
        setField(term4838, term4838.getClass(), "musicas", term4867);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.AlbumDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lihXWlGDxk";
        callMethod(klass, "setTitulo", argTypes, term4838, args);
    }

};


