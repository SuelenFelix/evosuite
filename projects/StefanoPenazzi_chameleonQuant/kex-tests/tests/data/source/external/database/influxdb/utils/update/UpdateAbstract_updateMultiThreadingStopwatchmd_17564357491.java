package data.source.external.database.influxdb.utils.update;

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
import static data.source.external.database.influxdb.utils.update.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Integer;

public class UpdateAbstract_updateMultiThreadingStopwatchmd_17564357491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281;
     Object term338;
     Object term340;
     Object term342;

    public UpdateAbstract_updateMultiThreadingStopwatchmd_17564357491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281 = new LinkedList();
        ((LinkedList) term281).add("MxlszYVzRf");
        ((LinkedList) term281).add("LQFpaHEwXR");
        ((LinkedList) term281).add("");
        ((LinkedList) term281).add((Object)null);
        ((LinkedList) term281).add((Object)null);
        term338 = new Integer(-616727354);
        term340 = new Integer(-1955890973);
        term342 = new Integer(-2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.utils.update.UpdateAbstract");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = term281;
        args[1] = "tbcdzjIfER";
        args[2] = term338;
        args[3] = term340;
        args[4] = term342;
        callMethod(klass, "updateMultiThreadingStopwatch_m_d", argTypes, null, args);
    }

};


