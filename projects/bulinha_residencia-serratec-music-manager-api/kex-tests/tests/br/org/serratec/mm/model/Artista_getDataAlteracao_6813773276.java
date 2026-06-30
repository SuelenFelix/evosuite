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
import java.lang.String;
import java.lang.Object;

public class Artista_getDataAlteracao_6813773276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9160;

    public Artista_getDataAlteracao_6813773276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9161 = new Long(-1505191021111100819L);
        Class<? extends Object> term9289 = Class.forName((String) "br.org.serratec.mm.enums.TipoArtista");
        Field term9288 = ((Class) term9289).getDeclaredField((String) "BANDA");
        ((Field) term9288).setAccessible(true);
        Object enum5 = ((Field) term9288).get((Object) null);
        Long term9188 = new Long(-1000830646340880796L);
        term9160 = newInstance(Class.forName("br.org.serratec.mm.model.Artista"));
        Object term9187 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term9238 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9239 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9243 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9248 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9249 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9253 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9258 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9259 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9263 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9268 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9269 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9273 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term9160, term9160.getClass(), "id", term9161);
        setField(term9160, term9160.getClass(), "nome", "oKhVzOKUFW");
        setField(term9160, term9160.getClass(), "tipo", enum5);
        setField(term9187, term9187.getClass(), "id", term9188);
        setField(term9187, term9187.getClass(), "email", "mNHyqmOAFy");
        setField(term9187, term9187.getClass(), "nome", "UxgSdhxPCH");
        setField(term9187, term9187.getClass(), "senha", "DAujxZPHJC");
        setField(term9187, term9187.getClass(), "perfilUsuario", "IlBhdrCvHq");
        setIntField(term9239, term9239.getClass(), "year", 2022);
        setShortField(term9239, term9239.getClass(), "month", (short) 3);
        setShortField(term9239, term9239.getClass(), "day", (short) 27);
        setField(term9238, term9238.getClass(), "date", term9239);
        setByteField(term9243, term9243.getClass(), "hour", (byte) 18);
        setByteField(term9243, term9243.getClass(), "minute", (byte) 52);
        setByteField(term9243, term9243.getClass(), "second", (byte) 30);
        setIntField(term9243, term9243.getClass(), "nano", 610437590);
        setField(term9238, term9238.getClass(), "time", term9243);
        setField(term9187, term9187.getClass(), "dataCadastro", term9238);
        setIntField(term9249, term9249.getClass(), "year", 2020);
        setShortField(term9249, term9249.getClass(), "month", (short) 10);
        setShortField(term9249, term9249.getClass(), "day", (short) 10);
        setField(term9248, term9248.getClass(), "date", term9249);
        setByteField(term9253, term9253.getClass(), "hour", (byte) 8);
        setByteField(term9253, term9253.getClass(), "minute", (byte) 35);
        setByteField(term9253, term9253.getClass(), "second", (byte) 54);
        setIntField(term9253, term9253.getClass(), "nano", 115111505);
        setField(term9248, term9248.getClass(), "time", term9253);
        setField(term9187, term9187.getClass(), "dataAlteracao", term9248);
        setField(term9160, term9160.getClass(), "usuario", term9187);
        setIntField(term9259, term9259.getClass(), "year", 2017);
        setShortField(term9259, term9259.getClass(), "month", (short) 10);
        setShortField(term9259, term9259.getClass(), "day", (short) 24);
        setField(term9258, term9258.getClass(), "date", term9259);
        setByteField(term9263, term9263.getClass(), "hour", (byte) 21);
        setByteField(term9263, term9263.getClass(), "minute", (byte) 10);
        setByteField(term9263, term9263.getClass(), "second", (byte) 20);
        setIntField(term9263, term9263.getClass(), "nano", 736076804);
        setField(term9258, term9258.getClass(), "time", term9263);
        setField(term9160, term9160.getClass(), "dataCadastro", term9258);
        setIntField(term9269, term9269.getClass(), "year", 2013);
        setShortField(term9269, term9269.getClass(), "month", (short) 7);
        setShortField(term9269, term9269.getClass(), "day", (short) 2);
        setField(term9268, term9268.getClass(), "date", term9269);
        setByteField(term9273, term9273.getClass(), "hour", (byte) 12);
        setByteField(term9273, term9273.getClass(), "minute", (byte) 16);
        setByteField(term9273, term9273.getClass(), "second", (byte) 13);
        setIntField(term9273, term9273.getClass(), "nano", 479538808);
        setField(term9268, term9268.getClass(), "time", term9273);
        setField(term9160, term9160.getClass(), "dataAlteracao", term9268);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Artista");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataAlteracao", argTypes, term9160, args);
    }

};


