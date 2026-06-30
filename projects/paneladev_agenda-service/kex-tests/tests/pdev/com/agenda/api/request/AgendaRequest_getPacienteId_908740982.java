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

public class AgendaRequest_getPacienteId_908740982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term805;

    public AgendaRequest_getPacienteId_908740982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term828 = new Long(-2813493605142626659L);
        term805 = newInstance(Class.forName("pdev.com.agenda.api.request.AgendaRequest"));
        Object term818 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term819 = newInstance(Class.forName("java.time.LocalDate"));
        Object term823 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term805, term805.getClass(), "descricao", "kuTXqwMtDB");
        setIntField(term819, term819.getClass(), "year", 2015);
        setShortField(term819, term819.getClass(), "month", (short) 9);
        setShortField(term819, term819.getClass(), "day", (short) 19);
        setField(term818, term818.getClass(), "date", term819);
        setByteField(term823, term823.getClass(), "hour", (byte) 9);
        setByteField(term823, term823.getClass(), "minute", (byte) 4);
        setByteField(term823, term823.getClass(), "second", (byte) 10);
        setIntField(term823, term823.getClass(), "nano", 401765865);
        setField(term818, term818.getClass(), "time", term823);
        setField(term805, term805.getClass(), "horario", term818);
        setField(term805, term805.getClass(), "pacienteId", term828);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.request.AgendaRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPacienteId", argTypes, term805, args);
    }

};


