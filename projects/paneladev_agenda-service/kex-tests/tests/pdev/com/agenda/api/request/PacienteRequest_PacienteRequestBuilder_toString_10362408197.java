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

public class PacienteRequest_PacienteRequestBuilder_toString_10362408197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term637;

    public PacienteRequest_PacienteRequestBuilder_toString_10362408197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term638 = new Long(6811161968424632369L);
        term637 = newInstance(Class.forName("pdev.com.agenda.api.request.PacienteRequest$PacienteRequestBuilder"));
        setField(term637, term637.getClass(), "id", term638);
        setField(term637, term637.getClass(), "nome", "IoAlmYsBwc");
        setField(term637, term637.getClass(), "sobrenome", "TEParAifyi");
        setField(term637, term637.getClass(), "email", "OWDIEULEFu");
        setField(term637, term637.getClass(), "cpf", "dWRymuLBtr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.request.PacienteRequest$PacienteRequestBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term637, args);
    }

};


