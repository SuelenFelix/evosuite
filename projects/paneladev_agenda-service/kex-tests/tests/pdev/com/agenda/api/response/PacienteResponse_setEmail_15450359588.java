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

public class PacienteResponse_setEmail_15450359588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2658;

    public PacienteResponse_setEmail_15450359588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2659 = new Long(7495904023107549024L);
        term2658 = newInstance(Class.forName("pdev.com.agenda.api.response.PacienteResponse"));
        setField(term2658, term2658.getClass(), "id", term2659);
        setField(term2658, term2658.getClass(), "nome", "WVbxuoDBcn");
        setField(term2658, term2658.getClass(), "sobrenome", "pvDEABOxLt");
        setField(term2658, term2658.getClass(), "email", "beAMpkroCQ");
        setField(term2658, term2658.getClass(), "cpf", "uSUvKAyuvd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.PacienteResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "onQLVONGuf";
        callMethod(klass, "setEmail", argTypes, term2658, args);
    }

};


