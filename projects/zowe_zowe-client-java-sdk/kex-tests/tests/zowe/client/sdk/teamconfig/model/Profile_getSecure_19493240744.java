package zowe.client.sdk.teamconfig.model;

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
import static zowe.client.sdk.teamconfig.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.ArrayList;

public class Profile_getSecure_19493240744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term633;

    public Profile_getSecure_19493240744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term658 = new HashMap();
        ArrayList term668 = new ArrayList();
        ((ArrayList) term668).add("GzFkzHGYFt");
        term633 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term633, term633.getClass(), "name", "UlajhuVLaP");
        setField(term633, term633.getClass(), "type", "gGSMzuGICf");
        setField(term633, term633.getClass(), "properties", term658);
        setField(term633, term633.getClass(), "secure", term668);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.model.Profile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSecure", argTypes, term633, args);
    }

};


