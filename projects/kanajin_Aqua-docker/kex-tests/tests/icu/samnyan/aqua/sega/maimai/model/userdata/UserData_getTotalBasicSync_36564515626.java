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

public class UserData_getTotalBasicSync_36564515626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6865;

    public UserData_getTotalBasicSync_36564515626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6869 = new Long(-7672528020740371001L);
        term6865 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term6867 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term6883 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6884 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6888 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6893 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6894 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6898 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term6865, term6865.getClass(), "id", -1154553077993834885L);
        setLongField(term6867, term6867.getClass(), "id", -2850532706972744550L);
        setField(term6867, term6867.getClass(), "extId", term6869);
        setField(term6867, term6867.getClass(), "luid", "OcJCIDNIXA");
        setIntField(term6884, term6884.getClass(), "year", 2011);
        setShortField(term6884, term6884.getClass(), "month", (short) 6);
        setShortField(term6884, term6884.getClass(), "day", (short) 26);
        setField(term6883, term6883.getClass(), "date", term6884);
        setByteField(term6888, term6888.getClass(), "hour", (byte) 22);
        setByteField(term6888, term6888.getClass(), "minute", (byte) 39);
        setByteField(term6888, term6888.getClass(), "second", (byte) 11);
        setIntField(term6888, term6888.getClass(), "nano", 686293604);
        setField(term6883, term6883.getClass(), "time", term6888);
        setField(term6867, term6867.getClass(), "registerTime", term6883);
        setIntField(term6894, term6894.getClass(), "year", 2012);
        setShortField(term6894, term6894.getClass(), "month", (short) 7);
        setShortField(term6894, term6894.getClass(), "day", (short) 21);
        setField(term6893, term6893.getClass(), "date", term6894);
        setByteField(term6898, term6898.getClass(), "hour", (byte) 13);
        setByteField(term6898, term6898.getClass(), "minute", (byte) 41);
        setByteField(term6898, term6898.getClass(), "second", (byte) 44);
        setIntField(term6898, term6898.getClass(), "nano", 394467282);
        setField(term6893, term6893.getClass(), "time", term6898);
        setField(term6867, term6867.getClass(), "accessTime", term6893);
        setField(term6865, term6865.getClass(), "card", term6867);
        setIntField(term6865, term6865.getClass(), "lastDataVersion", -460657407);
        setField(term6865, term6865.getClass(), "userName", "XfRABIFVEp");
        setIntField(term6865, term6865.getClass(), "point", 941003590);
        setIntField(term6865, term6865.getClass(), "totalPoint", -1825624890);
        setIntField(term6865, term6865.getClass(), "iconId", 413214164);
        setIntField(term6865, term6865.getClass(), "nameplateId", 355911655);
        setIntField(term6865, term6865.getClass(), "frameId", 1811833766);
        setIntField(term6865, term6865.getClass(), "trophyId", 735987104);
        setIntField(term6865, term6865.getClass(), "playCount", -1784072578);
        setIntField(term6865, term6865.getClass(), "playVsCount", 2011764585);
        setIntField(term6865, term6865.getClass(), "playSyncCount", -860680764);
        setIntField(term6865, term6865.getClass(), "winCount", -963198667);
        setIntField(term6865, term6865.getClass(), "helpCount", -1007935918);
        setIntField(term6865, term6865.getClass(), "comboCount", 1485731037);
        setIntField(term6865, term6865.getClass(), "feverCount", 1304396087);
        setIntField(term6865, term6865.getClass(), "totalHiScore", 1782600602);
        setIntField(term6865, term6865.getClass(), "totalEasyHighScore", -185892708);
        setIntField(term6865, term6865.getClass(), "totalBasicHighScore", -203163250);
        setIntField(term6865, term6865.getClass(), "totalAdvancedHighScore", 498473526);
        setIntField(term6865, term6865.getClass(), "totalExpertHighScore", 1186917020);
        setIntField(term6865, term6865.getClass(), "totalMasterHighScore", 1670041824);
        setIntField(term6865, term6865.getClass(), "totalReMasterHighScore", 2140388634);
        setIntField(term6865, term6865.getClass(), "totalHighSync", 21095258);
        setIntField(term6865, term6865.getClass(), "totalEasySync", -1793997256);
        setIntField(term6865, term6865.getClass(), "totalBasicSync", -1271598018);
        setIntField(term6865, term6865.getClass(), "totalAdvancedSync", 157967613);
        setIntField(term6865, term6865.getClass(), "totalExpertSync", 811839399);
        setIntField(term6865, term6865.getClass(), "totalMasterSync", 593962063);
        setIntField(term6865, term6865.getClass(), "totalReMasterSync", -1485826786);
        setIntField(term6865, term6865.getClass(), "playerRating", -1549952664);
        setIntField(term6865, term6865.getClass(), "highestRating", 148394188);
        setIntField(term6865, term6865.getClass(), "rankAuthTailId", 504525721);
        setField(term6865, term6865.getClass(), "eventWatchedDate", "MHGKyEnwKc");
        setField(term6865, term6865.getClass(), "webLimitDate", "ShIELyuULw");
        setIntField(term6865, term6865.getClass(), "challengeTrackPhase", 1835568392);
        setIntField(term6865, term6865.getClass(), "firstPlayBits", 457470807);
        setField(term6865, term6865.getClass(), "lastPlayDate", "IpQuOGMgmj");
        setIntField(term6865, term6865.getClass(), "lastPlaceId", -994742871);
        setField(term6865, term6865.getClass(), "lastPlaceName", "pJbnHTYrxn");
        setIntField(term6865, term6865.getClass(), "lastRegionId", -222412326);
        setField(term6865, term6865.getClass(), "lastRegionName", "iIRsCSYqXH");
        setField(term6865, term6865.getClass(), "lastClientId", "nghfqDXyCG");
        setField(term6865, term6865.getClass(), "lastCountryCode", "WBAOTqErtm");
        setIntField(term6865, term6865.getClass(), "eventPoint", -299497261);
        setIntField(term6865, term6865.getClass(), "totalLv", -23054366);
        setIntField(term6865, term6865.getClass(), "lastLoginBonusDay", 153009426);
        setIntField(term6865, term6865.getClass(), "lastSurvivalBonusDay", 185751892);
        setIntField(term6865, term6865.getClass(), "loginBonusLv", 1068256001);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalBasicSync", argTypes, term6865, args);
    }

};


