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

public class BbsAttach_setCreatedate_142318790320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6906;

    public BbsAttach_setCreatedate_142318790320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6906 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term6906, term6906.getClass(), "bbsId", "GEJABPlHSI");
        setField(term6906, term6906.getClass(), "docNumber", "aQFUvuaYxd");
        setField(term6906, term6906.getClass(), "attSeqno", "zNFLXMifnS");
        setField(term6906, term6906.getClass(), "fileid", "HHQcYMSBVc");
        setField(term6906, term6906.getClass(), "logicalfilename", "wdoqITnaAP");
        setField(term6906, term6906.getClass(), "physicalfilename", "rIPMBcrNqB");
        setField(term6906, term6906.getClass(), "filepath", "UDaboHZHhz");
        setField(term6906, term6906.getClass(), "filesize", "nRvKihUSPj");
        setField(term6906, term6906.getClass(), "createdby", "BbNeQJpYPr");
        setField(term6906, term6906.getClass(), "createdate", "riMtzCoxNj");
        setField(term6906, term6906.getClass(), "modifiedby", "YAXkVjQZcV");
        setField(term6906, term6906.getClass(), "modifydate", "pumvwBWvpy");
        setField(term6906, term6906.getClass(), "version", "HwLHeGLyhe");
        setField(term6906, term6906.getClass(), "fileurl", "RDnkgWkcbz");
        setField(term6906, term6906.getClass(), "ext", "IBpaxltauX");
        setField(term6906, term6906.getClass(), "attFilepath", "hePqROaplw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PJcSNDruWd";
        callMethod(klass, "setCreatedate", argTypes, term6906, args);
    }

};


