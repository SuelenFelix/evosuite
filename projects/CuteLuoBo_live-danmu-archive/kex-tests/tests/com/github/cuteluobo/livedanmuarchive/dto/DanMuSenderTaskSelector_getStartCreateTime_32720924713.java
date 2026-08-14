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

public class DanMuSenderTaskSelector_getStartCreateTime_32720924713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1249;

    public DanMuSenderTaskSelector_getStartCreateTime_32720924713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1250 = new Long(-1333707622307134180L);
        Long term1252 = new Long(-4360569253593381888L);
        Long term1254 = new Long(1457594663983990440L);
        Long term1256 = new Long(3452833434644634217L);
        Long term1258 = new Long(-8603648071751666348L);
        Long term1260 = new Long(-7884871963229073324L);
        Long term1262 = new Long(-8649738738252714180L);
        Long term1264 = new Long(-7278883608542636188L);
        Integer term1266 = new Integer(1134449235);
        Long term1304 = new Long(-1539859611880912454L);
        Long term1306 = new Long(0L);
        Long term1308 = new Long(0L);
        Integer term1310 = new Integer(0);
        Boolean term1312 = new Boolean(false);
        Boolean term1314 = new Boolean(false);
        Long term1316 = new Long(4100236067313034103L);
        Long term1318 = new Long(1195529027276497124L);
        Long term1320 = new Long(-2783999800714825789L);
        term1249 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector"));
        setField(term1249, term1249.getClass(), "startCreateTime", term1250);
        setField(term1249, term1249.getClass(), "endCreateTime", term1252);
        setField(term1249, term1249.getClass(), "startUpdateTime", term1254);
        setField(term1249, term1249.getClass(), "endUpdateTime", term1256);
        setField(term1249, term1249.getClass(), "startFinishTime", term1258);
        setField(term1249, term1249.getClass(), "endFinishTime", term1260);
        setField(term1249, term1249.getClass(), "startVideoCreatedTime", term1262);
        setField(term1249, term1249.getClass(), "endVideoCreatedTime", term1264);
        setField(term1249, term1249.getClass(), "id", term1266);
        setField(term1249, term1249.getClass(), "platform", "xrwlQZdwCp");
        setField(term1249, term1249.getClass(), "videoCreatorUid", "IDCWpPLRkE");
        setField(term1249, term1249.getClass(), "videoId", "nyiiPDVjAc");
        setField(term1249, term1249.getClass(), "videoCreatedTime", term1304);
        setField(term1249, term1249.getClass(), "danmuTotalNum", term1306);
        setField(term1249, term1249.getClass(), "danmuSentNum", term1308);
        setField(term1249, term1249.getClass(), "pageSize", term1310);
        setField(term1249, term1249.getClass(), "skip", term1312);
        setField(term1249, term1249.getClass(), "taskFail", term1314);
        setField(term1249, term1249.getClass(), "createTime", term1316);
        setField(term1249, term1249.getClass(), "updateTime", term1318);
        setField(term1249, term1249.getClass(), "finishTime", term1320);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartCreateTime", argTypes, term1249, args);
    }

};


