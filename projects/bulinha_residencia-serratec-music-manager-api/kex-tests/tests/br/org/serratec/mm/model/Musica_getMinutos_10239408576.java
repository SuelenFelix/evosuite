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

public class Musica_getMinutos_10239408576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5561;

    public Musica_getMinutos_10239408576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5562 = new Long(4100236067313034103L);
        Integer term5576 = new Integer(458147407);
        Long term5579 = new Long(1195529027276497124L);
        term5561 = newInstance(Class.forName("br.org.serratec.mm.model.Musica"));
        Object term5578 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term5629 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5630 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5634 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5639 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5640 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5644 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5649 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5650 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5654 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5659 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5660 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5664 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5561, term5561.getClass(), "id", term5562);
        setField(term5561, term5561.getClass(), "titulo", "EusenEbIoF");
        setField(term5561, term5561.getClass(), "minutos", term5576);
        setField(term5578, term5578.getClass(), "id", term5579);
        setField(term5578, term5578.getClass(), "email", "SScVQYSvWH");
        setField(term5578, term5578.getClass(), "nome", "MnovcqFhCl");
        setField(term5578, term5578.getClass(), "senha", "qYtAeLzOhW");
        setField(term5578, term5578.getClass(), "perfilUsuario", "tJzmOfcUnY");
        setIntField(term5630, term5630.getClass(), "year", 2016);
        setShortField(term5630, term5630.getClass(), "month", (short) 10);
        setShortField(term5630, term5630.getClass(), "day", (short) 12);
        setField(term5629, term5629.getClass(), "date", term5630);
        setByteField(term5634, term5634.getClass(), "hour", (byte) 11);
        setByteField(term5634, term5634.getClass(), "minute", (byte) 25);
        setByteField(term5634, term5634.getClass(), "second", (byte) 37);
        setIntField(term5634, term5634.getClass(), "nano", 215113477);
        setField(term5629, term5629.getClass(), "time", term5634);
        setField(term5578, term5578.getClass(), "dataCadastro", term5629);
        setIntField(term5640, term5640.getClass(), "year", 2012);
        setShortField(term5640, term5640.getClass(), "month", (short) 12);
        setShortField(term5640, term5640.getClass(), "day", (short) 10);
        setField(term5639, term5639.getClass(), "date", term5640);
        setByteField(term5644, term5644.getClass(), "hour", (byte) 6);
        setByteField(term5644, term5644.getClass(), "minute", (byte) 26);
        setByteField(term5644, term5644.getClass(), "second", (byte) 38);
        setIntField(term5644, term5644.getClass(), "nano", 934336730);
        setField(term5639, term5639.getClass(), "time", term5644);
        setField(term5578, term5578.getClass(), "dataAlteracao", term5639);
        setField(term5561, term5561.getClass(), "usuario", term5578);
        setIntField(term5650, term5650.getClass(), "year", 2021);
        setShortField(term5650, term5650.getClass(), "month", (short) 2);
        setShortField(term5650, term5650.getClass(), "day", (short) 21);
        setField(term5649, term5649.getClass(), "date", term5650);
        setByteField(term5654, term5654.getClass(), "hour", (byte) 4);
        setByteField(term5654, term5654.getClass(), "minute", (byte) 22);
        setByteField(term5654, term5654.getClass(), "second", (byte) 2);
        setIntField(term5654, term5654.getClass(), "nano", 752727543);
        setField(term5649, term5649.getClass(), "time", term5654);
        setField(term5561, term5561.getClass(), "dataCadastro", term5649);
        setIntField(term5660, term5660.getClass(), "year", 2017);
        setShortField(term5660, term5660.getClass(), "month", (short) 8);
        setShortField(term5660, term5660.getClass(), "day", (short) 30);
        setField(term5659, term5659.getClass(), "date", term5660);
        setByteField(term5664, term5664.getClass(), "hour", (byte) 3);
        setByteField(term5664, term5664.getClass(), "minute", (byte) 48);
        setByteField(term5664, term5664.getClass(), "second", (byte) 37);
        setIntField(term5664, term5664.getClass(), "nano", 121640121);
        setField(term5659, term5659.getClass(), "time", term5664);
        setField(term5561, term5561.getClass(), "dataAlteracao", term5659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Musica");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinutos", argTypes, term5561, args);
    }

};


