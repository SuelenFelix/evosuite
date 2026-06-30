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

public class BeerResponse_setAbv_19745541269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term455;
     Object term486;

    public BeerResponse_setAbv_19745541269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term456 = new Long(7009926388951271268L);
        Long term482 = new Long(-7672528020740371001L);
        Long term484 = new Long(-4502405999831680926L);
        term455 = newInstance(Class.forName("pdev.com.agenda.client.response.BeerResponse"));
        setField(term455, term455.getClass(), "id", term456);
        setField(term455, term455.getClass(), "name", "HyxfbSQYBe");
        setField(term455, term455.getClass(), "description", "pCTimMblYc");
        setField(term455, term455.getClass(), "abv", term482);
        setField(term455, term455.getClass(), "ibu", term484);
        term486 = new Long(1967728129628047933L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.client.response.BeerResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term486;
        callMethod(klass, "setAbv", argTypes, term455, args);
    }

};


