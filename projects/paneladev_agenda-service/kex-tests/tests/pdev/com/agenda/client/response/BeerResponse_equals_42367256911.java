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

public class BeerResponse_equals_42367256911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term561;
     Object term592;

    public BeerResponse_equals_42367256911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term562 = new Long(-6823727938421990489L);
        Long term588 = new Long(-484994522244390100L);
        Long term590 = new Long(1233889271256172047L);
        term561 = newInstance(Class.forName("pdev.com.agenda.client.response.BeerResponse"));
        setField(term561, term561.getClass(), "id", term562);
        setField(term561, term561.getClass(), "name", "xOEqzGAmDU");
        setField(term561, term561.getClass(), "description", "eZFUvlxvGV");
        setField(term561, term561.getClass(), "abv", term588);
        setField(term561, term561.getClass(), "ibu", term590);
        term592 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.client.response.BeerResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term592;
        callMethod(klass, "equals", argTypes, term561, args);
    }

};


