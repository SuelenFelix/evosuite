package kyungseo.poc.simple.web.appcore.dto.response.temp;

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
import static kyungseo.poc.simple.web.appcore.dto.response.temp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class ServerResponse_setStatus_200424407611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4565;
     Object term4581;

    public ServerResponse_setStatus_200424407611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4566 = new Integer(-616727354);
        term4565 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.temp.ServerResponse"));
        Object term4580 = newInstance(Class.forName("java.lang.Object"));
        setField(term4565, term4565.getClass(), "status", term4566);
        setField(term4565, term4565.getClass(), "msg", "NRdvgJlhkX");
        setField(term4565, term4565.getClass(), "data", term4580);
        term4581 = new Integer(-1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.temp.ServerResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term4581;
        callMethod(klass, "setStatus", argTypes, term4565, args);
    }

};


