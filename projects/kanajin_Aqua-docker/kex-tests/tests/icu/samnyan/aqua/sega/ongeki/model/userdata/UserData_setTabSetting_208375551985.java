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

public class UserData_setTabSetting_208375551985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57983;
     Object term58246;

    public UserData_setTabSetting_208375551985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term57987 = new Long(855932984568615096L);
        term57983 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term57985 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term58001 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58002 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58006 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58011 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58012 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58016 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term57983, term57983.getClass(), "id", -3970755845974448262L);
        setLongField(term57985, term57985.getClass(), "id", -4656203828034599503L);
        setField(term57985, term57985.getClass(), "extId", term57987);
        setField(term57985, term57985.getClass(), "luid", "tcaaotqgDF");
        setIntField(term58002, term58002.getClass(), "year", 2015);
        setShortField(term58002, term58002.getClass(), "month", (short) 4);
        setShortField(term58002, term58002.getClass(), "day", (short) 22);
        setField(term58001, term58001.getClass(), "date", term58002);
        setByteField(term58006, term58006.getClass(), "hour", (byte) 15);
        setByteField(term58006, term58006.getClass(), "minute", (byte) 23);
        setByteField(term58006, term58006.getClass(), "second", (byte) 42);
        setIntField(term58006, term58006.getClass(), "nano", 822658620);
        setField(term58001, term58001.getClass(), "time", term58006);
        setField(term57985, term57985.getClass(), "registerTime", term58001);
        setIntField(term58012, term58012.getClass(), "year", 2020);
        setShortField(term58012, term58012.getClass(), "month", (short) 4);
        setShortField(term58012, term58012.getClass(), "day", (short) 27);
        setField(term58011, term58011.getClass(), "date", term58012);
        setByteField(term58016, term58016.getClass(), "hour", (byte) 16);
        setByteField(term58016, term58016.getClass(), "minute", (byte) 48);
        setByteField(term58016, term58016.getClass(), "second", (byte) 39);
        setIntField(term58016, term58016.getClass(), "nano", 250909266);
        setField(term58011, term58011.getClass(), "time", term58016);
        setField(term57985, term57985.getClass(), "accessTime", term58011);
        setField(term57983, term57983.getClass(), "card", term57985);
        setField(term57983, term57983.getClass(), "userName", "bXInWdOeyi");
        setIntField(term57983, term57983.getClass(), "level", 1701720681);
        setIntField(term57983, term57983.getClass(), "reincarnationNum", -378738380);
        setLongField(term57983, term57983.getClass(), "exp", 3237415194577624898L);
        setLongField(term57983, term57983.getClass(), "point", -872408877635399846L);
        setLongField(term57983, term57983.getClass(), "totalPoint", -6901566663896579785L);
        setIntField(term57983, term57983.getClass(), "playCount", 1984720770);
        setIntField(term57983, term57983.getClass(), "jewelCount", -8765616);
        setIntField(term57983, term57983.getClass(), "totalJewelCount", -1365627412);
        setIntField(term57983, term57983.getClass(), "medalCount", 520625434);
        setIntField(term57983, term57983.getClass(), "playerRating", 1531056945);
        setIntField(term57983, term57983.getClass(), "highestRating", -2128361795);
        setIntField(term57983, term57983.getClass(), "battlePoint", 925239258);
        setIntField(term57983, term57983.getClass(), "bestBattlePoint", 1041156468);
        setIntField(term57983, term57983.getClass(), "overDamageBattlePoint", 825756233);
        setBooleanField(term57983, term57983.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term57983, term57983.getClass(), "nameplateId", -494349155);
        setIntField(term57983, term57983.getClass(), "trophyId", -621743880);
        setIntField(term57983, term57983.getClass(), "cardId", 1487958580);
        setIntField(term57983, term57983.getClass(), "characterId", -41377169);
        setIntField(term57983, term57983.getClass(), "characterVoiceNo", -1713407140);
        setIntField(term57983, term57983.getClass(), "tabSetting", 184591989);
        setIntField(term57983, term57983.getClass(), "tabSortSetting", 528505320);
        setIntField(term57983, term57983.getClass(), "cardCategorySetting", 1255256909);
        setIntField(term57983, term57983.getClass(), "cardSortSetting", 1364268540);
        setIntField(term57983, term57983.getClass(), "rivalScoreCategorySetting", 1613417207);
        setIntField(term57983, term57983.getClass(), "playedTutorialBit", -267884738);
        setIntField(term57983, term57983.getClass(), "firstTutorialCancelNum", 1701113802);
        setLongField(term57983, term57983.getClass(), "sumTechHighScore", 5118165509511383169L);
        setLongField(term57983, term57983.getClass(), "sumTechBasicHighScore", 8864542556121360562L);
        setLongField(term57983, term57983.getClass(), "sumTechAdvancedHighScore", 3559897534417114240L);
        setLongField(term57983, term57983.getClass(), "sumTechExpertHighScore", 3228901614122818656L);
        setLongField(term57983, term57983.getClass(), "sumTechMasterHighScore", 2202429793916533652L);
        setLongField(term57983, term57983.getClass(), "sumTechLunaticHighScore", -2912979631418915478L);
        setLongField(term57983, term57983.getClass(), "sumBattleHighScore", 3588543938790387865L);
        setLongField(term57983, term57983.getClass(), "sumBattleBasicHighScore", 514081142743495894L);
        setLongField(term57983, term57983.getClass(), "sumBattleAdvancedHighScore", 1933345968294866712L);
        setLongField(term57983, term57983.getClass(), "sumBattleExpertHighScore", 4286595441513061164L);
        setLongField(term57983, term57983.getClass(), "sumBattleMasterHighScore", -6076443966344923773L);
        setLongField(term57983, term57983.getClass(), "sumBattleLunaticHighScore", 8397128558586549852L);
        setField(term57983, term57983.getClass(), "eventWatchedDate", "HdwopulXkf");
        setField(term57983, term57983.getClass(), "cmEventWatchedDate", "FuCKfgAhpC");
        setField(term57983, term57983.getClass(), "firstGameId", "gqMysJhxfA");
        setField(term57983, term57983.getClass(), "firstRomVersion", "HtLEppUqzI");
        setField(term57983, term57983.getClass(), "firstDataVersion", "bVlRrMQeRY");
        setField(term57983, term57983.getClass(), "firstPlayDate", "SXaXhlzAIB");
        setField(term57983, term57983.getClass(), "lastGameId", "UPVTXSXUNh");
        setField(term57983, term57983.getClass(), "lastRomVersion", "cjCXbXuiFn");
        setField(term57983, term57983.getClass(), "lastDataVersion", "fhdhDeWdoi");
        setField(term57983, term57983.getClass(), "compatibleCmVersion", "FqrcltWSUd");
        setField(term57983, term57983.getClass(), "lastPlayDate", "kAbILlhsZw");
        setIntField(term57983, term57983.getClass(), "lastPlaceId", 2142343992);
        setField(term57983, term57983.getClass(), "lastPlaceName", "QsIOCSpRow");
        setIntField(term57983, term57983.getClass(), "lastRegionId", -875414289);
        setField(term57983, term57983.getClass(), "lastRegionName", "gcFzvYOUch");
        setIntField(term57983, term57983.getClass(), "lastAllNetId", 510025419);
        setField(term57983, term57983.getClass(), "lastClientId", "NnFSMXLOUA");
        setIntField(term57983, term57983.getClass(), "lastUsedDeckId", 768579195);
        setIntField(term57983, term57983.getClass(), "lastPlayMusicLevel", 935186156);
        setIntField(term57983, term57983.getClass(), "lastEmoneyBrand", -101515724);
        term58246 = new Integer(987526407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term58246;
        callMethod(klass, "setTabSetting", argTypes, term57983, args);
    }

};


