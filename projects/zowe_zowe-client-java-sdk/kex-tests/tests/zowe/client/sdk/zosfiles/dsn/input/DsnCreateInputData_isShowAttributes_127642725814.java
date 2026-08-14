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

public class DsnCreateInputData_isShowAttributes_127642725814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7434;

    public DsnCreateInputData_isShowAttributes_127642725814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7483 = new Integer(-1465035361);
        Integer term7485 = new Integer(1090617576);
        Integer term7487 = new Integer(-1547384488);
        Integer term7489 = new Integer(1442160736);
        Integer term7503 = new Integer(1114000454);
        Integer term7505 = new Integer(-556405712);
        term7434 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData"));
        setField(term7434, term7434.getClass(), "volser", "VDokbsCuqq");
        setField(term7434, term7434.getClass(), "unit", "xClUIcPECX");
        setField(term7434, term7434.getClass(), "dsorg", "avhRaGZaBF");
        setField(term7434, term7434.getClass(), "alcunit", "JkgoRtImdE");
        setField(term7434, term7434.getClass(), "primary", term7483);
        setField(term7434, term7434.getClass(), "secondary", term7485);
        setField(term7434, term7434.getClass(), "dirblk", term7487);
        setField(term7434, term7434.getClass(), "avgblk", term7489);
        setField(term7434, term7434.getClass(), "recfm", "qFGKIJjlmV");
        setField(term7434, term7434.getClass(), "blksize", term7503);
        setField(term7434, term7434.getClass(), "lrecl", term7505);
        setField(term7434, term7434.getClass(), "storclass", "IHqvyhMtuM");
        setField(term7434, term7434.getClass(), "mgntclass", "dAldIGYAXV");
        setField(term7434, term7434.getClass(), "dataclass", "mLwibAPEsa");
        setField(term7434, term7434.getClass(), "dsntype", "zsWKWiTFuo");
        setBooleanField(term7434, term7434.getClass(), "showAttributes", false);
        setField(term7434, term7434.getClass(), "size", "UPUbwyHQKN");
        setField(term7434, term7434.getClass(), "responseTimeout", "lgQkrXANyI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isShowAttributes", argTypes, term7434, args);
    }

};


