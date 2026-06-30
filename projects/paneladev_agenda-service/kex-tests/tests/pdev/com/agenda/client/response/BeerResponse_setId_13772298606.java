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

public class BeerResponse_setId_13772298606 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256;
     Object term287;

    public BeerResponse_setId_13772298606() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term257 = new Long(-872011222785455006L);
        Long term283 = new Long(-316468845751588286L);
        Long term285 = new Long(5127676408959197577L);
        term256 = newInstance(Class.forName("pdev.com.agenda.client.response.BeerResponse"));
        setField(term256, term256.getClass(), "id", term257);
        setField(term256, term256.getClass(), "name", "NRdvgJlhkX");
        setField(term256, term256.getClass(), "description", "uuaPigETmJ");
        setField(term256, term256.getClass(), "abv", term283);
        setField(term256, term256.getClass(), "ibu", term285);
        term287 = new Long(-6573104506744284592L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.client.response.BeerResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term287;
        callMethod(klass, "setId", argTypes, term256, args);
    }

};


