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

public class UserData_setSumTechHighScore_121671525392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60958;
     Object term61221;

    public UserData_setSumTechHighScore_121671525392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term60962 = new Long(-2924531382671518368L);
        term60958 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term60960 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term60976 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term60977 = newInstance(Class.forName("java.time.LocalDate"));
        Object term60981 = newInstance(Class.forName("java.time.LocalTime"));
        Object term60986 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term60987 = newInstance(Class.forName("java.time.LocalDate"));
        Object term60991 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term60958, term60958.getClass(), "id", 3453131310882907433L);
        setLongField(term60960, term60960.getClass(), "id", -7034989140356711250L);
        setField(term60960, term60960.getClass(), "extId", term60962);
        setField(term60960, term60960.getClass(), "luid", "XiAUBffMZP");
        setIntField(term60977, term60977.getClass(), "year", 2010);
        setShortField(term60977, term60977.getClass(), "month", (short) 11);
        setShortField(term60977, term60977.getClass(), "day", (short) 14);
        setField(term60976, term60976.getClass(), "date", term60977);
        setByteField(term60981, term60981.getClass(), "hour", (byte) 4);
        setByteField(term60981, term60981.getClass(), "minute", (byte) 49);
        setByteField(term60981, term60981.getClass(), "second", (byte) 50);
        setIntField(term60981, term60981.getClass(), "nano", 621399921);
        setField(term60976, term60976.getClass(), "time", term60981);
        setField(term60960, term60960.getClass(), "registerTime", term60976);
        setIntField(term60987, term60987.getClass(), "year", 2027);
        setShortField(term60987, term60987.getClass(), "month", (short) 1);
        setShortField(term60987, term60987.getClass(), "day", (short) 20);
        setField(term60986, term60986.getClass(), "date", term60987);
        setByteField(term60991, term60991.getClass(), "hour", (byte) 8);
        setByteField(term60991, term60991.getClass(), "minute", (byte) 5);
        setByteField(term60991, term60991.getClass(), "second", (byte) 44);
        setIntField(term60991, term60991.getClass(), "nano", 960768267);
        setField(term60986, term60986.getClass(), "time", term60991);
        setField(term60960, term60960.getClass(), "accessTime", term60986);
        setField(term60958, term60958.getClass(), "card", term60960);
        setField(term60958, term60958.getClass(), "userName", "pkfsHvqODq");
        setIntField(term60958, term60958.getClass(), "level", 661477727);
        setIntField(term60958, term60958.getClass(), "reincarnationNum", 274618169);
        setLongField(term60958, term60958.getClass(), "exp", 5366539798283785414L);
        setLongField(term60958, term60958.getClass(), "point", -5948221629490346744L);
        setLongField(term60958, term60958.getClass(), "totalPoint", 2627983048324581551L);
        setIntField(term60958, term60958.getClass(), "playCount", -1618606893);
        setIntField(term60958, term60958.getClass(), "jewelCount", -560211840);
        setIntField(term60958, term60958.getClass(), "totalJewelCount", 103542361);
        setIntField(term60958, term60958.getClass(), "medalCount", -1737221099);
        setIntField(term60958, term60958.getClass(), "playerRating", -1032313881);
        setIntField(term60958, term60958.getClass(), "highestRating", 1246554458);
        setIntField(term60958, term60958.getClass(), "battlePoint", -1913837862);
        setIntField(term60958, term60958.getClass(), "bestBattlePoint", -1428994415);
        setIntField(term60958, term60958.getClass(), "overDamageBattlePoint", -1086104799);
        setBooleanField(term60958, term60958.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term60958, term60958.getClass(), "nameplateId", 1670332444);
        setIntField(term60958, term60958.getClass(), "trophyId", -1903805864);
        setIntField(term60958, term60958.getClass(), "cardId", 751123733);
        setIntField(term60958, term60958.getClass(), "characterId", -2099677081);
        setIntField(term60958, term60958.getClass(), "characterVoiceNo", -1911852008);
        setIntField(term60958, term60958.getClass(), "tabSetting", -126937505);
        setIntField(term60958, term60958.getClass(), "tabSortSetting", 1600311664);
        setIntField(term60958, term60958.getClass(), "cardCategorySetting", 1505616296);
        setIntField(term60958, term60958.getClass(), "cardSortSetting", 453453842);
        setIntField(term60958, term60958.getClass(), "rivalScoreCategorySetting", 591356101);
        setIntField(term60958, term60958.getClass(), "playedTutorialBit", 1387849981);
        setIntField(term60958, term60958.getClass(), "firstTutorialCancelNum", 518095920);
        setLongField(term60958, term60958.getClass(), "sumTechHighScore", -4490723442670837407L);
        setLongField(term60958, term60958.getClass(), "sumTechBasicHighScore", 6625707209740450857L);
        setLongField(term60958, term60958.getClass(), "sumTechAdvancedHighScore", 5760483545030857520L);
        setLongField(term60958, term60958.getClass(), "sumTechExpertHighScore", -3208114130046571707L);
        setLongField(term60958, term60958.getClass(), "sumTechMasterHighScore", -8287536218807948751L);
        setLongField(term60958, term60958.getClass(), "sumTechLunaticHighScore", -6474751610534417563L);
        setLongField(term60958, term60958.getClass(), "sumBattleHighScore", -6514211337869837684L);
        setLongField(term60958, term60958.getClass(), "sumBattleBasicHighScore", -4691514781327472641L);
        setLongField(term60958, term60958.getClass(), "sumBattleAdvancedHighScore", 2959376493284774197L);
        setLongField(term60958, term60958.getClass(), "sumBattleExpertHighScore", -7681690851462289504L);
        setLongField(term60958, term60958.getClass(), "sumBattleMasterHighScore", -3504634368052196715L);
        setLongField(term60958, term60958.getClass(), "sumBattleLunaticHighScore", -8918467228491530956L);
        setField(term60958, term60958.getClass(), "eventWatchedDate", "OoRBUdwown");
        setField(term60958, term60958.getClass(), "cmEventWatchedDate", "lSidZunNtu");
        setField(term60958, term60958.getClass(), "firstGameId", "TLUhUnoanK");
        setField(term60958, term60958.getClass(), "firstRomVersion", "JXyQTIyIrU");
        setField(term60958, term60958.getClass(), "firstDataVersion", "uplmRQRGWr");
        setField(term60958, term60958.getClass(), "firstPlayDate", "ZEmNnaQFYB");
        setField(term60958, term60958.getClass(), "lastGameId", "FNxFpCZxLW");
        setField(term60958, term60958.getClass(), "lastRomVersion", "sXMXSCUbRu");
        setField(term60958, term60958.getClass(), "lastDataVersion", "iualVLfDmL");
        setField(term60958, term60958.getClass(), "compatibleCmVersion", "bhEFtkUvDw");
        setField(term60958, term60958.getClass(), "lastPlayDate", "ZmbknwMIBa");
        setIntField(term60958, term60958.getClass(), "lastPlaceId", 1333750018);
        setField(term60958, term60958.getClass(), "lastPlaceName", "UiRmBTpDTp");
        setIntField(term60958, term60958.getClass(), "lastRegionId", 1824319777);
        setField(term60958, term60958.getClass(), "lastRegionName", "zQtuUgUIjK");
        setIntField(term60958, term60958.getClass(), "lastAllNetId", -942865663);
        setField(term60958, term60958.getClass(), "lastClientId", "VBeGRjPsPN");
        setIntField(term60958, term60958.getClass(), "lastUsedDeckId", 612230460);
        setIntField(term60958, term60958.getClass(), "lastPlayMusicLevel", -87837417);
        setIntField(term60958, term60958.getClass(), "lastEmoneyBrand", -1864680068);
        term61221 = new Long(610764674705321834L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term61221;
        callMethod(klass, "setSumTechHighScore", argTypes, term60958, args);
    }

};


