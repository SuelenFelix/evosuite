package com.github.cuteluobo.livedanmuarchive.dto;

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
import static com.github.cuteluobo.livedanmuarchive.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;

public class DanMuAccountTaskSelector_setEndCreateTime_204016351816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2940;
     Object term3003;

    public DanMuAccountTaskSelector_setEndCreateTime_204016351816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2941 = new Long(-5207216109884759743L);
        Long term2943 = new Long(8765880103547975810L);
        Long term2945 = new Long(4552367707739103094L);
        Long term2947 = new Long(-6001151456088965547L);
        Long term2949 = new Long(1740732617708040141L);
        Long term2951 = new Long(3472971833455746664L);
        Integer term2989 = new Integer(0);
        Integer term2991 = new Integer(0);
        Integer term2957 = new Integer(-341962980);
        Integer term2959 = new Integer(1532716628);
        Integer term2985 = new Integer(-1801760683);
        Long term2987 = new Long(3731931947533293029L);
        Integer term2993 = new Integer(1141317871);
        Boolean term2995 = new Boolean(false);
        Long term2997 = new Long(9214973322210954344L);
        Long term2999 = new Long(3662777917800385964L);
        Long term3001 = new Long(-7005300544167632229L);
        term2940 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector"));
        setField(term2940, term2940.getClass(), "startCreateTime", term2941);
        setField(term2940, term2940.getClass(), "endCreateTime", term2943);
        setField(term2940, term2940.getClass(), "startUpdateTime", term2945);
        setField(term2940, term2940.getClass(), "endUpdateTime", term2947);
        setField(term2940, term2940.getClass(), "startFinishTime", term2949);
        setField(term2940, term2940.getClass(), "endFinishTime", term2951);
        setField(term2940, term2940.getClass(), "pageIndex", term2989);
        setField(term2940, term2940.getClass(), "pageSize", term2991);
        setField(term2940, term2940.getClass(), "id", term2957);
        setField(term2940, term2940.getClass(), "danmuSenderTaskId", term2959);
        setField(term2940, term2940.getClass(), "senderUid", "OWKQODBLzb");
        setField(term2940, term2940.getClass(), "videoId", "wGmYcqUkgE");
        setField(term2940, term2940.getClass(), "lastVideoPartIndex", term2985);
        setField(term2940, term2940.getClass(), "lastVideoPartCid", term2987);
        setField(term2940, term2940.getClass(), "lastDanmuIndex", term2993);
        setField(term2940, term2940.getClass(), "stop", term2995);
        setField(term2940, term2940.getClass(), "createTime", term2997);
        setField(term2940, term2940.getClass(), "updateTime", term2999);
        setField(term2940, term2940.getClass(), "finishTime", term3001);
        term3003 = new Long(-278716491237139968L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term3003;
        callMethod(klass, "setEndCreateTime", argTypes, term2940, args);
    }

};


