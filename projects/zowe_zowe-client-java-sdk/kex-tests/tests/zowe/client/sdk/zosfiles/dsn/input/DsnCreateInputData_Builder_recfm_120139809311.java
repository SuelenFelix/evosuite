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

public class DsnCreateInputData_Builder_recfm_120139809311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28590;

    public DsnCreateInputData_Builder_recfm_120139809311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term28639 = new Integer(-507387516);
        Integer term28641 = new Integer(-1970452551);
        Integer term28643 = new Integer(-1896376975);
        Integer term28645 = new Integer(729658803);
        Integer term28659 = new Integer(114754804);
        Integer term28661 = new Integer(1687361082);
        term28590 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder"));
        setField(term28590, term28590.getClass(), "volser", "vXiaNiquft");
        setField(term28590, term28590.getClass(), "unit", "lucCeiVnYe");
        setField(term28590, term28590.getClass(), "dsorg", "iYwkCLMsbJ");
        setField(term28590, term28590.getClass(), "alcunit", "MXLsVQWrwc");
        setField(term28590, term28590.getClass(), "primary", term28639);
        setField(term28590, term28590.getClass(), "secondary", term28641);
        setField(term28590, term28590.getClass(), "dirblk", term28643);
        setField(term28590, term28590.getClass(), "avgblk", term28645);
        setField(term28590, term28590.getClass(), "recfm", "lRaSlqzqNY");
        setField(term28590, term28590.getClass(), "blksize", term28659);
        setField(term28590, term28590.getClass(), "lrecl", term28661);
        setField(term28590, term28590.getClass(), "storclass", "TiEyxWXsra");
        setField(term28590, term28590.getClass(), "mgntclass", "TuLgwTZsPP");
        setField(term28590, term28590.getClass(), "dataclass", "KoasxTJGpx");
        setField(term28590, term28590.getClass(), "dsntype", "ceGeARYMoa");
        setBooleanField(term28590, term28590.getClass(), "showAttributes", false);
        setField(term28590, term28590.getClass(), "size", "fFWllaiFvh");
        setField(term28590, term28590.getClass(), "responseTimeout", "PFTdEDSbvZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TbiwoiebNe";
        callMethod(klass, "recfm", argTypes, term28590, args);
    }

};


