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

public class UserBoss_getDamage_19914733924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135437;

    public UserBoss_getDamage_19914733924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term135443 = new Long(-1526729287349763895L);
        term135437 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss"));
        Object term135439 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term135441 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term135457 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term135458 = newInstance(Class.forName("java.time.LocalDate"));
        Object term135462 = newInstance(Class.forName("java.time.LocalTime"));
        Object term135467 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term135468 = newInstance(Class.forName("java.time.LocalDate"));
        Object term135472 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term135437, term135437.getClass(), "id", 8533631924184419930L);
        setLongField(term135439, term135439.getClass(), "id", 5575060236440980770L);
        setLongField(term135441, term135441.getClass(), "id", -1085101519315567391L);
        setField(term135441, term135441.getClass(), "extId", term135443);
        setField(term135441, term135441.getClass(), "luid", "rUMOOZJWlQ");
        setIntField(term135458, term135458.getClass(), "year", 2019);
        setShortField(term135458, term135458.getClass(), "month", (short) 7);
        setShortField(term135458, term135458.getClass(), "day", (short) 9);
        setField(term135457, term135457.getClass(), "date", term135458);
        setByteField(term135462, term135462.getClass(), "hour", (byte) 21);
        setByteField(term135462, term135462.getClass(), "minute", (byte) 37);
        setByteField(term135462, term135462.getClass(), "second", (byte) 42);
        setIntField(term135462, term135462.getClass(), "nano", 399935883);
        setField(term135457, term135457.getClass(), "time", term135462);
        setField(term135441, term135441.getClass(), "registerTime", term135457);
        setIntField(term135468, term135468.getClass(), "year", 2013);
        setShortField(term135468, term135468.getClass(), "month", (short) 9);
        setShortField(term135468, term135468.getClass(), "day", (short) 23);
        setField(term135467, term135467.getClass(), "date", term135468);
        setByteField(term135472, term135472.getClass(), "hour", (byte) 14);
        setByteField(term135472, term135472.getClass(), "minute", (byte) 21);
        setByteField(term135472, term135472.getClass(), "second", (byte) 30);
        setIntField(term135472, term135472.getClass(), "nano", 871245576);
        setField(term135467, term135467.getClass(), "time", term135472);
        setField(term135441, term135441.getClass(), "accessTime", term135467);
        setField(term135439, term135439.getClass(), "card", term135441);
        setField(term135439, term135439.getClass(), "userName", "STLaUnCnfE");
        setIntField(term135439, term135439.getClass(), "level", 414828751);
        setIntField(term135439, term135439.getClass(), "reincarnationNum", -1302401149);
        setLongField(term135439, term135439.getClass(), "exp", 6247462079035469338L);
        setLongField(term135439, term135439.getClass(), "point", 1419029473607036156L);
        setLongField(term135439, term135439.getClass(), "totalPoint", -6376323688537552809L);
        setIntField(term135439, term135439.getClass(), "playCount", -245323536);
        setIntField(term135439, term135439.getClass(), "jewelCount", 1512614447);
        setIntField(term135439, term135439.getClass(), "totalJewelCount", 1978532347);
        setIntField(term135439, term135439.getClass(), "medalCount", 612187049);
        setIntField(term135439, term135439.getClass(), "playerRating", -965947021);
        setIntField(term135439, term135439.getClass(), "highestRating", 1079005450);
        setIntField(term135439, term135439.getClass(), "battlePoint", -1932347451);
        setIntField(term135439, term135439.getClass(), "bestBattlePoint", -406686588);
        setIntField(term135439, term135439.getClass(), "overDamageBattlePoint", 1008508403);
        setBooleanField(term135439, term135439.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term135439, term135439.getClass(), "nameplateId", -1013082565);
        setIntField(term135439, term135439.getClass(), "trophyId", -855398884);
        setIntField(term135439, term135439.getClass(), "cardId", -762497528);
        setIntField(term135439, term135439.getClass(), "characterId", -210438728);
        setIntField(term135439, term135439.getClass(), "characterVoiceNo", -277514484);
        setIntField(term135439, term135439.getClass(), "tabSetting", 836110005);
        setIntField(term135439, term135439.getClass(), "tabSortSetting", -25573615);
        setIntField(term135439, term135439.getClass(), "cardCategorySetting", -1429138211);
        setIntField(term135439, term135439.getClass(), "cardSortSetting", -458414349);
        setIntField(term135439, term135439.getClass(), "rivalScoreCategorySetting", 1500512047);
        setIntField(term135439, term135439.getClass(), "playedTutorialBit", 1803572922);
        setIntField(term135439, term135439.getClass(), "firstTutorialCancelNum", 1045176591);
        setLongField(term135439, term135439.getClass(), "sumTechHighScore", 7714928797621871968L);
        setLongField(term135439, term135439.getClass(), "sumTechBasicHighScore", -8893373378918400213L);
        setLongField(term135439, term135439.getClass(), "sumTechAdvancedHighScore", 3993078617869963018L);
        setLongField(term135439, term135439.getClass(), "sumTechExpertHighScore", 4668605657067307830L);
        setLongField(term135439, term135439.getClass(), "sumTechMasterHighScore", -8229228704336663710L);
        setLongField(term135439, term135439.getClass(), "sumTechLunaticHighScore", -7230407277540315345L);
        setLongField(term135439, term135439.getClass(), "sumBattleHighScore", -9124581914090878819L);
        setLongField(term135439, term135439.getClass(), "sumBattleBasicHighScore", 2048712253462179044L);
        setLongField(term135439, term135439.getClass(), "sumBattleAdvancedHighScore", 80936317831567458L);
        setLongField(term135439, term135439.getClass(), "sumBattleExpertHighScore", -3909313599368485249L);
        setLongField(term135439, term135439.getClass(), "sumBattleMasterHighScore", 4446032898787577008L);
        setLongField(term135439, term135439.getClass(), "sumBattleLunaticHighScore", -7029828769289238518L);
        setField(term135439, term135439.getClass(), "eventWatchedDate", "LgOnJRfkhr");
        setField(term135439, term135439.getClass(), "cmEventWatchedDate", "ZmarCjgmcB");
        setField(term135439, term135439.getClass(), "firstGameId", "zxUAROPAUu");
        setField(term135439, term135439.getClass(), "firstRomVersion", "AkiPuZHqLZ");
        setField(term135439, term135439.getClass(), "firstDataVersion", "TtnjCbAnFU");
        setField(term135439, term135439.getClass(), "firstPlayDate", "SDOcDCgFQu");
        setField(term135439, term135439.getClass(), "lastGameId", "EcAlwSDsSg");
        setField(term135439, term135439.getClass(), "lastRomVersion", "GTUBaGksNm");
        setField(term135439, term135439.getClass(), "lastDataVersion", "ToitdBqCUa");
        setField(term135439, term135439.getClass(), "compatibleCmVersion", "hQkaYinNHN");
        setField(term135439, term135439.getClass(), "lastPlayDate", "tinrcZBfby");
        setIntField(term135439, term135439.getClass(), "lastPlaceId", -19497212);
        setField(term135439, term135439.getClass(), "lastPlaceName", "fHZvVFVpCX");
        setIntField(term135439, term135439.getClass(), "lastRegionId", 1768312184);
        setField(term135439, term135439.getClass(), "lastRegionName", "laRdIPzkwz");
        setIntField(term135439, term135439.getClass(), "lastAllNetId", -1540801809);
        setField(term135439, term135439.getClass(), "lastClientId", "siIcTJzSGr");
        setIntField(term135439, term135439.getClass(), "lastUsedDeckId", -1968650604);
        setIntField(term135439, term135439.getClass(), "lastPlayMusicLevel", -1080069977);
        setIntField(term135439, term135439.getClass(), "lastEmoneyBrand", -581052818);
        setField(term135437, term135437.getClass(), "user", term135439);
        setIntField(term135437, term135437.getClass(), "musicId", -1783757760);
        setIntField(term135437, term135437.getClass(), "damage", 1252467087);
        setBooleanField(term135437, term135437.getClass(), "isClear", true);
        setIntField(term135437, term135437.getClass(), "eventId", 1051291530);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDamage", argTypes, term135437, args);
    }

};


