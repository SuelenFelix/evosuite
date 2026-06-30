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

public class PlayerPvRecord_getRgoPurchased_208746591411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term595232;

    public PlayerPvRecord_getRgoPurchased_208746591411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term595890 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term595889 = ((Class) term595890).getDeclaredField((String) "MISS");
        ((Field) term595889).setAccessible(true);
        Object enum1303 = ((Field) term595889).get((Object) null);
        Class<? extends Object> term596267 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term596266 = ((Class) term596267).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term596266).setAccessible(true);
        Object enum1304 = ((Field) term596266).get((Object) null);
        Class<? extends Object> term596550 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term596549 = ((Class) term596550).getDeclaredField((String) "NORMAL");
        ((Field) term596549).setAccessible(true);
        Object enum1305 = ((Field) term596549).get((Object) null);
        Class<? extends Object> term596825 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term596824 = ((Class) term596825).getDeclaredField((String) "ORIGINAL");
        ((Field) term596824).setAccessible(true);
        Object enum1306 = ((Field) term596824).get((Object) null);
        Class<? extends Object> term597091 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term597090 = ((Class) term597091).getDeclaredField((String) "NONE");
        ((Field) term597090).setAccessible(true);
        Object enum1307 = ((Field) term597090).get((Object) null);
        Class<? extends Object> term597732 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term597731 = ((Class) term597732).getDeclaredField((String) "NO_CLEAR");
        ((Field) term597731).setAccessible(true);
        Object enum1308 = ((Field) term597731).get((Object) null);
        Class<? extends Object> term598018 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term598017 = ((Class) term598018).getDeclaredField((String) "UNDEFINED");
        ((Field) term598017).setAccessible(true);
        Object enum1309 = ((Field) term598017).get((Object) null);
        term595232 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        Object term595234 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term595357 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term595358 = newInstance(Class.forName("java.time.LocalDate"));
        Object term595362 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term595232, term595232.getClass(), "id", -2083524977884307536L);
        setLongField(term595234, term595234.getClass(), "id", -2691996476200751382L);
        setIntField(term595234, term595234.getClass(), "pdId", -1965240023);
        setField(term595234, term595234.getClass(), "playerName", "xxx");
        setIntField(term595234, term595234.getClass(), "vocaloidPoints", 300);
        setIntField(term595234, term595234.getClass(), "level", 1);
        setIntField(term595234, term595234.getClass(), "levelExp", -86860026);
        setField(term595234, term595234.getClass(), "levelTitle", "xxx");
        setIntField(term595234, term595234.getClass(), "plateId", -1);
        setIntField(term595234, term595234.getClass(), "plateEffectId", -1);
        setField(term595234, term595234.getClass(), "passwordStatus", enum1303);
        setField(term595234, term595234.getClass(), "password", "**********");
        setBooleanField(term595234, term595234.getClass(), "preferPerPvModule", true);
        setBooleanField(term595234, term595234.getClass(), "preferCommonModule", false);
        setBooleanField(term595234, term595234.getClass(), "usePerPvSkin", false);
        setBooleanField(term595234, term595234.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term595234, term595234.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term595234, term595234.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term595234, term595234.getClass(), "usePerPvTouchSliderSe", false);
        setField(term595234, term595234.getClass(), "commonModule", "-999,-999,-999");
        setField(term595234, term595234.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term595358, term595358.getClass(), "year", 2026);
        setShortField(term595358, term595358.getClass(), "month", (short) 6);
        setShortField(term595358, term595358.getClass(), "day", (short) 29);
        setField(term595357, term595357.getClass(), "date", term595358);
        setByteField(term595362, term595362.getClass(), "hour", (byte) 4);
        setByteField(term595362, term595362.getClass(), "minute", (byte) 28);
        setByteField(term595362, term595362.getClass(), "second", (byte) 50);
        setIntField(term595362, term595362.getClass(), "nano", 265086000);
        setField(term595357, term595357.getClass(), "time", term595362);
        setField(term595234, term595234.getClass(), "commonModuleSetTime", term595357);
        setField(term595234, term595234.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term595234, term595234.getClass(), "commonSkin", -1);
        setIntField(term595234, term595234.getClass(), "headphoneVolume", 100);
        setBooleanField(term595234, term595234.getClass(), "buttonSeOn", true);
        setIntField(term595234, term595234.getClass(), "buttonSeVolume", 100);
        setIntField(term595234, term595234.getClass(), "sliderSeVolume", 100);
        setIntField(term595234, term595234.getClass(), "buttonSe", -1);
        setIntField(term595234, term595234.getClass(), "chainSlideSe", -1);
        setIntField(term595234, term595234.getClass(), "slideSe", -1);
        setIntField(term595234, term595234.getClass(), "sliderTouchSe", -1);
        setField(term595234, term595234.getClass(), "sortMode", enum1304);
        setIntField(term595234, term595234.getClass(), "nextPvId", -1);
        setField(term595234, term595234.getClass(), "nextDifficulty", enum1305);
        setField(term595234, term595234.getClass(), "nextEdition", enum1306);
        setBooleanField(term595234, term595234.getClass(), "showInterimRanking", true);
        setBooleanField(term595234, term595234.getClass(), "showClearStatus", true);
        setBooleanField(term595234, term595234.getClass(), "showGreatBorder", true);
        setBooleanField(term595234, term595234.getClass(), "showExcellentBorder", true);
        setBooleanField(term595234, term595234.getClass(), "showRivalBorder", true);
        setBooleanField(term595234, term595234.getClass(), "showRgoSetting", true);
        setBooleanField(term595234, term595234.getClass(), "contestNowPlayingEnable", false);
        setIntField(term595234, term595234.getClass(), "contestNowPlayingId", -1);
        setIntField(term595234, term595234.getClass(), "contestNowPlayingValue", -1);
        setField(term595234, term595234.getClass(), "contestNowPlayingResultRank", enum1307);
        setField(term595234, term595234.getClass(), "contestNowPlayingSpecifier", "");
        setField(term595234, term595234.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term595234, term595234.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term595234, term595234.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term595234, term595234.getClass(), "rivalPdId", -1);
        setField(term595232, term595232.getClass(), "pdId", term595234);
        setIntField(term595232, term595232.getClass(), "pvId", -1);
        setField(term595232, term595232.getClass(), "edition", enum1306);
        setField(term595232, term595232.getClass(), "difficulty", enum1305);
        setField(term595232, term595232.getClass(), "result", enum1308);
        setIntField(term595232, term595232.getClass(), "maxScore", -1);
        setIntField(term595232, term595232.getClass(), "maxAttain", -1);
        setField(term595232, term595232.getClass(), "challengeKind", enum1309);
        setField(term595232, term595232.getClass(), "rgoPurchased", "0,0,0");
        setField(term595232, term595232.getClass(), "rgoPlayed", "0,0,0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRgoPurchased", argTypes, term595232, args);
    }

};


