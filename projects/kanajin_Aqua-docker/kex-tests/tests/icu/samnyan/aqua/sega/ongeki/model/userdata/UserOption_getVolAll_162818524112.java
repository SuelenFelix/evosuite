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

public class UserOption_getVolAll_162818524112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313995;

    public UserOption_getVolAll_162818524112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term314001 = new Long(-1325109462577461208L);
        term313995 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term313997 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term313999 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term314015 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term314016 = newInstance(Class.forName("java.time.LocalDate"));
        Object term314020 = newInstance(Class.forName("java.time.LocalTime"));
        Object term314025 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term314026 = newInstance(Class.forName("java.time.LocalDate"));
        Object term314030 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term313995, term313995.getClass(), "id", -4327928665528232459L);
        setLongField(term313997, term313997.getClass(), "id", 7953973123799053702L);
        setLongField(term313999, term313999.getClass(), "id", -6892615644970235009L);
        setField(term313999, term313999.getClass(), "extId", term314001);
        setField(term313999, term313999.getClass(), "luid", "fYdHEyfDKW");
        setIntField(term314016, term314016.getClass(), "year", 2026);
        setShortField(term314016, term314016.getClass(), "month", (short) 5);
        setShortField(term314016, term314016.getClass(), "day", (short) 27);
        setField(term314015, term314015.getClass(), "date", term314016);
        setByteField(term314020, term314020.getClass(), "hour", (byte) 17);
        setByteField(term314020, term314020.getClass(), "minute", (byte) 53);
        setByteField(term314020, term314020.getClass(), "second", (byte) 50);
        setIntField(term314020, term314020.getClass(), "nano", 28025394);
        setField(term314015, term314015.getClass(), "time", term314020);
        setField(term313999, term313999.getClass(), "registerTime", term314015);
        setIntField(term314026, term314026.getClass(), "year", 2021);
        setShortField(term314026, term314026.getClass(), "month", (short) 8);
        setShortField(term314026, term314026.getClass(), "day", (short) 12);
        setField(term314025, term314025.getClass(), "date", term314026);
        setByteField(term314030, term314030.getClass(), "hour", (byte) 2);
        setByteField(term314030, term314030.getClass(), "minute", (byte) 55);
        setByteField(term314030, term314030.getClass(), "second", (byte) 38);
        setIntField(term314030, term314030.getClass(), "nano", 881864768);
        setField(term314025, term314025.getClass(), "time", term314030);
        setField(term313999, term313999.getClass(), "accessTime", term314025);
        setField(term313997, term313997.getClass(), "card", term313999);
        setField(term313997, term313997.getClass(), "userName", "BsoNPgPWxB");
        setIntField(term313997, term313997.getClass(), "level", -1828205745);
        setIntField(term313997, term313997.getClass(), "reincarnationNum", 1243474858);
        setLongField(term313997, term313997.getClass(), "exp", -3898771585357563825L);
        setLongField(term313997, term313997.getClass(), "point", -586622581883939719L);
        setLongField(term313997, term313997.getClass(), "totalPoint", -5381680483349974054L);
        setIntField(term313997, term313997.getClass(), "playCount", 1121416999);
        setIntField(term313997, term313997.getClass(), "jewelCount", 1332904118);
        setIntField(term313997, term313997.getClass(), "totalJewelCount", 1829055409);
        setIntField(term313997, term313997.getClass(), "medalCount", 408341075);
        setIntField(term313997, term313997.getClass(), "playerRating", 605425949);
        setIntField(term313997, term313997.getClass(), "highestRating", 1112137680);
        setIntField(term313997, term313997.getClass(), "battlePoint", -1126417222);
        setIntField(term313997, term313997.getClass(), "bestBattlePoint", -189112873);
        setIntField(term313997, term313997.getClass(), "overDamageBattlePoint", -1678661750);
        setBooleanField(term313997, term313997.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term313997, term313997.getClass(), "nameplateId", -1209298448);
        setIntField(term313997, term313997.getClass(), "trophyId", -1168817171);
        setIntField(term313997, term313997.getClass(), "cardId", -750547824);
        setIntField(term313997, term313997.getClass(), "characterId", 1696420242);
        setIntField(term313997, term313997.getClass(), "characterVoiceNo", 369171292);
        setIntField(term313997, term313997.getClass(), "tabSetting", 825201753);
        setIntField(term313997, term313997.getClass(), "tabSortSetting", -637408898);
        setIntField(term313997, term313997.getClass(), "cardCategorySetting", -148883002);
        setIntField(term313997, term313997.getClass(), "cardSortSetting", 1443183165);
        setIntField(term313997, term313997.getClass(), "rivalScoreCategorySetting", 731959855);
        setIntField(term313997, term313997.getClass(), "playedTutorialBit", -193957305);
        setIntField(term313997, term313997.getClass(), "firstTutorialCancelNum", -726917670);
        setLongField(term313997, term313997.getClass(), "sumTechHighScore", -2669265065598088631L);
        setLongField(term313997, term313997.getClass(), "sumTechBasicHighScore", -8139125331596478534L);
        setLongField(term313997, term313997.getClass(), "sumTechAdvancedHighScore", 1666656515673297480L);
        setLongField(term313997, term313997.getClass(), "sumTechExpertHighScore", 2214028544027160276L);
        setLongField(term313997, term313997.getClass(), "sumTechMasterHighScore", -3366502180969988847L);
        setLongField(term313997, term313997.getClass(), "sumTechLunaticHighScore", -6490360152921433532L);
        setLongField(term313997, term313997.getClass(), "sumBattleHighScore", 684256637031290363L);
        setLongField(term313997, term313997.getClass(), "sumBattleBasicHighScore", -2375378647772129664L);
        setLongField(term313997, term313997.getClass(), "sumBattleAdvancedHighScore", -9161121029884811549L);
        setLongField(term313997, term313997.getClass(), "sumBattleExpertHighScore", -7364836782629892418L);
        setLongField(term313997, term313997.getClass(), "sumBattleMasterHighScore", 640006789890126894L);
        setLongField(term313997, term313997.getClass(), "sumBattleLunaticHighScore", 865697405066281619L);
        setField(term313997, term313997.getClass(), "eventWatchedDate", "XuOYnJFkpi");
        setField(term313997, term313997.getClass(), "cmEventWatchedDate", "AaOTgwWOzi");
        setField(term313997, term313997.getClass(), "firstGameId", "dMxQjRJrxH");
        setField(term313997, term313997.getClass(), "firstRomVersion", "zBVwgwrJiX");
        setField(term313997, term313997.getClass(), "firstDataVersion", "uznaIdtDlm");
        setField(term313997, term313997.getClass(), "firstPlayDate", "AzrXzATJtC");
        setField(term313997, term313997.getClass(), "lastGameId", "kIQZerlYlr");
        setField(term313997, term313997.getClass(), "lastRomVersion", "YMfXRIYvot");
        setField(term313997, term313997.getClass(), "lastDataVersion", "FiFXJqBXdC");
        setField(term313997, term313997.getClass(), "compatibleCmVersion", "yxWimtmvkl");
        setField(term313997, term313997.getClass(), "lastPlayDate", "PUzanajQSP");
        setIntField(term313997, term313997.getClass(), "lastPlaceId", -389808581);
        setField(term313997, term313997.getClass(), "lastPlaceName", "yxepsSOVzF");
        setIntField(term313997, term313997.getClass(), "lastRegionId", -397649002);
        setField(term313997, term313997.getClass(), "lastRegionName", "ZUOjNutasW");
        setIntField(term313997, term313997.getClass(), "lastAllNetId", 1366010238);
        setField(term313997, term313997.getClass(), "lastClientId", "iLnavpwPVW");
        setIntField(term313997, term313997.getClass(), "lastUsedDeckId", 2007995803);
        setIntField(term313997, term313997.getClass(), "lastPlayMusicLevel", -1496172956);
        setIntField(term313997, term313997.getClass(), "lastEmoneyBrand", -1878529349);
        setField(term313995, term313995.getClass(), "user", term313997);
        setIntField(term313995, term313995.getClass(), "optionSet", 871928103);
        setIntField(term313995, term313995.getClass(), "speed", 1691440415);
        setIntField(term313995, term313995.getClass(), "mirror", -109881007);
        setIntField(term313995, term313995.getClass(), "judgeTiming", 1736426795);
        setIntField(term313995, term313995.getClass(), "judgeAdjustment", 304236922);
        setIntField(term313995, term313995.getClass(), "abort", -1054810563);
        setIntField(term313995, term313995.getClass(), "stealthField", -2060235893);
        setIntField(term313995, term313995.getClass(), "tapSound", 924716132);
        setIntField(term313995, term313995.getClass(), "volGuide", 1162631143);
        setIntField(term313995, term313995.getClass(), "volAll", 1083987263);
        setIntField(term313995, term313995.getClass(), "volTap", 602646570);
        setIntField(term313995, term313995.getClass(), "volCrTap", -1380056152);
        setIntField(term313995, term313995.getClass(), "volHold", 1488181850);
        setIntField(term313995, term313995.getClass(), "volSide", -504206122);
        setIntField(term313995, term313995.getClass(), "volFlick", 759328703);
        setIntField(term313995, term313995.getClass(), "volBell", 32333588);
        setIntField(term313995, term313995.getClass(), "volEnemy", -1648743744);
        setIntField(term313995, term313995.getClass(), "volSkill", 1457691982);
        setIntField(term313995, term313995.getClass(), "volDamage", 1428832627);
        setIntField(term313995, term313995.getClass(), "colorField", -955584527);
        setIntField(term313995, term313995.getClass(), "colorLaneBright", 775403208);
        setIntField(term313995, term313995.getClass(), "colorWallBright", 1343036162);
        setIntField(term313995, term313995.getClass(), "colorLane", -1781890448);
        setIntField(term313995, term313995.getClass(), "colorSide", 548618826);
        setIntField(term313995, term313995.getClass(), "effectDamage", 62787565);
        setIntField(term313995, term313995.getClass(), "effectPos", -98090991);
        setIntField(term313995, term313995.getClass(), "judgeDisp", 532158335);
        setIntField(term313995, term313995.getClass(), "judgePos", 1558249406);
        setIntField(term313995, term313995.getClass(), "judgeBreak", -1550026828);
        setIntField(term313995, term313995.getClass(), "judgeHit", -1734320815);
        setIntField(term313995, term313995.getClass(), "platinumBreakDisp", 2127402225);
        setIntField(term313995, term313995.getClass(), "judgeCriticalBreak", -1120916585);
        setIntField(term313995, term313995.getClass(), "matching", -219517902);
        setIntField(term313995, term313995.getClass(), "dispPlayerLv", 1242441347);
        setIntField(term313995, term313995.getClass(), "dispRating", 2105280707);
        setIntField(term313995, term313995.getClass(), "dispBP", 1729137690);
        setIntField(term313995, term313995.getClass(), "headphone", -1206912815);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVolAll", argTypes, term313995, args);
    }

};


