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

public class BbsAttach_setBbsId_99837465736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12003;

    public BbsAttach_setBbsId_99837465736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12003 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term12003, term12003.getClass(), "bbsId", null);
        setField(term12003, term12003.getClass(), "docNumber", null);
        setField(term12003, term12003.getClass(), "attSeqno", null);
        setField(term12003, term12003.getClass(), "fileid", null);
        setField(term12003, term12003.getClass(), "logicalfilename", null);
        setField(term12003, term12003.getClass(), "physicalfilename", null);
        setField(term12003, term12003.getClass(), "filepath", null);
        setField(term12003, term12003.getClass(), "filesize", null);
        setField(term12003, term12003.getClass(), "createdby", null);
        setField(term12003, term12003.getClass(), "createdate", null);
        setField(term12003, term12003.getClass(), "modifiedby", null);
        setField(term12003, term12003.getClass(), "modifydate", null);
        setField(term12003, term12003.getClass(), "version", null);
        setField(term12003, term12003.getClass(), "fileurl", null);
        setField(term12003, term12003.getClass(), "ext", null);
        setField(term12003, term12003.getClass(), "attFilepath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBbsId", argTypes, term12003, args);
    }

};


