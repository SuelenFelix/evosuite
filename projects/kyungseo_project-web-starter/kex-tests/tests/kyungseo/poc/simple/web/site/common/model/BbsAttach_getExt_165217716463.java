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

public class BbsAttach_getExt_165217716463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12030;

    public BbsAttach_getExt_165217716463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12030 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term12030, term12030.getClass(), "bbsId", null);
        setField(term12030, term12030.getClass(), "docNumber", null);
        setField(term12030, term12030.getClass(), "attSeqno", null);
        setField(term12030, term12030.getClass(), "fileid", null);
        setField(term12030, term12030.getClass(), "logicalfilename", null);
        setField(term12030, term12030.getClass(), "physicalfilename", null);
        setField(term12030, term12030.getClass(), "filepath", null);
        setField(term12030, term12030.getClass(), "filesize", null);
        setField(term12030, term12030.getClass(), "createdby", null);
        setField(term12030, term12030.getClass(), "createdate", null);
        setField(term12030, term12030.getClass(), "modifiedby", null);
        setField(term12030, term12030.getClass(), "modifydate", null);
        setField(term12030, term12030.getClass(), "version", null);
        setField(term12030, term12030.getClass(), "fileurl", null);
        setField(term12030, term12030.getClass(), "ext", null);
        setField(term12030, term12030.getClass(), "attFilepath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt", argTypes, term12030, args);
    }

};


