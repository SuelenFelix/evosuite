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

public class PacienteRequest_getEmail_9040909964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1292;

    public PacienteRequest_getEmail_9040909964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1293 = new Long(-4920224193275732920L);
        term1292 = newInstance(Class.forName("pdev.com.agenda.api.request.PacienteRequest"));
        setField(term1292, term1292.getClass(), "id", term1293);
        setField(term1292, term1292.getClass(), "nome", "UoYtihxVaS");
        setField(term1292, term1292.getClass(), "sobrenome", "JDswTTCZHV");
        setField(term1292, term1292.getClass(), "email", "onpbIeEKoi");
        setField(term1292, term1292.getClass(), "cpf", "YRHGsAkhxb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.request.PacienteRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term1292, args);
    }

};


