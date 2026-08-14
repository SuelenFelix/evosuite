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
import java.lang.Object;
import java.util.HashMap;
import java.lang.Long;
import java.lang.Integer;

public class BatchSqliteDanMuReader_readListByPage_11626303043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term667;
     Object term692;
     Object term731;
     Object term733;

    public BatchSqliteDanMuReader_readListByPage_11626303043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term668 = new ArrayList();
        ((ArrayList) term668).add((Object)null);
        ((ArrayList) term668).add((Object)null);
        ((ArrayList) term668).add((Object)null);
        ((ArrayList) term668).add((Object)null);
        ((ArrayList) term668).add((Object)null);
        HashMap term672 = new HashMap();
        HashMap term682 = new HashMap();
        term667 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.utils.reader.BatchSqliteDanMuReader"));
        setField(term667, term667.getClass(), "danMuReaderList", term668);
        setField(term667, term667.getClass(), "startTimeMap", term672);
        setField(term667, term667.getClass(), "endTimeMap", term682);
        Long term693 = new Long(-7738503207562305297L);
        Long term695 = new Long(3825396310311739952L);
        Long term697 = new Long(-3838084482494604218L);
        Integer term699 = new Integer(679763016);
        Integer term713 = new Integer(1962444399);
        Integer term715 = new Integer(767834723);
        Long term717 = new Long(3892018155439224435L);
        term692 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector"));
        setField(term692, term692.getClass(), "startCreateTime", term693);
        setField(term692, term692.getClass(), "endCreateTime", term695);
        setField(term692, term692.getClass(), "id", term697);
        setField(term692, term692.getClass(), "userId", term699);
        setField(term692, term692.getClass(), "data", "flxyYxBRtu");
        setField(term692, term692.getClass(), "format", term713);
        setField(term692, term692.getClass(), "type", term715);
        setField(term692, term692.getClass(), "createTime", term717);
        setField(term692, term692.getClass(), "createTimeText", "OclPbYPkcH");
        term731 = new Integer(-616727354);
        term733 = new Integer(-1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.utils.reader.BatchSqliteDanMuReader");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term692;
        args[1] = term731;
        args[2] = term733;
        callMethod(klass, "readListByPage", argTypes, term667, args);
    }

};


