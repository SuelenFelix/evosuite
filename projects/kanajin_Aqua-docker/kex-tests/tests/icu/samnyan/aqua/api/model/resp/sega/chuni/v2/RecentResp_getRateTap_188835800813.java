package icu.samnyan.aqua.api.model.resp.sega.chuni.v2;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RecentResp_getRateTap_188835800813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46861;

    public RecentResp_getRateTap_188835800813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46861 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term46862 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46863 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46867 = newInstance(Class.forName("java.time.LocalTime"));
        Object term46872 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46873 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46877 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term46863, term46863.getClass(), "year", 2014);
        setShortField(term46863, term46863.getClass(), "month", (short) 11);
        setShortField(term46863, term46863.getClass(), "day", (short) 17);
        setField(term46862, term46862.getClass(), "date", term46863);
        setByteField(term46867, term46867.getClass(), "hour", (byte) 16);
        setByteField(term46867, term46867.getClass(), "minute", (byte) 57);
        setByteField(term46867, term46867.getClass(), "second", (byte) 36);
        setIntField(term46867, term46867.getClass(), "nano", 336508243);
        setField(term46862, term46862.getClass(), "time", term46867);
        setField(term46861, term46861.getClass(), "playDate", term46862);
        setIntField(term46873, term46873.getClass(), "year", 2020);
        setShortField(term46873, term46873.getClass(), "month", (short) 5);
        setShortField(term46873, term46873.getClass(), "day", (short) 21);
        setField(term46872, term46872.getClass(), "date", term46873);
        setByteField(term46877, term46877.getClass(), "hour", (byte) 1);
        setByteField(term46877, term46877.getClass(), "minute", (byte) 0);
        setByteField(term46877, term46877.getClass(), "second", (byte) 30);
        setIntField(term46877, term46877.getClass(), "nano", 495919259);
        setField(term46872, term46872.getClass(), "time", term46877);
        setField(term46861, term46861.getClass(), "userPlayDate", term46872);
        setIntField(term46861, term46861.getClass(), "musicId", -719765151);
        setIntField(term46861, term46861.getClass(), "level", 2039931383);
        setIntField(term46861, term46861.getClass(), "customId", -2109330879);
        setIntField(term46861, term46861.getClass(), "playedCustom1", -1576801556);
        setIntField(term46861, term46861.getClass(), "playedCustom2", -1572718384);
        setIntField(term46861, term46861.getClass(), "playedCustom3", 1623201205);
        setIntField(term46861, term46861.getClass(), "track", 259489188);
        setIntField(term46861, term46861.getClass(), "score", 1709072289);
        setIntField(term46861, term46861.getClass(), "rank", 688786687);
        setIntField(term46861, term46861.getClass(), "maxCombo", 1934256188);
        setIntField(term46861, term46861.getClass(), "maxChain", 1127725248);
        setIntField(term46861, term46861.getClass(), "rateTap", 1789414533);
        setIntField(term46861, term46861.getClass(), "rateHold", -1774273964);
        setIntField(term46861, term46861.getClass(), "rateSlide", -1765697393);
        setIntField(term46861, term46861.getClass(), "rateAir", 2101925650);
        setIntField(term46861, term46861.getClass(), "rateFlick", -242176552);
        setIntField(term46861, term46861.getClass(), "judgeGuilty", 776524710);
        setIntField(term46861, term46861.getClass(), "judgeAttack", 1069095385);
        setIntField(term46861, term46861.getClass(), "judgeJustice", -1889206410);
        setIntField(term46861, term46861.getClass(), "judgeCritical", -235874398);
        setIntField(term46861, term46861.getClass(), "playerRating", -978039004);
        setBooleanField(term46861, term46861.getClass(), "isNewRecord", true);
        setBooleanField(term46861, term46861.getClass(), "isFullCombo", false);
        setIntField(term46861, term46861.getClass(), "fullChainKind", 1162356859);
        setBooleanField(term46861, term46861.getClass(), "isAllJustice", false);
        setIntField(term46861, term46861.getClass(), "characterId", 175338916);
        setIntField(term46861, term46861.getClass(), "skillId", -1484528924);
        setIntField(term46861, term46861.getClass(), "playKind", -557662858);
        setBooleanField(term46861, term46861.getClass(), "isClear", false);
        setIntField(term46861, term46861.getClass(), "skillLevel", -477520795);
        setIntField(term46861, term46861.getClass(), "skillEffect", -480468995);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRateTap", argTypes, term46861, args);
    }

};


