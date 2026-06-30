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

public class AgendaResponse_getId_2803972750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3844;

    public AgendaResponse_getId_2803972750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3845 = new Long(-8121849829073967555L);
        Long term3870 = new Long(5219030281405653303L);
        term3844 = newInstance(Class.forName("pdev.com.agenda.api.response.AgendaResponse"));
        Object term3859 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3860 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3864 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3869 = newInstance(Class.forName("pdev.com.agenda.api.response.PacienteResponse"));
        setField(term3844, term3844.getClass(), "id", term3845);
        setField(term3844, term3844.getClass(), "descricao", "OeQLvhVERT");
        setIntField(term3860, term3860.getClass(), "year", 2012);
        setShortField(term3860, term3860.getClass(), "month", (short) 8);
        setShortField(term3860, term3860.getClass(), "day", (short) 25);
        setField(term3859, term3859.getClass(), "date", term3860);
        setByteField(term3864, term3864.getClass(), "hour", (byte) 5);
        setByteField(term3864, term3864.getClass(), "minute", (byte) 20);
        setByteField(term3864, term3864.getClass(), "second", (byte) 50);
        setIntField(term3864, term3864.getClass(), "nano", 345595912);
        setField(term3859, term3859.getClass(), "time", term3864);
        setField(term3844, term3844.getClass(), "horario", term3859);
        setField(term3869, term3869.getClass(), "id", term3870);
        setField(term3869, term3869.getClass(), "nome", "IlvgFINwIa");
        setField(term3869, term3869.getClass(), "sobrenome", "GEJABPlHSI");
        setField(term3869, term3869.getClass(), "email", "aQFUvuaYxd");
        setField(term3869, term3869.getClass(), "cpf", "zNFLXMifnS");
        setField(term3844, term3844.getClass(), "paciente", term3869);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.AgendaResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term3844, args);
    }

};


