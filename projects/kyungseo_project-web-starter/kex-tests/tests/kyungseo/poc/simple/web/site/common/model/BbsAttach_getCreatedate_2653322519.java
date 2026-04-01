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

public class BbsAttach_getCreatedate_2653322519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6553;

    public BbsAttach_getCreatedate_2653322519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6553 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term6553, term6553.getClass(), "bbsId", "wBGfLpNNiZ");
        setField(term6553, term6553.getClass(), "docNumber", "yUGCjlqgJE");
        setField(term6553, term6553.getClass(), "attSeqno", "PXdVZyoJyC");
        setField(term6553, term6553.getClass(), "fileid", "vLerpqavFM");
        setField(term6553, term6553.getClass(), "logicalfilename", "qnvxzwuGKX");
        setField(term6553, term6553.getClass(), "physicalfilename", "EdPAvpluZg");
        setField(term6553, term6553.getClass(), "filepath", "DzHVBMqWtE");
        setField(term6553, term6553.getClass(), "filesize", "THZSpzBRYP");
        setField(term6553, term6553.getClass(), "createdby", "ZfBIVGBQOE");
        setField(term6553, term6553.getClass(), "createdate", "QSrDQfEsTR");
        setField(term6553, term6553.getClass(), "modifiedby", "PsqusYmejD");
        setField(term6553, term6553.getClass(), "modifydate", "NTWMiBEaDF");
        setField(term6553, term6553.getClass(), "version", "SPBstwKFVr");
        setField(term6553, term6553.getClass(), "fileurl", "WxYUTuqmIq");
        setField(term6553, term6553.getClass(), "ext", "OeQLvhVERT");
        setField(term6553, term6553.getClass(), "attFilepath", "IlvgFINwIa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedate", argTypes, term6553, args);
    }

};


