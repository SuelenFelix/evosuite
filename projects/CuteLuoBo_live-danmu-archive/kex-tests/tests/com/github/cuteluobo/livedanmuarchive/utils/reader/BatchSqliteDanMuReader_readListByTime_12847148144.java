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

public class BatchSqliteDanMuReader_readListByTime_12847148144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term755;
     Object term780;
     Object term819;
     Object term821;

    public BatchSqliteDanMuReader_readListByTime_12847148144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term756 = new ArrayList();
        HashMap term760 = new HashMap();
        HashMap term770 = new HashMap();
        term755 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.utils.reader.BatchSqliteDanMuReader"));
        setField(term755, term755.getClass(), "danMuReaderList", term756);
        setField(term755, term755.getClass(), "startTimeMap", term760);
        setField(term755, term755.getClass(), "endTimeMap", term770);
        Long term781 = new Long(2443640364875054177L);
        Long term783 = new Long(-1610676979013636850L);
        Long term785 = new Long(2062173786000223358L);
        Integer term787 = new Integer(-602026508);
        Integer term801 = new Integer(-157887805);
        Integer term803 = new Integer(1876565163);
        Long term805 = new Long(-8658027316505137504L);
        term780 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector"));
        setField(term780, term780.getClass(), "startCreateTime", term781);
        setField(term780, term780.getClass(), "endCreateTime", term783);
        setField(term780, term780.getClass(), "id", term785);
        setField(term780, term780.getClass(), "userId", term787);
        setField(term780, term780.getClass(), "data", "IoAlmYsBwc");
        setField(term780, term780.getClass(), "format", term801);
        setField(term780, term780.getClass(), "type", term803);
        setField(term780, term780.getClass(), "createTime", term805);
        setField(term780, term780.getClass(), "createTimeText", "TEParAifyi");
        term819 = new Integer(-2038273078);
        term821 = new Long(-8257434502486459194L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.utils.reader.BatchSqliteDanMuReader");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector");
        argTypes[1] = int.class;
        argTypes[2] = long.class;
        Object[] args = new Object[3];
        args[0] = term780;
        args[1] = term819;
        args[2] = term821;
        callMethod(klass, "readListByTime", argTypes, term755, args);
    }

};


