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

public class Musica_setDataAlteracao_46118177713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6790;
     Object term6898;

    public Musica_setDataAlteracao_46118177713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6791 = new Long(-5447369594017685765L);
        Integer term6805 = new Integer(1225272962);
        Long term6808 = new Long(-5724112525188606013L);
        term6790 = newInstance(Class.forName("br.org.serratec.mm.model.Musica"));
        Object term6807 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term6858 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6859 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6863 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6868 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6869 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6873 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6878 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6879 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6883 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6888 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6889 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6893 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6790, term6790.getClass(), "id", term6791);
        setField(term6790, term6790.getClass(), "titulo", "jqrVEUvYEz");
        setField(term6790, term6790.getClass(), "minutos", term6805);
        setField(term6807, term6807.getClass(), "id", term6808);
        setField(term6807, term6807.getClass(), "email", "QITgiBrmfj");
        setField(term6807, term6807.getClass(), "nome", "pXxkiXgQnq");
        setField(term6807, term6807.getClass(), "senha", "tKmrUDURku");
        setField(term6807, term6807.getClass(), "perfilUsuario", "JeZbrwZmsP");
        setIntField(term6859, term6859.getClass(), "year", 2013);
        setShortField(term6859, term6859.getClass(), "month", (short) 3);
        setShortField(term6859, term6859.getClass(), "day", (short) 25);
        setField(term6858, term6858.getClass(), "date", term6859);
        setByteField(term6863, term6863.getClass(), "hour", (byte) 16);
        setByteField(term6863, term6863.getClass(), "minute", (byte) 28);
        setByteField(term6863, term6863.getClass(), "second", (byte) 0);
        setIntField(term6863, term6863.getClass(), "nano", 265797826);
        setField(term6858, term6858.getClass(), "time", term6863);
        setField(term6807, term6807.getClass(), "dataCadastro", term6858);
        setIntField(term6869, term6869.getClass(), "year", 2013);
        setShortField(term6869, term6869.getClass(), "month", (short) 9);
        setShortField(term6869, term6869.getClass(), "day", (short) 12);
        setField(term6868, term6868.getClass(), "date", term6869);
        setByteField(term6873, term6873.getClass(), "hour", (byte) 14);
        setByteField(term6873, term6873.getClass(), "minute", (byte) 21);
        setByteField(term6873, term6873.getClass(), "second", (byte) 35);
        setIntField(term6873, term6873.getClass(), "nano", 520302725);
        setField(term6868, term6868.getClass(), "time", term6873);
        setField(term6807, term6807.getClass(), "dataAlteracao", term6868);
        setField(term6790, term6790.getClass(), "usuario", term6807);
        setIntField(term6879, term6879.getClass(), "year", 2016);
        setShortField(term6879, term6879.getClass(), "month", (short) 2);
        setShortField(term6879, term6879.getClass(), "day", (short) 15);
        setField(term6878, term6878.getClass(), "date", term6879);
        setByteField(term6883, term6883.getClass(), "hour", (byte) 7);
        setByteField(term6883, term6883.getClass(), "minute", (byte) 36);
        setByteField(term6883, term6883.getClass(), "second", (byte) 21);
        setIntField(term6883, term6883.getClass(), "nano", 74269011);
        setField(term6878, term6878.getClass(), "time", term6883);
        setField(term6790, term6790.getClass(), "dataCadastro", term6878);
        setIntField(term6889, term6889.getClass(), "year", 2012);
        setShortField(term6889, term6889.getClass(), "month", (short) 11);
        setShortField(term6889, term6889.getClass(), "day", (short) 23);
        setField(term6888, term6888.getClass(), "date", term6889);
        setByteField(term6893, term6893.getClass(), "hour", (byte) 21);
        setByteField(term6893, term6893.getClass(), "minute", (byte) 45);
        setByteField(term6893, term6893.getClass(), "second", (byte) 46);
        setIntField(term6893, term6893.getClass(), "nano", 484678696);
        setField(term6888, term6888.getClass(), "time", term6893);
        setField(term6790, term6790.getClass(), "dataAlteracao", term6888);
        term6898 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6899 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6903 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term6899, term6899.getClass(), "year", 2027);
        setShortField(term6899, term6899.getClass(), "month", (short) 12);
        setShortField(term6899, term6899.getClass(), "day", (short) 25);
        setField(term6898, term6898.getClass(), "date", term6899);
        setByteField(term6903, term6903.getClass(), "hour", (byte) 8);
        setByteField(term6903, term6903.getClass(), "minute", (byte) 19);
        setByteField(term6903, term6903.getClass(), "second", (byte) 20);
        setIntField(term6903, term6903.getClass(), "nano", 127700185);
        setField(term6898, term6898.getClass(), "time", term6903);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Musica");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term6898;
        callMethod(klass, "setDataAlteracao", argTypes, term6790, args);
    }

};


