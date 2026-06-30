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

public class BbsAttach_getCreatedby_43974679817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5825;

    public BbsAttach_getCreatedby_43974679817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5825 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term5825, term5825.getClass(), "bbsId", "uSUvKAyuvd");
        setField(term5825, term5825.getClass(), "docNumber", "onQLVONGuf");
        setField(term5825, term5825.getClass(), "attSeqno", "SOrEHbcbmn");
        setField(term5825, term5825.getClass(), "fileid", "bnsyeQXFdu");
        setField(term5825, term5825.getClass(), "logicalfilename", "BwtdjiefJn");
        setField(term5825, term5825.getClass(), "physicalfilename", "jDmhBrIoDa");
        setField(term5825, term5825.getClass(), "filepath", "SPtPatHeOm");
        setField(term5825, term5825.getClass(), "filesize", "ywmcuThdfL");
        setField(term5825, term5825.getClass(), "createdby", "GBOEuByOfr");
        setField(term5825, term5825.getClass(), "createdate", "NHbOFFjyVK");
        setField(term5825, term5825.getClass(), "modifiedby", "zaloBqlrSo");
        setField(term5825, term5825.getClass(), "modifydate", "vvoLrMGCoN");
        setField(term5825, term5825.getClass(), "version", "pXdglvyrQe");
        setField(term5825, term5825.getClass(), "fileurl", "OcfNzHYdki");
        setField(term5825, term5825.getClass(), "ext", "uPuCVuZYOI");
        setField(term5825, term5825.getClass(), "attFilepath", "TweMFhxNdj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedby", argTypes, term5825, args);
    }

};


