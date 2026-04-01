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

public class BbsAttach_getFilepath_128829590413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4369;

    public BbsAttach_getFilepath_128829590413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4369 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term4369, term4369.getClass(), "bbsId", "XJJNClzHRf");
        setField(term4369, term4369.getClass(), "docNumber", "HDaezxQfQR");
        setField(term4369, term4369.getClass(), "attSeqno", "iikZEapDlu");
        setField(term4369, term4369.getClass(), "fileid", "nhoHrZfnIN");
        setField(term4369, term4369.getClass(), "logicalfilename", "ZkMALXpEAZ");
        setField(term4369, term4369.getClass(), "physicalfilename", "tXfQjSqDzN");
        setField(term4369, term4369.getClass(), "filepath", "BjugTaMcxJ");
        setField(term4369, term4369.getClass(), "filesize", "vGiuZVPJNH");
        setField(term4369, term4369.getClass(), "createdby", "tlzpzIjMib");
        setField(term4369, term4369.getClass(), "createdate", "AZdLeSugwv");
        setField(term4369, term4369.getClass(), "modifiedby", "RMsXuyzKJV");
        setField(term4369, term4369.getClass(), "modifydate", "FwPbDZcHmB");
        setField(term4369, term4369.getClass(), "version", "hOncybyCAH");
        setField(term4369, term4369.getClass(), "fileurl", "QduALnDSVo");
        setField(term4369, term4369.getClass(), "ext", "izPpKDErnQ");
        setField(term4369, term4369.getClass(), "attFilepath", "NnpwZBUTvx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFilepath", argTypes, term4369, args);
    }

};


