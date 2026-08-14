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

public class DsnCreateInputData_toString_203504179919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8714;

    public DsnCreateInputData_toString_203504179919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8763 = new Integer(890669485);
        Integer term8765 = new Integer(691577392);
        Integer term8767 = new Integer(-893623680);
        Integer term8769 = new Integer(-1963434938);
        Integer term8783 = new Integer(906181092);
        Integer term8785 = new Integer(1045657203);
        term8714 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData"));
        setField(term8714, term8714.getClass(), "volser", "sOdkipUKRu");
        setField(term8714, term8714.getClass(), "unit", "oKwCDqywym");
        setField(term8714, term8714.getClass(), "dsorg", "zjZYTddemL");
        setField(term8714, term8714.getClass(), "alcunit", "QtrylgCLiF");
        setField(term8714, term8714.getClass(), "primary", term8763);
        setField(term8714, term8714.getClass(), "secondary", term8765);
        setField(term8714, term8714.getClass(), "dirblk", term8767);
        setField(term8714, term8714.getClass(), "avgblk", term8769);
        setField(term8714, term8714.getClass(), "recfm", "orEuhCStGM");
        setField(term8714, term8714.getClass(), "blksize", term8783);
        setField(term8714, term8714.getClass(), "lrecl", term8785);
        setField(term8714, term8714.getClass(), "storclass", "HhEaSXWvrY");
        setField(term8714, term8714.getClass(), "mgntclass", "CVRGEomOth");
        setField(term8714, term8714.getClass(), "dataclass", "vSeruUyNWX");
        setField(term8714, term8714.getClass(), "dsntype", "UkKvaeJfEC");
        setBooleanField(term8714, term8714.getClass(), "showAttributes", false);
        setField(term8714, term8714.getClass(), "size", "WPxXsahPRq");
        setField(term8714, term8714.getClass(), "responseTimeout", "IENRuqmwUU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term8714, args);
    }

};


