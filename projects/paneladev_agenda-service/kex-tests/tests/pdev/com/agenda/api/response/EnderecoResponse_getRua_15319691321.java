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

public class EnderecoResponse_getRua_15319691321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3055;

    public EnderecoResponse_getRua_15319691321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3056 = new Long(-2924531382671518368L);
        Long term3070 = new Long(-3948863953565024517L);
        term3055 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term3055, term3055.getClass(), "id", term3056);
        setField(term3055, term3055.getClass(), "rua", "uPuCVuZYOI");
        setField(term3055, term3055.getClass(), "numero", term3070);
        setField(term3055, term3055.getClass(), "complemento", "TweMFhxNdj");
        setField(term3055, term3055.getClass(), "bairro", "NBrvVzvQHe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.EnderecoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRua", argTypes, term3055, args);
    }

};


