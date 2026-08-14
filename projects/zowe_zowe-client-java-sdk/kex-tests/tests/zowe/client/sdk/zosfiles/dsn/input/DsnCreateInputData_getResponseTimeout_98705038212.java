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

public class DsnCreateInputData_getResponseTimeout_98705038212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6922;

    public DsnCreateInputData_getResponseTimeout_98705038212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6971 = new Integer(1540719661);
        Integer term6973 = new Integer(1265463001);
        Integer term6975 = new Integer(335112684);
        Integer term6977 = new Integer(1551099402);
        Integer term6991 = new Integer(-2027534003);
        Integer term6993 = new Integer(1063420942);
        term6922 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData"));
        setField(term6922, term6922.getClass(), "volser", "BbNeQJpYPr");
        setField(term6922, term6922.getClass(), "unit", "riMtzCoxNj");
        setField(term6922, term6922.getClass(), "dsorg", "YAXkVjQZcV");
        setField(term6922, term6922.getClass(), "alcunit", "pumvwBWvpy");
        setField(term6922, term6922.getClass(), "primary", term6971);
        setField(term6922, term6922.getClass(), "secondary", term6973);
        setField(term6922, term6922.getClass(), "dirblk", term6975);
        setField(term6922, term6922.getClass(), "avgblk", term6977);
        setField(term6922, term6922.getClass(), "recfm", "HwLHeGLyhe");
        setField(term6922, term6922.getClass(), "blksize", term6991);
        setField(term6922, term6922.getClass(), "lrecl", term6993);
        setField(term6922, term6922.getClass(), "storclass", "RDnkgWkcbz");
        setField(term6922, term6922.getClass(), "mgntclass", "IBpaxltauX");
        setField(term6922, term6922.getClass(), "dataclass", "hePqROaplw");
        setField(term6922, term6922.getClass(), "dsntype", "PJcSNDruWd");
        setBooleanField(term6922, term6922.getClass(), "showAttributes", true);
        setField(term6922, term6922.getClass(), "size", "VVNNlAePXF");
        setField(term6922, term6922.getClass(), "responseTimeout", "jnwVnmKAFv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResponseTimeout", argTypes, term6922, args);
    }

};


