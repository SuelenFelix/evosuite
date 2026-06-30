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

public class UserOption_getVolSide_60829920916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315843;

    public UserOption_getVolSide_60829920916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term315849 = new Long(3660520943100987842L);
        term315843 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term315845 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term315847 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term315863 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term315864 = newInstance(Class.forName("java.time.LocalDate"));
        Object term315868 = newInstance(Class.forName("java.time.LocalTime"));
        Object term315873 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term315874 = newInstance(Class.forName("java.time.LocalDate"));
        Object term315878 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term315843, term315843.getClass(), "id", 6360074972510239386L);
        setLongField(term315845, term315845.getClass(), "id", 3815541270632911753L);
        setLongField(term315847, term315847.getClass(), "id", 5643949776753806592L);
        setField(term315847, term315847.getClass(), "extId", term315849);
        setField(term315847, term315847.getClass(), "luid", "XgQiiPxpaD");
        setIntField(term315864, term315864.getClass(), "year", 2017);
        setShortField(term315864, term315864.getClass(), "month", (short) 3);
        setShortField(term315864, term315864.getClass(), "day", (short) 9);
        setField(term315863, term315863.getClass(), "date", term315864);
        setByteField(term315868, term315868.getClass(), "hour", (byte) 4);
        setByteField(term315868, term315868.getClass(), "minute", (byte) 6);
        setByteField(term315868, term315868.getClass(), "second", (byte) 41);
        setIntField(term315868, term315868.getClass(), "nano", 312276445);
        setField(term315863, term315863.getClass(), "time", term315868);
        setField(term315847, term315847.getClass(), "registerTime", term315863);
        setIntField(term315874, term315874.getClass(), "year", 2026);
        setShortField(term315874, term315874.getClass(), "month", (short) 7);
        setShortField(term315874, term315874.getClass(), "day", (short) 11);
        setField(term315873, term315873.getClass(), "date", term315874);
        setByteField(term315878, term315878.getClass(), "hour", (byte) 9);
        setByteField(term315878, term315878.getClass(), "minute", (byte) 32);
        setByteField(term315878, term315878.getClass(), "second", (byte) 4);
        setIntField(term315878, term315878.getClass(), "nano", 550731760);
        setField(term315873, term315873.getClass(), "time", term315878);
        setField(term315847, term315847.getClass(), "accessTime", term315873);
        setField(term315845, term315845.getClass(), "card", term315847);
        setField(term315845, term315845.getClass(), "userName", "xROqxqAGWR");
        setIntField(term315845, term315845.getClass(), "level", 1717849983);
        setIntField(term315845, term315845.getClass(), "reincarnationNum", 845426642);
        setLongField(term315845, term315845.getClass(), "exp", -2109493283003389824L);
        setLongField(term315845, term315845.getClass(), "point", 3923873083534898332L);
        setLongField(term315845, term315845.getClass(), "totalPoint", -1727839073928650068L);
        setIntField(term315845, term315845.getClass(), "playCount", -1211372155);
        setIntField(term315845, term315845.getClass(), "jewelCount", 1033626497);
        setIntField(term315845, term315845.getClass(), "totalJewelCount", -189684537);
        setIntField(term315845, term315845.getClass(), "medalCount", -1861676984);
        setIntField(term315845, term315845.getClass(), "playerRating", 489057847);
        setIntField(term315845, term315845.getClass(), "highestRating", 2012524773);
        setIntField(term315845, term315845.getClass(), "battlePoint", -622682683);
        setIntField(term315845, term315845.getClass(), "bestBattlePoint", -1007946709);
        setIntField(term315845, term315845.getClass(), "overDamageBattlePoint", 2033724505);
        setBooleanField(term315845, term315845.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term315845, term315845.getClass(), "nameplateId", -2054176226);
        setIntField(term315845, term315845.getClass(), "trophyId", 325249402);
        setIntField(term315845, term315845.getClass(), "cardId", -486452301);
        setIntField(term315845, term315845.getClass(), "characterId", 1061778672);
        setIntField(term315845, term315845.getClass(), "characterVoiceNo", 165022693);
        setIntField(term315845, term315845.getClass(), "tabSetting", 1781517788);
        setIntField(term315845, term315845.getClass(), "tabSortSetting", 645022978);
        setIntField(term315845, term315845.getClass(), "cardCategorySetting", -1808329703);
        setIntField(term315845, term315845.getClass(), "cardSortSetting", 1099465560);
        setIntField(term315845, term315845.getClass(), "rivalScoreCategorySetting", 1339922922);
        setIntField(term315845, term315845.getClass(), "playedTutorialBit", 651953835);
        setIntField(term315845, term315845.getClass(), "firstTutorialCancelNum", -375199942);
        setLongField(term315845, term315845.getClass(), "sumTechHighScore", 2498945988764862483L);
        setLongField(term315845, term315845.getClass(), "sumTechBasicHighScore", -1783324016888513719L);
        setLongField(term315845, term315845.getClass(), "sumTechAdvancedHighScore", -9182043553007428335L);
        setLongField(term315845, term315845.getClass(), "sumTechExpertHighScore", -9172546550694307721L);
        setLongField(term315845, term315845.getClass(), "sumTechMasterHighScore", -733886769587943280L);
        setLongField(term315845, term315845.getClass(), "sumTechLunaticHighScore", 770657061678698777L);
        setLongField(term315845, term315845.getClass(), "sumBattleHighScore", -4855931597107388582L);
        setLongField(term315845, term315845.getClass(), "sumBattleBasicHighScore", -4500288265834870017L);
        setLongField(term315845, term315845.getClass(), "sumBattleAdvancedHighScore", -2087592378467353908L);
        setLongField(term315845, term315845.getClass(), "sumBattleExpertHighScore", 3777202844005701447L);
        setLongField(term315845, term315845.getClass(), "sumBattleMasterHighScore", -9185952603698641444L);
        setLongField(term315845, term315845.getClass(), "sumBattleLunaticHighScore", -1971422384256880384L);
        setField(term315845, term315845.getClass(), "eventWatchedDate", "dRXkMNRcuO");
        setField(term315845, term315845.getClass(), "cmEventWatchedDate", "YEewitiOrD");
        setField(term315845, term315845.getClass(), "firstGameId", "IvozCNqdhn");
        setField(term315845, term315845.getClass(), "firstRomVersion", "jzJpPjgqpB");
        setField(term315845, term315845.getClass(), "firstDataVersion", "IrpYnHzyOp");
        setField(term315845, term315845.getClass(), "firstPlayDate", "SAOqfVTYAP");
        setField(term315845, term315845.getClass(), "lastGameId", "KSxwTbabol");
        setField(term315845, term315845.getClass(), "lastRomVersion", "DDmdhVOVfJ");
        setField(term315845, term315845.getClass(), "lastDataVersion", "HjhkuKttGf");
        setField(term315845, term315845.getClass(), "compatibleCmVersion", "oOcNDSgWLE");
        setField(term315845, term315845.getClass(), "lastPlayDate", "yOWvnntxzG");
        setIntField(term315845, term315845.getClass(), "lastPlaceId", -1715923424);
        setField(term315845, term315845.getClass(), "lastPlaceName", "NbwkqvWxat");
        setIntField(term315845, term315845.getClass(), "lastRegionId", -910580480);
        setField(term315845, term315845.getClass(), "lastRegionName", "rrlohZOwTD");
        setIntField(term315845, term315845.getClass(), "lastAllNetId", -526438792);
        setField(term315845, term315845.getClass(), "lastClientId", "cJFVXclSGq");
        setIntField(term315845, term315845.getClass(), "lastUsedDeckId", -1621172613);
        setIntField(term315845, term315845.getClass(), "lastPlayMusicLevel", 2090369238);
        setIntField(term315845, term315845.getClass(), "lastEmoneyBrand", -264474773);
        setField(term315843, term315843.getClass(), "user", term315845);
        setIntField(term315843, term315843.getClass(), "optionSet", 1949073511);
        setIntField(term315843, term315843.getClass(), "speed", -1660804748);
        setIntField(term315843, term315843.getClass(), "mirror", -1562335326);
        setIntField(term315843, term315843.getClass(), "judgeTiming", 337950784);
        setIntField(term315843, term315843.getClass(), "judgeAdjustment", 1067037174);
        setIntField(term315843, term315843.getClass(), "abort", -664843481);
        setIntField(term315843, term315843.getClass(), "stealthField", 1794725157);
        setIntField(term315843, term315843.getClass(), "tapSound", -1899127703);
        setIntField(term315843, term315843.getClass(), "volGuide", -240607840);
        setIntField(term315843, term315843.getClass(), "volAll", -577900240);
        setIntField(term315843, term315843.getClass(), "volTap", 275743640);
        setIntField(term315843, term315843.getClass(), "volCrTap", 819925760);
        setIntField(term315843, term315843.getClass(), "volHold", -1341150554);
        setIntField(term315843, term315843.getClass(), "volSide", -911676869);
        setIntField(term315843, term315843.getClass(), "volFlick", -315255755);
        setIntField(term315843, term315843.getClass(), "volBell", -2070324513);
        setIntField(term315843, term315843.getClass(), "volEnemy", 1920625938);
        setIntField(term315843, term315843.getClass(), "volSkill", -1786378315);
        setIntField(term315843, term315843.getClass(), "volDamage", -1532684075);
        setIntField(term315843, term315843.getClass(), "colorField", -739168905);
        setIntField(term315843, term315843.getClass(), "colorLaneBright", -1515863560);
        setIntField(term315843, term315843.getClass(), "colorWallBright", -792512827);
        setIntField(term315843, term315843.getClass(), "colorLane", -1935600678);
        setIntField(term315843, term315843.getClass(), "colorSide", 1337707233);
        setIntField(term315843, term315843.getClass(), "effectDamage", -429200385);
        setIntField(term315843, term315843.getClass(), "effectPos", 47201405);
        setIntField(term315843, term315843.getClass(), "judgeDisp", 1438765646);
        setIntField(term315843, term315843.getClass(), "judgePos", 1636250418);
        setIntField(term315843, term315843.getClass(), "judgeBreak", -809405409);
        setIntField(term315843, term315843.getClass(), "judgeHit", 1046184268);
        setIntField(term315843, term315843.getClass(), "platinumBreakDisp", -1235106740);
        setIntField(term315843, term315843.getClass(), "judgeCriticalBreak", 1051468050);
        setIntField(term315843, term315843.getClass(), "matching", 418894507);
        setIntField(term315843, term315843.getClass(), "dispPlayerLv", 788242359);
        setIntField(term315843, term315843.getClass(), "dispRating", 938801054);
        setIntField(term315843, term315843.getClass(), "dispBP", 904698255);
        setIntField(term315843, term315843.getClass(), "headphone", -2032196462);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVolSide", argTypes, term315843, args);
    }

};


