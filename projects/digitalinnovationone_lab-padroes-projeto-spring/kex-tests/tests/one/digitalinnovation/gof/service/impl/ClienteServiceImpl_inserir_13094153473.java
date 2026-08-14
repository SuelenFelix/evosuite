package one.digitalinnovation.gof.service.impl;

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
import static one.digitalinnovation.gof.service.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class ClienteServiceImpl_inserir_13094153473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;

    public ClienteServiceImpl_inserir_13094153473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4 = new Long(6375119433582206027L);
        term3 = newInstance(Class.forName("one.digitalinnovation.gof.model.Cliente"));
        Object term18 = newInstance(Class.forName("one.digitalinnovation.gof.model.Endereco"));
        setField(term3, term3.getClass(), "id", term4);
        setField(term3, term3.getClass(), "nome", "PAEBtnZtTD");
        setField(term18, term18.getClass(), "cep", "sjlJAEtRrb");
        setField(term18, term18.getClass(), "logradouro", "MuLcgQHgqz");
        setField(term18, term18.getClass(), "complemento", "xxtlPwDYFs");
        setField(term18, term18.getClass(), "bairro", "jJCZpVmanW");
        setField(term18, term18.getClass(), "localidade", "EGtDIRbSSb");
        setField(term18, term18.getClass(), "uf", "SzjVpOQTyS");
        setField(term18, term18.getClass(), "ibge", "MjGYSRKTNF");
        setField(term18, term18.getClass(), "gia", "hRNSzYYIrc");
        setField(term18, term18.getClass(), "ddd", "RMFIsYGgne");
        setField(term18, term18.getClass(), "siafi", "NRdvgJlhkX");
        setField(term3, term3.getClass(), "endereco", term18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("one.digitalinnovation.gof.service.impl.ClienteServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("one.digitalinnovation.gof.model.Cliente");
        Object[] args = new Object[1];
        args[0] = term3;
        callMethod(klass, "inserir", argTypes, null, args);
    }

};


