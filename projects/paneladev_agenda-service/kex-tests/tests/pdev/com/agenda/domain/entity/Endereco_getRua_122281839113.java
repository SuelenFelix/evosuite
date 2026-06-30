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

public class Endereco_getRua_122281839113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3552;

    public Endereco_getRua_122281839113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3552 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term3552, term3552.getClass(), "id", null);
        setField(term3552, term3552.getClass(), "rua", null);
        setField(term3552, term3552.getClass(), "numero", null);
        setField(term3552, term3552.getClass(), "complemento", null);
        setField(term3552, term3552.getClass(), "bairro", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Endereco");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRua", argTypes, term3552, args);
    }

};


