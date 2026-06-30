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

public class Endereco_getComplemento_7165865304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2984;

    public Endereco_getComplemento_7165865304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2985 = new Long(7489064039921396098L);
        Long term2999 = new Long(6843866297465638866L);
        term2984 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term2984, term2984.getClass(), "id", term2985);
        setField(term2984, term2984.getClass(), "rua", "nghfqDXyCG");
        setField(term2984, term2984.getClass(), "numero", term2999);
        setField(term2984, term2984.getClass(), "complemento", "WBAOTqErtm");
        setField(term2984, term2984.getClass(), "bairro", "PqtVXXZMqK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Endereco");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComplemento", argTypes, term2984, args);
    }

};


