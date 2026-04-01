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

public class BbsAttach_getAttSeqno_10457909145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1457;

    public BbsAttach_getAttSeqno_10457909145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1457 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term1457, term1457.getClass(), "bbsId", "kBdSllIBVz");
        setField(term1457, term1457.getClass(), "docNumber", "TJmVBGfTML");
        setField(term1457, term1457.getClass(), "attSeqno", "tPlsykYBqO");
        setField(term1457, term1457.getClass(), "fileid", "bLPjGVBhlX");
        setField(term1457, term1457.getClass(), "logicalfilename", "whBvTVIIlC");
        setField(term1457, term1457.getClass(), "physicalfilename", "IgRJUzaCwW");
        setField(term1457, term1457.getClass(), "filepath", "JUmudUmaaV");
        setField(term1457, term1457.getClass(), "filesize", "KoyGrUJeJW");
        setField(term1457, term1457.getClass(), "createdby", "HqBOwkVqjD");
        setField(term1457, term1457.getClass(), "createdate", "MAcUBcBckh");
        setField(term1457, term1457.getClass(), "modifiedby", "oVgzLbrsFr");
        setField(term1457, term1457.getClass(), "modifydate", "vQVyKLdtaz");
        setField(term1457, term1457.getClass(), "version", "OWKQODBLzb");
        setField(term1457, term1457.getClass(), "fileurl", "wGmYcqUkgE");
        setField(term1457, term1457.getClass(), "ext", "idgaQsnJpQ");
        setField(term1457, term1457.getClass(), "attFilepath", "VgZnGoIFwQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAttSeqno", argTypes, term1457, args);
    }

};


