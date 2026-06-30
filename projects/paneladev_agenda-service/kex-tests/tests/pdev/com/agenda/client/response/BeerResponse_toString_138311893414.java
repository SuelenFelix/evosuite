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

public class BeerResponse_toString_138311893414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term716;

    public BeerResponse_toString_138311893414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term717 = new Long(-6292278961887936280L);
        Long term743 = new Long(-6645965768855543712L);
        Long term745 = new Long(4784595517102746672L);
        term716 = newInstance(Class.forName("pdev.com.agenda.client.response.BeerResponse"));
        setField(term716, term716.getClass(), "id", term717);
        setField(term716, term716.getClass(), "name", "IoAlmYsBwc");
        setField(term716, term716.getClass(), "description", "TEParAifyi");
        setField(term716, term716.getClass(), "abv", term743);
        setField(term716, term716.getClass(), "ibu", term745);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.client.response.BeerResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term716, args);
    }

};


