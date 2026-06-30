package pdev.com.agenda.api.request;

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
import static pdev.com.agenda.api.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class AgendaRequest_setDescricao_988872123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term840;

    public AgendaRequest_setDescricao_988872123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term863 = new Long(-8885298608300233488L);
        term840 = newInstance(Class.forName("pdev.com.agenda.api.request.AgendaRequest"));
        Object term853 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term854 = newInstance(Class.forName("java.time.LocalDate"));
        Object term858 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term840, term840.getClass(), "descricao", "Ghbwtircqb");
        setIntField(term854, term854.getClass(), "year", 2015);
        setShortField(term854, term854.getClass(), "month", (short) 4);
        setShortField(term854, term854.getClass(), "day", (short) 14);
        setField(term853, term853.getClass(), "date", term854);
        setByteField(term858, term858.getClass(), "hour", (byte) 18);
        setByteField(term858, term858.getClass(), "minute", (byte) 24);
        setByteField(term858, term858.getClass(), "second", (byte) 32);
        setIntField(term858, term858.getClass(), "nano", 369233818);
        setField(term853, term853.getClass(), "time", term858);
        setField(term840, term840.getClass(), "horario", term853);
        setField(term840, term840.getClass(), "pacienteId", term863);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.request.AgendaRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xrwlQZdwCp";
        callMethod(klass, "setDescricao", argTypes, term840, args);
    }

};


