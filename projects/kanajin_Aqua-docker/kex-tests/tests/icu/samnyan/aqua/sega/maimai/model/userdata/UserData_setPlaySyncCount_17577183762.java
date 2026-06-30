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

public class UserData_setPlaySyncCount_17577183762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16457;
     Object term16631;

    public UserData_setPlaySyncCount_17577183762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16461 = new Long(-1610676979013636850L);
        term16457 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term16459 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term16475 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16476 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16480 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16485 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16486 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16490 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term16457, term16457.getClass(), "id", 8313800941204938919L);
        setLongField(term16459, term16459.getClass(), "id", -1214968196781083707L);
        setField(term16459, term16459.getClass(), "extId", term16461);
        setField(term16459, term16459.getClass(), "luid", "UiWhvbypdr");
        setIntField(term16476, term16476.getClass(), "year", 2017);
        setShortField(term16476, term16476.getClass(), "month", (short) 6);
        setShortField(term16476, term16476.getClass(), "day", (short) 28);
        setField(term16475, term16475.getClass(), "date", term16476);
        setByteField(term16480, term16480.getClass(), "hour", (byte) 8);
        setByteField(term16480, term16480.getClass(), "minute", (byte) 1);
        setByteField(term16480, term16480.getClass(), "second", (byte) 14);
        setIntField(term16480, term16480.getClass(), "nano", 501033715);
        setField(term16475, term16475.getClass(), "time", term16480);
        setField(term16459, term16459.getClass(), "registerTime", term16475);
        setIntField(term16486, term16486.getClass(), "year", 2016);
        setShortField(term16486, term16486.getClass(), "month", (short) 10);
        setShortField(term16486, term16486.getClass(), "day", (short) 10);
        setField(term16485, term16485.getClass(), "date", term16486);
        setByteField(term16490, term16490.getClass(), "hour", (byte) 16);
        setByteField(term16490, term16490.getClass(), "minute", (byte) 7);
        setByteField(term16490, term16490.getClass(), "second", (byte) 16);
        setIntField(term16490, term16490.getClass(), "nano", 995200309);
        setField(term16485, term16485.getClass(), "time", term16490);
        setField(term16459, term16459.getClass(), "accessTime", term16485);
        setField(term16457, term16457.getClass(), "card", term16459);
        setIntField(term16457, term16457.getClass(), "lastDataVersion", -705616896);
        setField(term16457, term16457.getClass(), "userName", "CgleElJNje");
        setIntField(term16457, term16457.getClass(), "point", 1057965724);
        setIntField(term16457, term16457.getClass(), "totalPoint", 2134707657);
        setIntField(term16457, term16457.getClass(), "iconId", -357630956);
        setIntField(term16457, term16457.getClass(), "nameplateId", -1068878345);
        setIntField(term16457, term16457.getClass(), "frameId", 1386128235);
        setIntField(term16457, term16457.getClass(), "trophyId", -1047109164);
        setIntField(term16457, term16457.getClass(), "playCount", -1650626012);
        setIntField(term16457, term16457.getClass(), "playVsCount", -2045231879);
        setIntField(term16457, term16457.getClass(), "playSyncCount", 1678025090);
        setIntField(term16457, term16457.getClass(), "winCount", 714453255);
        setIntField(term16457, term16457.getClass(), "helpCount", 2096762388);
        setIntField(term16457, term16457.getClass(), "comboCount", -1646872343);
        setIntField(term16457, term16457.getClass(), "feverCount", -140841633);
        setIntField(term16457, term16457.getClass(), "totalHiScore", 1970986976);
        setIntField(term16457, term16457.getClass(), "totalEasyHighScore", 530909877);
        setIntField(term16457, term16457.getClass(), "totalBasicHighScore", -123945804);
        setIntField(term16457, term16457.getClass(), "totalAdvancedHighScore", 2133669766);
        setIntField(term16457, term16457.getClass(), "totalExpertHighScore", -1423215684);
        setIntField(term16457, term16457.getClass(), "totalMasterHighScore", -1096652631);
        setIntField(term16457, term16457.getClass(), "totalReMasterHighScore", 1116810901);
        setIntField(term16457, term16457.getClass(), "totalHighSync", 1944430959);
        setIntField(term16457, term16457.getClass(), "totalEasySync", 98801346);
        setIntField(term16457, term16457.getClass(), "totalBasicSync", 2133290622);
        setIntField(term16457, term16457.getClass(), "totalAdvancedSync", -164869996);
        setIntField(term16457, term16457.getClass(), "totalExpertSync", 1415001538);
        setIntField(term16457, term16457.getClass(), "totalMasterSync", 1738077695);
        setIntField(term16457, term16457.getClass(), "totalReMasterSync", -1351117314);
        setIntField(term16457, term16457.getClass(), "playerRating", 1693588815);
        setIntField(term16457, term16457.getClass(), "highestRating", 1272985537);
        setIntField(term16457, term16457.getClass(), "rankAuthTailId", -785719854);
        setField(term16457, term16457.getClass(), "eventWatchedDate", "ZrchvNGMtd");
        setField(term16457, term16457.getClass(), "webLimitDate", "WaEcyVlcIx");
        setIntField(term16457, term16457.getClass(), "challengeTrackPhase", -1542292796);
        setIntField(term16457, term16457.getClass(), "firstPlayBits", 1892295932);
        setField(term16457, term16457.getClass(), "lastPlayDate", "ONcbPCQnHd");
        setIntField(term16457, term16457.getClass(), "lastPlaceId", 1028855301);
        setField(term16457, term16457.getClass(), "lastPlaceName", "AobDaplFLl");
        setIntField(term16457, term16457.getClass(), "lastRegionId", -2075314038);
        setField(term16457, term16457.getClass(), "lastRegionName", "pDkMNnAGgv");
        setField(term16457, term16457.getClass(), "lastClientId", "PaCpFXGzdX");
        setField(term16457, term16457.getClass(), "lastCountryCode", "FftYCNbnks");
        setIntField(term16457, term16457.getClass(), "eventPoint", 1085906450);
        setIntField(term16457, term16457.getClass(), "totalLv", 1892947629);
        setIntField(term16457, term16457.getClass(), "lastLoginBonusDay", -1350968212);
        setIntField(term16457, term16457.getClass(), "lastSurvivalBonusDay", 2027049805);
        setIntField(term16457, term16457.getClass(), "loginBonusLv", 1777210338);
        term16631 = new Integer(1406833110);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term16631;
        callMethod(klass, "setPlaySyncCount", argTypes, term16457, args);
    }

};


