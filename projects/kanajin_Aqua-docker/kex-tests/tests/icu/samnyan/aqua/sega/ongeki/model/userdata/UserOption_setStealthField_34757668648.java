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

public class UserOption_setStealthField_34757668648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331064;
     Object term331366;

    public UserOption_setStealthField_34757668648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term331070 = new Long(7450182989722198450L);
        term331064 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term331066 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term331068 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term331084 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term331085 = newInstance(Class.forName("java.time.LocalDate"));
        Object term331089 = newInstance(Class.forName("java.time.LocalTime"));
        Object term331094 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term331095 = newInstance(Class.forName("java.time.LocalDate"));
        Object term331099 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term331064, term331064.getClass(), "id", 4595588970430332641L);
        setLongField(term331066, term331066.getClass(), "id", -2498876119034148740L);
        setLongField(term331068, term331068.getClass(), "id", 1871081768567909885L);
        setField(term331068, term331068.getClass(), "extId", term331070);
        setField(term331068, term331068.getClass(), "luid", "SFlqaiUdXh");
        setIntField(term331085, term331085.getClass(), "year", 2026);
        setShortField(term331085, term331085.getClass(), "month", (short) 12);
        setShortField(term331085, term331085.getClass(), "day", (short) 5);
        setField(term331084, term331084.getClass(), "date", term331085);
        setByteField(term331089, term331089.getClass(), "hour", (byte) 12);
        setByteField(term331089, term331089.getClass(), "minute", (byte) 12);
        setByteField(term331089, term331089.getClass(), "second", (byte) 28);
        setIntField(term331089, term331089.getClass(), "nano", 184287705);
        setField(term331084, term331084.getClass(), "time", term331089);
        setField(term331068, term331068.getClass(), "registerTime", term331084);
        setIntField(term331095, term331095.getClass(), "year", 2012);
        setShortField(term331095, term331095.getClass(), "month", (short) 9);
        setShortField(term331095, term331095.getClass(), "day", (short) 12);
        setField(term331094, term331094.getClass(), "date", term331095);
        setByteField(term331099, term331099.getClass(), "hour", (byte) 13);
        setByteField(term331099, term331099.getClass(), "minute", (byte) 54);
        setByteField(term331099, term331099.getClass(), "second", (byte) 24);
        setIntField(term331099, term331099.getClass(), "nano", 949177753);
        setField(term331094, term331094.getClass(), "time", term331099);
        setField(term331068, term331068.getClass(), "accessTime", term331094);
        setField(term331066, term331066.getClass(), "card", term331068);
        setField(term331066, term331066.getClass(), "userName", "DykCSecAZM");
        setIntField(term331066, term331066.getClass(), "level", -1195556328);
        setIntField(term331066, term331066.getClass(), "reincarnationNum", -932409062);
        setLongField(term331066, term331066.getClass(), "exp", 9008584173994562051L);
        setLongField(term331066, term331066.getClass(), "point", -1782560756010282221L);
        setLongField(term331066, term331066.getClass(), "totalPoint", 6313786339974110515L);
        setIntField(term331066, term331066.getClass(), "playCount", 432170222);
        setIntField(term331066, term331066.getClass(), "jewelCount", -2034928019);
        setIntField(term331066, term331066.getClass(), "totalJewelCount", 597763758);
        setIntField(term331066, term331066.getClass(), "medalCount", -26866336);
        setIntField(term331066, term331066.getClass(), "playerRating", -1049430);
        setIntField(term331066, term331066.getClass(), "highestRating", -765519423);
        setIntField(term331066, term331066.getClass(), "battlePoint", 2059843277);
        setIntField(term331066, term331066.getClass(), "bestBattlePoint", -2011000214);
        setIntField(term331066, term331066.getClass(), "overDamageBattlePoint", -1002265402);
        setBooleanField(term331066, term331066.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term331066, term331066.getClass(), "nameplateId", -135367789);
        setIntField(term331066, term331066.getClass(), "trophyId", -2069245420);
        setIntField(term331066, term331066.getClass(), "cardId", 532680219);
        setIntField(term331066, term331066.getClass(), "characterId", -1928149061);
        setIntField(term331066, term331066.getClass(), "characterVoiceNo", 1601469596);
        setIntField(term331066, term331066.getClass(), "tabSetting", 553672935);
        setIntField(term331066, term331066.getClass(), "tabSortSetting", -1556658111);
        setIntField(term331066, term331066.getClass(), "cardCategorySetting", -852088878);
        setIntField(term331066, term331066.getClass(), "cardSortSetting", 1791011521);
        setIntField(term331066, term331066.getClass(), "rivalScoreCategorySetting", -814779753);
        setIntField(term331066, term331066.getClass(), "playedTutorialBit", 700321767);
        setIntField(term331066, term331066.getClass(), "firstTutorialCancelNum", 888579049);
        setLongField(term331066, term331066.getClass(), "sumTechHighScore", -5184841287174577622L);
        setLongField(term331066, term331066.getClass(), "sumTechBasicHighScore", 2830390232191747862L);
        setLongField(term331066, term331066.getClass(), "sumTechAdvancedHighScore", 3568678987269167670L);
        setLongField(term331066, term331066.getClass(), "sumTechExpertHighScore", 6674811119617712666L);
        setLongField(term331066, term331066.getClass(), "sumTechMasterHighScore", 1132652482421039002L);
        setLongField(term331066, term331066.getClass(), "sumTechLunaticHighScore", 2590497188028284473L);
        setLongField(term331066, term331066.getClass(), "sumBattleHighScore", 2517105532040788717L);
        setLongField(term331066, term331066.getClass(), "sumBattleBasicHighScore", -1130876299987775654L);
        setLongField(term331066, term331066.getClass(), "sumBattleAdvancedHighScore", 2233044489130016768L);
        setLongField(term331066, term331066.getClass(), "sumBattleExpertHighScore", 1314356304354465271L);
        setLongField(term331066, term331066.getClass(), "sumBattleMasterHighScore", 8836513851140530464L);
        setLongField(term331066, term331066.getClass(), "sumBattleLunaticHighScore", -8414046454475903489L);
        setField(term331066, term331066.getClass(), "eventWatchedDate", "eQwLwBmWQJ");
        setField(term331066, term331066.getClass(), "cmEventWatchedDate", "ERUxExmcLz");
        setField(term331066, term331066.getClass(), "firstGameId", "KyhRdYlJvf");
        setField(term331066, term331066.getClass(), "firstRomVersion", "VEbJonyhKz");
        setField(term331066, term331066.getClass(), "firstDataVersion", "aTFmdlKurR");
        setField(term331066, term331066.getClass(), "firstPlayDate", "sDxeBAYvej");
        setField(term331066, term331066.getClass(), "lastGameId", "OXqQAcOARz");
        setField(term331066, term331066.getClass(), "lastRomVersion", "AtrYqCobzm");
        setField(term331066, term331066.getClass(), "lastDataVersion", "EmVtCLCGsW");
        setField(term331066, term331066.getClass(), "compatibleCmVersion", "ohBszsvYfy");
        setField(term331066, term331066.getClass(), "lastPlayDate", "GzMkkTjEVk");
        setIntField(term331066, term331066.getClass(), "lastPlaceId", 535482504);
        setField(term331066, term331066.getClass(), "lastPlaceName", "ecKOzzXEVT");
        setIntField(term331066, term331066.getClass(), "lastRegionId", -1041131072);
        setField(term331066, term331066.getClass(), "lastRegionName", "bCInFPNVIR");
        setIntField(term331066, term331066.getClass(), "lastAllNetId", -1265735194);
        setField(term331066, term331066.getClass(), "lastClientId", "zEXxUEAIkD");
        setIntField(term331066, term331066.getClass(), "lastUsedDeckId", 858391670);
        setIntField(term331066, term331066.getClass(), "lastPlayMusicLevel", -94961721);
        setIntField(term331066, term331066.getClass(), "lastEmoneyBrand", 1864116978);
        setField(term331064, term331064.getClass(), "user", term331066);
        setIntField(term331064, term331064.getClass(), "optionSet", -1546021694);
        setIntField(term331064, term331064.getClass(), "speed", 1972049100);
        setIntField(term331064, term331064.getClass(), "mirror", -536321123);
        setIntField(term331064, term331064.getClass(), "judgeTiming", -81313389);
        setIntField(term331064, term331064.getClass(), "judgeAdjustment", -574163534);
        setIntField(term331064, term331064.getClass(), "abort", 1924435101);
        setIntField(term331064, term331064.getClass(), "stealthField", 217269670);
        setIntField(term331064, term331064.getClass(), "tapSound", -25776381);
        setIntField(term331064, term331064.getClass(), "volGuide", 181158656);
        setIntField(term331064, term331064.getClass(), "volAll", 790793663);
        setIntField(term331064, term331064.getClass(), "volTap", 877507177);
        setIntField(term331064, term331064.getClass(), "volCrTap", 1537226753);
        setIntField(term331064, term331064.getClass(), "volHold", -1582465133);
        setIntField(term331064, term331064.getClass(), "volSide", -1717061070);
        setIntField(term331064, term331064.getClass(), "volFlick", -740200171);
        setIntField(term331064, term331064.getClass(), "volBell", -808598452);
        setIntField(term331064, term331064.getClass(), "volEnemy", -1152869430);
        setIntField(term331064, term331064.getClass(), "volSkill", -955308446);
        setIntField(term331064, term331064.getClass(), "volDamage", 1717125741);
        setIntField(term331064, term331064.getClass(), "colorField", 1696621709);
        setIntField(term331064, term331064.getClass(), "colorLaneBright", -465973366);
        setIntField(term331064, term331064.getClass(), "colorWallBright", 1081387944);
        setIntField(term331064, term331064.getClass(), "colorLane", -1565615361);
        setIntField(term331064, term331064.getClass(), "colorSide", -912043404);
        setIntField(term331064, term331064.getClass(), "effectDamage", -844955238);
        setIntField(term331064, term331064.getClass(), "effectPos", -2005836010);
        setIntField(term331064, term331064.getClass(), "judgeDisp", -1753461605);
        setIntField(term331064, term331064.getClass(), "judgePos", 78401312);
        setIntField(term331064, term331064.getClass(), "judgeBreak", -667824083);
        setIntField(term331064, term331064.getClass(), "judgeHit", -120442765);
        setIntField(term331064, term331064.getClass(), "platinumBreakDisp", 877515523);
        setIntField(term331064, term331064.getClass(), "judgeCriticalBreak", -92732477);
        setIntField(term331064, term331064.getClass(), "matching", -769323328);
        setIntField(term331064, term331064.getClass(), "dispPlayerLv", 1902835076);
        setIntField(term331064, term331064.getClass(), "dispRating", -1337313313);
        setIntField(term331064, term331064.getClass(), "dispBP", 1756317829);
        setIntField(term331064, term331064.getClass(), "headphone", -875836122);
        term331366 = new Integer(-789027443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term331366;
        callMethod(klass, "setStealthField", argTypes, term331064, args);
    }

};


