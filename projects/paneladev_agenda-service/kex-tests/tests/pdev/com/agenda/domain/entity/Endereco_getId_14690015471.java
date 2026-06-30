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

public class Endereco_getId_14690015471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2771;

    public Endereco_getId_14690015471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2772 = new Long(8313800941204938919L);
        Long term2786 = new Long(-1214968196781083707L);
        term2771 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term2771, term2771.getClass(), "id", term2772);
        setField(term2771, term2771.getClass(), "rua", "HBGNxdNURv");
        setField(term2771, term2771.getClass(), "numero", term2786);
        setField(term2771, term2771.getClass(), "complemento", "mfCpTPPQQm");
        setField(term2771, term2771.getClass(), "bairro", "OcJCIDNIXA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Endereco");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term2771, args);
    }

};


