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

public class UserData_getFrameId_9413613718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2113;

    public UserData_getFrameId_9413613718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2117 = new Long(-7237588299778557629L);
        term2113 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term2115 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term2131 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2132 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2136 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2141 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2142 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2146 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term2113, term2113.getClass(), "id", -316468845751588286L);
        setLongField(term2115, term2115.getClass(), "id", 5127676408959197577L);
        setField(term2115, term2115.getClass(), "extId", term2117);
        setField(term2115, term2115.getClass(), "luid", "JUmudUmaaV");
        setIntField(term2132, term2132.getClass(), "year", 2015);
        setShortField(term2132, term2132.getClass(), "month", (short) 9);
        setShortField(term2132, term2132.getClass(), "day", (short) 16);
        setField(term2131, term2131.getClass(), "date", term2132);
        setByteField(term2136, term2136.getClass(), "hour", (byte) 6);
        setByteField(term2136, term2136.getClass(), "minute", (byte) 19);
        setByteField(term2136, term2136.getClass(), "second", (byte) 42);
        setIntField(term2136, term2136.getClass(), "nano", 630084975);
        setField(term2131, term2131.getClass(), "time", term2136);
        setField(term2115, term2115.getClass(), "registerTime", term2131);
        setIntField(term2142, term2142.getClass(), "year", 2029);
        setShortField(term2142, term2142.getClass(), "month", (short) 6);
        setShortField(term2142, term2142.getClass(), "day", (short) 23);
        setField(term2141, term2141.getClass(), "date", term2142);
        setByteField(term2146, term2146.getClass(), "hour", (byte) 21);
        setByteField(term2146, term2146.getClass(), "minute", (byte) 55);
        setByteField(term2146, term2146.getClass(), "second", (byte) 27);
        setIntField(term2146, term2146.getClass(), "nano", 66889274);
        setField(term2141, term2141.getClass(), "time", term2146);
        setField(term2115, term2115.getClass(), "accessTime", term2141);
        setField(term2113, term2113.getClass(), "card", term2115);
        setIntField(term2113, term2113.getClass(), "lastDataVersion", 278355793);
        setField(term2113, term2113.getClass(), "userName", "KoyGrUJeJW");
        setIntField(term2113, term2113.getClass(), "point", -310648604);
        setIntField(term2113, term2113.getClass(), "totalPoint", -648200466);
        setIntField(term2113, term2113.getClass(), "iconId", 2007134147);
        setIntField(term2113, term2113.getClass(), "nameplateId", 993388358);
        setIntField(term2113, term2113.getClass(), "frameId", -765191335);
        setIntField(term2113, term2113.getClass(), "trophyId", -1697741155);
        setIntField(term2113, term2113.getClass(), "playCount", 1295839803);
        setIntField(term2113, term2113.getClass(), "playVsCount", -1891015523);
        setIntField(term2113, term2113.getClass(), "playSyncCount", -1560631747);
        setIntField(term2113, term2113.getClass(), "winCount", 1215150180);
        setIntField(term2113, term2113.getClass(), "helpCount", -1422859977);
        setIntField(term2113, term2113.getClass(), "comboCount", -1972436591);
        setIntField(term2113, term2113.getClass(), "feverCount", 68922753);
        setIntField(term2113, term2113.getClass(), "totalHiScore", -220791533);
        setIntField(term2113, term2113.getClass(), "totalEasyHighScore", 1741500243);
        setIntField(term2113, term2113.getClass(), "totalBasicHighScore", -2070466617);
        setIntField(term2113, term2113.getClass(), "totalAdvancedHighScore", -1127721881);
        setIntField(term2113, term2113.getClass(), "totalExpertHighScore", 1074848808);
        setIntField(term2113, term2113.getClass(), "totalMasterHighScore", -146054762);
        setIntField(term2113, term2113.getClass(), "totalReMasterHighScore", 798043553);
        setIntField(term2113, term2113.getClass(), "totalHighSync", 533197381);
        setIntField(term2113, term2113.getClass(), "totalEasySync", 1048271679);
        setIntField(term2113, term2113.getClass(), "totalBasicSync", -1529797673);
        setIntField(term2113, term2113.getClass(), "totalAdvancedSync", -868676396);
        setIntField(term2113, term2113.getClass(), "totalExpertSync", 1922684808);
        setIntField(term2113, term2113.getClass(), "totalMasterSync", -2005784375);
        setIntField(term2113, term2113.getClass(), "totalReMasterSync", -288604325);
        setIntField(term2113, term2113.getClass(), "playerRating", -1268314569);
        setIntField(term2113, term2113.getClass(), "highestRating", 877649659);
        setIntField(term2113, term2113.getClass(), "rankAuthTailId", -1332748804);
        setField(term2113, term2113.getClass(), "eventWatchedDate", "HqBOwkVqjD");
        setField(term2113, term2113.getClass(), "webLimitDate", "MAcUBcBckh");
        setIntField(term2113, term2113.getClass(), "challengeTrackPhase", 1774507971);
        setIntField(term2113, term2113.getClass(), "firstPlayBits", -1420269858);
        setField(term2113, term2113.getClass(), "lastPlayDate", "oVgzLbrsFr");
        setIntField(term2113, term2113.getClass(), "lastPlaceId", -2119545015);
        setField(term2113, term2113.getClass(), "lastPlaceName", "vQVyKLdtaz");
        setIntField(term2113, term2113.getClass(), "lastRegionId", 1272542218);
        setField(term2113, term2113.getClass(), "lastRegionName", "OWKQODBLzb");
        setField(term2113, term2113.getClass(), "lastClientId", "wGmYcqUkgE");
        setField(term2113, term2113.getClass(), "lastCountryCode", "idgaQsnJpQ");
        setIntField(term2113, term2113.getClass(), "eventPoint", 1209799204);
        setIntField(term2113, term2113.getClass(), "totalLv", 1094107751);
        setIntField(term2113, term2113.getClass(), "lastLoginBonusDay", 844222656);
        setIntField(term2113, term2113.getClass(), "lastSurvivalBonusDay", -18216811);
        setIntField(term2113, term2113.getClass(), "loginBonusLv", -1813280137);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFrameId", argTypes, term2113, args);
    }

};


