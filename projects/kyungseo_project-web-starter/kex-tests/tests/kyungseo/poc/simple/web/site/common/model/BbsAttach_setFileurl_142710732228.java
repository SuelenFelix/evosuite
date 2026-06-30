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

public class BbsAttach_setFileurl_142710732228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9818;

    public BbsAttach_setFileurl_142710732228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9818 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term9818, term9818.getClass(), "bbsId", "uSlMeISsDD");
        setField(term9818, term9818.getClass(), "docNumber", "WdCiTDUKqn");
        setField(term9818, term9818.getClass(), "attSeqno", "PSizQDoxxe");
        setField(term9818, term9818.getClass(), "fileid", "mKaHyMybrK");
        setField(term9818, term9818.getClass(), "logicalfilename", "AyrEXuGrEj");
        setField(term9818, term9818.getClass(), "physicalfilename", "yevIIoVYHq");
        setField(term9818, term9818.getClass(), "filepath", "UuYWMTqWTV");
        setField(term9818, term9818.getClass(), "filesize", "DSFGlcaXUb");
        setField(term9818, term9818.getClass(), "createdby", "sHMXNUzNeM");
        setField(term9818, term9818.getClass(), "createdate", "gPzGDOEPPw");
        setField(term9818, term9818.getClass(), "modifiedby", "rwKoAngzCu");
        setField(term9818, term9818.getClass(), "modifydate", "VUkRVwROTl");
        setField(term9818, term9818.getClass(), "version", "UDlkdccCRn");
        setField(term9818, term9818.getClass(), "fileurl", "McpzErOcYb");
        setField(term9818, term9818.getClass(), "ext", "jqrVEUvYEz");
        setField(term9818, term9818.getClass(), "attFilepath", "QITgiBrmfj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pXxkiXgQnq";
        callMethod(klass, "setFileurl", argTypes, term9818, args);
    }

};


