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

public class PlayListDTO_getMusicas_6719687866 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6871;

    public PlayListDTO_getMusicas_6719687866() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6872 = new Long(2145420811068634601L);
        Long term6889 = new Long(2191130532479601175L);
        Integer term6892 = new Integer(1655935355);
        Object term6888 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term6888, term6888.getClass(), "id", term6889);
        setField(term6888, term6888.getClass(), "titulo", "");
        setField(term6888, term6888.getClass(), "minutos", term6892);
        Long term6895 = new Long(860079646007397083L);
        Integer term6898 = new Integer(-481533957);
        Object term6894 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term6894, term6894.getClass(), "id", term6895);
        setField(term6894, term6894.getClass(), "titulo", "");
        setField(term6894, term6894.getClass(), "minutos", term6898);
        Long term6901 = new Long(3230472384687362867L);
        Integer term6904 = new Integer(1240914516);
        Object term6900 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term6900, term6900.getClass(), "id", term6901);
        setField(term6900, term6900.getClass(), "titulo", "");
        setField(term6900, term6900.getClass(), "minutos", term6904);
        Long term6907 = new Long(-1145146470850585022L);
        Integer term6910 = new Integer(-1465035361);
        Object term6906 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term6906, term6906.getClass(), "id", term6907);
        setField(term6906, term6906.getClass(), "titulo", "");
        setField(term6906, term6906.getClass(), "minutos", term6910);
        ArrayList term6886 = new ArrayList();
        ((ArrayList) term6886).add(term6888);
        ((ArrayList) term6886).add(term6894);
        ((ArrayList) term6886).add(term6900);
        ((ArrayList) term6886).add(term6906);
        term6871 = newInstance(Class.forName("br.org.serratec.mm.dto.PlayListDTO"));
        setField(term6871, term6871.getClass(), "id", term6872);
        setField(term6871, term6871.getClass(), "nome", "RCOqfVsRHt");
        setField(term6871, term6871.getClass(), "musicas", term6886);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.PlayListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMusicas", argTypes, term6871, args);
    }

};


