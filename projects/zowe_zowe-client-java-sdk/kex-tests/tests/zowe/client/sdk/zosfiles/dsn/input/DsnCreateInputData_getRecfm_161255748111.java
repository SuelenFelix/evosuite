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

public class DsnCreateInputData_getRecfm_161255748111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6666;

    public DsnCreateInputData_getRecfm_161255748111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6715 = new Integer(-1588772968);
        Integer term6717 = new Integer(-93135961);
        Integer term6719 = new Integer(-112921587);
        Integer term6721 = new Integer(933028652);
        Integer term6735 = new Integer(287287233);
        Integer term6737 = new Integer(962840079);
        term6666 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData"));
        setField(term6666, term6666.getClass(), "volser", "WxYUTuqmIq");
        setField(term6666, term6666.getClass(), "unit", "OeQLvhVERT");
        setField(term6666, term6666.getClass(), "dsorg", "IlvgFINwIa");
        setField(term6666, term6666.getClass(), "alcunit", "GEJABPlHSI");
        setField(term6666, term6666.getClass(), "primary", term6715);
        setField(term6666, term6666.getClass(), "secondary", term6717);
        setField(term6666, term6666.getClass(), "dirblk", term6719);
        setField(term6666, term6666.getClass(), "avgblk", term6721);
        setField(term6666, term6666.getClass(), "recfm", "aQFUvuaYxd");
        setField(term6666, term6666.getClass(), "blksize", term6735);
        setField(term6666, term6666.getClass(), "lrecl", term6737);
        setField(term6666, term6666.getClass(), "storclass", "zNFLXMifnS");
        setField(term6666, term6666.getClass(), "mgntclass", "HHQcYMSBVc");
        setField(term6666, term6666.getClass(), "dataclass", "wdoqITnaAP");
        setField(term6666, term6666.getClass(), "dsntype", "rIPMBcrNqB");
        setBooleanField(term6666, term6666.getClass(), "showAttributes", false);
        setField(term6666, term6666.getClass(), "size", "UDaboHZHhz");
        setField(term6666, term6666.getClass(), "responseTimeout", "nRvKihUSPj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRecfm", argTypes, term6666, args);
    }

};


