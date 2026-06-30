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

public class BbsAttach_setAttFilepath_139361438932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11274;

    public BbsAttach_setAttFilepath_139361438932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11274 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term11274, term11274.getClass(), "bbsId", "iiHBhsNFgk");
        setField(term11274, term11274.getClass(), "docNumber", "HknsTajwxJ");
        setField(term11274, term11274.getClass(), "attSeqno", "XtiurrVYKw");
        setField(term11274, term11274.getClass(), "fileid", "rsumfoDNHa");
        setField(term11274, term11274.getClass(), "logicalfilename", "ceCWHUTQUM");
        setField(term11274, term11274.getClass(), "physicalfilename", "LrqwfrKKtS");
        setField(term11274, term11274.getClass(), "filepath", "ZUdnQXfzCI");
        setField(term11274, term11274.getClass(), "filesize", "EULDrUNQvw");
        setField(term11274, term11274.getClass(), "createdby", "BtvAvsJSei");
        setField(term11274, term11274.getClass(), "createdate", "vqnBkkxoIa");
        setField(term11274, term11274.getClass(), "modifiedby", "bycpZjxXFn");
        setField(term11274, term11274.getClass(), "modifydate", "jQWttOAiwL");
        setField(term11274, term11274.getClass(), "version", "DzKFxEuEEC");
        setField(term11274, term11274.getClass(), "fileurl", "CAMnvfDLJL");
        setField(term11274, term11274.getClass(), "ext", "mfHtgSbdjD");
        setField(term11274, term11274.getClass(), "attFilepath", "cmuaUiHMVL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xjoSGPWUgu";
        callMethod(klass, "setAttFilepath", argTypes, term11274, args);
    }

};


