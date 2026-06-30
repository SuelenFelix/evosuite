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

public class UserData_setLastCountryCode_62515494994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25089;

    public UserData_setLastCountryCode_62515494994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term25093 = new Long(7247160664318067468L);
        term25089 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term25091 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term25107 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25108 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25112 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25117 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25118 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25122 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term25089, term25089.getClass(), "id", -1505191021111100819L);
        setLongField(term25091, term25091.getClass(), "id", -1000830646340880796L);
        setField(term25091, term25091.getClass(), "extId", term25093);
        setField(term25091, term25091.getClass(), "luid", "FLQJOzEXff");
        setIntField(term25108, term25108.getClass(), "year", 2025);
        setShortField(term25108, term25108.getClass(), "month", (short) 11);
        setShortField(term25108, term25108.getClass(), "day", (short) 16);
        setField(term25107, term25107.getClass(), "date", term25108);
        setByteField(term25112, term25112.getClass(), "hour", (byte) 12);
        setByteField(term25112, term25112.getClass(), "minute", (byte) 27);
        setByteField(term25112, term25112.getClass(), "second", (byte) 36);
        setIntField(term25112, term25112.getClass(), "nano", 699989217);
        setField(term25107, term25107.getClass(), "time", term25112);
        setField(term25091, term25091.getClass(), "registerTime", term25107);
        setIntField(term25118, term25118.getClass(), "year", 2018);
        setShortField(term25118, term25118.getClass(), "month", (short) 10);
        setShortField(term25118, term25118.getClass(), "day", (short) 3);
        setField(term25117, term25117.getClass(), "date", term25118);
        setByteField(term25122, term25122.getClass(), "hour", (byte) 12);
        setByteField(term25122, term25122.getClass(), "minute", (byte) 49);
        setByteField(term25122, term25122.getClass(), "second", (byte) 38);
        setIntField(term25122, term25122.getClass(), "nano", 549840711);
        setField(term25117, term25117.getClass(), "time", term25122);
        setField(term25091, term25091.getClass(), "accessTime", term25117);
        setField(term25089, term25089.getClass(), "card", term25091);
        setIntField(term25089, term25089.getClass(), "lastDataVersion", -619693439);
        setField(term25089, term25089.getClass(), "userName", "qlaIVJBSfQ");
        setIntField(term25089, term25089.getClass(), "point", 1886882056);
        setIntField(term25089, term25089.getClass(), "totalPoint", -689559993);
        setIntField(term25089, term25089.getClass(), "iconId", 263696243);
        setIntField(term25089, term25089.getClass(), "nameplateId", -2012537672);
        setIntField(term25089, term25089.getClass(), "frameId", -879433115);
        setIntField(term25089, term25089.getClass(), "trophyId", 275958841);
        setIntField(term25089, term25089.getClass(), "playCount", 1628668899);
        setIntField(term25089, term25089.getClass(), "playVsCount", -998305335);
        setIntField(term25089, term25089.getClass(), "playSyncCount", 2120008602);
        setIntField(term25089, term25089.getClass(), "winCount", 1085966764);
        setIntField(term25089, term25089.getClass(), "helpCount", -609882960);
        setIntField(term25089, term25089.getClass(), "comboCount", -1690283734);
        setIntField(term25089, term25089.getClass(), "feverCount", -1620783951);
        setIntField(term25089, term25089.getClass(), "totalHiScore", 1400387811);
        setIntField(term25089, term25089.getClass(), "totalEasyHighScore", 903826116);
        setIntField(term25089, term25089.getClass(), "totalBasicHighScore", 641366348);
        setIntField(term25089, term25089.getClass(), "totalAdvancedHighScore", -353276989);
        setIntField(term25089, term25089.getClass(), "totalExpertHighScore", -505563323);
        setIntField(term25089, term25089.getClass(), "totalMasterHighScore", -2087065864);
        setIntField(term25089, term25089.getClass(), "totalReMasterHighScore", -169812741);
        setIntField(term25089, term25089.getClass(), "totalHighSync", -1015119737);
        setIntField(term25089, term25089.getClass(), "totalEasySync", 1479117665);
        setIntField(term25089, term25089.getClass(), "totalBasicSync", 766065097);
        setIntField(term25089, term25089.getClass(), "totalAdvancedSync", 1703658250);
        setIntField(term25089, term25089.getClass(), "totalExpertSync", -942615253);
        setIntField(term25089, term25089.getClass(), "totalMasterSync", 1642227506);
        setIntField(term25089, term25089.getClass(), "totalReMasterSync", -1930855861);
        setIntField(term25089, term25089.getClass(), "playerRating", -59278290);
        setIntField(term25089, term25089.getClass(), "highestRating", 862799975);
        setIntField(term25089, term25089.getClass(), "rankAuthTailId", 785517219);
        setField(term25089, term25089.getClass(), "eventWatchedDate", "lYvIWBFFsq");
        setField(term25089, term25089.getClass(), "webLimitDate", "tThwsqWKcE");
        setIntField(term25089, term25089.getClass(), "challengeTrackPhase", -96163747);
        setIntField(term25089, term25089.getClass(), "firstPlayBits", 1191473962);
        setField(term25089, term25089.getClass(), "lastPlayDate", "bkSgsDrkCN");
        setIntField(term25089, term25089.getClass(), "lastPlaceId", 110101710);
        setField(term25089, term25089.getClass(), "lastPlaceName", "hwjlcimgJH");
        setIntField(term25089, term25089.getClass(), "lastRegionId", 1819101781);
        setField(term25089, term25089.getClass(), "lastRegionName", "TLxQzxvizR");
        setField(term25089, term25089.getClass(), "lastClientId", "uUgJfKAzDM");
        setField(term25089, term25089.getClass(), "lastCountryCode", "gZPZNkweEp");
        setIntField(term25089, term25089.getClass(), "eventPoint", -1430157795);
        setIntField(term25089, term25089.getClass(), "totalLv", -1943692500);
        setIntField(term25089, term25089.getClass(), "lastLoginBonusDay", -108045978);
        setIntField(term25089, term25089.getClass(), "lastSurvivalBonusDay", -1242612066);
        setIntField(term25089, term25089.getClass(), "loginBonusLv", -1492896610);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vfennwtmqe";
        callMethod(klass, "setLastCountryCode", argTypes, term25089, args);
    }

};


