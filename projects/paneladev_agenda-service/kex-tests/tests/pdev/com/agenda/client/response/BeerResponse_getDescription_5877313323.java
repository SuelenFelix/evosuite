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

public class BeerResponse_getDescription_5877313323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103;

    public BeerResponse_getDescription_5877313323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term104 = new Long(4872422362414183754L);
        Long term130 = new Long(6811161968424632369L);
        Long term132 = new Long(-7237588299778557629L);
        term103 = newInstance(Class.forName("pdev.com.agenda.client.response.BeerResponse"));
        setField(term103, term103.getClass(), "id", term104);
        setField(term103, term103.getClass(), "name", "jJCZpVmanW");
        setField(term103, term103.getClass(), "description", "EGtDIRbSSb");
        setField(term103, term103.getClass(), "abv", term130);
        setField(term103, term103.getClass(), "ibu", term132);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.client.response.BeerResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term103, args);
    }

};


