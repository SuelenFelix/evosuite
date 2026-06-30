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

public class UserData_getPlayVsCount_168903614511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2905;

    public UserData_getPlayVsCount_168903614511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2909 = new Long(-8885298608300233488L);
        term2905 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term2907 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term2923 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2924 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2928 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2933 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2934 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2938 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term2905, term2905.getClass(), "id", 8059786003080744426L);
        setLongField(term2907, term2907.getClass(), "id", -4365849114644724155L);
        setField(term2907, term2907.getClass(), "extId", term2909);
        setField(term2907, term2907.getClass(), "luid", "BKLfkLiZTH");
        setIntField(term2924, term2924.getClass(), "year", 2015);
        setShortField(term2924, term2924.getClass(), "month", (short) 3);
        setShortField(term2924, term2924.getClass(), "day", (short) 10);
        setField(term2923, term2923.getClass(), "date", term2924);
        setByteField(term2928, term2928.getClass(), "hour", (byte) 23);
        setByteField(term2928, term2928.getClass(), "minute", (byte) 34);
        setByteField(term2928, term2928.getClass(), "second", (byte) 44);
        setIntField(term2928, term2928.getClass(), "nano", 587322824);
        setField(term2923, term2923.getClass(), "time", term2928);
        setField(term2907, term2907.getClass(), "registerTime", term2923);
        setIntField(term2934, term2934.getClass(), "year", 2027);
        setShortField(term2934, term2934.getClass(), "month", (short) 8);
        setShortField(term2934, term2934.getClass(), "day", (short) 26);
        setField(term2933, term2933.getClass(), "date", term2934);
        setByteField(term2938, term2938.getClass(), "hour", (byte) 5);
        setByteField(term2938, term2938.getClass(), "minute", (byte) 11);
        setByteField(term2938, term2938.getClass(), "second", (byte) 9);
        setIntField(term2938, term2938.getClass(), "nano", 219245092);
        setField(term2933, term2933.getClass(), "time", term2938);
        setField(term2907, term2907.getClass(), "accessTime", term2933);
        setField(term2905, term2905.getClass(), "card", term2907);
        setIntField(term2905, term2905.getClass(), "lastDataVersion", -97742366);
        setField(term2905, term2905.getClass(), "userName", "SPpkrGcPRr");
        setIntField(term2905, term2905.getClass(), "point", 1638851942);
        setIntField(term2905, term2905.getClass(), "totalPoint", 1374790203);
        setIntField(term2905, term2905.getClass(), "iconId", 1160010161);
        setIntField(term2905, term2905.getClass(), "nameplateId", -423900705);
        setIntField(term2905, term2905.getClass(), "frameId", -525570815);
        setIntField(term2905, term2905.getClass(), "trophyId", 754055848);
        setIntField(term2905, term2905.getClass(), "playCount", -19246901);
        setIntField(term2905, term2905.getClass(), "playVsCount", -370828664);
        setIntField(term2905, term2905.getClass(), "playSyncCount", 1168633950);
        setIntField(term2905, term2905.getClass(), "winCount", 1607082164);
        setIntField(term2905, term2905.getClass(), "helpCount", 1890399366);
        setIntField(term2905, term2905.getClass(), "comboCount", -1867239125);
        setIntField(term2905, term2905.getClass(), "feverCount", 952869601);
        setIntField(term2905, term2905.getClass(), "totalHiScore", 91958879);
        setIntField(term2905, term2905.getClass(), "totalEasyHighScore", -645429025);
        setIntField(term2905, term2905.getClass(), "totalBasicHighScore", -688213483);
        setIntField(term2905, term2905.getClass(), "totalAdvancedHighScore", 644154104);
        setIntField(term2905, term2905.getClass(), "totalExpertHighScore", 76650923);
        setIntField(term2905, term2905.getClass(), "totalMasterHighScore", 1003743923);
        setIntField(term2905, term2905.getClass(), "totalReMasterHighScore", 1887772522);
        setIntField(term2905, term2905.getClass(), "totalHighSync", 354196060);
        setIntField(term2905, term2905.getClass(), "totalEasySync", -1840305774);
        setIntField(term2905, term2905.getClass(), "totalBasicSync", 1365087144);
        setIntField(term2905, term2905.getClass(), "totalAdvancedSync", -1537255112);
        setIntField(term2905, term2905.getClass(), "totalExpertSync", 934477462);
        setIntField(term2905, term2905.getClass(), "totalMasterSync", 4900410);
        setIntField(term2905, term2905.getClass(), "totalReMasterSync", -1252345779);
        setIntField(term2905, term2905.getClass(), "playerRating", -2063365430);
        setIntField(term2905, term2905.getClass(), "highestRating", 812570053);
        setIntField(term2905, term2905.getClass(), "rankAuthTailId", -1488938905);
        setField(term2905, term2905.getClass(), "eventWatchedDate", "sEccwbJKYE");
        setField(term2905, term2905.getClass(), "webLimitDate", "AWRooQKkdW");
        setIntField(term2905, term2905.getClass(), "challengeTrackPhase", 1916544127);
        setIntField(term2905, term2905.getClass(), "firstPlayBits", -1133405894);
        setField(term2905, term2905.getClass(), "lastPlayDate", "vjxIhXHxGR");
        setIntField(term2905, term2905.getClass(), "lastPlaceId", 1289741214);
        setField(term2905, term2905.getClass(), "lastPlaceName", "QXzGXbEXMu");
        setIntField(term2905, term2905.getClass(), "lastRegionId", 243280944);
        setField(term2905, term2905.getClass(), "lastRegionName", "qxSDVejjiY");
        setField(term2905, term2905.getClass(), "lastClientId", "xBsXSDjXYK");
        setField(term2905, term2905.getClass(), "lastCountryCode", "sEnIVFtZuQ");
        setIntField(term2905, term2905.getClass(), "eventPoint", -726681073);
        setIntField(term2905, term2905.getClass(), "totalLv", -1724487863);
        setIntField(term2905, term2905.getClass(), "lastLoginBonusDay", -128490829);
        setIntField(term2905, term2905.getClass(), "lastSurvivalBonusDay", 202214133);
        setIntField(term2905, term2905.getClass(), "loginBonusLv", 1543091617);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayVsCount", argTypes, term2905, args);
    }

};


