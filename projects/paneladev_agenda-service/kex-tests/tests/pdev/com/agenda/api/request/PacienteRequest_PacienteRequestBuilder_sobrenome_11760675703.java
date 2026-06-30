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
import java.lang.Long;

public class PacienteRequest_PacienteRequestBuilder_sobrenome_11760675703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207;

    public PacienteRequest_PacienteRequestBuilder_sobrenome_11760675703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term208 = new Long(-8400487765614892086L);
        term207 = newInstance(Class.forName("pdev.com.agenda.api.request.PacienteRequest$PacienteRequestBuilder"));
        setField(term207, term207.getClass(), "id", term208);
        setField(term207, term207.getClass(), "nome", "RMFIsYGgne");
        setField(term207, term207.getClass(), "sobrenome", "NRdvgJlhkX");
        setField(term207, term207.getClass(), "email", "uuaPigETmJ");
        setField(term207, term207.getClass(), "cpf", "MxlszYVzRf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.request.PacienteRequest$PacienteRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LQFpaHEwXR";
        callMethod(klass, "sobrenome", argTypes, term207, args);
    }

};


