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

public class Artista_getTipo_80476179012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11402;

    public Artista_getTipo_80476179012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11403 = new Long(3381333711768010594L);
        Class<? extends Object> term11530 = Class.forName((String) "br.org.serratec.mm.enums.TipoArtista");
        Field term11529 = ((Class) term11530).getDeclaredField((String) "SOLO");
        ((Field) term11529).setAccessible(true);
        Object enum11 = ((Field) term11529).get((Object) null);
        Long term11429 = new Long(3580984732036213717L);
        term11402 = newInstance(Class.forName("br.org.serratec.mm.model.Artista"));
        Object term11428 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term11479 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11480 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11484 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11489 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11490 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11494 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11499 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11500 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11504 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11509 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11510 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11514 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11402, term11402.getClass(), "id", term11403);
        setField(term11402, term11402.getClass(), "nome", "DGRqjjdhzy");
        setField(term11402, term11402.getClass(), "tipo", enum11);
        setField(term11428, term11428.getClass(), "id", term11429);
        setField(term11428, term11428.getClass(), "email", "lQFkjJUPAR");
        setField(term11428, term11428.getClass(), "nome", "BsuVlGUUjV");
        setField(term11428, term11428.getClass(), "senha", "bHHjfDCntT");
        setField(term11428, term11428.getClass(), "perfilUsuario", "sEphiduvkv");
        setIntField(term11480, term11480.getClass(), "year", 2026);
        setShortField(term11480, term11480.getClass(), "month", (short) 9);
        setShortField(term11480, term11480.getClass(), "day", (short) 22);
        setField(term11479, term11479.getClass(), "date", term11480);
        setByteField(term11484, term11484.getClass(), "hour", (byte) 22);
        setByteField(term11484, term11484.getClass(), "minute", (byte) 25);
        setByteField(term11484, term11484.getClass(), "second", (byte) 25);
        setIntField(term11484, term11484.getClass(), "nano", 526433618);
        setField(term11479, term11479.getClass(), "time", term11484);
        setField(term11428, term11428.getClass(), "dataCadastro", term11479);
        setIntField(term11490, term11490.getClass(), "year", 2017);
        setShortField(term11490, term11490.getClass(), "month", (short) 8);
        setShortField(term11490, term11490.getClass(), "day", (short) 11);
        setField(term11489, term11489.getClass(), "date", term11490);
        setByteField(term11494, term11494.getClass(), "hour", (byte) 0);
        setByteField(term11494, term11494.getClass(), "minute", (byte) 12);
        setByteField(term11494, term11494.getClass(), "second", (byte) 8);
        setIntField(term11494, term11494.getClass(), "nano", 421599135);
        setField(term11489, term11489.getClass(), "time", term11494);
        setField(term11428, term11428.getClass(), "dataAlteracao", term11489);
        setField(term11402, term11402.getClass(), "usuario", term11428);
        setIntField(term11500, term11500.getClass(), "year", 2026);
        setShortField(term11500, term11500.getClass(), "month", (short) 12);
        setShortField(term11500, term11500.getClass(), "day", (short) 22);
        setField(term11499, term11499.getClass(), "date", term11500);
        setByteField(term11504, term11504.getClass(), "hour", (byte) 19);
        setByteField(term11504, term11504.getClass(), "minute", (byte) 39);
        setByteField(term11504, term11504.getClass(), "second", (byte) 23);
        setIntField(term11504, term11504.getClass(), "nano", 342247024);
        setField(term11499, term11499.getClass(), "time", term11504);
        setField(term11402, term11402.getClass(), "dataCadastro", term11499);
        setIntField(term11510, term11510.getClass(), "year", 2020);
        setShortField(term11510, term11510.getClass(), "month", (short) 5);
        setShortField(term11510, term11510.getClass(), "day", (short) 8);
        setField(term11509, term11509.getClass(), "date", term11510);
        setByteField(term11514, term11514.getClass(), "hour", (byte) 8);
        setByteField(term11514, term11514.getClass(), "minute", (byte) 25);
        setByteField(term11514, term11514.getClass(), "second", (byte) 28);
        setIntField(term11514, term11514.getClass(), "nano", 159788425);
        setField(term11509, term11509.getClass(), "time", term11514);
        setField(term11402, term11402.getClass(), "dataAlteracao", term11509);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Artista");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTipo", argTypes, term11402, args);
    }

};


