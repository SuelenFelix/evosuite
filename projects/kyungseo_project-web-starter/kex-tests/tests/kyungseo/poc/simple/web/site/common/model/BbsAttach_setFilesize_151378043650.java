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

public class BbsAttach_setFilesize_151378043650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12017;

    public BbsAttach_setFilesize_151378043650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12017 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term12017, term12017.getClass(), "bbsId", null);
        setField(term12017, term12017.getClass(), "docNumber", null);
        setField(term12017, term12017.getClass(), "attSeqno", null);
        setField(term12017, term12017.getClass(), "fileid", null);
        setField(term12017, term12017.getClass(), "logicalfilename", null);
        setField(term12017, term12017.getClass(), "physicalfilename", null);
        setField(term12017, term12017.getClass(), "filepath", null);
        setField(term12017, term12017.getClass(), "filesize", null);
        setField(term12017, term12017.getClass(), "createdby", null);
        setField(term12017, term12017.getClass(), "createdate", null);
        setField(term12017, term12017.getClass(), "modifiedby", null);
        setField(term12017, term12017.getClass(), "modifydate", null);
        setField(term12017, term12017.getClass(), "version", null);
        setField(term12017, term12017.getClass(), "fileurl", null);
        setField(term12017, term12017.getClass(), "ext", null);
        setField(term12017, term12017.getClass(), "attFilepath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFilesize", argTypes, term12017, args);
    }

};


