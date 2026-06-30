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
import java.lang.Integer;
import java.lang.Object;

public class Musica_getUsuario_5744485158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5879;

    public Musica_getUsuario_5744485158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5880 = new Long(-7291742736502427077L);
        Integer term5894 = new Integer(1328271830);
        Long term5897 = new Long(-8121849829073967555L);
        term5879 = newInstance(Class.forName("br.org.serratec.mm.model.Musica"));
        Object term5896 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term5947 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5948 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5952 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5957 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5958 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5962 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5967 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5968 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5972 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5977 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5978 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5982 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5879, term5879.getClass(), "id", term5880);
        setField(term5879, term5879.getClass(), "titulo", "dwlZSxlXOo");
        setField(term5879, term5879.getClass(), "minutos", term5894);
        setField(term5896, term5896.getClass(), "id", term5897);
        setField(term5896, term5896.getClass(), "email", "lKrEAkypza");
        setField(term5896, term5896.getClass(), "nome", "KtuuNAqGCQ");
        setField(term5896, term5896.getClass(), "senha", "OGQsfjmReM");
        setField(term5896, term5896.getClass(), "perfilUsuario", "YsUtbngnRO");
        setIntField(term5948, term5948.getClass(), "year", 2028);
        setShortField(term5948, term5948.getClass(), "month", (short) 6);
        setShortField(term5948, term5948.getClass(), "day", (short) 21);
        setField(term5947, term5947.getClass(), "date", term5948);
        setByteField(term5952, term5952.getClass(), "hour", (byte) 2);
        setByteField(term5952, term5952.getClass(), "minute", (byte) 38);
        setByteField(term5952, term5952.getClass(), "second", (byte) 11);
        setIntField(term5952, term5952.getClass(), "nano", 40256095);
        setField(term5947, term5947.getClass(), "time", term5952);
        setField(term5896, term5896.getClass(), "dataCadastro", term5947);
        setIntField(term5958, term5958.getClass(), "year", 2017);
        setShortField(term5958, term5958.getClass(), "month", (short) 5);
        setShortField(term5958, term5958.getClass(), "day", (short) 17);
        setField(term5957, term5957.getClass(), "date", term5958);
        setByteField(term5962, term5962.getClass(), "hour", (byte) 22);
        setByteField(term5962, term5962.getClass(), "minute", (byte) 56);
        setByteField(term5962, term5962.getClass(), "second", (byte) 28);
        setIntField(term5962, term5962.getClass(), "nano", 581659115);
        setField(term5957, term5957.getClass(), "time", term5962);
        setField(term5896, term5896.getClass(), "dataAlteracao", term5957);
        setField(term5879, term5879.getClass(), "usuario", term5896);
        setIntField(term5968, term5968.getClass(), "year", 2015);
        setShortField(term5968, term5968.getClass(), "month", (short) 4);
        setShortField(term5968, term5968.getClass(), "day", (short) 14);
        setField(term5967, term5967.getClass(), "date", term5968);
        setByteField(term5972, term5972.getClass(), "hour", (byte) 23);
        setByteField(term5972, term5972.getClass(), "minute", (byte) 8);
        setByteField(term5972, term5972.getClass(), "second", (byte) 53);
        setIntField(term5972, term5972.getClass(), "nano", 375234559);
        setField(term5967, term5967.getClass(), "time", term5972);
        setField(term5879, term5879.getClass(), "dataCadastro", term5967);
        setIntField(term5978, term5978.getClass(), "year", 2018);
        setShortField(term5978, term5978.getClass(), "month", (short) 1);
        setShortField(term5978, term5978.getClass(), "day", (short) 29);
        setField(term5977, term5977.getClass(), "date", term5978);
        setByteField(term5982, term5982.getClass(), "hour", (byte) 17);
        setByteField(term5982, term5982.getClass(), "minute", (byte) 5);
        setByteField(term5982, term5982.getClass(), "second", (byte) 53);
        setIntField(term5982, term5982.getClass(), "nano", 36624440);
        setField(term5977, term5977.getClass(), "time", term5982);
        setField(term5879, term5879.getClass(), "dataAlteracao", term5977);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Musica");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsuario", argTypes, term5879, args);
    }

};


