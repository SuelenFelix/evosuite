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

public class UserOption_getDispPlayerLv_51952573436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term325083;

    public UserOption_getDispPlayerLv_51952573436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term325089 = new Long(3288572082902580031L);
        term325083 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term325085 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term325087 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term325103 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term325104 = newInstance(Class.forName("java.time.LocalDate"));
        Object term325108 = newInstance(Class.forName("java.time.LocalTime"));
        Object term325113 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term325114 = newInstance(Class.forName("java.time.LocalDate"));
        Object term325118 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term325083, term325083.getClass(), "id", 6300684202466611695L);
        setLongField(term325085, term325085.getClass(), "id", 5695916309380233708L);
        setLongField(term325087, term325087.getClass(), "id", 1015957730541608891L);
        setField(term325087, term325087.getClass(), "extId", term325089);
        setField(term325087, term325087.getClass(), "luid", "MXqfetTFvD");
        setIntField(term325104, term325104.getClass(), "year", 2020);
        setShortField(term325104, term325104.getClass(), "month", (short) 3);
        setShortField(term325104, term325104.getClass(), "day", (short) 1);
        setField(term325103, term325103.getClass(), "date", term325104);
        setByteField(term325108, term325108.getClass(), "hour", (byte) 10);
        setByteField(term325108, term325108.getClass(), "minute", (byte) 20);
        setByteField(term325108, term325108.getClass(), "second", (byte) 12);
        setIntField(term325108, term325108.getClass(), "nano", 592504712);
        setField(term325103, term325103.getClass(), "time", term325108);
        setField(term325087, term325087.getClass(), "registerTime", term325103);
        setIntField(term325114, term325114.getClass(), "year", 2023);
        setShortField(term325114, term325114.getClass(), "month", (short) 2);
        setShortField(term325114, term325114.getClass(), "day", (short) 18);
        setField(term325113, term325113.getClass(), "date", term325114);
        setByteField(term325118, term325118.getClass(), "hour", (byte) 18);
        setByteField(term325118, term325118.getClass(), "minute", (byte) 28);
        setByteField(term325118, term325118.getClass(), "second", (byte) 5);
        setIntField(term325118, term325118.getClass(), "nano", 178363574);
        setField(term325113, term325113.getClass(), "time", term325118);
        setField(term325087, term325087.getClass(), "accessTime", term325113);
        setField(term325085, term325085.getClass(), "card", term325087);
        setField(term325085, term325085.getClass(), "userName", "ugxhJteUru");
        setIntField(term325085, term325085.getClass(), "level", 2075287923);
        setIntField(term325085, term325085.getClass(), "reincarnationNum", -1875723336);
        setLongField(term325085, term325085.getClass(), "exp", 4414929174490235910L);
        setLongField(term325085, term325085.getClass(), "point", -1818334143532888750L);
        setLongField(term325085, term325085.getClass(), "totalPoint", -8679840403600449613L);
        setIntField(term325085, term325085.getClass(), "playCount", 1158346596);
        setIntField(term325085, term325085.getClass(), "jewelCount", -799463638);
        setIntField(term325085, term325085.getClass(), "totalJewelCount", -380519500);
        setIntField(term325085, term325085.getClass(), "medalCount", 1945185349);
        setIntField(term325085, term325085.getClass(), "playerRating", 2056942519);
        setIntField(term325085, term325085.getClass(), "highestRating", -696885408);
        setIntField(term325085, term325085.getClass(), "battlePoint", 1627187903);
        setIntField(term325085, term325085.getClass(), "bestBattlePoint", 161283721);
        setIntField(term325085, term325085.getClass(), "overDamageBattlePoint", 336268441);
        setBooleanField(term325085, term325085.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term325085, term325085.getClass(), "nameplateId", 595161087);
        setIntField(term325085, term325085.getClass(), "trophyId", -1982456131);
        setIntField(term325085, term325085.getClass(), "cardId", -1690301446);
        setIntField(term325085, term325085.getClass(), "characterId", 1706794411);
        setIntField(term325085, term325085.getClass(), "characterVoiceNo", 617390435);
        setIntField(term325085, term325085.getClass(), "tabSetting", -396543789);
        setIntField(term325085, term325085.getClass(), "tabSortSetting", -406646430);
        setIntField(term325085, term325085.getClass(), "cardCategorySetting", -1470464274);
        setIntField(term325085, term325085.getClass(), "cardSortSetting", 1757332469);
        setIntField(term325085, term325085.getClass(), "rivalScoreCategorySetting", 1564464570);
        setIntField(term325085, term325085.getClass(), "playedTutorialBit", 594749411);
        setIntField(term325085, term325085.getClass(), "firstTutorialCancelNum", 606315381);
        setLongField(term325085, term325085.getClass(), "sumTechHighScore", -7429022832073637026L);
        setLongField(term325085, term325085.getClass(), "sumTechBasicHighScore", 3788676742687038524L);
        setLongField(term325085, term325085.getClass(), "sumTechAdvancedHighScore", -5249570594031573791L);
        setLongField(term325085, term325085.getClass(), "sumTechExpertHighScore", -5957038548905875044L);
        setLongField(term325085, term325085.getClass(), "sumTechMasterHighScore", 9017076185498629241L);
        setLongField(term325085, term325085.getClass(), "sumTechLunaticHighScore", 5851667235039824230L);
        setLongField(term325085, term325085.getClass(), "sumBattleHighScore", -8232602089789519387L);
        setLongField(term325085, term325085.getClass(), "sumBattleBasicHighScore", 8986341715404728806L);
        setLongField(term325085, term325085.getClass(), "sumBattleAdvancedHighScore", -1182734619173495865L);
        setLongField(term325085, term325085.getClass(), "sumBattleExpertHighScore", 5138349767553699719L);
        setLongField(term325085, term325085.getClass(), "sumBattleMasterHighScore", -7479008384115531349L);
        setLongField(term325085, term325085.getClass(), "sumBattleLunaticHighScore", -1496506506686353292L);
        setField(term325085, term325085.getClass(), "eventWatchedDate", "kVJxhwSoGJ");
        setField(term325085, term325085.getClass(), "cmEventWatchedDate", "RtSyuyzpwW");
        setField(term325085, term325085.getClass(), "firstGameId", "tOuKeQbSHc");
        setField(term325085, term325085.getClass(), "firstRomVersion", "VcJuvXUwfF");
        setField(term325085, term325085.getClass(), "firstDataVersion", "xzoHOhHTFd");
        setField(term325085, term325085.getClass(), "firstPlayDate", "llqIxXBxQW");
        setField(term325085, term325085.getClass(), "lastGameId", "gtnltRAFYC");
        setField(term325085, term325085.getClass(), "lastRomVersion", "CwRPXztOjP");
        setField(term325085, term325085.getClass(), "lastDataVersion", "QgzTGvUEih");
        setField(term325085, term325085.getClass(), "compatibleCmVersion", "zrNjaPflQE");
        setField(term325085, term325085.getClass(), "lastPlayDate", "GOiokVGJWe");
        setIntField(term325085, term325085.getClass(), "lastPlaceId", 1031535312);
        setField(term325085, term325085.getClass(), "lastPlaceName", "CsPKGghyOI");
        setIntField(term325085, term325085.getClass(), "lastRegionId", 1653009806);
        setField(term325085, term325085.getClass(), "lastRegionName", "FqrDmrxCED");
        setIntField(term325085, term325085.getClass(), "lastAllNetId", 829901371);
        setField(term325085, term325085.getClass(), "lastClientId", "EDwZfRfehk");
        setIntField(term325085, term325085.getClass(), "lastUsedDeckId", 274034524);
        setIntField(term325085, term325085.getClass(), "lastPlayMusicLevel", -1560933208);
        setIntField(term325085, term325085.getClass(), "lastEmoneyBrand", 241048805);
        setField(term325083, term325083.getClass(), "user", term325085);
        setIntField(term325083, term325083.getClass(), "optionSet", -1799198135);
        setIntField(term325083, term325083.getClass(), "speed", -146245384);
        setIntField(term325083, term325083.getClass(), "mirror", 1954963175);
        setIntField(term325083, term325083.getClass(), "judgeTiming", 299756323);
        setIntField(term325083, term325083.getClass(), "judgeAdjustment", 1423104720);
        setIntField(term325083, term325083.getClass(), "abort", -1918523057);
        setIntField(term325083, term325083.getClass(), "stealthField", 789708568);
        setIntField(term325083, term325083.getClass(), "tapSound", -687627765);
        setIntField(term325083, term325083.getClass(), "volGuide", -2141712007);
        setIntField(term325083, term325083.getClass(), "volAll", -1829146678);
        setIntField(term325083, term325083.getClass(), "volTap", -1843765624);
        setIntField(term325083, term325083.getClass(), "volCrTap", 1352043161);
        setIntField(term325083, term325083.getClass(), "volHold", -1847327458);
        setIntField(term325083, term325083.getClass(), "volSide", -359006936);
        setIntField(term325083, term325083.getClass(), "volFlick", 61580330);
        setIntField(term325083, term325083.getClass(), "volBell", -631004400);
        setIntField(term325083, term325083.getClass(), "volEnemy", -1050825659);
        setIntField(term325083, term325083.getClass(), "volSkill", 1086437814);
        setIntField(term325083, term325083.getClass(), "volDamage", -1295796037);
        setIntField(term325083, term325083.getClass(), "colorField", -583654834);
        setIntField(term325083, term325083.getClass(), "colorLaneBright", 71196650);
        setIntField(term325083, term325083.getClass(), "colorWallBright", 1344170684);
        setIntField(term325083, term325083.getClass(), "colorLane", -270831323);
        setIntField(term325083, term325083.getClass(), "colorSide", -1987814298);
        setIntField(term325083, term325083.getClass(), "effectDamage", -285464959);
        setIntField(term325083, term325083.getClass(), "effectPos", -81216710);
        setIntField(term325083, term325083.getClass(), "judgeDisp", -1175618776);
        setIntField(term325083, term325083.getClass(), "judgePos", 2066603120);
        setIntField(term325083, term325083.getClass(), "judgeBreak", -543216838);
        setIntField(term325083, term325083.getClass(), "judgeHit", -1583408172);
        setIntField(term325083, term325083.getClass(), "platinumBreakDisp", -1779634121);
        setIntField(term325083, term325083.getClass(), "judgeCriticalBreak", 555796378);
        setIntField(term325083, term325083.getClass(), "matching", 1688266118);
        setIntField(term325083, term325083.getClass(), "dispPlayerLv", 1354378762);
        setIntField(term325083, term325083.getClass(), "dispRating", 425177759);
        setIntField(term325083, term325083.getClass(), "dispBP", 1384766851);
        setIntField(term325083, term325083.getClass(), "headphone", 135771353);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDispPlayerLv", argTypes, term325083, args);
    }

};


