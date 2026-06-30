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

public class EnderecoResponse_setId_17158277345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3339;
     Object term3380;

    public EnderecoResponse_setId_17158277345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3340 = new Long(-1333707622307134180L);
        Long term3354 = new Long(-4360569253593381888L);
        term3339 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term3339, term3339.getClass(), "id", term3340);
        setField(term3339, term3339.getClass(), "rua", "vKitydDVnM");
        setField(term3339, term3339.getClass(), "numero", term3354);
        setField(term3339, term3339.getClass(), "complemento", "urCiQnUFBM");
        setField(term3339, term3339.getClass(), "bairro", "EKjQdtKxAM");
        term3380 = new Long(1457594663983990440L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.EnderecoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term3380;
        callMethod(klass, "setId", argTypes, term3339, args);
    }

};


