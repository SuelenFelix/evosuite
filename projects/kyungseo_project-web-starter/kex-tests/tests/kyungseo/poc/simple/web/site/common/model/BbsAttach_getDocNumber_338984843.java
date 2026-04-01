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

public class BbsAttach_getDocNumber_338984843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term729;

    public BbsAttach_getDocNumber_338984843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term729 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term729, term729.getClass(), "bbsId", "SbAoxhfrkn");
        setField(term729, term729.getClass(), "docNumber", "kuTXqwMtDB");
        setField(term729, term729.getClass(), "attSeqno", "Ghbwtircqb");
        setField(term729, term729.getClass(), "fileid", "xrwlQZdwCp");
        setField(term729, term729.getClass(), "logicalfilename", "IDCWpPLRkE");
        setField(term729, term729.getClass(), "physicalfilename", "nyiiPDVjAc");
        setField(term729, term729.getClass(), "filepath", "aKnKipADSo");
        setField(term729, term729.getClass(), "filesize", "wSQxaModmm");
        setField(term729, term729.getClass(), "createdby", "UlajhuVLaP");
        setField(term729, term729.getClass(), "createdate", "gGSMzuGICf");
        setField(term729, term729.getClass(), "modifiedby", "hxCBltsObl");
        setField(term729, term729.getClass(), "modifydate", "BndsHwAFMv");
        setField(term729, term729.getClass(), "version", "GzFkzHGYFt");
        setField(term729, term729.getClass(), "fileurl", "tShwQLRGNe");
        setField(term729, term729.getClass(), "ext", "LvtrsXUliU");
        setField(term729, term729.getClass(), "attFilepath", "xLbjWUgOIL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDocNumber", argTypes, term729, args);
    }

};


