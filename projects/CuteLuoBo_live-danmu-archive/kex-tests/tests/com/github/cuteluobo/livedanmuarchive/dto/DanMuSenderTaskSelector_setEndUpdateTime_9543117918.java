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

public class DanMuSenderTaskSelector_setEndUpdateTime_9543117918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term728;
     Object term801;

    public DanMuSenderTaskSelector_setEndUpdateTime_9543117918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term729 = new Long(2848819812340321742L);
        Long term731 = new Long(-8876856890348836498L);
        Long term733 = new Long(846579494941632714L);
        Long term735 = new Long(6689117472719450333L);
        Long term737 = new Long(5836128569274066678L);
        Long term739 = new Long(-2177368829816872572L);
        Long term741 = new Long(-8463029266761149071L);
        Long term743 = new Long(3133860696238261492L);
        Integer term745 = new Integer(-2038273078);
        Long term783 = new Long(7247160664318067468L);
        Long term785 = new Long(0L);
        Long term787 = new Long(0L);
        Integer term789 = new Integer(0);
        Boolean term791 = new Boolean(false);
        Boolean term793 = new Boolean(false);
        Long term795 = new Long(2135754395358000892L);
        Long term797 = new Long(-8085190702504231560L);
        Long term799 = new Long(1672578078364590450L);
        term728 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector"));
        setField(term728, term728.getClass(), "startCreateTime", term729);
        setField(term728, term728.getClass(), "endCreateTime", term731);
        setField(term728, term728.getClass(), "startUpdateTime", term733);
        setField(term728, term728.getClass(), "endUpdateTime", term735);
        setField(term728, term728.getClass(), "startFinishTime", term737);
        setField(term728, term728.getClass(), "endFinishTime", term739);
        setField(term728, term728.getClass(), "startVideoCreatedTime", term741);
        setField(term728, term728.getClass(), "endVideoCreatedTime", term743);
        setField(term728, term728.getClass(), "id", term745);
        setField(term728, term728.getClass(), "platform", "RkybSrpybU");
        setField(term728, term728.getClass(), "videoCreatorUid", "xOEqzGAmDU");
        setField(term728, term728.getClass(), "videoId", "eZFUvlxvGV");
        setField(term728, term728.getClass(), "videoCreatedTime", term783);
        setField(term728, term728.getClass(), "danmuTotalNum", term785);
        setField(term728, term728.getClass(), "danmuSentNum", term787);
        setField(term728, term728.getClass(), "pageSize", term789);
        setField(term728, term728.getClass(), "skip", term791);
        setField(term728, term728.getClass(), "taskFail", term793);
        setField(term728, term728.getClass(), "createTime", term795);
        setField(term728, term728.getClass(), "updateTime", term797);
        setField(term728, term728.getClass(), "finishTime", term799);
        term801 = new Long(4949335493504695457L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term801;
        callMethod(klass, "setEndUpdateTime", argTypes, term728, args);
    }

};


