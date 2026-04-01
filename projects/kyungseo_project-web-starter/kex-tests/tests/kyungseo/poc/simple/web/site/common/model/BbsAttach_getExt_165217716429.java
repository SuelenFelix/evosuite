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

public class BbsAttach_getExt_165217716429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10193;

    public BbsAttach_getExt_165217716429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10193 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term10193, term10193.getClass(), "bbsId", "tKmrUDURku");
        setField(term10193, term10193.getClass(), "docNumber", "JeZbrwZmsP");
        setField(term10193, term10193.getClass(), "attSeqno", "bxyfeicqrK");
        setField(term10193, term10193.getClass(), "fileid", "vBnWPlsZMk");
        setField(term10193, term10193.getClass(), "logicalfilename", "fIZsWucfXz");
        setField(term10193, term10193.getClass(), "physicalfilename", "IApvtmfhnq");
        setField(term10193, term10193.getClass(), "filepath", "VSaNnhMpRc");
        setField(term10193, term10193.getClass(), "filesize", "QNjNTLlUaV");
        setField(term10193, term10193.getClass(), "createdby", "hIYsRyOZxk");
        setField(term10193, term10193.getClass(), "createdate", "RjNoEywJbC");
        setField(term10193, term10193.getClass(), "modifiedby", "RTTvrwwhou");
        setField(term10193, term10193.getClass(), "modifydate", "lRORwXipuk");
        setField(term10193, term10193.getClass(), "version", "fVdTcjgHdw");
        setField(term10193, term10193.getClass(), "fileurl", "wwAwLLcLPp");
        setField(term10193, term10193.getClass(), "ext", "nHpMKOmlpQ");
        setField(term10193, term10193.getClass(), "attFilepath", "fKhrQsJToZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt", argTypes, term10193, args);
    }

};


