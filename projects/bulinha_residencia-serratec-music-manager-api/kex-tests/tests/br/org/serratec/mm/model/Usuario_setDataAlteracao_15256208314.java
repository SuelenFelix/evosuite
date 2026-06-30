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

public class Usuario_setDataAlteracao_15256208314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1544;
     Object term1615;

    public Usuario_setDataAlteracao_15256208314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1545 = new Long(-5476826692763582090L);
        term1544 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term1595 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1596 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1600 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1605 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1606 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1610 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1544, term1544.getClass(), "id", term1545);
        setField(term1544, term1544.getClass(), "email", "ffYhPOzlUs");
        setField(term1544, term1544.getClass(), "nome", "MLqYREekMl");
        setField(term1544, term1544.getClass(), "senha", "ytSBIKXogI");
        setField(term1544, term1544.getClass(), "perfilUsuario", "nHXjMycHlU");
        setIntField(term1596, term1596.getClass(), "year", 2027);
        setShortField(term1596, term1596.getClass(), "month", (short) 2);
        setShortField(term1596, term1596.getClass(), "day", (short) 19);
        setField(term1595, term1595.getClass(), "date", term1596);
        setByteField(term1600, term1600.getClass(), "hour", (byte) 17);
        setByteField(term1600, term1600.getClass(), "minute", (byte) 37);
        setByteField(term1600, term1600.getClass(), "second", (byte) 27);
        setIntField(term1600, term1600.getClass(), "nano", 920380537);
        setField(term1595, term1595.getClass(), "time", term1600);
        setField(term1544, term1544.getClass(), "dataCadastro", term1595);
        setIntField(term1606, term1606.getClass(), "year", 2021);
        setShortField(term1606, term1606.getClass(), "month", (short) 8);
        setShortField(term1606, term1606.getClass(), "day", (short) 12);
        setField(term1605, term1605.getClass(), "date", term1606);
        setByteField(term1610, term1610.getClass(), "hour", (byte) 2);
        setByteField(term1610, term1610.getClass(), "minute", (byte) 17);
        setByteField(term1610, term1610.getClass(), "second", (byte) 51);
        setIntField(term1610, term1610.getClass(), "nano", 207375141);
        setField(term1605, term1605.getClass(), "time", term1610);
        setField(term1544, term1544.getClass(), "dataAlteracao", term1605);
        term1615 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1616 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1620 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1616, term1616.getClass(), "year", 2025);
        setShortField(term1616, term1616.getClass(), "month", (short) 11);
        setShortField(term1616, term1616.getClass(), "day", (short) 3);
        setField(term1615, term1615.getClass(), "date", term1616);
        setByteField(term1620, term1620.getClass(), "hour", (byte) 21);
        setByteField(term1620, term1620.getClass(), "minute", (byte) 24);
        setByteField(term1620, term1620.getClass(), "second", (byte) 23);
        setIntField(term1620, term1620.getClass(), "nano", 210986721);
        setField(term1615, term1615.getClass(), "time", term1620);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Usuario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term1615;
        callMethod(klass, "setDataAlteracao", argTypes, term1544, args);
    }

};


