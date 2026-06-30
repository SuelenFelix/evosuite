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

public class UserOption_getVolHold_91744137715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315381;

    public UserOption_getVolHold_91744137715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term315387 = new Long(5857854340777182167L);
        term315381 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term315383 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term315385 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term315401 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term315402 = newInstance(Class.forName("java.time.LocalDate"));
        Object term315406 = newInstance(Class.forName("java.time.LocalTime"));
        Object term315411 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term315412 = newInstance(Class.forName("java.time.LocalDate"));
        Object term315416 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term315381, term315381.getClass(), "id", 4105122430966752539L);
        setLongField(term315383, term315383.getClass(), "id", 4598924432840128566L);
        setLongField(term315385, term315385.getClass(), "id", 161752784254877951L);
        setField(term315385, term315385.getClass(), "extId", term315387);
        setField(term315385, term315385.getClass(), "luid", "eFjDmaWfhb");
        setIntField(term315402, term315402.getClass(), "year", 2015);
        setShortField(term315402, term315402.getClass(), "month", (short) 10);
        setShortField(term315402, term315402.getClass(), "day", (short) 27);
        setField(term315401, term315401.getClass(), "date", term315402);
        setByteField(term315406, term315406.getClass(), "hour", (byte) 11);
        setByteField(term315406, term315406.getClass(), "minute", (byte) 12);
        setByteField(term315406, term315406.getClass(), "second", (byte) 3);
        setIntField(term315406, term315406.getClass(), "nano", 677546253);
        setField(term315401, term315401.getClass(), "time", term315406);
        setField(term315385, term315385.getClass(), "registerTime", term315401);
        setIntField(term315412, term315412.getClass(), "year", 2012);
        setShortField(term315412, term315412.getClass(), "month", (short) 11);
        setShortField(term315412, term315412.getClass(), "day", (short) 6);
        setField(term315411, term315411.getClass(), "date", term315412);
        setByteField(term315416, term315416.getClass(), "hour", (byte) 20);
        setByteField(term315416, term315416.getClass(), "minute", (byte) 4);
        setByteField(term315416, term315416.getClass(), "second", (byte) 31);
        setIntField(term315416, term315416.getClass(), "nano", 756557394);
        setField(term315411, term315411.getClass(), "time", term315416);
        setField(term315385, term315385.getClass(), "accessTime", term315411);
        setField(term315383, term315383.getClass(), "card", term315385);
        setField(term315383, term315383.getClass(), "userName", "zRfWhaIRab");
        setIntField(term315383, term315383.getClass(), "level", -1955216585);
        setIntField(term315383, term315383.getClass(), "reincarnationNum", 1484465167);
        setLongField(term315383, term315383.getClass(), "exp", -3217311905523926473L);
        setLongField(term315383, term315383.getClass(), "point", -8020387238975656276L);
        setLongField(term315383, term315383.getClass(), "totalPoint", -3392204296023259681L);
        setIntField(term315383, term315383.getClass(), "playCount", 887764488);
        setIntField(term315383, term315383.getClass(), "jewelCount", -597386285);
        setIntField(term315383, term315383.getClass(), "totalJewelCount", -1418650594);
        setIntField(term315383, term315383.getClass(), "medalCount", -2111381579);
        setIntField(term315383, term315383.getClass(), "playerRating", 279526732);
        setIntField(term315383, term315383.getClass(), "highestRating", -1538296780);
        setIntField(term315383, term315383.getClass(), "battlePoint", 1134427511);
        setIntField(term315383, term315383.getClass(), "bestBattlePoint", 1084492038);
        setIntField(term315383, term315383.getClass(), "overDamageBattlePoint", -1430591544);
        setBooleanField(term315383, term315383.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term315383, term315383.getClass(), "nameplateId", -2005285292);
        setIntField(term315383, term315383.getClass(), "trophyId", -2092175473);
        setIntField(term315383, term315383.getClass(), "cardId", 1128542002);
        setIntField(term315383, term315383.getClass(), "characterId", -1733516345);
        setIntField(term315383, term315383.getClass(), "characterVoiceNo", 1109706181);
        setIntField(term315383, term315383.getClass(), "tabSetting", -57430632);
        setIntField(term315383, term315383.getClass(), "tabSortSetting", 1203419057);
        setIntField(term315383, term315383.getClass(), "cardCategorySetting", -1362714804);
        setIntField(term315383, term315383.getClass(), "cardSortSetting", 820583880);
        setIntField(term315383, term315383.getClass(), "rivalScoreCategorySetting", -1667520359);
        setIntField(term315383, term315383.getClass(), "playedTutorialBit", -1377839077);
        setIntField(term315383, term315383.getClass(), "firstTutorialCancelNum", 750978594);
        setLongField(term315383, term315383.getClass(), "sumTechHighScore", 2209411023204690994L);
        setLongField(term315383, term315383.getClass(), "sumTechBasicHighScore", -6226497986133385142L);
        setLongField(term315383, term315383.getClass(), "sumTechAdvancedHighScore", -1359329974875018364L);
        setLongField(term315383, term315383.getClass(), "sumTechExpertHighScore", 111696143534965170L);
        setLongField(term315383, term315383.getClass(), "sumTechMasterHighScore", -7500237303543626628L);
        setLongField(term315383, term315383.getClass(), "sumTechLunaticHighScore", -5463512919758716652L);
        setLongField(term315383, term315383.getClass(), "sumBattleHighScore", -1743257549042908383L);
        setLongField(term315383, term315383.getClass(), "sumBattleBasicHighScore", -65933373049301486L);
        setLongField(term315383, term315383.getClass(), "sumBattleAdvancedHighScore", -4305479123451963860L);
        setLongField(term315383, term315383.getClass(), "sumBattleExpertHighScore", -249895045876001510L);
        setLongField(term315383, term315383.getClass(), "sumBattleMasterHighScore", 8764209247295791561L);
        setLongField(term315383, term315383.getClass(), "sumBattleLunaticHighScore", 3235251591518751176L);
        setField(term315383, term315383.getClass(), "eventWatchedDate", "MPYUpLzCRr");
        setField(term315383, term315383.getClass(), "cmEventWatchedDate", "gGeSaumnvH");
        setField(term315383, term315383.getClass(), "firstGameId", "sGZLTSQSAd");
        setField(term315383, term315383.getClass(), "firstRomVersion", "BrCXdXiBZY");
        setField(term315383, term315383.getClass(), "firstDataVersion", "FTpRIqWQPs");
        setField(term315383, term315383.getClass(), "firstPlayDate", "ZjiFXXAyAx");
        setField(term315383, term315383.getClass(), "lastGameId", "dVpvPFhLJa");
        setField(term315383, term315383.getClass(), "lastRomVersion", "nYddaWYRuk");
        setField(term315383, term315383.getClass(), "lastDataVersion", "hYccvdkHbX");
        setField(term315383, term315383.getClass(), "compatibleCmVersion", "XpZzRDvdQI");
        setField(term315383, term315383.getClass(), "lastPlayDate", "FRoNgCiZLX");
        setIntField(term315383, term315383.getClass(), "lastPlaceId", -1728948276);
        setField(term315383, term315383.getClass(), "lastPlaceName", "UOXgkNLMRL");
        setIntField(term315383, term315383.getClass(), "lastRegionId", -2102573659);
        setField(term315383, term315383.getClass(), "lastRegionName", "wBXsGOdIpa");
        setIntField(term315383, term315383.getClass(), "lastAllNetId", -1852913065);
        setField(term315383, term315383.getClass(), "lastClientId", "CJGSdgnFDl");
        setIntField(term315383, term315383.getClass(), "lastUsedDeckId", -1385001679);
        setIntField(term315383, term315383.getClass(), "lastPlayMusicLevel", -894720460);
        setIntField(term315383, term315383.getClass(), "lastEmoneyBrand", 128142159);
        setField(term315381, term315381.getClass(), "user", term315383);
        setIntField(term315381, term315381.getClass(), "optionSet", -1443848456);
        setIntField(term315381, term315381.getClass(), "speed", 516808466);
        setIntField(term315381, term315381.getClass(), "mirror", -634906787);
        setIntField(term315381, term315381.getClass(), "judgeTiming", -221433252);
        setIntField(term315381, term315381.getClass(), "judgeAdjustment", -2034806301);
        setIntField(term315381, term315381.getClass(), "abort", 668515812);
        setIntField(term315381, term315381.getClass(), "stealthField", 413955295);
        setIntField(term315381, term315381.getClass(), "tapSound", -487961158);
        setIntField(term315381, term315381.getClass(), "volGuide", 1440941364);
        setIntField(term315381, term315381.getClass(), "volAll", -1833636256);
        setIntField(term315381, term315381.getClass(), "volTap", 1281446673);
        setIntField(term315381, term315381.getClass(), "volCrTap", -996475471);
        setIntField(term315381, term315381.getClass(), "volHold", 1373996642);
        setIntField(term315381, term315381.getClass(), "volSide", 277889066);
        setIntField(term315381, term315381.getClass(), "volFlick", 2107118802);
        setIntField(term315381, term315381.getClass(), "volBell", -1428856233);
        setIntField(term315381, term315381.getClass(), "volEnemy", -560561760);
        setIntField(term315381, term315381.getClass(), "volSkill", 200951658);
        setIntField(term315381, term315381.getClass(), "volDamage", -160045178);
        setIntField(term315381, term315381.getClass(), "colorField", 349061449);
        setIntField(term315381, term315381.getClass(), "colorLaneBright", 1705838470);
        setIntField(term315381, term315381.getClass(), "colorWallBright", 568564635);
        setIntField(term315381, term315381.getClass(), "colorLane", -578552993);
        setIntField(term315381, term315381.getClass(), "colorSide", 647893655);
        setIntField(term315381, term315381.getClass(), "effectDamage", 1201228016);
        setIntField(term315381, term315381.getClass(), "effectPos", 995209122);
        setIntField(term315381, term315381.getClass(), "judgeDisp", 1171553245);
        setIntField(term315381, term315381.getClass(), "judgePos", 1375037696);
        setIntField(term315381, term315381.getClass(), "judgeBreak", -303846106);
        setIntField(term315381, term315381.getClass(), "judgeHit", 1861195554);
        setIntField(term315381, term315381.getClass(), "platinumBreakDisp", 207621271);
        setIntField(term315381, term315381.getClass(), "judgeCriticalBreak", -1850529442);
        setIntField(term315381, term315381.getClass(), "matching", -689658308);
        setIntField(term315381, term315381.getClass(), "dispPlayerLv", -1420473074);
        setIntField(term315381, term315381.getClass(), "dispRating", -902312389);
        setIntField(term315381, term315381.getClass(), "dispBP", -1855830685);
        setIntField(term315381, term315381.getClass(), "headphone", -1845827652);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVolHold", argTypes, term315381, args);
    }

};


