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

public class UserScenario_getUser_213643782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96971;

    public UserScenario_getUser_213643782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term96977 = new Long(6426732259596412988L);
        term96971 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserScenario"));
        Object term96973 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term96975 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term96991 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term96992 = newInstance(Class.forName("java.time.LocalDate"));
        Object term96996 = newInstance(Class.forName("java.time.LocalTime"));
        Object term97001 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term97002 = newInstance(Class.forName("java.time.LocalDate"));
        Object term97006 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term96971, term96971.getClass(), "id", 7205023166504172089L);
        setLongField(term96973, term96973.getClass(), "id", -1992975559583541654L);
        setLongField(term96975, term96975.getClass(), "id", -1078931920551242838L);
        setField(term96975, term96975.getClass(), "extId", term96977);
        setField(term96975, term96975.getClass(), "luid", "KoDRiNjUMj");
        setIntField(term96992, term96992.getClass(), "year", 2011);
        setShortField(term96992, term96992.getClass(), "month", (short) 1);
        setShortField(term96992, term96992.getClass(), "day", (short) 7);
        setField(term96991, term96991.getClass(), "date", term96992);
        setByteField(term96996, term96996.getClass(), "hour", (byte) 10);
        setByteField(term96996, term96996.getClass(), "minute", (byte) 6);
        setByteField(term96996, term96996.getClass(), "second", (byte) 28);
        setIntField(term96996, term96996.getClass(), "nano", 669533698);
        setField(term96991, term96991.getClass(), "time", term96996);
        setField(term96975, term96975.getClass(), "registerTime", term96991);
        setIntField(term97002, term97002.getClass(), "year", 2016);
        setShortField(term97002, term97002.getClass(), "month", (short) 11);
        setShortField(term97002, term97002.getClass(), "day", (short) 15);
        setField(term97001, term97001.getClass(), "date", term97002);
        setByteField(term97006, term97006.getClass(), "hour", (byte) 14);
        setByteField(term97006, term97006.getClass(), "minute", (byte) 34);
        setByteField(term97006, term97006.getClass(), "second", (byte) 23);
        setIntField(term97006, term97006.getClass(), "nano", 287070581);
        setField(term97001, term97001.getClass(), "time", term97006);
        setField(term96975, term96975.getClass(), "accessTime", term97001);
        setField(term96973, term96973.getClass(), "card", term96975);
        setField(term96973, term96973.getClass(), "userName", "LtnegjrHqS");
        setIntField(term96973, term96973.getClass(), "level", -1309376267);
        setIntField(term96973, term96973.getClass(), "reincarnationNum", -1487504399);
        setLongField(term96973, term96973.getClass(), "exp", -8575958299651392724L);
        setLongField(term96973, term96973.getClass(), "point", -9145745451304744888L);
        setLongField(term96973, term96973.getClass(), "totalPoint", 8020550559849227814L);
        setIntField(term96973, term96973.getClass(), "playCount", -345174419);
        setIntField(term96973, term96973.getClass(), "jewelCount", 1676102379);
        setIntField(term96973, term96973.getClass(), "totalJewelCount", 1215582502);
        setIntField(term96973, term96973.getClass(), "medalCount", 997123385);
        setIntField(term96973, term96973.getClass(), "playerRating", -171991376);
        setIntField(term96973, term96973.getClass(), "highestRating", 1966933092);
        setIntField(term96973, term96973.getClass(), "battlePoint", 1108791337);
        setIntField(term96973, term96973.getClass(), "bestBattlePoint", -414682663);
        setIntField(term96973, term96973.getClass(), "overDamageBattlePoint", 259051944);
        setBooleanField(term96973, term96973.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term96973, term96973.getClass(), "nameplateId", -958789263);
        setIntField(term96973, term96973.getClass(), "trophyId", 120623003);
        setIntField(term96973, term96973.getClass(), "cardId", -1236935869);
        setIntField(term96973, term96973.getClass(), "characterId", -1707868253);
        setIntField(term96973, term96973.getClass(), "characterVoiceNo", 487083950);
        setIntField(term96973, term96973.getClass(), "tabSetting", 33771952);
        setIntField(term96973, term96973.getClass(), "tabSortSetting", -732008756);
        setIntField(term96973, term96973.getClass(), "cardCategorySetting", -1750902922);
        setIntField(term96973, term96973.getClass(), "cardSortSetting", -1037994843);
        setIntField(term96973, term96973.getClass(), "rivalScoreCategorySetting", 727200615);
        setIntField(term96973, term96973.getClass(), "playedTutorialBit", -308494890);
        setIntField(term96973, term96973.getClass(), "firstTutorialCancelNum", -1113508392);
        setLongField(term96973, term96973.getClass(), "sumTechHighScore", 6556499840705187488L);
        setLongField(term96973, term96973.getClass(), "sumTechBasicHighScore", -4937484587771809733L);
        setLongField(term96973, term96973.getClass(), "sumTechAdvancedHighScore", -7245833890302920867L);
        setLongField(term96973, term96973.getClass(), "sumTechExpertHighScore", -8022774801267796171L);
        setLongField(term96973, term96973.getClass(), "sumTechMasterHighScore", -1219290427069101846L);
        setLongField(term96973, term96973.getClass(), "sumTechLunaticHighScore", -6611343048483242997L);
        setLongField(term96973, term96973.getClass(), "sumBattleHighScore", 3182987509782180187L);
        setLongField(term96973, term96973.getClass(), "sumBattleBasicHighScore", -4883788836369956506L);
        setLongField(term96973, term96973.getClass(), "sumBattleAdvancedHighScore", 1828579945139352205L);
        setLongField(term96973, term96973.getClass(), "sumBattleExpertHighScore", 7974624276262964833L);
        setLongField(term96973, term96973.getClass(), "sumBattleMasterHighScore", 7593569489480297611L);
        setLongField(term96973, term96973.getClass(), "sumBattleLunaticHighScore", -6771193908629784176L);
        setField(term96973, term96973.getClass(), "eventWatchedDate", "iSrYZvDgVF");
        setField(term96973, term96973.getClass(), "cmEventWatchedDate", "uVYuAEBgZy");
        setField(term96973, term96973.getClass(), "firstGameId", "pOAxvXmQfD");
        setField(term96973, term96973.getClass(), "firstRomVersion", "mvWHHiGYmD");
        setField(term96973, term96973.getClass(), "firstDataVersion", "eZUuWCoERR");
        setField(term96973, term96973.getClass(), "firstPlayDate", "AMeLarREbk");
        setField(term96973, term96973.getClass(), "lastGameId", "LQHAihGqFG");
        setField(term96973, term96973.getClass(), "lastRomVersion", "XNHngduAPd");
        setField(term96973, term96973.getClass(), "lastDataVersion", "ewowfKAPBz");
        setField(term96973, term96973.getClass(), "compatibleCmVersion", "yOYHYOdvNm");
        setField(term96973, term96973.getClass(), "lastPlayDate", "RsOIgNcrMD");
        setIntField(term96973, term96973.getClass(), "lastPlaceId", 31876246);
        setField(term96973, term96973.getClass(), "lastPlaceName", "JDwFepEsNs");
        setIntField(term96973, term96973.getClass(), "lastRegionId", 55952895);
        setField(term96973, term96973.getClass(), "lastRegionName", "YFjmdvvUEp");
        setIntField(term96973, term96973.getClass(), "lastAllNetId", -1961513935);
        setField(term96973, term96973.getClass(), "lastClientId", "jCSXDmxVEW");
        setIntField(term96973, term96973.getClass(), "lastUsedDeckId", -22602260);
        setIntField(term96973, term96973.getClass(), "lastPlayMusicLevel", -1494996615);
        setIntField(term96973, term96973.getClass(), "lastEmoneyBrand", -686175319);
        setField(term96971, term96971.getClass(), "user", term96973);
        setIntField(term96971, term96971.getClass(), "scenarioId", -489193282);
        setIntField(term96971, term96971.getClass(), "playCount", 1790125855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserScenario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term96971, args);
    }

};


