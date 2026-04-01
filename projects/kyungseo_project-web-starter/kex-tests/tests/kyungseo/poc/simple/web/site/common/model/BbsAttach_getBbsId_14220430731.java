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

public class BbsAttach_getBbsId_14220430731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public BbsAttach_getBbsId_14220430731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term1, term1.getClass(), "bbsId", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "docNumber", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "attSeqno", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "fileid", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "logicalfilename", "jJCZpVmanW");
        setField(term1, term1.getClass(), "physicalfilename", "EGtDIRbSSb");
        setField(term1, term1.getClass(), "filepath", "SzjVpOQTyS");
        setField(term1, term1.getClass(), "filesize", "MjGYSRKTNF");
        setField(term1, term1.getClass(), "createdby", "hRNSzYYIrc");
        setField(term1, term1.getClass(), "createdate", "RMFIsYGgne");
        setField(term1, term1.getClass(), "modifiedby", "NRdvgJlhkX");
        setField(term1, term1.getClass(), "modifydate", "uuaPigETmJ");
        setField(term1, term1.getClass(), "version", "MxlszYVzRf");
        setField(term1, term1.getClass(), "fileurl", "LQFpaHEwXR");
        setField(term1, term1.getClass(), "ext", "oVcInYnLWB");
        setField(term1, term1.getClass(), "attFilepath", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBbsId", argTypes, term1, args);
    }

};


