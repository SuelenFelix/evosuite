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

public class BbsAttach_getAttFilepath_129056357331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10921;

    public BbsAttach_getAttFilepath_129056357331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10921 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term10921, term10921.getClass(), "bbsId", "XebAeSnCKZ");
        setField(term10921, term10921.getClass(), "docNumber", "GeddnXjHGy");
        setField(term10921, term10921.getClass(), "attSeqno", "vLTbaoAxBm");
        setField(term10921, term10921.getClass(), "fileid", "BXTjEyEZxD");
        setField(term10921, term10921.getClass(), "logicalfilename", "oKhVzOKUFW");
        setField(term10921, term10921.getClass(), "physicalfilename", "mNHyqmOAFy");
        setField(term10921, term10921.getClass(), "filepath", "UxgSdhxPCH");
        setField(term10921, term10921.getClass(), "filesize", "DAujxZPHJC");
        setField(term10921, term10921.getClass(), "createdby", "IlBhdrCvHq");
        setField(term10921, term10921.getClass(), "createdate", "OirVUQhauU");
        setField(term10921, term10921.getClass(), "modifiedby", "GLbyDfbNZI");
        setField(term10921, term10921.getClass(), "modifydate", "oNLcCYDAsO");
        setField(term10921, term10921.getClass(), "version", "CNqMxLvtcJ");
        setField(term10921, term10921.getClass(), "fileurl", "ktbqerIaKW");
        setField(term10921, term10921.getClass(), "ext", "VoghngXfsK");
        setField(term10921, term10921.getClass(), "attFilepath", "GbahCBMvct");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAttFilepath", argTypes, term10921, args);
    }

};


