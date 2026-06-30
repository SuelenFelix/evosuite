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
import java.lang.Integer;

public class UserData_setHighestRating_92536665482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21777;
     Object term21951;

    public UserData_setHighestRating_92536665482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21781 = new Long(5946780097489996391L);
        term21777 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term21779 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term21795 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21796 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21800 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21805 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21806 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21810 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term21777, term21777.getClass(), "id", -8471550651709805183L);
        setLongField(term21779, term21779.getClass(), "id", -948292411727204525L);
        setField(term21779, term21779.getClass(), "extId", term21781);
        setField(term21779, term21779.getClass(), "luid", "xVFgeyYxZS");
        setIntField(term21796, term21796.getClass(), "year", 2023);
        setShortField(term21796, term21796.getClass(), "month", (short) 8);
        setShortField(term21796, term21796.getClass(), "day", (short) 21);
        setField(term21795, term21795.getClass(), "date", term21796);
        setByteField(term21800, term21800.getClass(), "hour", (byte) 10);
        setByteField(term21800, term21800.getClass(), "minute", (byte) 36);
        setByteField(term21800, term21800.getClass(), "second", (byte) 15);
        setIntField(term21800, term21800.getClass(), "nano", 257070204);
        setField(term21795, term21795.getClass(), "time", term21800);
        setField(term21779, term21779.getClass(), "registerTime", term21795);
        setIntField(term21806, term21806.getClass(), "year", 2012);
        setShortField(term21806, term21806.getClass(), "month", (short) 12);
        setShortField(term21806, term21806.getClass(), "day", (short) 14);
        setField(term21805, term21805.getClass(), "date", term21806);
        setByteField(term21810, term21810.getClass(), "hour", (byte) 1);
        setByteField(term21810, term21810.getClass(), "minute", (byte) 47);
        setByteField(term21810, term21810.getClass(), "second", (byte) 3);
        setIntField(term21810, term21810.getClass(), "nano", 359751066);
        setField(term21805, term21805.getClass(), "time", term21810);
        setField(term21779, term21779.getClass(), "accessTime", term21805);
        setField(term21777, term21777.getClass(), "card", term21779);
        setIntField(term21777, term21777.getClass(), "lastDataVersion", -898083613);
        setField(term21777, term21777.getClass(), "userName", "iQiGTulJiH");
        setIntField(term21777, term21777.getClass(), "point", 1072590759);
        setIntField(term21777, term21777.getClass(), "totalPoint", -261873217);
        setIntField(term21777, term21777.getClass(), "iconId", 275234848);
        setIntField(term21777, term21777.getClass(), "nameplateId", -400500781);
        setIntField(term21777, term21777.getClass(), "frameId", -1811725314);
        setIntField(term21777, term21777.getClass(), "trophyId", -1802258300);
        setIntField(term21777, term21777.getClass(), "playCount", -407739204);
        setIntField(term21777, term21777.getClass(), "playVsCount", 551650321);
        setIntField(term21777, term21777.getClass(), "playSyncCount", 1863609082);
        setIntField(term21777, term21777.getClass(), "winCount", 346023694);
        setIntField(term21777, term21777.getClass(), "helpCount", 1378096239);
        setIntField(term21777, term21777.getClass(), "comboCount", -1082231594);
        setIntField(term21777, term21777.getClass(), "feverCount", -1775141108);
        setIntField(term21777, term21777.getClass(), "totalHiScore", -606500993);
        setIntField(term21777, term21777.getClass(), "totalEasyHighScore", 475994339);
        setIntField(term21777, term21777.getClass(), "totalBasicHighScore", -460066219);
        setIntField(term21777, term21777.getClass(), "totalAdvancedHighScore", -1947540595);
        setIntField(term21777, term21777.getClass(), "totalExpertHighScore", -1198145043);
        setIntField(term21777, term21777.getClass(), "totalMasterHighScore", -999740641);
        setIntField(term21777, term21777.getClass(), "totalReMasterHighScore", -639247037);
        setIntField(term21777, term21777.getClass(), "totalHighSync", -110418958);
        setIntField(term21777, term21777.getClass(), "totalEasySync", 1131695499);
        setIntField(term21777, term21777.getClass(), "totalBasicSync", -699693103);
        setIntField(term21777, term21777.getClass(), "totalAdvancedSync", -365179239);
        setIntField(term21777, term21777.getClass(), "totalExpertSync", -1670737346);
        setIntField(term21777, term21777.getClass(), "totalMasterSync", -1150935030);
        setIntField(term21777, term21777.getClass(), "totalReMasterSync", 78607598);
        setIntField(term21777, term21777.getClass(), "playerRating", -126292072);
        setIntField(term21777, term21777.getClass(), "highestRating", -1541809993);
        setIntField(term21777, term21777.getClass(), "rankAuthTailId", -1100665028);
        setField(term21777, term21777.getClass(), "eventWatchedDate", "utCuuVCKqE");
        setField(term21777, term21777.getClass(), "webLimitDate", "zSfoqzJbPT");
        setIntField(term21777, term21777.getClass(), "challengeTrackPhase", -1572533124);
        setIntField(term21777, term21777.getClass(), "firstPlayBits", 1577766413);
        setField(term21777, term21777.getClass(), "lastPlayDate", "QUymMnsCIj");
        setIntField(term21777, term21777.getClass(), "lastPlaceId", -1615367460);
        setField(term21777, term21777.getClass(), "lastPlaceName", "ikTtOgdVYS");
        setIntField(term21777, term21777.getClass(), "lastRegionId", 1119103227);
        setField(term21777, term21777.getClass(), "lastRegionName", "JptuwlirlS");
        setField(term21777, term21777.getClass(), "lastClientId", "TKOMaGswbU");
        setField(term21777, term21777.getClass(), "lastCountryCode", "YcTbglHiUq");
        setIntField(term21777, term21777.getClass(), "eventPoint", 1061904558);
        setIntField(term21777, term21777.getClass(), "totalLv", -390418218);
        setIntField(term21777, term21777.getClass(), "lastLoginBonusDay", 72302997);
        setIntField(term21777, term21777.getClass(), "lastSurvivalBonusDay", 1619477832);
        setIntField(term21777, term21777.getClass(), "loginBonusLv", 611208497);
        term21951 = new Integer(1184968868);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term21951;
        callMethod(klass, "setHighestRating", argTypes, term21777, args);
    }

};


