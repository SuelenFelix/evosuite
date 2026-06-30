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

public class BbsAttach_getVersion_72670747725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8737;

    public BbsAttach_getVersion_72670747725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8737 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term8737, term8737.getClass(), "bbsId", "gltJarNuUk");
        setField(term8737, term8737.getClass(), "docNumber", "ZwZIDwYcSW");
        setField(term8737, term8737.getClass(), "attSeqno", "sOdkipUKRu");
        setField(term8737, term8737.getClass(), "fileid", "oKwCDqywym");
        setField(term8737, term8737.getClass(), "logicalfilename", "zjZYTddemL");
        setField(term8737, term8737.getClass(), "physicalfilename", "QtrylgCLiF");
        setField(term8737, term8737.getClass(), "filepath", "orEuhCStGM");
        setField(term8737, term8737.getClass(), "filesize", "HhEaSXWvrY");
        setField(term8737, term8737.getClass(), "createdby", "CVRGEomOth");
        setField(term8737, term8737.getClass(), "createdate", "vSeruUyNWX");
        setField(term8737, term8737.getClass(), "modifiedby", "UkKvaeJfEC");
        setField(term8737, term8737.getClass(), "modifydate", "WPxXsahPRq");
        setField(term8737, term8737.getClass(), "version", "IENRuqmwUU");
        setField(term8737, term8737.getClass(), "fileurl", "GsWxOwXvSu");
        setField(term8737, term8737.getClass(), "ext", "bKBSncrMEZ");
        setField(term8737, term8737.getClass(), "attFilepath", "yeSXGqQExb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersion", argTypes, term8737, args);
    }

};


