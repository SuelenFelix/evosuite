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

public class Musica_getDataAlteracao_147280653512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6632;

    public Musica_getDataAlteracao_147280653512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6633 = new Long(-3730936709704460408L);
        Integer term6647 = new Integer(-2095575670);
        Long term6650 = new Long(-8614778293741404325L);
        term6632 = newInstance(Class.forName("br.org.serratec.mm.model.Musica"));
        Object term6649 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term6700 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6701 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6705 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6710 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6711 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6715 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6720 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6721 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6725 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6730 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6731 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6735 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6632, term6632.getClass(), "id", term6633);
        setField(term6632, term6632.getClass(), "titulo", "gPzGDOEPPw");
        setField(term6632, term6632.getClass(), "minutos", term6647);
        setField(term6649, term6649.getClass(), "id", term6650);
        setField(term6649, term6649.getClass(), "email", "rwKoAngzCu");
        setField(term6649, term6649.getClass(), "nome", "VUkRVwROTl");
        setField(term6649, term6649.getClass(), "senha", "UDlkdccCRn");
        setField(term6649, term6649.getClass(), "perfilUsuario", "McpzErOcYb");
        setIntField(term6701, term6701.getClass(), "year", 2022);
        setShortField(term6701, term6701.getClass(), "month", (short) 10);
        setShortField(term6701, term6701.getClass(), "day", (short) 14);
        setField(term6700, term6700.getClass(), "date", term6701);
        setByteField(term6705, term6705.getClass(), "hour", (byte) 7);
        setByteField(term6705, term6705.getClass(), "minute", (byte) 29);
        setByteField(term6705, term6705.getClass(), "second", (byte) 42);
        setIntField(term6705, term6705.getClass(), "nano", 962865996);
        setField(term6700, term6700.getClass(), "time", term6705);
        setField(term6649, term6649.getClass(), "dataCadastro", term6700);
        setIntField(term6711, term6711.getClass(), "year", 2026);
        setShortField(term6711, term6711.getClass(), "month", (short) 7);
        setShortField(term6711, term6711.getClass(), "day", (short) 18);
        setField(term6710, term6710.getClass(), "date", term6711);
        setByteField(term6715, term6715.getClass(), "hour", (byte) 14);
        setByteField(term6715, term6715.getClass(), "minute", (byte) 29);
        setByteField(term6715, term6715.getClass(), "second", (byte) 53);
        setIntField(term6715, term6715.getClass(), "nano", 285756900);
        setField(term6710, term6710.getClass(), "time", term6715);
        setField(term6649, term6649.getClass(), "dataAlteracao", term6710);
        setField(term6632, term6632.getClass(), "usuario", term6649);
        setIntField(term6721, term6721.getClass(), "year", 2012);
        setShortField(term6721, term6721.getClass(), "month", (short) 2);
        setShortField(term6721, term6721.getClass(), "day", (short) 2);
        setField(term6720, term6720.getClass(), "date", term6721);
        setByteField(term6725, term6725.getClass(), "hour", (byte) 4);
        setByteField(term6725, term6725.getClass(), "minute", (byte) 19);
        setByteField(term6725, term6725.getClass(), "second", (byte) 58);
        setIntField(term6725, term6725.getClass(), "nano", 550709112);
        setField(term6720, term6720.getClass(), "time", term6725);
        setField(term6632, term6632.getClass(), "dataCadastro", term6720);
        setIntField(term6731, term6731.getClass(), "year", 2028);
        setShortField(term6731, term6731.getClass(), "month", (short) 7);
        setShortField(term6731, term6731.getClass(), "day", (short) 4);
        setField(term6730, term6730.getClass(), "date", term6731);
        setByteField(term6735, term6735.getClass(), "hour", (byte) 13);
        setByteField(term6735, term6735.getClass(), "minute", (byte) 43);
        setByteField(term6735, term6735.getClass(), "second", (byte) 17);
        setIntField(term6735, term6735.getClass(), "nano", 949713407);
        setField(term6730, term6730.getClass(), "time", term6735);
        setField(term6632, term6632.getClass(), "dataAlteracao", term6730);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Musica");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataAlteracao", argTypes, term6632, args);
    }

};


