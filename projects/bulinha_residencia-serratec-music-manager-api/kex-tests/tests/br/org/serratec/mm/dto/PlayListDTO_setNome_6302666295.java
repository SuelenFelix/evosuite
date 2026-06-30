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

public class PlayListDTO_setNome_6302666295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6802;

    public PlayListDTO_setNome_6302666295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6803 = new Long(-8338004844694486146L);
        Long term6820 = new Long(6426732259596412988L);
        Integer term6823 = new Integer(1375330971);
        Object term6819 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term6819, term6819.getClass(), "id", term6820);
        setField(term6819, term6819.getClass(), "titulo", "");
        setField(term6819, term6819.getClass(), "minutos", term6823);
        Long term6826 = new Long(185793058502220865L);
        Integer term6829 = new Integer(-478195677);
        Object term6825 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term6825, term6825.getClass(), "id", term6826);
        setField(term6825, term6825.getClass(), "titulo", "");
        setField(term6825, term6825.getClass(), "minutos", term6829);
        Long term6832 = new Long(-7698746988132548371L);
        Integer term6835 = new Integer(972867650);
        Object term6831 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term6831, term6831.getClass(), "id", term6832);
        setField(term6831, term6831.getClass(), "titulo", "");
        setField(term6831, term6831.getClass(), "minutos", term6835);
        ArrayList term6817 = new ArrayList();
        ((ArrayList) term6817).add(term6819);
        ((ArrayList) term6817).add(term6825);
        ((ArrayList) term6817).add(term6831);
        term6802 = newInstance(Class.forName("br.org.serratec.mm.dto.PlayListDTO"));
        setField(term6802, term6802.getClass(), "id", term6803);
        setField(term6802, term6802.getClass(), "nome", "jnwVnmKAFv");
        setField(term6802, term6802.getClass(), "musicas", term6817);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.PlayListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GPSEWEDSTo";
        callMethod(klass, "setNome", argTypes, term6802, args);
    }

};


