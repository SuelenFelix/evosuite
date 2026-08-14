package net.vrfun.homiecenter.fritzbox;

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
import static net.vrfun.homiecenter.fritzbox.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ResponseHandlerDeviceStats_setupModel_10641812833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11023;

    public ResponseHandlerDeviceStats_setupModel_10641812833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11023 = newInstance(Class.forName("net.vrfun.homiecenter.fritzbox.ResponseHandlerDeviceStats"));
        setField(term11023, term11023.getClass(), "LOGGER", null);
        setBooleanField(term11023, term11023.getClass(), "useCaseSensitiveNames", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.fritzbox.ResponseHandlerDeviceStats");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        argTypes[1] = Class.forName("net.vrfun.homiecenter.model.DeviceStats");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "setupModel", argTypes, term11023, args);
    }

};


