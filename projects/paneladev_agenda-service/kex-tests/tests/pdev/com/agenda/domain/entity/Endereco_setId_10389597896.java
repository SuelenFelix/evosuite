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

public class Endereco_setId_10389597896 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3126;
     Object term3167;

    public Endereco_setId_10389597896() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3127 = new Long(-1616722610139554082L);
        Long term3141 = new Long(7495904023107549024L);
        term3126 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term3126, term3126.getClass(), "id", term3127);
        setField(term3126, term3126.getClass(), "rua", "NTlKJDDWlk");
        setField(term3126, term3126.getClass(), "numero", term3141);
        setField(term3126, term3126.getClass(), "complemento", "vOuMEpOQAg");
        setField(term3126, term3126.getClass(), "bairro", "SIODFGaQhr");
        term3167 = new Long(8802866251294305945L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Endereco");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term3167;
        callMethod(klass, "setId", argTypes, term3126, args);
    }

};


