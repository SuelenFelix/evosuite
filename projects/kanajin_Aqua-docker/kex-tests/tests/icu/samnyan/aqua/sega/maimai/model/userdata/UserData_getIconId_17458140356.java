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

public class UserData_getIconId_17458140356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1585;

    public UserData_getIconId_17458140356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1589 = new Long(4872422362414183754L);
        term1585 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term1587 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1603 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1604 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1608 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1613 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1614 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1618 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1585, term1585.getClass(), "id", -4325723315152823407L);
        setLongField(term1587, term1587.getClass(), "id", 2535595959091595249L);
        setField(term1587, term1587.getClass(), "extId", term1589);
        setField(term1587, term1587.getClass(), "luid", "onpbIeEKoi");
        setIntField(term1604, term1604.getClass(), "year", 2012);
        setShortField(term1604, term1604.getClass(), "month", (short) 9);
        setShortField(term1604, term1604.getClass(), "day", (short) 11);
        setField(term1603, term1603.getClass(), "date", term1604);
        setByteField(term1608, term1608.getClass(), "hour", (byte) 22);
        setByteField(term1608, term1608.getClass(), "minute", (byte) 10);
        setByteField(term1608, term1608.getClass(), "second", (byte) 8);
        setIntField(term1608, term1608.getClass(), "nano", 380008862);
        setField(term1603, term1603.getClass(), "time", term1608);
        setField(term1587, term1587.getClass(), "registerTime", term1603);
        setIntField(term1614, term1614.getClass(), "year", 2021);
        setShortField(term1614, term1614.getClass(), "month", (short) 9);
        setShortField(term1614, term1614.getClass(), "day", (short) 7);
        setField(term1613, term1613.getClass(), "date", term1614);
        setByteField(term1618, term1618.getClass(), "hour", (byte) 5);
        setByteField(term1618, term1618.getClass(), "minute", (byte) 25);
        setByteField(term1618, term1618.getClass(), "second", (byte) 7);
        setIntField(term1618, term1618.getClass(), "nano", 755924076);
        setField(term1613, term1613.getClass(), "time", term1618);
        setField(term1587, term1587.getClass(), "accessTime", term1613);
        setField(term1585, term1585.getClass(), "card", term1587);
        setIntField(term1585, term1585.getClass(), "lastDataVersion", 1320570890);
        setField(term1585, term1585.getClass(), "userName", "YRHGsAkhxb");
        setIntField(term1585, term1585.getClass(), "point", -130649791);
        setIntField(term1585, term1585.getClass(), "totalPoint", 534834644);
        setIntField(term1585, term1585.getClass(), "iconId", 1959097203);
        setIntField(term1585, term1585.getClass(), "nameplateId", -209654048);
        setIntField(term1585, term1585.getClass(), "frameId", 477625804);
        setIntField(term1585, term1585.getClass(), "trophyId", 252575029);
        setIntField(term1585, term1585.getClass(), "playCount", 57189932);
        setIntField(term1585, term1585.getClass(), "playVsCount", 1460722225);
        setIntField(term1585, term1585.getClass(), "playSyncCount", 1743224434);
        setIntField(term1585, term1585.getClass(), "winCount", 842904495);
        setIntField(term1585, term1585.getClass(), "helpCount", 1008080511);
        setIntField(term1585, term1585.getClass(), "comboCount", 1935707624);
        setIntField(term1585, term1585.getClass(), "feverCount", 1507074215);
        setIntField(term1585, term1585.getClass(), "totalHiScore", -282881827);
        setIntField(term1585, term1585.getClass(), "totalEasyHighScore", -1183353915);
        setIntField(term1585, term1585.getClass(), "totalBasicHighScore", -420030135);
        setIntField(term1585, term1585.getClass(), "totalAdvancedHighScore", 267763294);
        setIntField(term1585, term1585.getClass(), "totalExpertHighScore", -1497710478);
        setIntField(term1585, term1585.getClass(), "totalMasterHighScore", 49950830);
        setIntField(term1585, term1585.getClass(), "totalReMasterHighScore", -525257914);
        setIntField(term1585, term1585.getClass(), "totalHighSync", 147209682);
        setIntField(term1585, term1585.getClass(), "totalEasySync", 34470066);
        setIntField(term1585, term1585.getClass(), "totalBasicSync", 2058711405);
        setIntField(term1585, term1585.getClass(), "totalAdvancedSync", 1743683601);
        setIntField(term1585, term1585.getClass(), "totalExpertSync", -945116798);
        setIntField(term1585, term1585.getClass(), "totalMasterSync", 1593461795);
        setIntField(term1585, term1585.getClass(), "totalReMasterSync", 515182546);
        setIntField(term1585, term1585.getClass(), "playerRating", -936895502);
        setIntField(term1585, term1585.getClass(), "highestRating", -129547140);
        setIntField(term1585, term1585.getClass(), "rankAuthTailId", 199287428);
        setField(term1585, term1585.getClass(), "eventWatchedDate", "ffYhPOzlUs");
        setField(term1585, term1585.getClass(), "webLimitDate", "MLqYREekMl");
        setIntField(term1585, term1585.getClass(), "challengeTrackPhase", -1195339592);
        setIntField(term1585, term1585.getClass(), "firstPlayBits", -376422566);
        setField(term1585, term1585.getClass(), "lastPlayDate", "ytSBIKXogI");
        setIntField(term1585, term1585.getClass(), "lastPlaceId", 306847454);
        setField(term1585, term1585.getClass(), "lastPlaceName", "nHXjMycHlU");
        setIntField(term1585, term1585.getClass(), "lastRegionId", 1745276158);
        setField(term1585, term1585.getClass(), "lastRegionName", "ieCtQFdkii");
        setField(term1585, term1585.getClass(), "lastClientId", "dEnhdmILtU");
        setField(term1585, term1585.getClass(), "lastCountryCode", "hoicvmsovO");
        setIntField(term1585, term1585.getClass(), "eventPoint", 2009020256);
        setIntField(term1585, term1585.getClass(), "totalLv", 2049577015);
        setIntField(term1585, term1585.getClass(), "lastLoginBonusDay", 1236004505);
        setIntField(term1585, term1585.getClass(), "lastSurvivalBonusDay", 1050765721);
        setIntField(term1585, term1585.getClass(), "loginBonusLv", 474518942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIconId", argTypes, term1585, args);
    }

};


