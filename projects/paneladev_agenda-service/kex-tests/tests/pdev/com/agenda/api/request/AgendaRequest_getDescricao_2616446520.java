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

public class AgendaRequest_getDescricao_2616446520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term735;

    public AgendaRequest_getDescricao_2616446520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term758 = new Long(-7237588299778557629L);
        term735 = newInstance(Class.forName("pdev.com.agenda.api.request.AgendaRequest"));
        Object term748 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term749 = newInstance(Class.forName("java.time.LocalDate"));
        Object term753 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term735, term735.getClass(), "descricao", "AijpHYOFuy");
        setIntField(term749, term749.getClass(), "year", 2012);
        setShortField(term749, term749.getClass(), "month", (short) 8);
        setShortField(term749, term749.getClass(), "day", (short) 25);
        setField(term748, term748.getClass(), "date", term749);
        setByteField(term753, term753.getClass(), "hour", (byte) 5);
        setByteField(term753, term753.getClass(), "minute", (byte) 20);
        setByteField(term753, term753.getClass(), "second", (byte) 50);
        setIntField(term753, term753.getClass(), "nano", 345595912);
        setField(term748, term748.getClass(), "time", term753);
        setField(term735, term735.getClass(), "horario", term748);
        setField(term735, term735.getClass(), "pacienteId", term758);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.request.AgendaRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescricao", argTypes, term735, args);
    }

};


