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

public class PacienteResponse_setNome_18557760756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2432;

    public PacienteResponse_setNome_18557760756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2433 = new Long(855932984568615096L);
        term2432 = newInstance(Class.forName("pdev.com.agenda.api.response.PacienteResponse"));
        setField(term2432, term2432.getClass(), "id", term2433);
        setField(term2432, term2432.getClass(), "nome", "bxrCBbrrct");
        setField(term2432, term2432.getClass(), "sobrenome", "CKWpJaaaxX");
        setField(term2432, term2432.getClass(), "email", "UBRmXJmfrt");
        setField(term2432, term2432.getClass(), "cpf", "WZzvmIHhzZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.PacienteResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "doQLHkjpNm";
        callMethod(klass, "setNome", argTypes, term2432, args);
    }

};


