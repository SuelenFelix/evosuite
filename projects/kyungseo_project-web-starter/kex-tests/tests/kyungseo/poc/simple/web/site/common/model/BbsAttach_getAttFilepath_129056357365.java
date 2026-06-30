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

public class BbsAttach_getAttFilepath_129056357365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12032;

    public BbsAttach_getAttFilepath_129056357365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12032 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term12032, term12032.getClass(), "bbsId", null);
        setField(term12032, term12032.getClass(), "docNumber", null);
        setField(term12032, term12032.getClass(), "attSeqno", null);
        setField(term12032, term12032.getClass(), "fileid", null);
        setField(term12032, term12032.getClass(), "logicalfilename", null);
        setField(term12032, term12032.getClass(), "physicalfilename", null);
        setField(term12032, term12032.getClass(), "filepath", null);
        setField(term12032, term12032.getClass(), "filesize", null);
        setField(term12032, term12032.getClass(), "createdby", null);
        setField(term12032, term12032.getClass(), "createdate", null);
        setField(term12032, term12032.getClass(), "modifiedby", null);
        setField(term12032, term12032.getClass(), "modifydate", null);
        setField(term12032, term12032.getClass(), "version", null);
        setField(term12032, term12032.getClass(), "fileurl", null);
        setField(term12032, term12032.getClass(), "ext", null);
        setField(term12032, term12032.getClass(), "attFilepath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAttFilepath", argTypes, term12032, args);
    }

};


