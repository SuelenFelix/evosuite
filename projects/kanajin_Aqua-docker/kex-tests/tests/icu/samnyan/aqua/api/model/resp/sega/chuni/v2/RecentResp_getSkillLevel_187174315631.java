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

public class RecentResp_getSkillLevel_187174315631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47797;

    public RecentResp_getSkillLevel_187174315631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47797 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term47798 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47799 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47803 = newInstance(Class.forName("java.time.LocalTime"));
        Object term47808 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47809 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47813 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term47799, term47799.getClass(), "year", 2026);
        setShortField(term47799, term47799.getClass(), "month", (short) 10);
        setShortField(term47799, term47799.getClass(), "day", (short) 15);
        setField(term47798, term47798.getClass(), "date", term47799);
        setByteField(term47803, term47803.getClass(), "hour", (byte) 15);
        setByteField(term47803, term47803.getClass(), "minute", (byte) 25);
        setByteField(term47803, term47803.getClass(), "second", (byte) 12);
        setIntField(term47803, term47803.getClass(), "nano", 467763340);
        setField(term47798, term47798.getClass(), "time", term47803);
        setField(term47797, term47797.getClass(), "playDate", term47798);
        setIntField(term47809, term47809.getClass(), "year", 2023);
        setShortField(term47809, term47809.getClass(), "month", (short) 1);
        setShortField(term47809, term47809.getClass(), "day", (short) 25);
        setField(term47808, term47808.getClass(), "date", term47809);
        setByteField(term47813, term47813.getClass(), "hour", (byte) 2);
        setByteField(term47813, term47813.getClass(), "minute", (byte) 13);
        setByteField(term47813, term47813.getClass(), "second", (byte) 2);
        setIntField(term47813, term47813.getClass(), "nano", 723644716);
        setField(term47808, term47808.getClass(), "time", term47813);
        setField(term47797, term47797.getClass(), "userPlayDate", term47808);
        setIntField(term47797, term47797.getClass(), "musicId", -712035661);
        setIntField(term47797, term47797.getClass(), "level", -545530498);
        setIntField(term47797, term47797.getClass(), "customId", -1018874255);
        setIntField(term47797, term47797.getClass(), "playedCustom1", -268930414);
        setIntField(term47797, term47797.getClass(), "playedCustom2", 1036231784);
        setIntField(term47797, term47797.getClass(), "playedCustom3", 732187274);
        setIntField(term47797, term47797.getClass(), "track", 1495500544);
        setIntField(term47797, term47797.getClass(), "score", -610532968);
        setIntField(term47797, term47797.getClass(), "rank", -1034929475);
        setIntField(term47797, term47797.getClass(), "maxCombo", 2125774573);
        setIntField(term47797, term47797.getClass(), "maxChain", -1338560431);
        setIntField(term47797, term47797.getClass(), "rateTap", 1768827963);
        setIntField(term47797, term47797.getClass(), "rateHold", -456155591);
        setIntField(term47797, term47797.getClass(), "rateSlide", -678946365);
        setIntField(term47797, term47797.getClass(), "rateAir", 2121147631);
        setIntField(term47797, term47797.getClass(), "rateFlick", 878122723);
        setIntField(term47797, term47797.getClass(), "judgeGuilty", 1612267814);
        setIntField(term47797, term47797.getClass(), "judgeAttack", 634968709);
        setIntField(term47797, term47797.getClass(), "judgeJustice", 681482688);
        setIntField(term47797, term47797.getClass(), "judgeCritical", -1435288604);
        setIntField(term47797, term47797.getClass(), "playerRating", 364335952);
        setBooleanField(term47797, term47797.getClass(), "isNewRecord", true);
        setBooleanField(term47797, term47797.getClass(), "isFullCombo", false);
        setIntField(term47797, term47797.getClass(), "fullChainKind", 254542714);
        setBooleanField(term47797, term47797.getClass(), "isAllJustice", true);
        setIntField(term47797, term47797.getClass(), "characterId", -51533463);
        setIntField(term47797, term47797.getClass(), "skillId", 2042811670);
        setIntField(term47797, term47797.getClass(), "playKind", -1713263092);
        setBooleanField(term47797, term47797.getClass(), "isClear", false);
        setIntField(term47797, term47797.getClass(), "skillLevel", 73609068);
        setIntField(term47797, term47797.getClass(), "skillEffect", -1150137872);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkillLevel", argTypes, term47797, args);
    }

};


