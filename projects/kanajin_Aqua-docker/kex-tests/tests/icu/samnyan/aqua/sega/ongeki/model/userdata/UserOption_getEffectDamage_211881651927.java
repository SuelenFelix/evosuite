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

public class UserOption_getEffectDamage_211881651927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320925;

    public UserOption_getEffectDamage_211881651927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term320931 = new Long(6252795312796363233L);
        term320925 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term320927 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term320929 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term320945 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term320946 = newInstance(Class.forName("java.time.LocalDate"));
        Object term320950 = newInstance(Class.forName("java.time.LocalTime"));
        Object term320955 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term320956 = newInstance(Class.forName("java.time.LocalDate"));
        Object term320960 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term320925, term320925.getClass(), "id", 1615533069952143721L);
        setLongField(term320927, term320927.getClass(), "id", 2021872599700241186L);
        setLongField(term320929, term320929.getClass(), "id", -1992679262415416351L);
        setField(term320929, term320929.getClass(), "extId", term320931);
        setField(term320929, term320929.getClass(), "luid", "UHssSxGhZl");
        setIntField(term320946, term320946.getClass(), "year", 2021);
        setShortField(term320946, term320946.getClass(), "month", (short) 7);
        setShortField(term320946, term320946.getClass(), "day", (short) 2);
        setField(term320945, term320945.getClass(), "date", term320946);
        setByteField(term320950, term320950.getClass(), "hour", (byte) 17);
        setByteField(term320950, term320950.getClass(), "minute", (byte) 54);
        setByteField(term320950, term320950.getClass(), "second", (byte) 6);
        setIntField(term320950, term320950.getClass(), "nano", 550039456);
        setField(term320945, term320945.getClass(), "time", term320950);
        setField(term320929, term320929.getClass(), "registerTime", term320945);
        setIntField(term320956, term320956.getClass(), "year", 2016);
        setShortField(term320956, term320956.getClass(), "month", (short) 8);
        setShortField(term320956, term320956.getClass(), "day", (short) 18);
        setField(term320955, term320955.getClass(), "date", term320956);
        setByteField(term320960, term320960.getClass(), "hour", (byte) 15);
        setByteField(term320960, term320960.getClass(), "minute", (byte) 58);
        setByteField(term320960, term320960.getClass(), "second", (byte) 7);
        setIntField(term320960, term320960.getClass(), "nano", 542469927);
        setField(term320955, term320955.getClass(), "time", term320960);
        setField(term320929, term320929.getClass(), "accessTime", term320955);
        setField(term320927, term320927.getClass(), "card", term320929);
        setField(term320927, term320927.getClass(), "userName", "OULyJRsvla");
        setIntField(term320927, term320927.getClass(), "level", -749956168);
        setIntField(term320927, term320927.getClass(), "reincarnationNum", -1496972303);
        setLongField(term320927, term320927.getClass(), "exp", -809156316843572807L);
        setLongField(term320927, term320927.getClass(), "point", 2878458912173185951L);
        setLongField(term320927, term320927.getClass(), "totalPoint", -1100013383159936569L);
        setIntField(term320927, term320927.getClass(), "playCount", -1109003047);
        setIntField(term320927, term320927.getClass(), "jewelCount", -2064030558);
        setIntField(term320927, term320927.getClass(), "totalJewelCount", 565051097);
        setIntField(term320927, term320927.getClass(), "medalCount", 1557145557);
        setIntField(term320927, term320927.getClass(), "playerRating", -1415673374);
        setIntField(term320927, term320927.getClass(), "highestRating", 2095645347);
        setIntField(term320927, term320927.getClass(), "battlePoint", 1369572828);
        setIntField(term320927, term320927.getClass(), "bestBattlePoint", -1992905705);
        setIntField(term320927, term320927.getClass(), "overDamageBattlePoint", -1177935884);
        setBooleanField(term320927, term320927.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term320927, term320927.getClass(), "nameplateId", 1889117383);
        setIntField(term320927, term320927.getClass(), "trophyId", -170081121);
        setIntField(term320927, term320927.getClass(), "cardId", -2097487613);
        setIntField(term320927, term320927.getClass(), "characterId", 1808418358);
        setIntField(term320927, term320927.getClass(), "characterVoiceNo", 360558872);
        setIntField(term320927, term320927.getClass(), "tabSetting", 504431450);
        setIntField(term320927, term320927.getClass(), "tabSortSetting", -301566658);
        setIntField(term320927, term320927.getClass(), "cardCategorySetting", 1198050750);
        setIntField(term320927, term320927.getClass(), "cardSortSetting", -1763850463);
        setIntField(term320927, term320927.getClass(), "rivalScoreCategorySetting", 1933564179);
        setIntField(term320927, term320927.getClass(), "playedTutorialBit", -1342711508);
        setIntField(term320927, term320927.getClass(), "firstTutorialCancelNum", 156889890);
        setLongField(term320927, term320927.getClass(), "sumTechHighScore", 7110354079696827462L);
        setLongField(term320927, term320927.getClass(), "sumTechBasicHighScore", -7560448772335261775L);
        setLongField(term320927, term320927.getClass(), "sumTechAdvancedHighScore", 8358330966237348746L);
        setLongField(term320927, term320927.getClass(), "sumTechExpertHighScore", 2850037307350232239L);
        setLongField(term320927, term320927.getClass(), "sumTechMasterHighScore", -5404548459248636358L);
        setLongField(term320927, term320927.getClass(), "sumTechLunaticHighScore", -5359397066811867801L);
        setLongField(term320927, term320927.getClass(), "sumBattleHighScore", -7924364661858367105L);
        setLongField(term320927, term320927.getClass(), "sumBattleBasicHighScore", -2117113172672139560L);
        setLongField(term320927, term320927.getClass(), "sumBattleAdvancedHighScore", -6204150249550799771L);
        setLongField(term320927, term320927.getClass(), "sumBattleExpertHighScore", -4244862584352797319L);
        setLongField(term320927, term320927.getClass(), "sumBattleMasterHighScore", -3226643333843552869L);
        setLongField(term320927, term320927.getClass(), "sumBattleLunaticHighScore", 5285733725331190433L);
        setField(term320927, term320927.getClass(), "eventWatchedDate", "qydPlQyJFB");
        setField(term320927, term320927.getClass(), "cmEventWatchedDate", "epRdHMuOKQ");
        setField(term320927, term320927.getClass(), "firstGameId", "RSQGaKCIKt");
        setField(term320927, term320927.getClass(), "firstRomVersion", "IngSpxExoU");
        setField(term320927, term320927.getClass(), "firstDataVersion", "gIaPBjorOL");
        setField(term320927, term320927.getClass(), "firstPlayDate", "ieMMyQTika");
        setField(term320927, term320927.getClass(), "lastGameId", "QMYkgQIcUH");
        setField(term320927, term320927.getClass(), "lastRomVersion", "PtTmhrKoQv");
        setField(term320927, term320927.getClass(), "lastDataVersion", "TvsnWholhL");
        setField(term320927, term320927.getClass(), "compatibleCmVersion", "psqMVxboBk");
        setField(term320927, term320927.getClass(), "lastPlayDate", "qYwHevYIWw");
        setIntField(term320927, term320927.getClass(), "lastPlaceId", -1894814727);
        setField(term320927, term320927.getClass(), "lastPlaceName", "WehHmbUeBF");
        setIntField(term320927, term320927.getClass(), "lastRegionId", 2117828951);
        setField(term320927, term320927.getClass(), "lastRegionName", "ZAEuZhqzsV");
        setIntField(term320927, term320927.getClass(), "lastAllNetId", -1681460075);
        setField(term320927, term320927.getClass(), "lastClientId", "dwUjCfkGTY");
        setIntField(term320927, term320927.getClass(), "lastUsedDeckId", 1623133519);
        setIntField(term320927, term320927.getClass(), "lastPlayMusicLevel", 1251734144);
        setIntField(term320927, term320927.getClass(), "lastEmoneyBrand", 1251301670);
        setField(term320925, term320925.getClass(), "user", term320927);
        setIntField(term320925, term320925.getClass(), "optionSet", 1800213126);
        setIntField(term320925, term320925.getClass(), "speed", 2049234328);
        setIntField(term320925, term320925.getClass(), "mirror", 901194728);
        setIntField(term320925, term320925.getClass(), "judgeTiming", 1866086190);
        setIntField(term320925, term320925.getClass(), "judgeAdjustment", 1225074549);
        setIntField(term320925, term320925.getClass(), "abort", 1184210193);
        setIntField(term320925, term320925.getClass(), "stealthField", 2086235255);
        setIntField(term320925, term320925.getClass(), "tapSound", -92302532);
        setIntField(term320925, term320925.getClass(), "volGuide", 436721064);
        setIntField(term320925, term320925.getClass(), "volAll", 738788126);
        setIntField(term320925, term320925.getClass(), "volTap", 810127498);
        setIntField(term320925, term320925.getClass(), "volCrTap", -1265159953);
        setIntField(term320925, term320925.getClass(), "volHold", 714658774);
        setIntField(term320925, term320925.getClass(), "volSide", 1593835846);
        setIntField(term320925, term320925.getClass(), "volFlick", 1654533596);
        setIntField(term320925, term320925.getClass(), "volBell", 2022064558);
        setIntField(term320925, term320925.getClass(), "volEnemy", -53372402);
        setIntField(term320925, term320925.getClass(), "volSkill", 1387618380);
        setIntField(term320925, term320925.getClass(), "volDamage", -1207988984);
        setIntField(term320925, term320925.getClass(), "colorField", 337129947);
        setIntField(term320925, term320925.getClass(), "colorLaneBright", 189757655);
        setIntField(term320925, term320925.getClass(), "colorWallBright", -1825052032);
        setIntField(term320925, term320925.getClass(), "colorLane", 209094476);
        setIntField(term320925, term320925.getClass(), "colorSide", -1307273912);
        setIntField(term320925, term320925.getClass(), "effectDamage", 126451352);
        setIntField(term320925, term320925.getClass(), "effectPos", -1404768430);
        setIntField(term320925, term320925.getClass(), "judgeDisp", -1256356721);
        setIntField(term320925, term320925.getClass(), "judgePos", 2055399146);
        setIntField(term320925, term320925.getClass(), "judgeBreak", -959131846);
        setIntField(term320925, term320925.getClass(), "judgeHit", -32576473);
        setIntField(term320925, term320925.getClass(), "platinumBreakDisp", 265606564);
        setIntField(term320925, term320925.getClass(), "judgeCriticalBreak", -96596021);
        setIntField(term320925, term320925.getClass(), "matching", -396078581);
        setIntField(term320925, term320925.getClass(), "dispPlayerLv", 663055983);
        setIntField(term320925, term320925.getClass(), "dispRating", 460058320);
        setIntField(term320925, term320925.getClass(), "dispBP", 1623517509);
        setIntField(term320925, term320925.getClass(), "headphone", -1678059035);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEffectDamage", argTypes, term320925, args);
    }

};


