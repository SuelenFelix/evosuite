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

public class BbsAttach_setLogicalfilename_6291266910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3266;

    public BbsAttach_setLogicalfilename_6291266910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3266 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term3266, term3266.getClass(), "bbsId", "WHcwFgsGFC");
        setField(term3266, term3266.getClass(), "docNumber", "HzqpegHiRq");
        setField(term3266, term3266.getClass(), "attSeqno", "jwsfVjMoJT");
        setField(term3266, term3266.getClass(), "fileid", "ZfdXfCCFDf");
        setField(term3266, term3266.getClass(), "logicalfilename", "MwwjNtdOFT");
        setField(term3266, term3266.getClass(), "physicalfilename", "VYkqXKVlAJ");
        setField(term3266, term3266.getClass(), "filepath", "XkIoWJRNwN");
        setField(term3266, term3266.getClass(), "filesize", "aNWLJdrZMq");
        setField(term3266, term3266.getClass(), "createdby", "HHmNoYxIGj");
        setField(term3266, term3266.getClass(), "createdate", "PtirvZmsGt");
        setField(term3266, term3266.getClass(), "modifiedby", "HWkpTmtlrc");
        setField(term3266, term3266.getClass(), "modifydate", "hMmaoREuCK");
        setField(term3266, term3266.getClass(), "version", "VeDtgDzGAN");
        setField(term3266, term3266.getClass(), "fileurl", "aWYOWZFyaX");
        setField(term3266, term3266.getClass(), "ext", "BRIVNtfUWU");
        setField(term3266, term3266.getClass(), "attFilepath", "DbiCVtPPCT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WzFopsaDuG";
        callMethod(klass, "setLogicalfilename", argTypes, term3266, args);
    }

};


