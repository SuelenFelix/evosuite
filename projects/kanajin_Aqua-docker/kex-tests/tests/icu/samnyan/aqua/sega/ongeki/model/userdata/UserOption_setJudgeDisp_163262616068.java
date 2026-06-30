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

public class UserOption_setJudgeDisp_163262616068 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term340344;
     Object term340646;

    public UserOption_setJudgeDisp_163262616068() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term340350 = new Long(-2613029888948149747L);
        term340344 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term340346 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term340348 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term340364 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term340365 = newInstance(Class.forName("java.time.LocalDate"));
        Object term340369 = newInstance(Class.forName("java.time.LocalTime"));
        Object term340374 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term340375 = newInstance(Class.forName("java.time.LocalDate"));
        Object term340379 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term340344, term340344.getClass(), "id", -3529909024743599069L);
        setLongField(term340346, term340346.getClass(), "id", -686409996358929483L);
        setLongField(term340348, term340348.getClass(), "id", 8097607924218883491L);
        setField(term340348, term340348.getClass(), "extId", term340350);
        setField(term340348, term340348.getClass(), "luid", "xZWnbePZux");
        setIntField(term340365, term340365.getClass(), "year", 2019);
        setShortField(term340365, term340365.getClass(), "month", (short) 12);
        setShortField(term340365, term340365.getClass(), "day", (short) 14);
        setField(term340364, term340364.getClass(), "date", term340365);
        setByteField(term340369, term340369.getClass(), "hour", (byte) 15);
        setByteField(term340369, term340369.getClass(), "minute", (byte) 10);
        setByteField(term340369, term340369.getClass(), "second", (byte) 29);
        setIntField(term340369, term340369.getClass(), "nano", 825840251);
        setField(term340364, term340364.getClass(), "time", term340369);
        setField(term340348, term340348.getClass(), "registerTime", term340364);
        setIntField(term340375, term340375.getClass(), "year", 2020);
        setShortField(term340375, term340375.getClass(), "month", (short) 4);
        setShortField(term340375, term340375.getClass(), "day", (short) 9);
        setField(term340374, term340374.getClass(), "date", term340375);
        setByteField(term340379, term340379.getClass(), "hour", (byte) 13);
        setByteField(term340379, term340379.getClass(), "minute", (byte) 29);
        setByteField(term340379, term340379.getClass(), "second", (byte) 48);
        setIntField(term340379, term340379.getClass(), "nano", 753514542);
        setField(term340374, term340374.getClass(), "time", term340379);
        setField(term340348, term340348.getClass(), "accessTime", term340374);
        setField(term340346, term340346.getClass(), "card", term340348);
        setField(term340346, term340346.getClass(), "userName", "LtTiPDcBxi");
        setIntField(term340346, term340346.getClass(), "level", 1778861329);
        setIntField(term340346, term340346.getClass(), "reincarnationNum", 1073449332);
        setLongField(term340346, term340346.getClass(), "exp", -1499387099228855655L);
        setLongField(term340346, term340346.getClass(), "point", 5070933201679640510L);
        setLongField(term340346, term340346.getClass(), "totalPoint", -721559489022957863L);
        setIntField(term340346, term340346.getClass(), "playCount", -2118604939);
        setIntField(term340346, term340346.getClass(), "jewelCount", -578292636);
        setIntField(term340346, term340346.getClass(), "totalJewelCount", 450597081);
        setIntField(term340346, term340346.getClass(), "medalCount", 342667626);
        setIntField(term340346, term340346.getClass(), "playerRating", 1929066549);
        setIntField(term340346, term340346.getClass(), "highestRating", 331180846);
        setIntField(term340346, term340346.getClass(), "battlePoint", -940815080);
        setIntField(term340346, term340346.getClass(), "bestBattlePoint", -1804183387);
        setIntField(term340346, term340346.getClass(), "overDamageBattlePoint", 2138136338);
        setBooleanField(term340346, term340346.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term340346, term340346.getClass(), "nameplateId", -1634220962);
        setIntField(term340346, term340346.getClass(), "trophyId", 762273245);
        setIntField(term340346, term340346.getClass(), "cardId", -1211792391);
        setIntField(term340346, term340346.getClass(), "characterId", -2137797969);
        setIntField(term340346, term340346.getClass(), "characterVoiceNo", 893760537);
        setIntField(term340346, term340346.getClass(), "tabSetting", 1743269212);
        setIntField(term340346, term340346.getClass(), "tabSortSetting", -1197532596);
        setIntField(term340346, term340346.getClass(), "cardCategorySetting", 951878711);
        setIntField(term340346, term340346.getClass(), "cardSortSetting", -2029093442);
        setIntField(term340346, term340346.getClass(), "rivalScoreCategorySetting", 2003420108);
        setIntField(term340346, term340346.getClass(), "playedTutorialBit", 380299441);
        setIntField(term340346, term340346.getClass(), "firstTutorialCancelNum", 61973481);
        setLongField(term340346, term340346.getClass(), "sumTechHighScore", 1806990919796120659L);
        setLongField(term340346, term340346.getClass(), "sumTechBasicHighScore", -1410626916390816805L);
        setLongField(term340346, term340346.getClass(), "sumTechAdvancedHighScore", 453263218736453752L);
        setLongField(term340346, term340346.getClass(), "sumTechExpertHighScore", -7619388775961633988L);
        setLongField(term340346, term340346.getClass(), "sumTechMasterHighScore", -3425171599989412858L);
        setLongField(term340346, term340346.getClass(), "sumTechLunaticHighScore", -9216727468777352719L);
        setLongField(term340346, term340346.getClass(), "sumBattleHighScore", -8388814054959174309L);
        setLongField(term340346, term340346.getClass(), "sumBattleBasicHighScore", -3612354577928461393L);
        setLongField(term340346, term340346.getClass(), "sumBattleAdvancedHighScore", -8790293535041637030L);
        setLongField(term340346, term340346.getClass(), "sumBattleExpertHighScore", 2175585780889827468L);
        setLongField(term340346, term340346.getClass(), "sumBattleMasterHighScore", 5126762324820907958L);
        setLongField(term340346, term340346.getClass(), "sumBattleLunaticHighScore", -2218761645901377306L);
        setField(term340346, term340346.getClass(), "eventWatchedDate", "tOnYigyTQS");
        setField(term340346, term340346.getClass(), "cmEventWatchedDate", "VtvUSScIpo");
        setField(term340346, term340346.getClass(), "firstGameId", "tEtgqhEgvj");
        setField(term340346, term340346.getClass(), "firstRomVersion", "mWkgZOAzDo");
        setField(term340346, term340346.getClass(), "firstDataVersion", "nJtJXqBQqS");
        setField(term340346, term340346.getClass(), "firstPlayDate", "sqzUTrSFvE");
        setField(term340346, term340346.getClass(), "lastGameId", "uObaqAGpDE");
        setField(term340346, term340346.getClass(), "lastRomVersion", "CaiflHNUqI");
        setField(term340346, term340346.getClass(), "lastDataVersion", "pwITscwZER");
        setField(term340346, term340346.getClass(), "compatibleCmVersion", "gQpjJKTRFp");
        setField(term340346, term340346.getClass(), "lastPlayDate", "PLyZszQuiE");
        setIntField(term340346, term340346.getClass(), "lastPlaceId", -432052203);
        setField(term340346, term340346.getClass(), "lastPlaceName", "OyJWlvcsgW");
        setIntField(term340346, term340346.getClass(), "lastRegionId", -1794639470);
        setField(term340346, term340346.getClass(), "lastRegionName", "YGTYAEnPWH");
        setIntField(term340346, term340346.getClass(), "lastAllNetId", 476206004);
        setField(term340346, term340346.getClass(), "lastClientId", "YxJpXCbhcg");
        setIntField(term340346, term340346.getClass(), "lastUsedDeckId", 1804093911);
        setIntField(term340346, term340346.getClass(), "lastPlayMusicLevel", -453001017);
        setIntField(term340346, term340346.getClass(), "lastEmoneyBrand", 992421791);
        setField(term340344, term340344.getClass(), "user", term340346);
        setIntField(term340344, term340344.getClass(), "optionSet", 1437092343);
        setIntField(term340344, term340344.getClass(), "speed", 599252713);
        setIntField(term340344, term340344.getClass(), "mirror", -258137327);
        setIntField(term340344, term340344.getClass(), "judgeTiming", 309066261);
        setIntField(term340344, term340344.getClass(), "judgeAdjustment", 1347767293);
        setIntField(term340344, term340344.getClass(), "abort", -483270104);
        setIntField(term340344, term340344.getClass(), "stealthField", -1027017292);
        setIntField(term340344, term340344.getClass(), "tapSound", 486754608);
        setIntField(term340344, term340344.getClass(), "volGuide", 1088134469);
        setIntField(term340344, term340344.getClass(), "volAll", -1731017159);
        setIntField(term340344, term340344.getClass(), "volTap", -899984336);
        setIntField(term340344, term340344.getClass(), "volCrTap", -2095834013);
        setIntField(term340344, term340344.getClass(), "volHold", -1697320294);
        setIntField(term340344, term340344.getClass(), "volSide", 935633702);
        setIntField(term340344, term340344.getClass(), "volFlick", -1245784272);
        setIntField(term340344, term340344.getClass(), "volBell", -1146340415);
        setIntField(term340344, term340344.getClass(), "volEnemy", -930336343);
        setIntField(term340344, term340344.getClass(), "volSkill", -1816870812);
        setIntField(term340344, term340344.getClass(), "volDamage", 57405511);
        setIntField(term340344, term340344.getClass(), "colorField", -2019953762);
        setIntField(term340344, term340344.getClass(), "colorLaneBright", 850073044);
        setIntField(term340344, term340344.getClass(), "colorWallBright", 1934179089);
        setIntField(term340344, term340344.getClass(), "colorLane", -804139811);
        setIntField(term340344, term340344.getClass(), "colorSide", 1168895606);
        setIntField(term340344, term340344.getClass(), "effectDamage", 324849221);
        setIntField(term340344, term340344.getClass(), "effectPos", -1571533700);
        setIntField(term340344, term340344.getClass(), "judgeDisp", 561378403);
        setIntField(term340344, term340344.getClass(), "judgePos", -1409660659);
        setIntField(term340344, term340344.getClass(), "judgeBreak", -877401788);
        setIntField(term340344, term340344.getClass(), "judgeHit", -1458113302);
        setIntField(term340344, term340344.getClass(), "platinumBreakDisp", 938677709);
        setIntField(term340344, term340344.getClass(), "judgeCriticalBreak", 1718240470);
        setIntField(term340344, term340344.getClass(), "matching", -533520179);
        setIntField(term340344, term340344.getClass(), "dispPlayerLv", 717033111);
        setIntField(term340344, term340344.getClass(), "dispRating", 1108523073);
        setIntField(term340344, term340344.getClass(), "dispBP", -1580188520);
        setIntField(term340344, term340344.getClass(), "headphone", 2000542813);
        term340646 = new Integer(1465453818);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term340646;
        callMethod(klass, "setJudgeDisp", argTypes, term340344, args);
    }

};


