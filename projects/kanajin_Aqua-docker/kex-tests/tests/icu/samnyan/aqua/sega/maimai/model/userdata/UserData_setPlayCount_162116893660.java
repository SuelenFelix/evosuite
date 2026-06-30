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

public class UserData_setPlayCount_162116893660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15925;
     Object term16099;

    public UserData_setPlayCount_162116893660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15929 = new Long(7994303628307559416L);
        term15925 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term15927 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term15943 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15944 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15948 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15953 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15954 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15958 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term15925, term15925.getClass(), "id", -900457279156388404L);
        setLongField(term15927, term15927.getClass(), "id", 1084801489398441516L);
        setField(term15927, term15927.getClass(), "extId", term15929);
        setField(term15927, term15927.getClass(), "luid", "TcuXODkzBV");
        setIntField(term15944, term15944.getClass(), "year", 2014);
        setShortField(term15944, term15944.getClass(), "month", (short) 1);
        setShortField(term15944, term15944.getClass(), "day", (short) 26);
        setField(term15943, term15943.getClass(), "date", term15944);
        setByteField(term15948, term15948.getClass(), "hour", (byte) 3);
        setByteField(term15948, term15948.getClass(), "minute", (byte) 31);
        setByteField(term15948, term15948.getClass(), "second", (byte) 56);
        setIntField(term15948, term15948.getClass(), "nano", 100873602);
        setField(term15943, term15943.getClass(), "time", term15948);
        setField(term15927, term15927.getClass(), "registerTime", term15943);
        setIntField(term15954, term15954.getClass(), "year", 2021);
        setShortField(term15954, term15954.getClass(), "month", (short) 12);
        setShortField(term15954, term15954.getClass(), "day", (short) 1);
        setField(term15953, term15953.getClass(), "date", term15954);
        setByteField(term15958, term15958.getClass(), "hour", (byte) 15);
        setByteField(term15958, term15958.getClass(), "minute", (byte) 30);
        setByteField(term15958, term15958.getClass(), "second", (byte) 5);
        setIntField(term15958, term15958.getClass(), "nano", 996341606);
        setField(term15953, term15953.getClass(), "time", term15958);
        setField(term15927, term15927.getClass(), "accessTime", term15953);
        setField(term15925, term15925.getClass(), "card", term15927);
        setIntField(term15925, term15925.getClass(), "lastDataVersion", -2042022388);
        setField(term15925, term15925.getClass(), "userName", "coJPjrBZNe");
        setIntField(term15925, term15925.getClass(), "point", 390228535);
        setIntField(term15925, term15925.getClass(), "totalPoint", -667505209);
        setIntField(term15925, term15925.getClass(), "iconId", 1997285343);
        setIntField(term15925, term15925.getClass(), "nameplateId", -1814671855);
        setIntField(term15925, term15925.getClass(), "frameId", -614200166);
        setIntField(term15925, term15925.getClass(), "trophyId", 1243129119);
        setIntField(term15925, term15925.getClass(), "playCount", 346014220);
        setIntField(term15925, term15925.getClass(), "playVsCount", 1379438950);
        setIntField(term15925, term15925.getClass(), "playSyncCount", 1932258686);
        setIntField(term15925, term15925.getClass(), "winCount", -261366507);
        setIntField(term15925, term15925.getClass(), "helpCount", 1015444772);
        setIntField(term15925, term15925.getClass(), "comboCount", -815684619);
        setIntField(term15925, term15925.getClass(), "feverCount", -471499395);
        setIntField(term15925, term15925.getClass(), "totalHiScore", -663671886);
        setIntField(term15925, term15925.getClass(), "totalEasyHighScore", -1295577968);
        setIntField(term15925, term15925.getClass(), "totalBasicHighScore", 1006574741);
        setIntField(term15925, term15925.getClass(), "totalAdvancedHighScore", -1471698394);
        setIntField(term15925, term15925.getClass(), "totalExpertHighScore", 1146444085);
        setIntField(term15925, term15925.getClass(), "totalMasterHighScore", 316145449);
        setIntField(term15925, term15925.getClass(), "totalReMasterHighScore", 387128751);
        setIntField(term15925, term15925.getClass(), "totalHighSync", 1220621259);
        setIntField(term15925, term15925.getClass(), "totalEasySync", 272507740);
        setIntField(term15925, term15925.getClass(), "totalBasicSync", -2117539025);
        setIntField(term15925, term15925.getClass(), "totalAdvancedSync", 736842788);
        setIntField(term15925, term15925.getClass(), "totalExpertSync", 416550042);
        setIntField(term15925, term15925.getClass(), "totalMasterSync", 1745727714);
        setIntField(term15925, term15925.getClass(), "totalReMasterSync", -1577886337);
        setIntField(term15925, term15925.getClass(), "playerRating", -481394578);
        setIntField(term15925, term15925.getClass(), "highestRating", 1440683242);
        setIntField(term15925, term15925.getClass(), "rankAuthTailId", -1746192055);
        setField(term15925, term15925.getClass(), "eventWatchedDate", "vMsWjuPTnO");
        setField(term15925, term15925.getClass(), "webLimitDate", "zHvfKaOstO");
        setIntField(term15925, term15925.getClass(), "challengeTrackPhase", -996911099);
        setIntField(term15925, term15925.getClass(), "firstPlayBits", -610865659);
        setField(term15925, term15925.getClass(), "lastPlayDate", "tOszriqETr");
        setIntField(term15925, term15925.getClass(), "lastPlaceId", 2044119255);
        setField(term15925, term15925.getClass(), "lastPlaceName", "ncSPTkhKjO");
        setIntField(term15925, term15925.getClass(), "lastRegionId", -1924668199);
        setField(term15925, term15925.getClass(), "lastRegionName", "jcWKHRWhyj");
        setField(term15925, term15925.getClass(), "lastClientId", "nrQjODRMLD");
        setField(term15925, term15925.getClass(), "lastCountryCode", "PNoWXrsFic");
        setIntField(term15925, term15925.getClass(), "eventPoint", 903039854);
        setIntField(term15925, term15925.getClass(), "totalLv", -705528573);
        setIntField(term15925, term15925.getClass(), "lastLoginBonusDay", -480070896);
        setIntField(term15925, term15925.getClass(), "lastSurvivalBonusDay", -1811732249);
        setIntField(term15925, term15925.getClass(), "loginBonusLv", 1993504802);
        term16099 = new Integer(526852618);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term16099;
        callMethod(klass, "setPlayCount", argTypes, term15925, args);
    }

};


