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

public class PlayerPvRecord_getMaxScore_11782866828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term585950;

    public PlayerPvRecord_getMaxScore_11782866828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term586608 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term586607 = ((Class) term586608).getDeclaredField((String) "MISS");
        ((Field) term586607).setAccessible(true);
        Object enum1282 = ((Field) term586607).get((Object) null);
        Class<? extends Object> term586985 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term586984 = ((Class) term586985).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term586984).setAccessible(true);
        Object enum1283 = ((Field) term586984).get((Object) null);
        Class<? extends Object> term587268 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term587267 = ((Class) term587268).getDeclaredField((String) "NORMAL");
        ((Field) term587267).setAccessible(true);
        Object enum1284 = ((Field) term587267).get((Object) null);
        Class<? extends Object> term587543 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term587542 = ((Class) term587543).getDeclaredField((String) "ORIGINAL");
        ((Field) term587542).setAccessible(true);
        Object enum1285 = ((Field) term587542).get((Object) null);
        Class<? extends Object> term587809 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term587808 = ((Class) term587809).getDeclaredField((String) "NONE");
        ((Field) term587808).setAccessible(true);
        Object enum1286 = ((Field) term587808).get((Object) null);
        Class<? extends Object> term588450 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term588449 = ((Class) term588450).getDeclaredField((String) "NO_CLEAR");
        ((Field) term588449).setAccessible(true);
        Object enum1287 = ((Field) term588449).get((Object) null);
        Class<? extends Object> term588736 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term588735 = ((Class) term588736).getDeclaredField((String) "UNDEFINED");
        ((Field) term588735).setAccessible(true);
        Object enum1288 = ((Field) term588735).get((Object) null);
        term585950 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        Object term585952 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term586075 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term586076 = newInstance(Class.forName("java.time.LocalDate"));
        Object term586080 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term585950, term585950.getClass(), "id", -7983954942068142191L);
        setLongField(term585952, term585952.getClass(), "id", 2274723545906746965L);
        setIntField(term585952, term585952.getClass(), "pdId", -924663332);
        setField(term585952, term585952.getClass(), "playerName", "xxx");
        setIntField(term585952, term585952.getClass(), "vocaloidPoints", 300);
        setIntField(term585952, term585952.getClass(), "level", 1);
        setIntField(term585952, term585952.getClass(), "levelExp", 579787883);
        setField(term585952, term585952.getClass(), "levelTitle", "xxx");
        setIntField(term585952, term585952.getClass(), "plateId", -1);
        setIntField(term585952, term585952.getClass(), "plateEffectId", -1);
        setField(term585952, term585952.getClass(), "passwordStatus", enum1282);
        setField(term585952, term585952.getClass(), "password", "**********");
        setBooleanField(term585952, term585952.getClass(), "preferPerPvModule", true);
        setBooleanField(term585952, term585952.getClass(), "preferCommonModule", false);
        setBooleanField(term585952, term585952.getClass(), "usePerPvSkin", true);
        setBooleanField(term585952, term585952.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term585952, term585952.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term585952, term585952.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term585952, term585952.getClass(), "usePerPvTouchSliderSe", false);
        setField(term585952, term585952.getClass(), "commonModule", "-999,-999,-999");
        setField(term585952, term585952.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term586076, term586076.getClass(), "year", 2026);
        setShortField(term586076, term586076.getClass(), "month", (short) 6);
        setShortField(term586076, term586076.getClass(), "day", (short) 29);
        setField(term586075, term586075.getClass(), "date", term586076);
        setByteField(term586080, term586080.getClass(), "hour", (byte) 4);
        setByteField(term586080, term586080.getClass(), "minute", (byte) 28);
        setByteField(term586080, term586080.getClass(), "second", (byte) 49);
        setIntField(term586080, term586080.getClass(), "nano", 499250000);
        setField(term586075, term586075.getClass(), "time", term586080);
        setField(term585952, term585952.getClass(), "commonModuleSetTime", term586075);
        setField(term585952, term585952.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term585952, term585952.getClass(), "commonSkin", -1);
        setIntField(term585952, term585952.getClass(), "headphoneVolume", 100);
        setBooleanField(term585952, term585952.getClass(), "buttonSeOn", true);
        setIntField(term585952, term585952.getClass(), "buttonSeVolume", 100);
        setIntField(term585952, term585952.getClass(), "sliderSeVolume", 100);
        setIntField(term585952, term585952.getClass(), "buttonSe", -1);
        setIntField(term585952, term585952.getClass(), "chainSlideSe", -1);
        setIntField(term585952, term585952.getClass(), "slideSe", -1);
        setIntField(term585952, term585952.getClass(), "sliderTouchSe", -1);
        setField(term585952, term585952.getClass(), "sortMode", enum1283);
        setIntField(term585952, term585952.getClass(), "nextPvId", -1);
        setField(term585952, term585952.getClass(), "nextDifficulty", enum1284);
        setField(term585952, term585952.getClass(), "nextEdition", enum1285);
        setBooleanField(term585952, term585952.getClass(), "showInterimRanking", true);
        setBooleanField(term585952, term585952.getClass(), "showClearStatus", true);
        setBooleanField(term585952, term585952.getClass(), "showGreatBorder", true);
        setBooleanField(term585952, term585952.getClass(), "showExcellentBorder", true);
        setBooleanField(term585952, term585952.getClass(), "showRivalBorder", true);
        setBooleanField(term585952, term585952.getClass(), "showRgoSetting", true);
        setBooleanField(term585952, term585952.getClass(), "contestNowPlayingEnable", true);
        setIntField(term585952, term585952.getClass(), "contestNowPlayingId", -1);
        setIntField(term585952, term585952.getClass(), "contestNowPlayingValue", -1);
        setField(term585952, term585952.getClass(), "contestNowPlayingResultRank", enum1286);
        setField(term585952, term585952.getClass(), "contestNowPlayingSpecifier", "");
        setField(term585952, term585952.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term585952, term585952.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term585952, term585952.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term585952, term585952.getClass(), "rivalPdId", -1);
        setField(term585950, term585950.getClass(), "pdId", term585952);
        setIntField(term585950, term585950.getClass(), "pvId", -1);
        setField(term585950, term585950.getClass(), "edition", enum1285);
        setField(term585950, term585950.getClass(), "difficulty", enum1284);
        setField(term585950, term585950.getClass(), "result", enum1287);
        setIntField(term585950, term585950.getClass(), "maxScore", -1);
        setIntField(term585950, term585950.getClass(), "maxAttain", -1);
        setField(term585950, term585950.getClass(), "challengeKind", enum1288);
        setField(term585950, term585950.getClass(), "rgoPurchased", "0,0,0");
        setField(term585950, term585950.getClass(), "rgoPlayed", "0,0,0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxScore", argTypes, term585950, args);
    }

};


