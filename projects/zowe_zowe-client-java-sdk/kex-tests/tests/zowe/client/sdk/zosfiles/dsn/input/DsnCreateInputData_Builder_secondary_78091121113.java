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

public class DsnCreateInputData_Builder_secondary_78091121113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29146;
     Object term29292;

    public DsnCreateInputData_Builder_secondary_78091121113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term29195 = new Integer(-1945706126);
        Integer term29197 = new Integer(1152356969);
        Integer term29199 = new Integer(-1667990367);
        Integer term29201 = new Integer(-1214628358);
        Integer term29215 = new Integer(1102721075);
        Integer term29217 = new Integer(-426764678);
        term29146 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder"));
        setField(term29146, term29146.getClass(), "volser", "LHnkeoNwHq");
        setField(term29146, term29146.getClass(), "unit", "gVnDVbSyKa");
        setField(term29146, term29146.getClass(), "dsorg", "kdCYNMSuoD");
        setField(term29146, term29146.getClass(), "alcunit", "eRYlSLwtvV");
        setField(term29146, term29146.getClass(), "primary", term29195);
        setField(term29146, term29146.getClass(), "secondary", term29197);
        setField(term29146, term29146.getClass(), "dirblk", term29199);
        setField(term29146, term29146.getClass(), "avgblk", term29201);
        setField(term29146, term29146.getClass(), "recfm", "duOyJsARTD");
        setField(term29146, term29146.getClass(), "blksize", term29215);
        setField(term29146, term29146.getClass(), "lrecl", term29217);
        setField(term29146, term29146.getClass(), "storclass", "xPnOHsNlyc");
        setField(term29146, term29146.getClass(), "mgntclass", "OTSPWPJefj");
        setField(term29146, term29146.getClass(), "dataclass", "EOTYMqXRmE");
        setField(term29146, term29146.getClass(), "dsntype", "iTxNduwSjE");
        setBooleanField(term29146, term29146.getClass(), "showAttributes", true);
        setField(term29146, term29146.getClass(), "size", "MQUTfIiFnh");
        setField(term29146, term29146.getClass(), "responseTimeout", "JeyKRznnft");
        term29292 = new Integer(-1222614956);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term29292;
        callMethod(klass, "secondary", argTypes, term29146, args);
    }

};


