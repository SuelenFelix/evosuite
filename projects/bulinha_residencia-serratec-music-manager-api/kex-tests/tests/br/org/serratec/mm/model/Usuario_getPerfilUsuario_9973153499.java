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

public class Usuario_getPerfilUsuario_9973153499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term957;

    public Usuario_getPerfilUsuario_9973153499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term958 = new Long(6967924379644551255L);
        term957 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term1008 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1009 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1013 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1018 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1019 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1023 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term957, term957.getClass(), "id", term958);
        setField(term957, term957.getClass(), "email", "Ghbwtircqb");
        setField(term957, term957.getClass(), "nome", "xrwlQZdwCp");
        setField(term957, term957.getClass(), "senha", "IDCWpPLRkE");
        setField(term957, term957.getClass(), "perfilUsuario", "nyiiPDVjAc");
        setIntField(term1009, term1009.getClass(), "year", 2015);
        setShortField(term1009, term1009.getClass(), "month", (short) 9);
        setShortField(term1009, term1009.getClass(), "day", (short) 16);
        setField(term1008, term1008.getClass(), "date", term1009);
        setByteField(term1013, term1013.getClass(), "hour", (byte) 6);
        setByteField(term1013, term1013.getClass(), "minute", (byte) 19);
        setByteField(term1013, term1013.getClass(), "second", (byte) 42);
        setIntField(term1013, term1013.getClass(), "nano", 630084975);
        setField(term1008, term1008.getClass(), "time", term1013);
        setField(term957, term957.getClass(), "dataCadastro", term1008);
        setIntField(term1019, term1019.getClass(), "year", 2029);
        setShortField(term1019, term1019.getClass(), "month", (short) 6);
        setShortField(term1019, term1019.getClass(), "day", (short) 23);
        setField(term1018, term1018.getClass(), "date", term1019);
        setByteField(term1023, term1023.getClass(), "hour", (byte) 21);
        setByteField(term1023, term1023.getClass(), "minute", (byte) 55);
        setByteField(term1023, term1023.getClass(), "second", (byte) 27);
        setIntField(term1023, term1023.getClass(), "nano", 66889274);
        setField(term1018, term1018.getClass(), "time", term1023);
        setField(term957, term957.getClass(), "dataAlteracao", term1018);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Usuario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPerfilUsuario", argTypes, term957, args);
    }

};


