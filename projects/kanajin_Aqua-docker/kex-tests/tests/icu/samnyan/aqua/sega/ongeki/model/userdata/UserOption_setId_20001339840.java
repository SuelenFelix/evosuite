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

public class UserOption_setId_20001339840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326931;
     Object term327233;

    public UserOption_setId_20001339840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term326937 = new Long(8965244485590834147L);
        term326931 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term326933 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term326935 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term326951 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term326952 = newInstance(Class.forName("java.time.LocalDate"));
        Object term326956 = newInstance(Class.forName("java.time.LocalTime"));
        Object term326961 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term326962 = newInstance(Class.forName("java.time.LocalDate"));
        Object term326966 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term326931, term326931.getClass(), "id", 6933976427766073853L);
        setLongField(term326933, term326933.getClass(), "id", 6838745908856252666L);
        setLongField(term326935, term326935.getClass(), "id", 2950240032094063391L);
        setField(term326935, term326935.getClass(), "extId", term326937);
        setField(term326935, term326935.getClass(), "luid", "DWYKPFMSuM");
        setIntField(term326952, term326952.getClass(), "year", 2019);
        setShortField(term326952, term326952.getClass(), "month", (short) 10);
        setShortField(term326952, term326952.getClass(), "day", (short) 9);
        setField(term326951, term326951.getClass(), "date", term326952);
        setByteField(term326956, term326956.getClass(), "hour", (byte) 20);
        setByteField(term326956, term326956.getClass(), "minute", (byte) 33);
        setByteField(term326956, term326956.getClass(), "second", (byte) 27);
        setIntField(term326956, term326956.getClass(), "nano", 496826929);
        setField(term326951, term326951.getClass(), "time", term326956);
        setField(term326935, term326935.getClass(), "registerTime", term326951);
        setIntField(term326962, term326962.getClass(), "year", 2026);
        setShortField(term326962, term326962.getClass(), "month", (short) 7);
        setShortField(term326962, term326962.getClass(), "day", (short) 23);
        setField(term326961, term326961.getClass(), "date", term326962);
        setByteField(term326966, term326966.getClass(), "hour", (byte) 1);
        setByteField(term326966, term326966.getClass(), "minute", (byte) 40);
        setByteField(term326966, term326966.getClass(), "second", (byte) 6);
        setIntField(term326966, term326966.getClass(), "nano", 967732489);
        setField(term326961, term326961.getClass(), "time", term326966);
        setField(term326935, term326935.getClass(), "accessTime", term326961);
        setField(term326933, term326933.getClass(), "card", term326935);
        setField(term326933, term326933.getClass(), "userName", "UkqluOdPWF");
        setIntField(term326933, term326933.getClass(), "level", -74847248);
        setIntField(term326933, term326933.getClass(), "reincarnationNum", 1349133029);
        setLongField(term326933, term326933.getClass(), "exp", -3195990170937689065L);
        setLongField(term326933, term326933.getClass(), "point", 7420740559289314281L);
        setLongField(term326933, term326933.getClass(), "totalPoint", -8222986295733930733L);
        setIntField(term326933, term326933.getClass(), "playCount", 1738756677);
        setIntField(term326933, term326933.getClass(), "jewelCount", -1255779649);
        setIntField(term326933, term326933.getClass(), "totalJewelCount", -356167425);
        setIntField(term326933, term326933.getClass(), "medalCount", 1909518175);
        setIntField(term326933, term326933.getClass(), "playerRating", 638757725);
        setIntField(term326933, term326933.getClass(), "highestRating", -72403898);
        setIntField(term326933, term326933.getClass(), "battlePoint", 362457699);
        setIntField(term326933, term326933.getClass(), "bestBattlePoint", -291466808);
        setIntField(term326933, term326933.getClass(), "overDamageBattlePoint", -1229943382);
        setBooleanField(term326933, term326933.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term326933, term326933.getClass(), "nameplateId", 117820444);
        setIntField(term326933, term326933.getClass(), "trophyId", 574430116);
        setIntField(term326933, term326933.getClass(), "cardId", -1277204012);
        setIntField(term326933, term326933.getClass(), "characterId", 1791055761);
        setIntField(term326933, term326933.getClass(), "characterVoiceNo", -602550675);
        setIntField(term326933, term326933.getClass(), "tabSetting", 291160240);
        setIntField(term326933, term326933.getClass(), "tabSortSetting", -1158573616);
        setIntField(term326933, term326933.getClass(), "cardCategorySetting", -727368325);
        setIntField(term326933, term326933.getClass(), "cardSortSetting", 320771066);
        setIntField(term326933, term326933.getClass(), "rivalScoreCategorySetting", 169920236);
        setIntField(term326933, term326933.getClass(), "playedTutorialBit", 206537770);
        setIntField(term326933, term326933.getClass(), "firstTutorialCancelNum", 369187601);
        setLongField(term326933, term326933.getClass(), "sumTechHighScore", -6846889668643955770L);
        setLongField(term326933, term326933.getClass(), "sumTechBasicHighScore", 3035066285055832671L);
        setLongField(term326933, term326933.getClass(), "sumTechAdvancedHighScore", -4830640647832891511L);
        setLongField(term326933, term326933.getClass(), "sumTechExpertHighScore", 6183931390421933232L);
        setLongField(term326933, term326933.getClass(), "sumTechMasterHighScore", -8654568405684877391L);
        setLongField(term326933, term326933.getClass(), "sumTechLunaticHighScore", -5771539723254636318L);
        setLongField(term326933, term326933.getClass(), "sumBattleHighScore", 9051234762466997998L);
        setLongField(term326933, term326933.getClass(), "sumBattleBasicHighScore", 7464528500809606169L);
        setLongField(term326933, term326933.getClass(), "sumBattleAdvancedHighScore", 2940621417051294948L);
        setLongField(term326933, term326933.getClass(), "sumBattleExpertHighScore", -2353278769450674647L);
        setLongField(term326933, term326933.getClass(), "sumBattleMasterHighScore", 1070587154209696046L);
        setLongField(term326933, term326933.getClass(), "sumBattleLunaticHighScore", 5280291493894555191L);
        setField(term326933, term326933.getClass(), "eventWatchedDate", "quQUSXAjZl");
        setField(term326933, term326933.getClass(), "cmEventWatchedDate", "PKZWDyuIDG");
        setField(term326933, term326933.getClass(), "firstGameId", "XPgkQgDDZM");
        setField(term326933, term326933.getClass(), "firstRomVersion", "BksKBJoApS");
        setField(term326933, term326933.getClass(), "firstDataVersion", "WJRkcFVplq");
        setField(term326933, term326933.getClass(), "firstPlayDate", "alTGbTVimv");
        setField(term326933, term326933.getClass(), "lastGameId", "BuHcxQArjr");
        setField(term326933, term326933.getClass(), "lastRomVersion", "kWjsKPCzRu");
        setField(term326933, term326933.getClass(), "lastDataVersion", "YsuKWZuxrx");
        setField(term326933, term326933.getClass(), "compatibleCmVersion", "nTKQaYhTDl");
        setField(term326933, term326933.getClass(), "lastPlayDate", "HHIoTJfFaY");
        setIntField(term326933, term326933.getClass(), "lastPlaceId", -124508864);
        setField(term326933, term326933.getClass(), "lastPlaceName", "kplFQjJBJv");
        setIntField(term326933, term326933.getClass(), "lastRegionId", 121602955);
        setField(term326933, term326933.getClass(), "lastRegionName", "WhViOMdYzv");
        setIntField(term326933, term326933.getClass(), "lastAllNetId", -2084367050);
        setField(term326933, term326933.getClass(), "lastClientId", "IMJKWmXUUI");
        setIntField(term326933, term326933.getClass(), "lastUsedDeckId", 1858872230);
        setIntField(term326933, term326933.getClass(), "lastPlayMusicLevel", -446475302);
        setIntField(term326933, term326933.getClass(), "lastEmoneyBrand", -1159128285);
        setField(term326931, term326931.getClass(), "user", term326933);
        setIntField(term326931, term326931.getClass(), "optionSet", -2100050641);
        setIntField(term326931, term326931.getClass(), "speed", -1697913355);
        setIntField(term326931, term326931.getClass(), "mirror", 974358051);
        setIntField(term326931, term326931.getClass(), "judgeTiming", -866480515);
        setIntField(term326931, term326931.getClass(), "judgeAdjustment", -250106245);
        setIntField(term326931, term326931.getClass(), "abort", 1221416715);
        setIntField(term326931, term326931.getClass(), "stealthField", -758703841);
        setIntField(term326931, term326931.getClass(), "tapSound", -1977073492);
        setIntField(term326931, term326931.getClass(), "volGuide", -642870222);
        setIntField(term326931, term326931.getClass(), "volAll", -1866246010);
        setIntField(term326931, term326931.getClass(), "volTap", -1362789222);
        setIntField(term326931, term326931.getClass(), "volCrTap", 2122599008);
        setIntField(term326931, term326931.getClass(), "volHold", 1702941920);
        setIntField(term326931, term326931.getClass(), "volSide", -748655105);
        setIntField(term326931, term326931.getClass(), "volFlick", -481792623);
        setIntField(term326931, term326931.getClass(), "volBell", -1085919621);
        setIntField(term326931, term326931.getClass(), "volEnemy", -1422637686);
        setIntField(term326931, term326931.getClass(), "volSkill", -1580362300);
        setIntField(term326931, term326931.getClass(), "volDamage", 1761080017);
        setIntField(term326931, term326931.getClass(), "colorField", -270482460);
        setIntField(term326931, term326931.getClass(), "colorLaneBright", -597346065);
        setIntField(term326931, term326931.getClass(), "colorWallBright", -433489718);
        setIntField(term326931, term326931.getClass(), "colorLane", 1813446622);
        setIntField(term326931, term326931.getClass(), "colorSide", 1626106011);
        setIntField(term326931, term326931.getClass(), "effectDamage", 1272067855);
        setIntField(term326931, term326931.getClass(), "effectPos", 1890985441);
        setIntField(term326931, term326931.getClass(), "judgeDisp", 723313173);
        setIntField(term326931, term326931.getClass(), "judgePos", -2068262386);
        setIntField(term326931, term326931.getClass(), "judgeBreak", -166909712);
        setIntField(term326931, term326931.getClass(), "judgeHit", -1454715863);
        setIntField(term326931, term326931.getClass(), "platinumBreakDisp", 748018708);
        setIntField(term326931, term326931.getClass(), "judgeCriticalBreak", -1548022102);
        setIntField(term326931, term326931.getClass(), "matching", -164823905);
        setIntField(term326931, term326931.getClass(), "dispPlayerLv", -2080233276);
        setIntField(term326931, term326931.getClass(), "dispRating", 1575457625);
        setIntField(term326931, term326931.getClass(), "dispBP", -1142846284);
        setIntField(term326931, term326931.getClass(), "headphone", 1042744692);
        term327233 = new Long(-2372957556537083228L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term327233;
        callMethod(klass, "setId", argTypes, term326931, args);
    }

};


