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

public class EnderecoResponse_setBairro_15677308819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3671;

    public EnderecoResponse_setBairro_15677308819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3672 = new Long(1195529027276497124L);
        Long term3686 = new Long(-2783999800714825789L);
        term3671 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term3671, term3671.getClass(), "id", term3672);
        setField(term3671, term3671.getClass(), "rua", "THZSpzBRYP");
        setField(term3671, term3671.getClass(), "numero", term3686);
        setField(term3671, term3671.getClass(), "complemento", "ZfBIVGBQOE");
        setField(term3671, term3671.getClass(), "bairro", "QSrDQfEsTR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.EnderecoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PsqusYmejD";
        callMethod(klass, "setBairro", argTypes, term3671, args);
    }

};


