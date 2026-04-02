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

public class Musica_hashCode_67476775514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6958;

    public Musica_hashCode_67476775514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6959 = new Long(-6100012593724108983L);
        Integer term6973 = new Integer(1324040357);
        Long term6976 = new Long(5465527210299101732L);
        term6958 = newInstance(Class.forName("br.org.serratec.mm.model.Musica"));
        Object term6975 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term7026 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7027 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7031 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7036 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7037 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7041 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7046 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7047 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7051 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7056 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7057 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7061 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6958, term6958.getClass(), "id", term6959);
        setField(term6958, term6958.getClass(), "titulo", "bxyfeicqrK");
        setField(term6958, term6958.getClass(), "minutos", term6973);
        setField(term6975, term6975.getClass(), "id", term6976);
        setField(term6975, term6975.getClass(), "email", "vBnWPlsZMk");
        setField(term6975, term6975.getClass(), "nome", "fIZsWucfXz");
        setField(term6975, term6975.getClass(), "senha", "IApvtmfhnq");
        setField(term6975, term6975.getClass(), "perfilUsuario", "VSaNnhMpRc");
        setIntField(term7027, term7027.getClass(), "year", 2018);
        setShortField(term7027, term7027.getClass(), "month", (short) 1);
        setShortField(term7027, term7027.getClass(), "day", (short) 7);
        setField(term7026, term7026.getClass(), "date", term7027);
        setByteField(term7031, term7031.getClass(), "hour", (byte) 5);
        setByteField(term7031, term7031.getClass(), "minute", (byte) 42);
        setByteField(term7031, term7031.getClass(), "second", (byte) 49);
        setIntField(term7031, term7031.getClass(), "nano", 291814792);
        setField(term7026, term7026.getClass(), "time", term7031);
        setField(term6975, term6975.getClass(), "dataCadastro", term7026);
        setIntField(term7037, term7037.getClass(), "year", 2022);
        setShortField(term7037, term7037.getClass(), "month", (short) 7);
        setShortField(term7037, term7037.getClass(), "day", (short) 9);
        setField(term7036, term7036.getClass(), "date", term7037);
        setByteField(term7041, term7041.getClass(), "hour", (byte) 21);
        setByteField(term7041, term7041.getClass(), "minute", (byte) 48);
        setByteField(term7041, term7041.getClass(), "second", (byte) 58);
        setIntField(term7041, term7041.getClass(), "nano", 579553780);
        setField(term7036, term7036.getClass(), "time", term7041);
        setField(term6975, term6975.getClass(), "dataAlteracao", term7036);
        setField(term6958, term6958.getClass(), "usuario", term6975);
        setIntField(term7047, term7047.getClass(), "year", 2017);
        setShortField(term7047, term7047.getClass(), "month", (short) 5);
        setShortField(term7047, term7047.getClass(), "day", (short) 2);
        setField(term7046, term7046.getClass(), "date", term7047);
        setByteField(term7051, term7051.getClass(), "hour", (byte) 7);
        setByteField(term7051, term7051.getClass(), "minute", (byte) 24);
        setByteField(term7051, term7051.getClass(), "second", (byte) 51);
        setIntField(term7051, term7051.getClass(), "nano", 706502334);
        setField(term7046, term7046.getClass(), "time", term7051);
        setField(term6958, term6958.getClass(), "dataCadastro", term7046);
        setIntField(term7057, term7057.getClass(), "year", 2026);
        setShortField(term7057, term7057.getClass(), "month", (short) 11);
        setShortField(term7057, term7057.getClass(), "day", (short) 1);
        setField(term7056, term7056.getClass(), "date", term7057);
        setByteField(term7061, term7061.getClass(), "hour", (byte) 9);
        setByteField(term7061, term7061.getClass(), "minute", (byte) 4);
        setByteField(term7061, term7061.getClass(), "second", (byte) 25);
        setIntField(term7061, term7061.getClass(), "nano", 272299951);
        setField(term7056, term7056.getClass(), "time", term7061);
        setField(term6958, term6958.getClass(), "dataAlteracao", term7056);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Musica");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term6958, args);
    }

};


