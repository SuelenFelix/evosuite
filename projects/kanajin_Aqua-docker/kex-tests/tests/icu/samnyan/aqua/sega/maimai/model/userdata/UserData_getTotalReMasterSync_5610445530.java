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

public class UserData_getTotalReMasterSync_5610445530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7921;

    public UserData_getTotalReMasterSync_5610445530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7925 = new Long(6855071767938501807L);
        term7921 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term7923 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term7939 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7940 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7944 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7949 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7950 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7954 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term7921, term7921.getClass(), "id", 5953383087795962419L);
        setLongField(term7923, term7923.getClass(), "id", 7994303628307559416L);
        setField(term7923, term7923.getClass(), "extId", term7925);
        setField(term7923, term7923.getClass(), "luid", "SPtPatHeOm");
        setIntField(term7940, term7940.getClass(), "year", 2016);
        setShortField(term7940, term7940.getClass(), "month", (short) 2);
        setShortField(term7940, term7940.getClass(), "day", (short) 25);
        setField(term7939, term7939.getClass(), "date", term7940);
        setByteField(term7944, term7944.getClass(), "hour", (byte) 8);
        setByteField(term7944, term7944.getClass(), "minute", (byte) 54);
        setByteField(term7944, term7944.getClass(), "second", (byte) 40);
        setIntField(term7944, term7944.getClass(), "nano", 124525896);
        setField(term7939, term7939.getClass(), "time", term7944);
        setField(term7923, term7923.getClass(), "registerTime", term7939);
        setIntField(term7950, term7950.getClass(), "year", 2029);
        setShortField(term7950, term7950.getClass(), "month", (short) 1);
        setShortField(term7950, term7950.getClass(), "day", (short) 10);
        setField(term7949, term7949.getClass(), "date", term7950);
        setByteField(term7954, term7954.getClass(), "hour", (byte) 8);
        setByteField(term7954, term7954.getClass(), "minute", (byte) 46);
        setByteField(term7954, term7954.getClass(), "second", (byte) 35);
        setIntField(term7954, term7954.getClass(), "nano", 58807194);
        setField(term7949, term7949.getClass(), "time", term7954);
        setField(term7923, term7923.getClass(), "accessTime", term7949);
        setField(term7921, term7921.getClass(), "card", term7923);
        setIntField(term7921, term7921.getClass(), "lastDataVersion", 1151963130);
        setField(term7921, term7921.getClass(), "userName", "ywmcuThdfL");
        setIntField(term7921, term7921.getClass(), "point", -1855819749);
        setIntField(term7921, term7921.getClass(), "totalPoint", 1059048043);
        setIntField(term7921, term7921.getClass(), "iconId", 537273345);
        setIntField(term7921, term7921.getClass(), "nameplateId", -346107257);
        setIntField(term7921, term7921.getClass(), "frameId", -1577393360);
        setIntField(term7921, term7921.getClass(), "trophyId", 1112256038);
        setIntField(term7921, term7921.getClass(), "playCount", -441333794);
        setIntField(term7921, term7921.getClass(), "playVsCount", 1504698817);
        setIntField(term7921, term7921.getClass(), "playSyncCount", -2018333791);
        setIntField(term7921, term7921.getClass(), "winCount", -742476678);
        setIntField(term7921, term7921.getClass(), "helpCount", -824369460);
        setIntField(term7921, term7921.getClass(), "comboCount", -1573760035);
        setIntField(term7921, term7921.getClass(), "feverCount", -1147965121);
        setIntField(term7921, term7921.getClass(), "totalHiScore", -867099093);
        setIntField(term7921, term7921.getClass(), "totalEasyHighScore", -1091199008);
        setIntField(term7921, term7921.getClass(), "totalBasicHighScore", 1837886253);
        setIntField(term7921, term7921.getClass(), "totalAdvancedHighScore", -269528550);
        setIntField(term7921, term7921.getClass(), "totalExpertHighScore", 2108571355);
        setIntField(term7921, term7921.getClass(), "totalMasterHighScore", 1909966089);
        setIntField(term7921, term7921.getClass(), "totalReMasterHighScore", 1827255916);
        setIntField(term7921, term7921.getClass(), "totalHighSync", 2039815750);
        setIntField(term7921, term7921.getClass(), "totalEasySync", 2079590265);
        setIntField(term7921, term7921.getClass(), "totalBasicSync", -435079567);
        setIntField(term7921, term7921.getClass(), "totalAdvancedSync", -1017617829);
        setIntField(term7921, term7921.getClass(), "totalExpertSync", 270928865);
        setIntField(term7921, term7921.getClass(), "totalMasterSync", -308526089);
        setIntField(term7921, term7921.getClass(), "totalReMasterSync", -359675864);
        setIntField(term7921, term7921.getClass(), "playerRating", -1671982964);
        setIntField(term7921, term7921.getClass(), "highestRating", 776218451);
        setIntField(term7921, term7921.getClass(), "rankAuthTailId", -1362132929);
        setField(term7921, term7921.getClass(), "eventWatchedDate", "GBOEuByOfr");
        setField(term7921, term7921.getClass(), "webLimitDate", "NHbOFFjyVK");
        setIntField(term7921, term7921.getClass(), "challengeTrackPhase", 1267740164);
        setIntField(term7921, term7921.getClass(), "firstPlayBits", 1363887997);
        setField(term7921, term7921.getClass(), "lastPlayDate", "zaloBqlrSo");
        setIntField(term7921, term7921.getClass(), "lastPlaceId", -1744763945);
        setField(term7921, term7921.getClass(), "lastPlaceName", "vvoLrMGCoN");
        setIntField(term7921, term7921.getClass(), "lastRegionId", 852281447);
        setField(term7921, term7921.getClass(), "lastRegionName", "pXdglvyrQe");
        setField(term7921, term7921.getClass(), "lastClientId", "OcfNzHYdki");
        setField(term7921, term7921.getClass(), "lastCountryCode", "uPuCVuZYOI");
        setIntField(term7921, term7921.getClass(), "eventPoint", 1248430530);
        setIntField(term7921, term7921.getClass(), "totalLv", -1911828505);
        setIntField(term7921, term7921.getClass(), "lastLoginBonusDay", 241725499);
        setIntField(term7921, term7921.getClass(), "lastSurvivalBonusDay", 823179298);
        setIntField(term7921, term7921.getClass(), "loginBonusLv", 1174484848);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalReMasterSync", argTypes, term7921, args);
    }

};


