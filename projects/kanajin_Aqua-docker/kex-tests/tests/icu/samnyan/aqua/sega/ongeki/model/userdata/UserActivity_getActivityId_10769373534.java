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

public class UserActivity_getActivityId_10769373534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284450;

    public UserActivity_getActivityId_10769373534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term284456 = new Long(-8842842172497711872L);
        term284450 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity"));
        Object term284452 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term284454 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term284470 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term284471 = newInstance(Class.forName("java.time.LocalDate"));
        Object term284475 = newInstance(Class.forName("java.time.LocalTime"));
        Object term284480 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term284481 = newInstance(Class.forName("java.time.LocalDate"));
        Object term284485 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term284450, term284450.getClass(), "id", 1066737117441544708L);
        setLongField(term284452, term284452.getClass(), "id", 2238268282297189041L);
        setLongField(term284454, term284454.getClass(), "id", -4578670116508481067L);
        setField(term284454, term284454.getClass(), "extId", term284456);
        setField(term284454, term284454.getClass(), "luid", "iclAYiudke");
        setIntField(term284471, term284471.getClass(), "year", 2027);
        setShortField(term284471, term284471.getClass(), "month", (short) 11);
        setShortField(term284471, term284471.getClass(), "day", (short) 16);
        setField(term284470, term284470.getClass(), "date", term284471);
        setByteField(term284475, term284475.getClass(), "hour", (byte) 7);
        setByteField(term284475, term284475.getClass(), "minute", (byte) 0);
        setByteField(term284475, term284475.getClass(), "second", (byte) 56);
        setIntField(term284475, term284475.getClass(), "nano", 854986675);
        setField(term284470, term284470.getClass(), "time", term284475);
        setField(term284454, term284454.getClass(), "registerTime", term284470);
        setIntField(term284481, term284481.getClass(), "year", 2010);
        setShortField(term284481, term284481.getClass(), "month", (short) 9);
        setShortField(term284481, term284481.getClass(), "day", (short) 9);
        setField(term284480, term284480.getClass(), "date", term284481);
        setByteField(term284485, term284485.getClass(), "hour", (byte) 7);
        setByteField(term284485, term284485.getClass(), "minute", (byte) 55);
        setByteField(term284485, term284485.getClass(), "second", (byte) 11);
        setIntField(term284485, term284485.getClass(), "nano", 495713585);
        setField(term284480, term284480.getClass(), "time", term284485);
        setField(term284454, term284454.getClass(), "accessTime", term284480);
        setField(term284452, term284452.getClass(), "card", term284454);
        setField(term284452, term284452.getClass(), "userName", "cCwSyZEBIb");
        setIntField(term284452, term284452.getClass(), "level", -429147788);
        setIntField(term284452, term284452.getClass(), "reincarnationNum", 959884950);
        setLongField(term284452, term284452.getClass(), "exp", -7631124610761830859L);
        setLongField(term284452, term284452.getClass(), "point", 2340421496458947939L);
        setLongField(term284452, term284452.getClass(), "totalPoint", 2445779374018564358L);
        setIntField(term284452, term284452.getClass(), "playCount", 1669987326);
        setIntField(term284452, term284452.getClass(), "jewelCount", -528961043);
        setIntField(term284452, term284452.getClass(), "totalJewelCount", -1221068398);
        setIntField(term284452, term284452.getClass(), "medalCount", -1431603634);
        setIntField(term284452, term284452.getClass(), "playerRating", -2145618978);
        setIntField(term284452, term284452.getClass(), "highestRating", -2072742962);
        setIntField(term284452, term284452.getClass(), "battlePoint", 1926004382);
        setIntField(term284452, term284452.getClass(), "bestBattlePoint", 162454064);
        setIntField(term284452, term284452.getClass(), "overDamageBattlePoint", 935531911);
        setBooleanField(term284452, term284452.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term284452, term284452.getClass(), "nameplateId", 1832818618);
        setIntField(term284452, term284452.getClass(), "trophyId", -85694964);
        setIntField(term284452, term284452.getClass(), "cardId", 1708019769);
        setIntField(term284452, term284452.getClass(), "characterId", -1917518407);
        setIntField(term284452, term284452.getClass(), "characterVoiceNo", -1540625466);
        setIntField(term284452, term284452.getClass(), "tabSetting", 1722245644);
        setIntField(term284452, term284452.getClass(), "tabSortSetting", -1199651827);
        setIntField(term284452, term284452.getClass(), "cardCategorySetting", -803625753);
        setIntField(term284452, term284452.getClass(), "cardSortSetting", -456062941);
        setIntField(term284452, term284452.getClass(), "rivalScoreCategorySetting", 1992286479);
        setIntField(term284452, term284452.getClass(), "playedTutorialBit", 532415022);
        setIntField(term284452, term284452.getClass(), "firstTutorialCancelNum", -1272300450);
        setLongField(term284452, term284452.getClass(), "sumTechHighScore", 1322156902752228145L);
        setLongField(term284452, term284452.getClass(), "sumTechBasicHighScore", -2703564476767923171L);
        setLongField(term284452, term284452.getClass(), "sumTechAdvancedHighScore", 278483305568415218L);
        setLongField(term284452, term284452.getClass(), "sumTechExpertHighScore", 5226156429830334352L);
        setLongField(term284452, term284452.getClass(), "sumTechMasterHighScore", -3588378576060992143L);
        setLongField(term284452, term284452.getClass(), "sumTechLunaticHighScore", 348202828423663639L);
        setLongField(term284452, term284452.getClass(), "sumBattleHighScore", 7613084285467949488L);
        setLongField(term284452, term284452.getClass(), "sumBattleBasicHighScore", -976417248031291188L);
        setLongField(term284452, term284452.getClass(), "sumBattleAdvancedHighScore", 290564592448930900L);
        setLongField(term284452, term284452.getClass(), "sumBattleExpertHighScore", 2440173356213771569L);
        setLongField(term284452, term284452.getClass(), "sumBattleMasterHighScore", 5831632079147101247L);
        setLongField(term284452, term284452.getClass(), "sumBattleLunaticHighScore", 4996440843210448759L);
        setField(term284452, term284452.getClass(), "eventWatchedDate", "AtXchNEfAh");
        setField(term284452, term284452.getClass(), "cmEventWatchedDate", "OfUGaofOyl");
        setField(term284452, term284452.getClass(), "firstGameId", "hmqmJaPVoG");
        setField(term284452, term284452.getClass(), "firstRomVersion", "pNTxRrBYYn");
        setField(term284452, term284452.getClass(), "firstDataVersion", "EavfKjgzgQ");
        setField(term284452, term284452.getClass(), "firstPlayDate", "efyImakJaR");
        setField(term284452, term284452.getClass(), "lastGameId", "eryxzqFfFf");
        setField(term284452, term284452.getClass(), "lastRomVersion", "aAFUdZslxJ");
        setField(term284452, term284452.getClass(), "lastDataVersion", "gMrywiVyIr");
        setField(term284452, term284452.getClass(), "compatibleCmVersion", "iyZjIacLsw");
        setField(term284452, term284452.getClass(), "lastPlayDate", "vYkgboKVHZ");
        setIntField(term284452, term284452.getClass(), "lastPlaceId", -1508552849);
        setField(term284452, term284452.getClass(), "lastPlaceName", "IaGDRvnqIb");
        setIntField(term284452, term284452.getClass(), "lastRegionId", -1439848054);
        setField(term284452, term284452.getClass(), "lastRegionName", "yBxHnUtIkQ");
        setIntField(term284452, term284452.getClass(), "lastAllNetId", -2074664341);
        setField(term284452, term284452.getClass(), "lastClientId", "qzQdYSDBmc");
        setIntField(term284452, term284452.getClass(), "lastUsedDeckId", 1411987884);
        setIntField(term284452, term284452.getClass(), "lastPlayMusicLevel", -603643833);
        setIntField(term284452, term284452.getClass(), "lastEmoneyBrand", -1447039495);
        setField(term284450, term284450.getClass(), "user", term284452);
        setIntField(term284450, term284450.getClass(), "kind", -157506155);
        setIntField(term284450, term284450.getClass(), "activityId", 1522316351);
        setIntField(term284450, term284450.getClass(), "sortNumber", 681380896);
        setIntField(term284450, term284450.getClass(), "param1", 89005350);
        setIntField(term284450, term284450.getClass(), "param2", 1095907961);
        setIntField(term284450, term284450.getClass(), "param3", -1059161781);
        setIntField(term284450, term284450.getClass(), "param4", 2064721751);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getActivityId", argTypes, term284450, args);
    }

};


