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
import java.lang.Integer;

public class RecentResp_setMusicId_67004412935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48025;
     Object term48077;

    public RecentResp_setMusicId_67004412935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48025 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term48026 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48027 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48031 = newInstance(Class.forName("java.time.LocalTime"));
        Object term48036 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48037 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48041 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term48027, term48027.getClass(), "year", 2017);
        setShortField(term48027, term48027.getClass(), "month", (short) 8);
        setShortField(term48027, term48027.getClass(), "day", (short) 31);
        setField(term48026, term48026.getClass(), "date", term48027);
        setByteField(term48031, term48031.getClass(), "hour", (byte) 12);
        setByteField(term48031, term48031.getClass(), "minute", (byte) 32);
        setByteField(term48031, term48031.getClass(), "second", (byte) 28);
        setIntField(term48031, term48031.getClass(), "nano", 428210685);
        setField(term48026, term48026.getClass(), "time", term48031);
        setField(term48025, term48025.getClass(), "playDate", term48026);
        setIntField(term48037, term48037.getClass(), "year", 2013);
        setShortField(term48037, term48037.getClass(), "month", (short) 8);
        setShortField(term48037, term48037.getClass(), "day", (short) 27);
        setField(term48036, term48036.getClass(), "date", term48037);
        setByteField(term48041, term48041.getClass(), "hour", (byte) 16);
        setByteField(term48041, term48041.getClass(), "minute", (byte) 55);
        setByteField(term48041, term48041.getClass(), "second", (byte) 23);
        setIntField(term48041, term48041.getClass(), "nano", 979193613);
        setField(term48036, term48036.getClass(), "time", term48041);
        setField(term48025, term48025.getClass(), "userPlayDate", term48036);
        setIntField(term48025, term48025.getClass(), "musicId", 966678407);
        setIntField(term48025, term48025.getClass(), "level", -881632231);
        setIntField(term48025, term48025.getClass(), "customId", -1285148224);
        setIntField(term48025, term48025.getClass(), "playedCustom1", -2002558482);
        setIntField(term48025, term48025.getClass(), "playedCustom2", 794384312);
        setIntField(term48025, term48025.getClass(), "playedCustom3", 1166664554);
        setIntField(term48025, term48025.getClass(), "track", -1287204441);
        setIntField(term48025, term48025.getClass(), "score", 1826016641);
        setIntField(term48025, term48025.getClass(), "rank", 1726886771);
        setIntField(term48025, term48025.getClass(), "maxCombo", 1045689376);
        setIntField(term48025, term48025.getClass(), "maxChain", 767458787);
        setIntField(term48025, term48025.getClass(), "rateTap", 2103721338);
        setIntField(term48025, term48025.getClass(), "rateHold", 621330308);
        setIntField(term48025, term48025.getClass(), "rateSlide", -1597424060);
        setIntField(term48025, term48025.getClass(), "rateAir", 243854303);
        setIntField(term48025, term48025.getClass(), "rateFlick", 1754709105);
        setIntField(term48025, term48025.getClass(), "judgeGuilty", 1523196898);
        setIntField(term48025, term48025.getClass(), "judgeAttack", 2061147445);
        setIntField(term48025, term48025.getClass(), "judgeJustice", -531060561);
        setIntField(term48025, term48025.getClass(), "judgeCritical", -1974107061);
        setIntField(term48025, term48025.getClass(), "playerRating", -1806271948);
        setBooleanField(term48025, term48025.getClass(), "isNewRecord", true);
        setBooleanField(term48025, term48025.getClass(), "isFullCombo", false);
        setIntField(term48025, term48025.getClass(), "fullChainKind", 1708731871);
        setBooleanField(term48025, term48025.getClass(), "isAllJustice", true);
        setIntField(term48025, term48025.getClass(), "characterId", 1855866160);
        setIntField(term48025, term48025.getClass(), "skillId", -1463148153);
        setIntField(term48025, term48025.getClass(), "playKind", -121679722);
        setBooleanField(term48025, term48025.getClass(), "isClear", false);
        setIntField(term48025, term48025.getClass(), "skillLevel", -1283714004);
        setIntField(term48025, term48025.getClass(), "skillEffect", -1085038483);
        term48077 = new Integer(1089796055);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term48077;
        callMethod(klass, "setMusicId", argTypes, term48025, args);
    }

};


