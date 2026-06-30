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

public class BeerResponse_getIbu_10840968795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205;

    public BeerResponse_getIbu_10840968795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term206 = new Long(-4325723315152823407L);
        Long term232 = new Long(2535595959091595249L);
        Long term234 = new Long(-5476826692763582090L);
        term205 = newInstance(Class.forName("pdev.com.agenda.client.response.BeerResponse"));
        setField(term205, term205.getClass(), "id", term206);
        setField(term205, term205.getClass(), "name", "hRNSzYYIrc");
        setField(term205, term205.getClass(), "description", "RMFIsYGgne");
        setField(term205, term205.getClass(), "abv", term232);
        setField(term205, term205.getClass(), "ibu", term234);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.client.response.BeerResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIbu", argTypes, term205, args);
    }

};


