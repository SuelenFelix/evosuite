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

public class BeerResponse_setDescription_6907821488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term382;

    public BeerResponse_setDescription_6907821488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term383 = new Long(8059786003080744426L);
        Long term409 = new Long(-4365849114644724155L);
        Long term411 = new Long(2486810210675247493L);
        term382 = newInstance(Class.forName("pdev.com.agenda.client.response.BeerResponse"));
        setField(term382, term382.getClass(), "id", term383);
        setField(term382, term382.getClass(), "name", "aJlieCFVtF");
        setField(term382, term382.getClass(), "description", "ZiaGIbnzTs");
        setField(term382, term382.getClass(), "abv", term409);
        setField(term382, term382.getClass(), "ibu", term411);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.client.response.BeerResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tbcdzjIfER";
        callMethod(klass, "setDescription", argTypes, term382, args);
    }

};


