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

public class RecentResp_getRateAir_187105135916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47017;

    public RecentResp_getRateAir_187105135916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47017 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term47018 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47019 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47023 = newInstance(Class.forName("java.time.LocalTime"));
        Object term47028 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47029 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47033 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term47019, term47019.getClass(), "year", 2015);
        setShortField(term47019, term47019.getClass(), "month", (short) 7);
        setShortField(term47019, term47019.getClass(), "day", (short) 16);
        setField(term47018, term47018.getClass(), "date", term47019);
        setByteField(term47023, term47023.getClass(), "hour", (byte) 15);
        setByteField(term47023, term47023.getClass(), "minute", (byte) 28);
        setByteField(term47023, term47023.getClass(), "second", (byte) 35);
        setIntField(term47023, term47023.getClass(), "nano", 374805749);
        setField(term47018, term47018.getClass(), "time", term47023);
        setField(term47017, term47017.getClass(), "playDate", term47018);
        setIntField(term47029, term47029.getClass(), "year", 2021);
        setShortField(term47029, term47029.getClass(), "month", (short) 6);
        setShortField(term47029, term47029.getClass(), "day", (short) 19);
        setField(term47028, term47028.getClass(), "date", term47029);
        setByteField(term47033, term47033.getClass(), "hour", (byte) 17);
        setByteField(term47033, term47033.getClass(), "minute", (byte) 58);
        setByteField(term47033, term47033.getClass(), "second", (byte) 4);
        setIntField(term47033, term47033.getClass(), "nano", 753905173);
        setField(term47028, term47028.getClass(), "time", term47033);
        setField(term47017, term47017.getClass(), "userPlayDate", term47028);
        setIntField(term47017, term47017.getClass(), "musicId", -1649429373);
        setIntField(term47017, term47017.getClass(), "level", -1605518502);
        setIntField(term47017, term47017.getClass(), "customId", -499081946);
        setIntField(term47017, term47017.getClass(), "playedCustom1", 1834067063);
        setIntField(term47017, term47017.getClass(), "playedCustom2", -1578513908);
        setIntField(term47017, term47017.getClass(), "playedCustom3", 312330930);
        setIntField(term47017, term47017.getClass(), "track", 1635910980);
        setIntField(term47017, term47017.getClass(), "score", 1560346640);
        setIntField(term47017, term47017.getClass(), "rank", 100626332);
        setIntField(term47017, term47017.getClass(), "maxCombo", 763794722);
        setIntField(term47017, term47017.getClass(), "maxChain", -696403395);
        setIntField(term47017, term47017.getClass(), "rateTap", 227321148);
        setIntField(term47017, term47017.getClass(), "rateHold", -266870537);
        setIntField(term47017, term47017.getClass(), "rateSlide", -453010858);
        setIntField(term47017, term47017.getClass(), "rateAir", -1855427206);
        setIntField(term47017, term47017.getClass(), "rateFlick", -647618746);
        setIntField(term47017, term47017.getClass(), "judgeGuilty", -91129577);
        setIntField(term47017, term47017.getClass(), "judgeAttack", 1629059877);
        setIntField(term47017, term47017.getClass(), "judgeJustice", -649940550);
        setIntField(term47017, term47017.getClass(), "judgeCritical", 36785954);
        setIntField(term47017, term47017.getClass(), "playerRating", -907057089);
        setBooleanField(term47017, term47017.getClass(), "isNewRecord", true);
        setBooleanField(term47017, term47017.getClass(), "isFullCombo", false);
        setIntField(term47017, term47017.getClass(), "fullChainKind", -1740998635);
        setBooleanField(term47017, term47017.getClass(), "isAllJustice", false);
        setIntField(term47017, term47017.getClass(), "characterId", 183857482);
        setIntField(term47017, term47017.getClass(), "skillId", -1845135476);
        setIntField(term47017, term47017.getClass(), "playKind", -811321521);
        setBooleanField(term47017, term47017.getClass(), "isClear", false);
        setIntField(term47017, term47017.getClass(), "skillLevel", 449172516);
        setIntField(term47017, term47017.getClass(), "skillEffect", -1224535182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRateAir", argTypes, term47017, args);
    }

};


