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

public class UserData_setPoint_131210600354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14329;
     Object term14503;

    public UserData_setPoint_131210600354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14333 = new Long(-1468719814009985452L);
        term14329 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term14331 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term14347 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14348 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14352 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14357 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14358 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14362 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term14329, term14329.getClass(), "id", 1597484336218508869L);
        setLongField(term14331, term14331.getClass(), "id", -685023850445639859L);
        setField(term14331, term14331.getClass(), "extId", term14333);
        setField(term14331, term14331.getClass(), "luid", "kVAmKknVln");
        setIntField(term14348, term14348.getClass(), "year", 2029);
        setShortField(term14348, term14348.getClass(), "month", (short) 7);
        setShortField(term14348, term14348.getClass(), "day", (short) 19);
        setField(term14347, term14347.getClass(), "date", term14348);
        setByteField(term14352, term14352.getClass(), "hour", (byte) 17);
        setByteField(term14352, term14352.getClass(), "minute", (byte) 37);
        setByteField(term14352, term14352.getClass(), "second", (byte) 21);
        setIntField(term14352, term14352.getClass(), "nano", 320093277);
        setField(term14347, term14347.getClass(), "time", term14352);
        setField(term14331, term14331.getClass(), "registerTime", term14347);
        setIntField(term14358, term14358.getClass(), "year", 2028);
        setShortField(term14358, term14358.getClass(), "month", (short) 1);
        setShortField(term14358, term14358.getClass(), "day", (short) 11);
        setField(term14357, term14357.getClass(), "date", term14358);
        setByteField(term14362, term14362.getClass(), "hour", (byte) 22);
        setByteField(term14362, term14362.getClass(), "minute", (byte) 3);
        setByteField(term14362, term14362.getClass(), "second", (byte) 39);
        setIntField(term14362, term14362.getClass(), "nano", 175567313);
        setField(term14357, term14357.getClass(), "time", term14362);
        setField(term14331, term14331.getClass(), "accessTime", term14357);
        setField(term14329, term14329.getClass(), "card", term14331);
        setIntField(term14329, term14329.getClass(), "lastDataVersion", -780862464);
        setField(term14329, term14329.getClass(), "userName", "MRFLbEGYKG");
        setIntField(term14329, term14329.getClass(), "point", 2014099129);
        setIntField(term14329, term14329.getClass(), "totalPoint", -1024382698);
        setIntField(term14329, term14329.getClass(), "iconId", -168406824);
        setIntField(term14329, term14329.getClass(), "nameplateId", 2063577636);
        setIntField(term14329, term14329.getClass(), "frameId", 1680632578);
        setIntField(term14329, term14329.getClass(), "trophyId", 511399994);
        setIntField(term14329, term14329.getClass(), "playCount", 2094923086);
        setIntField(term14329, term14329.getClass(), "playVsCount", 1532355365);
        setIntField(term14329, term14329.getClass(), "playSyncCount", -156316508);
        setIntField(term14329, term14329.getClass(), "winCount", -1304449497);
        setIntField(term14329, term14329.getClass(), "helpCount", -80320412);
        setIntField(term14329, term14329.getClass(), "comboCount", -356797136);
        setIntField(term14329, term14329.getClass(), "feverCount", -2035641970);
        setIntField(term14329, term14329.getClass(), "totalHiScore", 1813581230);
        setIntField(term14329, term14329.getClass(), "totalEasyHighScore", 844569461);
        setIntField(term14329, term14329.getClass(), "totalBasicHighScore", -15085966);
        setIntField(term14329, term14329.getClass(), "totalAdvancedHighScore", -1929631412);
        setIntField(term14329, term14329.getClass(), "totalExpertHighScore", 1014160441);
        setIntField(term14329, term14329.getClass(), "totalMasterHighScore", 975753484);
        setIntField(term14329, term14329.getClass(), "totalReMasterHighScore", -1886360357);
        setIntField(term14329, term14329.getClass(), "totalHighSync", -235867268);
        setIntField(term14329, term14329.getClass(), "totalEasySync", -972330704);
        setIntField(term14329, term14329.getClass(), "totalBasicSync", 134173297);
        setIntField(term14329, term14329.getClass(), "totalAdvancedSync", 2025698852);
        setIntField(term14329, term14329.getClass(), "totalExpertSync", 113961338);
        setIntField(term14329, term14329.getClass(), "totalMasterSync", 1869277085);
        setIntField(term14329, term14329.getClass(), "totalReMasterSync", 498801287);
        setIntField(term14329, term14329.getClass(), "playerRating", 969573395);
        setIntField(term14329, term14329.getClass(), "highestRating", -899109027);
        setIntField(term14329, term14329.getClass(), "rankAuthTailId", -694297070);
        setField(term14329, term14329.getClass(), "eventWatchedDate", "BYrGukTyof");
        setField(term14329, term14329.getClass(), "webLimitDate", "jiCGTTzKGB");
        setIntField(term14329, term14329.getClass(), "challengeTrackPhase", 786551253);
        setIntField(term14329, term14329.getClass(), "firstPlayBits", -104779523);
        setField(term14329, term14329.getClass(), "lastPlayDate", "MqICFYzDJj");
        setIntField(term14329, term14329.getClass(), "lastPlaceId", 749289511);
        setField(term14329, term14329.getClass(), "lastPlaceName", "YgQvdcBQKw");
        setIntField(term14329, term14329.getClass(), "lastRegionId", -414437174);
        setField(term14329, term14329.getClass(), "lastRegionName", "FiYYLuailz");
        setField(term14329, term14329.getClass(), "lastClientId", "XebAeSnCKZ");
        setField(term14329, term14329.getClass(), "lastCountryCode", "GeddnXjHGy");
        setIntField(term14329, term14329.getClass(), "eventPoint", -860227615);
        setIntField(term14329, term14329.getClass(), "totalLv", -1696192372);
        setIntField(term14329, term14329.getClass(), "lastLoginBonusDay", 1239525687);
        setIntField(term14329, term14329.getClass(), "lastSurvivalBonusDay", 1496590861);
        setIntField(term14329, term14329.getClass(), "loginBonusLv", 1046957508);
        term14503 = new Integer(-553500478);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term14503;
        callMethod(klass, "setPoint", argTypes, term14329, args);
    }

};


