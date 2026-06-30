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

public class EnderecoResponse_getNumero_10157152552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3126;

    public EnderecoResponse_getNumero_10157152552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3127 = new Long(-6587807377747738663L);
        Long term3141 = new Long(-6301101997917060727L);
        term3126 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term3126, term3126.getClass(), "id", term3127);
        setField(term3126, term3126.getClass(), "rua", "FjOiNAfBOc");
        setField(term3126, term3126.getClass(), "numero", term3141);
        setField(term3126, term3126.getClass(), "complemento", "iCCsaLHohG");
        setField(term3126, term3126.getClass(), "bairro", "NJhGgctbdj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.EnderecoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNumero", argTypes, term3126, args);
    }

};


