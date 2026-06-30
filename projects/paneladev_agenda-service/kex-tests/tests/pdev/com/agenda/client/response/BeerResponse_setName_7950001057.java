package pdev.com.agenda.client.response;

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
import static pdev.com.agenda.client.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class BeerResponse_setName_7950001057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309;

    public BeerResponse_setName_7950001057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term310 = new Long(-4920224193275732920L);
        Long term336 = new Long(8428634514691209827L);
        Long term338 = new Long(-2585684163342970173L);
        term309 = newInstance(Class.forName("pdev.com.agenda.client.response.BeerResponse"));
        setField(term309, term309.getClass(), "id", term310);
        setField(term309, term309.getClass(), "name", "MxlszYVzRf");
        setField(term309, term309.getClass(), "description", "LQFpaHEwXR");
        setField(term309, term309.getClass(), "abv", term336);
        setField(term309, term309.getClass(), "ibu", term338);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.client.response.BeerResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oVcInYnLWB";
        callMethod(klass, "setName", argTypes, term309, args);
    }

};


