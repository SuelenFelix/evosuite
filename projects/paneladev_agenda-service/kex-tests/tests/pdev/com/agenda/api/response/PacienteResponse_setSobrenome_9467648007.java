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

public class PacienteResponse_setSobrenome_9467648007 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2545;

    public PacienteResponse_setSobrenome_9467648007() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2546 = new Long(-1616722610139554082L);
        term2545 = newInstance(Class.forName("pdev.com.agenda.api.response.PacienteResponse"));
        setField(term2545, term2545.getClass(), "id", term2546);
        setField(term2545, term2545.getClass(), "nome", "lCyLIcSuom");
        setField(term2545, term2545.getClass(), "sobrenome", "CGOpQSZZwI");
        setField(term2545, term2545.getClass(), "email", "ypEdrstygY");
        setField(term2545, term2545.getClass(), "cpf", "sNQFlATEeQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.PacienteResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZKMLioamsY";
        callMethod(klass, "setSobrenome", argTypes, term2545, args);
    }

};


