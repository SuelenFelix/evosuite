package zowe.client.sdk.zosfiles.dsn.input;

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
import static zowe.client.sdk.zosfiles.dsn.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class DsnCreateInputData_getSecondary_160355963713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7178;

    public DsnCreateInputData_getSecondary_160355963713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7227 = new Integer(1375330971);
        Integer term7229 = new Integer(-478195677);
        Integer term7231 = new Integer(972867650);
        Integer term7233 = new Integer(1655935355);
        Integer term7247 = new Integer(-481533957);
        Integer term7249 = new Integer(1240914516);
        term7178 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData"));
        setField(term7178, term7178.getClass(), "volser", "TXyHhqeCjR");
        setField(term7178, term7178.getClass(), "unit", "lZIgPZPgTu");
        setField(term7178, term7178.getClass(), "dsorg", "iuCxnHGMoW");
        setField(term7178, term7178.getClass(), "alcunit", "GPSEWEDSTo");
        setField(term7178, term7178.getClass(), "primary", term7227);
        setField(term7178, term7178.getClass(), "secondary", term7229);
        setField(term7178, term7178.getClass(), "dirblk", term7231);
        setField(term7178, term7178.getClass(), "avgblk", term7233);
        setField(term7178, term7178.getClass(), "recfm", "RCOqfVsRHt");
        setField(term7178, term7178.getClass(), "blksize", term7247);
        setField(term7178, term7178.getClass(), "lrecl", term7249);
        setField(term7178, term7178.getClass(), "storclass", "TSyCeEZPaT");
        setField(term7178, term7178.getClass(), "mgntclass", "JeZFtaqkzW");
        setField(term7178, term7178.getClass(), "dataclass", "vOVuNSCCLe");
        setField(term7178, term7178.getClass(), "dsntype", "fzeqPnzpnt");
        setBooleanField(term7178, term7178.getClass(), "showAttributes", false);
        setField(term7178, term7178.getClass(), "size", "RxbhrFBjkO");
        setField(term7178, term7178.getClass(), "responseTimeout", "aanyiAOJCl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSecondary", argTypes, term7178, args);
    }

};


