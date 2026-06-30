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

public class RecentResp_getFullChainKind_213736211825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52655;

    public RecentResp_getFullChainKind_213736211825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52655 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term52656 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52657 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52661 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52666 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52667 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52671 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term52657, term52657.getClass(), "year", 2018);
        setShortField(term52657, term52657.getClass(), "month", (short) 12);
        setShortField(term52657, term52657.getClass(), "day", (short) 4);
        setField(term52656, term52656.getClass(), "date", term52657);
        setByteField(term52661, term52661.getClass(), "hour", (byte) 6);
        setByteField(term52661, term52661.getClass(), "minute", (byte) 23);
        setByteField(term52661, term52661.getClass(), "second", (byte) 36);
        setIntField(term52661, term52661.getClass(), "nano", 89535482);
        setField(term52656, term52656.getClass(), "time", term52661);
        setField(term52655, term52655.getClass(), "playDate", term52656);
        setIntField(term52667, term52667.getClass(), "year", 2020);
        setShortField(term52667, term52667.getClass(), "month", (short) 1);
        setShortField(term52667, term52667.getClass(), "day", (short) 16);
        setField(term52666, term52666.getClass(), "date", term52667);
        setByteField(term52671, term52671.getClass(), "hour", (byte) 1);
        setByteField(term52671, term52671.getClass(), "minute", (byte) 58);
        setByteField(term52671, term52671.getClass(), "second", (byte) 17);
        setIntField(term52671, term52671.getClass(), "nano", 383254195);
        setField(term52666, term52666.getClass(), "time", term52671);
        setField(term52655, term52655.getClass(), "userPlayDate", term52666);
        setIntField(term52655, term52655.getClass(), "musicId", -2004177132);
        setIntField(term52655, term52655.getClass(), "level", 1111078487);
        setIntField(term52655, term52655.getClass(), "customId", 1426568609);
        setIntField(term52655, term52655.getClass(), "playedCustom1", -1214249196);
        setIntField(term52655, term52655.getClass(), "playedCustom2", -500814419);
        setIntField(term52655, term52655.getClass(), "playedCustom3", -584375380);
        setIntField(term52655, term52655.getClass(), "track", 1906067765);
        setIntField(term52655, term52655.getClass(), "score", -1141978353);
        setIntField(term52655, term52655.getClass(), "rank", 1877297875);
        setIntField(term52655, term52655.getClass(), "maxCombo", -614739795);
        setIntField(term52655, term52655.getClass(), "maxChain", 1805124024);
        setIntField(term52655, term52655.getClass(), "rateTap", -1415507503);
        setIntField(term52655, term52655.getClass(), "rateHold", 424884647);
        setIntField(term52655, term52655.getClass(), "rateSlide", -881760055);
        setIntField(term52655, term52655.getClass(), "rateAir", 873700519);
        setIntField(term52655, term52655.getClass(), "rateFlick", 805310057);
        setIntField(term52655, term52655.getClass(), "judgeGuilty", -107339699);
        setIntField(term52655, term52655.getClass(), "judgeAttack", -58728001);
        setIntField(term52655, term52655.getClass(), "judgeJustice", 1013952192);
        setIntField(term52655, term52655.getClass(), "judgeCritical", -986675483);
        setIntField(term52655, term52655.getClass(), "playerRating", 337370099);
        setBooleanField(term52655, term52655.getClass(), "isNewRecord", true);
        setBooleanField(term52655, term52655.getClass(), "isFullCombo", true);
        setIntField(term52655, term52655.getClass(), "fullChainKind", -824145581);
        setBooleanField(term52655, term52655.getClass(), "isAllJustice", true);
        setIntField(term52655, term52655.getClass(), "characterId", -769314399);
        setIntField(term52655, term52655.getClass(), "skillId", -59737304);
        setIntField(term52655, term52655.getClass(), "playKind", -1878753007);
        setBooleanField(term52655, term52655.getClass(), "isClear", true);
        setIntField(term52655, term52655.getClass(), "skillLevel", -411059650);
        setIntField(term52655, term52655.getClass(), "skillEffect", 811517871);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFullChainKind", argTypes, term52655, args);
    }

};


