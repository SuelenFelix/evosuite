package icu.samnyan.aqua.api.model.resp.sega.chuni.v1;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RecentResp_getSkillId_32822313628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52811;

    public RecentResp_getSkillId_32822313628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52811 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term52812 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52813 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52817 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52822 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52823 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52827 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term52813, term52813.getClass(), "year", 2019);
        setShortField(term52813, term52813.getClass(), "month", (short) 7);
        setShortField(term52813, term52813.getClass(), "day", (short) 9);
        setField(term52812, term52812.getClass(), "date", term52813);
        setByteField(term52817, term52817.getClass(), "hour", (byte) 21);
        setByteField(term52817, term52817.getClass(), "minute", (byte) 37);
        setByteField(term52817, term52817.getClass(), "second", (byte) 42);
        setIntField(term52817, term52817.getClass(), "nano", 399935883);
        setField(term52812, term52812.getClass(), "time", term52817);
        setField(term52811, term52811.getClass(), "playDate", term52812);
        setIntField(term52823, term52823.getClass(), "year", 2013);
        setShortField(term52823, term52823.getClass(), "month", (short) 9);
        setShortField(term52823, term52823.getClass(), "day", (short) 23);
        setField(term52822, term52822.getClass(), "date", term52823);
        setByteField(term52827, term52827.getClass(), "hour", (byte) 14);
        setByteField(term52827, term52827.getClass(), "minute", (byte) 21);
        setByteField(term52827, term52827.getClass(), "second", (byte) 30);
        setIntField(term52827, term52827.getClass(), "nano", 871245576);
        setField(term52822, term52822.getClass(), "time", term52827);
        setField(term52811, term52811.getClass(), "userPlayDate", term52822);
        setIntField(term52811, term52811.getClass(), "musicId", 1483253425);
        setIntField(term52811, term52811.getClass(), "level", -1101871231);
        setIntField(term52811, term52811.getClass(), "customId", 928527949);
        setIntField(term52811, term52811.getClass(), "playedCustom1", 435463871);
        setIntField(term52811, term52811.getClass(), "playedCustom2", -72892619);
        setIntField(term52811, term52811.getClass(), "playedCustom3", 907161445);
        setIntField(term52811, term52811.getClass(), "track", -107125345);
        setIntField(term52811, term52811.getClass(), "score", -1484271501);
        setIntField(term52811, term52811.getClass(), "rank", 1994800842);
        setIntField(term52811, term52811.getClass(), "maxCombo", 418349525);
        setIntField(term52811, term52811.getClass(), "maxChain", 989214721);
        setIntField(term52811, term52811.getClass(), "rateTap", 1509604);
        setIntField(term52811, term52811.getClass(), "rateHold", 516929449);
        setIntField(term52811, term52811.getClass(), "rateSlide", 86726117);
        setIntField(term52811, term52811.getClass(), "rateAir", -142908686);
        setIntField(term52811, term52811.getClass(), "rateFlick", 780437076);
        setIntField(term52811, term52811.getClass(), "judgeGuilty", -1290991126);
        setIntField(term52811, term52811.getClass(), "judgeAttack", 1579548215);
        setIntField(term52811, term52811.getClass(), "judgeJustice", 518866176);
        setIntField(term52811, term52811.getClass(), "judgeCritical", -1352533284);
        setIntField(term52811, term52811.getClass(), "playerRating", -149022151);
        setBooleanField(term52811, term52811.getClass(), "isNewRecord", false);
        setBooleanField(term52811, term52811.getClass(), "isFullCombo", true);
        setIntField(term52811, term52811.getClass(), "fullChainKind", -2128082017);
        setBooleanField(term52811, term52811.getClass(), "isAllJustice", true);
        setIntField(term52811, term52811.getClass(), "characterId", -626860638);
        setIntField(term52811, term52811.getClass(), "skillId", 969445811);
        setIntField(term52811, term52811.getClass(), "playKind", -1232355383);
        setBooleanField(term52811, term52811.getClass(), "isClear", false);
        setIntField(term52811, term52811.getClass(), "skillLevel", 1599985157);
        setIntField(term52811, term52811.getClass(), "skillEffect", 80735812);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkillId", argTypes, term52811, args);
    }

};


