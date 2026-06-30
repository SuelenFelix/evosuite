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

public class BeerResponse_canEqual_38049006012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term613;
     Object term644;

    public BeerResponse_canEqual_38049006012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term614 = new Long(6617340557564669657L);
        Long term640 = new Long(1439298019805881866L);
        Long term642 = new Long(-8708192233349544946L);
        term613 = newInstance(Class.forName("pdev.com.agenda.client.response.BeerResponse"));
        setField(term613, term613.getClass(), "id", term614);
        setField(term613, term613.getClass(), "name", "BYqFIqCKAV");
        setField(term613, term613.getClass(), "description", "vrQLuWIDJX");
        setField(term613, term613.getClass(), "abv", term640);
        setField(term613, term613.getClass(), "ibu", term642);
        term644 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.client.response.BeerResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term644;
        callMethod(klass, "canEqual", argTypes, term613, args);
    }

};


