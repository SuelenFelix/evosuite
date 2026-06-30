package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class UserGeneralData_init_18551344914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112053;
     Object term112055;

    public UserGeneralData_init_18551344914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112053 = new Long(4361302085818491893L);
        Long term112059 = new Long(-7005300544167632229L);
        term112055 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term112057 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term112073 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term112074 = newInstance(Class.forName("java.time.LocalDate"));
        Object term112078 = newInstance(Class.forName("java.time.LocalTime"));
        Object term112083 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term112084 = newInstance(Class.forName("java.time.LocalDate"));
        Object term112088 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term112055, term112055.getClass(), "id", -2025074482272457806L);
        setLongField(term112057, term112057.getClass(), "id", -5564465000971559787L);
        setField(term112057, term112057.getClass(), "extId", term112059);
        setField(term112057, term112057.getClass(), "luid", "GqITHNYwXE");
        setIntField(term112074, term112074.getClass(), "year", 2016);
        setShortField(term112074, term112074.getClass(), "month", (short) 10);
        setShortField(term112074, term112074.getClass(), "day", (short) 4);
        setField(term112073, term112073.getClass(), "date", term112074);
        setByteField(term112078, term112078.getClass(), "hour", (byte) 21);
        setByteField(term112078, term112078.getClass(), "minute", (byte) 48);
        setByteField(term112078, term112078.getClass(), "second", (byte) 47);
        setIntField(term112078, term112078.getClass(), "nano", 98983875);
        setField(term112073, term112073.getClass(), "time", term112078);
        setField(term112057, term112057.getClass(), "registerTime", term112073);
        setIntField(term112084, term112084.getClass(), "year", 2027);
        setShortField(term112084, term112084.getClass(), "month", (short) 1);
        setShortField(term112084, term112084.getClass(), "day", (short) 18);
        setField(term112083, term112083.getClass(), "date", term112084);
        setByteField(term112088, term112088.getClass(), "hour", (byte) 14);
        setByteField(term112088, term112088.getClass(), "minute", (byte) 46);
        setByteField(term112088, term112088.getClass(), "second", (byte) 5);
        setIntField(term112088, term112088.getClass(), "nano", 748048450);
        setField(term112083, term112083.getClass(), "time", term112088);
        setField(term112057, term112057.getClass(), "accessTime", term112083);
        setField(term112055, term112055.getClass(), "card", term112057);
        setIntField(term112055, term112055.getClass(), "lastDataVersion", -1252761386);
        setField(term112055, term112055.getClass(), "userName", "UZgYyXlvna");
        setIntField(term112055, term112055.getClass(), "point", 2064530069);
        setIntField(term112055, term112055.getClass(), "totalPoint", -1271506389);
        setIntField(term112055, term112055.getClass(), "iconId", -1502389213);
        setIntField(term112055, term112055.getClass(), "nameplateId", -1217431046);
        setIntField(term112055, term112055.getClass(), "frameId", 1472844966);
        setIntField(term112055, term112055.getClass(), "trophyId", -501695251);
        setIntField(term112055, term112055.getClass(), "playCount", 1764349481);
        setIntField(term112055, term112055.getClass(), "playVsCount", -1925408074);
        setIntField(term112055, term112055.getClass(), "playSyncCount", 488945441);
        setIntField(term112055, term112055.getClass(), "winCount", 1653790882);
        setIntField(term112055, term112055.getClass(), "helpCount", -680166148);
        setIntField(term112055, term112055.getClass(), "comboCount", -1431334306);
        setIntField(term112055, term112055.getClass(), "feverCount", 793712955);
        setIntField(term112055, term112055.getClass(), "totalHiScore", -848195463);
        setIntField(term112055, term112055.getClass(), "totalEasyHighScore", -692941306);
        setIntField(term112055, term112055.getClass(), "totalBasicHighScore", -229579921);
        setIntField(term112055, term112055.getClass(), "totalAdvancedHighScore", 309181793);
        setIntField(term112055, term112055.getClass(), "totalExpertHighScore", -1405695173);
        setIntField(term112055, term112055.getClass(), "totalMasterHighScore", 1314029165);
        setIntField(term112055, term112055.getClass(), "totalReMasterHighScore", -1769765181);
        setIntField(term112055, term112055.getClass(), "totalHighSync", 245286488);
        setIntField(term112055, term112055.getClass(), "totalEasySync", 1557564317);
        setIntField(term112055, term112055.getClass(), "totalBasicSync", -609562912);
        setIntField(term112055, term112055.getClass(), "totalAdvancedSync", -1417204225);
        setIntField(term112055, term112055.getClass(), "totalExpertSync", 1033124516);
        setIntField(term112055, term112055.getClass(), "totalMasterSync", -2034452011);
        setIntField(term112055, term112055.getClass(), "totalReMasterSync", 83285907);
        setIntField(term112055, term112055.getClass(), "playerRating", 137869647);
        setIntField(term112055, term112055.getClass(), "highestRating", -641148370);
        setIntField(term112055, term112055.getClass(), "rankAuthTailId", 2003661423);
        setField(term112055, term112055.getClass(), "eventWatchedDate", "VGFyNxXSkc");
        setField(term112055, term112055.getClass(), "webLimitDate", "qkZsBlbGpw");
        setIntField(term112055, term112055.getClass(), "challengeTrackPhase", 870043783);
        setIntField(term112055, term112055.getClass(), "firstPlayBits", 643945557);
        setField(term112055, term112055.getClass(), "lastPlayDate", "UonOkFcwuK");
        setIntField(term112055, term112055.getClass(), "lastPlaceId", 276441632);
        setField(term112055, term112055.getClass(), "lastPlaceName", "coDGKPmcIo");
        setIntField(term112055, term112055.getClass(), "lastRegionId", -556077472);
        setField(term112055, term112055.getClass(), "lastRegionName", "sNKnkClMjH");
        setField(term112055, term112055.getClass(), "lastClientId", "DzuhSmFHcg");
        setField(term112055, term112055.getClass(), "lastCountryCode", "lHFGeijIrp");
        setIntField(term112055, term112055.getClass(), "eventPoint", 1592695310);
        setIntField(term112055, term112055.getClass(), "totalLv", -728764834);
        setIntField(term112055, term112055.getClass(), "lastLoginBonusDay", -992158957);
        setIntField(term112055, term112055.getClass(), "lastSurvivalBonusDay", 1638488155);
        setIntField(term112055, term112055.getClass(), "loginBonusLv", -1011938930);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = term112053;
        args[1] = term112055;
        args[2] = "OjqiiqbEQC";
        args[3] = "lOnziohwRj";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


