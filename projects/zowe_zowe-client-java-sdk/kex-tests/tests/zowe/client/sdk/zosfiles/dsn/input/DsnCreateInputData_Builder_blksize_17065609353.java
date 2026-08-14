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

public class DsnCreateInputData_Builder_blksize_17065609353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26446;
     Object term26592;

    public DsnCreateInputData_Builder_blksize_17065609353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term26495 = new Integer(-343325701);
        Integer term26497 = new Integer(107945604);
        Integer term26499 = new Integer(-1963464809);
        Integer term26501 = new Integer(71190297);
        Integer term26515 = new Integer(1202361360);
        Integer term26517 = new Integer(-2015048153);
        term26446 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder"));
        setField(term26446, term26446.getClass(), "volser", "stVcZLTNpu");
        setField(term26446, term26446.getClass(), "unit", "LgXdqWrsLL");
        setField(term26446, term26446.getClass(), "dsorg", "bbHWyibNmy");
        setField(term26446, term26446.getClass(), "alcunit", "vYYOYhWMWZ");
        setField(term26446, term26446.getClass(), "primary", term26495);
        setField(term26446, term26446.getClass(), "secondary", term26497);
        setField(term26446, term26446.getClass(), "dirblk", term26499);
        setField(term26446, term26446.getClass(), "avgblk", term26501);
        setField(term26446, term26446.getClass(), "recfm", "FLQJOzEXff");
        setField(term26446, term26446.getClass(), "blksize", term26515);
        setField(term26446, term26446.getClass(), "lrecl", term26517);
        setField(term26446, term26446.getClass(), "storclass", "qlaIVJBSfQ");
        setField(term26446, term26446.getClass(), "mgntclass", "lYvIWBFFsq");
        setField(term26446, term26446.getClass(), "dataclass", "tThwsqWKcE");
        setField(term26446, term26446.getClass(), "dsntype", "bkSgsDrkCN");
        setBooleanField(term26446, term26446.getClass(), "showAttributes", false);
        setField(term26446, term26446.getClass(), "size", "hwjlcimgJH");
        setField(term26446, term26446.getClass(), "responseTimeout", "TLxQzxvizR");
        term26592 = new Integer(-2063457669);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term26592;
        callMethod(klass, "blksize", argTypes, term26446, args);
    }

};


