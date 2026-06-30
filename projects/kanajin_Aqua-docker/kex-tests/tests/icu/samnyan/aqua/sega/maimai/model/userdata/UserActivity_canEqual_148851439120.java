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

public class UserActivity_canEqual_148851439120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49443;
     Object term49626;

    public UserActivity_canEqual_148851439120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term49449 = new Long(-948292411727204525L);
        term49443 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity"));
        Object term49445 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term49447 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term49463 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49464 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49468 = newInstance(Class.forName("java.time.LocalTime"));
        Object term49473 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49474 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49478 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term49443, term49443.getClass(), "id", -6771377873268167033L);
        setLongField(term49445, term49445.getClass(), "id", 1278107327214302894L);
        setLongField(term49447, term49447.getClass(), "id", 3104349415269466587L);
        setField(term49447, term49447.getClass(), "extId", term49449);
        setField(term49447, term49447.getClass(), "luid", "jlYNjpdkoz");
        setIntField(term49464, term49464.getClass(), "year", 2019);
        setShortField(term49464, term49464.getClass(), "month", (short) 3);
        setShortField(term49464, term49464.getClass(), "day", (short) 23);
        setField(term49463, term49463.getClass(), "date", term49464);
        setByteField(term49468, term49468.getClass(), "hour", (byte) 13);
        setByteField(term49468, term49468.getClass(), "minute", (byte) 19);
        setByteField(term49468, term49468.getClass(), "second", (byte) 44);
        setIntField(term49468, term49468.getClass(), "nano", 912714703);
        setField(term49463, term49463.getClass(), "time", term49468);
        setField(term49447, term49447.getClass(), "registerTime", term49463);
        setIntField(term49474, term49474.getClass(), "year", 2027);
        setShortField(term49474, term49474.getClass(), "month", (short) 3);
        setShortField(term49474, term49474.getClass(), "day", (short) 4);
        setField(term49473, term49473.getClass(), "date", term49474);
        setByteField(term49478, term49478.getClass(), "hour", (byte) 2);
        setByteField(term49478, term49478.getClass(), "minute", (byte) 3);
        setByteField(term49478, term49478.getClass(), "second", (byte) 31);
        setIntField(term49478, term49478.getClass(), "nano", 652064220);
        setField(term49473, term49473.getClass(), "time", term49478);
        setField(term49447, term49447.getClass(), "accessTime", term49473);
        setField(term49445, term49445.getClass(), "card", term49447);
        setIntField(term49445, term49445.getClass(), "lastDataVersion", 412002888);
        setField(term49445, term49445.getClass(), "userName", "DZAGnhJkeU");
        setIntField(term49445, term49445.getClass(), "point", -518326317);
        setIntField(term49445, term49445.getClass(), "totalPoint", 638898197);
        setIntField(term49445, term49445.getClass(), "iconId", 377212022);
        setIntField(term49445, term49445.getClass(), "nameplateId", 1288951867);
        setIntField(term49445, term49445.getClass(), "frameId", -1878750819);
        setIntField(term49445, term49445.getClass(), "trophyId", 1772604053);
        setIntField(term49445, term49445.getClass(), "playCount", 704647579);
        setIntField(term49445, term49445.getClass(), "playVsCount", -3495334);
        setIntField(term49445, term49445.getClass(), "playSyncCount", 745336129);
        setIntField(term49445, term49445.getClass(), "winCount", -1700296410);
        setIntField(term49445, term49445.getClass(), "helpCount", -1568191258);
        setIntField(term49445, term49445.getClass(), "comboCount", 1561855050);
        setIntField(term49445, term49445.getClass(), "feverCount", -2098601979);
        setIntField(term49445, term49445.getClass(), "totalHiScore", 1900897223);
        setIntField(term49445, term49445.getClass(), "totalEasyHighScore", -1269934000);
        setIntField(term49445, term49445.getClass(), "totalBasicHighScore", -565153319);
        setIntField(term49445, term49445.getClass(), "totalAdvancedHighScore", 769522534);
        setIntField(term49445, term49445.getClass(), "totalExpertHighScore", -1587006706);
        setIntField(term49445, term49445.getClass(), "totalMasterHighScore", -1232437615);
        setIntField(term49445, term49445.getClass(), "totalReMasterHighScore", -19383762);
        setIntField(term49445, term49445.getClass(), "totalHighSync", 1225890361);
        setIntField(term49445, term49445.getClass(), "totalEasySync", 629422211);
        setIntField(term49445, term49445.getClass(), "totalBasicSync", 59956966);
        setIntField(term49445, term49445.getClass(), "totalAdvancedSync", -841682366);
        setIntField(term49445, term49445.getClass(), "totalExpertSync", 974285842);
        setIntField(term49445, term49445.getClass(), "totalMasterSync", 104380458);
        setIntField(term49445, term49445.getClass(), "totalReMasterSync", 2035665173);
        setIntField(term49445, term49445.getClass(), "playerRating", 1551975054);
        setIntField(term49445, term49445.getClass(), "highestRating", 1198414570);
        setIntField(term49445, term49445.getClass(), "rankAuthTailId", -1816324255);
        setField(term49445, term49445.getClass(), "eventWatchedDate", "xQuVexkiVz");
        setField(term49445, term49445.getClass(), "webLimitDate", "LqNgPziYtv");
        setIntField(term49445, term49445.getClass(), "challengeTrackPhase", 989418926);
        setIntField(term49445, term49445.getClass(), "firstPlayBits", -821373946);
        setField(term49445, term49445.getClass(), "lastPlayDate", "wiDfuaXnrP");
        setIntField(term49445, term49445.getClass(), "lastPlaceId", 855942907);
        setField(term49445, term49445.getClass(), "lastPlaceName", "btdGZUcaZl");
        setIntField(term49445, term49445.getClass(), "lastRegionId", 1739625708);
        setField(term49445, term49445.getClass(), "lastRegionName", "WnEAVdCxna");
        setField(term49445, term49445.getClass(), "lastClientId", "lnPIxHHyEK");
        setField(term49445, term49445.getClass(), "lastCountryCode", "unvQfYuBUz");
        setIntField(term49445, term49445.getClass(), "eventPoint", -323567982);
        setIntField(term49445, term49445.getClass(), "totalLv", -64120763);
        setIntField(term49445, term49445.getClass(), "lastLoginBonusDay", 1509055726);
        setIntField(term49445, term49445.getClass(), "lastSurvivalBonusDay", -1877152178);
        setIntField(term49445, term49445.getClass(), "loginBonusLv", -1510720583);
        setField(term49443, term49443.getClass(), "user", term49445);
        setIntField(term49443, term49443.getClass(), "kind", 993976584);
        setIntField(term49443, term49443.getClass(), "activityId", -1655862728);
        setLongField(term49443, term49443.getClass(), "sortNumber", -7423063312741500355L);
        setIntField(term49443, term49443.getClass(), "param1", -596801958);
        setIntField(term49443, term49443.getClass(), "param2", -1416009681);
        setIntField(term49443, term49443.getClass(), "param3", 613284576);
        setIntField(term49443, term49443.getClass(), "param4", -868953151);
        term49626 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term49626;
        callMethod(klass, "canEqual", argTypes, term49443, args);
    }

};


