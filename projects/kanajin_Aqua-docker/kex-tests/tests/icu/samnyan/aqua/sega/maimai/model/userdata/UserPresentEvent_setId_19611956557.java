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

public class UserPresentEvent_setId_19611956557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98523;
     Object term98703;

    public UserPresentEvent_setId_19611956557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term98529 = new Long(3086974592680165932L);
        term98523 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPresentEvent"));
        Object term98525 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term98527 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term98543 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term98544 = newInstance(Class.forName("java.time.LocalDate"));
        Object term98548 = newInstance(Class.forName("java.time.LocalTime"));
        Object term98553 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term98554 = newInstance(Class.forName("java.time.LocalDate"));
        Object term98558 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term98523, term98523.getClass(), "id", 3505714875198206555L);
        setLongField(term98525, term98525.getClass(), "id", 4923049398658802749L);
        setLongField(term98527, term98527.getClass(), "id", -6994512078037182768L);
        setField(term98527, term98527.getClass(), "extId", term98529);
        setField(term98527, term98527.getClass(), "luid", "AAzuYrqTRq");
        setIntField(term98544, term98544.getClass(), "year", 2013);
        setShortField(term98544, term98544.getClass(), "month", (short) 9);
        setShortField(term98544, term98544.getClass(), "day", (short) 14);
        setField(term98543, term98543.getClass(), "date", term98544);
        setByteField(term98548, term98548.getClass(), "hour", (byte) 18);
        setByteField(term98548, term98548.getClass(), "minute", (byte) 10);
        setByteField(term98548, term98548.getClass(), "second", (byte) 39);
        setIntField(term98548, term98548.getClass(), "nano", 650634905);
        setField(term98543, term98543.getClass(), "time", term98548);
        setField(term98527, term98527.getClass(), "registerTime", term98543);
        setIntField(term98554, term98554.getClass(), "year", 2012);
        setShortField(term98554, term98554.getClass(), "month", (short) 8);
        setShortField(term98554, term98554.getClass(), "day", (short) 8);
        setField(term98553, term98553.getClass(), "date", term98554);
        setByteField(term98558, term98558.getClass(), "hour", (byte) 5);
        setByteField(term98558, term98558.getClass(), "minute", (byte) 3);
        setByteField(term98558, term98558.getClass(), "second", (byte) 9);
        setIntField(term98558, term98558.getClass(), "nano", 246856443);
        setField(term98553, term98553.getClass(), "time", term98558);
        setField(term98527, term98527.getClass(), "accessTime", term98553);
        setField(term98525, term98525.getClass(), "card", term98527);
        setIntField(term98525, term98525.getClass(), "lastDataVersion", -1442537584);
        setField(term98525, term98525.getClass(), "userName", "cUQuwEPzJb");
        setIntField(term98525, term98525.getClass(), "point", -111918563);
        setIntField(term98525, term98525.getClass(), "totalPoint", 113698873);
        setIntField(term98525, term98525.getClass(), "iconId", 885365328);
        setIntField(term98525, term98525.getClass(), "nameplateId", 1334307126);
        setIntField(term98525, term98525.getClass(), "frameId", -417895120);
        setIntField(term98525, term98525.getClass(), "trophyId", -1331264461);
        setIntField(term98525, term98525.getClass(), "playCount", 1127958182);
        setIntField(term98525, term98525.getClass(), "playVsCount", -1458096235);
        setIntField(term98525, term98525.getClass(), "playSyncCount", -1573651514);
        setIntField(term98525, term98525.getClass(), "winCount", 442927197);
        setIntField(term98525, term98525.getClass(), "helpCount", 917288340);
        setIntField(term98525, term98525.getClass(), "comboCount", -2012928539);
        setIntField(term98525, term98525.getClass(), "feverCount", 353624133);
        setIntField(term98525, term98525.getClass(), "totalHiScore", 1458847382);
        setIntField(term98525, term98525.getClass(), "totalEasyHighScore", 1897651561);
        setIntField(term98525, term98525.getClass(), "totalBasicHighScore", -206624818);
        setIntField(term98525, term98525.getClass(), "totalAdvancedHighScore", -1493843544);
        setIntField(term98525, term98525.getClass(), "totalExpertHighScore", 1146894465);
        setIntField(term98525, term98525.getClass(), "totalMasterHighScore", 1655601907);
        setIntField(term98525, term98525.getClass(), "totalReMasterHighScore", 386717026);
        setIntField(term98525, term98525.getClass(), "totalHighSync", -1122137505);
        setIntField(term98525, term98525.getClass(), "totalEasySync", -1610088806);
        setIntField(term98525, term98525.getClass(), "totalBasicSync", 1370330366);
        setIntField(term98525, term98525.getClass(), "totalAdvancedSync", -1370258867);
        setIntField(term98525, term98525.getClass(), "totalExpertSync", -549158541);
        setIntField(term98525, term98525.getClass(), "totalMasterSync", -1505813367);
        setIntField(term98525, term98525.getClass(), "totalReMasterSync", 1794847769);
        setIntField(term98525, term98525.getClass(), "playerRating", 752849995);
        setIntField(term98525, term98525.getClass(), "highestRating", -896577043);
        setIntField(term98525, term98525.getClass(), "rankAuthTailId", -1212408134);
        setField(term98525, term98525.getClass(), "eventWatchedDate", "sqPZeXSusM");
        setField(term98525, term98525.getClass(), "webLimitDate", "mUCxMstoOT");
        setIntField(term98525, term98525.getClass(), "challengeTrackPhase", 986010271);
        setIntField(term98525, term98525.getClass(), "firstPlayBits", -1598534439);
        setField(term98525, term98525.getClass(), "lastPlayDate", "LroMhmrHbv");
        setIntField(term98525, term98525.getClass(), "lastPlaceId", -1043159944);
        setField(term98525, term98525.getClass(), "lastPlaceName", "nUWkEhozFC");
        setIntField(term98525, term98525.getClass(), "lastRegionId", 68900141);
        setField(term98525, term98525.getClass(), "lastRegionName", "cZOLUZUhxQ");
        setField(term98525, term98525.getClass(), "lastClientId", "fXCybRqtsq");
        setField(term98525, term98525.getClass(), "lastCountryCode", "gPhmseJiob");
        setIntField(term98525, term98525.getClass(), "eventPoint", 875120885);
        setIntField(term98525, term98525.getClass(), "totalLv", 219806255);
        setIntField(term98525, term98525.getClass(), "lastLoginBonusDay", -78303419);
        setIntField(term98525, term98525.getClass(), "lastSurvivalBonusDay", -34443382);
        setIntField(term98525, term98525.getClass(), "loginBonusLv", -1880409584);
        setField(term98523, term98523.getClass(), "user", term98525);
        setIntField(term98523, term98523.getClass(), "presentEventId", -1950497940);
        setIntField(term98523, term98523.getClass(), "point", -1513594834);
        setIntField(term98523, term98523.getClass(), "presentCount", -222476680);
        setIntField(term98523, term98523.getClass(), "rate", 714687545);
        term98703 = new Long(-7497758874949135776L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPresentEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term98703;
        callMethod(klass, "setId", argTypes, term98523, args);
    }

};


