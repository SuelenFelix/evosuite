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

public class Endereco_getBairro_65885717416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3555;

    public Endereco_getBairro_65885717416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3555 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term3555, term3555.getClass(), "id", null);
        setField(term3555, term3555.getClass(), "rua", null);
        setField(term3555, term3555.getClass(), "numero", null);
        setField(term3555, term3555.getClass(), "complemento", null);
        setField(term3555, term3555.getClass(), "bairro", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Endereco");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBairro", argTypes, term3555, args);
    }

};


