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

public class UserData_setUserName_212975556653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14043;

    public UserData_setUserName_212975556653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14047 = new Long(-2644215923136513282L);
        term14043 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term14045 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term14061 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14062 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14066 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14071 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14072 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14076 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term14043, term14043.getClass(), "id", -3936701866695933852L);
        setLongField(term14045, term14045.getClass(), "id", 1215116475929634177L);
        setField(term14045, term14045.getClass(), "extId", term14047);
        setField(term14045, term14045.getClass(), "luid", "wsysQLGFnl");
        setIntField(term14062, term14062.getClass(), "year", 2013);
        setShortField(term14062, term14062.getClass(), "month", (short) 7);
        setShortField(term14062, term14062.getClass(), "day", (short) 3);
        setField(term14061, term14061.getClass(), "date", term14062);
        setByteField(term14066, term14066.getClass(), "hour", (byte) 10);
        setByteField(term14066, term14066.getClass(), "minute", (byte) 59);
        setByteField(term14066, term14066.getClass(), "second", (byte) 22);
        setIntField(term14066, term14066.getClass(), "nano", 937921480);
        setField(term14061, term14061.getClass(), "time", term14066);
        setField(term14045, term14045.getClass(), "registerTime", term14061);
        setIntField(term14072, term14072.getClass(), "year", 2012);
        setShortField(term14072, term14072.getClass(), "month", (short) 2);
        setShortField(term14072, term14072.getClass(), "day", (short) 29);
        setField(term14071, term14071.getClass(), "date", term14072);
        setByteField(term14076, term14076.getClass(), "hour", (byte) 14);
        setByteField(term14076, term14076.getClass(), "minute", (byte) 26);
        setByteField(term14076, term14076.getClass(), "second", (byte) 20);
        setIntField(term14076, term14076.getClass(), "nano", 780823452);
        setField(term14071, term14071.getClass(), "time", term14076);
        setField(term14045, term14045.getClass(), "accessTime", term14071);
        setField(term14043, term14043.getClass(), "card", term14045);
        setIntField(term14043, term14043.getClass(), "lastDataVersion", 427005798);
        setField(term14043, term14043.getClass(), "userName", "ckQLZGFjMX");
        setIntField(term14043, term14043.getClass(), "point", -993454505);
        setIntField(term14043, term14043.getClass(), "totalPoint", -238353821);
        setIntField(term14043, term14043.getClass(), "iconId", -818992228);
        setIntField(term14043, term14043.getClass(), "nameplateId", 2087429143);
        setIntField(term14043, term14043.getClass(), "frameId", -1892890104);
        setIntField(term14043, term14043.getClass(), "trophyId", 2003356558);
        setIntField(term14043, term14043.getClass(), "playCount", -638126185);
        setIntField(term14043, term14043.getClass(), "playVsCount", 28070985);
        setIntField(term14043, term14043.getClass(), "playSyncCount", 334110739);
        setIntField(term14043, term14043.getClass(), "winCount", -1724529322);
        setIntField(term14043, term14043.getClass(), "helpCount", 1843465187);
        setIntField(term14043, term14043.getClass(), "comboCount", 529595969);
        setIntField(term14043, term14043.getClass(), "feverCount", -1548733886);
        setIntField(term14043, term14043.getClass(), "totalHiScore", 1543539715);
        setIntField(term14043, term14043.getClass(), "totalEasyHighScore", 1744599521);
        setIntField(term14043, term14043.getClass(), "totalBasicHighScore", -985141153);
        setIntField(term14043, term14043.getClass(), "totalAdvancedHighScore", -1983740361);
        setIntField(term14043, term14043.getClass(), "totalExpertHighScore", -1494716341);
        setIntField(term14043, term14043.getClass(), "totalMasterHighScore", 816237851);
        setIntField(term14043, term14043.getClass(), "totalReMasterHighScore", -604114341);
        setIntField(term14043, term14043.getClass(), "totalHighSync", 1146236760);
        setIntField(term14043, term14043.getClass(), "totalEasySync", 985801789);
        setIntField(term14043, term14043.getClass(), "totalBasicSync", -1628536749);
        setIntField(term14043, term14043.getClass(), "totalAdvancedSync", -748022064);
        setIntField(term14043, term14043.getClass(), "totalExpertSync", -1745708025);
        setIntField(term14043, term14043.getClass(), "totalMasterSync", 790614624);
        setIntField(term14043, term14043.getClass(), "totalReMasterSync", 117387225);
        setIntField(term14043, term14043.getClass(), "playerRating", 948347134);
        setIntField(term14043, term14043.getClass(), "highestRating", -1552842218);
        setIntField(term14043, term14043.getClass(), "rankAuthTailId", -157220068);
        setField(term14043, term14043.getClass(), "eventWatchedDate", "qphdrqUtNx");
        setField(term14043, term14043.getClass(), "webLimitDate", "bwlLFAfNWx");
        setIntField(term14043, term14043.getClass(), "challengeTrackPhase", 141434141);
        setIntField(term14043, term14043.getClass(), "firstPlayBits", -288619829);
        setField(term14043, term14043.getClass(), "lastPlayDate", "JWodNQzjjV");
        setIntField(term14043, term14043.getClass(), "lastPlaceId", -505635206);
        setField(term14043, term14043.getClass(), "lastPlaceName", "CAgxWjhxNf");
        setIntField(term14043, term14043.getClass(), "lastRegionId", 932246615);
        setField(term14043, term14043.getClass(), "lastRegionName", "goAoCMhKBu");
        setField(term14043, term14043.getClass(), "lastClientId", "BWxJSgKHRT");
        setField(term14043, term14043.getClass(), "lastCountryCode", "AGXoIndFnm");
        setIntField(term14043, term14043.getClass(), "eventPoint", 261281668);
        setIntField(term14043, term14043.getClass(), "totalLv", 1712273163);
        setIntField(term14043, term14043.getClass(), "lastLoginBonusDay", 234306621);
        setIntField(term14043, term14043.getClass(), "lastSurvivalBonusDay", 1025525602);
        setIntField(term14043, term14043.getClass(), "loginBonusLv", 1669406334);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mwmFMNEzkK";
        callMethod(klass, "setUserName", argTypes, term14043, args);
    }

};


