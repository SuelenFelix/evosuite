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

public class UserPresentEvent_toString_33526780316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101229;

    public UserPresentEvent_toString_33526780316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term101235 = new Long(6465987664600701876L);
        term101229 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPresentEvent"));
        Object term101231 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term101233 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term101249 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term101250 = newInstance(Class.forName("java.time.LocalDate"));
        Object term101254 = newInstance(Class.forName("java.time.LocalTime"));
        Object term101259 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term101260 = newInstance(Class.forName("java.time.LocalDate"));
        Object term101264 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term101229, term101229.getClass(), "id", 4496648256608157890L);
        setLongField(term101231, term101231.getClass(), "id", 3615978191092655321L);
        setLongField(term101233, term101233.getClass(), "id", -8950106037310251203L);
        setField(term101233, term101233.getClass(), "extId", term101235);
        setField(term101233, term101233.getClass(), "luid", "PadBNsKGSM");
        setIntField(term101250, term101250.getClass(), "year", 2014);
        setShortField(term101250, term101250.getClass(), "month", (short) 12);
        setShortField(term101250, term101250.getClass(), "day", (short) 28);
        setField(term101249, term101249.getClass(), "date", term101250);
        setByteField(term101254, term101254.getClass(), "hour", (byte) 2);
        setByteField(term101254, term101254.getClass(), "minute", (byte) 44);
        setByteField(term101254, term101254.getClass(), "second", (byte) 18);
        setIntField(term101254, term101254.getClass(), "nano", 39913942);
        setField(term101249, term101249.getClass(), "time", term101254);
        setField(term101233, term101233.getClass(), "registerTime", term101249);
        setIntField(term101260, term101260.getClass(), "year", 2020);
        setShortField(term101260, term101260.getClass(), "month", (short) 11);
        setShortField(term101260, term101260.getClass(), "day", (short) 29);
        setField(term101259, term101259.getClass(), "date", term101260);
        setByteField(term101264, term101264.getClass(), "hour", (byte) 0);
        setByteField(term101264, term101264.getClass(), "minute", (byte) 40);
        setByteField(term101264, term101264.getClass(), "second", (byte) 23);
        setIntField(term101264, term101264.getClass(), "nano", 204732115);
        setField(term101259, term101259.getClass(), "time", term101264);
        setField(term101233, term101233.getClass(), "accessTime", term101259);
        setField(term101231, term101231.getClass(), "card", term101233);
        setIntField(term101231, term101231.getClass(), "lastDataVersion", 1883178473);
        setField(term101231, term101231.getClass(), "userName", "BqLgONTWcn");
        setIntField(term101231, term101231.getClass(), "point", -1873487804);
        setIntField(term101231, term101231.getClass(), "totalPoint", 338162762);
        setIntField(term101231, term101231.getClass(), "iconId", -2029988360);
        setIntField(term101231, term101231.getClass(), "nameplateId", 985415961);
        setIntField(term101231, term101231.getClass(), "frameId", 1163437479);
        setIntField(term101231, term101231.getClass(), "trophyId", 446404576);
        setIntField(term101231, term101231.getClass(), "playCount", -250771991);
        setIntField(term101231, term101231.getClass(), "playVsCount", -87432188);
        setIntField(term101231, term101231.getClass(), "playSyncCount", 1028623562);
        setIntField(term101231, term101231.getClass(), "winCount", 731074367);
        setIntField(term101231, term101231.getClass(), "helpCount", 969220339);
        setIntField(term101231, term101231.getClass(), "comboCount", 78410083);
        setIntField(term101231, term101231.getClass(), "feverCount", -1308398792);
        setIntField(term101231, term101231.getClass(), "totalHiScore", 1624205154);
        setIntField(term101231, term101231.getClass(), "totalEasyHighScore", 872444404);
        setIntField(term101231, term101231.getClass(), "totalBasicHighScore", 1400687352);
        setIntField(term101231, term101231.getClass(), "totalAdvancedHighScore", 1391309255);
        setIntField(term101231, term101231.getClass(), "totalExpertHighScore", 437885281);
        setIntField(term101231, term101231.getClass(), "totalMasterHighScore", 1144296384);
        setIntField(term101231, term101231.getClass(), "totalReMasterHighScore", 375541509);
        setIntField(term101231, term101231.getClass(), "totalHighSync", 1549543162);
        setIntField(term101231, term101231.getClass(), "totalEasySync", -893278459);
        setIntField(term101231, term101231.getClass(), "totalBasicSync", -2086759387);
        setIntField(term101231, term101231.getClass(), "totalAdvancedSync", -1639130879);
        setIntField(term101231, term101231.getClass(), "totalExpertSync", -1439372378);
        setIntField(term101231, term101231.getClass(), "totalMasterSync", -1838240610);
        setIntField(term101231, term101231.getClass(), "totalReMasterSync", 676840233);
        setIntField(term101231, term101231.getClass(), "playerRating", -125724279);
        setIntField(term101231, term101231.getClass(), "highestRating", -1125931561);
        setIntField(term101231, term101231.getClass(), "rankAuthTailId", -1395442669);
        setField(term101231, term101231.getClass(), "eventWatchedDate", "QyyvfuUsSl");
        setField(term101231, term101231.getClass(), "webLimitDate", "urXLfQoyuc");
        setIntField(term101231, term101231.getClass(), "challengeTrackPhase", 868823701);
        setIntField(term101231, term101231.getClass(), "firstPlayBits", 588180);
        setField(term101231, term101231.getClass(), "lastPlayDate", "KoWkwRBvcY");
        setIntField(term101231, term101231.getClass(), "lastPlaceId", 1798567411);
        setField(term101231, term101231.getClass(), "lastPlaceName", "kqDHOsurKa");
        setIntField(term101231, term101231.getClass(), "lastRegionId", -1507879623);
        setField(term101231, term101231.getClass(), "lastRegionName", "NCqNKzmHkE");
        setField(term101231, term101231.getClass(), "lastClientId", "eFSnWGCXQK");
        setField(term101231, term101231.getClass(), "lastCountryCode", "GrrqChmbDB");
        setIntField(term101231, term101231.getClass(), "eventPoint", 727263670);
        setIntField(term101231, term101231.getClass(), "totalLv", -2042954517);
        setIntField(term101231, term101231.getClass(), "lastLoginBonusDay", -1585735136);
        setIntField(term101231, term101231.getClass(), "lastSurvivalBonusDay", -202469528);
        setIntField(term101231, term101231.getClass(), "loginBonusLv", -1147825822);
        setField(term101229, term101229.getClass(), "user", term101231);
        setIntField(term101229, term101229.getClass(), "presentEventId", -192227369);
        setIntField(term101229, term101229.getClass(), "point", 1203299299);
        setIntField(term101229, term101229.getClass(), "presentCount", -115406772);
        setIntField(term101229, term101229.getClass(), "rate", -1194681287);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPresentEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term101229, args);
    }

};


