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

public class UserBoss_init_427141840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88957;

    public UserBoss_init_427141840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term88961 = new Long(-5258945362776941718L);
        term88957 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term88959 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term88975 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term88976 = newInstance(Class.forName("java.time.LocalDate"));
        Object term88980 = newInstance(Class.forName("java.time.LocalTime"));
        Object term88985 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term88986 = newInstance(Class.forName("java.time.LocalDate"));
        Object term88990 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term88957, term88957.getClass(), "id", 2599553846982918627L);
        setLongField(term88959, term88959.getClass(), "id", -4821516944173509228L);
        setField(term88959, term88959.getClass(), "extId", term88961);
        setField(term88959, term88959.getClass(), "luid", "saKRDpPnGD");
        setIntField(term88976, term88976.getClass(), "year", 2018);
        setShortField(term88976, term88976.getClass(), "month", (short) 12);
        setShortField(term88976, term88976.getClass(), "day", (short) 4);
        setField(term88975, term88975.getClass(), "date", term88976);
        setByteField(term88980, term88980.getClass(), "hour", (byte) 6);
        setByteField(term88980, term88980.getClass(), "minute", (byte) 23);
        setByteField(term88980, term88980.getClass(), "second", (byte) 36);
        setIntField(term88980, term88980.getClass(), "nano", 89535482);
        setField(term88975, term88975.getClass(), "time", term88980);
        setField(term88959, term88959.getClass(), "registerTime", term88975);
        setIntField(term88986, term88986.getClass(), "year", 2020);
        setShortField(term88986, term88986.getClass(), "month", (short) 1);
        setShortField(term88986, term88986.getClass(), "day", (short) 16);
        setField(term88985, term88985.getClass(), "date", term88986);
        setByteField(term88990, term88990.getClass(), "hour", (byte) 1);
        setByteField(term88990, term88990.getClass(), "minute", (byte) 58);
        setByteField(term88990, term88990.getClass(), "second", (byte) 17);
        setIntField(term88990, term88990.getClass(), "nano", 383254195);
        setField(term88985, term88985.getClass(), "time", term88990);
        setField(term88959, term88959.getClass(), "accessTime", term88985);
        setField(term88957, term88957.getClass(), "card", term88959);
        setIntField(term88957, term88957.getClass(), "lastDataVersion", -172568972);
        setField(term88957, term88957.getClass(), "userName", "UesGweYSco");
        setIntField(term88957, term88957.getClass(), "point", 952493182);
        setIntField(term88957, term88957.getClass(), "totalPoint", -1820882307);
        setIntField(term88957, term88957.getClass(), "iconId", 1368012856);
        setIntField(term88957, term88957.getClass(), "nameplateId", 1989958895);
        setIntField(term88957, term88957.getClass(), "frameId", 1509008640);
        setIntField(term88957, term88957.getClass(), "trophyId", -534740768);
        setIntField(term88957, term88957.getClass(), "playCount", 1760958066);
        setIntField(term88957, term88957.getClass(), "playVsCount", 26818439);
        setIntField(term88957, term88957.getClass(), "playSyncCount", 1721802598);
        setIntField(term88957, term88957.getClass(), "winCount", -1208938714);
        setIntField(term88957, term88957.getClass(), "helpCount", -1241552174);
        setIntField(term88957, term88957.getClass(), "comboCount", 1571367099);
        setIntField(term88957, term88957.getClass(), "feverCount", -106290041);
        setIntField(term88957, term88957.getClass(), "totalHiScore", -1931235714);
        setIntField(term88957, term88957.getClass(), "totalEasyHighScore", 1975801653);
        setIntField(term88957, term88957.getClass(), "totalBasicHighScore", -2017767309);
        setIntField(term88957, term88957.getClass(), "totalAdvancedHighScore", 1167998823);
        setIntField(term88957, term88957.getClass(), "totalExpertHighScore", -464580200);
        setIntField(term88957, term88957.getClass(), "totalMasterHighScore", -599457969);
        setIntField(term88957, term88957.getClass(), "totalReMasterHighScore", -1479981191);
        setIntField(term88957, term88957.getClass(), "totalHighSync", -2140535400);
        setIntField(term88957, term88957.getClass(), "totalEasySync", -1606011085);
        setIntField(term88957, term88957.getClass(), "totalBasicSync", 460089767);
        setIntField(term88957, term88957.getClass(), "totalAdvancedSync", -243759577);
        setIntField(term88957, term88957.getClass(), "totalExpertSync", 1346767326);
        setIntField(term88957, term88957.getClass(), "totalMasterSync", -2092002829);
        setIntField(term88957, term88957.getClass(), "totalReMasterSync", -1361580827);
        setIntField(term88957, term88957.getClass(), "playerRating", -958463390);
        setIntField(term88957, term88957.getClass(), "highestRating", 1950799121);
        setIntField(term88957, term88957.getClass(), "rankAuthTailId", -323987081);
        setField(term88957, term88957.getClass(), "eventWatchedDate", "uVnPUUZHSY");
        setField(term88957, term88957.getClass(), "webLimitDate", "LaWPqdDqyl");
        setIntField(term88957, term88957.getClass(), "challengeTrackPhase", -917394097);
        setIntField(term88957, term88957.getClass(), "firstPlayBits", -1877002042);
        setField(term88957, term88957.getClass(), "lastPlayDate", "BGDjrSZTJY");
        setIntField(term88957, term88957.getClass(), "lastPlaceId", 1442941255);
        setField(term88957, term88957.getClass(), "lastPlaceName", "VUVCEVItic");
        setIntField(term88957, term88957.getClass(), "lastRegionId", 1666341034);
        setField(term88957, term88957.getClass(), "lastRegionName", "tloEDDASGy");
        setField(term88957, term88957.getClass(), "lastClientId", "CQMdMBIICe");
        setField(term88957, term88957.getClass(), "lastCountryCode", "rbJaIkrSnM");
        setIntField(term88957, term88957.getClass(), "eventPoint", -46731631);
        setIntField(term88957, term88957.getClass(), "totalLv", -1256254174);
        setIntField(term88957, term88957.getClass(), "lastLoginBonusDay", -1808461007);
        setIntField(term88957, term88957.getClass(), "lastSurvivalBonusDay", -497824423);
        setIntField(term88957, term88957.getClass(), "loginBonusLv", -1924448836);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term88957;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


