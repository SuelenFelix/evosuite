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

public class ProfileDao_getProfile_9221494084 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2623;

    public ProfileDao_getProfile_9221494084() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2649 = new HashMap();
        ArrayList term2657 = new ArrayList();
        ((ArrayList) term2657).add("");
        ((ArrayList) term2657).add("");
        term2623 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.ProfileDao"));
        Object term2624 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term2624, term2624.getClass(), "name", "pLvkKHqNYX");
        setField(term2624, term2624.getClass(), "type", "PwqnuJJwjR");
        setField(term2624, term2624.getClass(), "properties", term2649);
        setField(term2624, term2624.getClass(), "secure", term2657);
        setField(term2623, term2623.getClass(), "profile", term2624);
        setField(term2623, term2623.getClass(), "user", "cxRwRcodud");
        setField(term2623, term2623.getClass(), "password", "GDGBPlYeLn");
        setField(term2623, term2623.getClass(), "host", "jdQANIXSTq");
        setField(term2623, term2623.getClass(), "port", "stVcZLTNpu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.model.ProfileDao");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProfile", argTypes, term2623, args);
    }

};


