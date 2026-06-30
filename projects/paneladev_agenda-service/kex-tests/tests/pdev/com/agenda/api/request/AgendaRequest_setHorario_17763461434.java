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

public class AgendaRequest_setHorario_17763461434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term897;
     Object term922;

    public AgendaRequest_setHorario_17763461434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term920 = new Long(-4325723315152823407L);
        term897 = newInstance(Class.forName("pdev.com.agenda.api.request.AgendaRequest"));
        Object term910 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term911 = newInstance(Class.forName("java.time.LocalDate"));
        Object term915 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term897, term897.getClass(), "descricao", "IDCWpPLRkE");
        setIntField(term911, term911.getClass(), "year", 2022);
        setShortField(term911, term911.getClass(), "month", (short) 2);
        setShortField(term911, term911.getClass(), "day", (short) 26);
        setField(term910, term910.getClass(), "date", term911);
        setByteField(term915, term915.getClass(), "hour", (byte) 11);
        setByteField(term915, term915.getClass(), "minute", (byte) 42);
        setByteField(term915, term915.getClass(), "second", (byte) 15);
        setIntField(term915, term915.getClass(), "nano", 377731937);
        setField(term910, term910.getClass(), "time", term915);
        setField(term897, term897.getClass(), "horario", term910);
        setField(term897, term897.getClass(), "pacienteId", term920);
        term922 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term923 = newInstance(Class.forName("java.time.LocalDate"));
        Object term927 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term923, term923.getClass(), "year", 2026);
        setShortField(term923, term923.getClass(), "month", (short) 12);
        setShortField(term923, term923.getClass(), "day", (short) 14);
        setField(term922, term922.getClass(), "date", term923);
        setByteField(term927, term927.getClass(), "hour", (byte) 16);
        setByteField(term927, term927.getClass(), "minute", (byte) 34);
        setByteField(term927, term927.getClass(), "second", (byte) 9);
        setIntField(term927, term927.getClass(), "nano", 518326996);
        setField(term922, term922.getClass(), "time", term927);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.request.AgendaRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term922;
        callMethod(klass, "setHorario", argTypes, term897, args);
    }

};


