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

public class DsnDownloadInputData_isReturnEtag_126876038712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2925;

    public DsnDownloadInputData_isReturnEtag_126876038712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3023 = new HashMap();
        Long term3033 = new Long(2486810210675247493L);
        Long term3039 = new Long(7009926388951271268L);
        term2925 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData"));
        Object[] term2962 = (Object[]) newArray("java.lang.String", 5);
        setField(term2925, term2925.getClass(), "file", "UfQtPRyWRC");
        setField(term2925, term2925.getClass(), "extension", "FPvxVzzSvD");
        setField(term2925, term2925.getClass(), "directory", "WHcwFgsGFC");
        setElement(term2962, 0, "HzqpegHiRq");
        setElement(term2962, 1, "jwsfVjMoJT");
        setElement(term2962, 2, "ZfdXfCCFDf");
        setElement(term2962, 3, "MwwjNtdOFT");
        setElement(term2962, 4, "VYkqXKVlAJ");
        setField(term2925, term2925.getClass(), "excludePatterns", term2962);
        setField(term2925, term2925.getClass(), "extensionMap", term3023);
        setField(term2925, term2925.getClass(), "maxConcurrentRequests", term3033);
        setBooleanField(term2925, term2925.getClass(), "returnEtag", false);
        setBooleanField(term2925, term2925.getClass(), "preserveOriginalLetterCase", true);
        setBooleanField(term2925, term2925.getClass(), "failFast", false);
        setBooleanField(term2925, term2925.getClass(), "binary", false);
        setField(term2925, term2925.getClass(), "encoding", term3039);
        setField(term2925, term2925.getClass(), "volume", "HHmNoYxIGj");
        setField(term2925, term2925.getClass(), "task", "PtirvZmsGt");
        setField(term2925, term2925.getClass(), "responseTimeout", "HWkpTmtlrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnDownloadInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isReturnEtag", argTypes, term2925, args);
    }

};


