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

public class UserActivity_setParam2_98627827816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290067;
     Object term290339;

    public UserActivity_setParam2_98627827816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term290073 = new Long(-2577420466618938650L);
        term290067 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity"));
        Object term290069 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term290071 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term290087 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term290088 = newInstance(Class.forName("java.time.LocalDate"));
        Object term290092 = newInstance(Class.forName("java.time.LocalTime"));
        Object term290097 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term290098 = newInstance(Class.forName("java.time.LocalDate"));
        Object term290102 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term290067, term290067.getClass(), "id", 1837576129916878563L);
        setLongField(term290069, term290069.getClass(), "id", 5525797948255899936L);
        setLongField(term290071, term290071.getClass(), "id", -6562089222146022031L);
        setField(term290071, term290071.getClass(), "extId", term290073);
        setField(term290071, term290071.getClass(), "luid", "MkwJQnHQbf");
        setIntField(term290088, term290088.getClass(), "year", 2015);
        setShortField(term290088, term290088.getClass(), "month", (short) 3);
        setShortField(term290088, term290088.getClass(), "day", (short) 22);
        setField(term290087, term290087.getClass(), "date", term290088);
        setByteField(term290092, term290092.getClass(), "hour", (byte) 15);
        setByteField(term290092, term290092.getClass(), "minute", (byte) 25);
        setByteField(term290092, term290092.getClass(), "second", (byte) 0);
        setIntField(term290092, term290092.getClass(), "nano", 105149225);
        setField(term290087, term290087.getClass(), "time", term290092);
        setField(term290071, term290071.getClass(), "registerTime", term290087);
        setIntField(term290098, term290098.getClass(), "year", 2027);
        setShortField(term290098, term290098.getClass(), "month", (short) 7);
        setShortField(term290098, term290098.getClass(), "day", (short) 29);
        setField(term290097, term290097.getClass(), "date", term290098);
        setByteField(term290102, term290102.getClass(), "hour", (byte) 16);
        setByteField(term290102, term290102.getClass(), "minute", (byte) 11);
        setByteField(term290102, term290102.getClass(), "second", (byte) 18);
        setIntField(term290102, term290102.getClass(), "nano", 191076740);
        setField(term290097, term290097.getClass(), "time", term290102);
        setField(term290071, term290071.getClass(), "accessTime", term290097);
        setField(term290069, term290069.getClass(), "card", term290071);
        setField(term290069, term290069.getClass(), "userName", "yPMIDJRkkP");
        setIntField(term290069, term290069.getClass(), "level", 903114651);
        setIntField(term290069, term290069.getClass(), "reincarnationNum", 1807849375);
        setLongField(term290069, term290069.getClass(), "exp", -1656789164868146288L);
        setLongField(term290069, term290069.getClass(), "point", -2928943287583155347L);
        setLongField(term290069, term290069.getClass(), "totalPoint", -9138648336996534223L);
        setIntField(term290069, term290069.getClass(), "playCount", -1351798207);
        setIntField(term290069, term290069.getClass(), "jewelCount", -1513274036);
        setIntField(term290069, term290069.getClass(), "totalJewelCount", 170457224);
        setIntField(term290069, term290069.getClass(), "medalCount", 1244570715);
        setIntField(term290069, term290069.getClass(), "playerRating", 1245160016);
        setIntField(term290069, term290069.getClass(), "highestRating", -1341238679);
        setIntField(term290069, term290069.getClass(), "battlePoint", -394071927);
        setIntField(term290069, term290069.getClass(), "bestBattlePoint", 1012504918);
        setIntField(term290069, term290069.getClass(), "overDamageBattlePoint", -634378894);
        setBooleanField(term290069, term290069.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term290069, term290069.getClass(), "nameplateId", -397378983);
        setIntField(term290069, term290069.getClass(), "trophyId", -185010370);
        setIntField(term290069, term290069.getClass(), "cardId", 1035137757);
        setIntField(term290069, term290069.getClass(), "characterId", 15591111);
        setIntField(term290069, term290069.getClass(), "characterVoiceNo", 1809785379);
        setIntField(term290069, term290069.getClass(), "tabSetting", 1798994684);
        setIntField(term290069, term290069.getClass(), "tabSortSetting", 1508037823);
        setIntField(term290069, term290069.getClass(), "cardCategorySetting", 1669333785);
        setIntField(term290069, term290069.getClass(), "cardSortSetting", 1656529757);
        setIntField(term290069, term290069.getClass(), "rivalScoreCategorySetting", 1125229827);
        setIntField(term290069, term290069.getClass(), "playedTutorialBit", 1245795448);
        setIntField(term290069, term290069.getClass(), "firstTutorialCancelNum", 1517384238);
        setLongField(term290069, term290069.getClass(), "sumTechHighScore", 2815545649003931286L);
        setLongField(term290069, term290069.getClass(), "sumTechBasicHighScore", -7356114878766065298L);
        setLongField(term290069, term290069.getClass(), "sumTechAdvancedHighScore", 1861271045847340437L);
        setLongField(term290069, term290069.getClass(), "sumTechExpertHighScore", 4078575869673068195L);
        setLongField(term290069, term290069.getClass(), "sumTechMasterHighScore", -1906204543992872935L);
        setLongField(term290069, term290069.getClass(), "sumTechLunaticHighScore", -2570085915947380001L);
        setLongField(term290069, term290069.getClass(), "sumBattleHighScore", -1414813755529452220L);
        setLongField(term290069, term290069.getClass(), "sumBattleBasicHighScore", -3488819988952847382L);
        setLongField(term290069, term290069.getClass(), "sumBattleAdvancedHighScore", 4327099287611149381L);
        setLongField(term290069, term290069.getClass(), "sumBattleExpertHighScore", -5674151474986023543L);
        setLongField(term290069, term290069.getClass(), "sumBattleMasterHighScore", 8510654518817590085L);
        setLongField(term290069, term290069.getClass(), "sumBattleLunaticHighScore", -102566740501084928L);
        setField(term290069, term290069.getClass(), "eventWatchedDate", "FYrHZjWNQJ");
        setField(term290069, term290069.getClass(), "cmEventWatchedDate", "kroCMCDLFI");
        setField(term290069, term290069.getClass(), "firstGameId", "KkIBmxvzcL");
        setField(term290069, term290069.getClass(), "firstRomVersion", "LVDexpaQJR");
        setField(term290069, term290069.getClass(), "firstDataVersion", "vlzfUznWJR");
        setField(term290069, term290069.getClass(), "firstPlayDate", "FdzDmAbJCC");
        setField(term290069, term290069.getClass(), "lastGameId", "OSXAuRuAau");
        setField(term290069, term290069.getClass(), "lastRomVersion", "azsnWqwRkF");
        setField(term290069, term290069.getClass(), "lastDataVersion", "VytBIaPeoV");
        setField(term290069, term290069.getClass(), "compatibleCmVersion", "eVeQiooIie");
        setField(term290069, term290069.getClass(), "lastPlayDate", "tBvyiKlvwt");
        setIntField(term290069, term290069.getClass(), "lastPlaceId", 1717443823);
        setField(term290069, term290069.getClass(), "lastPlaceName", "cbrJBcmzzA");
        setIntField(term290069, term290069.getClass(), "lastRegionId", 412833014);
        setField(term290069, term290069.getClass(), "lastRegionName", "MQEpjCONzM");
        setIntField(term290069, term290069.getClass(), "lastAllNetId", 143049105);
        setField(term290069, term290069.getClass(), "lastClientId", "NYzdiIdifj");
        setIntField(term290069, term290069.getClass(), "lastUsedDeckId", 1007792478);
        setIntField(term290069, term290069.getClass(), "lastPlayMusicLevel", 72158236);
        setIntField(term290069, term290069.getClass(), "lastEmoneyBrand", -2109808761);
        setField(term290067, term290067.getClass(), "user", term290069);
        setIntField(term290067, term290067.getClass(), "kind", -460484538);
        setIntField(term290067, term290067.getClass(), "activityId", 1610941284);
        setIntField(term290067, term290067.getClass(), "sortNumber", -1956974141);
        setIntField(term290067, term290067.getClass(), "param1", 685147249);
        setIntField(term290067, term290067.getClass(), "param2", 2088094312);
        setIntField(term290067, term290067.getClass(), "param3", 1744329080);
        setIntField(term290067, term290067.getClass(), "param4", -636254239);
        term290339 = new Integer(404017067);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term290339;
        callMethod(klass, "setParam2", argTypes, term290067, args);
    }

};


