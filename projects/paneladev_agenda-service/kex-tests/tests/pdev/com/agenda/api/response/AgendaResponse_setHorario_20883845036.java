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

public class AgendaResponse_setHorario_20883845036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4624;
     Object term4700;

    public AgendaResponse_setHorario_20883845036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4625 = new Long(5465527210299101732L);
        Long term4650 = new Long(4699157009689333952L);
        term4624 = newInstance(Class.forName("pdev.com.agenda.api.response.AgendaResponse"));
        Object term4639 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4640 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4644 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4649 = newInstance(Class.forName("pdev.com.agenda.api.response.PacienteResponse"));
        setField(term4624, term4624.getClass(), "id", term4625);
        setField(term4624, term4624.getClass(), "descricao", "aanyiAOJCl");
        setIntField(term4640, term4640.getClass(), "year", 2025);
        setShortField(term4640, term4640.getClass(), "month", (short) 4);
        setShortField(term4640, term4640.getClass(), "day", (short) 24);
        setField(term4639, term4639.getClass(), "date", term4640);
        setByteField(term4644, term4644.getClass(), "hour", (byte) 18);
        setByteField(term4644, term4644.getClass(), "minute", (byte) 11);
        setByteField(term4644, term4644.getClass(), "second", (byte) 40);
        setIntField(term4644, term4644.getClass(), "nano", 137454929);
        setField(term4639, term4639.getClass(), "time", term4644);
        setField(term4624, term4624.getClass(), "horario", term4639);
        setField(term4649, term4649.getClass(), "id", term4650);
        setField(term4649, term4649.getClass(), "nome", "VDokbsCuqq");
        setField(term4649, term4649.getClass(), "sobrenome", "xClUIcPECX");
        setField(term4649, term4649.getClass(), "email", "avhRaGZaBF");
        setField(term4649, term4649.getClass(), "cpf", "JkgoRtImdE");
        setField(term4624, term4624.getClass(), "paciente", term4649);
        term4700 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4701 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4705 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4701, term4701.getClass(), "year", 2024);
        setShortField(term4701, term4701.getClass(), "month", (short) 1);
        setShortField(term4701, term4701.getClass(), "day", (short) 24);
        setField(term4700, term4700.getClass(), "date", term4701);
        setByteField(term4705, term4705.getClass(), "hour", (byte) 20);
        setByteField(term4705, term4705.getClass(), "minute", (byte) 28);
        setByteField(term4705, term4705.getClass(), "second", (byte) 39);
        setIntField(term4705, term4705.getClass(), "nano", 952728177);
        setField(term4700, term4700.getClass(), "time", term4705);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.AgendaResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term4700;
        callMethod(klass, "setHorario", argTypes, term4624, args);
    }

};


