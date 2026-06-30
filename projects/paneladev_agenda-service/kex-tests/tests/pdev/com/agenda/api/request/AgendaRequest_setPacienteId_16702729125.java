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

public class AgendaRequest_setPacienteId_16702729125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term942;
     Object term967;

    public AgendaRequest_setPacienteId_16702729125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term965 = new Long(2535595959091595249L);
        term942 = newInstance(Class.forName("pdev.com.agenda.api.request.AgendaRequest"));
        Object term955 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term956 = newInstance(Class.forName("java.time.LocalDate"));
        Object term960 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term942, term942.getClass(), "descricao", "nyiiPDVjAc");
        setIntField(term956, term956.getClass(), "year", 2025);
        setShortField(term956, term956.getClass(), "month", (short) 4);
        setShortField(term956, term956.getClass(), "day", (short) 24);
        setField(term955, term955.getClass(), "date", term956);
        setByteField(term960, term960.getClass(), "hour", (byte) 18);
        setByteField(term960, term960.getClass(), "minute", (byte) 11);
        setByteField(term960, term960.getClass(), "second", (byte) 40);
        setIntField(term960, term960.getClass(), "nano", 137454929);
        setField(term955, term955.getClass(), "time", term960);
        setField(term942, term942.getClass(), "horario", term955);
        setField(term942, term942.getClass(), "pacienteId", term965);
        term967 = new Long(-5476826692763582090L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.request.AgendaRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term967;
        callMethod(klass, "setPacienteId", argTypes, term942, args);
    }

};


