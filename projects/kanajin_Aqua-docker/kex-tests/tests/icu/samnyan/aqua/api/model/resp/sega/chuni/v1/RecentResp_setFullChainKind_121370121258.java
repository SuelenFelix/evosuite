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
import java.lang.Integer;

public class RecentResp_setFullChainKind_121370121258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54437;
     Object term54489;

    public RecentResp_setFullChainKind_121370121258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54437 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term54438 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54439 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54443 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54448 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54449 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54453 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term54439, term54439.getClass(), "year", 2013);
        setShortField(term54439, term54439.getClass(), "month", (short) 9);
        setShortField(term54439, term54439.getClass(), "day", (short) 14);
        setField(term54438, term54438.getClass(), "date", term54439);
        setByteField(term54443, term54443.getClass(), "hour", (byte) 18);
        setByteField(term54443, term54443.getClass(), "minute", (byte) 10);
        setByteField(term54443, term54443.getClass(), "second", (byte) 39);
        setIntField(term54443, term54443.getClass(), "nano", 650634905);
        setField(term54438, term54438.getClass(), "time", term54443);
        setField(term54437, term54437.getClass(), "playDate", term54438);
        setIntField(term54449, term54449.getClass(), "year", 2012);
        setShortField(term54449, term54449.getClass(), "month", (short) 8);
        setShortField(term54449, term54449.getClass(), "day", (short) 8);
        setField(term54448, term54448.getClass(), "date", term54449);
        setByteField(term54453, term54453.getClass(), "hour", (byte) 5);
        setByteField(term54453, term54453.getClass(), "minute", (byte) 3);
        setByteField(term54453, term54453.getClass(), "second", (byte) 9);
        setIntField(term54453, term54453.getClass(), "nano", 246856443);
        setField(term54448, term54448.getClass(), "time", term54453);
        setField(term54437, term54437.getClass(), "userPlayDate", term54448);
        setIntField(term54437, term54437.getClass(), "musicId", -1583672247);
        setIntField(term54437, term54437.getClass(), "level", 1150713854);
        setIntField(term54437, term54437.getClass(), "customId", 999843869);
        setIntField(term54437, term54437.getClass(), "playedCustom1", 1047162942);
        setIntField(term54437, term54437.getClass(), "playedCustom2", 555668629);
        setIntField(term54437, term54437.getClass(), "playedCustom3", -704789127);
        setIntField(term54437, term54437.getClass(), "track", 2018335018);
        setIntField(term54437, term54437.getClass(), "score", 524629103);
        setIntField(term54437, term54437.getClass(), "rank", 601775827);
        setIntField(term54437, term54437.getClass(), "maxCombo", 1713144877);
        setIntField(term54437, term54437.getClass(), "maxChain", -513074841);
        setIntField(term54437, term54437.getClass(), "rateTap", -1384079183);
        setIntField(term54437, term54437.getClass(), "rateHold", -1401413822);
        setIntField(term54437, term54437.getClass(), "rateSlide", -1735958377);
        setIntField(term54437, term54437.getClass(), "rateAir", -477618469);
        setIntField(term54437, term54437.getClass(), "rateFlick", 117739625);
        setIntField(term54437, term54437.getClass(), "judgeGuilty", -314816968);
        setIntField(term54437, term54437.getClass(), "judgeAttack", -1478972076);
        setIntField(term54437, term54437.getClass(), "judgeJustice", 828708445);
        setIntField(term54437, term54437.getClass(), "judgeCritical", -1198357943);
        setIntField(term54437, term54437.getClass(), "playerRating", 407342373);
        setBooleanField(term54437, term54437.getClass(), "isNewRecord", false);
        setBooleanField(term54437, term54437.getClass(), "isFullCombo", false);
        setIntField(term54437, term54437.getClass(), "fullChainKind", 633857490);
        setBooleanField(term54437, term54437.getClass(), "isAllJustice", true);
        setIntField(term54437, term54437.getClass(), "characterId", -602285518);
        setIntField(term54437, term54437.getClass(), "skillId", 95548457);
        setIntField(term54437, term54437.getClass(), "playKind", -652818479);
        setBooleanField(term54437, term54437.getClass(), "isClear", true);
        setIntField(term54437, term54437.getClass(), "skillLevel", 909221962);
        setIntField(term54437, term54437.getClass(), "skillEffect", 1036562171);
        term54489 = new Integer(-1176098787);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term54489;
        callMethod(klass, "setFullChainKind", argTypes, term54437, args);
    }

};


