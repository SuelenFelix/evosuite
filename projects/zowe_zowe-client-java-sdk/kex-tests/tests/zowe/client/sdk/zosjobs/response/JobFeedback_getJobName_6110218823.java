package zowe.client.sdk.zosjobs.response;

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
import static zowe.client.sdk.zosjobs.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JobFeedback_getJobName_6110218823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term464;

    public JobFeedback_getJobName_6110218823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term464 = newInstance(Class.forName("zowe.client.sdk.zosjobs.response.JobFeedback"));
        setField(term464, term464.getClass(), "jobId", "RkybSrpybU");
        setField(term464, term464.getClass(), "jobName", "xOEqzGAmDU");
        setField(term464, term464.getClass(), "originalJobId", "eZFUvlxvGV");
        setField(term464, term464.getClass(), "owner", "BYqFIqCKAV");
        setField(term464, term464.getClass(), "member", "vrQLuWIDJX");
        setField(term464, term464.getClass(), "sysname", "flxyYxBRtu");
        setField(term464, term464.getClass(), "jobCorrelator", "OclPbYPkcH");
        setField(term464, term464.getClass(), "status", "IoAlmYsBwc");
        setField(term464, term464.getClass(), "internalCode", "TEParAifyi");
        setField(term464, term464.getClass(), "message", "OWDIEULEFu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.response.JobFeedback");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobName", argTypes, term464, args);
    }

};


