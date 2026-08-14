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

public class ProfileDao_getPort_15232480553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2468;

    public ProfileDao_getPort_15232480553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2494 = new HashMap();
        ArrayList term2502 = new ArrayList();
        ((ArrayList) term2502).add("");
        ((ArrayList) term2502).add("");
        ((ArrayList) term2502).add("");
        ((ArrayList) term2502).add("");
        ((ArrayList) term2502).add("");
        ((ArrayList) term2502).add("");
        ((ArrayList) term2502).add("");
        ((ArrayList) term2502).add("");
        ((ArrayList) term2502).add("");
        term2468 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.ProfileDao"));
        Object term2469 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term2469, term2469.getClass(), "name", "GJnnMDVnEP");
        setField(term2469, term2469.getClass(), "type", "zSMVllDpfk");
        setField(term2469, term2469.getClass(), "properties", term2494);
        setField(term2469, term2469.getClass(), "secure", term2502);
        setField(term2468, term2468.getClass(), "profile", term2469);
        setField(term2468, term2468.getClass(), "user", "YaDWphDOSz");
        setField(term2468, term2468.getClass(), "password", "nnnmCgFBLw");
        setField(term2468, term2468.getClass(), "host", "hSSCyNEhyH");
        setField(term2468, term2468.getClass(), "port", "jDFNSuvZqm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.model.ProfileDao");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPort", argTypes, term2468, args);
    }

};


