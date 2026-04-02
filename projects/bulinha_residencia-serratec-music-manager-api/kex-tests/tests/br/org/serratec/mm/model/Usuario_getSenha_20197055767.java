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

public class Usuario_getSenha_20197055767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term713;

    public Usuario_getSenha_20197055767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term714 = new Long(6811161968424632369L);
        term713 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term764 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term765 = newInstance(Class.forName("java.time.LocalDate"));
        Object term769 = newInstance(Class.forName("java.time.LocalTime"));
        Object term774 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term775 = newInstance(Class.forName("java.time.LocalDate"));
        Object term779 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term713, term713.getClass(), "id", term714);
        setField(term713, term713.getClass(), "email", "flxyYxBRtu");
        setField(term713, term713.getClass(), "nome", "OclPbYPkcH");
        setField(term713, term713.getClass(), "senha", "IoAlmYsBwc");
        setField(term713, term713.getClass(), "perfilUsuario", "TEParAifyi");
        setIntField(term765, term765.getClass(), "year", 2012);
        setShortField(term765, term765.getClass(), "month", (short) 9);
        setShortField(term765, term765.getClass(), "day", (short) 11);
        setField(term764, term764.getClass(), "date", term765);
        setByteField(term769, term769.getClass(), "hour", (byte) 22);
        setByteField(term769, term769.getClass(), "minute", (byte) 10);
        setByteField(term769, term769.getClass(), "second", (byte) 8);
        setIntField(term769, term769.getClass(), "nano", 380008862);
        setField(term764, term764.getClass(), "time", term769);
        setField(term713, term713.getClass(), "dataCadastro", term764);
        setIntField(term775, term775.getClass(), "year", 2021);
        setShortField(term775, term775.getClass(), "month", (short) 9);
        setShortField(term775, term775.getClass(), "day", (short) 7);
        setField(term774, term774.getClass(), "date", term775);
        setByteField(term779, term779.getClass(), "hour", (byte) 5);
        setByteField(term779, term779.getClass(), "minute", (byte) 25);
        setByteField(term779, term779.getClass(), "second", (byte) 7);
        setIntField(term779, term779.getClass(), "nano", 755924076);
        setField(term774, term774.getClass(), "time", term779);
        setField(term713, term713.getClass(), "dataAlteracao", term774);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Usuario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSenha", argTypes, term713, args);
    }

};


