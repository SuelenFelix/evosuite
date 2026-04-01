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

public class BbsAttach_setFileid_4160688828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2538;

    public BbsAttach_setFileid_4160688828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2538 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term2538, term2538.getClass(), "bbsId", "MvRIxilFMJ");
        setField(term2538, term2538.getClass(), "docNumber", "iNwOJRBEjp");
        setField(term2538, term2538.getClass(), "attSeqno", "XylxrMBraH");
        setField(term2538, term2538.getClass(), "fileid", "pORebkoRdD");
        setField(term2538, term2538.getClass(), "logicalfilename", "mXGCWJDOqA");
        setField(term2538, term2538.getClass(), "physicalfilename", "dpNsDgfPso");
        setField(term2538, term2538.getClass(), "filepath", "hCWPJQKpdc");
        setField(term2538, term2538.getClass(), "filesize", "WzMEhMXkKx");
        setField(term2538, term2538.getClass(), "createdby", "XOiDvlDhdc");
        setField(term2538, term2538.getClass(), "createdate", "AdxvLJhNLe");
        setField(term2538, term2538.getClass(), "modifiedby", "lHfTrWKMPk");
        setField(term2538, term2538.getClass(), "modifydate", "JDaAnsVTGV");
        setField(term2538, term2538.getClass(), "version", "mLUZFTfjle");
        setField(term2538, term2538.getClass(), "fileurl", "xIeFjkHkOe");
        setField(term2538, term2538.getClass(), "ext", "SdCKLMIYnX");
        setField(term2538, term2538.getClass(), "attFilepath", "OJJtVNPyKZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AKNapTAfmD";
        callMethod(klass, "setFileid", argTypes, term2538, args);
    }

};


