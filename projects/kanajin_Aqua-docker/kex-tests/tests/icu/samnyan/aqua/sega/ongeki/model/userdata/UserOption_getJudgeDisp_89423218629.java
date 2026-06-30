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

public class UserOption_getJudgeDisp_89423218629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term321849;

    public UserOption_getJudgeDisp_89423218629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term321855 = new Long(2712394591642260550L);
        term321849 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term321851 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term321853 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term321869 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term321870 = newInstance(Class.forName("java.time.LocalDate"));
        Object term321874 = newInstance(Class.forName("java.time.LocalTime"));
        Object term321879 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term321880 = newInstance(Class.forName("java.time.LocalDate"));
        Object term321884 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term321849, term321849.getClass(), "id", 5245288349226754219L);
        setLongField(term321851, term321851.getClass(), "id", 2371178599833625970L);
        setLongField(term321853, term321853.getClass(), "id", -5633836881151715335L);
        setField(term321853, term321853.getClass(), "extId", term321855);
        setField(term321853, term321853.getClass(), "luid", "qSGNdDzLva");
        setIntField(term321870, term321870.getClass(), "year", 2024);
        setShortField(term321870, term321870.getClass(), "month", (short) 4);
        setShortField(term321870, term321870.getClass(), "day", (short) 9);
        setField(term321869, term321869.getClass(), "date", term321870);
        setByteField(term321874, term321874.getClass(), "hour", (byte) 8);
        setByteField(term321874, term321874.getClass(), "minute", (byte) 45);
        setByteField(term321874, term321874.getClass(), "second", (byte) 20);
        setIntField(term321874, term321874.getClass(), "nano", 649441088);
        setField(term321869, term321869.getClass(), "time", term321874);
        setField(term321853, term321853.getClass(), "registerTime", term321869);
        setIntField(term321880, term321880.getClass(), "year", 2011);
        setShortField(term321880, term321880.getClass(), "month", (short) 3);
        setShortField(term321880, term321880.getClass(), "day", (short) 9);
        setField(term321879, term321879.getClass(), "date", term321880);
        setByteField(term321884, term321884.getClass(), "hour", (byte) 21);
        setByteField(term321884, term321884.getClass(), "minute", (byte) 8);
        setByteField(term321884, term321884.getClass(), "second", (byte) 45);
        setIntField(term321884, term321884.getClass(), "nano", 222626490);
        setField(term321879, term321879.getClass(), "time", term321884);
        setField(term321853, term321853.getClass(), "accessTime", term321879);
        setField(term321851, term321851.getClass(), "card", term321853);
        setField(term321851, term321851.getClass(), "userName", "CPbDAxizTH");
        setIntField(term321851, term321851.getClass(), "level", 1190053843);
        setIntField(term321851, term321851.getClass(), "reincarnationNum", -750908998);
        setLongField(term321851, term321851.getClass(), "exp", 6777662962113341372L);
        setLongField(term321851, term321851.getClass(), "point", -5374522767363815996L);
        setLongField(term321851, term321851.getClass(), "totalPoint", -8529044132022816320L);
        setIntField(term321851, term321851.getClass(), "playCount", 1543613241);
        setIntField(term321851, term321851.getClass(), "jewelCount", 1066517946);
        setIntField(term321851, term321851.getClass(), "totalJewelCount", 1950386050);
        setIntField(term321851, term321851.getClass(), "medalCount", 1986349058);
        setIntField(term321851, term321851.getClass(), "playerRating", -246172605);
        setIntField(term321851, term321851.getClass(), "highestRating", -911870500);
        setIntField(term321851, term321851.getClass(), "battlePoint", 1943346435);
        setIntField(term321851, term321851.getClass(), "bestBattlePoint", -1303010347);
        setIntField(term321851, term321851.getClass(), "overDamageBattlePoint", -654353389);
        setBooleanField(term321851, term321851.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term321851, term321851.getClass(), "nameplateId", 1416494399);
        setIntField(term321851, term321851.getClass(), "trophyId", 150474550);
        setIntField(term321851, term321851.getClass(), "cardId", 1361897823);
        setIntField(term321851, term321851.getClass(), "characterId", -655935832);
        setIntField(term321851, term321851.getClass(), "characterVoiceNo", 1924786231);
        setIntField(term321851, term321851.getClass(), "tabSetting", 1433368139);
        setIntField(term321851, term321851.getClass(), "tabSortSetting", 1683289870);
        setIntField(term321851, term321851.getClass(), "cardCategorySetting", 2006485504);
        setIntField(term321851, term321851.getClass(), "cardSortSetting", -1969509086);
        setIntField(term321851, term321851.getClass(), "rivalScoreCategorySetting", -848266892);
        setIntField(term321851, term321851.getClass(), "playedTutorialBit", -964887760);
        setIntField(term321851, term321851.getClass(), "firstTutorialCancelNum", 1274799342);
        setLongField(term321851, term321851.getClass(), "sumTechHighScore", -6327298343238875524L);
        setLongField(term321851, term321851.getClass(), "sumTechBasicHighScore", 7696809548936340076L);
        setLongField(term321851, term321851.getClass(), "sumTechAdvancedHighScore", 3069930871081909553L);
        setLongField(term321851, term321851.getClass(), "sumTechExpertHighScore", 5151544670807697728L);
        setLongField(term321851, term321851.getClass(), "sumTechMasterHighScore", -2181369800474527472L);
        setLongField(term321851, term321851.getClass(), "sumTechLunaticHighScore", -3848565366296866439L);
        setLongField(term321851, term321851.getClass(), "sumBattleHighScore", 378744599836536621L);
        setLongField(term321851, term321851.getClass(), "sumBattleBasicHighScore", -5774385032391451791L);
        setLongField(term321851, term321851.getClass(), "sumBattleAdvancedHighScore", -6883978923122914174L);
        setLongField(term321851, term321851.getClass(), "sumBattleExpertHighScore", -1116142067364788155L);
        setLongField(term321851, term321851.getClass(), "sumBattleMasterHighScore", -1408717859422936009L);
        setLongField(term321851, term321851.getClass(), "sumBattleLunaticHighScore", 403981347063069624L);
        setField(term321851, term321851.getClass(), "eventWatchedDate", "VHsIzioifh");
        setField(term321851, term321851.getClass(), "cmEventWatchedDate", "MdRwFcbooy");
        setField(term321851, term321851.getClass(), "firstGameId", "aPGTnoEadP");
        setField(term321851, term321851.getClass(), "firstRomVersion", "PfFzpKOrQS");
        setField(term321851, term321851.getClass(), "firstDataVersion", "DSDtKcOdiE");
        setField(term321851, term321851.getClass(), "firstPlayDate", "iUFhyhwlaa");
        setField(term321851, term321851.getClass(), "lastGameId", "pxjDIIssdK");
        setField(term321851, term321851.getClass(), "lastRomVersion", "ZUudFyRHug");
        setField(term321851, term321851.getClass(), "lastDataVersion", "ZDYoSCSDjL");
        setField(term321851, term321851.getClass(), "compatibleCmVersion", "SSUfojNPnM");
        setField(term321851, term321851.getClass(), "lastPlayDate", "SPkvVPUWuN");
        setIntField(term321851, term321851.getClass(), "lastPlaceId", 1317657769);
        setField(term321851, term321851.getClass(), "lastPlaceName", "QqKHskPchs");
        setIntField(term321851, term321851.getClass(), "lastRegionId", 1819374556);
        setField(term321851, term321851.getClass(), "lastRegionName", "jiMCAqdzRf");
        setIntField(term321851, term321851.getClass(), "lastAllNetId", 255223769);
        setField(term321851, term321851.getClass(), "lastClientId", "kAkegfkfCr");
        setIntField(term321851, term321851.getClass(), "lastUsedDeckId", 1215811376);
        setIntField(term321851, term321851.getClass(), "lastPlayMusicLevel", -1882811835);
        setIntField(term321851, term321851.getClass(), "lastEmoneyBrand", -121309994);
        setField(term321849, term321849.getClass(), "user", term321851);
        setIntField(term321849, term321849.getClass(), "optionSet", -434978551);
        setIntField(term321849, term321849.getClass(), "speed", 654698176);
        setIntField(term321849, term321849.getClass(), "mirror", 489056517);
        setIntField(term321849, term321849.getClass(), "judgeTiming", 988286809);
        setIntField(term321849, term321849.getClass(), "judgeAdjustment", -1051875058);
        setIntField(term321849, term321849.getClass(), "abort", -2098463126);
        setIntField(term321849, term321849.getClass(), "stealthField", -1865713523);
        setIntField(term321849, term321849.getClass(), "tapSound", 1294052524);
        setIntField(term321849, term321849.getClass(), "volGuide", 1189138215);
        setIntField(term321849, term321849.getClass(), "volAll", 1305481630);
        setIntField(term321849, term321849.getClass(), "volTap", -1239114143);
        setIntField(term321849, term321849.getClass(), "volCrTap", -407382435);
        setIntField(term321849, term321849.getClass(), "volHold", 1687528554);
        setIntField(term321849, term321849.getClass(), "volSide", 1912021383);
        setIntField(term321849, term321849.getClass(), "volFlick", 1069651811);
        setIntField(term321849, term321849.getClass(), "volBell", 1490758519);
        setIntField(term321849, term321849.getClass(), "volEnemy", -1904018713);
        setIntField(term321849, term321849.getClass(), "volSkill", 938233691);
        setIntField(term321849, term321849.getClass(), "volDamage", 1318104474);
        setIntField(term321849, term321849.getClass(), "colorField", -1397230349);
        setIntField(term321849, term321849.getClass(), "colorLaneBright", -1717374196);
        setIntField(term321849, term321849.getClass(), "colorWallBright", -1680947212);
        setIntField(term321849, term321849.getClass(), "colorLane", 1243807284);
        setIntField(term321849, term321849.getClass(), "colorSide", 488607086);
        setIntField(term321849, term321849.getClass(), "effectDamage", 739236682);
        setIntField(term321849, term321849.getClass(), "effectPos", 727340192);
        setIntField(term321849, term321849.getClass(), "judgeDisp", 2011208654);
        setIntField(term321849, term321849.getClass(), "judgePos", -667676644);
        setIntField(term321849, term321849.getClass(), "judgeBreak", 1950148088);
        setIntField(term321849, term321849.getClass(), "judgeHit", 1655153972);
        setIntField(term321849, term321849.getClass(), "platinumBreakDisp", -572124943);
        setIntField(term321849, term321849.getClass(), "judgeCriticalBreak", 1705739004);
        setIntField(term321849, term321849.getClass(), "matching", -1637230216);
        setIntField(term321849, term321849.getClass(), "dispPlayerLv", 937338727);
        setIntField(term321849, term321849.getClass(), "dispRating", 1373177568);
        setIntField(term321849, term321849.getClass(), "dispBP", -1176571827);
        setIntField(term321849, term321849.getClass(), "headphone", -1847648617);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJudgeDisp", argTypes, term321849, args);
    }

};


