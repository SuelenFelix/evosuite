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

public class BbsAttach_setModifydate_152596927924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8362;

    public BbsAttach_setModifydate_152596927924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8362 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term8362, term8362.getClass(), "bbsId", "KSJeYkkvpk");
        setField(term8362, term8362.getClass(), "docNumber", "qUtkFGMNUV");
        setField(term8362, term8362.getClass(), "attSeqno", "mGRiYhnMcR");
        setField(term8362, term8362.getClass(), "fileid", "NFlvfJCVPO");
        setField(term8362, term8362.getClass(), "logicalfilename", "KarbTXFmUU");
        setField(term8362, term8362.getClass(), "physicalfilename", "jiUSjqwSIQ");
        setField(term8362, term8362.getClass(), "filepath", "MgLCedQfoj");
        setField(term8362, term8362.getClass(), "filesize", "zgKiINdgNu");
        setField(term8362, term8362.getClass(), "createdby", "zLMTXDQHYH");
        setField(term8362, term8362.getClass(), "createdate", "PqywFWJlpE");
        setField(term8362, term8362.getClass(), "modifiedby", "OzXRsFGTIp");
        setField(term8362, term8362.getClass(), "modifydate", "TjWpyghUWN");
        setField(term8362, term8362.getClass(), "version", "dkZFDZxcde");
        setField(term8362, term8362.getClass(), "fileurl", "WXcZEtUKlI");
        setField(term8362, term8362.getClass(), "ext", "IkpjUOuWQU");
        setField(term8362, term8362.getClass(), "attFilepath", "boSSpezHeU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OUeBWNTQDh";
        callMethod(klass, "setModifydate", argTypes, term8362, args);
    }

};


