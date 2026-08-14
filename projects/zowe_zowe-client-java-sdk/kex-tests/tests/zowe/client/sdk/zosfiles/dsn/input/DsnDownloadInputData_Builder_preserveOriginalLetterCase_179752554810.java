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
import java.lang.Object;
import java.util.HashMap;
import java.lang.Long;
import java.lang.Boolean;

public class DsnDownloadInputData_Builder_preserveOriginalLetterCase_179752554810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13505;
     Object term13645;

    public DsnDownloadInputData_Builder_preserveOriginalLetterCase_179752554810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term13591 = new HashMap();
        Long term13601 = new Long(-1154553077993834885L);
        Long term13607 = new Long(-2850532706972744550L);
        term13505 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder"));
        Object[] term13542 = (Object[]) newArray("java.lang.String", 4);
        setField(term13505, term13505.getClass(), "file", "QZBHZqZope");
        setField(term13505, term13505.getClass(), "extension", "VBUahCvyxC");
        setField(term13505, term13505.getClass(), "directory", "MlzTkzKMCX");
        setElement(term13542, 0, "UqKUbMyPMJ");
        setElement(term13542, 1, "QpYltHAdyY");
        setElement(term13542, 2, "lbmSGBwIiV");
        setElement(term13542, 3, "DAxyHoTLzZ");
        setField(term13505, term13505.getClass(), "excludePatterns", term13542);
        setField(term13505, term13505.getClass(), "extensionMap", term13591);
        setField(term13505, term13505.getClass(), "maxConcurrentRequests", term13601);
        setBooleanField(term13505, term13505.getClass(), "returnEtag", false);
        setBooleanField(term13505, term13505.getClass(), "preserveOriginalLetterCase", false);
        setBooleanField(term13505, term13505.getClass(), "failFast", false);
        setBooleanField(term13505, term13505.getClass(), "binary", false);
        setField(term13505, term13505.getClass(), "encoding", term13607);
        setField(term13505, term13505.getClass(), "volume", "UiWhvbypdr");
        setField(term13505, term13505.getClass(), "task", "CgleElJNje");
        setField(term13505, term13505.getClass(), "responseTimeout", "ZrchvNGMtd");
        term13645 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term13645;
        callMethod(klass, "preserveOriginalLetterCase", argTypes, term13505, args);
    }

};


