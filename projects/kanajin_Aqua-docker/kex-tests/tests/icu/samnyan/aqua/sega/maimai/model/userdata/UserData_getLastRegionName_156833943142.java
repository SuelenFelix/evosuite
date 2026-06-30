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

public class UserData_getLastRegionName_156833943142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11089;

    public UserData_getLastRegionName_156833943142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11093 = new Long(-6292278961887936280L);
        term11089 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term11091 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term11107 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11108 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11112 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11117 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11118 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11122 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term11089, term11089.getClass(), "id", -8652538484981166496L);
        setLongField(term11091, term11091.getClass(), "id", 2701184207686293431L);
        setField(term11091, term11091.getClass(), "extId", term11093);
        setField(term11091, term11091.getClass(), "luid", "IEYhJmgCVd");
        setIntField(term11108, term11108.getClass(), "year", 2020);
        setShortField(term11108, term11108.getClass(), "month", (short) 5);
        setShortField(term11108, term11108.getClass(), "day", (short) 12);
        setField(term11107, term11107.getClass(), "date", term11108);
        setByteField(term11112, term11112.getClass(), "hour", (byte) 0);
        setByteField(term11112, term11112.getClass(), "minute", (byte) 15);
        setByteField(term11112, term11112.getClass(), "second", (byte) 24);
        setIntField(term11112, term11112.getClass(), "nano", 250257744);
        setField(term11107, term11107.getClass(), "time", term11112);
        setField(term11091, term11091.getClass(), "registerTime", term11107);
        setIntField(term11118, term11118.getClass(), "year", 2013);
        setShortField(term11118, term11118.getClass(), "month", (short) 9);
        setShortField(term11118, term11118.getClass(), "day", (short) 19);
        setField(term11117, term11117.getClass(), "date", term11118);
        setByteField(term11122, term11122.getClass(), "hour", (byte) 12);
        setByteField(term11122, term11122.getClass(), "minute", (byte) 29);
        setByteField(term11122, term11122.getClass(), "second", (byte) 28);
        setIntField(term11122, term11122.getClass(), "nano", 244069764);
        setField(term11117, term11117.getClass(), "time", term11122);
        setField(term11091, term11091.getClass(), "accessTime", term11117);
        setField(term11089, term11089.getClass(), "card", term11091);
        setIntField(term11089, term11089.getClass(), "lastDataVersion", 218346781);
        setField(term11089, term11089.getClass(), "userName", "KSJeYkkvpk");
        setIntField(term11089, term11089.getClass(), "point", -984660976);
        setIntField(term11089, term11089.getClass(), "totalPoint", -1419341969);
        setIntField(term11089, term11089.getClass(), "iconId", -89522625);
        setIntField(term11089, term11089.getClass(), "nameplateId", 1475906894);
        setIntField(term11089, term11089.getClass(), "frameId", -2004794532);
        setIntField(term11089, term11089.getClass(), "trophyId", 1232958763);
        setIntField(term11089, term11089.getClass(), "playCount", -1702132549);
        setIntField(term11089, term11089.getClass(), "playVsCount", -1786136772);
        setIntField(term11089, term11089.getClass(), "playSyncCount", -1510967747);
        setIntField(term11089, term11089.getClass(), "winCount", -2014792457);
        setIntField(term11089, term11089.getClass(), "helpCount", 1957633116);
        setIntField(term11089, term11089.getClass(), "comboCount", 1428598210);
        setIntField(term11089, term11089.getClass(), "feverCount", 1071776561);
        setIntField(term11089, term11089.getClass(), "totalHiScore", 1846399918);
        setIntField(term11089, term11089.getClass(), "totalEasyHighScore", 35388821);
        setIntField(term11089, term11089.getClass(), "totalBasicHighScore", -598803400);
        setIntField(term11089, term11089.getClass(), "totalAdvancedHighScore", 25560022);
        setIntField(term11089, term11089.getClass(), "totalExpertHighScore", -1090136985);
        setIntField(term11089, term11089.getClass(), "totalMasterHighScore", -355574894);
        setIntField(term11089, term11089.getClass(), "totalReMasterHighScore", 1866941633);
        setIntField(term11089, term11089.getClass(), "totalHighSync", 1697296048);
        setIntField(term11089, term11089.getClass(), "totalEasySync", 1302075623);
        setIntField(term11089, term11089.getClass(), "totalBasicSync", 1238707613);
        setIntField(term11089, term11089.getClass(), "totalAdvancedSync", 1961351136);
        setIntField(term11089, term11089.getClass(), "totalExpertSync", -1546528470);
        setIntField(term11089, term11089.getClass(), "totalMasterSync", -1518971561);
        setIntField(term11089, term11089.getClass(), "totalReMasterSync", 1513663171);
        setIntField(term11089, term11089.getClass(), "playerRating", 1527034193);
        setIntField(term11089, term11089.getClass(), "highestRating", 1309545946);
        setIntField(term11089, term11089.getClass(), "rankAuthTailId", -1457812682);
        setField(term11089, term11089.getClass(), "eventWatchedDate", "qUtkFGMNUV");
        setField(term11089, term11089.getClass(), "webLimitDate", "mGRiYhnMcR");
        setIntField(term11089, term11089.getClass(), "challengeTrackPhase", -161850441);
        setIntField(term11089, term11089.getClass(), "firstPlayBits", 1486351894);
        setField(term11089, term11089.getClass(), "lastPlayDate", "NFlvfJCVPO");
        setIntField(term11089, term11089.getClass(), "lastPlaceId", 1352463113);
        setField(term11089, term11089.getClass(), "lastPlaceName", "KarbTXFmUU");
        setIntField(term11089, term11089.getClass(), "lastRegionId", 897269648);
        setField(term11089, term11089.getClass(), "lastRegionName", "jiUSjqwSIQ");
        setField(term11089, term11089.getClass(), "lastClientId", "MgLCedQfoj");
        setField(term11089, term11089.getClass(), "lastCountryCode", "zgKiINdgNu");
        setIntField(term11089, term11089.getClass(), "eventPoint", -1020664075);
        setIntField(term11089, term11089.getClass(), "totalLv", -1412100145);
        setIntField(term11089, term11089.getClass(), "lastLoginBonusDay", -1702355599);
        setIntField(term11089, term11089.getClass(), "lastSurvivalBonusDay", -1477091217);
        setIntField(term11089, term11089.getClass(), "loginBonusLv", 2023226154);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRegionName", argTypes, term11089, args);
    }

};


