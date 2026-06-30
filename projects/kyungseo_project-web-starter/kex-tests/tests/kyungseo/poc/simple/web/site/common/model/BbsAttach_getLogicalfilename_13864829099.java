package kyungseo.poc.simple.web.site.common.model;

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
import static kyungseo.poc.simple.web.site.common.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BbsAttach_getLogicalfilename_13864829099 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2913;

    public BbsAttach_getLogicalfilename_13864829099() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2913 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term2913, term2913.getClass(), "bbsId", "xJgPlLxpgC");
        setField(term2913, term2913.getClass(), "docNumber", "EYtfuJaxiM");
        setField(term2913, term2913.getClass(), "attSeqno", "gCWtLVKVVe");
        setField(term2913, term2913.getClass(), "fileid", "fWKJoSoCwE");
        setField(term2913, term2913.getClass(), "logicalfilename", "wfaXBpWAUH");
        setField(term2913, term2913.getClass(), "physicalfilename", "VMeAzAHwZj");
        setField(term2913, term2913.getClass(), "filepath", "PznxWXsZME");
        setField(term2913, term2913.getClass(), "filesize", "ZzIujlwVsw");
        setField(term2913, term2913.getClass(), "createdby", "LWyEaeIyAo");
        setField(term2913, term2913.getClass(), "createdate", "yVMkkQhvmN");
        setField(term2913, term2913.getClass(), "modifiedby", "mvrkADEgpp");
        setField(term2913, term2913.getClass(), "modifydate", "pXOkjyeIRb");
        setField(term2913, term2913.getClass(), "version", "GgZWSjxjyE");
        setField(term2913, term2913.getClass(), "fileurl", "EeBVbzjcCI");
        setField(term2913, term2913.getClass(), "ext", "UfQtPRyWRC");
        setField(term2913, term2913.getClass(), "attFilepath", "FPvxVzzSvD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLogicalfilename", argTypes, term2913, args);
    }

};


