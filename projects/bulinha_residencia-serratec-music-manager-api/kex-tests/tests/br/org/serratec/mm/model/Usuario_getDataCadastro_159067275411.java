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
import java.lang.Object;

public class Usuario_getDataCadastro_159067275411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1201;

    public Usuario_getDataCadastro_159067275411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1202 = new Long(-8885298608300233488L);
        term1201 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term1252 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1253 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1257 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1262 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1263 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1267 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1201, term1201.getClass(), "id", term1202);
        setField(term1201, term1201.getClass(), "email", "BndsHwAFMv");
        setField(term1201, term1201.getClass(), "nome", "GzFkzHGYFt");
        setField(term1201, term1201.getClass(), "senha", "tShwQLRGNe");
        setField(term1201, term1201.getClass(), "perfilUsuario", "LvtrsXUliU");
        setIntField(term1253, term1253.getClass(), "year", 2014);
        setShortField(term1253, term1253.getClass(), "month", (short) 7);
        setShortField(term1253, term1253.getClass(), "day", (short) 13);
        setField(term1252, term1252.getClass(), "date", term1253);
        setByteField(term1257, term1257.getClass(), "hour", (byte) 21);
        setByteField(term1257, term1257.getClass(), "minute", (byte) 46);
        setByteField(term1257, term1257.getClass(), "second", (byte) 0);
        setIntField(term1257, term1257.getClass(), "nano", 887884128);
        setField(term1252, term1252.getClass(), "time", term1257);
        setField(term1201, term1201.getClass(), "dataCadastro", term1252);
        setIntField(term1263, term1263.getClass(), "year", 2023);
        setShortField(term1263, term1263.getClass(), "month", (short) 3);
        setShortField(term1263, term1263.getClass(), "day", (short) 7);
        setField(term1262, term1262.getClass(), "date", term1263);
        setByteField(term1267, term1267.getClass(), "hour", (byte) 21);
        setByteField(term1267, term1267.getClass(), "minute", (byte) 15);
        setByteField(term1267, term1267.getClass(), "second", (byte) 43);
        setIntField(term1267, term1267.getClass(), "nano", 639721472);
        setField(term1262, term1262.getClass(), "time", term1267);
        setField(term1201, term1201.getClass(), "dataAlteracao", term1262);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Usuario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataCadastro", argTypes, term1201, args);
    }

};


