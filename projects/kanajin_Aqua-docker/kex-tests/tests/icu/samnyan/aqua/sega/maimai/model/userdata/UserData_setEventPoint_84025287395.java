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

public class UserData_setEventPoint_84025287395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25375;
     Object term25549;

    public UserData_setEventPoint_84025287395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term25379 = new Long(2135754395358000892L);
        term25375 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term25377 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term25393 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25394 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25398 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25403 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25404 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25408 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term25375, term25375.getClass(), "id", 5973526439563541711L);
        setLongField(term25377, term25377.getClass(), "id", 5246058710498845622L);
        setField(term25377, term25377.getClass(), "extId", term25379);
        setField(term25377, term25377.getClass(), "luid", "zZxoNkohbw");
        setIntField(term25394, term25394.getClass(), "year", 2017);
        setShortField(term25394, term25394.getClass(), "month", (short) 6);
        setShortField(term25394, term25394.getClass(), "day", (short) 7);
        setField(term25393, term25393.getClass(), "date", term25394);
        setByteField(term25398, term25398.getClass(), "hour", (byte) 13);
        setByteField(term25398, term25398.getClass(), "minute", (byte) 52);
        setByteField(term25398, term25398.getClass(), "second", (byte) 17);
        setIntField(term25398, term25398.getClass(), "nano", 78180039);
        setField(term25393, term25393.getClass(), "time", term25398);
        setField(term25377, term25377.getClass(), "registerTime", term25393);
        setIntField(term25404, term25404.getClass(), "year", 2017);
        setShortField(term25404, term25404.getClass(), "month", (short) 6);
        setShortField(term25404, term25404.getClass(), "day", (short) 23);
        setField(term25403, term25403.getClass(), "date", term25404);
        setByteField(term25408, term25408.getClass(), "hour", (byte) 23);
        setByteField(term25408, term25408.getClass(), "minute", (byte) 29);
        setByteField(term25408, term25408.getClass(), "second", (byte) 17);
        setIntField(term25408, term25408.getClass(), "nano", 491252353);
        setField(term25403, term25403.getClass(), "time", term25408);
        setField(term25377, term25377.getClass(), "accessTime", term25403);
        setField(term25375, term25375.getClass(), "card", term25377);
        setIntField(term25375, term25375.getClass(), "lastDataVersion", 1239212151);
        setField(term25375, term25375.getClass(), "userName", "DQrjPcLysX");
        setIntField(term25375, term25375.getClass(), "point", 1513817979);
        setIntField(term25375, term25375.getClass(), "totalPoint", 222944981);
        setIntField(term25375, term25375.getClass(), "iconId", -1880135720);
        setIntField(term25375, term25375.getClass(), "nameplateId", 1065058113);
        setIntField(term25375, term25375.getClass(), "frameId", 159521199);
        setIntField(term25375, term25375.getClass(), "trophyId", 2020510924);
        setIntField(term25375, term25375.getClass(), "playCount", -644848160);
        setIntField(term25375, term25375.getClass(), "playVsCount", -413768483);
        setIntField(term25375, term25375.getClass(), "playSyncCount", 565614678);
        setIntField(term25375, term25375.getClass(), "winCount", -1248504675);
        setIntField(term25375, term25375.getClass(), "helpCount", 1366246744);
        setIntField(term25375, term25375.getClass(), "comboCount", -369295588);
        setIntField(term25375, term25375.getClass(), "feverCount", 728215296);
        setIntField(term25375, term25375.getClass(), "totalHiScore", -1236147031);
        setIntField(term25375, term25375.getClass(), "totalEasyHighScore", 2030051112);
        setIntField(term25375, term25375.getClass(), "totalBasicHighScore", 1023614449);
        setIntField(term25375, term25375.getClass(), "totalAdvancedHighScore", -717220010);
        setIntField(term25375, term25375.getClass(), "totalExpertHighScore", 280068573);
        setIntField(term25375, term25375.getClass(), "totalMasterHighScore", -1081530515);
        setIntField(term25375, term25375.getClass(), "totalReMasterHighScore", 492096339);
        setIntField(term25375, term25375.getClass(), "totalHighSync", -1679827671);
        setIntField(term25375, term25375.getClass(), "totalEasySync", 932019255);
        setIntField(term25375, term25375.getClass(), "totalBasicSync", 1939661233);
        setIntField(term25375, term25375.getClass(), "totalAdvancedSync", -485147289);
        setIntField(term25375, term25375.getClass(), "totalExpertSync", -1098526777);
        setIntField(term25375, term25375.getClass(), "totalMasterSync", 871491464);
        setIntField(term25375, term25375.getClass(), "totalReMasterSync", 1250354269);
        setIntField(term25375, term25375.getClass(), "playerRating", 695748317);
        setIntField(term25375, term25375.getClass(), "highestRating", -439470959);
        setIntField(term25375, term25375.getClass(), "rankAuthTailId", -248472453);
        setField(term25375, term25375.getClass(), "eventWatchedDate", "VWPFyrpmmb");
        setField(term25375, term25375.getClass(), "webLimitDate", "gYYKrIeThw");
        setIntField(term25375, term25375.getClass(), "challengeTrackPhase", 1056759659);
        setIntField(term25375, term25375.getClass(), "firstPlayBits", -233313895);
        setField(term25375, term25375.getClass(), "lastPlayDate", "UsxeLMVkAK");
        setIntField(term25375, term25375.getClass(), "lastPlaceId", 2014416586);
        setField(term25375, term25375.getClass(), "lastPlaceName", "ITrhiKKzcb");
        setIntField(term25375, term25375.getClass(), "lastRegionId", 1614071253);
        setField(term25375, term25375.getClass(), "lastRegionName", "qMKmSzOQXg");
        setField(term25375, term25375.getClass(), "lastClientId", "CURQCMkqbZ");
        setField(term25375, term25375.getClass(), "lastCountryCode", "VZwkkQktrm");
        setIntField(term25375, term25375.getClass(), "eventPoint", -548611489);
        setIntField(term25375, term25375.getClass(), "totalLv", 792588182);
        setIntField(term25375, term25375.getClass(), "lastLoginBonusDay", 1145540785);
        setIntField(term25375, term25375.getClass(), "lastSurvivalBonusDay", -1255440898);
        setIntField(term25375, term25375.getClass(), "loginBonusLv", -1185096329);
        term25549 = new Integer(-2051822073);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term25549;
        callMethod(klass, "setEventPoint", argTypes, term25375, args);
    }

};


