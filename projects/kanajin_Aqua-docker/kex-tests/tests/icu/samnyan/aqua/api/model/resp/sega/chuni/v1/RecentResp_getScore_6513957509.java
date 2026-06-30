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

public class RecentResp_getScore_6513957509 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51823;

    public RecentResp_getScore_6513957509() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51823 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term51824 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51825 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51829 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51834 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51835 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51839 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term51825, term51825.getClass(), "year", 2018);
        setShortField(term51825, term51825.getClass(), "month", (short) 2);
        setShortField(term51825, term51825.getClass(), "day", (short) 15);
        setField(term51824, term51824.getClass(), "date", term51825);
        setByteField(term51829, term51829.getClass(), "hour", (byte) 16);
        setByteField(term51829, term51829.getClass(), "minute", (byte) 4);
        setByteField(term51829, term51829.getClass(), "second", (byte) 19);
        setIntField(term51829, term51829.getClass(), "nano", 538124451);
        setField(term51824, term51824.getClass(), "time", term51829);
        setField(term51823, term51823.getClass(), "playDate", term51824);
        setIntField(term51835, term51835.getClass(), "year", 2013);
        setShortField(term51835, term51835.getClass(), "month", (short) 10);
        setShortField(term51835, term51835.getClass(), "day", (short) 20);
        setField(term51834, term51834.getClass(), "date", term51835);
        setByteField(term51839, term51839.getClass(), "hour", (byte) 11);
        setByteField(term51839, term51839.getClass(), "minute", (byte) 17);
        setByteField(term51839, term51839.getClass(), "second", (byte) 1);
        setIntField(term51839, term51839.getClass(), "nano", 266879040);
        setField(term51834, term51834.getClass(), "time", term51839);
        setField(term51823, term51823.getClass(), "userPlayDate", term51834);
        setIntField(term51823, term51823.getClass(), "musicId", -1585377443);
        setIntField(term51823, term51823.getClass(), "level", -1293961217);
        setIntField(term51823, term51823.getClass(), "customId", -1715210057);
        setIntField(term51823, term51823.getClass(), "playedCustom1", 118463203);
        setIntField(term51823, term51823.getClass(), "playedCustom2", -2062733514);
        setIntField(term51823, term51823.getClass(), "playedCustom3", 901520301);
        setIntField(term51823, term51823.getClass(), "track", -1536684680);
        setIntField(term51823, term51823.getClass(), "score", -322159635);
        setIntField(term51823, term51823.getClass(), "rank", 366996139);
        setIntField(term51823, term51823.getClass(), "maxCombo", 806187937);
        setIntField(term51823, term51823.getClass(), "maxChain", -1646415676);
        setIntField(term51823, term51823.getClass(), "rateTap", 1016563502);
        setIntField(term51823, term51823.getClass(), "rateHold", -1845173237);
        setIntField(term51823, term51823.getClass(), "rateSlide", -326684811);
        setIntField(term51823, term51823.getClass(), "rateAir", 1260583823);
        setIntField(term51823, term51823.getClass(), "rateFlick", -1368801661);
        setIntField(term51823, term51823.getClass(), "judgeGuilty", -2094311816);
        setIntField(term51823, term51823.getClass(), "judgeAttack", 419332770);
        setIntField(term51823, term51823.getClass(), "judgeJustice", 1742733401);
        setIntField(term51823, term51823.getClass(), "judgeCritical", 1634939612);
        setIntField(term51823, term51823.getClass(), "playerRating", -590256406);
        setBooleanField(term51823, term51823.getClass(), "isNewRecord", true);
        setBooleanField(term51823, term51823.getClass(), "isFullCombo", false);
        setIntField(term51823, term51823.getClass(), "fullChainKind", -1319797966);
        setBooleanField(term51823, term51823.getClass(), "isAllJustice", false);
        setIntField(term51823, term51823.getClass(), "characterId", -388682282);
        setIntField(term51823, term51823.getClass(), "skillId", 2028706829);
        setIntField(term51823, term51823.getClass(), "playKind", -656080518);
        setBooleanField(term51823, term51823.getClass(), "isClear", false);
        setIntField(term51823, term51823.getClass(), "skillLevel", 1769230265);
        setIntField(term51823, term51823.getClass(), "skillEffect", -1946503216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScore", argTypes, term51823, args);
    }

};


