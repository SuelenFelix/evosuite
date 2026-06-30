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

public class Endereco_setNumero_8396588988 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3292;
     Object term3333;

    public Endereco_setNumero_8396588988() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3293 = new Long(8034714140377562739L);
        Long term3307 = new Long(-2924531382671518368L);
        term3292 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term3292, term3292.getClass(), "id", term3293);
        setField(term3292, term3292.getClass(), "rua", "WZzvmIHhzZ");
        setField(term3292, term3292.getClass(), "numero", term3307);
        setField(term3292, term3292.getClass(), "complemento", "doQLHkjpNm");
        setField(term3292, term3292.getClass(), "bairro", "lCyLIcSuom");
        term3333 = new Long(-3948863953565024517L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Endereco");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term3333;
        callMethod(klass, "setNumero", argTypes, term3292, args);
    }

};


