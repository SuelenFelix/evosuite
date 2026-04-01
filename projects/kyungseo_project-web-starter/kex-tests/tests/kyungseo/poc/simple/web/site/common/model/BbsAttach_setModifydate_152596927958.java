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

public class BbsAttach_setModifydate_152596927958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12025;

    public BbsAttach_setModifydate_152596927958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12025 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term12025, term12025.getClass(), "bbsId", null);
        setField(term12025, term12025.getClass(), "docNumber", null);
        setField(term12025, term12025.getClass(), "attSeqno", null);
        setField(term12025, term12025.getClass(), "fileid", null);
        setField(term12025, term12025.getClass(), "logicalfilename", null);
        setField(term12025, term12025.getClass(), "physicalfilename", null);
        setField(term12025, term12025.getClass(), "filepath", null);
        setField(term12025, term12025.getClass(), "filesize", null);
        setField(term12025, term12025.getClass(), "createdby", null);
        setField(term12025, term12025.getClass(), "createdate", null);
        setField(term12025, term12025.getClass(), "modifiedby", null);
        setField(term12025, term12025.getClass(), "modifydate", null);
        setField(term12025, term12025.getClass(), "version", null);
        setField(term12025, term12025.getClass(), "fileurl", null);
        setField(term12025, term12025.getClass(), "ext", null);
        setField(term12025, term12025.getClass(), "attFilepath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setModifydate", argTypes, term12025, args);
    }

};


