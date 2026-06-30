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

public class UserData_setTotalHighSync_18031535874 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19649;
     Object term19823;

    public UserData_setTotalHighSync_18031535874() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19653 = new Long(-7291743527973326814L);
        term19649 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term19651 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term19667 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19668 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19672 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19677 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19678 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19682 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term19649, term19649.getClass(), "id", -1333707622307134180L);
        setLongField(term19651, term19651.getClass(), "id", -4360569253593381888L);
        setField(term19651, term19651.getClass(), "extId", term19653);
        setField(term19651, term19651.getClass(), "luid", "GSOWFHMlbF");
        setIntField(term19668, term19668.getClass(), "year", 2015);
        setShortField(term19668, term19668.getClass(), "month", (short) 2);
        setShortField(term19668, term19668.getClass(), "day", (short) 1);
        setField(term19667, term19667.getClass(), "date", term19668);
        setByteField(term19672, term19672.getClass(), "hour", (byte) 11);
        setByteField(term19672, term19672.getClass(), "minute", (byte) 31);
        setByteField(term19672, term19672.getClass(), "second", (byte) 24);
        setIntField(term19672, term19672.getClass(), "nano", 461437823);
        setField(term19667, term19667.getClass(), "time", term19672);
        setField(term19651, term19651.getClass(), "registerTime", term19667);
        setIntField(term19678, term19678.getClass(), "year", 2012);
        setShortField(term19678, term19678.getClass(), "month", (short) 3);
        setShortField(term19678, term19678.getClass(), "day", (short) 12);
        setField(term19677, term19677.getClass(), "date", term19678);
        setByteField(term19682, term19682.getClass(), "hour", (byte) 0);
        setByteField(term19682, term19682.getClass(), "minute", (byte) 32);
        setByteField(term19682, term19682.getClass(), "second", (byte) 14);
        setIntField(term19682, term19682.getClass(), "nano", 342342345);
        setField(term19677, term19677.getClass(), "time", term19682);
        setField(term19651, term19651.getClass(), "accessTime", term19677);
        setField(term19649, term19649.getClass(), "card", term19651);
        setIntField(term19649, term19649.getClass(), "lastDataVersion", 1283268105);
        setField(term19649, term19649.getClass(), "userName", "vpZIqpFbKM");
        setIntField(term19649, term19649.getClass(), "point", -220552939);
        setIntField(term19649, term19649.getClass(), "totalPoint", -444257155);
        setIntField(term19649, term19649.getClass(), "iconId", -309536114);
        setIntField(term19649, term19649.getClass(), "nameplateId", 755500171);
        setIntField(term19649, term19649.getClass(), "frameId", -535062491);
        setIntField(term19649, term19649.getClass(), "trophyId", -147381920);
        setIntField(term19649, term19649.getClass(), "playCount", -7568006);
        setIntField(term19649, term19649.getClass(), "playVsCount", 1952367361);
        setIntField(term19649, term19649.getClass(), "playSyncCount", -715290594);
        setIntField(term19649, term19649.getClass(), "winCount", -860371306);
        setIntField(term19649, term19649.getClass(), "helpCount", -125626789);
        setIntField(term19649, term19649.getClass(), "comboCount", -309827965);
        setIntField(term19649, term19649.getClass(), "feverCount", -1534471014);
        setIntField(term19649, term19649.getClass(), "totalHiScore", -468720148);
        setIntField(term19649, term19649.getClass(), "totalEasyHighScore", 164755425);
        setIntField(term19649, term19649.getClass(), "totalBasicHighScore", 205469595);
        setIntField(term19649, term19649.getClass(), "totalAdvancedHighScore", -638606539);
        setIntField(term19649, term19649.getClass(), "totalExpertHighScore", -172607907);
        setIntField(term19649, term19649.getClass(), "totalMasterHighScore", 182656750);
        setIntField(term19649, term19649.getClass(), "totalReMasterHighScore", -51407538);
        setIntField(term19649, term19649.getClass(), "totalHighSync", -465783748);
        setIntField(term19649, term19649.getClass(), "totalEasySync", 1780832439);
        setIntField(term19649, term19649.getClass(), "totalBasicSync", 1781593194);
        setIntField(term19649, term19649.getClass(), "totalAdvancedSync", -929366947);
        setIntField(term19649, term19649.getClass(), "totalExpertSync", -10579292);
        setIntField(term19649, term19649.getClass(), "totalMasterSync", 2042788478);
        setIntField(term19649, term19649.getClass(), "totalReMasterSync", -620591021);
        setIntField(term19649, term19649.getClass(), "playerRating", -766656824);
        setIntField(term19649, term19649.getClass(), "highestRating", 137514813);
        setIntField(term19649, term19649.getClass(), "rankAuthTailId", -590298353);
        setField(term19649, term19649.getClass(), "eventWatchedDate", "dAbwpJCDif");
        setField(term19649, term19649.getClass(), "webLimitDate", "ATSXJPySio");
        setIntField(term19649, term19649.getClass(), "challengeTrackPhase", -917544425);
        setIntField(term19649, term19649.getClass(), "firstPlayBits", -1044762733);
        setField(term19649, term19649.getClass(), "lastPlayDate", "XZkOUcbfFg");
        setIntField(term19649, term19649.getClass(), "lastPlaceId", 446184231);
        setField(term19649, term19649.getClass(), "lastPlaceName", "TGiJfagfky");
        setIntField(term19649, term19649.getClass(), "lastRegionId", 1313599240);
        setField(term19649, term19649.getClass(), "lastRegionName", "BJklinBmhN");
        setField(term19649, term19649.getClass(), "lastClientId", "IOddzvEWcl");
        setField(term19649, term19649.getClass(), "lastCountryCode", "bIrtpkYJWT");
        setIntField(term19649, term19649.getClass(), "eventPoint", 1889501733);
        setIntField(term19649, term19649.getClass(), "totalLv", 1316243148);
        setIntField(term19649, term19649.getClass(), "lastLoginBonusDay", 1524913540);
        setIntField(term19649, term19649.getClass(), "lastSurvivalBonusDay", -1924743705);
        setIntField(term19649, term19649.getClass(), "loginBonusLv", -1829672767);
        term19823 = new Integer(-311098933);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term19823;
        callMethod(klass, "setTotalHighSync", argTypes, term19649, args);
    }

};


