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

public class Artista_setId_6215320699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10276;
     Object term10393;

    public Artista_setId_6215320699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10277 = new Long(8863790908271299748L);
        Class<? extends Object> term10406 = Class.forName((String) "br.org.serratec.mm.enums.TipoArtista");
        Field term10405 = ((Class) term10406).getDeclaredField((String) "SOLO");
        ((Field) term10405).setAccessible(true);
        Object enum8 = ((Field) term10405).get((Object) null);
        Long term10303 = new Long(9205327385733285058L);
        term10276 = newInstance(Class.forName("br.org.serratec.mm.model.Artista"));
        Object term10302 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term10353 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10354 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10358 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10363 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10364 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10368 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10373 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10374 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10378 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10383 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10384 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10388 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term10276, term10276.getClass(), "id", term10277);
        setField(term10276, term10276.getClass(), "nome", "rsumfoDNHa");
        setField(term10276, term10276.getClass(), "tipo", enum8);
        setField(term10302, term10302.getClass(), "id", term10303);
        setField(term10302, term10302.getClass(), "email", "ceCWHUTQUM");
        setField(term10302, term10302.getClass(), "nome", "LrqwfrKKtS");
        setField(term10302, term10302.getClass(), "senha", "ZUdnQXfzCI");
        setField(term10302, term10302.getClass(), "perfilUsuario", "EULDrUNQvw");
        setIntField(term10354, term10354.getClass(), "year", 2015);
        setShortField(term10354, term10354.getClass(), "month", (short) 1);
        setShortField(term10354, term10354.getClass(), "day", (short) 23);
        setField(term10353, term10353.getClass(), "date", term10354);
        setByteField(term10358, term10358.getClass(), "hour", (byte) 0);
        setByteField(term10358, term10358.getClass(), "minute", (byte) 5);
        setByteField(term10358, term10358.getClass(), "second", (byte) 21);
        setIntField(term10358, term10358.getClass(), "nano", 402778195);
        setField(term10353, term10353.getClass(), "time", term10358);
        setField(term10302, term10302.getClass(), "dataCadastro", term10353);
        setIntField(term10364, term10364.getClass(), "year", 2022);
        setShortField(term10364, term10364.getClass(), "month", (short) 4);
        setShortField(term10364, term10364.getClass(), "day", (short) 2);
        setField(term10363, term10363.getClass(), "date", term10364);
        setByteField(term10368, term10368.getClass(), "hour", (byte) 21);
        setByteField(term10368, term10368.getClass(), "minute", (byte) 1);
        setByteField(term10368, term10368.getClass(), "second", (byte) 56);
        setIntField(term10368, term10368.getClass(), "nano", 418299217);
        setField(term10363, term10363.getClass(), "time", term10368);
        setField(term10302, term10302.getClass(), "dataAlteracao", term10363);
        setField(term10276, term10276.getClass(), "usuario", term10302);
        setIntField(term10374, term10374.getClass(), "year", 2025);
        setShortField(term10374, term10374.getClass(), "month", (short) 9);
        setShortField(term10374, term10374.getClass(), "day", (short) 5);
        setField(term10373, term10373.getClass(), "date", term10374);
        setByteField(term10378, term10378.getClass(), "hour", (byte) 11);
        setByteField(term10378, term10378.getClass(), "minute", (byte) 59);
        setByteField(term10378, term10378.getClass(), "second", (byte) 37);
        setIntField(term10378, term10378.getClass(), "nano", 93740487);
        setField(term10373, term10373.getClass(), "time", term10378);
        setField(term10276, term10276.getClass(), "dataCadastro", term10373);
        setIntField(term10384, term10384.getClass(), "year", 2028);
        setShortField(term10384, term10384.getClass(), "month", (short) 12);
        setShortField(term10384, term10384.getClass(), "day", (short) 28);
        setField(term10383, term10383.getClass(), "date", term10384);
        setByteField(term10388, term10388.getClass(), "hour", (byte) 11);
        setByteField(term10388, term10388.getClass(), "minute", (byte) 37);
        setByteField(term10388, term10388.getClass(), "second", (byte) 0);
        setIntField(term10388, term10388.getClass(), "nano", 315383282);
        setField(term10383, term10383.getClass(), "time", term10388);
        setField(term10276, term10276.getClass(), "dataAlteracao", term10383);
        term10393 = new Long(4199886998224701110L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Artista");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term10393;
        callMethod(klass, "setId", argTypes, term10276, args);
    }

};


