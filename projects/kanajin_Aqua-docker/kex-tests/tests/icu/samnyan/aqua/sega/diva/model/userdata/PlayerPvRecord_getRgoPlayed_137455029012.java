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

public class PlayerPvRecord_getRgoPlayed_137455029012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term598326;

    public PlayerPvRecord_getRgoPlayed_137455029012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term598984 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term598983 = ((Class) term598984).getDeclaredField((String) "MISS");
        ((Field) term598983).setAccessible(true);
        Object enum1310 = ((Field) term598983).get((Object) null);
        Class<? extends Object> term599361 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term599360 = ((Class) term599361).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term599360).setAccessible(true);
        Object enum1311 = ((Field) term599360).get((Object) null);
        Class<? extends Object> term599644 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term599643 = ((Class) term599644).getDeclaredField((String) "NORMAL");
        ((Field) term599643).setAccessible(true);
        Object enum1312 = ((Field) term599643).get((Object) null);
        Class<? extends Object> term599919 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term599918 = ((Class) term599919).getDeclaredField((String) "ORIGINAL");
        ((Field) term599918).setAccessible(true);
        Object enum1313 = ((Field) term599918).get((Object) null);
        Class<? extends Object> term600185 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term600184 = ((Class) term600185).getDeclaredField((String) "NONE");
        ((Field) term600184).setAccessible(true);
        Object enum1314 = ((Field) term600184).get((Object) null);
        Class<? extends Object> term600826 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term600825 = ((Class) term600826).getDeclaredField((String) "NO_CLEAR");
        ((Field) term600825).setAccessible(true);
        Object enum1315 = ((Field) term600825).get((Object) null);
        Class<? extends Object> term601112 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term601111 = ((Class) term601112).getDeclaredField((String) "UNDEFINED");
        ((Field) term601111).setAccessible(true);
        Object enum1316 = ((Field) term601111).get((Object) null);
        term598326 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        Object term598328 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term598451 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term598452 = newInstance(Class.forName("java.time.LocalDate"));
        Object term598456 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term598326, term598326.getClass(), "id", -3806202176947356197L);
        setLongField(term598328, term598328.getClass(), "id", -5534222035915952617L);
        setIntField(term598328, term598328.getClass(), "pdId", -444451515);
        setField(term598328, term598328.getClass(), "playerName", "xxx");
        setIntField(term598328, term598328.getClass(), "vocaloidPoints", 300);
        setIntField(term598328, term598328.getClass(), "level", 1);
        setIntField(term598328, term598328.getClass(), "levelExp", -545419660);
        setField(term598328, term598328.getClass(), "levelTitle", "xxx");
        setIntField(term598328, term598328.getClass(), "plateId", -1);
        setIntField(term598328, term598328.getClass(), "plateEffectId", -1);
        setField(term598328, term598328.getClass(), "passwordStatus", enum1310);
        setField(term598328, term598328.getClass(), "password", "**********");
        setBooleanField(term598328, term598328.getClass(), "preferPerPvModule", true);
        setBooleanField(term598328, term598328.getClass(), "preferCommonModule", false);
        setBooleanField(term598328, term598328.getClass(), "usePerPvSkin", true);
        setBooleanField(term598328, term598328.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term598328, term598328.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term598328, term598328.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term598328, term598328.getClass(), "usePerPvTouchSliderSe", false);
        setField(term598328, term598328.getClass(), "commonModule", "-999,-999,-999");
        setField(term598328, term598328.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term598452, term598452.getClass(), "year", 2026);
        setShortField(term598452, term598452.getClass(), "month", (short) 6);
        setShortField(term598452, term598452.getClass(), "day", (short) 29);
        setField(term598451, term598451.getClass(), "date", term598452);
        setByteField(term598456, term598456.getClass(), "hour", (byte) 4);
        setByteField(term598456, term598456.getClass(), "minute", (byte) 28);
        setByteField(term598456, term598456.getClass(), "second", (byte) 50);
        setIntField(term598456, term598456.getClass(), "nano", 519847000);
        setField(term598451, term598451.getClass(), "time", term598456);
        setField(term598328, term598328.getClass(), "commonModuleSetTime", term598451);
        setField(term598328, term598328.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term598328, term598328.getClass(), "commonSkin", -1);
        setIntField(term598328, term598328.getClass(), "headphoneVolume", 100);
        setBooleanField(term598328, term598328.getClass(), "buttonSeOn", true);
        setIntField(term598328, term598328.getClass(), "buttonSeVolume", 100);
        setIntField(term598328, term598328.getClass(), "sliderSeVolume", 100);
        setIntField(term598328, term598328.getClass(), "buttonSe", -1);
        setIntField(term598328, term598328.getClass(), "chainSlideSe", -1);
        setIntField(term598328, term598328.getClass(), "slideSe", -1);
        setIntField(term598328, term598328.getClass(), "sliderTouchSe", -1);
        setField(term598328, term598328.getClass(), "sortMode", enum1311);
        setIntField(term598328, term598328.getClass(), "nextPvId", -1);
        setField(term598328, term598328.getClass(), "nextDifficulty", enum1312);
        setField(term598328, term598328.getClass(), "nextEdition", enum1313);
        setBooleanField(term598328, term598328.getClass(), "showInterimRanking", true);
        setBooleanField(term598328, term598328.getClass(), "showClearStatus", true);
        setBooleanField(term598328, term598328.getClass(), "showGreatBorder", true);
        setBooleanField(term598328, term598328.getClass(), "showExcellentBorder", true);
        setBooleanField(term598328, term598328.getClass(), "showRivalBorder", true);
        setBooleanField(term598328, term598328.getClass(), "showRgoSetting", true);
        setBooleanField(term598328, term598328.getClass(), "contestNowPlayingEnable", true);
        setIntField(term598328, term598328.getClass(), "contestNowPlayingId", -1);
        setIntField(term598328, term598328.getClass(), "contestNowPlayingValue", -1);
        setField(term598328, term598328.getClass(), "contestNowPlayingResultRank", enum1314);
        setField(term598328, term598328.getClass(), "contestNowPlayingSpecifier", "");
        setField(term598328, term598328.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term598328, term598328.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term598328, term598328.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term598328, term598328.getClass(), "rivalPdId", -1);
        setField(term598326, term598326.getClass(), "pdId", term598328);
        setIntField(term598326, term598326.getClass(), "pvId", -1);
        setField(term598326, term598326.getClass(), "edition", enum1313);
        setField(term598326, term598326.getClass(), "difficulty", enum1312);
        setField(term598326, term598326.getClass(), "result", enum1315);
        setIntField(term598326, term598326.getClass(), "maxScore", -1);
        setIntField(term598326, term598326.getClass(), "maxAttain", -1);
        setField(term598326, term598326.getClass(), "challengeKind", enum1316);
        setField(term598326, term598326.getClass(), "rgoPurchased", "0,0,0");
        setField(term598326, term598326.getClass(), "rgoPlayed", "0,0,0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRgoPlayed", argTypes, term598326, args);
    }

};


