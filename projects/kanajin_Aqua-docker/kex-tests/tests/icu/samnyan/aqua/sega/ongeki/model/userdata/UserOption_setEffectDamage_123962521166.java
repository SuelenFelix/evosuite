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
import java.lang.Integer;

public class UserOption_setEffectDamage_123962521166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term339416;
     Object term339718;

    public UserOption_setEffectDamage_123962521166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term339422 = new Long(8505184530074334434L);
        term339416 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term339418 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term339420 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term339436 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term339437 = newInstance(Class.forName("java.time.LocalDate"));
        Object term339441 = newInstance(Class.forName("java.time.LocalTime"));
        Object term339446 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term339447 = newInstance(Class.forName("java.time.LocalDate"));
        Object term339451 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term339416, term339416.getClass(), "id", 8800113040195092952L);
        setLongField(term339418, term339418.getClass(), "id", 2323508816042717156L);
        setLongField(term339420, term339420.getClass(), "id", 4656396928222865284L);
        setField(term339420, term339420.getClass(), "extId", term339422);
        setField(term339420, term339420.getClass(), "luid", "emYcsVGUYx");
        setIntField(term339437, term339437.getClass(), "year", 2012);
        setShortField(term339437, term339437.getClass(), "month", (short) 4);
        setShortField(term339437, term339437.getClass(), "day", (short) 11);
        setField(term339436, term339436.getClass(), "date", term339437);
        setByteField(term339441, term339441.getClass(), "hour", (byte) 12);
        setByteField(term339441, term339441.getClass(), "minute", (byte) 23);
        setByteField(term339441, term339441.getClass(), "second", (byte) 5);
        setIntField(term339441, term339441.getClass(), "nano", 470048900);
        setField(term339436, term339436.getClass(), "time", term339441);
        setField(term339420, term339420.getClass(), "registerTime", term339436);
        setIntField(term339447, term339447.getClass(), "year", 2012);
        setShortField(term339447, term339447.getClass(), "month", (short) 1);
        setShortField(term339447, term339447.getClass(), "day", (short) 3);
        setField(term339446, term339446.getClass(), "date", term339447);
        setByteField(term339451, term339451.getClass(), "hour", (byte) 7);
        setByteField(term339451, term339451.getClass(), "minute", (byte) 42);
        setByteField(term339451, term339451.getClass(), "second", (byte) 5);
        setIntField(term339451, term339451.getClass(), "nano", 100875675);
        setField(term339446, term339446.getClass(), "time", term339451);
        setField(term339420, term339420.getClass(), "accessTime", term339446);
        setField(term339418, term339418.getClass(), "card", term339420);
        setField(term339418, term339418.getClass(), "userName", "XjePexyWCG");
        setIntField(term339418, term339418.getClass(), "level", 977480006);
        setIntField(term339418, term339418.getClass(), "reincarnationNum", 1214329626);
        setLongField(term339418, term339418.getClass(), "exp", -725199077899769674L);
        setLongField(term339418, term339418.getClass(), "point", 3853039705216504322L);
        setLongField(term339418, term339418.getClass(), "totalPoint", 8468186848142799339L);
        setIntField(term339418, term339418.getClass(), "playCount", 1964003183);
        setIntField(term339418, term339418.getClass(), "jewelCount", 30653101);
        setIntField(term339418, term339418.getClass(), "totalJewelCount", 93264791);
        setIntField(term339418, term339418.getClass(), "medalCount", 324791650);
        setIntField(term339418, term339418.getClass(), "playerRating", 2072644421);
        setIntField(term339418, term339418.getClass(), "highestRating", 506136975);
        setIntField(term339418, term339418.getClass(), "battlePoint", 2131939404);
        setIntField(term339418, term339418.getClass(), "bestBattlePoint", 1490360901);
        setIntField(term339418, term339418.getClass(), "overDamageBattlePoint", -1432616289);
        setBooleanField(term339418, term339418.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term339418, term339418.getClass(), "nameplateId", -742974194);
        setIntField(term339418, term339418.getClass(), "trophyId", -451843791);
        setIntField(term339418, term339418.getClass(), "cardId", 46238831);
        setIntField(term339418, term339418.getClass(), "characterId", 614633350);
        setIntField(term339418, term339418.getClass(), "characterVoiceNo", 1027643349);
        setIntField(term339418, term339418.getClass(), "tabSetting", 1343076824);
        setIntField(term339418, term339418.getClass(), "tabSortSetting", 1918245020);
        setIntField(term339418, term339418.getClass(), "cardCategorySetting", -1281122301);
        setIntField(term339418, term339418.getClass(), "cardSortSetting", 1570606413);
        setIntField(term339418, term339418.getClass(), "rivalScoreCategorySetting", -2127022183);
        setIntField(term339418, term339418.getClass(), "playedTutorialBit", -433430711);
        setIntField(term339418, term339418.getClass(), "firstTutorialCancelNum", -1857663039);
        setLongField(term339418, term339418.getClass(), "sumTechHighScore", -2966268112630008544L);
        setLongField(term339418, term339418.getClass(), "sumTechBasicHighScore", -1360860510758208218L);
        setLongField(term339418, term339418.getClass(), "sumTechAdvancedHighScore", -6616127279279868069L);
        setLongField(term339418, term339418.getClass(), "sumTechExpertHighScore", -6412542824486497675L);
        setLongField(term339418, term339418.getClass(), "sumTechMasterHighScore", -3351598557693689619L);
        setLongField(term339418, term339418.getClass(), "sumTechLunaticHighScore", 9030882333643088122L);
        setLongField(term339418, term339418.getClass(), "sumBattleHighScore", -2758318136300718327L);
        setLongField(term339418, term339418.getClass(), "sumBattleBasicHighScore", 3971173203689731533L);
        setLongField(term339418, term339418.getClass(), "sumBattleAdvancedHighScore", 7374795577900656484L);
        setLongField(term339418, term339418.getClass(), "sumBattleExpertHighScore", 1607414302235016481L);
        setLongField(term339418, term339418.getClass(), "sumBattleMasterHighScore", -1620750214481549321L);
        setLongField(term339418, term339418.getClass(), "sumBattleLunaticHighScore", -5749434200291495515L);
        setField(term339418, term339418.getClass(), "eventWatchedDate", "JTkwAPwsKT");
        setField(term339418, term339418.getClass(), "cmEventWatchedDate", "XWLzsMfciM");
        setField(term339418, term339418.getClass(), "firstGameId", "khjZZdxcjO");
        setField(term339418, term339418.getClass(), "firstRomVersion", "qjyRsnCCzo");
        setField(term339418, term339418.getClass(), "firstDataVersion", "hpvlirfDuj");
        setField(term339418, term339418.getClass(), "firstPlayDate", "IiaQCfQDJK");
        setField(term339418, term339418.getClass(), "lastGameId", "RbAtCNoOuf");
        setField(term339418, term339418.getClass(), "lastRomVersion", "jxzZUJHqoM");
        setField(term339418, term339418.getClass(), "lastDataVersion", "HxzPbwplGW");
        setField(term339418, term339418.getClass(), "compatibleCmVersion", "zNuRhGATHq");
        setField(term339418, term339418.getClass(), "lastPlayDate", "eyZPNIoeRw");
        setIntField(term339418, term339418.getClass(), "lastPlaceId", -1822997386);
        setField(term339418, term339418.getClass(), "lastPlaceName", "DzPDvbYrjd");
        setIntField(term339418, term339418.getClass(), "lastRegionId", -2139265574);
        setField(term339418, term339418.getClass(), "lastRegionName", "hKHTQsUwwm");
        setIntField(term339418, term339418.getClass(), "lastAllNetId", -2108555858);
        setField(term339418, term339418.getClass(), "lastClientId", "MDALFfahVe");
        setIntField(term339418, term339418.getClass(), "lastUsedDeckId", 880277489);
        setIntField(term339418, term339418.getClass(), "lastPlayMusicLevel", -764881926);
        setIntField(term339418, term339418.getClass(), "lastEmoneyBrand", -1386724721);
        setField(term339416, term339416.getClass(), "user", term339418);
        setIntField(term339416, term339416.getClass(), "optionSet", 153311722);
        setIntField(term339416, term339416.getClass(), "speed", -243803795);
        setIntField(term339416, term339416.getClass(), "mirror", 1430449023);
        setIntField(term339416, term339416.getClass(), "judgeTiming", -171935996);
        setIntField(term339416, term339416.getClass(), "judgeAdjustment", 723680896);
        setIntField(term339416, term339416.getClass(), "abort", -386874080);
        setIntField(term339416, term339416.getClass(), "stealthField", 1815240252);
        setIntField(term339416, term339416.getClass(), "tapSound", 1573146841);
        setIntField(term339416, term339416.getClass(), "volGuide", -1594246910);
        setIntField(term339416, term339416.getClass(), "volAll", -614832476);
        setIntField(term339416, term339416.getClass(), "volTap", -301186353);
        setIntField(term339416, term339416.getClass(), "volCrTap", -858077362);
        setIntField(term339416, term339416.getClass(), "volHold", 449900555);
        setIntField(term339416, term339416.getClass(), "volSide", 1565660460);
        setIntField(term339416, term339416.getClass(), "volFlick", -1747207092);
        setIntField(term339416, term339416.getClass(), "volBell", -1543892799);
        setIntField(term339416, term339416.getClass(), "volEnemy", -1074797455);
        setIntField(term339416, term339416.getClass(), "volSkill", 708136611);
        setIntField(term339416, term339416.getClass(), "volDamage", -1065697128);
        setIntField(term339416, term339416.getClass(), "colorField", 625183859);
        setIntField(term339416, term339416.getClass(), "colorLaneBright", 1067897275);
        setIntField(term339416, term339416.getClass(), "colorWallBright", -632930027);
        setIntField(term339416, term339416.getClass(), "colorLane", 432041976);
        setIntField(term339416, term339416.getClass(), "colorSide", 1809712274);
        setIntField(term339416, term339416.getClass(), "effectDamage", -1002692144);
        setIntField(term339416, term339416.getClass(), "effectPos", -1555757490);
        setIntField(term339416, term339416.getClass(), "judgeDisp", -1870343708);
        setIntField(term339416, term339416.getClass(), "judgePos", 346262643);
        setIntField(term339416, term339416.getClass(), "judgeBreak", -648730639);
        setIntField(term339416, term339416.getClass(), "judgeHit", 2079225280);
        setIntField(term339416, term339416.getClass(), "platinumBreakDisp", -1872557279);
        setIntField(term339416, term339416.getClass(), "judgeCriticalBreak", -958890210);
        setIntField(term339416, term339416.getClass(), "matching", 607852265);
        setIntField(term339416, term339416.getClass(), "dispPlayerLv", -1770278743);
        setIntField(term339416, term339416.getClass(), "dispRating", 757096718);
        setIntField(term339416, term339416.getClass(), "dispBP", 1265984015);
        setIntField(term339416, term339416.getClass(), "headphone", -1262705021);
        term339718 = new Integer(-1437873035);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term339718;
        callMethod(klass, "setEffectDamage", argTypes, term339416, args);
    }

};


