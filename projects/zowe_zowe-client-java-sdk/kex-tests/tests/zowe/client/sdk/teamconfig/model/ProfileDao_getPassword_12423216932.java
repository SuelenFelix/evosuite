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
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;

public class ProfileDao_getPassword_12423216932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2317;

    public ProfileDao_getPassword_12423216932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2343 = new HashMap();
        ArrayList term2351 = new ArrayList();
        ((ArrayList) term2351).add("");
        ((ArrayList) term2351).add("");
        ((ArrayList) term2351).add("");
        ((ArrayList) term2351).add("");
        ((ArrayList) term2351).add("");
        term2317 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.ProfileDao"));
        Object term2318 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term2318, term2318.getClass(), "name", "uyLBVQYcOV");
        setField(term2318, term2318.getClass(), "type", "PoTZjDuBHa");
        setField(term2318, term2318.getClass(), "properties", term2343);
        setField(term2318, term2318.getClass(), "secure", term2351);
        setField(term2317, term2317.getClass(), "profile", term2318);
        setField(term2317, term2317.getClass(), "user", "kwteHWzwcc");
        setField(term2317, term2317.getClass(), "password", "uMsWXqNhln");
        setField(term2317, term2317.getClass(), "host", "MAnhIPOtHL");
        setField(term2317, term2317.getClass(), "port", "dikKjYjmRO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.model.ProfileDao");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term2317, args);
    }

};


