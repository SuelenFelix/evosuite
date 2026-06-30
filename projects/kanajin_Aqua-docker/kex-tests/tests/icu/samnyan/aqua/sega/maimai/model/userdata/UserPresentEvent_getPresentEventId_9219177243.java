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

public class UserPresentEvent_getPresentEventId_9219177243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97443;

    public UserPresentEvent_getPresentEventId_9219177243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term97449 = new Long(-5951743062322506095L);
        term97443 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPresentEvent"));
        Object term97445 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term97447 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term97463 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term97464 = newInstance(Class.forName("java.time.LocalDate"));
        Object term97468 = newInstance(Class.forName("java.time.LocalTime"));
        Object term97473 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term97474 = newInstance(Class.forName("java.time.LocalDate"));
        Object term97478 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term97443, term97443.getClass(), "id", 5587445443876887300L);
        setLongField(term97445, term97445.getClass(), "id", -8147385208615265440L);
        setLongField(term97447, term97447.getClass(), "id", 2169332993170315110L);
        setField(term97447, term97447.getClass(), "extId", term97449);
        setField(term97447, term97447.getClass(), "luid", "OHliEqVque");
        setIntField(term97464, term97464.getClass(), "year", 2012);
        setShortField(term97464, term97464.getClass(), "month", (short) 6);
        setShortField(term97464, term97464.getClass(), "day", (short) 22);
        setField(term97463, term97463.getClass(), "date", term97464);
        setByteField(term97468, term97468.getClass(), "hour", (byte) 2);
        setByteField(term97468, term97468.getClass(), "minute", (byte) 38);
        setByteField(term97468, term97468.getClass(), "second", (byte) 18);
        setIntField(term97468, term97468.getClass(), "nano", 496783713);
        setField(term97463, term97463.getClass(), "time", term97468);
        setField(term97447, term97447.getClass(), "registerTime", term97463);
        setIntField(term97474, term97474.getClass(), "year", 2024);
        setShortField(term97474, term97474.getClass(), "month", (short) 11);
        setShortField(term97474, term97474.getClass(), "day", (short) 23);
        setField(term97473, term97473.getClass(), "date", term97474);
        setByteField(term97478, term97478.getClass(), "hour", (byte) 12);
        setByteField(term97478, term97478.getClass(), "minute", (byte) 39);
        setByteField(term97478, term97478.getClass(), "second", (byte) 16);
        setIntField(term97478, term97478.getClass(), "nano", 452723100);
        setField(term97473, term97473.getClass(), "time", term97478);
        setField(term97447, term97447.getClass(), "accessTime", term97473);
        setField(term97445, term97445.getClass(), "card", term97447);
        setIntField(term97445, term97445.getClass(), "lastDataVersion", 1463939393);
        setField(term97445, term97445.getClass(), "userName", "kQWmmbQQqu");
        setIntField(term97445, term97445.getClass(), "point", 1437316718);
        setIntField(term97445, term97445.getClass(), "totalPoint", -1967495289);
        setIntField(term97445, term97445.getClass(), "iconId", 359190711);
        setIntField(term97445, term97445.getClass(), "nameplateId", 440478914);
        setIntField(term97445, term97445.getClass(), "frameId", -2057546484);
        setIntField(term97445, term97445.getClass(), "trophyId", -506584220);
        setIntField(term97445, term97445.getClass(), "playCount", 1245589816);
        setIntField(term97445, term97445.getClass(), "playVsCount", -1631923422);
        setIntField(term97445, term97445.getClass(), "playSyncCount", -139570037);
        setIntField(term97445, term97445.getClass(), "winCount", -2107792262);
        setIntField(term97445, term97445.getClass(), "helpCount", -1575358689);
        setIntField(term97445, term97445.getClass(), "comboCount", -1187736992);
        setIntField(term97445, term97445.getClass(), "feverCount", 1979137255);
        setIntField(term97445, term97445.getClass(), "totalHiScore", 761578264);
        setIntField(term97445, term97445.getClass(), "totalEasyHighScore", -44684070);
        setIntField(term97445, term97445.getClass(), "totalBasicHighScore", 1156887680);
        setIntField(term97445, term97445.getClass(), "totalAdvancedHighScore", -1707544833);
        setIntField(term97445, term97445.getClass(), "totalExpertHighScore", -1188072095);
        setIntField(term97445, term97445.getClass(), "totalMasterHighScore", -129083358);
        setIntField(term97445, term97445.getClass(), "totalReMasterHighScore", 490738811);
        setIntField(term97445, term97445.getClass(), "totalHighSync", 25569400);
        setIntField(term97445, term97445.getClass(), "totalEasySync", 584372068);
        setIntField(term97445, term97445.getClass(), "totalBasicSync", 1228941953);
        setIntField(term97445, term97445.getClass(), "totalAdvancedSync", 776859255);
        setIntField(term97445, term97445.getClass(), "totalExpertSync", -1731141151);
        setIntField(term97445, term97445.getClass(), "totalMasterSync", -1411813271);
        setIntField(term97445, term97445.getClass(), "totalReMasterSync", -300044781);
        setIntField(term97445, term97445.getClass(), "playerRating", 78380856);
        setIntField(term97445, term97445.getClass(), "highestRating", 901638935);
        setIntField(term97445, term97445.getClass(), "rankAuthTailId", -285544051);
        setField(term97445, term97445.getClass(), "eventWatchedDate", "bLKLlXYEeh");
        setField(term97445, term97445.getClass(), "webLimitDate", "amltyOnIBK");
        setIntField(term97445, term97445.getClass(), "challengeTrackPhase", 351554192);
        setIntField(term97445, term97445.getClass(), "firstPlayBits", -830429483);
        setField(term97445, term97445.getClass(), "lastPlayDate", "hjGlJibBAS");
        setIntField(term97445, term97445.getClass(), "lastPlaceId", -1595184661);
        setField(term97445, term97445.getClass(), "lastPlaceName", "vinKDMUJMl");
        setIntField(term97445, term97445.getClass(), "lastRegionId", -1926551151);
        setField(term97445, term97445.getClass(), "lastRegionName", "MgjVPQNbcu");
        setField(term97445, term97445.getClass(), "lastClientId", "QNYLGZGxNy");
        setField(term97445, term97445.getClass(), "lastCountryCode", "BrECRdedgj");
        setIntField(term97445, term97445.getClass(), "eventPoint", -515301751);
        setIntField(term97445, term97445.getClass(), "totalLv", -1631583570);
        setIntField(term97445, term97445.getClass(), "lastLoginBonusDay", 1842224897);
        setIntField(term97445, term97445.getClass(), "lastSurvivalBonusDay", 484137454);
        setIntField(term97445, term97445.getClass(), "loginBonusLv", -1073010447);
        setField(term97443, term97443.getClass(), "user", term97445);
        setIntField(term97443, term97443.getClass(), "presentEventId", 2051289757);
        setIntField(term97443, term97443.getClass(), "point", 1076073722);
        setIntField(term97443, term97443.getClass(), "presentCount", -14378708);
        setIntField(term97443, term97443.getClass(), "rate", 1455425247);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPresentEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPresentEventId", argTypes, term97443, args);
    }

};


