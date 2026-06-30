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

public class BeerResponse_getName_17800906232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52;

    public BeerResponse_getName_17800906232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term53 = new Long(-8400487765614892086L);
        Long term79 = new Long(5270370404989704783L);
        Long term81 = new Long(7411271909051562686L);
        term52 = newInstance(Class.forName("pdev.com.agenda.client.response.BeerResponse"));
        setField(term52, term52.getClass(), "id", term53);
        setField(term52, term52.getClass(), "name", "MuLcgQHgqz");
        setField(term52, term52.getClass(), "description", "xxtlPwDYFs");
        setField(term52, term52.getClass(), "abv", term79);
        setField(term52, term52.getClass(), "ibu", term81);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.client.response.BeerResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term52, args);
    }

};


