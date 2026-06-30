package pdev.com.agenda.api.mapper;

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
import static pdev.com.agenda.api.mapper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class AgendaMapper_toAgenda_19207698580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term361;

    public AgendaMapper_toAgenda_19207698580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term384 = new Long(-2585684163342970173L);
        term361 = newInstance(Class.forName("pdev.com.agenda.api.request.AgendaRequest"));
        Object term374 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term375 = newInstance(Class.forName("java.time.LocalDate"));
        Object term379 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term361, term361.getClass(), "descricao", "aKnKipADSo");
        setIntField(term375, term375.getClass(), "year", 2012);
        setShortField(term375, term375.getClass(), "month", (short) 8);
        setShortField(term375, term375.getClass(), "day", (short) 25);
        setField(term374, term374.getClass(), "date", term375);
        setByteField(term379, term379.getClass(), "hour", (byte) 5);
        setByteField(term379, term379.getClass(), "minute", (byte) 20);
        setByteField(term379, term379.getClass(), "second", (byte) 50);
        setIntField(term379, term379.getClass(), "nano", 345595912);
        setField(term374, term374.getClass(), "time", term379);
        setField(term361, term361.getClass(), "horario", term374);
        setField(term361, term361.getClass(), "pacienteId", term384);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.mapper.AgendaMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("pdev.com.agenda.api.request.AgendaRequest");
        Object[] args = new Object[1];
        args[0] = term361;
        callMethod(klass, "toAgenda", argTypes, null, args);
    }

};


