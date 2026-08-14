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

public class DanMuSenderTaskSelector_setEndCreateTime_86462607816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1560;
     Object term1633;

    public DanMuSenderTaskSelector_setEndCreateTime_86462607816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1561 = new Long(6698455537431331246L);
        Long term1563 = new Long(-8327432141027603933L);
        Long term1565 = new Long(-433040798405298080L);
        Long term1567 = new Long(-1505191021111100819L);
        Long term1569 = new Long(-1000830646340880796L);
        Long term1571 = new Long(5973526439563541711L);
        Long term1573 = new Long(5246058710498845622L);
        Long term1575 = new Long(4394651392080968777L);
        Integer term1577 = new Integer(597278769);
        Long term1615 = new Long(-7310273014364148916L);
        Long term1617 = new Long(0L);
        Long term1619 = new Long(0L);
        Integer term1621 = new Integer(0);
        Boolean term1623 = new Boolean(false);
        Boolean term1625 = new Boolean(false);
        Long term1627 = new Long(8863790908271299748L);
        Long term1629 = new Long(9205327385733285058L);
        Long term1631 = new Long(4199886998224701110L);
        term1560 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector"));
        setField(term1560, term1560.getClass(), "startCreateTime", term1561);
        setField(term1560, term1560.getClass(), "endCreateTime", term1563);
        setField(term1560, term1560.getClass(), "startUpdateTime", term1565);
        setField(term1560, term1560.getClass(), "endUpdateTime", term1567);
        setField(term1560, term1560.getClass(), "startFinishTime", term1569);
        setField(term1560, term1560.getClass(), "endFinishTime", term1571);
        setField(term1560, term1560.getClass(), "startVideoCreatedTime", term1573);
        setField(term1560, term1560.getClass(), "endVideoCreatedTime", term1575);
        setField(term1560, term1560.getClass(), "id", term1577);
        setField(term1560, term1560.getClass(), "platform", "GzFkzHGYFt");
        setField(term1560, term1560.getClass(), "videoCreatorUid", "tShwQLRGNe");
        setField(term1560, term1560.getClass(), "videoId", "LvtrsXUliU");
        setField(term1560, term1560.getClass(), "videoCreatedTime", term1615);
        setField(term1560, term1560.getClass(), "danmuTotalNum", term1617);
        setField(term1560, term1560.getClass(), "danmuSentNum", term1619);
        setField(term1560, term1560.getClass(), "pageSize", term1621);
        setField(term1560, term1560.getClass(), "skip", term1623);
        setField(term1560, term1560.getClass(), "taskFail", term1625);
        setField(term1560, term1560.getClass(), "createTime", term1627);
        setField(term1560, term1560.getClass(), "updateTime", term1629);
        setField(term1560, term1560.getClass(), "finishTime", term1631);
        term1633 = new Long(8540994973773607992L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1633;
        callMethod(klass, "setEndCreateTime", argTypes, term1560, args);
    }

};


