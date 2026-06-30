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

public class UserData_setFrameId_180098604358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15393;
     Object term15567;

    public UserData_setFrameId_180098604358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15397 = new Long(3892018155439224435L);
        term15393 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term15395 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term15411 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15412 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15416 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15421 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15422 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15426 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term15393, term15393.getClass(), "id", -5386201758403679145L);
        setLongField(term15395, term15395.getClass(), "id", -7268507582722666254L);
        setField(term15395, term15395.getClass(), "extId", term15397);
        setField(term15395, term15395.getClass(), "luid", "CAMnvfDLJL");
        setIntField(term15412, term15412.getClass(), "year", 2024);
        setShortField(term15412, term15412.getClass(), "month", (short) 9);
        setShortField(term15412, term15412.getClass(), "day", (short) 22);
        setField(term15411, term15411.getClass(), "date", term15412);
        setByteField(term15416, term15416.getClass(), "hour", (byte) 0);
        setByteField(term15416, term15416.getClass(), "minute", (byte) 11);
        setByteField(term15416, term15416.getClass(), "second", (byte) 7);
        setIntField(term15416, term15416.getClass(), "nano", 56643259);
        setField(term15411, term15411.getClass(), "time", term15416);
        setField(term15395, term15395.getClass(), "registerTime", term15411);
        setIntField(term15422, term15422.getClass(), "year", 2021);
        setShortField(term15422, term15422.getClass(), "month", (short) 12);
        setShortField(term15422, term15422.getClass(), "day", (short) 21);
        setField(term15421, term15421.getClass(), "date", term15422);
        setByteField(term15426, term15426.getClass(), "hour", (byte) 12);
        setByteField(term15426, term15426.getClass(), "minute", (byte) 59);
        setByteField(term15426, term15426.getClass(), "second", (byte) 52);
        setIntField(term15426, term15426.getClass(), "nano", 47081639);
        setField(term15421, term15421.getClass(), "time", term15426);
        setField(term15395, term15395.getClass(), "accessTime", term15421);
        setField(term15393, term15393.getClass(), "card", term15395);
        setIntField(term15393, term15393.getClass(), "lastDataVersion", 1610419467);
        setField(term15393, term15393.getClass(), "userName", "mfHtgSbdjD");
        setIntField(term15393, term15393.getClass(), "point", 1155135931);
        setIntField(term15393, term15393.getClass(), "totalPoint", -636910567);
        setIntField(term15393, term15393.getClass(), "iconId", 1896114203);
        setIntField(term15393, term15393.getClass(), "nameplateId", 1045745470);
        setIntField(term15393, term15393.getClass(), "frameId", 892741901);
        setIntField(term15393, term15393.getClass(), "trophyId", -1724900201);
        setIntField(term15393, term15393.getClass(), "playCount", -758523003);
        setIntField(term15393, term15393.getClass(), "playVsCount", 1567184195);
        setIntField(term15393, term15393.getClass(), "playSyncCount", 63595623);
        setIntField(term15393, term15393.getClass(), "winCount", 1764150991);
        setIntField(term15393, term15393.getClass(), "helpCount", 944653455);
        setIntField(term15393, term15393.getClass(), "comboCount", -1819474400);
        setIntField(term15393, term15393.getClass(), "feverCount", 783684648);
        setIntField(term15393, term15393.getClass(), "totalHiScore", 553754005);
        setIntField(term15393, term15393.getClass(), "totalEasyHighScore", 1986699236);
        setIntField(term15393, term15393.getClass(), "totalBasicHighScore", -1729178560);
        setIntField(term15393, term15393.getClass(), "totalAdvancedHighScore", 874974171);
        setIntField(term15393, term15393.getClass(), "totalExpertHighScore", -1689017763);
        setIntField(term15393, term15393.getClass(), "totalMasterHighScore", 1657387281);
        setIntField(term15393, term15393.getClass(), "totalReMasterHighScore", 1276651382);
        setIntField(term15393, term15393.getClass(), "totalHighSync", 266716659);
        setIntField(term15393, term15393.getClass(), "totalEasySync", 1249390809);
        setIntField(term15393, term15393.getClass(), "totalBasicSync", -1069437097);
        setIntField(term15393, term15393.getClass(), "totalAdvancedSync", 215016257);
        setIntField(term15393, term15393.getClass(), "totalExpertSync", -1967315273);
        setIntField(term15393, term15393.getClass(), "totalMasterSync", -1848110874);
        setIntField(term15393, term15393.getClass(), "totalReMasterSync", -1988070462);
        setIntField(term15393, term15393.getClass(), "playerRating", 323423569);
        setIntField(term15393, term15393.getClass(), "highestRating", -274269573);
        setIntField(term15393, term15393.getClass(), "rankAuthTailId", 1395520168);
        setField(term15393, term15393.getClass(), "eventWatchedDate", "cmuaUiHMVL");
        setField(term15393, term15393.getClass(), "webLimitDate", "xjoSGPWUgu");
        setIntField(term15393, term15393.getClass(), "challengeTrackPhase", -524708742);
        setIntField(term15393, term15393.getClass(), "firstPlayBits", -349448118);
        setField(term15393, term15393.getClass(), "lastPlayDate", "uzmqjnOUXu");
        setIntField(term15393, term15393.getClass(), "lastPlaceId", 1938137872);
        setField(term15393, term15393.getClass(), "lastPlaceName", "xeyjTOCOJb");
        setIntField(term15393, term15393.getClass(), "lastRegionId", 1767604467);
        setField(term15393, term15393.getClass(), "lastRegionName", "DGRqjjdhzy");
        setField(term15393, term15393.getClass(), "lastClientId", "lQFkjJUPAR");
        setField(term15393, term15393.getClass(), "lastCountryCode", "BsuVlGUUjV");
        setIntField(term15393, term15393.getClass(), "eventPoint", 1997859160);
        setIntField(term15393, term15393.getClass(), "totalLv", 1565529799);
        setIntField(term15393, term15393.getClass(), "lastLoginBonusDay", -1144608643);
        setIntField(term15393, term15393.getClass(), "lastSurvivalBonusDay", -2020428308);
        setIntField(term15393, term15393.getClass(), "loginBonusLv", -226298436);
        term15567 = new Integer(-1570350431);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term15567;
        callMethod(klass, "setFrameId", argTypes, term15393, args);
    }

};


