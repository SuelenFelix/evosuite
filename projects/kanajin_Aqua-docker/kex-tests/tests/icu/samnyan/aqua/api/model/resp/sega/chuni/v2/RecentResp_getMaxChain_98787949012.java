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

public class RecentResp_getMaxChain_98787949012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46809;

    public RecentResp_getMaxChain_98787949012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46809 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term46810 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46811 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46815 = newInstance(Class.forName("java.time.LocalTime"));
        Object term46820 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46821 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46825 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term46811, term46811.getClass(), "year", 2027);
        setShortField(term46811, term46811.getClass(), "month", (short) 9);
        setShortField(term46811, term46811.getClass(), "day", (short) 19);
        setField(term46810, term46810.getClass(), "date", term46811);
        setByteField(term46815, term46815.getClass(), "hour", (byte) 13);
        setByteField(term46815, term46815.getClass(), "minute", (byte) 17);
        setByteField(term46815, term46815.getClass(), "second", (byte) 43);
        setIntField(term46815, term46815.getClass(), "nano", 359493485);
        setField(term46810, term46810.getClass(), "time", term46815);
        setField(term46809, term46809.getClass(), "playDate", term46810);
        setIntField(term46821, term46821.getClass(), "year", 2028);
        setShortField(term46821, term46821.getClass(), "month", (short) 2);
        setShortField(term46821, term46821.getClass(), "day", (short) 3);
        setField(term46820, term46820.getClass(), "date", term46821);
        setByteField(term46825, term46825.getClass(), "hour", (byte) 14);
        setByteField(term46825, term46825.getClass(), "minute", (byte) 31);
        setByteField(term46825, term46825.getClass(), "second", (byte) 5);
        setIntField(term46825, term46825.getClass(), "nano", 770924836);
        setField(term46820, term46820.getClass(), "time", term46825);
        setField(term46809, term46809.getClass(), "userPlayDate", term46820);
        setIntField(term46809, term46809.getClass(), "musicId", 138913824);
        setIntField(term46809, term46809.getClass(), "level", -637767208);
        setIntField(term46809, term46809.getClass(), "customId", 844890845);
        setIntField(term46809, term46809.getClass(), "playedCustom1", -989538894);
        setIntField(term46809, term46809.getClass(), "playedCustom2", 1316863342);
        setIntField(term46809, term46809.getClass(), "playedCustom3", 735033722);
        setIntField(term46809, term46809.getClass(), "track", -1409886459);
        setIntField(term46809, term46809.getClass(), "score", 666379561);
        setIntField(term46809, term46809.getClass(), "rank", 1071163503);
        setIntField(term46809, term46809.getClass(), "maxCombo", -1507726422);
        setIntField(term46809, term46809.getClass(), "maxChain", 171429081);
        setIntField(term46809, term46809.getClass(), "rateTap", 1552107519);
        setIntField(term46809, term46809.getClass(), "rateHold", -1952294830);
        setIntField(term46809, term46809.getClass(), "rateSlide", -1756012081);
        setIntField(term46809, term46809.getClass(), "rateAir", 879317718);
        setIntField(term46809, term46809.getClass(), "rateFlick", -1205568351);
        setIntField(term46809, term46809.getClass(), "judgeGuilty", -1038188576);
        setIntField(term46809, term46809.getClass(), "judgeAttack", -190354157);
        setIntField(term46809, term46809.getClass(), "judgeJustice", 878906837);
        setIntField(term46809, term46809.getClass(), "judgeCritical", -1578163757);
        setIntField(term46809, term46809.getClass(), "playerRating", -1361859122);
        setBooleanField(term46809, term46809.getClass(), "isNewRecord", true);
        setBooleanField(term46809, term46809.getClass(), "isFullCombo", false);
        setIntField(term46809, term46809.getClass(), "fullChainKind", -1130681822);
        setBooleanField(term46809, term46809.getClass(), "isAllJustice", true);
        setIntField(term46809, term46809.getClass(), "characterId", 1224219518);
        setIntField(term46809, term46809.getClass(), "skillId", 1466055196);
        setIntField(term46809, term46809.getClass(), "playKind", -1310910895);
        setBooleanField(term46809, term46809.getClass(), "isClear", false);
        setIntField(term46809, term46809.getClass(), "skillLevel", -1504228047);
        setIntField(term46809, term46809.getClass(), "skillEffect", 1642235898);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxChain", argTypes, term46809, args);
    }

};


