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

public class BbsAttach_setAttSeqno_16628339426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1810;

    public BbsAttach_setAttSeqno_16628339426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1810 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term1810, term1810.getClass(), "bbsId", "jUbSRrkrYZ");
        setField(term1810, term1810.getClass(), "docNumber", "bWWfajKbEX");
        setField(term1810, term1810.getClass(), "attSeqno", "cAPeiZHKGJ");
        setField(term1810, term1810.getClass(), "fileid", "LvJFtLBaxj");
        setField(term1810, term1810.getClass(), "logicalfilename", "PHvxnGHptP");
        setField(term1810, term1810.getClass(), "physicalfilename", "TimdotUuNC");
        setField(term1810, term1810.getClass(), "filepath", "PkWMRdJcBb");
        setField(term1810, term1810.getClass(), "filesize", "jSpAteRute");
        setField(term1810, term1810.getClass(), "createdby", "swZVeJAxjt");
        setField(term1810, term1810.getClass(), "createdate", "xOcJIiQQDu");
        setField(term1810, term1810.getClass(), "modifiedby", "GVizqqzXpy");
        setField(term1810, term1810.getClass(), "modifydate", "JqXGgAhZPl");
        setField(term1810, term1810.getClass(), "version", "jiKYgYHqIS");
        setField(term1810, term1810.getClass(), "fileurl", "DfISiziTgG");
        setField(term1810, term1810.getClass(), "ext", "XqgfKFvPSD");
        setField(term1810, term1810.getClass(), "attFilepath", "JiVRgTZvKc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XPKmummaqg";
        callMethod(klass, "setAttSeqno", argTypes, term1810, args);
    }

};


