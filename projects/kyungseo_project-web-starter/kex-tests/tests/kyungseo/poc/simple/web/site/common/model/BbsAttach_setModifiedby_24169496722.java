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

public class BbsAttach_setModifiedby_24169496722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7634;

    public BbsAttach_setModifiedby_24169496722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7634 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term7634, term7634.getClass(), "bbsId", "JkgoRtImdE");
        setField(term7634, term7634.getClass(), "docNumber", "qFGKIJjlmV");
        setField(term7634, term7634.getClass(), "attSeqno", "IHqvyhMtuM");
        setField(term7634, term7634.getClass(), "fileid", "dAldIGYAXV");
        setField(term7634, term7634.getClass(), "logicalfilename", "mLwibAPEsa");
        setField(term7634, term7634.getClass(), "physicalfilename", "zsWKWiTFuo");
        setField(term7634, term7634.getClass(), "filepath", "UPUbwyHQKN");
        setField(term7634, term7634.getClass(), "filesize", "lgQkrXANyI");
        setField(term7634, term7634.getClass(), "createdby", "MeTmRZXErV");
        setField(term7634, term7634.getClass(), "createdate", "jNxbVmoZgq");
        setField(term7634, term7634.getClass(), "modifiedby", "PvmBHIXaMY");
        setField(term7634, term7634.getClass(), "modifydate", "hulYxtowxw");
        setField(term7634, term7634.getClass(), "version", "GNEmuHPNcU");
        setField(term7634, term7634.getClass(), "fileurl", "IoSfuKDFRe");
        setField(term7634, term7634.getClass(), "ext", "AWYyZiNfsm");
        setField(term7634, term7634.getClass(), "attFilepath", "ITRRYiuDwH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "llRfwANcVF";
        callMethod(klass, "setModifiedby", argTypes, term7634, args);
    }

};


