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

public class EnderecoResponse_getComplemento_20382009933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3197;

    public EnderecoResponse_getComplemento_20382009933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3198 = new Long(8166095254618543564L);
        Long term3212 = new Long(-4598158870068953328L);
        term3197 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term3197, term3197.getClass(), "id", term3198);
        setField(term3197, term3197.getClass(), "rua", "MYWYUeLGOp");
        setField(term3197, term3197.getClass(), "numero", term3212);
        setField(term3197, term3197.getClass(), "complemento", "tsTGdgQYUL");
        setField(term3197, term3197.getClass(), "bairro", "TtGbVmKcnX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.EnderecoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComplemento", argTypes, term3197, args);
    }

};


