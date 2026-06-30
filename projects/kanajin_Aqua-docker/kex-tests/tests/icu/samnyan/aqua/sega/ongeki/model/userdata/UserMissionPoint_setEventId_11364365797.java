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

public class UserMissionPoint_setEventId_11364365797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9878;
     Object term10145;

    public UserMissionPoint_setEventId_11364365797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9884 = new Long(-4365849114644724155L);
        term9878 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMissionPoint"));
        Object term9880 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term9882 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term9898 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9899 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9903 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9908 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9909 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9913 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term9878, term9878.getClass(), "id", 753095050088595263L);
        setLongField(term9880, term9880.getClass(), "id", 3643973882575578879L);
        setLongField(term9882, term9882.getClass(), "id", -1750555031444556464L);
        setField(term9882, term9882.getClass(), "extId", term9884);
        setField(term9882, term9882.getClass(), "luid", "RSaoipUlsg");
        setIntField(term9899, term9899.getClass(), "year", 2027);
        setShortField(term9899, term9899.getClass(), "month", (short) 8);
        setShortField(term9899, term9899.getClass(), "day", (short) 23);
        setField(term9898, term9898.getClass(), "date", term9899);
        setByteField(term9903, term9903.getClass(), "hour", (byte) 15);
        setByteField(term9903, term9903.getClass(), "minute", (byte) 12);
        setByteField(term9903, term9903.getClass(), "second", (byte) 6);
        setIntField(term9903, term9903.getClass(), "nano", 541218258);
        setField(term9898, term9898.getClass(), "time", term9903);
        setField(term9882, term9882.getClass(), "registerTime", term9898);
        setIntField(term9909, term9909.getClass(), "year", 2013);
        setShortField(term9909, term9909.getClass(), "month", (short) 5);
        setShortField(term9909, term9909.getClass(), "day", (short) 26);
        setField(term9908, term9908.getClass(), "date", term9909);
        setByteField(term9913, term9913.getClass(), "hour", (byte) 4);
        setByteField(term9913, term9913.getClass(), "minute", (byte) 39);
        setByteField(term9913, term9913.getClass(), "second", (byte) 5);
        setIntField(term9913, term9913.getClass(), "nano", 392869354);
        setField(term9908, term9908.getClass(), "time", term9913);
        setField(term9882, term9882.getClass(), "accessTime", term9908);
        setField(term9880, term9880.getClass(), "card", term9882);
        setField(term9880, term9880.getClass(), "userName", "cSHGbqKqlN");
        setIntField(term9880, term9880.getClass(), "level", -466708718);
        setIntField(term9880, term9880.getClass(), "reincarnationNum", 1038029515);
        setLongField(term9880, term9880.getClass(), "exp", -3231440836116263235L);
        setLongField(term9880, term9880.getClass(), "point", 8010417010297313651L);
        setLongField(term9880, term9880.getClass(), "totalPoint", 5845993504299821981L);
        setIntField(term9880, term9880.getClass(), "playCount", 1137154606);
        setIntField(term9880, term9880.getClass(), "jewelCount", -100681578);
        setIntField(term9880, term9880.getClass(), "totalJewelCount", 296568835);
        setIntField(term9880, term9880.getClass(), "medalCount", 1431951992);
        setIntField(term9880, term9880.getClass(), "playerRating", -1608123016);
        setIntField(term9880, term9880.getClass(), "highestRating", -896473214);
        setIntField(term9880, term9880.getClass(), "battlePoint", 401203924);
        setIntField(term9880, term9880.getClass(), "bestBattlePoint", -1212399479);
        setIntField(term9880, term9880.getClass(), "overDamageBattlePoint", 2107679041);
        setBooleanField(term9880, term9880.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term9880, term9880.getClass(), "nameplateId", 2040965507);
        setIntField(term9880, term9880.getClass(), "trophyId", -1281083262);
        setIntField(term9880, term9880.getClass(), "cardId", 1059930704);
        setIntField(term9880, term9880.getClass(), "characterId", -1967153290);
        setIntField(term9880, term9880.getClass(), "characterVoiceNo", -1397251956);
        setIntField(term9880, term9880.getClass(), "tabSetting", -796934571);
        setIntField(term9880, term9880.getClass(), "tabSortSetting", 405295896);
        setIntField(term9880, term9880.getClass(), "cardCategorySetting", -814977075);
        setIntField(term9880, term9880.getClass(), "cardSortSetting", 808614267);
        setIntField(term9880, term9880.getClass(), "rivalScoreCategorySetting", 1611734632);
        setIntField(term9880, term9880.getClass(), "playedTutorialBit", 868908117);
        setIntField(term9880, term9880.getClass(), "firstTutorialCancelNum", 1789351397);
        setLongField(term9880, term9880.getClass(), "sumTechHighScore", -1528017371096319990L);
        setLongField(term9880, term9880.getClass(), "sumTechBasicHighScore", -1526328443223793465L);
        setLongField(term9880, term9880.getClass(), "sumTechAdvancedHighScore", -412186147449928821L);
        setLongField(term9880, term9880.getClass(), "sumTechExpertHighScore", -1449569009562240465L);
        setLongField(term9880, term9880.getClass(), "sumTechMasterHighScore", 2287449183416662404L);
        setLongField(term9880, term9880.getClass(), "sumTechLunaticHighScore", -1223573843683081410L);
        setLongField(term9880, term9880.getClass(), "sumBattleHighScore", 3453457027014743006L);
        setLongField(term9880, term9880.getClass(), "sumBattleBasicHighScore", 3931473624300151730L);
        setLongField(term9880, term9880.getClass(), "sumBattleAdvancedHighScore", 661905373566913125L);
        setLongField(term9880, term9880.getClass(), "sumBattleExpertHighScore", -3753621038448351550L);
        setLongField(term9880, term9880.getClass(), "sumBattleMasterHighScore", 5304481534735378567L);
        setLongField(term9880, term9880.getClass(), "sumBattleLunaticHighScore", 3423155413133381764L);
        setField(term9880, term9880.getClass(), "eventWatchedDate", "pFAfANnxup");
        setField(term9880, term9880.getClass(), "cmEventWatchedDate", "FbSIUZyBXZ");
        setField(term9880, term9880.getClass(), "firstGameId", "mhQDwIyrRi");
        setField(term9880, term9880.getClass(), "firstRomVersion", "HpZXWDPhlg");
        setField(term9880, term9880.getClass(), "firstDataVersion", "lBOokzEPfe");
        setField(term9880, term9880.getClass(), "firstPlayDate", "dtGZCsKXbW");
        setField(term9880, term9880.getClass(), "lastGameId", "bdyhHbDAmJ");
        setField(term9880, term9880.getClass(), "lastRomVersion", "BBXiTNHqGE");
        setField(term9880, term9880.getClass(), "lastDataVersion", "IEYhJmgCVd");
        setField(term9880, term9880.getClass(), "compatibleCmVersion", "KSJeYkkvpk");
        setField(term9880, term9880.getClass(), "lastPlayDate", "qUtkFGMNUV");
        setIntField(term9880, term9880.getClass(), "lastPlaceId", 2145528170);
        setField(term9880, term9880.getClass(), "lastPlaceName", "mGRiYhnMcR");
        setIntField(term9880, term9880.getClass(), "lastRegionId", -585773976);
        setField(term9880, term9880.getClass(), "lastRegionName", "NFlvfJCVPO");
        setIntField(term9880, term9880.getClass(), "lastAllNetId", 852806940);
        setField(term9880, term9880.getClass(), "lastClientId", "KarbTXFmUU");
        setIntField(term9880, term9880.getClass(), "lastUsedDeckId", 698551724);
        setIntField(term9880, term9880.getClass(), "lastPlayMusicLevel", -1631048635);
        setIntField(term9880, term9880.getClass(), "lastEmoneyBrand", 1342808731);
        setField(term9878, term9878.getClass(), "user", term9880);
        setIntField(term9878, term9878.getClass(), "eventId", -64893740);
        setLongField(term9878, term9878.getClass(), "point", 7711054832353934171L);
        term10145 = new Integer(-222012928);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMissionPoint");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term10145;
        callMethod(klass, "setEventId", argTypes, term9878, args);
    }

};


