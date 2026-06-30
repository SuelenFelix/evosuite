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

public class Endereco_getBairro_6588571745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3055;

    public Endereco_getBairro_6588571745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3056 = new Long(-4023935540989049732L);
        Long term3070 = new Long(855932984568615096L);
        term3055 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term3055, term3055.getClass(), "id", term3056);
        setField(term3055, term3055.getClass(), "rua", "rYbtIDVdnd");
        setField(term3055, term3055.getClass(), "numero", term3070);
        setField(term3055, term3055.getClass(), "complemento", "UKAReurpHG");
        setField(term3055, term3055.getClass(), "bairro", "WVRMUmrljA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Endereco");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBairro", argTypes, term3055, args);
    }

};


