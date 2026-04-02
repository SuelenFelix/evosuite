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

public class Artista_setDataCadastro_17999139865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8784;
     Object term8901;

    public Artista_setDataCadastro_17999139865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8785 = new Long(-8327432141027603933L);
        Class<? extends Object> term8922 = Class.forName((String) "br.org.serratec.mm.enums.TipoArtista");
        Field term8921 = ((Class) term8922).getDeclaredField((String) "SOLO");
        ((Field) term8921).setAccessible(true);
        Object enum4 = ((Field) term8921).get((Object) null);
        Long term8811 = new Long(-433040798405298080L);
        term8784 = newInstance(Class.forName("br.org.serratec.mm.model.Artista"));
        Object term8810 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term8861 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8862 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8866 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8871 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8872 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8876 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8881 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8882 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8886 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8891 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8892 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8896 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term8784, term8784.getClass(), "id", term8785);
        setField(term8784, term8784.getClass(), "nome", "FiYYLuailz");
        setField(term8784, term8784.getClass(), "tipo", enum4);
        setField(term8810, term8810.getClass(), "id", term8811);
        setField(term8810, term8810.getClass(), "email", "XebAeSnCKZ");
        setField(term8810, term8810.getClass(), "nome", "GeddnXjHGy");
        setField(term8810, term8810.getClass(), "senha", "vLTbaoAxBm");
        setField(term8810, term8810.getClass(), "perfilUsuario", "BXTjEyEZxD");
        setIntField(term8862, term8862.getClass(), "year", 2026);
        setShortField(term8862, term8862.getClass(), "month", (short) 2);
        setShortField(term8862, term8862.getClass(), "day", (short) 26);
        setField(term8861, term8861.getClass(), "date", term8862);
        setByteField(term8866, term8866.getClass(), "hour", (byte) 12);
        setByteField(term8866, term8866.getClass(), "minute", (byte) 23);
        setByteField(term8866, term8866.getClass(), "second", (byte) 14);
        setIntField(term8866, term8866.getClass(), "nano", 86303611);
        setField(term8861, term8861.getClass(), "time", term8866);
        setField(term8810, term8810.getClass(), "dataCadastro", term8861);
        setIntField(term8872, term8872.getClass(), "year", 2014);
        setShortField(term8872, term8872.getClass(), "month", (short) 6);
        setShortField(term8872, term8872.getClass(), "day", (short) 12);
        setField(term8871, term8871.getClass(), "date", term8872);
        setByteField(term8876, term8876.getClass(), "hour", (byte) 5);
        setByteField(term8876, term8876.getClass(), "minute", (byte) 4);
        setByteField(term8876, term8876.getClass(), "second", (byte) 20);
        setIntField(term8876, term8876.getClass(), "nano", 169602296);
        setField(term8871, term8871.getClass(), "time", term8876);
        setField(term8810, term8810.getClass(), "dataAlteracao", term8871);
        setField(term8784, term8784.getClass(), "usuario", term8810);
        setIntField(term8882, term8882.getClass(), "year", 2021);
        setShortField(term8882, term8882.getClass(), "month", (short) 5);
        setShortField(term8882, term8882.getClass(), "day", (short) 13);
        setField(term8881, term8881.getClass(), "date", term8882);
        setByteField(term8886, term8886.getClass(), "hour", (byte) 15);
        setByteField(term8886, term8886.getClass(), "minute", (byte) 40);
        setByteField(term8886, term8886.getClass(), "second", (byte) 27);
        setIntField(term8886, term8886.getClass(), "nano", 319035378);
        setField(term8881, term8881.getClass(), "time", term8886);
        setField(term8784, term8784.getClass(), "dataCadastro", term8881);
        setIntField(term8892, term8892.getClass(), "year", 2012);
        setShortField(term8892, term8892.getClass(), "month", (short) 5);
        setShortField(term8892, term8892.getClass(), "day", (short) 21);
        setField(term8891, term8891.getClass(), "date", term8892);
        setByteField(term8896, term8896.getClass(), "hour", (byte) 19);
        setByteField(term8896, term8896.getClass(), "minute", (byte) 56);
        setByteField(term8896, term8896.getClass(), "second", (byte) 3);
        setIntField(term8896, term8896.getClass(), "nano", 266247153);
        setField(term8891, term8891.getClass(), "time", term8896);
        setField(term8784, term8784.getClass(), "dataAlteracao", term8891);
        term8901 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8902 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8906 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term8902, term8902.getClass(), "year", 2029);
        setShortField(term8902, term8902.getClass(), "month", (short) 2);
        setShortField(term8902, term8902.getClass(), "day", (short) 4);
        setField(term8901, term8901.getClass(), "date", term8902);
        setByteField(term8906, term8906.getClass(), "hour", (byte) 18);
        setByteField(term8906, term8906.getClass(), "minute", (byte) 31);
        setByteField(term8906, term8906.getClass(), "second", (byte) 27);
        setIntField(term8906, term8906.getClass(), "nano", 737016275);
        setField(term8901, term8901.getClass(), "time", term8906);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Artista");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term8901;
        callMethod(klass, "setDataCadastro", argTypes, term8784, args);
    }

};


