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

public class BbsAttach_getFileurl_61562629827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9465;

    public BbsAttach_getFileurl_61562629827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9465 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term9465, term9465.getClass(), "bbsId", "YkZtEtthvz");
        setField(term9465, term9465.getClass(), "docNumber", "dwlZSxlXOo");
        setField(term9465, term9465.getClass(), "attSeqno", "lKrEAkypza");
        setField(term9465, term9465.getClass(), "fileid", "KtuuNAqGCQ");
        setField(term9465, term9465.getClass(), "logicalfilename", "OGQsfjmReM");
        setField(term9465, term9465.getClass(), "physicalfilename", "YsUtbngnRO");
        setField(term9465, term9465.getClass(), "filepath", "JisaWUxcNb");
        setField(term9465, term9465.getClass(), "filesize", "NxgmYPzWCI");
        setField(term9465, term9465.getClass(), "createdby", "SqjyKmayBx");
        setField(term9465, term9465.getClass(), "createdate", "XjDhvToxJy");
        setField(term9465, term9465.getClass(), "modifiedby", "nxSTJflLQy");
        setField(term9465, term9465.getClass(), "modifydate", "FlHzxEfFzI");
        setField(term9465, term9465.getClass(), "version", "aSATgQUpoe");
        setField(term9465, term9465.getClass(), "fileurl", "VkPSXewZfB");
        setField(term9465, term9465.getClass(), "ext", "ubodzJoMGW");
        setField(term9465, term9465.getClass(), "attFilepath", "weddIktxOA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFileurl", argTypes, term9465, args);
    }

};


