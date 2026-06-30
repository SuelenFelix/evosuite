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

public class AgendaRequest_getPacienteId_9087409810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1015;

    public AgendaRequest_getPacienteId_9087409810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1015 = newInstance(Class.forName("pdev.com.agenda.api.request.AgendaRequest"));
        setField(term1015, term1015.getClass(), "descricao", null);
        setField(term1015, term1015.getClass(), "horario", null);
        setField(term1015, term1015.getClass(), "pacienteId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.request.AgendaRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPacienteId", argTypes, term1015, args);
    }

};


