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

public class BbsAttach_getModifiedby_169141609521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7281;

    public BbsAttach_getModifiedby_169141609521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7281 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term7281, term7281.getClass(), "bbsId", "VVNNlAePXF");
        setField(term7281, term7281.getClass(), "docNumber", "jnwVnmKAFv");
        setField(term7281, term7281.getClass(), "attSeqno", "TXyHhqeCjR");
        setField(term7281, term7281.getClass(), "fileid", "lZIgPZPgTu");
        setField(term7281, term7281.getClass(), "logicalfilename", "iuCxnHGMoW");
        setField(term7281, term7281.getClass(), "physicalfilename", "GPSEWEDSTo");
        setField(term7281, term7281.getClass(), "filepath", "RCOqfVsRHt");
        setField(term7281, term7281.getClass(), "filesize", "TSyCeEZPaT");
        setField(term7281, term7281.getClass(), "createdby", "JeZFtaqkzW");
        setField(term7281, term7281.getClass(), "createdate", "vOVuNSCCLe");
        setField(term7281, term7281.getClass(), "modifiedby", "fzeqPnzpnt");
        setField(term7281, term7281.getClass(), "modifydate", "RxbhrFBjkO");
        setField(term7281, term7281.getClass(), "version", "aanyiAOJCl");
        setField(term7281, term7281.getClass(), "fileurl", "VDokbsCuqq");
        setField(term7281, term7281.getClass(), "ext", "xClUIcPECX");
        setField(term7281, term7281.getClass(), "attFilepath", "avhRaGZaBF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getModifiedby", argTypes, term7281, args);
    }

};


