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

public class Usuario_setSenha_15960371608 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term824;

    public Usuario_setSenha_15960371608() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term825 = new Long(-7237588299778557629L);
        term824 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term875 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term876 = newInstance(Class.forName("java.time.LocalDate"));
        Object term880 = newInstance(Class.forName("java.time.LocalTime"));
        Object term885 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term886 = newInstance(Class.forName("java.time.LocalDate"));
        Object term890 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term824, term824.getClass(), "id", term825);
        setField(term824, term824.getClass(), "email", "OWDIEULEFu");
        setField(term824, term824.getClass(), "nome", "dWRymuLBtr");
        setField(term824, term824.getClass(), "senha", "AijpHYOFuy");
        setField(term824, term824.getClass(), "perfilUsuario", "SbAoxhfrkn");
        setIntField(term876, term876.getClass(), "year", 2012);
        setShortField(term876, term876.getClass(), "month", (short) 2);
        setShortField(term876, term876.getClass(), "day", (short) 19);
        setField(term875, term875.getClass(), "date", term876);
        setByteField(term880, term880.getClass(), "hour", (byte) 8);
        setByteField(term880, term880.getClass(), "minute", (byte) 4);
        setByteField(term880, term880.getClass(), "second", (byte) 43);
        setIntField(term880, term880.getClass(), "nano", 114930008);
        setField(term875, term875.getClass(), "time", term880);
        setField(term824, term824.getClass(), "dataCadastro", term875);
        setIntField(term886, term886.getClass(), "year", 2017);
        setShortField(term886, term886.getClass(), "month", (short) 6);
        setShortField(term886, term886.getClass(), "day", (short) 8);
        setField(term885, term885.getClass(), "date", term886);
        setByteField(term890, term890.getClass(), "hour", (byte) 0);
        setByteField(term890, term890.getClass(), "minute", (byte) 18);
        setByteField(term890, term890.getClass(), "second", (byte) 55);
        setIntField(term890, term890.getClass(), "nano", 680586717);
        setField(term885, term885.getClass(), "time", term890);
        setField(term824, term824.getClass(), "dataAlteracao", term885);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Usuario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kuTXqwMtDB";
        callMethod(klass, "setSenha", argTypes, term824, args);
    }

};


