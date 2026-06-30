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

public class UserActivity_setId_202136885510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46432;
     Object term46615;

    public UserActivity_setId_202136885510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term46438 = new Long(-8649738738252714180L);
        term46432 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity"));
        Object term46434 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term46436 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term46452 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46453 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46457 = newInstance(Class.forName("java.time.LocalTime"));
        Object term46462 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46463 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46467 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term46432, term46432.getClass(), "id", -5587528177305224828L);
        setLongField(term46434, term46434.getClass(), "id", 7950532649535587877L);
        setLongField(term46436, term46436.getClass(), "id", 7799452759993694308L);
        setField(term46436, term46436.getClass(), "extId", term46438);
        setField(term46436, term46436.getClass(), "luid", "MANlfBKTPY");
        setIntField(term46453, term46453.getClass(), "year", 2017);
        setShortField(term46453, term46453.getClass(), "month", (short) 1);
        setShortField(term46453, term46453.getClass(), "day", (short) 4);
        setField(term46452, term46452.getClass(), "date", term46453);
        setByteField(term46457, term46457.getClass(), "hour", (byte) 17);
        setByteField(term46457, term46457.getClass(), "minute", (byte) 39);
        setByteField(term46457, term46457.getClass(), "second", (byte) 5);
        setIntField(term46457, term46457.getClass(), "nano", 712424493);
        setField(term46452, term46452.getClass(), "time", term46457);
        setField(term46436, term46436.getClass(), "registerTime", term46452);
        setIntField(term46463, term46463.getClass(), "year", 2012);
        setShortField(term46463, term46463.getClass(), "month", (short) 1);
        setShortField(term46463, term46463.getClass(), "day", (short) 27);
        setField(term46462, term46462.getClass(), "date", term46463);
        setByteField(term46467, term46467.getClass(), "hour", (byte) 3);
        setByteField(term46467, term46467.getClass(), "minute", (byte) 30);
        setByteField(term46467, term46467.getClass(), "second", (byte) 25);
        setIntField(term46467, term46467.getClass(), "nano", 460782173);
        setField(term46462, term46462.getClass(), "time", term46467);
        setField(term46436, term46436.getClass(), "accessTime", term46462);
        setField(term46434, term46434.getClass(), "card", term46436);
        setIntField(term46434, term46434.getClass(), "lastDataVersion", -966646503);
        setField(term46434, term46434.getClass(), "userName", "mRoEmuCJhW");
        setIntField(term46434, term46434.getClass(), "point", 529842485);
        setIntField(term46434, term46434.getClass(), "totalPoint", -713215300);
        setIntField(term46434, term46434.getClass(), "iconId", -82690767);
        setIntField(term46434, term46434.getClass(), "nameplateId", 1511625253);
        setIntField(term46434, term46434.getClass(), "frameId", 2133047515);
        setIntField(term46434, term46434.getClass(), "trophyId", 1448469662);
        setIntField(term46434, term46434.getClass(), "playCount", -391447045);
        setIntField(term46434, term46434.getClass(), "playVsCount", -396759931);
        setIntField(term46434, term46434.getClass(), "playSyncCount", 85098350);
        setIntField(term46434, term46434.getClass(), "winCount", 1519270868);
        setIntField(term46434, term46434.getClass(), "helpCount", -1307675168);
        setIntField(term46434, term46434.getClass(), "comboCount", 550509363);
        setIntField(term46434, term46434.getClass(), "feverCount", 1200406150);
        setIntField(term46434, term46434.getClass(), "totalHiScore", 1009657063);
        setIntField(term46434, term46434.getClass(), "totalEasyHighScore", -104420972);
        setIntField(term46434, term46434.getClass(), "totalBasicHighScore", 933032980);
        setIntField(term46434, term46434.getClass(), "totalAdvancedHighScore", -1426390464);
        setIntField(term46434, term46434.getClass(), "totalExpertHighScore", -1709715410);
        setIntField(term46434, term46434.getClass(), "totalMasterHighScore", 1221046414);
        setIntField(term46434, term46434.getClass(), "totalReMasterHighScore", 1271215502);
        setIntField(term46434, term46434.getClass(), "totalHighSync", 106624322);
        setIntField(term46434, term46434.getClass(), "totalEasySync", 1664407428);
        setIntField(term46434, term46434.getClass(), "totalBasicSync", 980974243);
        setIntField(term46434, term46434.getClass(), "totalAdvancedSync", 1940850013);
        setIntField(term46434, term46434.getClass(), "totalExpertSync", 2014370043);
        setIntField(term46434, term46434.getClass(), "totalMasterSync", 2086898490);
        setIntField(term46434, term46434.getClass(), "totalReMasterSync", -556807183);
        setIntField(term46434, term46434.getClass(), "playerRating", 2079852711);
        setIntField(term46434, term46434.getClass(), "highestRating", -1960722897);
        setIntField(term46434, term46434.getClass(), "rankAuthTailId", 2058852943);
        setField(term46434, term46434.getClass(), "eventWatchedDate", "JJUWbMXpyM");
        setField(term46434, term46434.getClass(), "webLimitDate", "KDrRQWVXok");
        setIntField(term46434, term46434.getClass(), "challengeTrackPhase", 1189778174);
        setIntField(term46434, term46434.getClass(), "firstPlayBits", 1980524877);
        setField(term46434, term46434.getClass(), "lastPlayDate", "oOOwvWgxtf");
        setIntField(term46434, term46434.getClass(), "lastPlaceId", 1572487602);
        setField(term46434, term46434.getClass(), "lastPlaceName", "ywoADeiUfF");
        setIntField(term46434, term46434.getClass(), "lastRegionId", 354453982);
        setField(term46434, term46434.getClass(), "lastRegionName", "loHiudJxbt");
        setField(term46434, term46434.getClass(), "lastClientId", "lRbxbybNew");
        setField(term46434, term46434.getClass(), "lastCountryCode", "WzGudiEARD");
        setIntField(term46434, term46434.getClass(), "eventPoint", 791608608);
        setIntField(term46434, term46434.getClass(), "totalLv", 832068739);
        setIntField(term46434, term46434.getClass(), "lastLoginBonusDay", -1109536397);
        setIntField(term46434, term46434.getClass(), "lastSurvivalBonusDay", -356798505);
        setIntField(term46434, term46434.getClass(), "loginBonusLv", 1298263326);
        setField(term46432, term46432.getClass(), "user", term46434);
        setIntField(term46432, term46432.getClass(), "kind", 1534262946);
        setIntField(term46432, term46432.getClass(), "activityId", -732512836);
        setLongField(term46432, term46432.getClass(), "sortNumber", -1571034605670661708L);
        setIntField(term46432, term46432.getClass(), "param1", -583097103);
        setIntField(term46432, term46432.getClass(), "param2", 390772759);
        setIntField(term46432, term46432.getClass(), "param3", 121280572);
        setIntField(term46432, term46432.getClass(), "param4", 683645623);
        term46615 = new Long(-7983954942068142191L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term46615;
        callMethod(klass, "setId", argTypes, term46432, args);
    }

};


