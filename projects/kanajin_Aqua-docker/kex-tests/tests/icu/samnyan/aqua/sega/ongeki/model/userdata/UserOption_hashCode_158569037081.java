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

public class UserOption_hashCode_158569037081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term346374;

    public UserOption_hashCode_158569037081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term346380 = new Long(-685001356309682920L);
        term346374 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term346376 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term346378 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term346394 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term346395 = newInstance(Class.forName("java.time.LocalDate"));
        Object term346399 = newInstance(Class.forName("java.time.LocalTime"));
        Object term346404 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term346405 = newInstance(Class.forName("java.time.LocalDate"));
        Object term346409 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term346374, term346374.getClass(), "id", -6100129470337908371L);
        setLongField(term346376, term346376.getClass(), "id", -7120954929460968717L);
        setLongField(term346378, term346378.getClass(), "id", 317307274233610363L);
        setField(term346378, term346378.getClass(), "extId", term346380);
        setField(term346378, term346378.getClass(), "luid", "lFHgJjAGJi");
        setIntField(term346395, term346395.getClass(), "year", 2019);
        setShortField(term346395, term346395.getClass(), "month", (short) 8);
        setShortField(term346395, term346395.getClass(), "day", (short) 16);
        setField(term346394, term346394.getClass(), "date", term346395);
        setByteField(term346399, term346399.getClass(), "hour", (byte) 4);
        setByteField(term346399, term346399.getClass(), "minute", (byte) 5);
        setByteField(term346399, term346399.getClass(), "second", (byte) 12);
        setIntField(term346399, term346399.getClass(), "nano", 47206353);
        setField(term346394, term346394.getClass(), "time", term346399);
        setField(term346378, term346378.getClass(), "registerTime", term346394);
        setIntField(term346405, term346405.getClass(), "year", 2023);
        setShortField(term346405, term346405.getClass(), "month", (short) 7);
        setShortField(term346405, term346405.getClass(), "day", (short) 30);
        setField(term346404, term346404.getClass(), "date", term346405);
        setByteField(term346409, term346409.getClass(), "hour", (byte) 0);
        setByteField(term346409, term346409.getClass(), "minute", (byte) 18);
        setByteField(term346409, term346409.getClass(), "second", (byte) 26);
        setIntField(term346409, term346409.getClass(), "nano", 187537490);
        setField(term346404, term346404.getClass(), "time", term346409);
        setField(term346378, term346378.getClass(), "accessTime", term346404);
        setField(term346376, term346376.getClass(), "card", term346378);
        setField(term346376, term346376.getClass(), "userName", "hKGdlGWpgE");
        setIntField(term346376, term346376.getClass(), "level", 1424650227);
        setIntField(term346376, term346376.getClass(), "reincarnationNum", 1508245539);
        setLongField(term346376, term346376.getClass(), "exp", -765335231241279689L);
        setLongField(term346376, term346376.getClass(), "point", -7890123944365269356L);
        setLongField(term346376, term346376.getClass(), "totalPoint", 9127176873538603872L);
        setIntField(term346376, term346376.getClass(), "playCount", 302801650);
        setIntField(term346376, term346376.getClass(), "jewelCount", 720566843);
        setIntField(term346376, term346376.getClass(), "totalJewelCount", -2003226144);
        setIntField(term346376, term346376.getClass(), "medalCount", -228212588);
        setIntField(term346376, term346376.getClass(), "playerRating", 1683808039);
        setIntField(term346376, term346376.getClass(), "highestRating", -113765491);
        setIntField(term346376, term346376.getClass(), "battlePoint", 264254625);
        setIntField(term346376, term346376.getClass(), "bestBattlePoint", 1680829699);
        setIntField(term346376, term346376.getClass(), "overDamageBattlePoint", -492588617);
        setBooleanField(term346376, term346376.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term346376, term346376.getClass(), "nameplateId", 478737389);
        setIntField(term346376, term346376.getClass(), "trophyId", 1631871740);
        setIntField(term346376, term346376.getClass(), "cardId", 434120739);
        setIntField(term346376, term346376.getClass(), "characterId", -449814515);
        setIntField(term346376, term346376.getClass(), "characterVoiceNo", 29185931);
        setIntField(term346376, term346376.getClass(), "tabSetting", 1090858432);
        setIntField(term346376, term346376.getClass(), "tabSortSetting", 791901718);
        setIntField(term346376, term346376.getClass(), "cardCategorySetting", -456669727);
        setIntField(term346376, term346376.getClass(), "cardSortSetting", 1644778528);
        setIntField(term346376, term346376.getClass(), "rivalScoreCategorySetting", -1650894056);
        setIntField(term346376, term346376.getClass(), "playedTutorialBit", 1981610805);
        setIntField(term346376, term346376.getClass(), "firstTutorialCancelNum", -1666292055);
        setLongField(term346376, term346376.getClass(), "sumTechHighScore", 7817036859341995429L);
        setLongField(term346376, term346376.getClass(), "sumTechBasicHighScore", -8923847059843817881L);
        setLongField(term346376, term346376.getClass(), "sumTechAdvancedHighScore", 1397097400432171692L);
        setLongField(term346376, term346376.getClass(), "sumTechExpertHighScore", -5595005320983983248L);
        setLongField(term346376, term346376.getClass(), "sumTechMasterHighScore", -940997654063020422L);
        setLongField(term346376, term346376.getClass(), "sumTechLunaticHighScore", 2398186809355364907L);
        setLongField(term346376, term346376.getClass(), "sumBattleHighScore", -2293923441414953286L);
        setLongField(term346376, term346376.getClass(), "sumBattleBasicHighScore", -8613157339258089091L);
        setLongField(term346376, term346376.getClass(), "sumBattleAdvancedHighScore", 4806330854871335729L);
        setLongField(term346376, term346376.getClass(), "sumBattleExpertHighScore", 5618582854192640094L);
        setLongField(term346376, term346376.getClass(), "sumBattleMasterHighScore", 5958646976415425350L);
        setLongField(term346376, term346376.getClass(), "sumBattleLunaticHighScore", 5173413689806196996L);
        setField(term346376, term346376.getClass(), "eventWatchedDate", "CAoRKdEDwC");
        setField(term346376, term346376.getClass(), "cmEventWatchedDate", "DEbtEvScYS");
        setField(term346376, term346376.getClass(), "firstGameId", "JHsrcnGhTe");
        setField(term346376, term346376.getClass(), "firstRomVersion", "LaeKHifZJH");
        setField(term346376, term346376.getClass(), "firstDataVersion", "VBFMzEDRSf");
        setField(term346376, term346376.getClass(), "firstPlayDate", "KVoVHbYxpz");
        setField(term346376, term346376.getClass(), "lastGameId", "QQnxBVdTti");
        setField(term346376, term346376.getClass(), "lastRomVersion", "HktXumuvFp");
        setField(term346376, term346376.getClass(), "lastDataVersion", "orhqHDZmaE");
        setField(term346376, term346376.getClass(), "compatibleCmVersion", "OBhwDXihdK");
        setField(term346376, term346376.getClass(), "lastPlayDate", "ENibxYkprw");
        setIntField(term346376, term346376.getClass(), "lastPlaceId", -1249886381);
        setField(term346376, term346376.getClass(), "lastPlaceName", "VwSaITUZrJ");
        setIntField(term346376, term346376.getClass(), "lastRegionId", 154728228);
        setField(term346376, term346376.getClass(), "lastRegionName", "xzNSawcumw");
        setIntField(term346376, term346376.getClass(), "lastAllNetId", 1090052880);
        setField(term346376, term346376.getClass(), "lastClientId", "dtdyzmBjNG");
        setIntField(term346376, term346376.getClass(), "lastUsedDeckId", 226615887);
        setIntField(term346376, term346376.getClass(), "lastPlayMusicLevel", 1987385181);
        setIntField(term346376, term346376.getClass(), "lastEmoneyBrand", -1224918587);
        setField(term346374, term346374.getClass(), "user", term346376);
        setIntField(term346374, term346374.getClass(), "optionSet", 1454191539);
        setIntField(term346374, term346374.getClass(), "speed", 451445027);
        setIntField(term346374, term346374.getClass(), "mirror", -1712958993);
        setIntField(term346374, term346374.getClass(), "judgeTiming", 249066936);
        setIntField(term346374, term346374.getClass(), "judgeAdjustment", 1920373035);
        setIntField(term346374, term346374.getClass(), "abort", -1558639854);
        setIntField(term346374, term346374.getClass(), "stealthField", 463287634);
        setIntField(term346374, term346374.getClass(), "tapSound", -432708378);
        setIntField(term346374, term346374.getClass(), "volGuide", -1279314616);
        setIntField(term346374, term346374.getClass(), "volAll", -1599316456);
        setIntField(term346374, term346374.getClass(), "volTap", -58253360);
        setIntField(term346374, term346374.getClass(), "volCrTap", -1974573575);
        setIntField(term346374, term346374.getClass(), "volHold", -2096685149);
        setIntField(term346374, term346374.getClass(), "volSide", -129140749);
        setIntField(term346374, term346374.getClass(), "volFlick", 156328274);
        setIntField(term346374, term346374.getClass(), "volBell", 826441522);
        setIntField(term346374, term346374.getClass(), "volEnemy", 198230498);
        setIntField(term346374, term346374.getClass(), "volSkill", -873208040);
        setIntField(term346374, term346374.getClass(), "volDamage", -2068411574);
        setIntField(term346374, term346374.getClass(), "colorField", 1358379641);
        setIntField(term346374, term346374.getClass(), "colorLaneBright", 1626713146);
        setIntField(term346374, term346374.getClass(), "colorWallBright", -2019567894);
        setIntField(term346374, term346374.getClass(), "colorLane", -562668846);
        setIntField(term346374, term346374.getClass(), "colorSide", 1412673205);
        setIntField(term346374, term346374.getClass(), "effectDamage", 1425735221);
        setIntField(term346374, term346374.getClass(), "effectPos", -951178455);
        setIntField(term346374, term346374.getClass(), "judgeDisp", -740318955);
        setIntField(term346374, term346374.getClass(), "judgePos", 1347570269);
        setIntField(term346374, term346374.getClass(), "judgeBreak", -1422549067);
        setIntField(term346374, term346374.getClass(), "judgeHit", -699507032);
        setIntField(term346374, term346374.getClass(), "platinumBreakDisp", 862309870);
        setIntField(term346374, term346374.getClass(), "judgeCriticalBreak", -1381223601);
        setIntField(term346374, term346374.getClass(), "matching", 1963623992);
        setIntField(term346374, term346374.getClass(), "dispPlayerLv", -192210622);
        setIntField(term346374, term346374.getClass(), "dispRating", 1748107470);
        setIntField(term346374, term346374.getClass(), "dispBP", 867848160);
        setIntField(term346374, term346374.getClass(), "headphone", -1600681380);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term346374, args);
    }

};


