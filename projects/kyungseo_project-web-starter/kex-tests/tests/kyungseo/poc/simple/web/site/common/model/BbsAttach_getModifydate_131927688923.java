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

public class BbsAttach_getModifydate_131927688923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8009;

    public BbsAttach_getModifydate_131927688923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8009 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term8009, term8009.getClass(), "bbsId", "sUEeHQTWkA");
        setField(term8009, term8009.getClass(), "docNumber", "BDIRCxAWLA");
        setField(term8009, term8009.getClass(), "attSeqno", "eOJfbiZLnb");
        setField(term8009, term8009.getClass(), "fileid", "nKZKnxWYCK");
        setField(term8009, term8009.getClass(), "logicalfilename", "JOqQxuzRuZ");
        setField(term8009, term8009.getClass(), "physicalfilename", "RSaoipUlsg");
        setField(term8009, term8009.getClass(), "filepath", "cSHGbqKqlN");
        setField(term8009, term8009.getClass(), "filesize", "pFAfANnxup");
        setField(term8009, term8009.getClass(), "createdby", "FbSIUZyBXZ");
        setField(term8009, term8009.getClass(), "createdate", "mhQDwIyrRi");
        setField(term8009, term8009.getClass(), "modifiedby", "HpZXWDPhlg");
        setField(term8009, term8009.getClass(), "modifydate", "lBOokzEPfe");
        setField(term8009, term8009.getClass(), "version", "dtGZCsKXbW");
        setField(term8009, term8009.getClass(), "fileurl", "bdyhHbDAmJ");
        setField(term8009, term8009.getClass(), "ext", "BBXiTNHqGE");
        setField(term8009, term8009.getClass(), "attFilepath", "IEYhJmgCVd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getModifydate", argTypes, term8009, args);
    }

};


