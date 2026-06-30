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

public class BbsAttach_setFilesize_151378043616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5450;

    public BbsAttach_setFilesize_151378043616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5450 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term5450, term5450.getClass(), "bbsId", "NTlKJDDWlk");
        setField(term5450, term5450.getClass(), "docNumber", "vOuMEpOQAg");
        setField(term5450, term5450.getClass(), "attSeqno", "SIODFGaQhr");
        setField(term5450, term5450.getClass(), "fileid", "qYzsiuXOgS");
        setField(term5450, term5450.getClass(), "logicalfilename", "bxrCBbrrct");
        setField(term5450, term5450.getClass(), "physicalfilename", "CKWpJaaaxX");
        setField(term5450, term5450.getClass(), "filepath", "UBRmXJmfrt");
        setField(term5450, term5450.getClass(), "filesize", "WZzvmIHhzZ");
        setField(term5450, term5450.getClass(), "createdby", "doQLHkjpNm");
        setField(term5450, term5450.getClass(), "createdate", "lCyLIcSuom");
        setField(term5450, term5450.getClass(), "modifiedby", "CGOpQSZZwI");
        setField(term5450, term5450.getClass(), "modifydate", "ypEdrstygY");
        setField(term5450, term5450.getClass(), "version", "sNQFlATEeQ");
        setField(term5450, term5450.getClass(), "fileurl", "ZKMLioamsY");
        setField(term5450, term5450.getClass(), "ext", "WVbxuoDBcn");
        setField(term5450, term5450.getClass(), "attFilepath", "pvDEABOxLt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "beAMpkroCQ";
        callMethod(klass, "setFilesize", argTypes, term5450, args);
    }

};


