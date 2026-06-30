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

public class UserGeneralData_canEqual_80528206810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111122;
     Object term111322;

    public UserGeneralData_canEqual_80528206810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term111128 = new Long(3731931947533293029L);
        term111122 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserGeneralData"));
        Object term111124 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term111126 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term111142 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term111143 = newInstance(Class.forName("java.time.LocalDate"));
        Object term111147 = newInstance(Class.forName("java.time.LocalTime"));
        Object term111152 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term111153 = newInstance(Class.forName("java.time.LocalDate"));
        Object term111157 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term111122, term111122.getClass(), "id", -6690821836959514088L);
        setLongField(term111124, term111124.getClass(), "id", 5914687538634916345L);
        setLongField(term111126, term111126.getClass(), "id", -1596611740124054468L);
        setField(term111126, term111126.getClass(), "extId", term111128);
        setField(term111126, term111126.getClass(), "luid", "EElRQZBfvW");
        setIntField(term111143, term111143.getClass(), "year", 2017);
        setShortField(term111143, term111143.getClass(), "month", (short) 2);
        setShortField(term111143, term111143.getClass(), "day", (short) 9);
        setField(term111142, term111142.getClass(), "date", term111143);
        setByteField(term111147, term111147.getClass(), "hour", (byte) 16);
        setByteField(term111147, term111147.getClass(), "minute", (byte) 11);
        setByteField(term111147, term111147.getClass(), "second", (byte) 59);
        setIntField(term111147, term111147.getClass(), "nano", 660290526);
        setField(term111142, term111142.getClass(), "time", term111147);
        setField(term111126, term111126.getClass(), "registerTime", term111142);
        setIntField(term111153, term111153.getClass(), "year", 2013);
        setShortField(term111153, term111153.getClass(), "month", (short) 8);
        setShortField(term111153, term111153.getClass(), "day", (short) 19);
        setField(term111152, term111152.getClass(), "date", term111153);
        setByteField(term111157, term111157.getClass(), "hour", (byte) 23);
        setByteField(term111157, term111157.getClass(), "minute", (byte) 0);
        setByteField(term111157, term111157.getClass(), "second", (byte) 13);
        setIntField(term111157, term111157.getClass(), "nano", 134992386);
        setField(term111152, term111152.getClass(), "time", term111157);
        setField(term111126, term111126.getClass(), "accessTime", term111152);
        setField(term111124, term111124.getClass(), "card", term111126);
        setIntField(term111124, term111124.getClass(), "lastDataVersion", -2093469163);
        setField(term111124, term111124.getClass(), "userName", "grlbPsQxaR");
        setIntField(term111124, term111124.getClass(), "point", 2114441505);
        setIntField(term111124, term111124.getClass(), "totalPoint", -283724340);
        setIntField(term111124, term111124.getClass(), "iconId", 146472146);
        setIntField(term111124, term111124.getClass(), "nameplateId", -1390379615);
        setIntField(term111124, term111124.getClass(), "frameId", 1515664005);
        setIntField(term111124, term111124.getClass(), "trophyId", 249348540);
        setIntField(term111124, term111124.getClass(), "playCount", -955604562);
        setIntField(term111124, term111124.getClass(), "playVsCount", -1428865659);
        setIntField(term111124, term111124.getClass(), "playSyncCount", -1810911724);
        setIntField(term111124, term111124.getClass(), "winCount", 2021630719);
        setIntField(term111124, term111124.getClass(), "helpCount", 1542129107);
        setIntField(term111124, term111124.getClass(), "comboCount", 2079013871);
        setIntField(term111124, term111124.getClass(), "feverCount", -524642037);
        setIntField(term111124, term111124.getClass(), "totalHiScore", 110078308);
        setIntField(term111124, term111124.getClass(), "totalEasyHighScore", -1029567193);
        setIntField(term111124, term111124.getClass(), "totalBasicHighScore", 885045600);
        setIntField(term111124, term111124.getClass(), "totalAdvancedHighScore", -628958232);
        setIntField(term111124, term111124.getClass(), "totalExpertHighScore", 261473208);
        setIntField(term111124, term111124.getClass(), "totalMasterHighScore", 148074135);
        setIntField(term111124, term111124.getClass(), "totalReMasterHighScore", -94684581);
        setIntField(term111124, term111124.getClass(), "totalHighSync", 1046822921);
        setIntField(term111124, term111124.getClass(), "totalEasySync", 295036576);
        setIntField(term111124, term111124.getClass(), "totalBasicSync", 551089243);
        setIntField(term111124, term111124.getClass(), "totalAdvancedSync", 308804697);
        setIntField(term111124, term111124.getClass(), "totalExpertSync", -1905953902);
        setIntField(term111124, term111124.getClass(), "totalMasterSync", -1303343959);
        setIntField(term111124, term111124.getClass(), "totalReMasterSync", 1093139582);
        setIntField(term111124, term111124.getClass(), "playerRating", -1533393409);
        setIntField(term111124, term111124.getClass(), "highestRating", 716498836);
        setIntField(term111124, term111124.getClass(), "rankAuthTailId", 1637065629);
        setField(term111124, term111124.getClass(), "eventWatchedDate", "PeFIZXlxPN");
        setField(term111124, term111124.getClass(), "webLimitDate", "OIXYYXGdlX");
        setIntField(term111124, term111124.getClass(), "challengeTrackPhase", 1466957213);
        setIntField(term111124, term111124.getClass(), "firstPlayBits", -2036201838);
        setField(term111124, term111124.getClass(), "lastPlayDate", "VBfWgJrVqV");
        setIntField(term111124, term111124.getClass(), "lastPlaceId", 1407642731);
        setField(term111124, term111124.getClass(), "lastPlaceName", "BgFpfnZiJG");
        setIntField(term111124, term111124.getClass(), "lastRegionId", -14910696);
        setField(term111124, term111124.getClass(), "lastRegionName", "tMDFwEQAGW");
        setField(term111124, term111124.getClass(), "lastClientId", "heAByNySVP");
        setField(term111124, term111124.getClass(), "lastCountryCode", "gPuVkQobYQ");
        setIntField(term111124, term111124.getClass(), "eventPoint", -292154386);
        setIntField(term111124, term111124.getClass(), "totalLv", -1599571798);
        setIntField(term111124, term111124.getClass(), "lastLoginBonusDay", 69185638);
        setIntField(term111124, term111124.getClass(), "lastSurvivalBonusDay", -2087614374);
        setIntField(term111124, term111124.getClass(), "loginBonusLv", -429008252);
        setField(term111122, term111122.getClass(), "user", term111124);
        setField(term111122, term111122.getClass(), "propertyKey", "sAHDMENVSp");
        setField(term111122, term111122.getClass(), "propertyValue", "oLoxfeWIGH");
        term111322 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term111322;
        callMethod(klass, "canEqual", argTypes, term111122, args);
    }

};


