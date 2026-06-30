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

public class UserData_getTotalAdvancedSync_83910094027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7129;

    public UserData_getTotalAdvancedSync_83910094027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7133 = new Long(-4502405999831680926L);
        term7129 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term7131 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term7147 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7148 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7152 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7157 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7158 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7162 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term7129, term7129.getClass(), "id", -2644215923136513282L);
        setLongField(term7131, term7131.getClass(), "id", -1468719814009985452L);
        setField(term7131, term7131.getClass(), "extId", term7133);
        setField(term7131, term7131.getClass(), "luid", "PqtVXXZMqK");
        setIntField(term7148, term7148.getClass(), "year", 2025);
        setShortField(term7148, term7148.getClass(), "month", (short) 9);
        setShortField(term7148, term7148.getClass(), "day", (short) 25);
        setField(term7147, term7147.getClass(), "date", term7148);
        setByteField(term7152, term7152.getClass(), "hour", (byte) 20);
        setByteField(term7152, term7152.getClass(), "minute", (byte) 0);
        setByteField(term7152, term7152.getClass(), "second", (byte) 25);
        setIntField(term7152, term7152.getClass(), "nano", 65871584);
        setField(term7147, term7147.getClass(), "time", term7152);
        setField(term7131, term7131.getClass(), "registerTime", term7147);
        setIntField(term7158, term7158.getClass(), "year", 2011);
        setShortField(term7158, term7158.getClass(), "month", (short) 9);
        setShortField(term7158, term7158.getClass(), "day", (short) 25);
        setField(term7157, term7157.getClass(), "date", term7158);
        setByteField(term7162, term7162.getClass(), "hour", (byte) 16);
        setByteField(term7162, term7162.getClass(), "minute", (byte) 45);
        setByteField(term7162, term7162.getClass(), "second", (byte) 19);
        setIntField(term7162, term7162.getClass(), "nano", 962864785);
        setField(term7157, term7157.getClass(), "time", term7162);
        setField(term7131, term7131.getClass(), "accessTime", term7157);
        setField(term7129, term7129.getClass(), "card", term7131);
        setIntField(term7129, term7129.getClass(), "lastDataVersion", 1139078354);
        setField(term7129, term7129.getClass(), "userName", "rYbtIDVdnd");
        setIntField(term7129, term7129.getClass(), "point", -691164974);
        setIntField(term7129, term7129.getClass(), "totalPoint", -761675396);
        setIntField(term7129, term7129.getClass(), "iconId", -1954860951);
        setIntField(term7129, term7129.getClass(), "nameplateId", -2078879114);
        setIntField(term7129, term7129.getClass(), "frameId", -1186882318);
        setIntField(term7129, term7129.getClass(), "trophyId", 1077647088);
        setIntField(term7129, term7129.getClass(), "playCount", -705176810);
        setIntField(term7129, term7129.getClass(), "playVsCount", -1584779593);
        setIntField(term7129, term7129.getClass(), "playSyncCount", 303007547);
        setIntField(term7129, term7129.getClass(), "winCount", 1498738343);
        setIntField(term7129, term7129.getClass(), "helpCount", -1635571857);
        setIntField(term7129, term7129.getClass(), "comboCount", 1407309162);
        setIntField(term7129, term7129.getClass(), "feverCount", -534033672);
        setIntField(term7129, term7129.getClass(), "totalHiScore", -1162790806);
        setIntField(term7129, term7129.getClass(), "totalEasyHighScore", -1264595049);
        setIntField(term7129, term7129.getClass(), "totalBasicHighScore", -2058884635);
        setIntField(term7129, term7129.getClass(), "totalAdvancedHighScore", 1064185088);
        setIntField(term7129, term7129.getClass(), "totalExpertHighScore", -1249782654);
        setIntField(term7129, term7129.getClass(), "totalMasterHighScore", 399302934);
        setIntField(term7129, term7129.getClass(), "totalReMasterHighScore", -1823255084);
        setIntField(term7129, term7129.getClass(), "totalHighSync", 793345010);
        setIntField(term7129, term7129.getClass(), "totalEasySync", -2092117838);
        setIntField(term7129, term7129.getClass(), "totalBasicSync", 1524590776);
        setIntField(term7129, term7129.getClass(), "totalAdvancedSync", 1523896653);
        setIntField(term7129, term7129.getClass(), "totalExpertSync", -1731921726);
        setIntField(term7129, term7129.getClass(), "totalMasterSync", 919994471);
        setIntField(term7129, term7129.getClass(), "totalReMasterSync", 183531701);
        setIntField(term7129, term7129.getClass(), "playerRating", -974923743);
        setIntField(term7129, term7129.getClass(), "highestRating", 1876738932);
        setIntField(term7129, term7129.getClass(), "rankAuthTailId", -1870339027);
        setField(term7129, term7129.getClass(), "eventWatchedDate", "UKAReurpHG");
        setField(term7129, term7129.getClass(), "webLimitDate", "WVRMUmrljA");
        setIntField(term7129, term7129.getClass(), "challengeTrackPhase", -1549603566);
        setIntField(term7129, term7129.getClass(), "firstPlayBits", 1077223540);
        setField(term7129, term7129.getClass(), "lastPlayDate", "NTlKJDDWlk");
        setIntField(term7129, term7129.getClass(), "lastPlaceId", -1823813592);
        setField(term7129, term7129.getClass(), "lastPlaceName", "vOuMEpOQAg");
        setIntField(term7129, term7129.getClass(), "lastRegionId", -1644358555);
        setField(term7129, term7129.getClass(), "lastRegionName", "SIODFGaQhr");
        setField(term7129, term7129.getClass(), "lastClientId", "qYzsiuXOgS");
        setField(term7129, term7129.getClass(), "lastCountryCode", "bxrCBbrrct");
        setIntField(term7129, term7129.getClass(), "eventPoint", -388591034);
        setIntField(term7129, term7129.getClass(), "totalLv", -1270258033);
        setIntField(term7129, term7129.getClass(), "lastLoginBonusDay", 1677994069);
        setIntField(term7129, term7129.getClass(), "lastSurvivalBonusDay", -439999692);
        setIntField(term7129, term7129.getClass(), "loginBonusLv", 924095007);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalAdvancedSync", argTypes, term7129, args);
    }

};


