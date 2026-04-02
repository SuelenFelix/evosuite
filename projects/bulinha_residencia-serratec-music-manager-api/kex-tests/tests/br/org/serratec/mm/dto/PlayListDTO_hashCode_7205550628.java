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

public class PlayListDTO_hashCode_7205550628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7010;

    public PlayListDTO_hashCode_7205550628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7011 = new Long(-2955854401507097864L);
        Long term7028 = new Long(329213208496958131L);
        Integer term7031 = new Integer(941650513);
        Object term7027 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term7027, term7027.getClass(), "id", term7028);
        setField(term7027, term7027.getClass(), "titulo", "");
        setField(term7027, term7027.getClass(), "minutos", term7031);
        Long term7034 = new Long(8107921244631636572L);
        Integer term7037 = new Integer(444029505);
        Object term7033 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term7033, term7033.getClass(), "id", term7034);
        setField(term7033, term7033.getClass(), "titulo", "");
        setField(term7033, term7033.getClass(), "minutos", term7037);
        Long term7040 = new Long(-7904053112604879960L);
        Integer term7043 = new Integer(-1034506028);
        Object term7039 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term7039, term7039.getClass(), "id", term7040);
        setField(term7039, term7039.getClass(), "titulo", "");
        setField(term7039, term7039.getClass(), "minutos", term7043);
        Long term7046 = new Long(-6602460430714339690L);
        Integer term7049 = new Integer(-1263114719);
        Object term7045 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term7045, term7045.getClass(), "id", term7046);
        setField(term7045, term7045.getClass(), "titulo", "");
        setField(term7045, term7045.getClass(), "minutos", term7049);
        Long term7052 = new Long(21047099434645581L);
        Integer term7055 = new Integer(-894662986);
        Object term7051 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term7051, term7051.getClass(), "id", term7052);
        setField(term7051, term7051.getClass(), "titulo", "");
        setField(term7051, term7051.getClass(), "minutos", term7055);
        Long term7058 = new Long(-8862087040734407227L);
        Integer term7061 = new Integer(304775596);
        Object term7057 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term7057, term7057.getClass(), "id", term7058);
        setField(term7057, term7057.getClass(), "titulo", "");
        setField(term7057, term7057.getClass(), "minutos", term7061);
        ArrayList term7025 = new ArrayList();
        ((ArrayList) term7025).add(term7027);
        ((ArrayList) term7025).add(term7033);
        ((ArrayList) term7025).add(term7039);
        ((ArrayList) term7025).add(term7045);
        ((ArrayList) term7025).add(term7051);
        ((ArrayList) term7025).add(term7057);
        term7010 = newInstance(Class.forName("br.org.serratec.mm.dto.PlayListDTO"));
        setField(term7010, term7010.getClass(), "id", term7011);
        setField(term7010, term7010.getClass(), "nome", "zsWKWiTFuo");
        setField(term7010, term7010.getClass(), "musicas", term7025);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.PlayListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term7010, args);
    }

};


