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

public class UserData_setTotalBasicHighScore_13363821169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18319;
     Object term18493;

    public UserData_setTotalBasicHighScore_13363821169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18323 = new Long(-5248475803419977214L);
        term18319 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term18321 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term18337 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18338 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18342 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18347 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18348 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18352 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term18319, term18319.getClass(), "id", -7115418542247301000L);
        setLongField(term18321, term18321.getClass(), "id", 8034714140377562739L);
        setField(term18321, term18321.getClass(), "extId", term18323);
        setField(term18321, term18321.getClass(), "luid", "rQjxAhisjm");
        setIntField(term18338, term18338.getClass(), "year", 2029);
        setShortField(term18338, term18338.getClass(), "month", (short) 5);
        setShortField(term18338, term18338.getClass(), "day", (short) 11);
        setField(term18337, term18337.getClass(), "date", term18338);
        setByteField(term18342, term18342.getClass(), "hour", (byte) 20);
        setByteField(term18342, term18342.getClass(), "minute", (byte) 17);
        setByteField(term18342, term18342.getClass(), "second", (byte) 32);
        setIntField(term18342, term18342.getClass(), "nano", 327503582);
        setField(term18337, term18337.getClass(), "time", term18342);
        setField(term18321, term18321.getClass(), "registerTime", term18337);
        setIntField(term18348, term18348.getClass(), "year", 2012);
        setShortField(term18348, term18348.getClass(), "month", (short) 10);
        setShortField(term18348, term18348.getClass(), "day", (short) 1);
        setField(term18347, term18347.getClass(), "date", term18348);
        setByteField(term18352, term18352.getClass(), "hour", (byte) 9);
        setByteField(term18352, term18352.getClass(), "minute", (byte) 27);
        setByteField(term18352, term18352.getClass(), "second", (byte) 33);
        setIntField(term18352, term18352.getClass(), "nano", 714912000);
        setField(term18347, term18347.getClass(), "time", term18352);
        setField(term18321, term18321.getClass(), "accessTime", term18347);
        setField(term18319, term18319.getClass(), "card", term18321);
        setIntField(term18319, term18319.getClass(), "lastDataVersion", -482193296);
        setField(term18319, term18319.getClass(), "userName", "ZDhASPHjDG");
        setIntField(term18319, term18319.getClass(), "point", 1506869786);
        setIntField(term18319, term18319.getClass(), "totalPoint", 950749769);
        setIntField(term18319, term18319.getClass(), "iconId", 1497396124);
        setIntField(term18319, term18319.getClass(), "nameplateId", 1013816325);
        setIntField(term18319, term18319.getClass(), "frameId", -756785345);
        setIntField(term18319, term18319.getClass(), "trophyId", -1077451707);
        setIntField(term18319, term18319.getClass(), "playCount", -580180892);
        setIntField(term18319, term18319.getClass(), "playVsCount", 862135498);
        setIntField(term18319, term18319.getClass(), "playSyncCount", -1640521852);
        setIntField(term18319, term18319.getClass(), "winCount", 1999560627);
        setIntField(term18319, term18319.getClass(), "helpCount", 93344937);
        setIntField(term18319, term18319.getClass(), "comboCount", 1426545044);
        setIntField(term18319, term18319.getClass(), "feverCount", -2114135536);
        setIntField(term18319, term18319.getClass(), "totalHiScore", -1934156754);
        setIntField(term18319, term18319.getClass(), "totalEasyHighScore", -2122545415);
        setIntField(term18319, term18319.getClass(), "totalBasicHighScore", 45477597);
        setIntField(term18319, term18319.getClass(), "totalAdvancedHighScore", 702851889);
        setIntField(term18319, term18319.getClass(), "totalExpertHighScore", 2035373298);
        setIntField(term18319, term18319.getClass(), "totalMasterHighScore", 1328311779);
        setIntField(term18319, term18319.getClass(), "totalReMasterHighScore", -1459351662);
        setIntField(term18319, term18319.getClass(), "totalHighSync", -887392605);
        setIntField(term18319, term18319.getClass(), "totalEasySync", 1813573586);
        setIntField(term18319, term18319.getClass(), "totalBasicSync", -1950105121);
        setIntField(term18319, term18319.getClass(), "totalAdvancedSync", 1664370474);
        setIntField(term18319, term18319.getClass(), "totalExpertSync", 56756754);
        setIntField(term18319, term18319.getClass(), "totalMasterSync", -1283242129);
        setIntField(term18319, term18319.getClass(), "totalReMasterSync", -1400827537);
        setIntField(term18319, term18319.getClass(), "playerRating", 1630959866);
        setIntField(term18319, term18319.getClass(), "highestRating", 414147550);
        setIntField(term18319, term18319.getClass(), "rankAuthTailId", 1652909222);
        setField(term18319, term18319.getClass(), "eventWatchedDate", "HNVOAXYNEZ");
        setField(term18319, term18319.getClass(), "webLimitDate", "gbbYBYyfvr");
        setIntField(term18319, term18319.getClass(), "challengeTrackPhase", 1130098561);
        setIntField(term18319, term18319.getClass(), "firstPlayBits", 954169543);
        setField(term18319, term18319.getClass(), "lastPlayDate", "SrWMUlbtWV");
        setIntField(term18319, term18319.getClass(), "lastPlaceId", -2124307939);
        setField(term18319, term18319.getClass(), "lastPlaceName", "VePIumgrrU");
        setIntField(term18319, term18319.getClass(), "lastRegionId", 332880714);
        setField(term18319, term18319.getClass(), "lastRegionName", "DPwIqlszZo");
        setField(term18319, term18319.getClass(), "lastClientId", "mNgDshwZNc");
        setField(term18319, term18319.getClass(), "lastCountryCode", "pDqgDbJoFw");
        setIntField(term18319, term18319.getClass(), "eventPoint", 904733719);
        setIntField(term18319, term18319.getClass(), "totalLv", -240576356);
        setIntField(term18319, term18319.getClass(), "lastLoginBonusDay", 148921829);
        setIntField(term18319, term18319.getClass(), "lastSurvivalBonusDay", 2076458515);
        setIntField(term18319, term18319.getClass(), "loginBonusLv", 622248745);
        term18493 = new Integer(-33243170);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term18493;
        callMethod(klass, "setTotalBasicHighScore", argTypes, term18319, args);
    }

};


