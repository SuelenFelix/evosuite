package com.stock.spider.entity;

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
import static com.stock.spider.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class Result_getData_6560074017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11889;

    public Result_getData_6560074017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term11917 = newInstance(Class.forName("com.stock.spider.entity.Data"));
        Object term11920 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11924 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11928 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11932 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11936 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11940 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11947 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11951 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11955 = newInstance(Class.forName("java.math.BigDecimal"));
        setField(term11917, term11917.getClass(), "industryCode", "");
        setField(term11917, term11917.getClass(), "industryName", "");
        setField(term11920, term11920.getClass(), "intVal", null);
        setIntField(term11920, term11920.getClass(), "scale", 52);
        setIntField(term11920, term11920.getClass(), "precision", 0);
        setField(term11920, term11920.getClass(), "stringCache", null);
        setLongField(term11920, term11920.getClass(), "intCompact", -9223372036854775808L);
        setField(term11917, term11917.getClass(), "dayIncrease", term11920);
        setField(term11924, term11924.getClass(), "intVal", null);
        setIntField(term11924, term11924.getClass(), "scale", 51);
        setIntField(term11924, term11924.getClass(), "precision", 0);
        setField(term11924, term11924.getClass(), "stringCache", null);
        setLongField(term11924, term11924.getClass(), "intCompact", -9223372036854775808L);
        setField(term11917, term11917.getClass(), "weekIncrease", term11924);
        setField(term11928, term11928.getClass(), "intVal", null);
        setIntField(term11928, term11928.getClass(), "scale", 53);
        setIntField(term11928, term11928.getClass(), "precision", 0);
        setField(term11928, term11928.getClass(), "stringCache", null);
        setLongField(term11928, term11928.getClass(), "intCompact", -9223372036854775808L);
        setField(term11917, term11917.getClass(), "monthIncrease", term11928);
        setField(term11932, term11932.getClass(), "intVal", null);
        setIntField(term11932, term11932.getClass(), "scale", 53);
        setIntField(term11932, term11932.getClass(), "precision", 0);
        setField(term11932, term11932.getClass(), "stringCache", null);
        setLongField(term11932, term11932.getClass(), "intCompact", -9223372036854775808L);
        setField(term11917, term11917.getClass(), "quarterIncrease", term11932);
        setField(term11936, term11936.getClass(), "intVal", null);
        setIntField(term11936, term11936.getClass(), "scale", 51);
        setIntField(term11936, term11936.getClass(), "precision", 0);
        setField(term11936, term11936.getClass(), "stringCache", null);
        setLongField(term11936, term11936.getClass(), "intCompact", -9223372036854775808L);
        setField(term11917, term11917.getClass(), "halfYearIncrease", term11936);
        setField(term11940, term11940.getClass(), "intVal", null);
        setIntField(term11940, term11940.getClass(), "scale", 53);
        setIntField(term11940, term11940.getClass(), "precision", 0);
        setField(term11940, term11940.getClass(), "stringCache", null);
        setLongField(term11940, term11940.getClass(), "intCompact", -9223372036854775808L);
        setField(term11917, term11917.getClass(), "yearIncrease", term11940);
        setField(term11917, term11917.getClass(), "line", "");
        setField(term11917, term11917.getClass(), "stockCode", "");
        setField(term11917, term11917.getClass(), "stockName", "");
        setField(term11947, term11947.getClass(), "intVal", null);
        setIntField(term11947, term11947.getClass(), "scale", 52);
        setIntField(term11947, term11947.getClass(), "precision", 0);
        setField(term11947, term11947.getClass(), "stringCache", null);
        setLongField(term11947, term11947.getClass(), "intCompact", -9223372036854775808L);
        setField(term11917, term11917.getClass(), "tradingVolumeAvg", term11947);
        setField(term11951, term11951.getClass(), "intVal", null);
        setIntField(term11951, term11951.getClass(), "scale", 52);
        setIntField(term11951, term11951.getClass(), "precision", 0);
        setField(term11951, term11951.getClass(), "stringCache", null);
        setLongField(term11951, term11951.getClass(), "intCompact", -9223372036854775808L);
        setField(term11917, term11917.getClass(), "tradingAmountAvg", term11951);
        setField(term11955, term11955.getClass(), "intVal", null);
        setIntField(term11955, term11955.getClass(), "scale", 51);
        setIntField(term11955, term11955.getClass(), "precision", 0);
        setField(term11955, term11955.getClass(), "stringCache", null);
        setLongField(term11955, term11955.getClass(), "intCompact", -9223372036854775808L);
        setField(term11917, term11917.getClass(), "score", term11955);
        setField(term11917, term11917.getClass(), "profit", "");
        Object term11960 = newInstance(Class.forName("com.stock.spider.entity.Data"));
        Object term11963 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11967 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11971 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11975 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11979 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11983 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11990 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11994 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11998 = newInstance(Class.forName("java.math.BigDecimal"));
        setField(term11960, term11960.getClass(), "industryCode", "");
        setField(term11960, term11960.getClass(), "industryName", "");
        setField(term11963, term11963.getClass(), "intVal", null);
        setIntField(term11963, term11963.getClass(), "scale", 53);
        setIntField(term11963, term11963.getClass(), "precision", 0);
        setField(term11963, term11963.getClass(), "stringCache", null);
        setLongField(term11963, term11963.getClass(), "intCompact", -9223372036854775808L);
        setField(term11960, term11960.getClass(), "dayIncrease", term11963);
        setField(term11967, term11967.getClass(), "intVal", null);
        setIntField(term11967, term11967.getClass(), "scale", 52);
        setIntField(term11967, term11967.getClass(), "precision", 0);
        setField(term11967, term11967.getClass(), "stringCache", null);
        setLongField(term11967, term11967.getClass(), "intCompact", -9223372036854775808L);
        setField(term11960, term11960.getClass(), "weekIncrease", term11967);
        setField(term11971, term11971.getClass(), "intVal", null);
        setIntField(term11971, term11971.getClass(), "scale", 52);
        setIntField(term11971, term11971.getClass(), "precision", 0);
        setField(term11971, term11971.getClass(), "stringCache", null);
        setLongField(term11971, term11971.getClass(), "intCompact", -9223372036854775808L);
        setField(term11960, term11960.getClass(), "monthIncrease", term11971);
        setField(term11975, term11975.getClass(), "intVal", null);
        setIntField(term11975, term11975.getClass(), "scale", 52);
        setIntField(term11975, term11975.getClass(), "precision", 0);
        setField(term11975, term11975.getClass(), "stringCache", null);
        setLongField(term11975, term11975.getClass(), "intCompact", -9223372036854775808L);
        setField(term11960, term11960.getClass(), "quarterIncrease", term11975);
        setField(term11979, term11979.getClass(), "intVal", null);
        setIntField(term11979, term11979.getClass(), "scale", 52);
        setIntField(term11979, term11979.getClass(), "precision", 0);
        setField(term11979, term11979.getClass(), "stringCache", null);
        setLongField(term11979, term11979.getClass(), "intCompact", -9223372036854775808L);
        setField(term11960, term11960.getClass(), "halfYearIncrease", term11979);
        setField(term11983, term11983.getClass(), "intVal", null);
        setIntField(term11983, term11983.getClass(), "scale", 52);
        setIntField(term11983, term11983.getClass(), "precision", 0);
        setField(term11983, term11983.getClass(), "stringCache", null);
        setLongField(term11983, term11983.getClass(), "intCompact", -9223372036854775808L);
        setField(term11960, term11960.getClass(), "yearIncrease", term11983);
        setField(term11960, term11960.getClass(), "line", "");
        setField(term11960, term11960.getClass(), "stockCode", "");
        setField(term11960, term11960.getClass(), "stockName", "");
        setField(term11990, term11990.getClass(), "intVal", null);
        setIntField(term11990, term11990.getClass(), "scale", 53);
        setIntField(term11990, term11990.getClass(), "precision", 0);
        setField(term11990, term11990.getClass(), "stringCache", null);
        setLongField(term11990, term11990.getClass(), "intCompact", -9223372036854775808L);
        setField(term11960, term11960.getClass(), "tradingVolumeAvg", term11990);
        setField(term11994, term11994.getClass(), "intVal", null);
        setIntField(term11994, term11994.getClass(), "scale", 52);
        setIntField(term11994, term11994.getClass(), "precision", 0);
        setField(term11994, term11994.getClass(), "stringCache", null);
        setLongField(term11994, term11994.getClass(), "intCompact", -9223372036854775808L);
        setField(term11960, term11960.getClass(), "tradingAmountAvg", term11994);
        setField(term11998, term11998.getClass(), "intVal", null);
        setIntField(term11998, term11998.getClass(), "scale", 53);
        setIntField(term11998, term11998.getClass(), "precision", 0);
        setField(term11998, term11998.getClass(), "stringCache", null);
        setLongField(term11998, term11998.getClass(), "intCompact", -9223372036854775808L);
        setField(term11960, term11960.getClass(), "score", term11998);
        setField(term11960, term11960.getClass(), "profit", "");
        ArrayList term11915 = new ArrayList();
        ((ArrayList) term11915).add(term11917);
        ((ArrayList) term11915).add(term11960);
        term11889 = newInstance(Class.forName("com.stock.spider.entity.Result"));
        setField(term11889, term11889.getClass(), "code", "JeZFtaqkzW");
        setField(term11889, term11889.getClass(), "msg", "vOVuNSCCLe");
        setIntField(term11889, term11889.getClass(), "count", -2038273078);
        setField(term11889, term11889.getClass(), "data", term11915);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.stock.spider.entity.Result");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getData", argTypes, term11889, args);
    }

};


