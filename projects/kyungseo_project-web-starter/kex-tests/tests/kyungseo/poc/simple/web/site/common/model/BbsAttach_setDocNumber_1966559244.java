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

public class BbsAttach_setDocNumber_1966559244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1082;

    public BbsAttach_setDocNumber_1966559244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1082 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term1082, term1082.getClass(), "bbsId", "jDtqGUpnZN");
        setField(term1082, term1082.getClass(), "docNumber", "nGKItKLYNC");
        setField(term1082, term1082.getClass(), "attSeqno", "UiUYnPrcCi");
        setField(term1082, term1082.getClass(), "fileid", "UoYtihxVaS");
        setField(term1082, term1082.getClass(), "logicalfilename", "JDswTTCZHV");
        setField(term1082, term1082.getClass(), "physicalfilename", "onpbIeEKoi");
        setField(term1082, term1082.getClass(), "filepath", "YRHGsAkhxb");
        setField(term1082, term1082.getClass(), "filesize", "ffYhPOzlUs");
        setField(term1082, term1082.getClass(), "createdby", "MLqYREekMl");
        setField(term1082, term1082.getClass(), "createdate", "ytSBIKXogI");
        setField(term1082, term1082.getClass(), "modifiedby", "nHXjMycHlU");
        setField(term1082, term1082.getClass(), "modifydate", "ieCtQFdkii");
        setField(term1082, term1082.getClass(), "version", "dEnhdmILtU");
        setField(term1082, term1082.getClass(), "fileurl", "hoicvmsovO");
        setField(term1082, term1082.getClass(), "ext", "eqJfYWRaEL");
        setField(term1082, term1082.getClass(), "attFilepath", "fhkbdRViHi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uWHnvSvaPl";
        callMethod(klass, "setDocNumber", argTypes, term1082, args);
    }

};


