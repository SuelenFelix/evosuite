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

public class BbsAttach_getPhysicalfilename_81650716511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3641;

    public BbsAttach_getPhysicalfilename_81650716511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3641 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term3641, term3641.getClass(), "bbsId", "PapWxkhEWe");
        setField(term3641, term3641.getClass(), "docNumber", "smnHEqRFRx");
        setField(term3641, term3641.getClass(), "attSeqno", "XYtryyobou");
        setField(term3641, term3641.getClass(), "fileid", "OYbzXylRWW");
        setField(term3641, term3641.getClass(), "logicalfilename", "DSNsTGYXDF");
        setField(term3641, term3641.getClass(), "physicalfilename", "sQvGcVjdEx");
        setField(term3641, term3641.getClass(), "filepath", "rLHAoqXgPh");
        setField(term3641, term3641.getClass(), "filesize", "zUlRdimJtU");
        setField(term3641, term3641.getClass(), "createdby", "vwbEQQNQrx");
        setField(term3641, term3641.getClass(), "createdate", "xtftXXMbem");
        setField(term3641, term3641.getClass(), "modifiedby", "cudZvLMQon");
        setField(term3641, term3641.getClass(), "modifydate", "lihXWlGDxk");
        setField(term3641, term3641.getClass(), "version", "JmcmxoGhIK");
        setField(term3641, term3641.getClass(), "fileurl", "jXzmYyrnnT");
        setField(term3641, term3641.getClass(), "ext", "igCAtimmYB");
        setField(term3641, term3641.getClass(), "attFilepath", "DyiXbeYIaN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPhysicalfilename", argTypes, term3641, args);
    }

};


