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

public class PacienteResponse_getSobrenome_7840073602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2066;

    public PacienteResponse_getSobrenome_7840073602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2067 = new Long(-2255965562447970862L);
        term2066 = newInstance(Class.forName("pdev.com.agenda.api.response.PacienteResponse"));
        setField(term2066, term2066.getClass(), "id", term2067);
        setField(term2066, term2066.getClass(), "nome", "XfRABIFVEp");
        setField(term2066, term2066.getClass(), "sobrenome", "MHGKyEnwKc");
        setField(term2066, term2066.getClass(), "email", "ShIELyuULw");
        setField(term2066, term2066.getClass(), "cpf", "IpQuOGMgmj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.PacienteResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSobrenome", argTypes, term2066, args);
    }

};


