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

public class UserData_getLoginBonusLv_143705459349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12937;

    public UserData_getLoginBonusLv_143705459349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12941 = new Long(-3842548265506930260L);
        term12937 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term12939 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term12955 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12956 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12960 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12965 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12966 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12970 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term12937, term12937.getClass(), "id", 1672578078364590450L);
        setLongField(term12939, term12939.getClass(), "id", 4949335493504695457L);
        setField(term12939, term12939.getClass(), "extId", term12941);
        setField(term12939, term12939.getClass(), "luid", "aSATgQUpoe");
        setIntField(term12956, term12956.getClass(), "year", 2019);
        setShortField(term12956, term12956.getClass(), "month", (short) 8);
        setShortField(term12956, term12956.getClass(), "day", (short) 12);
        setField(term12955, term12955.getClass(), "date", term12956);
        setByteField(term12960, term12960.getClass(), "hour", (byte) 14);
        setByteField(term12960, term12960.getClass(), "minute", (byte) 1);
        setByteField(term12960, term12960.getClass(), "second", (byte) 51);
        setIntField(term12960, term12960.getClass(), "nano", 499021786);
        setField(term12955, term12955.getClass(), "time", term12960);
        setField(term12939, term12939.getClass(), "registerTime", term12955);
        setIntField(term12966, term12966.getClass(), "year", 2014);
        setShortField(term12966, term12966.getClass(), "month", (short) 7);
        setShortField(term12966, term12966.getClass(), "day", (short) 22);
        setField(term12965, term12965.getClass(), "date", term12966);
        setByteField(term12970, term12970.getClass(), "hour", (byte) 9);
        setByteField(term12970, term12970.getClass(), "minute", (byte) 40);
        setByteField(term12970, term12970.getClass(), "second", (byte) 34);
        setIntField(term12970, term12970.getClass(), "nano", 463008257);
        setField(term12965, term12965.getClass(), "time", term12970);
        setField(term12939, term12939.getClass(), "accessTime", term12965);
        setField(term12937, term12937.getClass(), "card", term12939);
        setIntField(term12937, term12937.getClass(), "lastDataVersion", 1078807592);
        setField(term12937, term12937.getClass(), "userName", "VkPSXewZfB");
        setIntField(term12937, term12937.getClass(), "point", 1673044047);
        setIntField(term12937, term12937.getClass(), "totalPoint", -1835617743);
        setIntField(term12937, term12937.getClass(), "iconId", -337695922);
        setIntField(term12937, term12937.getClass(), "nameplateId", 817836900);
        setIntField(term12937, term12937.getClass(), "frameId", 1691654567);
        setIntField(term12937, term12937.getClass(), "trophyId", -1604942135);
        setIntField(term12937, term12937.getClass(), "playCount", 2000275611);
        setIntField(term12937, term12937.getClass(), "playVsCount", 2060369122);
        setIntField(term12937, term12937.getClass(), "playSyncCount", -1275204506);
        setIntField(term12937, term12937.getClass(), "winCount", 507439888);
        setIntField(term12937, term12937.getClass(), "helpCount", 1936798149);
        setIntField(term12937, term12937.getClass(), "comboCount", 188304401);
        setIntField(term12937, term12937.getClass(), "feverCount", -40613160);
        setIntField(term12937, term12937.getClass(), "totalHiScore", 1359973218);
        setIntField(term12937, term12937.getClass(), "totalEasyHighScore", -218759803);
        setIntField(term12937, term12937.getClass(), "totalBasicHighScore", 1288936083);
        setIntField(term12937, term12937.getClass(), "totalAdvancedHighScore", 4086209);
        setIntField(term12937, term12937.getClass(), "totalExpertHighScore", 300964556);
        setIntField(term12937, term12937.getClass(), "totalMasterHighScore", -958207893);
        setIntField(term12937, term12937.getClass(), "totalReMasterHighScore", 674390543);
        setIntField(term12937, term12937.getClass(), "totalHighSync", 1472100258);
        setIntField(term12937, term12937.getClass(), "totalEasySync", 12681987);
        setIntField(term12937, term12937.getClass(), "totalBasicSync", -1987364934);
        setIntField(term12937, term12937.getClass(), "totalAdvancedSync", 1364414277);
        setIntField(term12937, term12937.getClass(), "totalExpertSync", -961137606);
        setIntField(term12937, term12937.getClass(), "totalMasterSync", 795205527);
        setIntField(term12937, term12937.getClass(), "totalReMasterSync", 600958607);
        setIntField(term12937, term12937.getClass(), "playerRating", 897159778);
        setIntField(term12937, term12937.getClass(), "highestRating", -1934934961);
        setIntField(term12937, term12937.getClass(), "rankAuthTailId", 2120054887);
        setField(term12937, term12937.getClass(), "eventWatchedDate", "ubodzJoMGW");
        setField(term12937, term12937.getClass(), "webLimitDate", "weddIktxOA");
        setIntField(term12937, term12937.getClass(), "challengeTrackPhase", 2145648967);
        setIntField(term12937, term12937.getClass(), "firstPlayBits", 2060624021);
        setField(term12937, term12937.getClass(), "lastPlayDate", "uSlMeISsDD");
        setIntField(term12937, term12937.getClass(), "lastPlaceId", -1853309523);
        setField(term12937, term12937.getClass(), "lastPlaceName", "WdCiTDUKqn");
        setIntField(term12937, term12937.getClass(), "lastRegionId", 241741655);
        setField(term12937, term12937.getClass(), "lastRegionName", "PSizQDoxxe");
        setField(term12937, term12937.getClass(), "lastClientId", "mKaHyMybrK");
        setField(term12937, term12937.getClass(), "lastCountryCode", "AyrEXuGrEj");
        setIntField(term12937, term12937.getClass(), "eventPoint", -1062022366);
        setIntField(term12937, term12937.getClass(), "totalLv", -1347618079);
        setIntField(term12937, term12937.getClass(), "lastLoginBonusDay", 1510246255);
        setIntField(term12937, term12937.getClass(), "lastSurvivalBonusDay", -515631808);
        setIntField(term12937, term12937.getClass(), "loginBonusLv", 1546701347);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLoginBonusLv", argTypes, term12937, args);
    }

};


