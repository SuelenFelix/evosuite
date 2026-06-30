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

public class BeerResponse_getIbu_108409687920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term771;

    public BeerResponse_getIbu_108409687920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term771 = newInstance(Class.forName("pdev.com.agenda.client.response.BeerResponse"));
        setField(term771, term771.getClass(), "id", null);
        setField(term771, term771.getClass(), "name", null);
        setField(term771, term771.getClass(), "description", null);
        setField(term771, term771.getClass(), "abv", null);
        setField(term771, term771.getClass(), "ibu", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.client.response.BeerResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIbu", argTypes, term771, args);
    }

};


