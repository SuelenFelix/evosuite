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

public class EnderecoResponse_setComplemento_19351501778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3578;

    public EnderecoResponse_setComplemento_19351501778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3579 = new Long(-1539859611880912454L);
        Long term3593 = new Long(4100236067313034103L);
        term3578 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term3578, term3578.getClass(), "id", term3579);
        setField(term3578, term3578.getClass(), "rua", "vLerpqavFM");
        setField(term3578, term3578.getClass(), "numero", term3593);
        setField(term3578, term3578.getClass(), "complemento", "qnvxzwuGKX");
        setField(term3578, term3578.getClass(), "bairro", "EdPAvpluZg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.EnderecoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DzHVBMqWtE";
        callMethod(klass, "setComplemento", argTypes, term3578, args);
    }

};


