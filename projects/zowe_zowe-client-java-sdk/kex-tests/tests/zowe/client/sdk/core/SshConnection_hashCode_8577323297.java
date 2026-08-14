package zowe.client.sdk.core;

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
import static zowe.client.sdk.core.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SshConnection_hashCode_8577323297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term478;

    public SshConnection_hashCode_8577323297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term478 = newInstance(Class.forName("zowe.client.sdk.core.SshConnection"));
        setField(term478, term478.getClass(), "host", "RkybSrpybU");
        setIntField(term478, term478.getClass(), "port", -2038273078);
        setField(term478, term478.getClass(), "user", "xOEqzGAmDU");
        setField(term478, term478.getClass(), "password", "eZFUvlxvGV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.core.SshConnection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term478, args);
    }

};


