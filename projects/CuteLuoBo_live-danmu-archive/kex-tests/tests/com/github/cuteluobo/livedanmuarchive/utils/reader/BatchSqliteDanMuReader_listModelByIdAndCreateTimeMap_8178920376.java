package com.github.cuteluobo.livedanmuarchive.utils.reader;

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
import static com.github.cuteluobo.livedanmuarchive.utils.reader.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Long;
import java.lang.Integer;
import java.util.LinkedHashMap;

public class BatchSqliteDanMuReader_listModelByIdAndCreateTimeMap_8178920376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term927;
     Object term952;
     Object term991;

    public BatchSqliteDanMuReader_listModelByIdAndCreateTimeMap_8178920376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term928 = new ArrayList();
        HashMap term932 = new HashMap();
        HashMap term942 = new HashMap();
        term927 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.utils.reader.BatchSqliteDanMuReader"));
        setField(term927, term927.getClass(), "danMuReaderList", term928);
        setField(term927, term927.getClass(), "startTimeMap", term932);
        setField(term927, term927.getClass(), "endTimeMap", term942);
        Long term953 = new Long(682356318767179819L);
        Long term955 = new Long(-7291743527973326814L);
        Long term957 = new Long(-5963439350418910964L);
        Integer term959 = new Integer(579005622);
        Integer term973 = new Integer(-14890619);
        Integer term975 = new Integer(1632125673);
        Long term977 = new Long(9013624480170062917L);
        term952 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector"));
        setField(term952, term952.getClass(), "startCreateTime", term953);
        setField(term952, term952.getClass(), "endCreateTime", term955);
        setField(term952, term952.getClass(), "id", term957);
        setField(term952, term952.getClass(), "userId", term959);
        setField(term952, term952.getClass(), "data", "AijpHYOFuy");
        setField(term952, term952.getClass(), "format", term973);
        setField(term952, term952.getClass(), "type", term975);
        setField(term952, term952.getClass(), "createTime", term977);
        setField(term952, term952.getClass(), "createTimeText", "SbAoxhfrkn");
        term991 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.utils.reader.BatchSqliteDanMuReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector");
        argTypes[1] = Class.forName("java.util.Map");
        Object[] args = new Object[2];
        args[0] = term952;
        args[1] = term991;
        callMethod(klass, "listModelByIdAndCreateTimeMap", argTypes, term927, args);
    }

};


