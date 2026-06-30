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

public class BbsAttach_setCreatedby_27698935818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6178;

    public BbsAttach_setCreatedby_27698935818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6178 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term6178, term6178.getClass(), "bbsId", "NBrvVzvQHe");
        setField(term6178, term6178.getClass(), "docNumber", "FjOiNAfBOc");
        setField(term6178, term6178.getClass(), "attSeqno", "iCCsaLHohG");
        setField(term6178, term6178.getClass(), "fileid", "NJhGgctbdj");
        setField(term6178, term6178.getClass(), "logicalfilename", "MYWYUeLGOp");
        setField(term6178, term6178.getClass(), "physicalfilename", "tsTGdgQYUL");
        setField(term6178, term6178.getClass(), "filepath", "TtGbVmKcnX");
        setField(term6178, term6178.getClass(), "filesize", "GJVkUrCVdD");
        setField(term6178, term6178.getClass(), "createdby", "zNdorvdUgu");
        setField(term6178, term6178.getClass(), "createdate", "oPxuZbkYio");
        setField(term6178, term6178.getClass(), "modifiedby", "vKitydDVnM");
        setField(term6178, term6178.getClass(), "modifydate", "urCiQnUFBM");
        setField(term6178, term6178.getClass(), "version", "EKjQdtKxAM");
        setField(term6178, term6178.getClass(), "fileurl", "TXZAIPQJHt");
        setField(term6178, term6178.getClass(), "ext", "DIbeDHICho");
        setField(term6178, term6178.getClass(), "attFilepath", "dJGPlmSRnz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DPskuFUobI";
        callMethod(klass, "setCreatedby", argTypes, term6178, args);
    }

};


