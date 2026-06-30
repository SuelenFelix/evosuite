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
import java.lang.Integer;

public class UserItem_init_51268509016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88599;
     Object term88601;
     Object term88775;
     Object term88777;
     Object term88779;

    public UserItem_init_51268509016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88599 = new Long(-4868523627266698649L);
        Long term88605 = new Long(2535970782317488741L);
        term88601 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term88603 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term88619 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term88620 = newInstance(Class.forName("java.time.LocalDate"));
        Object term88624 = newInstance(Class.forName("java.time.LocalTime"));
        Object term88629 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term88630 = newInstance(Class.forName("java.time.LocalDate"));
        Object term88634 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term88601, term88601.getClass(), "id", 3228082303360203224L);
        setLongField(term88603, term88603.getClass(), "id", 8845929725457841487L);
        setField(term88603, term88603.getClass(), "extId", term88605);
        setField(term88603, term88603.getClass(), "luid", "rvUfMhtNrD");
        setIntField(term88620, term88620.getClass(), "year", 2014);
        setShortField(term88620, term88620.getClass(), "month", (short) 3);
        setShortField(term88620, term88620.getClass(), "day", (short) 25);
        setField(term88619, term88619.getClass(), "date", term88620);
        setByteField(term88624, term88624.getClass(), "hour", (byte) 21);
        setByteField(term88624, term88624.getClass(), "minute", (byte) 11);
        setByteField(term88624, term88624.getClass(), "second", (byte) 20);
        setIntField(term88624, term88624.getClass(), "nano", 320642457);
        setField(term88619, term88619.getClass(), "time", term88624);
        setField(term88603, term88603.getClass(), "registerTime", term88619);
        setIntField(term88630, term88630.getClass(), "year", 2020);
        setShortField(term88630, term88630.getClass(), "month", (short) 4);
        setShortField(term88630, term88630.getClass(), "day", (short) 20);
        setField(term88629, term88629.getClass(), "date", term88630);
        setByteField(term88634, term88634.getClass(), "hour", (byte) 15);
        setByteField(term88634, term88634.getClass(), "minute", (byte) 24);
        setByteField(term88634, term88634.getClass(), "second", (byte) 35);
        setIntField(term88634, term88634.getClass(), "nano", 679127969);
        setField(term88629, term88629.getClass(), "time", term88634);
        setField(term88603, term88603.getClass(), "accessTime", term88629);
        setField(term88601, term88601.getClass(), "card", term88603);
        setIntField(term88601, term88601.getClass(), "lastDataVersion", 80749910);
        setField(term88601, term88601.getClass(), "userName", "tVJNKfGPYg");
        setIntField(term88601, term88601.getClass(), "point", -1917030847);
        setIntField(term88601, term88601.getClass(), "totalPoint", -1678066921);
        setIntField(term88601, term88601.getClass(), "iconId", 1398239082);
        setIntField(term88601, term88601.getClass(), "nameplateId", -822609904);
        setIntField(term88601, term88601.getClass(), "frameId", 1496179101);
        setIntField(term88601, term88601.getClass(), "trophyId", -830145650);
        setIntField(term88601, term88601.getClass(), "playCount", 163814430);
        setIntField(term88601, term88601.getClass(), "playVsCount", 118692552);
        setIntField(term88601, term88601.getClass(), "playSyncCount", -99466254);
        setIntField(term88601, term88601.getClass(), "winCount", -1474933209);
        setIntField(term88601, term88601.getClass(), "helpCount", 257817118);
        setIntField(term88601, term88601.getClass(), "comboCount", 2037455054);
        setIntField(term88601, term88601.getClass(), "feverCount", -2037705033);
        setIntField(term88601, term88601.getClass(), "totalHiScore", 673019945);
        setIntField(term88601, term88601.getClass(), "totalEasyHighScore", -1161638748);
        setIntField(term88601, term88601.getClass(), "totalBasicHighScore", 2056200144);
        setIntField(term88601, term88601.getClass(), "totalAdvancedHighScore", -1167348988);
        setIntField(term88601, term88601.getClass(), "totalExpertHighScore", 426804739);
        setIntField(term88601, term88601.getClass(), "totalMasterHighScore", -2012164979);
        setIntField(term88601, term88601.getClass(), "totalReMasterHighScore", -786030720);
        setIntField(term88601, term88601.getClass(), "totalHighSync", -1294339480);
        setIntField(term88601, term88601.getClass(), "totalEasySync", -858509937);
        setIntField(term88601, term88601.getClass(), "totalBasicSync", -1249437874);
        setIntField(term88601, term88601.getClass(), "totalAdvancedSync", 721993587);
        setIntField(term88601, term88601.getClass(), "totalExpertSync", -2115303175);
        setIntField(term88601, term88601.getClass(), "totalMasterSync", 958435482);
        setIntField(term88601, term88601.getClass(), "totalReMasterSync", -1013016284);
        setIntField(term88601, term88601.getClass(), "playerRating", 2102415180);
        setIntField(term88601, term88601.getClass(), "highestRating", 448122027);
        setIntField(term88601, term88601.getClass(), "rankAuthTailId", -1936645212);
        setField(term88601, term88601.getClass(), "eventWatchedDate", "AlAUNSOTmH");
        setField(term88601, term88601.getClass(), "webLimitDate", "IeuSZGvhvH");
        setIntField(term88601, term88601.getClass(), "challengeTrackPhase", -770480497);
        setIntField(term88601, term88601.getClass(), "firstPlayBits", 379983129);
        setField(term88601, term88601.getClass(), "lastPlayDate", "zCejWZdaIc");
        setIntField(term88601, term88601.getClass(), "lastPlaceId", -215542299);
        setField(term88601, term88601.getClass(), "lastPlaceName", "aCfzlsgXhB");
        setIntField(term88601, term88601.getClass(), "lastRegionId", 1063632099);
        setField(term88601, term88601.getClass(), "lastRegionName", "HmhoMiUgEv");
        setField(term88601, term88601.getClass(), "lastClientId", "MuJvYyPzjX");
        setField(term88601, term88601.getClass(), "lastCountryCode", "pEZeQhLjKN");
        setIntField(term88601, term88601.getClass(), "eventPoint", -1851410176);
        setIntField(term88601, term88601.getClass(), "totalLv", -9921028);
        setIntField(term88601, term88601.getClass(), "lastLoginBonusDay", 159933777);
        setIntField(term88601, term88601.getClass(), "lastSurvivalBonusDay", -2049503346);
        setIntField(term88601, term88601.getClass(), "loginBonusLv", 178356944);
        term88775 = new Integer(1296233741);
        term88777 = new Integer(-1453122829);
        term88779 = new Integer(1723930455);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = term88599;
        args[1] = term88601;
        args[2] = term88775;
        args[3] = term88777;
        args[4] = term88779;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


