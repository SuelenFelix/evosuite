package zowe.client.sdk.zosjobs.model;

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
import static zowe.client.sdk.zosjobs.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class JobFile_getClasss_15368523423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term504;

    public JobFile_getClasss_15368523423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term541 = new Long(6967924379644551255L);
        Long term543 = new Long(-2813493605142626659L);
        Long term569 = new Long(-8885298608300233488L);
        Long term595 = new Long(-4325723315152823407L);
        term504 = newInstance(Class.forName("zowe.client.sdk.zosjobs.model.JobFile"));
        setField(term504, term504.getClass(), "jobId", "xOEqzGAmDU");
        setField(term504, term504.getClass(), "jobName", "eZFUvlxvGV");
        setField(term504, term504.getClass(), "recfm", "BYqFIqCKAV");
        setField(term504, term504.getClass(), "byteCount", term541);
        setField(term504, term504.getClass(), "recordCount", term543);
        setField(term504, term504.getClass(), "jobCorrelator", "vrQLuWIDJX");
        setField(term504, term504.getClass(), "classs", "flxyYxBRtu");
        setField(term504, term504.getClass(), "id", term569);
        setField(term504, term504.getClass(), "ddName", "OclPbYPkcH");
        setField(term504, term504.getClass(), "recordsUrl", "IoAlmYsBwc");
        setField(term504, term504.getClass(), "lrecl", term595);
        setField(term504, term504.getClass(), "subSystem", "TEParAifyi");
        setField(term504, term504.getClass(), "stepName", "OWDIEULEFu");
        setField(term504, term504.getClass(), "procStep", "dWRymuLBtr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosjobs.model.JobFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClasss", argTypes, term504, args);
    }

};


