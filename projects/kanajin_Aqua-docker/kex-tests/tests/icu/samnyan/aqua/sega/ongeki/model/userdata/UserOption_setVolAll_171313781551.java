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

public class UserOption_setVolAll_171313781551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332456;
     Object term332758;

    public UserOption_setVolAll_171313781551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term332462 = new Long(2054808971423494757L);
        term332456 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term332458 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term332460 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term332476 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term332477 = newInstance(Class.forName("java.time.LocalDate"));
        Object term332481 = newInstance(Class.forName("java.time.LocalTime"));
        Object term332486 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term332487 = newInstance(Class.forName("java.time.LocalDate"));
        Object term332491 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term332456, term332456.getClass(), "id", -2592630522614125063L);
        setLongField(term332458, term332458.getClass(), "id", -676483783121390529L);
        setLongField(term332460, term332460.getClass(), "id", 2926508664528182566L);
        setField(term332460, term332460.getClass(), "extId", term332462);
        setField(term332460, term332460.getClass(), "luid", "pCAsGhdPxl");
        setIntField(term332477, term332477.getClass(), "year", 2028);
        setShortField(term332477, term332477.getClass(), "month", (short) 2);
        setShortField(term332477, term332477.getClass(), "day", (short) 8);
        setField(term332476, term332476.getClass(), "date", term332477);
        setByteField(term332481, term332481.getClass(), "hour", (byte) 15);
        setByteField(term332481, term332481.getClass(), "minute", (byte) 26);
        setByteField(term332481, term332481.getClass(), "second", (byte) 10);
        setIntField(term332481, term332481.getClass(), "nano", 693423932);
        setField(term332476, term332476.getClass(), "time", term332481);
        setField(term332460, term332460.getClass(), "registerTime", term332476);
        setIntField(term332487, term332487.getClass(), "year", 2017);
        setShortField(term332487, term332487.getClass(), "month", (short) 5);
        setShortField(term332487, term332487.getClass(), "day", (short) 3);
        setField(term332486, term332486.getClass(), "date", term332487);
        setByteField(term332491, term332491.getClass(), "hour", (byte) 0);
        setByteField(term332491, term332491.getClass(), "minute", (byte) 54);
        setByteField(term332491, term332491.getClass(), "second", (byte) 19);
        setIntField(term332491, term332491.getClass(), "nano", 176887766);
        setField(term332486, term332486.getClass(), "time", term332491);
        setField(term332460, term332460.getClass(), "accessTime", term332486);
        setField(term332458, term332458.getClass(), "card", term332460);
        setField(term332458, term332458.getClass(), "userName", "lszpDVqIUa");
        setIntField(term332458, term332458.getClass(), "level", -719672863);
        setIntField(term332458, term332458.getClass(), "reincarnationNum", 1213348815);
        setLongField(term332458, term332458.getClass(), "exp", 4706888850861881675L);
        setLongField(term332458, term332458.getClass(), "point", 8867912396983169706L);
        setLongField(term332458, term332458.getClass(), "totalPoint", 2204333934989212145L);
        setIntField(term332458, term332458.getClass(), "playCount", -294298144);
        setIntField(term332458, term332458.getClass(), "jewelCount", 838771825);
        setIntField(term332458, term332458.getClass(), "totalJewelCount", -780397829);
        setIntField(term332458, term332458.getClass(), "medalCount", 390953489);
        setIntField(term332458, term332458.getClass(), "playerRating", -1818206333);
        setIntField(term332458, term332458.getClass(), "highestRating", 1596255960);
        setIntField(term332458, term332458.getClass(), "battlePoint", 995740348);
        setIntField(term332458, term332458.getClass(), "bestBattlePoint", 1874660645);
        setIntField(term332458, term332458.getClass(), "overDamageBattlePoint", 1871223851);
        setBooleanField(term332458, term332458.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term332458, term332458.getClass(), "nameplateId", 426460744);
        setIntField(term332458, term332458.getClass(), "trophyId", -1067312759);
        setIntField(term332458, term332458.getClass(), "cardId", -116447213);
        setIntField(term332458, term332458.getClass(), "characterId", 653083927);
        setIntField(term332458, term332458.getClass(), "characterVoiceNo", -595821718);
        setIntField(term332458, term332458.getClass(), "tabSetting", -1264044197);
        setIntField(term332458, term332458.getClass(), "tabSortSetting", -229671362);
        setIntField(term332458, term332458.getClass(), "cardCategorySetting", -2033747301);
        setIntField(term332458, term332458.getClass(), "cardSortSetting", -1464306278);
        setIntField(term332458, term332458.getClass(), "rivalScoreCategorySetting", 1603349390);
        setIntField(term332458, term332458.getClass(), "playedTutorialBit", -208992091);
        setIntField(term332458, term332458.getClass(), "firstTutorialCancelNum", 1370513939);
        setLongField(term332458, term332458.getClass(), "sumTechHighScore", 3004119225370512308L);
        setLongField(term332458, term332458.getClass(), "sumTechBasicHighScore", -3804614952700446819L);
        setLongField(term332458, term332458.getClass(), "sumTechAdvancedHighScore", -4343654666916822008L);
        setLongField(term332458, term332458.getClass(), "sumTechExpertHighScore", -3562932416560360785L);
        setLongField(term332458, term332458.getClass(), "sumTechMasterHighScore", 7162818107624611659L);
        setLongField(term332458, term332458.getClass(), "sumTechLunaticHighScore", 520383649359634269L);
        setLongField(term332458, term332458.getClass(), "sumBattleHighScore", 8560595654172394109L);
        setLongField(term332458, term332458.getClass(), "sumBattleBasicHighScore", -1096610548075895593L);
        setLongField(term332458, term332458.getClass(), "sumBattleAdvancedHighScore", 7216370511634776517L);
        setLongField(term332458, term332458.getClass(), "sumBattleExpertHighScore", -6409926873770022229L);
        setLongField(term332458, term332458.getClass(), "sumBattleMasterHighScore", 5667663207635011188L);
        setLongField(term332458, term332458.getClass(), "sumBattleLunaticHighScore", 1709317559939250282L);
        setField(term332458, term332458.getClass(), "eventWatchedDate", "yyvXqLmYib");
        setField(term332458, term332458.getClass(), "cmEventWatchedDate", "HAIIDZPgWO");
        setField(term332458, term332458.getClass(), "firstGameId", "QCiBNYigbL");
        setField(term332458, term332458.getClass(), "firstRomVersion", "LScaKHxibg");
        setField(term332458, term332458.getClass(), "firstDataVersion", "fvfdRBdhmi");
        setField(term332458, term332458.getClass(), "firstPlayDate", "gMRPhtFaHX");
        setField(term332458, term332458.getClass(), "lastGameId", "QCerozLPeK");
        setField(term332458, term332458.getClass(), "lastRomVersion", "CVXFWnMQGH");
        setField(term332458, term332458.getClass(), "lastDataVersion", "ZzDRegdYWF");
        setField(term332458, term332458.getClass(), "compatibleCmVersion", "iiCHZbnywN");
        setField(term332458, term332458.getClass(), "lastPlayDate", "kpPnCeqnRL");
        setIntField(term332458, term332458.getClass(), "lastPlaceId", 72664010);
        setField(term332458, term332458.getClass(), "lastPlaceName", "xbUYWsexzS");
        setIntField(term332458, term332458.getClass(), "lastRegionId", 51271160);
        setField(term332458, term332458.getClass(), "lastRegionName", "tFDNUltEgv");
        setIntField(term332458, term332458.getClass(), "lastAllNetId", 1330928485);
        setField(term332458, term332458.getClass(), "lastClientId", "MnvyVmmKBF");
        setIntField(term332458, term332458.getClass(), "lastUsedDeckId", -138533099);
        setIntField(term332458, term332458.getClass(), "lastPlayMusicLevel", 125491109);
        setIntField(term332458, term332458.getClass(), "lastEmoneyBrand", -355535555);
        setField(term332456, term332456.getClass(), "user", term332458);
        setIntField(term332456, term332456.getClass(), "optionSet", -1225175166);
        setIntField(term332456, term332456.getClass(), "speed", 814963685);
        setIntField(term332456, term332456.getClass(), "mirror", 1215057654);
        setIntField(term332456, term332456.getClass(), "judgeTiming", -237814174);
        setIntField(term332456, term332456.getClass(), "judgeAdjustment", 1438844134);
        setIntField(term332456, term332456.getClass(), "abort", 1797221677);
        setIntField(term332456, term332456.getClass(), "stealthField", 441970507);
        setIntField(term332456, term332456.getClass(), "tapSound", -798959201);
        setIntField(term332456, term332456.getClass(), "volGuide", -1784315736);
        setIntField(term332456, term332456.getClass(), "volAll", 860232941);
        setIntField(term332456, term332456.getClass(), "volTap", 1058027477);
        setIntField(term332456, term332456.getClass(), "volCrTap", 67229816);
        setIntField(term332456, term332456.getClass(), "volHold", 710175634);
        setIntField(term332456, term332456.getClass(), "volSide", -1500563280);
        setIntField(term332456, term332456.getClass(), "volFlick", -2088850030);
        setIntField(term332456, term332456.getClass(), "volBell", 1815378190);
        setIntField(term332456, term332456.getClass(), "volEnemy", -1694059299);
        setIntField(term332456, term332456.getClass(), "volSkill", -446759169);
        setIntField(term332456, term332456.getClass(), "volDamage", -1094892115);
        setIntField(term332456, term332456.getClass(), "colorField", -1979495758);
        setIntField(term332456, term332456.getClass(), "colorLaneBright", 394992958);
        setIntField(term332456, term332456.getClass(), "colorWallBright", -515184614);
        setIntField(term332456, term332456.getClass(), "colorLane", -160329180);
        setIntField(term332456, term332456.getClass(), "colorSide", 1143113658);
        setIntField(term332456, term332456.getClass(), "effectDamage", -18092507);
        setIntField(term332456, term332456.getClass(), "effectPos", -1306147355);
        setIntField(term332456, term332456.getClass(), "judgeDisp", -2036624213);
        setIntField(term332456, term332456.getClass(), "judgePos", -844580712);
        setIntField(term332456, term332456.getClass(), "judgeBreak", -1392484029);
        setIntField(term332456, term332456.getClass(), "judgeHit", -1516671200);
        setIntField(term332456, term332456.getClass(), "platinumBreakDisp", -1044096048);
        setIntField(term332456, term332456.getClass(), "judgeCriticalBreak", -800721881);
        setIntField(term332456, term332456.getClass(), "matching", 1026456653);
        setIntField(term332456, term332456.getClass(), "dispPlayerLv", -405575205);
        setIntField(term332456, term332456.getClass(), "dispRating", -1634283937);
        setIntField(term332456, term332456.getClass(), "dispBP", -717336248);
        setIntField(term332456, term332456.getClass(), "headphone", 1267229952);
        term332758 = new Integer(36522280);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term332758;
        callMethod(klass, "setVolAll", argTypes, term332456, args);
    }

};


