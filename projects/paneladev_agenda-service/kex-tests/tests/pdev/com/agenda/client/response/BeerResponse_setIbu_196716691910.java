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

public class BeerResponse_setIbu_196716691910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term508;
     Object term539;

    public BeerResponse_setIbu_196716691910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term509 = new Long(2120084523938730454L);
        Long term535 = new Long(6855071767938501807L);
        Long term537 = new Long(-5892135042702373494L);
        term508 = newInstance(Class.forName("pdev.com.agenda.client.response.BeerResponse"));
        setField(term508, term508.getClass(), "id", term509);
        setField(term508, term508.getClass(), "name", "hNxWaHcfhY");
        setField(term508, term508.getClass(), "description", "RkybSrpybU");
        setField(term508, term508.getClass(), "abv", term535);
        setField(term508, term508.getClass(), "ibu", term537);
        term539 = new Long(5262507301787091109L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.client.response.BeerResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term539;
        callMethod(klass, "setIbu", argTypes, term508, args);
    }

};


