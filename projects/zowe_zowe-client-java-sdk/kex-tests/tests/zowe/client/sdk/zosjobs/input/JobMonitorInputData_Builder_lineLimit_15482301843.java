package zowe.client.sdk.zosjobs.input;

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
import static zowe.client.sdk.zosjobs.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;

public class JobMonitorInputData_Builder_lineLimit_15482301843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1301;
     Object term1342;

    public JobMonitorInputData_Builder_lineLimit_15482301843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1326 = new Integer(-1955890973);
        Class<? extends Object> term1365 = Class.forName((String) "zowe.client.sdk.zosjobs.types.JobStatus$Type");
        Field term1364 = ((Class) term1365).getDeclaredField((String) "OUTPUT");
        ((Field) term1364).setAccessible(true);
        Object enum3 = ((Field) term1364).get((Object) null);
        Integer term1338 = new Integer(-2038273078);
        Integer term1340 = new Integer(1227103734);
        term1301 = newInstance(Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData$Builder"));
        setField(term1301, term1301.getClass(), "jobId", "xOEqzGAmDU");
        setField(term1301, term1301.getClass(), "jobName", "eZFUvlxvGV");
        setField(term1301, term1301.getClass(), "watchDelay", term1326);
        setField(term1301, term1301.getClass(), "jobStatus", enum3);
        setField(term1301, term1301.getClass(), "attempts", term1338);
        setField(term1301, term1301.getClass(), "lineLimit", term1340);
        term1342 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.input.JobMonitorInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1342;
        callMethod(klass, "lineLimit", argTypes, term1301, args);
    }

};


