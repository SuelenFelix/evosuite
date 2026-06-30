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
import java.lang.Boolean;

public class UserCard_setAcquired_192782657432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129260;
     Object term129605;

    public UserCard_setAcquired_192782657432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term129266 = new Long(-2951854704066477061L);
        term129260 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term129262 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term129264 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term129280 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term129281 = newInstance(Class.forName("java.time.LocalDate"));
        Object term129285 = newInstance(Class.forName("java.time.LocalTime"));
        Object term129290 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term129291 = newInstance(Class.forName("java.time.LocalDate"));
        Object term129295 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term129260, term129260.getClass(), "id", 3445861884516336038L);
        setLongField(term129262, term129262.getClass(), "id", -938134894793146194L);
        setLongField(term129264, term129264.getClass(), "id", 2007936066544679164L);
        setField(term129264, term129264.getClass(), "extId", term129266);
        setField(term129264, term129264.getClass(), "luid", "bVteGrLeFP");
        setIntField(term129281, term129281.getClass(), "year", 2014);
        setShortField(term129281, term129281.getClass(), "month", (short) 11);
        setShortField(term129281, term129281.getClass(), "day", (short) 16);
        setField(term129280, term129280.getClass(), "date", term129281);
        setByteField(term129285, term129285.getClass(), "hour", (byte) 22);
        setByteField(term129285, term129285.getClass(), "minute", (byte) 31);
        setByteField(term129285, term129285.getClass(), "second", (byte) 12);
        setIntField(term129285, term129285.getClass(), "nano", 196022579);
        setField(term129280, term129280.getClass(), "time", term129285);
        setField(term129264, term129264.getClass(), "registerTime", term129280);
        setIntField(term129291, term129291.getClass(), "year", 2020);
        setShortField(term129291, term129291.getClass(), "month", (short) 4);
        setShortField(term129291, term129291.getClass(), "day", (short) 19);
        setField(term129290, term129290.getClass(), "date", term129291);
        setByteField(term129295, term129295.getClass(), "hour", (byte) 5);
        setByteField(term129295, term129295.getClass(), "minute", (byte) 30);
        setByteField(term129295, term129295.getClass(), "second", (byte) 22);
        setIntField(term129295, term129295.getClass(), "nano", 839145960);
        setField(term129290, term129290.getClass(), "time", term129295);
        setField(term129264, term129264.getClass(), "accessTime", term129290);
        setField(term129262, term129262.getClass(), "card", term129264);
        setField(term129262, term129262.getClass(), "userName", "LLVxzGZuym");
        setIntField(term129262, term129262.getClass(), "level", -443857266);
        setIntField(term129262, term129262.getClass(), "reincarnationNum", 1150039325);
        setLongField(term129262, term129262.getClass(), "exp", 3671817215522111739L);
        setLongField(term129262, term129262.getClass(), "point", 3211232758845041975L);
        setLongField(term129262, term129262.getClass(), "totalPoint", -8892713195625510832L);
        setIntField(term129262, term129262.getClass(), "playCount", 1805122380);
        setIntField(term129262, term129262.getClass(), "jewelCount", -1062988764);
        setIntField(term129262, term129262.getClass(), "totalJewelCount", 2034417479);
        setIntField(term129262, term129262.getClass(), "medalCount", 1064150907);
        setIntField(term129262, term129262.getClass(), "playerRating", -1331960420);
        setIntField(term129262, term129262.getClass(), "highestRating", -1210634724);
        setIntField(term129262, term129262.getClass(), "battlePoint", -508178169);
        setIntField(term129262, term129262.getClass(), "bestBattlePoint", -2091925472);
        setIntField(term129262, term129262.getClass(), "overDamageBattlePoint", 1232275249);
        setBooleanField(term129262, term129262.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term129262, term129262.getClass(), "nameplateId", 1267736108);
        setIntField(term129262, term129262.getClass(), "trophyId", 1090073448);
        setIntField(term129262, term129262.getClass(), "cardId", 1691233507);
        setIntField(term129262, term129262.getClass(), "characterId", 1543785405);
        setIntField(term129262, term129262.getClass(), "characterVoiceNo", -20379967);
        setIntField(term129262, term129262.getClass(), "tabSetting", 1331697372);
        setIntField(term129262, term129262.getClass(), "tabSortSetting", 636147978);
        setIntField(term129262, term129262.getClass(), "cardCategorySetting", -154767845);
        setIntField(term129262, term129262.getClass(), "cardSortSetting", 296334503);
        setIntField(term129262, term129262.getClass(), "rivalScoreCategorySetting", -1521936744);
        setIntField(term129262, term129262.getClass(), "playedTutorialBit", 681716275);
        setIntField(term129262, term129262.getClass(), "firstTutorialCancelNum", -1564295844);
        setLongField(term129262, term129262.getClass(), "sumTechHighScore", 8497912220711706360L);
        setLongField(term129262, term129262.getClass(), "sumTechBasicHighScore", 4270385181158448553L);
        setLongField(term129262, term129262.getClass(), "sumTechAdvancedHighScore", -8693342945204725276L);
        setLongField(term129262, term129262.getClass(), "sumTechExpertHighScore", 6570963238855669571L);
        setLongField(term129262, term129262.getClass(), "sumTechMasterHighScore", 5258460840966764711L);
        setLongField(term129262, term129262.getClass(), "sumTechLunaticHighScore", -2806415044131207106L);
        setLongField(term129262, term129262.getClass(), "sumBattleHighScore", 5478888865453499708L);
        setLongField(term129262, term129262.getClass(), "sumBattleBasicHighScore", -6226354764002589571L);
        setLongField(term129262, term129262.getClass(), "sumBattleAdvancedHighScore", 7972658116535621994L);
        setLongField(term129262, term129262.getClass(), "sumBattleExpertHighScore", -5829447391094636848L);
        setLongField(term129262, term129262.getClass(), "sumBattleMasterHighScore", -2375986822580182127L);
        setLongField(term129262, term129262.getClass(), "sumBattleLunaticHighScore", -7291341146124729003L);
        setField(term129262, term129262.getClass(), "eventWatchedDate", "FHWZKmPKlK");
        setField(term129262, term129262.getClass(), "cmEventWatchedDate", "MqWvZIWxCr");
        setField(term129262, term129262.getClass(), "firstGameId", "iiMXpaWLIH");
        setField(term129262, term129262.getClass(), "firstRomVersion", "MqMDTdIpYR");
        setField(term129262, term129262.getClass(), "firstDataVersion", "uuwidsQbSs");
        setField(term129262, term129262.getClass(), "firstPlayDate", "rXLmNRoJfU");
        setField(term129262, term129262.getClass(), "lastGameId", "dWaVZloZWE");
        setField(term129262, term129262.getClass(), "lastRomVersion", "vgZFgEliKc");
        setField(term129262, term129262.getClass(), "lastDataVersion", "cwNMyoCqHJ");
        setField(term129262, term129262.getClass(), "compatibleCmVersion", "PzUYNYWLsN");
        setField(term129262, term129262.getClass(), "lastPlayDate", "rGvXtIHjBI");
        setIntField(term129262, term129262.getClass(), "lastPlaceId", 808812678);
        setField(term129262, term129262.getClass(), "lastPlaceName", "PKJkUkzual");
        setIntField(term129262, term129262.getClass(), "lastRegionId", -1317808688);
        setField(term129262, term129262.getClass(), "lastRegionName", "WYcqisofgT");
        setIntField(term129262, term129262.getClass(), "lastAllNetId", -1064589449);
        setField(term129262, term129262.getClass(), "lastClientId", "vVYrwXQCzi");
        setIntField(term129262, term129262.getClass(), "lastUsedDeckId", 1213636383);
        setIntField(term129262, term129262.getClass(), "lastPlayMusicLevel", -1321778001);
        setIntField(term129262, term129262.getClass(), "lastEmoneyBrand", 183942181);
        setField(term129260, term129260.getClass(), "user", term129262);
        setIntField(term129260, term129260.getClass(), "cardId", -1);
        setIntField(term129260, term129260.getClass(), "digitalStock", 1);
        setIntField(term129260, term129260.getClass(), "analogStock", 851144395);
        setIntField(term129260, term129260.getClass(), "level", -1579523291);
        setIntField(term129260, term129260.getClass(), "maxLevel", 10);
        setIntField(term129260, term129260.getClass(), "exp", -1378850024);
        setIntField(term129260, term129260.getClass(), "printCount", 1668253019);
        setIntField(term129260, term129260.getClass(), "useCount", 125508778);
        setBooleanField(term129260, term129260.getClass(), "isNew", true);
        setField(term129260, term129260.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term129260, term129260.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term129260, term129260.getClass(), "skillId", -358007773);
        setBooleanField(term129260, term129260.getClass(), "isAcquired", true);
        setField(term129260, term129260.getClass(), "created", "0000-00-00 00:00:00.0");
        term129605 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term129605;
        callMethod(klass, "setAcquired", argTypes, term129260, args);
    }

};


