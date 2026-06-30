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

public class UserData_isDialogWatchedSuggestMemory_133109752717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29109;

    public UserData_isDialogWatchedSuggestMemory_133109752717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29113 = new Long(414749984815662075L);
        term29109 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term29111 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term29127 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29128 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29132 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29137 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29138 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29142 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term29109, term29109.getClass(), "id", -971944383326299487L);
        setLongField(term29111, term29111.getClass(), "id", -5921915827741960720L);
        setField(term29111, term29111.getClass(), "extId", term29113);
        setField(term29111, term29111.getClass(), "luid", "cjaaJUnNCR");
        setIntField(term29128, term29128.getClass(), "year", 2012);
        setShortField(term29128, term29128.getClass(), "month", (short) 5);
        setShortField(term29128, term29128.getClass(), "day", (short) 25);
        setField(term29127, term29127.getClass(), "date", term29128);
        setByteField(term29132, term29132.getClass(), "hour", (byte) 5);
        setByteField(term29132, term29132.getClass(), "minute", (byte) 8);
        setByteField(term29132, term29132.getClass(), "second", (byte) 47);
        setIntField(term29132, term29132.getClass(), "nano", 455554221);
        setField(term29127, term29127.getClass(), "time", term29132);
        setField(term29111, term29111.getClass(), "registerTime", term29127);
        setIntField(term29138, term29138.getClass(), "year", 2029);
        setShortField(term29138, term29138.getClass(), "month", (short) 11);
        setShortField(term29138, term29138.getClass(), "day", (short) 18);
        setField(term29137, term29137.getClass(), "date", term29138);
        setByteField(term29142, term29142.getClass(), "hour", (byte) 5);
        setByteField(term29142, term29142.getClass(), "minute", (byte) 36);
        setByteField(term29142, term29142.getClass(), "second", (byte) 57);
        setIntField(term29142, term29142.getClass(), "nano", 394167804);
        setField(term29137, term29137.getClass(), "time", term29142);
        setField(term29111, term29111.getClass(), "accessTime", term29137);
        setField(term29109, term29109.getClass(), "card", term29111);
        setField(term29109, term29109.getClass(), "userName", "ETbxNuJLii");
        setIntField(term29109, term29109.getClass(), "level", 2060624021);
        setIntField(term29109, term29109.getClass(), "reincarnationNum", -1853309523);
        setLongField(term29109, term29109.getClass(), "exp", -2480054455719869328L);
        setLongField(term29109, term29109.getClass(), "point", 8637380632328451251L);
        setLongField(term29109, term29109.getClass(), "totalPoint", -9204025169674713263L);
        setIntField(term29109, term29109.getClass(), "playCount", 241741655);
        setIntField(term29109, term29109.getClass(), "jewelCount", -1062022366);
        setIntField(term29109, term29109.getClass(), "totalJewelCount", -1347618079);
        setIntField(term29109, term29109.getClass(), "medalCount", 1510246255);
        setIntField(term29109, term29109.getClass(), "playerRating", -515631808);
        setIntField(term29109, term29109.getClass(), "highestRating", 1546701347);
        setIntField(term29109, term29109.getClass(), "battlePoint", -111931851);
        setIntField(term29109, term29109.getClass(), "bestBattlePoint", -251696516);
        setIntField(term29109, term29109.getClass(), "overDamageBattlePoint", 1075321384);
        setBooleanField(term29109, term29109.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term29109, term29109.getClass(), "nameplateId", -1726073541);
        setIntField(term29109, term29109.getClass(), "trophyId", 406945977);
        setIntField(term29109, term29109.getClass(), "cardId", 493657684);
        setIntField(term29109, term29109.getClass(), "characterId", 1882655922);
        setIntField(term29109, term29109.getClass(), "characterVoiceNo", 1314996390);
        setIntField(term29109, term29109.getClass(), "tabSetting", 1367703658);
        setIntField(term29109, term29109.getClass(), "tabSortSetting", 1120153100);
        setIntField(term29109, term29109.getClass(), "cardCategorySetting", 158801111);
        setIntField(term29109, term29109.getClass(), "cardSortSetting", 464966803);
        setIntField(term29109, term29109.getClass(), "rivalScoreCategorySetting", -246618392);
        setIntField(term29109, term29109.getClass(), "playedTutorialBit", 1472246167);
        setIntField(term29109, term29109.getClass(), "firstTutorialCancelNum", 1008555478);
        setLongField(term29109, term29109.getClass(), "sumTechHighScore", 8289082707825797292L);
        setLongField(term29109, term29109.getClass(), "sumTechBasicHighScore", -5515080039914707735L);
        setLongField(term29109, term29109.getClass(), "sumTechAdvancedHighScore", -6249289368466698064L);
        setLongField(term29109, term29109.getClass(), "sumTechExpertHighScore", 4087729695916598698L);
        setLongField(term29109, term29109.getClass(), "sumTechMasterHighScore", -590628922285125667L);
        setLongField(term29109, term29109.getClass(), "sumTechLunaticHighScore", 6167026289140715860L);
        setLongField(term29109, term29109.getClass(), "sumBattleHighScore", -5583016716246948935L);
        setLongField(term29109, term29109.getClass(), "sumBattleBasicHighScore", -5567719604161729601L);
        setLongField(term29109, term29109.getClass(), "sumBattleAdvancedHighScore", -8754542710304507750L);
        setLongField(term29109, term29109.getClass(), "sumBattleExpertHighScore", -5957491491329394218L);
        setLongField(term29109, term29109.getClass(), "sumBattleMasterHighScore", 280552269591781447L);
        setLongField(term29109, term29109.getClass(), "sumBattleLunaticHighScore", 1721306000453653222L);
        setField(term29109, term29109.getClass(), "eventWatchedDate", "YJhnPtWtJR");
        setField(term29109, term29109.getClass(), "cmEventWatchedDate", "xzGnrvbExX");
        setField(term29109, term29109.getClass(), "firstGameId", "LFZNDELxUZ");
        setField(term29109, term29109.getClass(), "firstRomVersion", "GNIVsSTglt");
        setField(term29109, term29109.getClass(), "firstDataVersion", "mzPebFiUSP");
        setField(term29109, term29109.getClass(), "firstPlayDate", "HvbkjsQyDy");
        setField(term29109, term29109.getClass(), "lastGameId", "wzSukELQFL");
        setField(term29109, term29109.getClass(), "lastRomVersion", "VZyeaOWYEj");
        setField(term29109, term29109.getClass(), "lastDataVersion", "PErxMBQSUv");
        setField(term29109, term29109.getClass(), "compatibleCmVersion", "KZQwbvujui");
        setField(term29109, term29109.getClass(), "lastPlayDate", "JPUZuGxKlI");
        setIntField(term29109, term29109.getClass(), "lastPlaceId", 1346386442);
        setField(term29109, term29109.getClass(), "lastPlaceName", "xqIbVsUspl");
        setIntField(term29109, term29109.getClass(), "lastRegionId", 1904559758);
        setField(term29109, term29109.getClass(), "lastRegionName", "GnjLRtJywq");
        setIntField(term29109, term29109.getClass(), "lastAllNetId", 610850630);
        setField(term29109, term29109.getClass(), "lastClientId", "TDaodpHTRK");
        setIntField(term29109, term29109.getClass(), "lastUsedDeckId", 170509161);
        setIntField(term29109, term29109.getClass(), "lastPlayMusicLevel", 491497994);
        setIntField(term29109, term29109.getClass(), "lastEmoneyBrand", 1997288643);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDialogWatchedSuggestMemory", argTypes, term29109, args);
    }

};


