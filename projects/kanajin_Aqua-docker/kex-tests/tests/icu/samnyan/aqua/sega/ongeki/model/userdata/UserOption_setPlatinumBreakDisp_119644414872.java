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

public class UserOption_setPlatinumBreakDisp_119644414872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term342200;
     Object term342502;

    public UserOption_setPlatinumBreakDisp_119644414872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term342206 = new Long(8408467837292297525L);
        term342200 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term342202 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term342204 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term342220 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term342221 = newInstance(Class.forName("java.time.LocalDate"));
        Object term342225 = newInstance(Class.forName("java.time.LocalTime"));
        Object term342230 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term342231 = newInstance(Class.forName("java.time.LocalDate"));
        Object term342235 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term342200, term342200.getClass(), "id", 1538099256636039287L);
        setLongField(term342202, term342202.getClass(), "id", 7902115632493578248L);
        setLongField(term342204, term342204.getClass(), "id", 5199381460542567351L);
        setField(term342204, term342204.getClass(), "extId", term342206);
        setField(term342204, term342204.getClass(), "luid", "cHgeNnLTxA");
        setIntField(term342221, term342221.getClass(), "year", 2012);
        setShortField(term342221, term342221.getClass(), "month", (short) 3);
        setShortField(term342221, term342221.getClass(), "day", (short) 30);
        setField(term342220, term342220.getClass(), "date", term342221);
        setByteField(term342225, term342225.getClass(), "hour", (byte) 9);
        setByteField(term342225, term342225.getClass(), "minute", (byte) 30);
        setByteField(term342225, term342225.getClass(), "second", (byte) 51);
        setIntField(term342225, term342225.getClass(), "nano", 604127934);
        setField(term342220, term342220.getClass(), "time", term342225);
        setField(term342204, term342204.getClass(), "registerTime", term342220);
        setIntField(term342231, term342231.getClass(), "year", 2010);
        setShortField(term342231, term342231.getClass(), "month", (short) 8);
        setShortField(term342231, term342231.getClass(), "day", (short) 5);
        setField(term342230, term342230.getClass(), "date", term342231);
        setByteField(term342235, term342235.getClass(), "hour", (byte) 22);
        setByteField(term342235, term342235.getClass(), "minute", (byte) 36);
        setByteField(term342235, term342235.getClass(), "second", (byte) 38);
        setIntField(term342235, term342235.getClass(), "nano", 386489052);
        setField(term342230, term342230.getClass(), "time", term342235);
        setField(term342204, term342204.getClass(), "accessTime", term342230);
        setField(term342202, term342202.getClass(), "card", term342204);
        setField(term342202, term342202.getClass(), "userName", "WhKEvzbvRR");
        setIntField(term342202, term342202.getClass(), "level", -1764596819);
        setIntField(term342202, term342202.getClass(), "reincarnationNum", 750223568);
        setLongField(term342202, term342202.getClass(), "exp", -200765525870193235L);
        setLongField(term342202, term342202.getClass(), "point", -2905424788747274085L);
        setLongField(term342202, term342202.getClass(), "totalPoint", 2392084033766895819L);
        setIntField(term342202, term342202.getClass(), "playCount", -1991531539);
        setIntField(term342202, term342202.getClass(), "jewelCount", 1177530063);
        setIntField(term342202, term342202.getClass(), "totalJewelCount", -1181476516);
        setIntField(term342202, term342202.getClass(), "medalCount", -1534726553);
        setIntField(term342202, term342202.getClass(), "playerRating", 838775349);
        setIntField(term342202, term342202.getClass(), "highestRating", 1518037348);
        setIntField(term342202, term342202.getClass(), "battlePoint", 1379397119);
        setIntField(term342202, term342202.getClass(), "bestBattlePoint", 973992572);
        setIntField(term342202, term342202.getClass(), "overDamageBattlePoint", 410208528);
        setBooleanField(term342202, term342202.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term342202, term342202.getClass(), "nameplateId", -901430943);
        setIntField(term342202, term342202.getClass(), "trophyId", -432301816);
        setIntField(term342202, term342202.getClass(), "cardId", 1644514158);
        setIntField(term342202, term342202.getClass(), "characterId", 652322335);
        setIntField(term342202, term342202.getClass(), "characterVoiceNo", -1007191362);
        setIntField(term342202, term342202.getClass(), "tabSetting", 328348536);
        setIntField(term342202, term342202.getClass(), "tabSortSetting", -77263189);
        setIntField(term342202, term342202.getClass(), "cardCategorySetting", 2144245980);
        setIntField(term342202, term342202.getClass(), "cardSortSetting", 1954135046);
        setIntField(term342202, term342202.getClass(), "rivalScoreCategorySetting", 1264654980);
        setIntField(term342202, term342202.getClass(), "playedTutorialBit", -1398439799);
        setIntField(term342202, term342202.getClass(), "firstTutorialCancelNum", -1008803874);
        setLongField(term342202, term342202.getClass(), "sumTechHighScore", -6534185220202391219L);
        setLongField(term342202, term342202.getClass(), "sumTechBasicHighScore", -4670655174502225920L);
        setLongField(term342202, term342202.getClass(), "sumTechAdvancedHighScore", 8737550202407192393L);
        setLongField(term342202, term342202.getClass(), "sumTechExpertHighScore", -4329290883118628173L);
        setLongField(term342202, term342202.getClass(), "sumTechMasterHighScore", -7663959199911511081L);
        setLongField(term342202, term342202.getClass(), "sumTechLunaticHighScore", -8376673650694578382L);
        setLongField(term342202, term342202.getClass(), "sumBattleHighScore", 4799572211985480917L);
        setLongField(term342202, term342202.getClass(), "sumBattleBasicHighScore", -7782121392570544358L);
        setLongField(term342202, term342202.getClass(), "sumBattleAdvancedHighScore", -2530267825786394182L);
        setLongField(term342202, term342202.getClass(), "sumBattleExpertHighScore", 399259186138240507L);
        setLongField(term342202, term342202.getClass(), "sumBattleMasterHighScore", -3260132035329420073L);
        setLongField(term342202, term342202.getClass(), "sumBattleLunaticHighScore", -7974317281142624709L);
        setField(term342202, term342202.getClass(), "eventWatchedDate", "QFxMrORvZf");
        setField(term342202, term342202.getClass(), "cmEventWatchedDate", "PIdXNvggbW");
        setField(term342202, term342202.getClass(), "firstGameId", "vFUameebFO");
        setField(term342202, term342202.getClass(), "firstRomVersion", "KbYBpSrWKB");
        setField(term342202, term342202.getClass(), "firstDataVersion", "ZcJccyUSrl");
        setField(term342202, term342202.getClass(), "firstPlayDate", "QUAteXfskH");
        setField(term342202, term342202.getClass(), "lastGameId", "zyEAgcURuc");
        setField(term342202, term342202.getClass(), "lastRomVersion", "RwFZGRSQpn");
        setField(term342202, term342202.getClass(), "lastDataVersion", "nFCVQaPOOH");
        setField(term342202, term342202.getClass(), "compatibleCmVersion", "DjxTpCZTOw");
        setField(term342202, term342202.getClass(), "lastPlayDate", "hHVxpTQICJ");
        setIntField(term342202, term342202.getClass(), "lastPlaceId", -1700078514);
        setField(term342202, term342202.getClass(), "lastPlaceName", "kbcpAErWPl");
        setIntField(term342202, term342202.getClass(), "lastRegionId", -2133469067);
        setField(term342202, term342202.getClass(), "lastRegionName", "nugSnhkRus");
        setIntField(term342202, term342202.getClass(), "lastAllNetId", -297855658);
        setField(term342202, term342202.getClass(), "lastClientId", "fQJBLTYcqR");
        setIntField(term342202, term342202.getClass(), "lastUsedDeckId", -936602021);
        setIntField(term342202, term342202.getClass(), "lastPlayMusicLevel", 1473584227);
        setIntField(term342202, term342202.getClass(), "lastEmoneyBrand", 704067535);
        setField(term342200, term342200.getClass(), "user", term342202);
        setIntField(term342200, term342200.getClass(), "optionSet", 403828653);
        setIntField(term342200, term342200.getClass(), "speed", -1807256081);
        setIntField(term342200, term342200.getClass(), "mirror", 697319234);
        setIntField(term342200, term342200.getClass(), "judgeTiming", -372120395);
        setIntField(term342200, term342200.getClass(), "judgeAdjustment", 1872130059);
        setIntField(term342200, term342200.getClass(), "abort", -1034882917);
        setIntField(term342200, term342200.getClass(), "stealthField", -2000144948);
        setIntField(term342200, term342200.getClass(), "tapSound", -1501347701);
        setIntField(term342200, term342200.getClass(), "volGuide", -1748063839);
        setIntField(term342200, term342200.getClass(), "volAll", -1557043441);
        setIntField(term342200, term342200.getClass(), "volTap", 567693754);
        setIntField(term342200, term342200.getClass(), "volCrTap", -1599386659);
        setIntField(term342200, term342200.getClass(), "volHold", 991547499);
        setIntField(term342200, term342200.getClass(), "volSide", 1425276715);
        setIntField(term342200, term342200.getClass(), "volFlick", 369505230);
        setIntField(term342200, term342200.getClass(), "volBell", 1996016254);
        setIntField(term342200, term342200.getClass(), "volEnemy", -7867264);
        setIntField(term342200, term342200.getClass(), "volSkill", -1909793085);
        setIntField(term342200, term342200.getClass(), "volDamage", -960566966);
        setIntField(term342200, term342200.getClass(), "colorField", 1443956212);
        setIntField(term342200, term342200.getClass(), "colorLaneBright", 291348140);
        setIntField(term342200, term342200.getClass(), "colorWallBright", -2028613982);
        setIntField(term342200, term342200.getClass(), "colorLane", -1860440923);
        setIntField(term342200, term342200.getClass(), "colorSide", 222745107);
        setIntField(term342200, term342200.getClass(), "effectDamage", -497278405);
        setIntField(term342200, term342200.getClass(), "effectPos", -1402893871);
        setIntField(term342200, term342200.getClass(), "judgeDisp", -716636804);
        setIntField(term342200, term342200.getClass(), "judgePos", 1638578151);
        setIntField(term342200, term342200.getClass(), "judgeBreak", 1348253719);
        setIntField(term342200, term342200.getClass(), "judgeHit", -1208599271);
        setIntField(term342200, term342200.getClass(), "platinumBreakDisp", 313459654);
        setIntField(term342200, term342200.getClass(), "judgeCriticalBreak", -315069737);
        setIntField(term342200, term342200.getClass(), "matching", -1206274283);
        setIntField(term342200, term342200.getClass(), "dispPlayerLv", 1051720389);
        setIntField(term342200, term342200.getClass(), "dispRating", -1473285556);
        setIntField(term342200, term342200.getClass(), "dispBP", -1383863290);
        setIntField(term342200, term342200.getClass(), "headphone", -1696432757);
        term342502 = new Integer(-1908136277);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term342502;
        callMethod(klass, "setPlatinumBreakDisp", argTypes, term342200, args);
    }

};


