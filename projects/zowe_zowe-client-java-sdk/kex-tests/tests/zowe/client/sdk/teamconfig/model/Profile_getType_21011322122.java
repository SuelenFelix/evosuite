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

public class Profile_getType_21011322122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term361;

    public Profile_getType_21011322122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term386 = new HashMap();
        ArrayList term396 = new ArrayList();
        ((ArrayList) term396).add("OWDIEULEFu");
        ((ArrayList) term396).add("dWRymuLBtr");
        ((ArrayList) term396).add("AijpHYOFuy");
        term361 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term361, term361.getClass(), "name", "flxyYxBRtu");
        setField(term361, term361.getClass(), "type", "OclPbYPkcH");
        setField(term361, term361.getClass(), "properties", term386);
        setField(term361, term361.getClass(), "secure", term396);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.model.Profile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term361, args);
    }

};


