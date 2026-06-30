package pdev.com.agenda.domain.entity;

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
import static pdev.com.agenda.domain.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;

public class Agenda_setHorario_9093381888 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2108;
     Object term2228;

    public Agenda_setHorario_9093381888() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2109 = new Long(50358265865610362L);
        Long term2144 = new Long(5510783420697225605L);
        Long term2197 = new Long(6005241913654469005L);
        Long term2199 = new Long(-1983291584002806658L);
        Object term2196 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term2196, term2196.getClass(), "id", term2197);
        setField(term2196, term2196.getClass(), "rua", null);
        setField(term2196, term2196.getClass(), "numero", term2199);
        setField(term2196, term2196.getClass(), "complemento", null);
        setField(term2196, term2196.getClass(), "bairro", null);
        Long term2202 = new Long(5946780097489996391L);
        Long term2204 = new Long(-8652538484981166496L);
        Object term2201 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term2201, term2201.getClass(), "id", term2202);
        setField(term2201, term2201.getClass(), "rua", null);
        setField(term2201, term2201.getClass(), "numero", term2204);
        setField(term2201, term2201.getClass(), "complemento", null);
        setField(term2201, term2201.getClass(), "bairro", null);
        Long term2207 = new Long(2701184207686293431L);
        Long term2209 = new Long(4474998035090263139L);
        Object term2206 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term2206, term2206.getClass(), "id", term2207);
        setField(term2206, term2206.getClass(), "rua", null);
        setField(term2206, term2206.getClass(), "numero", term2209);
        setField(term2206, term2206.getClass(), "complemento", null);
        setField(term2206, term2206.getClass(), "bairro", null);
        Long term2212 = new Long(2848819812340321742L);
        Long term2214 = new Long(-8876856890348836498L);
        Object term2211 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term2211, term2211.getClass(), "id", term2212);
        setField(term2211, term2211.getClass(), "rua", null);
        setField(term2211, term2211.getClass(), "numero", term2214);
        setField(term2211, term2211.getClass(), "complemento", null);
        setField(term2211, term2211.getClass(), "bairro", null);
        Long term2217 = new Long(846579494941632714L);
        Long term2219 = new Long(6689117472719450333L);
        Object term2216 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term2216, term2216.getClass(), "id", term2217);
        setField(term2216, term2216.getClass(), "rua", null);
        setField(term2216, term2216.getClass(), "numero", term2219);
        setField(term2216, term2216.getClass(), "complemento", null);
        setField(term2216, term2216.getClass(), "bairro", null);
        Long term2222 = new Long(5836128569274066678L);
        Long term2224 = new Long(-2177368829816872572L);
        Object term2221 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term2221, term2221.getClass(), "id", term2222);
        setField(term2221, term2221.getClass(), "rua", null);
        setField(term2221, term2221.getClass(), "numero", term2224);
        setField(term2221, term2221.getClass(), "complemento", null);
        setField(term2221, term2221.getClass(), "bairro", null);
        ArrayList term2194 = new ArrayList();
        ((ArrayList) term2194).add(term2196);
        ((ArrayList) term2194).add(term2201);
        ((ArrayList) term2194).add(term2206);
        ((ArrayList) term2194).add(term2211);
        ((ArrayList) term2194).add(term2216);
        ((ArrayList) term2194).add(term2221);
        term2108 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Agenda"));
        Object term2123 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2124 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2128 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2133 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2134 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2138 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2143 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Paciente"));
        setField(term2108, term2108.getClass(), "id", term2109);
        setField(term2108, term2108.getClass(), "descricao", "VYkqXKVlAJ");
        setIntField(term2124, term2124.getClass(), "year", 2012);
        setShortField(term2124, term2124.getClass(), "month", (short) 2);
        setShortField(term2124, term2124.getClass(), "day", (short) 19);
        setField(term2123, term2123.getClass(), "date", term2124);
        setByteField(term2128, term2128.getClass(), "hour", (byte) 8);
        setByteField(term2128, term2128.getClass(), "minute", (byte) 4);
        setByteField(term2128, term2128.getClass(), "second", (byte) 43);
        setIntField(term2128, term2128.getClass(), "nano", 114930008);
        setField(term2123, term2123.getClass(), "time", term2128);
        setField(term2108, term2108.getClass(), "horario", term2123);
        setIntField(term2134, term2134.getClass(), "year", 2017);
        setShortField(term2134, term2134.getClass(), "month", (short) 6);
        setShortField(term2134, term2134.getClass(), "day", (short) 8);
        setField(term2133, term2133.getClass(), "date", term2134);
        setByteField(term2138, term2138.getClass(), "hour", (byte) 0);
        setByteField(term2138, term2138.getClass(), "minute", (byte) 18);
        setByteField(term2138, term2138.getClass(), "second", (byte) 55);
        setIntField(term2138, term2138.getClass(), "nano", 680586717);
        setField(term2133, term2133.getClass(), "time", term2138);
        setField(term2108, term2108.getClass(), "dataCriacao", term2133);
        setField(term2143, term2143.getClass(), "id", term2144);
        setField(term2143, term2143.getClass(), "nome", "XkIoWJRNwN");
        setField(term2143, term2143.getClass(), "sobrenome", "aNWLJdrZMq");
        setField(term2143, term2143.getClass(), "email", "HHmNoYxIGj");
        setField(term2143, term2143.getClass(), "cpf", "PtirvZmsGt");
        setField(term2143, term2143.getClass(), "enderecos", term2194);
        setField(term2108, term2108.getClass(), "paciente", term2143);
        term2228 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2229 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2233 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term2229, term2229.getClass(), "year", 2015);
        setShortField(term2229, term2229.getClass(), "month", (short) 9);
        setShortField(term2229, term2229.getClass(), "day", (short) 16);
        setField(term2228, term2228.getClass(), "date", term2229);
        setByteField(term2233, term2233.getClass(), "hour", (byte) 6);
        setByteField(term2233, term2233.getClass(), "minute", (byte) 19);
        setByteField(term2233, term2233.getClass(), "second", (byte) 42);
        setIntField(term2233, term2233.getClass(), "nano", 630084975);
        setField(term2228, term2228.getClass(), "time", term2233);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Agenda");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term2228;
        callMethod(klass, "setHorario", argTypes, term2108, args);
    }

};


