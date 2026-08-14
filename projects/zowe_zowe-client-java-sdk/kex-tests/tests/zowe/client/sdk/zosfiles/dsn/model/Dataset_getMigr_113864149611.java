package zowe.client.sdk.zosfiles.dsn.model;

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
import static zowe.client.sdk.zosfiles.dsn.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Dataset_getMigr_113864149611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6931;

    public Dataset_getMigr_113864149611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6931 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset"));
        setField(term6931, term6931.getClass(), "dsname", "PsqusYmejD");
        setField(term6931, term6931.getClass(), "blksz", "NTWMiBEaDF");
        setField(term6931, term6931.getClass(), "catnm", "SPBstwKFVr");
        setField(term6931, term6931.getClass(), "cdate", "WxYUTuqmIq");
        setField(term6931, term6931.getClass(), "dev", "OeQLvhVERT");
        setField(term6931, term6931.getClass(), "dsntp", "IlvgFINwIa");
        setField(term6931, term6931.getClass(), "dsorg", "GEJABPlHSI");
        setField(term6931, term6931.getClass(), "edate", "aQFUvuaYxd");
        setField(term6931, term6931.getClass(), "extx", "zNFLXMifnS");
        setField(term6931, term6931.getClass(), "lrectl", "HHQcYMSBVc");
        setField(term6931, term6931.getClass(), "migr", "wdoqITnaAP");
        setField(term6931, term6931.getClass(), "mvol", "rIPMBcrNqB");
        setField(term6931, term6931.getClass(), "ovf", "UDaboHZHhz");
        setField(term6931, term6931.getClass(), "rdate", "nRvKihUSPj");
        setField(term6931, term6931.getClass(), "recfm", "BbNeQJpYPr");
        setField(term6931, term6931.getClass(), "sizex", "riMtzCoxNj");
        setField(term6931, term6931.getClass(), "spacu", "YAXkVjQZcV");
        setField(term6931, term6931.getClass(), "used", "pumvwBWvpy");
        setField(term6931, term6931.getClass(), "vol", "HwLHeGLyhe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMigr", argTypes, term6931, args);
    }

};


