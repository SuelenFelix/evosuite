package pdev.com.agenda.domain.entity;

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
import static pdev.com.agenda.domain.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Endereco_setBairro_118705664210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3458;

    public Endereco_setBairro_118705664210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3459 = new Long(8166095254618543564L);
        Long term3473 = new Long(-4598158870068953328L);
        term3458 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term3458, term3458.getClass(), "id", term3459);
        setField(term3458, term3458.getClass(), "rua", "WVbxuoDBcn");
        setField(term3458, term3458.getClass(), "numero", term3473);
        setField(term3458, term3458.getClass(), "complemento", "pvDEABOxLt");
        setField(term3458, term3458.getClass(), "bairro", "beAMpkroCQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Endereco");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uSUvKAyuvd";
        callMethod(klass, "setBairro", argTypes, term3458, args);
    }

};


