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

public class AgendaResponse_setId_7104390334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4348;
     Object term4424;

    public AgendaResponse_setId_7104390334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4349 = new Long(-3730936709704460408L);
        Long term4374 = new Long(-8614778293741404325L);
        term4348 = newInstance(Class.forName("pdev.com.agenda.api.response.AgendaResponse"));
        Object term4363 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4364 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4368 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4373 = newInstance(Class.forName("pdev.com.agenda.api.response.PacienteResponse"));
        setField(term4348, term4348.getClass(), "id", term4349);
        setField(term4348, term4348.getClass(), "descricao", "jnwVnmKAFv");
        setIntField(term4364, term4364.getClass(), "year", 2022);
        setShortField(term4364, term4364.getClass(), "month", (short) 2);
        setShortField(term4364, term4364.getClass(), "day", (short) 26);
        setField(term4363, term4363.getClass(), "date", term4364);
        setByteField(term4368, term4368.getClass(), "hour", (byte) 11);
        setByteField(term4368, term4368.getClass(), "minute", (byte) 42);
        setByteField(term4368, term4368.getClass(), "second", (byte) 15);
        setIntField(term4368, term4368.getClass(), "nano", 377731937);
        setField(term4363, term4363.getClass(), "time", term4368);
        setField(term4348, term4348.getClass(), "horario", term4363);
        setField(term4373, term4373.getClass(), "id", term4374);
        setField(term4373, term4373.getClass(), "nome", "TXyHhqeCjR");
        setField(term4373, term4373.getClass(), "sobrenome", "lZIgPZPgTu");
        setField(term4373, term4373.getClass(), "email", "iuCxnHGMoW");
        setField(term4373, term4373.getClass(), "cpf", "GPSEWEDSTo");
        setField(term4348, term4348.getClass(), "paciente", term4373);
        term4424 = new Long(-5447369594017685765L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.AgendaResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term4424;
        callMethod(klass, "setId", argTypes, term4348, args);
    }

};


