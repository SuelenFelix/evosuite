package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserKop_canEqual_127315854120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280651;
     Object term280945;

    public UserKop_canEqual_127315854120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term280657 = new Long(4892304277320345810L);
        term280651 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop"));
        Object term280653 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term280655 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term280671 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term280672 = newInstance(Class.forName("java.time.LocalDate"));
        Object term280676 = newInstance(Class.forName("java.time.LocalTime"));
        Object term280681 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term280682 = newInstance(Class.forName("java.time.LocalDate"));
        Object term280686 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term280651, term280651.getClass(), "id", 3953526230941965706L);
        setLongField(term280653, term280653.getClass(), "id", 5545581903505339600L);
        setLongField(term280655, term280655.getClass(), "id", -3201759216686624483L);
        setField(term280655, term280655.getClass(), "extId", term280657);
        setField(term280655, term280655.getClass(), "luid", "gQGlISxORX");
        setIntField(term280672, term280672.getClass(), "year", 2026);
        setShortField(term280672, term280672.getClass(), "month", (short) 9);
        setShortField(term280672, term280672.getClass(), "day", (short) 9);
        setField(term280671, term280671.getClass(), "date", term280672);
        setByteField(term280676, term280676.getClass(), "hour", (byte) 5);
        setByteField(term280676, term280676.getClass(), "minute", (byte) 5);
        setByteField(term280676, term280676.getClass(), "second", (byte) 34);
        setIntField(term280676, term280676.getClass(), "nano", 167743575);
        setField(term280671, term280671.getClass(), "time", term280676);
        setField(term280655, term280655.getClass(), "registerTime", term280671);
        setIntField(term280682, term280682.getClass(), "year", 2027);
        setShortField(term280682, term280682.getClass(), "month", (short) 12);
        setShortField(term280682, term280682.getClass(), "day", (short) 7);
        setField(term280681, term280681.getClass(), "date", term280682);
        setByteField(term280686, term280686.getClass(), "hour", (byte) 13);
        setByteField(term280686, term280686.getClass(), "minute", (byte) 1);
        setByteField(term280686, term280686.getClass(), "second", (byte) 57);
        setIntField(term280686, term280686.getClass(), "nano", 505495887);
        setField(term280681, term280681.getClass(), "time", term280686);
        setField(term280655, term280655.getClass(), "accessTime", term280681);
        setField(term280653, term280653.getClass(), "card", term280655);
        setField(term280653, term280653.getClass(), "userName", "IhgSPsiEAp");
        setIntField(term280653, term280653.getClass(), "level", -1538026717);
        setIntField(term280653, term280653.getClass(), "reincarnationNum", 1157723902);
        setLongField(term280653, term280653.getClass(), "exp", -95705563294606557L);
        setLongField(term280653, term280653.getClass(), "point", 3454626196058614092L);
        setLongField(term280653, term280653.getClass(), "totalPoint", 3035006240261945401L);
        setIntField(term280653, term280653.getClass(), "playCount", -1911978209);
        setIntField(term280653, term280653.getClass(), "jewelCount", -947895752);
        setIntField(term280653, term280653.getClass(), "totalJewelCount", -488348638);
        setIntField(term280653, term280653.getClass(), "medalCount", 1971447014);
        setIntField(term280653, term280653.getClass(), "playerRating", -424778605);
        setIntField(term280653, term280653.getClass(), "highestRating", -2027250240);
        setIntField(term280653, term280653.getClass(), "battlePoint", 984955567);
        setIntField(term280653, term280653.getClass(), "bestBattlePoint", 1330468760);
        setIntField(term280653, term280653.getClass(), "overDamageBattlePoint", 314609478);
        setBooleanField(term280653, term280653.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term280653, term280653.getClass(), "nameplateId", -1790709498);
        setIntField(term280653, term280653.getClass(), "trophyId", -991204620);
        setIntField(term280653, term280653.getClass(), "cardId", 290302300);
        setIntField(term280653, term280653.getClass(), "characterId", 1352183463);
        setIntField(term280653, term280653.getClass(), "characterVoiceNo", 1489439725);
        setIntField(term280653, term280653.getClass(), "tabSetting", -1946582683);
        setIntField(term280653, term280653.getClass(), "tabSortSetting", -1041859799);
        setIntField(term280653, term280653.getClass(), "cardCategorySetting", 2011585714);
        setIntField(term280653, term280653.getClass(), "cardSortSetting", 981212962);
        setIntField(term280653, term280653.getClass(), "rivalScoreCategorySetting", -1045629424);
        setIntField(term280653, term280653.getClass(), "playedTutorialBit", -1420294293);
        setIntField(term280653, term280653.getClass(), "firstTutorialCancelNum", -36701343);
        setLongField(term280653, term280653.getClass(), "sumTechHighScore", -4806756176163592145L);
        setLongField(term280653, term280653.getClass(), "sumTechBasicHighScore", -7267025777715750893L);
        setLongField(term280653, term280653.getClass(), "sumTechAdvancedHighScore", 8202986226988190427L);
        setLongField(term280653, term280653.getClass(), "sumTechExpertHighScore", -1735961269817060695L);
        setLongField(term280653, term280653.getClass(), "sumTechMasterHighScore", 7440108181867812069L);
        setLongField(term280653, term280653.getClass(), "sumTechLunaticHighScore", 8030345305215593741L);
        setLongField(term280653, term280653.getClass(), "sumBattleHighScore", -7559572159865515997L);
        setLongField(term280653, term280653.getClass(), "sumBattleBasicHighScore", -5197395634274555696L);
        setLongField(term280653, term280653.getClass(), "sumBattleAdvancedHighScore", 2584850058661561529L);
        setLongField(term280653, term280653.getClass(), "sumBattleExpertHighScore", 5447542643577906596L);
        setLongField(term280653, term280653.getClass(), "sumBattleMasterHighScore", 8644571703496928595L);
        setLongField(term280653, term280653.getClass(), "sumBattleLunaticHighScore", 7182005847449925954L);
        setField(term280653, term280653.getClass(), "eventWatchedDate", "VIiDjdCWsX");
        setField(term280653, term280653.getClass(), "cmEventWatchedDate", "HUpXsvCasn");
        setField(term280653, term280653.getClass(), "firstGameId", "gxKFHEvCMQ");
        setField(term280653, term280653.getClass(), "firstRomVersion", "WGrgiaSQnl");
        setField(term280653, term280653.getClass(), "firstDataVersion", "FdPORhHvkS");
        setField(term280653, term280653.getClass(), "firstPlayDate", "HheeaUYjPr");
        setField(term280653, term280653.getClass(), "lastGameId", "nyKmTaUwFt");
        setField(term280653, term280653.getClass(), "lastRomVersion", "rzqaoonvCb");
        setField(term280653, term280653.getClass(), "lastDataVersion", "DHAcIlnUmH");
        setField(term280653, term280653.getClass(), "compatibleCmVersion", "PXpuIQuvxu");
        setField(term280653, term280653.getClass(), "lastPlayDate", "RGuievXeWF");
        setIntField(term280653, term280653.getClass(), "lastPlaceId", 1597822592);
        setField(term280653, term280653.getClass(), "lastPlaceName", "RNWAfuYVdn");
        setIntField(term280653, term280653.getClass(), "lastRegionId", 1242775865);
        setField(term280653, term280653.getClass(), "lastRegionName", "hZuxPbhKHd");
        setIntField(term280653, term280653.getClass(), "lastAllNetId", -1607082745);
        setField(term280653, term280653.getClass(), "lastClientId", "owuVENinAF");
        setIntField(term280653, term280653.getClass(), "lastUsedDeckId", -1489638045);
        setIntField(term280653, term280653.getClass(), "lastPlayMusicLevel", 1366635956);
        setIntField(term280653, term280653.getClass(), "lastEmoneyBrand", 1287857445);
        setField(term280651, term280651.getClass(), "user", term280653);
        setField(term280651, term280651.getClass(), "authKey", "wrEbOqtEzd");
        setIntField(term280651, term280651.getClass(), "kopId", -1755330917);
        setIntField(term280651, term280651.getClass(), "areaId", -1138481653);
        setIntField(term280651, term280651.getClass(), "totalTechScore", 1019419428);
        setIntField(term280651, term280651.getClass(), "totalPlatinumScore", 1234190646);
        setField(term280651, term280651.getClass(), "techRecordDate", "wnmgduZOMm");
        setBooleanField(term280651, term280651.getClass(), "isTotalTechNewRecord", false);
        term280945 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term280945;
        callMethod(klass, "canEqual", argTypes, term280651, args);
    }

};


