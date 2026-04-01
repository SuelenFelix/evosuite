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

public class BbsAttach_setFilepath_142032895214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4722;

    public BbsAttach_setFilepath_142032895214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4722 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term4722, term4722.getClass(), "bbsId", "tlQSNgTkQX");
        setField(term4722, term4722.getClass(), "docNumber", "PCipZnmBOF");
        setField(term4722, term4722.getClass(), "attSeqno", "zcorEihhLK");
        setField(term4722, term4722.getClass(), "fileid", "GrqozDKFOk");
        setField(term4722, term4722.getClass(), "logicalfilename", "CFyoseFGLF");
        setField(term4722, term4722.getClass(), "physicalfilename", "SFqCrhEWLm");
        setField(term4722, term4722.getClass(), "filepath", "GZdcJyZntS");
        setField(term4722, term4722.getClass(), "filesize", "OIHoJeysUi");
        setField(term4722, term4722.getClass(), "createdby", "WXMWFDGcLB");
        setField(term4722, term4722.getClass(), "createdate", "wKWbJssZuG");
        setField(term4722, term4722.getClass(), "modifiedby", "NzBMMhkhpT");
        setField(term4722, term4722.getClass(), "modifydate", "qCpEbQDHdF");
        setField(term4722, term4722.getClass(), "version", "AHbZyFOmlo");
        setField(term4722, term4722.getClass(), "fileurl", "TwfWVQGiIj");
        setField(term4722, term4722.getClass(), "ext", "gUvcueTURF");
        setField(term4722, term4722.getClass(), "attFilepath", "EwQBhZjCIT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aSkmSwTnEw";
        callMethod(klass, "setFilepath", argTypes, term4722, args);
    }

};


