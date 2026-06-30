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

public class AgendaRequest_getHorario_4713168071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term770;

    public AgendaRequest_getHorario_4713168071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term793 = new Long(6967924379644551255L);
        term770 = newInstance(Class.forName("pdev.com.agenda.api.request.AgendaRequest"));
        Object term783 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term784 = newInstance(Class.forName("java.time.LocalDate"));
        Object term788 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term770, term770.getClass(), "descricao", "SbAoxhfrkn");
        setIntField(term784, term784.getClass(), "year", 2021);
        setShortField(term784, term784.getClass(), "month", (short) 1);
        setShortField(term784, term784.getClass(), "day", (short) 18);
        setField(term783, term783.getClass(), "date", term784);
        setByteField(term788, term788.getClass(), "hour", (byte) 13);
        setByteField(term788, term788.getClass(), "minute", (byte) 38);
        setByteField(term788, term788.getClass(), "second", (byte) 26);
        setIntField(term788, term788.getClass(), "nano", 544608644);
        setField(term783, term783.getClass(), "time", term788);
        setField(term770, term770.getClass(), "horario", term783);
        setField(term770, term770.getClass(), "pacienteId", term793);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.request.AgendaRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHorario", argTypes, term770, args);
    }

};


