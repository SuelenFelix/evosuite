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

public class UserPresentEvent_init_4745454660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96639;

    public UserPresentEvent_init_4745454660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term96643 = new Long(-6609679920238945303L);
        term96639 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term96641 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term96657 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term96658 = newInstance(Class.forName("java.time.LocalDate"));
        Object term96662 = newInstance(Class.forName("java.time.LocalTime"));
        Object term96667 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term96668 = newInstance(Class.forName("java.time.LocalDate"));
        Object term96672 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term96639, term96639.getClass(), "id", 4782766292773586077L);
        setLongField(term96641, term96641.getClass(), "id", -1368803674967453727L);
        setField(term96641, term96641.getClass(), "extId", term96643);
        setField(term96641, term96641.getClass(), "luid", "zDtePZrZQH");
        setIntField(term96658, term96658.getClass(), "year", 2028);
        setShortField(term96658, term96658.getClass(), "month", (short) 7);
        setShortField(term96658, term96658.getClass(), "day", (short) 17);
        setField(term96657, term96657.getClass(), "date", term96658);
        setByteField(term96662, term96662.getClass(), "hour", (byte) 1);
        setByteField(term96662, term96662.getClass(), "minute", (byte) 57);
        setByteField(term96662, term96662.getClass(), "second", (byte) 11);
        setIntField(term96662, term96662.getClass(), "nano", 379878282);
        setField(term96657, term96657.getClass(), "time", term96662);
        setField(term96641, term96641.getClass(), "registerTime", term96657);
        setIntField(term96668, term96668.getClass(), "year", 2019);
        setShortField(term96668, term96668.getClass(), "month", (short) 3);
        setShortField(term96668, term96668.getClass(), "day", (short) 15);
        setField(term96667, term96667.getClass(), "date", term96668);
        setByteField(term96672, term96672.getClass(), "hour", (byte) 22);
        setByteField(term96672, term96672.getClass(), "minute", (byte) 15);
        setByteField(term96672, term96672.getClass(), "second", (byte) 34);
        setIntField(term96672, term96672.getClass(), "nano", 75761129);
        setField(term96667, term96667.getClass(), "time", term96672);
        setField(term96641, term96641.getClass(), "accessTime", term96667);
        setField(term96639, term96639.getClass(), "card", term96641);
        setIntField(term96639, term96639.getClass(), "lastDataVersion", 1469773425);
        setField(term96639, term96639.getClass(), "userName", "YPVZjrbvVl");
        setIntField(term96639, term96639.getClass(), "point", -1873950815);
        setIntField(term96639, term96639.getClass(), "totalPoint", 1580956926);
        setIntField(term96639, term96639.getClass(), "iconId", 989244656);
        setIntField(term96639, term96639.getClass(), "nameplateId", 1888105108);
        setIntField(term96639, term96639.getClass(), "frameId", 507720504);
        setIntField(term96639, term96639.getClass(), "trophyId", 1565969836);
        setIntField(term96639, term96639.getClass(), "playCount", -1245521601);
        setIntField(term96639, term96639.getClass(), "playVsCount", 1500058331);
        setIntField(term96639, term96639.getClass(), "playSyncCount", -112602297);
        setIntField(term96639, term96639.getClass(), "winCount", -2142300138);
        setIntField(term96639, term96639.getClass(), "helpCount", -662235369);
        setIntField(term96639, term96639.getClass(), "comboCount", -188505057);
        setIntField(term96639, term96639.getClass(), "feverCount", 1539547587);
        setIntField(term96639, term96639.getClass(), "totalHiScore", -109999328);
        setIntField(term96639, term96639.getClass(), "totalEasyHighScore", 2066479007);
        setIntField(term96639, term96639.getClass(), "totalBasicHighScore", 513713337);
        setIntField(term96639, term96639.getClass(), "totalAdvancedHighScore", -563013373);
        setIntField(term96639, term96639.getClass(), "totalExpertHighScore", -558676728);
        setIntField(term96639, term96639.getClass(), "totalMasterHighScore", 356027079);
        setIntField(term96639, term96639.getClass(), "totalReMasterHighScore", 1395741052);
        setIntField(term96639, term96639.getClass(), "totalHighSync", -325013597);
        setIntField(term96639, term96639.getClass(), "totalEasySync", 963111794);
        setIntField(term96639, term96639.getClass(), "totalBasicSync", 94574545);
        setIntField(term96639, term96639.getClass(), "totalAdvancedSync", 1513786853);
        setIntField(term96639, term96639.getClass(), "totalExpertSync", 1635757738);
        setIntField(term96639, term96639.getClass(), "totalMasterSync", 1128345792);
        setIntField(term96639, term96639.getClass(), "totalReMasterSync", -556377581);
        setIntField(term96639, term96639.getClass(), "playerRating", 1451482001);
        setIntField(term96639, term96639.getClass(), "highestRating", -2078292497);
        setIntField(term96639, term96639.getClass(), "rankAuthTailId", 1009834663);
        setField(term96639, term96639.getClass(), "eventWatchedDate", "TWsXTUTREq");
        setField(term96639, term96639.getClass(), "webLimitDate", "tVsPWASlsh");
        setIntField(term96639, term96639.getClass(), "challengeTrackPhase", -230210054);
        setIntField(term96639, term96639.getClass(), "firstPlayBits", -615000850);
        setField(term96639, term96639.getClass(), "lastPlayDate", "PjZoebHrvq");
        setIntField(term96639, term96639.getClass(), "lastPlaceId", -753466696);
        setField(term96639, term96639.getClass(), "lastPlaceName", "VwpicfUdWr");
        setIntField(term96639, term96639.getClass(), "lastRegionId", 1816927743);
        setField(term96639, term96639.getClass(), "lastRegionName", "UDKBkeWilS");
        setField(term96639, term96639.getClass(), "lastClientId", "bNeNAYRdqb");
        setField(term96639, term96639.getClass(), "lastCountryCode", "dcGBEVfYLI");
        setIntField(term96639, term96639.getClass(), "eventPoint", -499934638);
        setIntField(term96639, term96639.getClass(), "totalLv", 332996405);
        setIntField(term96639, term96639.getClass(), "lastLoginBonusDay", -2032792413);
        setIntField(term96639, term96639.getClass(), "lastSurvivalBonusDay", -144153639);
        setIntField(term96639, term96639.getClass(), "loginBonusLv", -1696480829);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPresentEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term96639;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


