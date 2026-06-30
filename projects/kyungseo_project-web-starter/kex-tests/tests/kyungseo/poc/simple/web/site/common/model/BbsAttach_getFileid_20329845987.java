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

public class BbsAttach_getFileid_20329845987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2185;

    public BbsAttach_getFileid_20329845987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2185 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term2185, term2185.getClass(), "bbsId", "BKLfkLiZTH");
        setField(term2185, term2185.getClass(), "docNumber", "SPpkrGcPRr");
        setField(term2185, term2185.getClass(), "attSeqno", "sEccwbJKYE");
        setField(term2185, term2185.getClass(), "fileid", "AWRooQKkdW");
        setField(term2185, term2185.getClass(), "logicalfilename", "vjxIhXHxGR");
        setField(term2185, term2185.getClass(), "physicalfilename", "QXzGXbEXMu");
        setField(term2185, term2185.getClass(), "filepath", "qxSDVejjiY");
        setField(term2185, term2185.getClass(), "filesize", "xBsXSDjXYK");
        setField(term2185, term2185.getClass(), "createdby", "sEnIVFtZuQ");
        setField(term2185, term2185.getClass(), "createdate", "ZVecLZMLHF");
        setField(term2185, term2185.getClass(), "modifiedby", "fztQhjqwdP");
        setField(term2185, term2185.getClass(), "modifydate", "eVpkWxjuki");
        setField(term2185, term2185.getClass(), "version", "SJiQaLvSKv");
        setField(term2185, term2185.getClass(), "fileurl", "OEXDRUKcFl");
        setField(term2185, term2185.getClass(), "ext", "RYdKCNNMBR");
        setField(term2185, term2185.getClass(), "attFilepath", "yGtHPyvYiQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFileid", argTypes, term2185, args);
    }

};


