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

public class UserCard_setChoKaikaDate_54841567230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128100;

    public UserCard_setChoKaikaDate_54841567230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term128106 = new Long(-5460517064177800852L);
        term128100 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term128102 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term128104 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term128120 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term128121 = newInstance(Class.forName("java.time.LocalDate"));
        Object term128125 = newInstance(Class.forName("java.time.LocalTime"));
        Object term128130 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term128131 = newInstance(Class.forName("java.time.LocalDate"));
        Object term128135 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term128100, term128100.getClass(), "id", -3174182568917015653L);
        setLongField(term128102, term128102.getClass(), "id", -5482642096772378137L);
        setLongField(term128104, term128104.getClass(), "id", -8768240613860401887L);
        setField(term128104, term128104.getClass(), "extId", term128106);
        setField(term128104, term128104.getClass(), "luid", "AtYIxbvLDg");
        setIntField(term128121, term128121.getClass(), "year", 2010);
        setShortField(term128121, term128121.getClass(), "month", (short) 8);
        setShortField(term128121, term128121.getClass(), "day", (short) 17);
        setField(term128120, term128120.getClass(), "date", term128121);
        setByteField(term128125, term128125.getClass(), "hour", (byte) 5);
        setByteField(term128125, term128125.getClass(), "minute", (byte) 41);
        setByteField(term128125, term128125.getClass(), "second", (byte) 7);
        setIntField(term128125, term128125.getClass(), "nano", 26533684);
        setField(term128120, term128120.getClass(), "time", term128125);
        setField(term128104, term128104.getClass(), "registerTime", term128120);
        setIntField(term128131, term128131.getClass(), "year", 2012);
        setShortField(term128131, term128131.getClass(), "month", (short) 4);
        setShortField(term128131, term128131.getClass(), "day", (short) 28);
        setField(term128130, term128130.getClass(), "date", term128131);
        setByteField(term128135, term128135.getClass(), "hour", (byte) 11);
        setByteField(term128135, term128135.getClass(), "minute", (byte) 47);
        setByteField(term128135, term128135.getClass(), "second", (byte) 25);
        setIntField(term128135, term128135.getClass(), "nano", 790659871);
        setField(term128130, term128130.getClass(), "time", term128135);
        setField(term128104, term128104.getClass(), "accessTime", term128130);
        setField(term128102, term128102.getClass(), "card", term128104);
        setField(term128102, term128102.getClass(), "userName", "rQdqhBCIJv");
        setIntField(term128102, term128102.getClass(), "level", 217176849);
        setIntField(term128102, term128102.getClass(), "reincarnationNum", 665322254);
        setLongField(term128102, term128102.getClass(), "exp", 8879904246779438572L);
        setLongField(term128102, term128102.getClass(), "point", -1874151381486412150L);
        setLongField(term128102, term128102.getClass(), "totalPoint", 9142527737239136670L);
        setIntField(term128102, term128102.getClass(), "playCount", -950956143);
        setIntField(term128102, term128102.getClass(), "jewelCount", 146996690);
        setIntField(term128102, term128102.getClass(), "totalJewelCount", 490172433);
        setIntField(term128102, term128102.getClass(), "medalCount", 387768499);
        setIntField(term128102, term128102.getClass(), "playerRating", 1727693843);
        setIntField(term128102, term128102.getClass(), "highestRating", -371048786);
        setIntField(term128102, term128102.getClass(), "battlePoint", -1779736424);
        setIntField(term128102, term128102.getClass(), "bestBattlePoint", 1027604749);
        setIntField(term128102, term128102.getClass(), "overDamageBattlePoint", -1786633473);
        setBooleanField(term128102, term128102.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term128102, term128102.getClass(), "nameplateId", 1484582681);
        setIntField(term128102, term128102.getClass(), "trophyId", 641921984);
        setIntField(term128102, term128102.getClass(), "cardId", -1505020273);
        setIntField(term128102, term128102.getClass(), "characterId", -298905997);
        setIntField(term128102, term128102.getClass(), "characterVoiceNo", -2030417348);
        setIntField(term128102, term128102.getClass(), "tabSetting", 1282232010);
        setIntField(term128102, term128102.getClass(), "tabSortSetting", -1360469722);
        setIntField(term128102, term128102.getClass(), "cardCategorySetting", -1203130784);
        setIntField(term128102, term128102.getClass(), "cardSortSetting", 728397857);
        setIntField(term128102, term128102.getClass(), "rivalScoreCategorySetting", -1851390582);
        setIntField(term128102, term128102.getClass(), "playedTutorialBit", 436551890);
        setIntField(term128102, term128102.getClass(), "firstTutorialCancelNum", -1176677999);
        setLongField(term128102, term128102.getClass(), "sumTechHighScore", -3156457124749522987L);
        setLongField(term128102, term128102.getClass(), "sumTechBasicHighScore", 20026154777394470L);
        setLongField(term128102, term128102.getClass(), "sumTechAdvancedHighScore", 7108298520514144896L);
        setLongField(term128102, term128102.getClass(), "sumTechExpertHighScore", 6187770300210095908L);
        setLongField(term128102, term128102.getClass(), "sumTechMasterHighScore", 3941156330515774726L);
        setLongField(term128102, term128102.getClass(), "sumTechLunaticHighScore", -6858496236542861868L);
        setLongField(term128102, term128102.getClass(), "sumBattleHighScore", 7749759205937611432L);
        setLongField(term128102, term128102.getClass(), "sumBattleBasicHighScore", -6617910489517703572L);
        setLongField(term128102, term128102.getClass(), "sumBattleAdvancedHighScore", 8422271285152148336L);
        setLongField(term128102, term128102.getClass(), "sumBattleExpertHighScore", -4128797968092293431L);
        setLongField(term128102, term128102.getClass(), "sumBattleMasterHighScore", -145719648620089230L);
        setLongField(term128102, term128102.getClass(), "sumBattleLunaticHighScore", 5476908332056798537L);
        setField(term128102, term128102.getClass(), "eventWatchedDate", "OWnGgqSmUN");
        setField(term128102, term128102.getClass(), "cmEventWatchedDate", "BLSUZfTILp");
        setField(term128102, term128102.getClass(), "firstGameId", "tlymfAhXiZ");
        setField(term128102, term128102.getClass(), "firstRomVersion", "rlLIYBJlxU");
        setField(term128102, term128102.getClass(), "firstDataVersion", "jtfkxwFefh");
        setField(term128102, term128102.getClass(), "firstPlayDate", "ESnYpdjELS");
        setField(term128102, term128102.getClass(), "lastGameId", "IsOpDBwqZb");
        setField(term128102, term128102.getClass(), "lastRomVersion", "GBSKSryDNr");
        setField(term128102, term128102.getClass(), "lastDataVersion", "lewYJfdwbu");
        setField(term128102, term128102.getClass(), "compatibleCmVersion", "wmCdnKXFIV");
        setField(term128102, term128102.getClass(), "lastPlayDate", "OQFYTZSsmT");
        setIntField(term128102, term128102.getClass(), "lastPlaceId", -1491389341);
        setField(term128102, term128102.getClass(), "lastPlaceName", "sERwhJnfhH");
        setIntField(term128102, term128102.getClass(), "lastRegionId", -1204433663);
        setField(term128102, term128102.getClass(), "lastRegionName", "ttMftcuYTC");
        setIntField(term128102, term128102.getClass(), "lastAllNetId", 784981368);
        setField(term128102, term128102.getClass(), "lastClientId", "ktSwbNnkjp");
        setIntField(term128102, term128102.getClass(), "lastUsedDeckId", 1786501867);
        setIntField(term128102, term128102.getClass(), "lastPlayMusicLevel", 608414757);
        setIntField(term128102, term128102.getClass(), "lastEmoneyBrand", -67554229);
        setField(term128100, term128100.getClass(), "user", term128102);
        setIntField(term128100, term128100.getClass(), "cardId", -1);
        setIntField(term128100, term128100.getClass(), "digitalStock", 1);
        setIntField(term128100, term128100.getClass(), "analogStock", 1715935221);
        setIntField(term128100, term128100.getClass(), "level", 1396211446);
        setIntField(term128100, term128100.getClass(), "maxLevel", 10);
        setIntField(term128100, term128100.getClass(), "exp", -407124155);
        setIntField(term128100, term128100.getClass(), "printCount", 488605627);
        setIntField(term128100, term128100.getClass(), "useCount", 469579894);
        setBooleanField(term128100, term128100.getClass(), "isNew", true);
        setField(term128100, term128100.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term128100, term128100.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term128100, term128100.getClass(), "skillId", 1767003547);
        setBooleanField(term128100, term128100.getClass(), "isAcquired", true);
        setField(term128100, term128100.getClass(), "created", "0000-00-00 00:00:00.0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GnPQSLhuqc";
        callMethod(klass, "setChoKaikaDate", argTypes, term128100, args);
    }

};


