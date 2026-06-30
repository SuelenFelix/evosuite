package icu.samnyan.aqua.sega.diva.model.userdata;

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
import static icu.samnyan.aqua.sega.diva.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class PlayerPvRecord_getPvId_9031406594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term573574;

    public PlayerPvRecord_getPvId_9031406594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term574232 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term574231 = ((Class) term574232).getDeclaredField((String) "MISS");
        ((Field) term574231).setAccessible(true);
        Object enum1254 = ((Field) term574231).get((Object) null);
        Class<? extends Object> term574609 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term574608 = ((Class) term574609).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term574608).setAccessible(true);
        Object enum1255 = ((Field) term574608).get((Object) null);
        Class<? extends Object> term574892 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term574891 = ((Class) term574892).getDeclaredField((String) "NORMAL");
        ((Field) term574891).setAccessible(true);
        Object enum1256 = ((Field) term574891).get((Object) null);
        Class<? extends Object> term575167 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term575166 = ((Class) term575167).getDeclaredField((String) "ORIGINAL");
        ((Field) term575166).setAccessible(true);
        Object enum1257 = ((Field) term575166).get((Object) null);
        Class<? extends Object> term575433 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term575432 = ((Class) term575433).getDeclaredField((String) "NONE");
        ((Field) term575432).setAccessible(true);
        Object enum1258 = ((Field) term575432).get((Object) null);
        Class<? extends Object> term576074 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term576073 = ((Class) term576074).getDeclaredField((String) "NO_CLEAR");
        ((Field) term576073).setAccessible(true);
        Object enum1259 = ((Field) term576073).get((Object) null);
        Class<? extends Object> term576360 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term576359 = ((Class) term576360).getDeclaredField((String) "UNDEFINED");
        ((Field) term576359).setAccessible(true);
        Object enum1260 = ((Field) term576359).get((Object) null);
        term573574 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        Object term573576 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term573699 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term573700 = newInstance(Class.forName("java.time.LocalDate"));
        Object term573704 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term573574, term573574.getClass(), "id", -7005300544167632229L);
        setLongField(term573576, term573576.getClass(), "id", -278716491237139968L);
        setIntField(term573576, term573576.getClass(), "pdId", 1082643319);
        setField(term573576, term573576.getClass(), "playerName", "xxx");
        setIntField(term573576, term573576.getClass(), "vocaloidPoints", 300);
        setIntField(term573576, term573576.getClass(), "level", 1);
        setIntField(term573576, term573576.getClass(), "levelExp", -1138616222);
        setField(term573576, term573576.getClass(), "levelTitle", "xxx");
        setIntField(term573576, term573576.getClass(), "plateId", -1);
        setIntField(term573576, term573576.getClass(), "plateEffectId", -1);
        setField(term573576, term573576.getClass(), "passwordStatus", enum1254);
        setField(term573576, term573576.getClass(), "password", "**********");
        setBooleanField(term573576, term573576.getClass(), "preferPerPvModule", true);
        setBooleanField(term573576, term573576.getClass(), "preferCommonModule", true);
        setBooleanField(term573576, term573576.getClass(), "usePerPvSkin", false);
        setBooleanField(term573576, term573576.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term573576, term573576.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term573576, term573576.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term573576, term573576.getClass(), "usePerPvTouchSliderSe", true);
        setField(term573576, term573576.getClass(), "commonModule", "-999,-999,-999");
        setField(term573576, term573576.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term573700, term573700.getClass(), "year", 2026);
        setShortField(term573700, term573700.getClass(), "month", (short) 6);
        setShortField(term573700, term573700.getClass(), "day", (short) 29);
        setField(term573699, term573699.getClass(), "date", term573700);
        setByteField(term573704, term573704.getClass(), "hour", (byte) 4);
        setByteField(term573704, term573704.getClass(), "minute", (byte) 28);
        setByteField(term573704, term573704.getClass(), "second", (byte) 48);
        setIntField(term573704, term573704.getClass(), "nano", 476130000);
        setField(term573699, term573699.getClass(), "time", term573704);
        setField(term573576, term573576.getClass(), "commonModuleSetTime", term573699);
        setField(term573576, term573576.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term573576, term573576.getClass(), "commonSkin", -1);
        setIntField(term573576, term573576.getClass(), "headphoneVolume", 100);
        setBooleanField(term573576, term573576.getClass(), "buttonSeOn", true);
        setIntField(term573576, term573576.getClass(), "buttonSeVolume", 100);
        setIntField(term573576, term573576.getClass(), "sliderSeVolume", 100);
        setIntField(term573576, term573576.getClass(), "buttonSe", -1);
        setIntField(term573576, term573576.getClass(), "chainSlideSe", -1);
        setIntField(term573576, term573576.getClass(), "slideSe", -1);
        setIntField(term573576, term573576.getClass(), "sliderTouchSe", -1);
        setField(term573576, term573576.getClass(), "sortMode", enum1255);
        setIntField(term573576, term573576.getClass(), "nextPvId", -1);
        setField(term573576, term573576.getClass(), "nextDifficulty", enum1256);
        setField(term573576, term573576.getClass(), "nextEdition", enum1257);
        setBooleanField(term573576, term573576.getClass(), "showInterimRanking", true);
        setBooleanField(term573576, term573576.getClass(), "showClearStatus", true);
        setBooleanField(term573576, term573576.getClass(), "showGreatBorder", true);
        setBooleanField(term573576, term573576.getClass(), "showExcellentBorder", true);
        setBooleanField(term573576, term573576.getClass(), "showRivalBorder", true);
        setBooleanField(term573576, term573576.getClass(), "showRgoSetting", true);
        setBooleanField(term573576, term573576.getClass(), "contestNowPlayingEnable", true);
        setIntField(term573576, term573576.getClass(), "contestNowPlayingId", -1);
        setIntField(term573576, term573576.getClass(), "contestNowPlayingValue", -1);
        setField(term573576, term573576.getClass(), "contestNowPlayingResultRank", enum1258);
        setField(term573576, term573576.getClass(), "contestNowPlayingSpecifier", "");
        setField(term573576, term573576.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term573576, term573576.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term573576, term573576.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term573576, term573576.getClass(), "rivalPdId", -1);
        setField(term573574, term573574.getClass(), "pdId", term573576);
        setIntField(term573574, term573574.getClass(), "pvId", -1);
        setField(term573574, term573574.getClass(), "edition", enum1257);
        setField(term573574, term573574.getClass(), "difficulty", enum1256);
        setField(term573574, term573574.getClass(), "result", enum1259);
        setIntField(term573574, term573574.getClass(), "maxScore", -1);
        setIntField(term573574, term573574.getClass(), "maxAttain", -1);
        setField(term573574, term573574.getClass(), "challengeKind", enum1260);
        setField(term573574, term573574.getClass(), "rgoPurchased", "0,0,0");
        setField(term573574, term573574.getClass(), "rgoPlayed", "0,0,0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPvId", argTypes, term573574, args);
    }

};


