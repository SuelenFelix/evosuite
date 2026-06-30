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

public class Usuario_equals_173719829016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1776;
     Object term1847;

    public Usuario_equals_173719829016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1777 = new Long(-316468845751588286L);
        term1776 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term1827 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1828 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1832 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1837 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1838 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1842 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1776, term1776.getClass(), "id", term1777);
        setField(term1776, term1776.getClass(), "email", "fhkbdRViHi");
        setField(term1776, term1776.getClass(), "nome", "uWHnvSvaPl");
        setField(term1776, term1776.getClass(), "senha", "kBdSllIBVz");
        setField(term1776, term1776.getClass(), "perfilUsuario", "TJmVBGfTML");
        setIntField(term1828, term1828.getClass(), "year", 2012);
        setShortField(term1828, term1828.getClass(), "month", (short) 3);
        setShortField(term1828, term1828.getClass(), "day", (short) 27);
        setField(term1827, term1827.getClass(), "date", term1828);
        setByteField(term1832, term1832.getClass(), "hour", (byte) 17);
        setByteField(term1832, term1832.getClass(), "minute", (byte) 49);
        setByteField(term1832, term1832.getClass(), "second", (byte) 24);
        setIntField(term1832, term1832.getClass(), "nano", 530647398);
        setField(term1827, term1827.getClass(), "time", term1832);
        setField(term1776, term1776.getClass(), "dataCadastro", term1827);
        setIntField(term1838, term1838.getClass(), "year", 2010);
        setShortField(term1838, term1838.getClass(), "month", (short) 6);
        setShortField(term1838, term1838.getClass(), "day", (short) 14);
        setField(term1837, term1837.getClass(), "date", term1838);
        setByteField(term1842, term1842.getClass(), "hour", (byte) 6);
        setByteField(term1842, term1842.getClass(), "minute", (byte) 22);
        setByteField(term1842, term1842.getClass(), "second", (byte) 20);
        setIntField(term1842, term1842.getClass(), "nano", 25133051);
        setField(term1837, term1837.getClass(), "time", term1842);
        setField(term1776, term1776.getClass(), "dataAlteracao", term1837);
        term1847 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Usuario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1847;
        callMethod(klass, "equals", argTypes, term1776, args);
    }

};


