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

public class Endereco_setComplemento_8196373469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3365;

    public Endereco_setComplemento_8196373469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3366 = new Long(-6587807377747738663L);
        Long term3380 = new Long(-6301101997917060727L);
        term3365 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term3365, term3365.getClass(), "id", term3366);
        setField(term3365, term3365.getClass(), "rua", "CGOpQSZZwI");
        setField(term3365, term3365.getClass(), "numero", term3380);
        setField(term3365, term3365.getClass(), "complemento", "ypEdrstygY");
        setField(term3365, term3365.getClass(), "bairro", "sNQFlATEeQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Endereco");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZKMLioamsY";
        callMethod(klass, "setComplemento", argTypes, term3365, args);
    }

};


