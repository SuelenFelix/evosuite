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

public class PlayerPvRecord_getPdId_11521674383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term570480;

    public PlayerPvRecord_getPdId_11521674383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term571138 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term571137 = ((Class) term571138).getDeclaredField((String) "MISS");
        ((Field) term571137).setAccessible(true);
        Object enum1247 = ((Field) term571137).get((Object) null);
        Class<? extends Object> term571515 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term571514 = ((Class) term571515).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term571514).setAccessible(true);
        Object enum1248 = ((Field) term571514).get((Object) null);
        Class<? extends Object> term571798 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term571797 = ((Class) term571798).getDeclaredField((String) "NORMAL");
        ((Field) term571797).setAccessible(true);
        Object enum1249 = ((Field) term571797).get((Object) null);
        Class<? extends Object> term572073 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term572072 = ((Class) term572073).getDeclaredField((String) "ORIGINAL");
        ((Field) term572072).setAccessible(true);
        Object enum1250 = ((Field) term572072).get((Object) null);
        Class<? extends Object> term572339 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term572338 = ((Class) term572339).getDeclaredField((String) "NONE");
        ((Field) term572338).setAccessible(true);
        Object enum1251 = ((Field) term572338).get((Object) null);
        Class<? extends Object> term572980 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term572979 = ((Class) term572980).getDeclaredField((String) "NO_CLEAR");
        ((Field) term572979).setAccessible(true);
        Object enum1252 = ((Field) term572979).get((Object) null);
        Class<? extends Object> term573266 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term573265 = ((Class) term573266).getDeclaredField((String) "UNDEFINED");
        ((Field) term573265).setAccessible(true);
        Object enum1253 = ((Field) term573265).get((Object) null);
        term570480 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        Object term570482 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term570605 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term570606 = newInstance(Class.forName("java.time.LocalDate"));
        Object term570610 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term570480, term570480.getClass(), "id", 9214973322210954344L);
        setLongField(term570482, term570482.getClass(), "id", 3662777917800385964L);
        setIntField(term570482, term570482.getClass(), "pdId", 824600792);
        setField(term570482, term570482.getClass(), "playerName", "xxx");
        setIntField(term570482, term570482.getClass(), "vocaloidPoints", 300);
        setIntField(term570482, term570482.getClass(), "level", 1);
        setIntField(term570482, term570482.getClass(), "levelExp", -1498923569);
        setField(term570482, term570482.getClass(), "levelTitle", "xxx");
        setIntField(term570482, term570482.getClass(), "plateId", -1);
        setIntField(term570482, term570482.getClass(), "plateEffectId", -1);
        setField(term570482, term570482.getClass(), "passwordStatus", enum1247);
        setField(term570482, term570482.getClass(), "password", "**********");
        setBooleanField(term570482, term570482.getClass(), "preferPerPvModule", true);
        setBooleanField(term570482, term570482.getClass(), "preferCommonModule", true);
        setBooleanField(term570482, term570482.getClass(), "usePerPvSkin", true);
        setBooleanField(term570482, term570482.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term570482, term570482.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term570482, term570482.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term570482, term570482.getClass(), "usePerPvTouchSliderSe", true);
        setField(term570482, term570482.getClass(), "commonModule", "-999,-999,-999");
        setField(term570482, term570482.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term570606, term570606.getClass(), "year", 2026);
        setShortField(term570606, term570606.getClass(), "month", (short) 8);
        setShortField(term570606, term570606.getClass(), "day", (short) 12);
        setField(term570605, term570605.getClass(), "date", term570606);
        setByteField(term570610, term570610.getClass(), "hour", (byte) 2);
        setByteField(term570610, term570610.getClass(), "minute", (byte) 4);
        setByteField(term570610, term570610.getClass(), "second", (byte) 2);
        setIntField(term570610, term570610.getClass(), "nano", 186633000);
        setField(term570605, term570605.getClass(), "time", term570610);
        setField(term570482, term570482.getClass(), "commonModuleSetTime", term570605);
        setField(term570482, term570482.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term570482, term570482.getClass(), "commonSkin", -1);
        setIntField(term570482, term570482.getClass(), "headphoneVolume", 100);
        setBooleanField(term570482, term570482.getClass(), "buttonSeOn", true);
        setIntField(term570482, term570482.getClass(), "buttonSeVolume", 100);
        setIntField(term570482, term570482.getClass(), "sliderSeVolume", 100);
        setIntField(term570482, term570482.getClass(), "buttonSe", -1);
        setIntField(term570482, term570482.getClass(), "chainSlideSe", -1);
        setIntField(term570482, term570482.getClass(), "slideSe", -1);
        setIntField(term570482, term570482.getClass(), "sliderTouchSe", -1);
        setField(term570482, term570482.getClass(), "sortMode", enum1248);
        setIntField(term570482, term570482.getClass(), "nextPvId", -1);
        setField(term570482, term570482.getClass(), "nextDifficulty", enum1249);
        setField(term570482, term570482.getClass(), "nextEdition", enum1250);
        setBooleanField(term570482, term570482.getClass(), "showInterimRanking", true);
        setBooleanField(term570482, term570482.getClass(), "showClearStatus", true);
        setBooleanField(term570482, term570482.getClass(), "showGreatBorder", true);
        setBooleanField(term570482, term570482.getClass(), "showExcellentBorder", true);
        setBooleanField(term570482, term570482.getClass(), "showRivalBorder", true);
        setBooleanField(term570482, term570482.getClass(), "showRgoSetting", true);
        setBooleanField(term570482, term570482.getClass(), "contestNowPlayingEnable", false);
        setIntField(term570482, term570482.getClass(), "contestNowPlayingId", -1);
        setIntField(term570482, term570482.getClass(), "contestNowPlayingValue", -1);
        setField(term570482, term570482.getClass(), "contestNowPlayingResultRank", enum1251);
        setField(term570482, term570482.getClass(), "contestNowPlayingSpecifier", "");
        setField(term570482, term570482.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term570482, term570482.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term570482, term570482.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term570482, term570482.getClass(), "rivalPdId", -1);
        setField(term570480, term570480.getClass(), "pdId", term570482);
        setIntField(term570480, term570480.getClass(), "pvId", -1);
        setField(term570480, term570480.getClass(), "edition", enum1250);
        setField(term570480, term570480.getClass(), "difficulty", enum1249);
        setField(term570480, term570480.getClass(), "result", enum1252);
        setIntField(term570480, term570480.getClass(), "maxScore", -1);
        setIntField(term570480, term570480.getClass(), "maxAttain", -1);
        setField(term570480, term570480.getClass(), "challengeKind", enum1253);
        setField(term570480, term570480.getClass(), "rgoPurchased", "0,0,0");
        setField(term570480, term570480.getClass(), "rgoPlayed", "0,0,0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPdId", argTypes, term570480, args);
    }

};


