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

public class BbsAttach_setPhysicalfilename_99224446912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3994;

    public BbsAttach_setPhysicalfilename_99224446912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3994 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term3994, term3994.getClass(), "bbsId", "VGizxZnyHX");
        setField(term3994, term3994.getClass(), "docNumber", "kVEZMHmRtR");
        setField(term3994, term3994.getClass(), "attSeqno", "ekxGuOYIwi");
        setField(term3994, term3994.getClass(), "fileid", "RbVQXSpxXy");
        setField(term3994, term3994.getClass(), "logicalfilename", "YpJbIgJWWv");
        setField(term3994, term3994.getClass(), "physicalfilename", "JppkknKVOw");
        setField(term3994, term3994.getClass(), "filepath", "iljANwuEjk");
        setField(term3994, term3994.getClass(), "filesize", "kNqaJKIATy");
        setField(term3994, term3994.getClass(), "createdby", "vKQukfbJUd");
        setField(term3994, term3994.getClass(), "createdate", "lFRJFUMVbx");
        setField(term3994, term3994.getClass(), "modifiedby", "sZdUNdggUW");
        setField(term3994, term3994.getClass(), "modifydate", "OqbwYQfvAe");
        setField(term3994, term3994.getClass(), "version", "tRxZafjqIx");
        setField(term3994, term3994.getClass(), "fileurl", "DhjNLmRMCu");
        setField(term3994, term3994.getClass(), "ext", "PgPzMSEjjX");
        setField(term3994, term3994.getClass(), "attFilepath", "wzsPSPcRdj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kGMQdqJYyB";
        callMethod(klass, "setPhysicalfilename", argTypes, term3994, args);
    }

};


