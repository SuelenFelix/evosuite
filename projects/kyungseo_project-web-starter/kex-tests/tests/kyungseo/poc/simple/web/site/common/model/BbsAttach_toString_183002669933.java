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

public class BbsAttach_toString_183002669933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11649;

    public BbsAttach_toString_183002669933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11649 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term11649, term11649.getClass(), "bbsId", "uzmqjnOUXu");
        setField(term11649, term11649.getClass(), "docNumber", "xeyjTOCOJb");
        setField(term11649, term11649.getClass(), "attSeqno", "DGRqjjdhzy");
        setField(term11649, term11649.getClass(), "fileid", "lQFkjJUPAR");
        setField(term11649, term11649.getClass(), "logicalfilename", "BsuVlGUUjV");
        setField(term11649, term11649.getClass(), "physicalfilename", "bHHjfDCntT");
        setField(term11649, term11649.getClass(), "filepath", "sEphiduvkv");
        setField(term11649, term11649.getClass(), "filesize", "PbLgCSAHce");
        setField(term11649, term11649.getClass(), "createdby", "NWldOLAbqk");
        setField(term11649, term11649.getClass(), "createdate", "qnYaYSpDwO");
        setField(term11649, term11649.getClass(), "modifiedby", "dgbFDCdHtj");
        setField(term11649, term11649.getClass(), "modifydate", "EKpdCBubDE");
        setField(term11649, term11649.getClass(), "version", "zMsSLTfGhl");
        setField(term11649, term11649.getClass(), "fileurl", "bEmHScVZaQ");
        setField(term11649, term11649.getClass(), "ext", "TcuXODkzBV");
        setField(term11649, term11649.getClass(), "attFilepath", "coJPjrBZNe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term11649, args);
    }

};


