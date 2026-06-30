package pdev.com.agenda.api.response;

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
import static pdev.com.agenda.api.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class AgendaResponse_getPaciente_17255327893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4222;

    public AgendaResponse_getPaciente_17255327893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4223 = new Long(3427570961451840069L);
        Long term4248 = new Long(4502292577098212311L);
        term4222 = newInstance(Class.forName("pdev.com.agenda.api.response.AgendaResponse"));
        Object term4237 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4238 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4242 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4247 = newInstance(Class.forName("pdev.com.agenda.api.response.PacienteResponse"));
        setField(term4222, term4222.getClass(), "id", term4223);
        setField(term4222, term4222.getClass(), "descricao", "RDnkgWkcbz");
        setIntField(term4238, term4238.getClass(), "year", 2015);
        setShortField(term4238, term4238.getClass(), "month", (short) 4);
        setShortField(term4238, term4238.getClass(), "day", (short) 14);
        setField(term4237, term4237.getClass(), "date", term4238);
        setByteField(term4242, term4242.getClass(), "hour", (byte) 18);
        setByteField(term4242, term4242.getClass(), "minute", (byte) 24);
        setByteField(term4242, term4242.getClass(), "second", (byte) 32);
        setIntField(term4242, term4242.getClass(), "nano", 369233818);
        setField(term4237, term4237.getClass(), "time", term4242);
        setField(term4222, term4222.getClass(), "horario", term4237);
        setField(term4247, term4247.getClass(), "id", term4248);
        setField(term4247, term4247.getClass(), "nome", "IBpaxltauX");
        setField(term4247, term4247.getClass(), "sobrenome", "hePqROaplw");
        setField(term4247, term4247.getClass(), "email", "PJcSNDruWd");
        setField(term4247, term4247.getClass(), "cpf", "VVNNlAePXF");
        setField(term4222, term4222.getClass(), "paciente", term4247);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.AgendaResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPaciente", argTypes, term4222, args);
    }

};


