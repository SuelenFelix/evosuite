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

public class BbsAttach_getFilesize_119484442015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5097;

    public BbsAttach_getFilesize_119484442015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5097 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term5097, term5097.getClass(), "bbsId", "xvkbvaEGYd");
        setField(term5097, term5097.getClass(), "docNumber", "HBGNxdNURv");
        setField(term5097, term5097.getClass(), "attSeqno", "mfCpTPPQQm");
        setField(term5097, term5097.getClass(), "fileid", "OcJCIDNIXA");
        setField(term5097, term5097.getClass(), "logicalfilename", "XfRABIFVEp");
        setField(term5097, term5097.getClass(), "physicalfilename", "MHGKyEnwKc");
        setField(term5097, term5097.getClass(), "filepath", "ShIELyuULw");
        setField(term5097, term5097.getClass(), "filesize", "IpQuOGMgmj");
        setField(term5097, term5097.getClass(), "createdby", "pJbnHTYrxn");
        setField(term5097, term5097.getClass(), "createdate", "iIRsCSYqXH");
        setField(term5097, term5097.getClass(), "modifiedby", "nghfqDXyCG");
        setField(term5097, term5097.getClass(), "modifydate", "WBAOTqErtm");
        setField(term5097, term5097.getClass(), "version", "PqtVXXZMqK");
        setField(term5097, term5097.getClass(), "fileurl", "rYbtIDVdnd");
        setField(term5097, term5097.getClass(), "ext", "UKAReurpHG");
        setField(term5097, term5097.getClass(), "attFilepath", "WVRMUmrljA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFilesize", argTypes, term5097, args);
    }

};


