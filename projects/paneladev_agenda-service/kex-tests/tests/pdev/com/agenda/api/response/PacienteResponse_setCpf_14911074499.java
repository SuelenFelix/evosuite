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

public class PacienteResponse_setCpf_14911074499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2771;

    public PacienteResponse_setCpf_14911074499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2772 = new Long(8802866251294305945L);
        term2771 = newInstance(Class.forName("pdev.com.agenda.api.response.PacienteResponse"));
        setField(term2771, term2771.getClass(), "id", term2772);
        setField(term2771, term2771.getClass(), "nome", "SOrEHbcbmn");
        setField(term2771, term2771.getClass(), "sobrenome", "bnsyeQXFdu");
        setField(term2771, term2771.getClass(), "email", "BwtdjiefJn");
        setField(term2771, term2771.getClass(), "cpf", "jDmhBrIoDa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.PacienteResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SPtPatHeOm";
        callMethod(klass, "setCpf", argTypes, term2771, args);
    }

};


