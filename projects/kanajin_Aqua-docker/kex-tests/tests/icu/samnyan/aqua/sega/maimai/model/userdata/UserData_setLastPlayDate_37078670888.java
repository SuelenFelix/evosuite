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
import java.lang.Object;
import java.lang.Long;

public class UserData_setLastPlayDate_37078670888 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23413;

    public UserData_setLastPlayDate_37078670888() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23417 = new Long(846579494941632714L);
        term23413 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term23415 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term23431 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23432 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23436 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23441 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23442 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23446 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term23413, term23413.getClass(), "id", 4699157009689333952L);
        setLongField(term23415, term23415.getClass(), "id", -78240609295693193L);
        setField(term23415, term23415.getClass(), "extId", term23417);
        setField(term23415, term23415.getClass(), "luid", "nDCcyhiTnS");
        setIntField(term23432, term23432.getClass(), "year", 2019);
        setShortField(term23432, term23432.getClass(), "month", (short) 7);
        setShortField(term23432, term23432.getClass(), "day", (short) 4);
        setField(term23431, term23431.getClass(), "date", term23432);
        setByteField(term23436, term23436.getClass(), "hour", (byte) 19);
        setByteField(term23436, term23436.getClass(), "minute", (byte) 20);
        setByteField(term23436, term23436.getClass(), "second", (byte) 59);
        setIntField(term23436, term23436.getClass(), "nano", 246784352);
        setField(term23431, term23431.getClass(), "time", term23436);
        setField(term23415, term23415.getClass(), "registerTime", term23431);
        setIntField(term23442, term23442.getClass(), "year", 2023);
        setShortField(term23442, term23442.getClass(), "month", (short) 7);
        setShortField(term23442, term23442.getClass(), "day", (short) 1);
        setField(term23441, term23441.getClass(), "date", term23442);
        setByteField(term23446, term23446.getClass(), "hour", (byte) 4);
        setByteField(term23446, term23446.getClass(), "minute", (byte) 33);
        setByteField(term23446, term23446.getClass(), "second", (byte) 9);
        setIntField(term23446, term23446.getClass(), "nano", 94365310);
        setField(term23441, term23441.getClass(), "time", term23446);
        setField(term23415, term23415.getClass(), "accessTime", term23441);
        setField(term23413, term23413.getClass(), "card", term23415);
        setIntField(term23413, term23413.getClass(), "lastDataVersion", -394638810);
        setField(term23413, term23413.getClass(), "userName", "Bcivwcjece");
        setIntField(term23413, term23413.getClass(), "point", 790706322);
        setIntField(term23413, term23413.getClass(), "totalPoint", 699712077);
        setIntField(term23413, term23413.getClass(), "iconId", -97640679);
        setIntField(term23413, term23413.getClass(), "nameplateId", 1484085042);
        setIntField(term23413, term23413.getClass(), "frameId", 1777726456);
        setIntField(term23413, term23413.getClass(), "trophyId", -1376824764);
        setIntField(term23413, term23413.getClass(), "playCount", -1173622754);
        setIntField(term23413, term23413.getClass(), "playVsCount", -654564305);
        setIntField(term23413, term23413.getClass(), "playSyncCount", -1985017499);
        setIntField(term23413, term23413.getClass(), "winCount", 1959598890);
        setIntField(term23413, term23413.getClass(), "helpCount", -920963609);
        setIntField(term23413, term23413.getClass(), "comboCount", -724930680);
        setIntField(term23413, term23413.getClass(), "feverCount", -1859413089);
        setIntField(term23413, term23413.getClass(), "totalHiScore", -288823387);
        setIntField(term23413, term23413.getClass(), "totalEasyHighScore", 1565022809);
        setIntField(term23413, term23413.getClass(), "totalBasicHighScore", 286088345);
        setIntField(term23413, term23413.getClass(), "totalAdvancedHighScore", -1958895309);
        setIntField(term23413, term23413.getClass(), "totalExpertHighScore", -639022235);
        setIntField(term23413, term23413.getClass(), "totalMasterHighScore", -1063872965);
        setIntField(term23413, term23413.getClass(), "totalReMasterHighScore", 804907633);
        setIntField(term23413, term23413.getClass(), "totalHighSync", -937521678);
        setIntField(term23413, term23413.getClass(), "totalEasySync", 194707851);
        setIntField(term23413, term23413.getClass(), "totalBasicSync", 806877632);
        setIntField(term23413, term23413.getClass(), "totalAdvancedSync", -1198681384);
        setIntField(term23413, term23413.getClass(), "totalExpertSync", 1224777627);
        setIntField(term23413, term23413.getClass(), "totalMasterSync", -1771549367);
        setIntField(term23413, term23413.getClass(), "totalReMasterSync", -83563931);
        setIntField(term23413, term23413.getClass(), "playerRating", 1175147923);
        setIntField(term23413, term23413.getClass(), "highestRating", -1424244263);
        setIntField(term23413, term23413.getClass(), "rankAuthTailId", 808665285);
        setField(term23413, term23413.getClass(), "eventWatchedDate", "QTefjRuiez");
        setField(term23413, term23413.getClass(), "webLimitDate", "SQZVNkAVBB");
        setIntField(term23413, term23413.getClass(), "challengeTrackPhase", 2003642877);
        setIntField(term23413, term23413.getClass(), "firstPlayBits", -1574456346);
        setField(term23413, term23413.getClass(), "lastPlayDate", "mrSAYJlddZ");
        setIntField(term23413, term23413.getClass(), "lastPlaceId", 638598511);
        setField(term23413, term23413.getClass(), "lastPlaceName", "KbwxawvYsw");
        setIntField(term23413, term23413.getClass(), "lastRegionId", -946663870);
        setField(term23413, term23413.getClass(), "lastRegionName", "gvjdfHNzOa");
        setField(term23413, term23413.getClass(), "lastClientId", "HqitWglYWX");
        setField(term23413, term23413.getClass(), "lastCountryCode", "pOuFRlHmbK");
        setIntField(term23413, term23413.getClass(), "eventPoint", 1997126409);
        setIntField(term23413, term23413.getClass(), "totalLv", 1794793561);
        setIntField(term23413, term23413.getClass(), "lastLoginBonusDay", 1483253425);
        setIntField(term23413, term23413.getClass(), "lastSurvivalBonusDay", -1101871231);
        setIntField(term23413, term23413.getClass(), "loginBonusLv", 928527949);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WrzdBkinqV";
        callMethod(klass, "setLastPlayDate", argTypes, term23413, args);
    }

};


