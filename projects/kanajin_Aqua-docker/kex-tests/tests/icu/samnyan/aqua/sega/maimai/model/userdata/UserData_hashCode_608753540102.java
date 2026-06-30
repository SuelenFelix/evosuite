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

public class UserData_hashCode_608753540102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27235;

    public UserData_hashCode_608753540102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27239 = new Long(-9040825890007374809L);
        term27235 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term27237 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term27253 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27254 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27258 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27263 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27264 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27268 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term27235, term27235.getClass(), "id", -3954795081650780841L);
        setLongField(term27237, term27237.getClass(), "id", 3288791194263207397L);
        setField(term27237, term27237.getClass(), "extId", term27239);
        setField(term27237, term27237.getClass(), "luid", "mzCFLzFuSj");
        setIntField(term27254, term27254.getClass(), "year", 2022);
        setShortField(term27254, term27254.getClass(), "month", (short) 8);
        setShortField(term27254, term27254.getClass(), "day", (short) 30);
        setField(term27253, term27253.getClass(), "date", term27254);
        setByteField(term27258, term27258.getClass(), "hour", (byte) 3);
        setByteField(term27258, term27258.getClass(), "minute", (byte) 13);
        setByteField(term27258, term27258.getClass(), "second", (byte) 34);
        setIntField(term27258, term27258.getClass(), "nano", 69286341);
        setField(term27253, term27253.getClass(), "time", term27258);
        setField(term27237, term27237.getClass(), "registerTime", term27253);
        setIntField(term27264, term27264.getClass(), "year", 2013);
        setShortField(term27264, term27264.getClass(), "month", (short) 5);
        setShortField(term27264, term27264.getClass(), "day", (short) 14);
        setField(term27263, term27263.getClass(), "date", term27264);
        setByteField(term27268, term27268.getClass(), "hour", (byte) 12);
        setByteField(term27268, term27268.getClass(), "minute", (byte) 8);
        setByteField(term27268, term27268.getClass(), "second", (byte) 12);
        setIntField(term27268, term27268.getClass(), "nano", 597594916);
        setField(term27263, term27263.getClass(), "time", term27268);
        setField(term27237, term27237.getClass(), "accessTime", term27263);
        setField(term27235, term27235.getClass(), "card", term27237);
        setIntField(term27235, term27235.getClass(), "lastDataVersion", -537646987);
        setField(term27235, term27235.getClass(), "userName", "WQnMpDlSfA");
        setIntField(term27235, term27235.getClass(), "point", -558527010);
        setIntField(term27235, term27235.getClass(), "totalPoint", -271207664);
        setIntField(term27235, term27235.getClass(), "iconId", -1452529928);
        setIntField(term27235, term27235.getClass(), "nameplateId", -467618426);
        setIntField(term27235, term27235.getClass(), "frameId", 1728446971);
        setIntField(term27235, term27235.getClass(), "trophyId", 871757481);
        setIntField(term27235, term27235.getClass(), "playCount", -866223414);
        setIntField(term27235, term27235.getClass(), "playVsCount", -914821646);
        setIntField(term27235, term27235.getClass(), "playSyncCount", -1420229744);
        setIntField(term27235, term27235.getClass(), "winCount", -2026011046);
        setIntField(term27235, term27235.getClass(), "helpCount", -930966430);
        setIntField(term27235, term27235.getClass(), "comboCount", -1137340653);
        setIntField(term27235, term27235.getClass(), "feverCount", -520048649);
        setIntField(term27235, term27235.getClass(), "totalHiScore", -39379486);
        setIntField(term27235, term27235.getClass(), "totalEasyHighScore", 92637602);
        setIntField(term27235, term27235.getClass(), "totalBasicHighScore", -702644184);
        setIntField(term27235, term27235.getClass(), "totalAdvancedHighScore", 873158899);
        setIntField(term27235, term27235.getClass(), "totalExpertHighScore", -939494687);
        setIntField(term27235, term27235.getClass(), "totalMasterHighScore", 1818886574);
        setIntField(term27235, term27235.getClass(), "totalReMasterHighScore", -1082194143);
        setIntField(term27235, term27235.getClass(), "totalHighSync", 1109687027);
        setIntField(term27235, term27235.getClass(), "totalEasySync", -1583077425);
        setIntField(term27235, term27235.getClass(), "totalBasicSync", -1058283823);
        setIntField(term27235, term27235.getClass(), "totalAdvancedSync", -1620576583);
        setIntField(term27235, term27235.getClass(), "totalExpertSync", -1365748841);
        setIntField(term27235, term27235.getClass(), "totalMasterSync", 1223391792);
        setIntField(term27235, term27235.getClass(), "totalReMasterSync", -1134943583);
        setIntField(term27235, term27235.getClass(), "playerRating", -694277686);
        setIntField(term27235, term27235.getClass(), "highestRating", -2044994445);
        setIntField(term27235, term27235.getClass(), "rankAuthTailId", -883941371);
        setField(term27235, term27235.getClass(), "eventWatchedDate", "aOIvTQtXiv");
        setField(term27235, term27235.getClass(), "webLimitDate", "IyjDiknqhA");
        setIntField(term27235, term27235.getClass(), "challengeTrackPhase", -1545047968);
        setIntField(term27235, term27235.getClass(), "firstPlayBits", 665116636);
        setField(term27235, term27235.getClass(), "lastPlayDate", "IHsXSAFYKi");
        setIntField(term27235, term27235.getClass(), "lastPlaceId", 1255353874);
        setField(term27235, term27235.getClass(), "lastPlaceName", "KyGbLglqbW");
        setIntField(term27235, term27235.getClass(), "lastRegionId", 550111365);
        setField(term27235, term27235.getClass(), "lastRegionName", "ZKVeStsSNT");
        setField(term27235, term27235.getClass(), "lastClientId", "cqCXYaAnFB");
        setField(term27235, term27235.getClass(), "lastCountryCode", "UPLNFZHXjw");
        setIntField(term27235, term27235.getClass(), "eventPoint", 1756090789);
        setIntField(term27235, term27235.getClass(), "totalLv", -315044098);
        setIntField(term27235, term27235.getClass(), "lastLoginBonusDay", 2920253);
        setIntField(term27235, term27235.getClass(), "lastSurvivalBonusDay", 310113293);
        setIntField(term27235, term27235.getClass(), "loginBonusLv", -1668505285);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term27235, args);
    }

};


