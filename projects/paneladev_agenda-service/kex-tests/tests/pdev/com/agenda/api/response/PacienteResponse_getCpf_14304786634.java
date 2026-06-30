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

public class PacienteResponse_getCpf_14304786634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2248;

    public PacienteResponse_getCpf_14304786634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2249 = new Long(7489064039921396098L);
        term2248 = newInstance(Class.forName("pdev.com.agenda.api.response.PacienteResponse"));
        setField(term2248, term2248.getClass(), "id", term2249);
        setField(term2248, term2248.getClass(), "nome", "PqtVXXZMqK");
        setField(term2248, term2248.getClass(), "sobrenome", "rYbtIDVdnd");
        setField(term2248, term2248.getClass(), "email", "UKAReurpHG");
        setField(term2248, term2248.getClass(), "cpf", "WVRMUmrljA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.PacienteResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCpf", argTypes, term2248, args);
    }

};


