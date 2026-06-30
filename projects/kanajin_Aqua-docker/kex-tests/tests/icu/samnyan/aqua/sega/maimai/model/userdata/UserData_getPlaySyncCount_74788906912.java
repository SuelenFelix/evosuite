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

public class UserData_getPlaySyncCount_74788906912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3169;

    public UserData_getPlaySyncCount_74788906912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3173 = new Long(-4325723315152823407L);
        term3169 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term3171 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3187 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3188 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3192 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3197 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3198 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3202 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3169, term3169.getClass(), "id", 2486810210675247493L);
        setLongField(term3171, term3171.getClass(), "id", 7009926388951271268L);
        setField(term3171, term3171.getClass(), "extId", term3173);
        setField(term3171, term3171.getClass(), "luid", "ZVecLZMLHF");
        setIntField(term3188, term3188.getClass(), "year", 2025);
        setShortField(term3188, term3188.getClass(), "month", (short) 3);
        setShortField(term3188, term3188.getClass(), "day", (short) 9);
        setField(term3187, term3187.getClass(), "date", term3188);
        setByteField(term3192, term3192.getClass(), "hour", (byte) 5);
        setByteField(term3192, term3192.getClass(), "minute", (byte) 49);
        setByteField(term3192, term3192.getClass(), "second", (byte) 12);
        setIntField(term3192, term3192.getClass(), "nano", 791695028);
        setField(term3187, term3187.getClass(), "time", term3192);
        setField(term3171, term3171.getClass(), "registerTime", term3187);
        setIntField(term3198, term3198.getClass(), "year", 2023);
        setShortField(term3198, term3198.getClass(), "month", (short) 9);
        setShortField(term3198, term3198.getClass(), "day", (short) 23);
        setField(term3197, term3197.getClass(), "date", term3198);
        setByteField(term3202, term3202.getClass(), "hour", (byte) 12);
        setByteField(term3202, term3202.getClass(), "minute", (byte) 55);
        setByteField(term3202, term3202.getClass(), "second", (byte) 58);
        setIntField(term3202, term3202.getClass(), "nano", 159178396);
        setField(term3197, term3197.getClass(), "time", term3202);
        setField(term3171, term3171.getClass(), "accessTime", term3197);
        setField(term3169, term3169.getClass(), "card", term3171);
        setIntField(term3169, term3169.getClass(), "lastDataVersion", -763166094);
        setField(term3169, term3169.getClass(), "userName", "fztQhjqwdP");
        setIntField(term3169, term3169.getClass(), "point", -222941705);
        setIntField(term3169, term3169.getClass(), "totalPoint", 291864719);
        setIntField(term3169, term3169.getClass(), "iconId", -1549607466);
        setIntField(term3169, term3169.getClass(), "nameplateId", 853609788);
        setIntField(term3169, term3169.getClass(), "frameId", -197820800);
        setIntField(term3169, term3169.getClass(), "trophyId", 723812297);
        setIntField(term3169, term3169.getClass(), "playCount", 1639448749);
        setIntField(term3169, term3169.getClass(), "playVsCount", 873659088);
        setIntField(term3169, term3169.getClass(), "playSyncCount", -975748721);
        setIntField(term3169, term3169.getClass(), "winCount", 433248783);
        setIntField(term3169, term3169.getClass(), "helpCount", -507944154);
        setIntField(term3169, term3169.getClass(), "comboCount", -1736183862);
        setIntField(term3169, term3169.getClass(), "feverCount", 897010381);
        setIntField(term3169, term3169.getClass(), "totalHiScore", -15712667);
        setIntField(term3169, term3169.getClass(), "totalEasyHighScore", 1964967720);
        setIntField(term3169, term3169.getClass(), "totalBasicHighScore", 1351900243);
        setIntField(term3169, term3169.getClass(), "totalAdvancedHighScore", -330897705);
        setIntField(term3169, term3169.getClass(), "totalExpertHighScore", 1065595802);
        setIntField(term3169, term3169.getClass(), "totalMasterHighScore", 21031843);
        setIntField(term3169, term3169.getClass(), "totalReMasterHighScore", -380787857);
        setIntField(term3169, term3169.getClass(), "totalHighSync", 319853052);
        setIntField(term3169, term3169.getClass(), "totalEasySync", -1097563716);
        setIntField(term3169, term3169.getClass(), "totalBasicSync", 1572907769);
        setIntField(term3169, term3169.getClass(), "totalAdvancedSync", 1608016787);
        setIntField(term3169, term3169.getClass(), "totalExpertSync", -516303035);
        setIntField(term3169, term3169.getClass(), "totalMasterSync", -2143043890);
        setIntField(term3169, term3169.getClass(), "totalReMasterSync", -2138825831);
        setIntField(term3169, term3169.getClass(), "playerRating", 1454781562);
        setIntField(term3169, term3169.getClass(), "highestRating", -27944011);
        setIntField(term3169, term3169.getClass(), "rankAuthTailId", -20614472);
        setField(term3169, term3169.getClass(), "eventWatchedDate", "eVpkWxjuki");
        setField(term3169, term3169.getClass(), "webLimitDate", "SJiQaLvSKv");
        setIntField(term3169, term3169.getClass(), "challengeTrackPhase", 1126618861);
        setIntField(term3169, term3169.getClass(), "firstPlayBits", 947449400);
        setField(term3169, term3169.getClass(), "lastPlayDate", "OEXDRUKcFl");
        setIntField(term3169, term3169.getClass(), "lastPlaceId", -763799087);
        setField(term3169, term3169.getClass(), "lastPlaceName", "RYdKCNNMBR");
        setIntField(term3169, term3169.getClass(), "lastRegionId", 1207142014);
        setField(term3169, term3169.getClass(), "lastRegionName", "yGtHPyvYiQ");
        setField(term3169, term3169.getClass(), "lastClientId", "MvRIxilFMJ");
        setField(term3169, term3169.getClass(), "lastCountryCode", "iNwOJRBEjp");
        setIntField(term3169, term3169.getClass(), "eventPoint", -876426634);
        setIntField(term3169, term3169.getClass(), "totalLv", 213831054);
        setIntField(term3169, term3169.getClass(), "lastLoginBonusDay", 330043745);
        setIntField(term3169, term3169.getClass(), "lastSurvivalBonusDay", -509349195);
        setIntField(term3169, term3169.getClass(), "loginBonusLv", -1639041228);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlaySyncCount", argTypes, term3169, args);
    }

};


