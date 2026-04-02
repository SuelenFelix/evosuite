package br.org.serratec.mm.model;

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
import static br.org.serratec.mm.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class PlayList_getDataAlteracao_15192481135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2841;

    public PlayList_getDataAlteracao_15192481135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2842 = new Long(-3838084482494604218L);
        Long term2859 = new Long(3892018155439224435L);
        Integer term2862 = new Integer(-1685132342);
        Long term2865 = new Long(5953383087795962419L);
        Object term2858 = newInstance(Class.forName("br.org.serratec.mm.model.Musica"));
        Object term2864 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term2867 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2868 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term2858, term2858.getClass(), "id", term2859);
        setField(term2858, term2858.getClass(), "titulo", "");
        setField(term2858, term2858.getClass(), "minutos", term2862);
        setField(term2864, term2864.getClass(), "id", term2865);
        setField(term2864, term2864.getClass(), "email", null);
        setField(term2864, term2864.getClass(), "nome", null);
        setField(term2864, term2864.getClass(), "senha", null);
        setField(term2864, term2864.getClass(), "perfilUsuario", null);
        setField(term2864, term2864.getClass(), "dataCadastro", null);
        setField(term2864, term2864.getClass(), "dataAlteracao", null);
        setField(term2858, term2858.getClass(), "usuario", term2864);
        setField(term2867, term2867.getClass(), "date", null);
        setField(term2867, term2867.getClass(), "time", null);
        setField(term2858, term2858.getClass(), "dataCadastro", term2867);
        setField(term2868, term2868.getClass(), "date", null);
        setField(term2868, term2868.getClass(), "time", null);
        setField(term2858, term2858.getClass(), "dataAlteracao", term2868);
        ArrayList term2856 = new ArrayList();
        ((ArrayList) term2856).add(term2858);
        Long term2872 = new Long(7994303628307559416L);
        term2841 = newInstance(Class.forName("br.org.serratec.mm.model.PlayList"));
        Object term2871 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term2922 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2923 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2927 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2932 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2933 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2937 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2942 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2943 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2947 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2952 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2953 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2957 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2841, term2841.getClass(), "id", term2842);
        setField(term2841, term2841.getClass(), "nome", "zUlRdimJtU");
        setField(term2841, term2841.getClass(), "musicas", term2856);
        setField(term2871, term2871.getClass(), "id", term2872);
        setField(term2871, term2871.getClass(), "email", "jXzmYyrnnT");
        setField(term2871, term2871.getClass(), "nome", "igCAtimmYB");
        setField(term2871, term2871.getClass(), "senha", "DyiXbeYIaN");
        setField(term2871, term2871.getClass(), "perfilUsuario", "VGizxZnyHX");
        setIntField(term2923, term2923.getClass(), "year", 2013);
        setShortField(term2923, term2923.getClass(), "month", (short) 12);
        setShortField(term2923, term2923.getClass(), "day", (short) 23);
        setField(term2922, term2922.getClass(), "date", term2923);
        setByteField(term2927, term2927.getClass(), "hour", (byte) 1);
        setByteField(term2927, term2927.getClass(), "minute", (byte) 0);
        setByteField(term2927, term2927.getClass(), "second", (byte) 32);
        setIntField(term2927, term2927.getClass(), "nano", 168525686);
        setField(term2922, term2922.getClass(), "time", term2927);
        setField(term2871, term2871.getClass(), "dataCadastro", term2922);
        setIntField(term2933, term2933.getClass(), "year", 2014);
        setShortField(term2933, term2933.getClass(), "month", (short) 1);
        setShortField(term2933, term2933.getClass(), "day", (short) 26);
        setField(term2932, term2932.getClass(), "date", term2933);
        setByteField(term2937, term2937.getClass(), "hour", (byte) 3);
        setByteField(term2937, term2937.getClass(), "minute", (byte) 31);
        setByteField(term2937, term2937.getClass(), "second", (byte) 56);
        setIntField(term2937, term2937.getClass(), "nano", 100873602);
        setField(term2932, term2932.getClass(), "time", term2937);
        setField(term2871, term2871.getClass(), "dataAlteracao", term2932);
        setField(term2841, term2841.getClass(), "usuario", term2871);
        setIntField(term2943, term2943.getClass(), "year", 2021);
        setShortField(term2943, term2943.getClass(), "month", (short) 12);
        setShortField(term2943, term2943.getClass(), "day", (short) 1);
        setField(term2942, term2942.getClass(), "date", term2943);
        setByteField(term2947, term2947.getClass(), "hour", (byte) 15);
        setByteField(term2947, term2947.getClass(), "minute", (byte) 30);
        setByteField(term2947, term2947.getClass(), "second", (byte) 5);
        setIntField(term2947, term2947.getClass(), "nano", 996341606);
        setField(term2942, term2942.getClass(), "time", term2947);
        setField(term2841, term2841.getClass(), "dataCadastro", term2942);
        setIntField(term2953, term2953.getClass(), "year", 2016);
        setShortField(term2953, term2953.getClass(), "month", (short) 4);
        setShortField(term2953, term2953.getClass(), "day", (short) 18);
        setField(term2952, term2952.getClass(), "date", term2953);
        setByteField(term2957, term2957.getClass(), "hour", (byte) 15);
        setByteField(term2957, term2957.getClass(), "minute", (byte) 56);
        setByteField(term2957, term2957.getClass(), "second", (byte) 45);
        setIntField(term2957, term2957.getClass(), "nano", 248103350);
        setField(term2952, term2952.getClass(), "time", term2957);
        setField(term2841, term2841.getClass(), "dataAlteracao", term2952);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.PlayList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataAlteracao", argTypes, term2841, args);
    }

};


