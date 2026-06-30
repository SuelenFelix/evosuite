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

public class BbsAttach_setExt_27879598030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10546;

    public BbsAttach_setExt_27879598030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10546 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term10546, term10546.getClass(), "bbsId", "wsysQLGFnl");
        setField(term10546, term10546.getClass(), "docNumber", "ckQLZGFjMX");
        setField(term10546, term10546.getClass(), "attSeqno", "qphdrqUtNx");
        setField(term10546, term10546.getClass(), "fileid", "bwlLFAfNWx");
        setField(term10546, term10546.getClass(), "logicalfilename", "JWodNQzjjV");
        setField(term10546, term10546.getClass(), "physicalfilename", "CAgxWjhxNf");
        setField(term10546, term10546.getClass(), "filepath", "goAoCMhKBu");
        setField(term10546, term10546.getClass(), "filesize", "BWxJSgKHRT");
        setField(term10546, term10546.getClass(), "createdby", "AGXoIndFnm");
        setField(term10546, term10546.getClass(), "createdate", "mwmFMNEzkK");
        setField(term10546, term10546.getClass(), "modifiedby", "kVAmKknVln");
        setField(term10546, term10546.getClass(), "modifydate", "MRFLbEGYKG");
        setField(term10546, term10546.getClass(), "version", "BYrGukTyof");
        setField(term10546, term10546.getClass(), "fileurl", "jiCGTTzKGB");
        setField(term10546, term10546.getClass(), "ext", "MqICFYzDJj");
        setField(term10546, term10546.getClass(), "attFilepath", "YgQvdcBQKw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FiYYLuailz";
        callMethod(klass, "setExt", argTypes, term10546, args);
    }

};


