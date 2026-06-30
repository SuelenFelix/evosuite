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

public class Usuario_hashCode_128851161515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1665;

    public Usuario_hashCode_128851161515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1666 = new Long(-872011222785455006L);
        term1665 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term1716 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1717 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1721 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1726 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1727 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1731 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1665, term1665.getClass(), "id", term1666);
        setField(term1665, term1665.getClass(), "email", "ieCtQFdkii");
        setField(term1665, term1665.getClass(), "nome", "dEnhdmILtU");
        setField(term1665, term1665.getClass(), "senha", "hoicvmsovO");
        setField(term1665, term1665.getClass(), "perfilUsuario", "eqJfYWRaEL");
        setIntField(term1717, term1717.getClass(), "year", 2016);
        setShortField(term1717, term1717.getClass(), "month", (short) 6);
        setShortField(term1717, term1717.getClass(), "day", (short) 15);
        setField(term1716, term1716.getClass(), "date", term1717);
        setByteField(term1721, term1721.getClass(), "hour", (byte) 21);
        setByteField(term1721, term1721.getClass(), "minute", (byte) 23);
        setByteField(term1721, term1721.getClass(), "second", (byte) 23);
        setIntField(term1721, term1721.getClass(), "nano", 433372070);
        setField(term1716, term1716.getClass(), "time", term1721);
        setField(term1665, term1665.getClass(), "dataCadastro", term1716);
        setIntField(term1727, term1727.getClass(), "year", 2012);
        setShortField(term1727, term1727.getClass(), "month", (short) 8);
        setShortField(term1727, term1727.getClass(), "day", (short) 25);
        setField(term1726, term1726.getClass(), "date", term1727);
        setByteField(term1731, term1731.getClass(), "hour", (byte) 19);
        setByteField(term1731, term1731.getClass(), "minute", (byte) 49);
        setByteField(term1731, term1731.getClass(), "second", (byte) 8);
        setIntField(term1731, term1731.getClass(), "nano", 912685024);
        setField(term1726, term1726.getClass(), "time", term1731);
        setField(term1665, term1665.getClass(), "dataAlteracao", term1726);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Usuario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1665, args);
    }

};


