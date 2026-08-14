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

public class DanMuAccountTaskSelector_setEndFinishTime_78890967112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2604;
     Object term2667;

    public DanMuAccountTaskSelector_setEndFinishTime_78890967112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2605 = new Long(-5951743062322506095L);
        Long term2607 = new Long(768144790810175653L);
        Long term2609 = new Long(-1497280900081695731L);
        Long term2611 = new Long(-3602825674339018793L);
        Long term2613 = new Long(3086974592680165932L);
        Long term2615 = new Long(-532956263280568707L);
        Integer term2653 = new Integer(0);
        Integer term2655 = new Integer(0);
        Integer term2621 = new Integer(-1547384488);
        Integer term2623 = new Integer(1442160736);
        Integer term2649 = new Integer(1114000454);
        Long term2651 = new Long(6073193746616629086L);
        Integer term2657 = new Integer(-556405712);
        Boolean term2659 = new Boolean(false);
        Long term2661 = new Long(-2463629530824341661L);
        Long term2663 = new Long(7800835025296877231L);
        Long term2665 = new Long(-187772971269812453L);
        term2604 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector"));
        setField(term2604, term2604.getClass(), "startCreateTime", term2605);
        setField(term2604, term2604.getClass(), "endCreateTime", term2607);
        setField(term2604, term2604.getClass(), "startUpdateTime", term2609);
        setField(term2604, term2604.getClass(), "endUpdateTime", term2611);
        setField(term2604, term2604.getClass(), "startFinishTime", term2613);
        setField(term2604, term2604.getClass(), "endFinishTime", term2615);
        setField(term2604, term2604.getClass(), "pageIndex", term2653);
        setField(term2604, term2604.getClass(), "pageSize", term2655);
        setField(term2604, term2604.getClass(), "id", term2621);
        setField(term2604, term2604.getClass(), "danmuSenderTaskId", term2623);
        setField(term2604, term2604.getClass(), "senderUid", "whBvTVIIlC");
        setField(term2604, term2604.getClass(), "videoId", "IgRJUzaCwW");
        setField(term2604, term2604.getClass(), "lastVideoPartIndex", term2649);
        setField(term2604, term2604.getClass(), "lastVideoPartCid", term2651);
        setField(term2604, term2604.getClass(), "lastDanmuIndex", term2657);
        setField(term2604, term2604.getClass(), "stop", term2659);
        setField(term2604, term2604.getClass(), "createTime", term2661);
        setField(term2604, term2604.getClass(), "updateTime", term2663);
        setField(term2604, term2604.getClass(), "finishTime", term2665);
        term2667 = new Long(468487103823886117L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuAccountTaskSelector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term2667;
        callMethod(klass, "setEndFinishTime", argTypes, term2604, args);
    }

};


