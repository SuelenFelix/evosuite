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

public class UserData_getFirstTutorialCancelNum_87716233829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34185;

    public UserData_getFirstTutorialCancelNum_87716233829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term34189 = new Long(7862575738391801707L);
        term34185 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term34187 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term34203 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term34204 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34208 = newInstance(Class.forName("java.time.LocalTime"));
        Object term34213 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term34214 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34218 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term34185, term34185.getClass(), "id", 2577903134840885266L);
        setLongField(term34187, term34187.getClass(), "id", -4179615237632495585L);
        setField(term34187, term34187.getClass(), "extId", term34189);
        setField(term34187, term34187.getClass(), "luid", "wboNBMhRjP");
        setIntField(term34204, term34204.getClass(), "year", 2020);
        setShortField(term34204, term34204.getClass(), "month", (short) 5);
        setShortField(term34204, term34204.getClass(), "day", (short) 12);
        setField(term34203, term34203.getClass(), "date", term34204);
        setByteField(term34208, term34208.getClass(), "hour", (byte) 22);
        setByteField(term34208, term34208.getClass(), "minute", (byte) 7);
        setByteField(term34208, term34208.getClass(), "second", (byte) 49);
        setIntField(term34208, term34208.getClass(), "nano", 677355362);
        setField(term34203, term34203.getClass(), "time", term34208);
        setField(term34187, term34187.getClass(), "registerTime", term34203);
        setIntField(term34214, term34214.getClass(), "year", 2010);
        setShortField(term34214, term34214.getClass(), "month", (short) 11);
        setShortField(term34214, term34214.getClass(), "day", (short) 1);
        setField(term34213, term34213.getClass(), "date", term34214);
        setByteField(term34218, term34218.getClass(), "hour", (byte) 5);
        setByteField(term34218, term34218.getClass(), "minute", (byte) 32);
        setByteField(term34218, term34218.getClass(), "second", (byte) 8);
        setIntField(term34218, term34218.getClass(), "nano", 918832231);
        setField(term34213, term34213.getClass(), "time", term34218);
        setField(term34187, term34187.getClass(), "accessTime", term34213);
        setField(term34185, term34185.getClass(), "card", term34187);
        setField(term34185, term34185.getClass(), "userName", "HZODpafOGe");
        setIntField(term34185, term34185.getClass(), "level", 1986699236);
        setIntField(term34185, term34185.getClass(), "reincarnationNum", -1729178560);
        setLongField(term34185, term34185.getClass(), "exp", -2071004435163577830L);
        setLongField(term34185, term34185.getClass(), "point", 4083439166031950748L);
        setLongField(term34185, term34185.getClass(), "totalPoint", 4354307959269121855L);
        setIntField(term34185, term34185.getClass(), "playCount", 874974171);
        setIntField(term34185, term34185.getClass(), "jewelCount", -1689017763);
        setIntField(term34185, term34185.getClass(), "totalJewelCount", 1657387281);
        setIntField(term34185, term34185.getClass(), "medalCount", 1276651382);
        setIntField(term34185, term34185.getClass(), "playerRating", 266716659);
        setIntField(term34185, term34185.getClass(), "highestRating", 1249390809);
        setIntField(term34185, term34185.getClass(), "battlePoint", -1069437097);
        setIntField(term34185, term34185.getClass(), "bestBattlePoint", 215016257);
        setIntField(term34185, term34185.getClass(), "overDamageBattlePoint", -1967315273);
        setBooleanField(term34185, term34185.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term34185, term34185.getClass(), "nameplateId", -1848110874);
        setIntField(term34185, term34185.getClass(), "trophyId", -1988070462);
        setIntField(term34185, term34185.getClass(), "cardId", 323423569);
        setIntField(term34185, term34185.getClass(), "characterId", -274269573);
        setIntField(term34185, term34185.getClass(), "characterVoiceNo", 1395520168);
        setIntField(term34185, term34185.getClass(), "tabSetting", -524708742);
        setIntField(term34185, term34185.getClass(), "tabSortSetting", -349448118);
        setIntField(term34185, term34185.getClass(), "cardCategorySetting", 1938137872);
        setIntField(term34185, term34185.getClass(), "cardSortSetting", 1767604467);
        setIntField(term34185, term34185.getClass(), "rivalScoreCategorySetting", 1997859160);
        setIntField(term34185, term34185.getClass(), "playedTutorialBit", 1565529799);
        setIntField(term34185, term34185.getClass(), "firstTutorialCancelNum", -1144608643);
        setLongField(term34185, term34185.getClass(), "sumTechHighScore", -4627619845164555164L);
        setLongField(term34185, term34185.getClass(), "sumTechBasicHighScore", 3702843766990151556L);
        setLongField(term34185, term34185.getClass(), "sumTechAdvancedHighScore", 8588047499427599529L);
        setLongField(term34185, term34185.getClass(), "sumTechExpertHighScore", 6126964308136745488L);
        setLongField(term34185, term34185.getClass(), "sumTechMasterHighScore", -8307140005890062599L);
        setLongField(term34185, term34185.getClass(), "sumTechLunaticHighScore", 195324792518519601L);
        setLongField(term34185, term34185.getClass(), "sumBattleHighScore", 8741861751389973987L);
        setLongField(term34185, term34185.getClass(), "sumBattleBasicHighScore", -6267867662540638557L);
        setLongField(term34185, term34185.getClass(), "sumBattleAdvancedHighScore", 7789239238809338335L);
        setLongField(term34185, term34185.getClass(), "sumBattleExpertHighScore", 7148416754314775058L);
        setLongField(term34185, term34185.getClass(), "sumBattleMasterHighScore", -5511482978305240721L);
        setLongField(term34185, term34185.getClass(), "sumBattleLunaticHighScore", 7004919285972689886L);
        setField(term34185, term34185.getClass(), "eventWatchedDate", "dUTYEKtTfQ");
        setField(term34185, term34185.getClass(), "cmEventWatchedDate", "HUtbHklGel");
        setField(term34185, term34185.getClass(), "firstGameId", "QbfKDAwhSB");
        setField(term34185, term34185.getClass(), "firstRomVersion", "ckTRHEIcCK");
        setField(term34185, term34185.getClass(), "firstDataVersion", "NYSBqIpNlD");
        setField(term34185, term34185.getClass(), "firstPlayDate", "OWglDUWQYb");
        setField(term34185, term34185.getClass(), "lastGameId", "FiqETbKjpv");
        setField(term34185, term34185.getClass(), "lastRomVersion", "FxXtdhhXyS");
        setField(term34185, term34185.getClass(), "lastDataVersion", "HxCEzaCcgj");
        setField(term34185, term34185.getClass(), "compatibleCmVersion", "PDYPOQncAB");
        setField(term34185, term34185.getClass(), "lastPlayDate", "cHqLMqZSmc");
        setIntField(term34185, term34185.getClass(), "lastPlaceId", -2020428308);
        setField(term34185, term34185.getClass(), "lastPlaceName", "hkWmAkXSOW");
        setIntField(term34185, term34185.getClass(), "lastRegionId", -226298436);
        setField(term34185, term34185.getClass(), "lastRegionName", "DwQmZEKeOp");
        setIntField(term34185, term34185.getClass(), "lastAllNetId", -1570350431);
        setField(term34185, term34185.getClass(), "lastClientId", "DbxrFiyttv");
        setIntField(term34185, term34185.getClass(), "lastUsedDeckId", -1378803474);
        setIntField(term34185, term34185.getClass(), "lastPlayMusicLevel", 699225584);
        setIntField(term34185, term34185.getClass(), "lastEmoneyBrand", -577432675);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstTutorialCancelNum", argTypes, term34185, args);
    }

};


