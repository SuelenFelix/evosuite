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

public class Usuario_setId_7836409992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112;
     Object term183;

    public Usuario_setId_7836409992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term113 = new Long(6375119433582206027L);
        term112 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term163 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term164 = newInstance(Class.forName("java.time.LocalDate"));
        Object term168 = newInstance(Class.forName("java.time.LocalTime"));
        Object term173 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term174 = newInstance(Class.forName("java.time.LocalDate"));
        Object term178 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term112, term112.getClass(), "id", term113);
        setField(term112, term112.getClass(), "email", "jJCZpVmanW");
        setField(term112, term112.getClass(), "nome", "EGtDIRbSSb");
        setField(term112, term112.getClass(), "senha", "SzjVpOQTyS");
        setField(term112, term112.getClass(), "perfilUsuario", "MjGYSRKTNF");
        setIntField(term164, term164.getClass(), "year", 2015);
        setShortField(term164, term164.getClass(), "month", (short) 9);
        setShortField(term164, term164.getClass(), "day", (short) 19);
        setField(term163, term163.getClass(), "date", term164);
        setByteField(term168, term168.getClass(), "hour", (byte) 9);
        setByteField(term168, term168.getClass(), "minute", (byte) 4);
        setByteField(term168, term168.getClass(), "second", (byte) 10);
        setIntField(term168, term168.getClass(), "nano", 401765865);
        setField(term163, term163.getClass(), "time", term168);
        setField(term112, term112.getClass(), "dataCadastro", term163);
        setIntField(term174, term174.getClass(), "year", 2015);
        setShortField(term174, term174.getClass(), "month", (short) 4);
        setShortField(term174, term174.getClass(), "day", (short) 14);
        setField(term173, term173.getClass(), "date", term174);
        setByteField(term178, term178.getClass(), "hour", (byte) 18);
        setByteField(term178, term178.getClass(), "minute", (byte) 24);
        setByteField(term178, term178.getClass(), "second", (byte) 32);
        setIntField(term178, term178.getClass(), "nano", 369233818);
        setField(term173, term173.getClass(), "time", term178);
        setField(term112, term112.getClass(), "dataAlteracao", term173);
        term183 = new Long(-8257434502486459194L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Usuario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term183;
        callMethod(klass, "setId", argTypes, term112, args);
    }

};


