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

public class BbsAttach_setBbsId_9983746572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354;

    public BbsAttach_setBbsId_9983746572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term354 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term354, term354.getClass(), "bbsId", "ZiaGIbnzTs");
        setField(term354, term354.getClass(), "docNumber", "tbcdzjIfER");
        setField(term354, term354.getClass(), "attSeqno", "HyxfbSQYBe");
        setField(term354, term354.getClass(), "fileid", "pCTimMblYc");
        setField(term354, term354.getClass(), "logicalfilename", "hNxWaHcfhY");
        setField(term354, term354.getClass(), "physicalfilename", "RkybSrpybU");
        setField(term354, term354.getClass(), "filepath", "xOEqzGAmDU");
        setField(term354, term354.getClass(), "filesize", "eZFUvlxvGV");
        setField(term354, term354.getClass(), "createdby", "BYqFIqCKAV");
        setField(term354, term354.getClass(), "createdate", "vrQLuWIDJX");
        setField(term354, term354.getClass(), "modifiedby", "flxyYxBRtu");
        setField(term354, term354.getClass(), "modifydate", "OclPbYPkcH");
        setField(term354, term354.getClass(), "version", "IoAlmYsBwc");
        setField(term354, term354.getClass(), "fileurl", "TEParAifyi");
        setField(term354, term354.getClass(), "ext", "OWDIEULEFu");
        setField(term354, term354.getClass(), "attFilepath", "dWRymuLBtr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AijpHYOFuy";
        callMethod(klass, "setBbsId", argTypes, term354, args);
    }

};


