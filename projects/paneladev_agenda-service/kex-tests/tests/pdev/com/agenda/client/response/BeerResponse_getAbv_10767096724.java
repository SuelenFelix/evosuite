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

public class BeerResponse_getAbv_10767096724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154;

    public BeerResponse_getAbv_10767096724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term155 = new Long(6967924379644551255L);
        Long term181 = new Long(-2813493605142626659L);
        Long term183 = new Long(-8885298608300233488L);
        term154 = newInstance(Class.forName("pdev.com.agenda.client.response.BeerResponse"));
        setField(term154, term154.getClass(), "id", term155);
        setField(term154, term154.getClass(), "name", "SzjVpOQTyS");
        setField(term154, term154.getClass(), "description", "MjGYSRKTNF");
        setField(term154, term154.getClass(), "abv", term181);
        setField(term154, term154.getClass(), "ibu", term183);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.client.response.BeerResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAbv", argTypes, term154, args);
    }

};


