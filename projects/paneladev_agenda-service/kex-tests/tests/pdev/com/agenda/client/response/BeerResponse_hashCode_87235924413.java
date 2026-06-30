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

public class BeerResponse_hashCode_87235924413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term665;

    public BeerResponse_hashCode_87235924413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term666 = new Long(5907001541142728739L);
        Long term692 = new Long(4178434741742309755L);
        Long term694 = new Long(-2068172595987555756L);
        term665 = newInstance(Class.forName("pdev.com.agenda.client.response.BeerResponse"));
        setField(term665, term665.getClass(), "id", term666);
        setField(term665, term665.getClass(), "name", "flxyYxBRtu");
        setField(term665, term665.getClass(), "description", "OclPbYPkcH");
        setField(term665, term665.getClass(), "abv", term692);
        setField(term665, term665.getClass(), "ibu", term694);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.client.response.BeerResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term665, args);
    }

};


