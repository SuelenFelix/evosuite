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

public class DsnCreateInputData_getMgntclass_16925088429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6154;

    public DsnCreateInputData_getMgntclass_16925088429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6203 = new Integer(-1048298087);
        Integer term6205 = new Integer(292681826);
        Integer term6207 = new Integer(458147407);
        Integer term6209 = new Integer(-184153539);
        Integer term6223 = new Integer(493620644);
        Integer term6225 = new Integer(1328271830);
        term6154 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData"));
        setField(term6154, term6154.getClass(), "volser", "zNdorvdUgu");
        setField(term6154, term6154.getClass(), "unit", "oPxuZbkYio");
        setField(term6154, term6154.getClass(), "dsorg", "vKitydDVnM");
        setField(term6154, term6154.getClass(), "alcunit", "urCiQnUFBM");
        setField(term6154, term6154.getClass(), "primary", term6203);
        setField(term6154, term6154.getClass(), "secondary", term6205);
        setField(term6154, term6154.getClass(), "dirblk", term6207);
        setField(term6154, term6154.getClass(), "avgblk", term6209);
        setField(term6154, term6154.getClass(), "recfm", "EKjQdtKxAM");
        setField(term6154, term6154.getClass(), "blksize", term6223);
        setField(term6154, term6154.getClass(), "lrecl", term6225);
        setField(term6154, term6154.getClass(), "storclass", "TXZAIPQJHt");
        setField(term6154, term6154.getClass(), "mgntclass", "DIbeDHICho");
        setField(term6154, term6154.getClass(), "dataclass", "dJGPlmSRnz");
        setField(term6154, term6154.getClass(), "dsntype", "DPskuFUobI");
        setBooleanField(term6154, term6154.getClass(), "showAttributes", false);
        setField(term6154, term6154.getClass(), "size", "wBGfLpNNiZ");
        setField(term6154, term6154.getClass(), "responseTimeout", "yUGCjlqgJE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMgntclass", argTypes, term6154, args);
    }

};


