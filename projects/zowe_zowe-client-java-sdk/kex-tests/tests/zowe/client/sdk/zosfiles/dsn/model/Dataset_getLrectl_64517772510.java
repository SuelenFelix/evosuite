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

public class Dataset_getLrectl_64517772510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6512;

    public Dataset_getLrectl_64517772510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6512 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset"));
        setField(term6512, term6512.getClass(), "dsname", "zNdorvdUgu");
        setField(term6512, term6512.getClass(), "blksz", "oPxuZbkYio");
        setField(term6512, term6512.getClass(), "catnm", "vKitydDVnM");
        setField(term6512, term6512.getClass(), "cdate", "urCiQnUFBM");
        setField(term6512, term6512.getClass(), "dev", "EKjQdtKxAM");
        setField(term6512, term6512.getClass(), "dsntp", "TXZAIPQJHt");
        setField(term6512, term6512.getClass(), "dsorg", "DIbeDHICho");
        setField(term6512, term6512.getClass(), "edate", "dJGPlmSRnz");
        setField(term6512, term6512.getClass(), "extx", "DPskuFUobI");
        setField(term6512, term6512.getClass(), "lrectl", "wBGfLpNNiZ");
        setField(term6512, term6512.getClass(), "migr", "yUGCjlqgJE");
        setField(term6512, term6512.getClass(), "mvol", "PXdVZyoJyC");
        setField(term6512, term6512.getClass(), "ovf", "vLerpqavFM");
        setField(term6512, term6512.getClass(), "rdate", "qnvxzwuGKX");
        setField(term6512, term6512.getClass(), "recfm", "EdPAvpluZg");
        setField(term6512, term6512.getClass(), "sizex", "DzHVBMqWtE");
        setField(term6512, term6512.getClass(), "spacu", "THZSpzBRYP");
        setField(term6512, term6512.getClass(), "used", "ZfBIVGBQOE");
        setField(term6512, term6512.getClass(), "vol", "QSrDQfEsTR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLrectl", argTypes, term6512, args);
    }

};


