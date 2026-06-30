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

public class AgendaResponse_setPaciente_1053025317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5109;

    public AgendaResponse_setPaciente_1053025317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5109 = newInstance(Class.forName("pdev.com.agenda.api.response.AgendaResponse"));
        setField(term5109, term5109.getClass(), "id", null);
        setField(term5109, term5109.getClass(), "descricao", null);
        setField(term5109, term5109.getClass(), "horario", null);
        setField(term5109, term5109.getClass(), "paciente", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.AgendaResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("pdev.com.agenda.api.response.PacienteResponse");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPaciente", argTypes, term5109, args);
    }

};


