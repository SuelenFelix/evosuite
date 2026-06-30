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

public class UserData_getCard_7994640831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22341;

    public UserData_getCard_7994640831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22345 = new Long(-5788180182343976541L);
        term22341 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term22343 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term22359 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22360 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22364 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22369 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22370 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22374 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term22341, term22341.getClass(), "id", -1437596366836021966L);
        setLongField(term22343, term22343.getClass(), "id", 8542753860527083778L);
        setField(term22343, term22343.getClass(), "extId", term22345);
        setField(term22343, term22343.getClass(), "luid", "oYymmLqbfJ");
        setIntField(term22360, term22360.getClass(), "year", 2027);
        setShortField(term22360, term22360.getClass(), "month", (short) 6);
        setShortField(term22360, term22360.getClass(), "day", (short) 20);
        setField(term22359, term22359.getClass(), "date", term22360);
        setByteField(term22364, term22364.getClass(), "hour", (byte) 23);
        setByteField(term22364, term22364.getClass(), "minute", (byte) 21);
        setByteField(term22364, term22364.getClass(), "second", (byte) 6);
        setIntField(term22364, term22364.getClass(), "nano", 897776059);
        setField(term22359, term22359.getClass(), "time", term22364);
        setField(term22343, term22343.getClass(), "registerTime", term22359);
        setIntField(term22370, term22370.getClass(), "year", 2016);
        setShortField(term22370, term22370.getClass(), "month", (short) 3);
        setShortField(term22370, term22370.getClass(), "day", (short) 20);
        setField(term22369, term22369.getClass(), "date", term22370);
        setByteField(term22374, term22374.getClass(), "hour", (byte) 0);
        setByteField(term22374, term22374.getClass(), "minute", (byte) 54);
        setByteField(term22374, term22374.getClass(), "second", (byte) 6);
        setIntField(term22374, term22374.getClass(), "nano", 183302469);
        setField(term22369, term22369.getClass(), "time", term22374);
        setField(term22343, term22343.getClass(), "accessTime", term22369);
        setField(term22341, term22341.getClass(), "card", term22343);
        setField(term22341, term22341.getClass(), "userName", "YaDWphDOSz");
        setIntField(term22341, term22341.getClass(), "level", 539095138);
        setIntField(term22341, term22341.getClass(), "reincarnationNum", 1462297654);
        setLongField(term22341, term22341.getClass(), "exp", -7981877752051488010L);
        setLongField(term22341, term22341.getClass(), "point", 4486175312218543930L);
        setLongField(term22341, term22341.getClass(), "totalPoint", -5866516262253090421L);
        setIntField(term22341, term22341.getClass(), "playCount", 1009915858);
        setIntField(term22341, term22341.getClass(), "jewelCount", 500127209);
        setIntField(term22341, term22341.getClass(), "totalJewelCount", -1482530168);
        setIntField(term22341, term22341.getClass(), "medalCount", -432987116);
        setIntField(term22341, term22341.getClass(), "playerRating", 1483499310);
        setIntField(term22341, term22341.getClass(), "highestRating", -1516568587);
        setIntField(term22341, term22341.getClass(), "battlePoint", 1537690170);
        setIntField(term22341, term22341.getClass(), "bestBattlePoint", 1133116994);
        setIntField(term22341, term22341.getClass(), "overDamageBattlePoint", -1195191239);
        setBooleanField(term22341, term22341.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term22341, term22341.getClass(), "nameplateId", -470798982);
        setIntField(term22341, term22341.getClass(), "trophyId", 1844345719);
        setIntField(term22341, term22341.getClass(), "cardId", 1704024265);
        setIntField(term22341, term22341.getClass(), "characterId", 501801161);
        setIntField(term22341, term22341.getClass(), "characterVoiceNo", 2103971768);
        setIntField(term22341, term22341.getClass(), "tabSetting", -939132796);
        setIntField(term22341, term22341.getClass(), "tabSortSetting", 159279866);
        setIntField(term22341, term22341.getClass(), "cardCategorySetting", 138122227);
        setIntField(term22341, term22341.getClass(), "cardSortSetting", 1795358995);
        setIntField(term22341, term22341.getClass(), "rivalScoreCategorySetting", -781185864);
        setIntField(term22341, term22341.getClass(), "playedTutorialBit", 340500914);
        setIntField(term22341, term22341.getClass(), "firstTutorialCancelNum", -2061712635);
        setLongField(term22341, term22341.getClass(), "sumTechHighScore", -4336769198128902991L);
        setLongField(term22341, term22341.getClass(), "sumTechBasicHighScore", -3441020756295150684L);
        setLongField(term22341, term22341.getClass(), "sumTechAdvancedHighScore", -2938034344303060228L);
        setLongField(term22341, term22341.getClass(), "sumTechExpertHighScore", -758819117507836512L);
        setLongField(term22341, term22341.getClass(), "sumTechMasterHighScore", -1855660992126411308L);
        setLongField(term22341, term22341.getClass(), "sumTechLunaticHighScore", -6435676296015352817L);
        setLongField(term22341, term22341.getClass(), "sumBattleHighScore", -3817606000638396608L);
        setLongField(term22341, term22341.getClass(), "sumBattleBasicHighScore", -1435639144971145612L);
        setLongField(term22341, term22341.getClass(), "sumBattleAdvancedHighScore", -921066654455496205L);
        setLongField(term22341, term22341.getClass(), "sumBattleExpertHighScore", 7622401904339010124L);
        setLongField(term22341, term22341.getClass(), "sumBattleMasterHighScore", -761256632171362830L);
        setLongField(term22341, term22341.getClass(), "sumBattleLunaticHighScore", 6975846341920664143L);
        setField(term22341, term22341.getClass(), "eventWatchedDate", "nnnmCgFBLw");
        setField(term22341, term22341.getClass(), "cmEventWatchedDate", "hSSCyNEhyH");
        setField(term22341, term22341.getClass(), "firstGameId", "jDFNSuvZqm");
        setField(term22341, term22341.getClass(), "firstRomVersion", "pLvkKHqNYX");
        setField(term22341, term22341.getClass(), "firstDataVersion", "PwqnuJJwjR");
        setField(term22341, term22341.getClass(), "firstPlayDate", "NFkbBiPeiw");
        setField(term22341, term22341.getClass(), "lastGameId", "tlRvilQyjJ");
        setField(term22341, term22341.getClass(), "lastRomVersion", "gwTUlYNpjM");
        setField(term22341, term22341.getClass(), "lastDataVersion", "uXYojRmxrM");
        setField(term22341, term22341.getClass(), "compatibleCmVersion", "cxRwRcodud");
        setField(term22341, term22341.getClass(), "lastPlayDate", "GDGBPlYeLn");
        setIntField(term22341, term22341.getClass(), "lastPlaceId", 1182911731);
        setField(term22341, term22341.getClass(), "lastPlaceName", "jdQANIXSTq");
        setIntField(term22341, term22341.getClass(), "lastRegionId", 644726932);
        setField(term22341, term22341.getClass(), "lastRegionName", "stVcZLTNpu");
        setIntField(term22341, term22341.getClass(), "lastAllNetId", -1515977761);
        setField(term22341, term22341.getClass(), "lastClientId", "LgXdqWrsLL");
        setIntField(term22341, term22341.getClass(), "lastUsedDeckId", -1476037190);
        setIntField(term22341, term22341.getClass(), "lastPlayMusicLevel", -718204437);
        setIntField(term22341, term22341.getClass(), "lastEmoneyBrand", 468974358);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCard", argTypes, term22341, args);
    }

};


