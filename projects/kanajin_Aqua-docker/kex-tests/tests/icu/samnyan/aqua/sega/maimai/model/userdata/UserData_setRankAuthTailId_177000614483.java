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

public class UserData_setRankAuthTailId_177000614483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22043;
     Object term22217;

    public UserData_setRankAuthTailId_177000614483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22047 = new Long(-8652538484981166496L);
        term22043 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term22045 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term22061 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22062 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22066 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22071 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22072 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22076 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term22043, term22043.getClass(), "id", -8892586408602479513L);
        setLongField(term22045, term22045.getClass(), "id", 4616440478358528406L);
        setField(term22045, term22045.getClass(), "extId", term22047);
        setField(term22045, term22045.getClass(), "luid", "TiUqHrjoEU");
        setIntField(term22062, term22062.getClass(), "year", 2010);
        setShortField(term22062, term22062.getClass(), "month", (short) 2);
        setShortField(term22062, term22062.getClass(), "day", (short) 28);
        setField(term22061, term22061.getClass(), "date", term22062);
        setByteField(term22066, term22066.getClass(), "hour", (byte) 2);
        setByteField(term22066, term22066.getClass(), "minute", (byte) 54);
        setByteField(term22066, term22066.getClass(), "second", (byte) 48);
        setIntField(term22066, term22066.getClass(), "nano", 930628940);
        setField(term22061, term22061.getClass(), "time", term22066);
        setField(term22045, term22045.getClass(), "registerTime", term22061);
        setIntField(term22072, term22072.getClass(), "year", 2022);
        setShortField(term22072, term22072.getClass(), "month", (short) 3);
        setShortField(term22072, term22072.getClass(), "day", (short) 11);
        setField(term22071, term22071.getClass(), "date", term22072);
        setByteField(term22076, term22076.getClass(), "hour", (byte) 7);
        setByteField(term22076, term22076.getClass(), "minute", (byte) 12);
        setByteField(term22076, term22076.getClass(), "second", (byte) 56);
        setIntField(term22076, term22076.getClass(), "nano", 884158779);
        setField(term22071, term22071.getClass(), "time", term22076);
        setField(term22045, term22045.getClass(), "accessTime", term22071);
        setField(term22043, term22043.getClass(), "card", term22045);
        setIntField(term22043, term22043.getClass(), "lastDataVersion", -882725204);
        setField(term22043, term22043.getClass(), "userName", "eoEvZbdLjL");
        setIntField(term22043, term22043.getClass(), "point", 912627382);
        setIntField(term22043, term22043.getClass(), "totalPoint", -761296444);
        setIntField(term22043, term22043.getClass(), "iconId", -189523711);
        setIntField(term22043, term22043.getClass(), "nameplateId", 1697321852);
        setIntField(term22043, term22043.getClass(), "frameId", 2107931912);
        setIntField(term22043, term22043.getClass(), "trophyId", 198562318);
        setIntField(term22043, term22043.getClass(), "playCount", 1164105108);
        setIntField(term22043, term22043.getClass(), "playVsCount", -972073241);
        setIntField(term22043, term22043.getClass(), "playSyncCount", 643112473);
        setIntField(term22043, term22043.getClass(), "winCount", -1141492053);
        setIntField(term22043, term22043.getClass(), "helpCount", 1094053796);
        setIntField(term22043, term22043.getClass(), "comboCount", -2097088884);
        setIntField(term22043, term22043.getClass(), "feverCount", -1793718020);
        setIntField(term22043, term22043.getClass(), "totalHiScore", 1087957895);
        setIntField(term22043, term22043.getClass(), "totalEasyHighScore", -1347788838);
        setIntField(term22043, term22043.getClass(), "totalBasicHighScore", -83628231);
        setIntField(term22043, term22043.getClass(), "totalAdvancedHighScore", 1337550691);
        setIntField(term22043, term22043.getClass(), "totalExpertHighScore", 2107385711);
        setIntField(term22043, term22043.getClass(), "totalMasterHighScore", 986298442);
        setIntField(term22043, term22043.getClass(), "totalReMasterHighScore", 1751660702);
        setIntField(term22043, term22043.getClass(), "totalHighSync", 433217860);
        setIntField(term22043, term22043.getClass(), "totalEasySync", 495773924);
        setIntField(term22043, term22043.getClass(), "totalBasicSync", 1485597364);
        setIntField(term22043, term22043.getClass(), "totalAdvancedSync", 1232259140);
        setIntField(term22043, term22043.getClass(), "totalExpertSync", -1371367751);
        setIntField(term22043, term22043.getClass(), "totalMasterSync", -954813389);
        setIntField(term22043, term22043.getClass(), "totalReMasterSync", -232542458);
        setIntField(term22043, term22043.getClass(), "playerRating", -106999876);
        setIntField(term22043, term22043.getClass(), "highestRating", -2129996761);
        setIntField(term22043, term22043.getClass(), "rankAuthTailId", 1822990018);
        setField(term22043, term22043.getClass(), "eventWatchedDate", "BkIxsyPkGy");
        setField(term22043, term22043.getClass(), "webLimitDate", "mrMGwoRgVY");
        setIntField(term22043, term22043.getClass(), "challengeTrackPhase", -417542619);
        setIntField(term22043, term22043.getClass(), "firstPlayBits", 562244123);
        setField(term22043, term22043.getClass(), "lastPlayDate", "mxVLTgCwki");
        setIntField(term22043, term22043.getClass(), "lastPlaceId", -1020238686);
        setField(term22043, term22043.getClass(), "lastPlaceName", "wCurppnDSA");
        setIntField(term22043, term22043.getClass(), "lastRegionId", -1450230869);
        setField(term22043, term22043.getClass(), "lastRegionName", "JydxSNTMYt");
        setField(term22043, term22043.getClass(), "lastClientId", "KpurAcrHYT");
        setField(term22043, term22043.getClass(), "lastCountryCode", "QjvDwgKJGz");
        setIntField(term22043, term22043.getClass(), "eventPoint", -785918740);
        setIntField(term22043, term22043.getClass(), "totalLv", 384642213);
        setIntField(term22043, term22043.getClass(), "lastLoginBonusDay", 1673176720);
        setIntField(term22043, term22043.getClass(), "lastSurvivalBonusDay", 1084767630);
        setIntField(term22043, term22043.getClass(), "loginBonusLv", 1634202484);
        term22217 = new Integer(-1738191161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term22217;
        callMethod(klass, "setRankAuthTailId", argTypes, term22043, args);
    }

};


