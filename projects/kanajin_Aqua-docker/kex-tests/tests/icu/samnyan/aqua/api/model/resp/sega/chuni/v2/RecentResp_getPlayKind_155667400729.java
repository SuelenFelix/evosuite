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

public class RecentResp_getPlayKind_155667400729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47693;

    public RecentResp_getPlayKind_155667400729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47693 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term47694 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47695 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47699 = newInstance(Class.forName("java.time.LocalTime"));
        Object term47704 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47705 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47709 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term47695, term47695.getClass(), "year", 2015);
        setShortField(term47695, term47695.getClass(), "month", (short) 8);
        setShortField(term47695, term47695.getClass(), "day", (short) 3);
        setField(term47694, term47694.getClass(), "date", term47695);
        setByteField(term47699, term47699.getClass(), "hour", (byte) 21);
        setByteField(term47699, term47699.getClass(), "minute", (byte) 57);
        setByteField(term47699, term47699.getClass(), "second", (byte) 2);
        setIntField(term47699, term47699.getClass(), "nano", 438141628);
        setField(term47694, term47694.getClass(), "time", term47699);
        setField(term47693, term47693.getClass(), "playDate", term47694);
        setIntField(term47705, term47705.getClass(), "year", 2011);
        setShortField(term47705, term47705.getClass(), "month", (short) 3);
        setShortField(term47705, term47705.getClass(), "day", (short) 10);
        setField(term47704, term47704.getClass(), "date", term47705);
        setByteField(term47709, term47709.getClass(), "hour", (byte) 4);
        setByteField(term47709, term47709.getClass(), "minute", (byte) 13);
        setByteField(term47709, term47709.getClass(), "second", (byte) 46);
        setIntField(term47709, term47709.getClass(), "nano", 212390008);
        setField(term47704, term47704.getClass(), "time", term47709);
        setField(term47693, term47693.getClass(), "userPlayDate", term47704);
        setIntField(term47693, term47693.getClass(), "musicId", 1690337049);
        setIntField(term47693, term47693.getClass(), "level", 254984950);
        setIntField(term47693, term47693.getClass(), "customId", 491595035);
        setIntField(term47693, term47693.getClass(), "playedCustom1", 2111929590);
        setIntField(term47693, term47693.getClass(), "playedCustom2", 1984033465);
        setIntField(term47693, term47693.getClass(), "playedCustom3", 415386900);
        setIntField(term47693, term47693.getClass(), "track", -80119579);
        setIntField(term47693, term47693.getClass(), "score", -725563031);
        setIntField(term47693, term47693.getClass(), "rank", 228070072);
        setIntField(term47693, term47693.getClass(), "maxCombo", 1918578349);
        setIntField(term47693, term47693.getClass(), "maxChain", -1585377443);
        setIntField(term47693, term47693.getClass(), "rateTap", -1293961217);
        setIntField(term47693, term47693.getClass(), "rateHold", -1715210057);
        setIntField(term47693, term47693.getClass(), "rateSlide", 118463203);
        setIntField(term47693, term47693.getClass(), "rateAir", -2062733514);
        setIntField(term47693, term47693.getClass(), "rateFlick", 901520301);
        setIntField(term47693, term47693.getClass(), "judgeGuilty", -1536684680);
        setIntField(term47693, term47693.getClass(), "judgeAttack", -322159635);
        setIntField(term47693, term47693.getClass(), "judgeJustice", 366996139);
        setIntField(term47693, term47693.getClass(), "judgeCritical", 806187937);
        setIntField(term47693, term47693.getClass(), "playerRating", -1646415676);
        setBooleanField(term47693, term47693.getClass(), "isNewRecord", false);
        setBooleanField(term47693, term47693.getClass(), "isFullCombo", true);
        setIntField(term47693, term47693.getClass(), "fullChainKind", 1016563502);
        setBooleanField(term47693, term47693.getClass(), "isAllJustice", true);
        setIntField(term47693, term47693.getClass(), "characterId", -1845173237);
        setIntField(term47693, term47693.getClass(), "skillId", -326684811);
        setIntField(term47693, term47693.getClass(), "playKind", 1260583823);
        setBooleanField(term47693, term47693.getClass(), "isClear", false);
        setIntField(term47693, term47693.getClass(), "skillLevel", -1368801661);
        setIntField(term47693, term47693.getClass(), "skillEffect", -2094311816);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayKind", argTypes, term47693, args);
    }

};


