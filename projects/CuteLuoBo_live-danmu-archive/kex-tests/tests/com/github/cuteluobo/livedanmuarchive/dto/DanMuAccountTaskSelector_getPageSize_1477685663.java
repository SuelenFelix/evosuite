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

public class DanMuAccountTaskSelector_getPageSize_1477685663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1849;

    public DanMuAccountTaskSelector_getPageSize_1477685663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1850 = new Long(-419800263764810394L);
        Long term1852 = new Long(5904678961906211249L);
        Long term1854 = new Long(-1820639665251914495L);
        Long term1856 = new Long(3238645206498300107L);
        Long term1858 = new Long(-1592696983130738594L);
        Long term1860 = new Long(6902365338255307910L);
        Integer term1898 = new Integer(0);
        Integer term1900 = new Integer(0);
        Integer term1866 = new Integer(-1179120542);
        Integer term1868 = new Integer(-73683645);
        Integer term1894 = new Integer(-226514366);
        Long term1896 = new Long(-8019730974733786399L);
        Integer term1902 = new Integer(1193880199);
        Boolean term1904 = new Boolean(false);
        Long term1906 = new Long(394960377236392159L);
        Long term1908 = new Long(-2955854401507097864L);
        Long term1910 = new Long(329213208496958131L);
        term1849 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector"));
        setField(term1849, term1849.getClass(), "startCreateTime", term1850);
        setField(term1849, term1849.getClass(), "endCreateTime", term1852);
        setField(term1849, term1849.getClass(), "startUpdateTime", term1854);
        setField(term1849, term1849.getClass(), "endUpdateTime", term1856);
        setField(term1849, term1849.getClass(), "startFinishTime", term1858);
        setField(term1849, term1849.getClass(), "endFinishTime", term1860);
        setField(term1849, term1849.getClass(), "pageIndex", term1898);
        setField(term1849, term1849.getClass(), "pageSize", term1900);
        setField(term1849, term1849.getClass(), "id", term1866);
        setField(term1849, term1849.getClass(), "danmuSenderTaskId", term1868);
        setField(term1849, term1849.getClass(), "senderUid", "UoYtihxVaS");
        setField(term1849, term1849.getClass(), "videoId", "JDswTTCZHV");
        setField(term1849, term1849.getClass(), "lastVideoPartIndex", term1894);
        setField(term1849, term1849.getClass(), "lastVideoPartCid", term1896);
        setField(term1849, term1849.getClass(), "lastDanmuIndex", term1902);
        setField(term1849, term1849.getClass(), "stop", term1904);
        setField(term1849, term1849.getClass(), "createTime", term1906);
        setField(term1849, term1849.getClass(), "updateTime", term1908);
        setField(term1849, term1849.getClass(), "finishTime", term1910);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPageSize", argTypes, term1849, args);
    }

};


