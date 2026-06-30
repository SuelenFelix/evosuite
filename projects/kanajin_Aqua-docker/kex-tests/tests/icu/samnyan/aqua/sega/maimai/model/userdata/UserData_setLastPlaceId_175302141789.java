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

public class UserData_setLastPlaceId_175302141789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23699;
     Object term23873;

    public UserData_setLastPlaceId_175302141789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23703 = new Long(6689117472719450333L);
        term23699 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term23701 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term23717 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23718 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23722 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23727 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23728 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23732 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term23699, term23699.getClass(), "id", 3090901538358721367L);
        setLongField(term23701, term23701.getClass(), "id", -1677189124507026637L);
        setField(term23701, term23701.getClass(), "extId", term23703);
        setField(term23701, term23701.getClass(), "luid", "vydWXHfFTw");
        setIntField(term23718, term23718.getClass(), "year", 2013);
        setShortField(term23718, term23718.getClass(), "month", (short) 10);
        setShortField(term23718, term23718.getClass(), "day", (short) 7);
        setField(term23717, term23717.getClass(), "date", term23718);
        setByteField(term23722, term23722.getClass(), "hour", (byte) 12);
        setByteField(term23722, term23722.getClass(), "minute", (byte) 2);
        setByteField(term23722, term23722.getClass(), "second", (byte) 42);
        setIntField(term23722, term23722.getClass(), "nano", 202308437);
        setField(term23717, term23717.getClass(), "time", term23722);
        setField(term23701, term23701.getClass(), "registerTime", term23717);
        setIntField(term23728, term23728.getClass(), "year", 2019);
        setShortField(term23728, term23728.getClass(), "month", (short) 12);
        setShortField(term23728, term23728.getClass(), "day", (short) 29);
        setField(term23727, term23727.getClass(), "date", term23728);
        setByteField(term23732, term23732.getClass(), "hour", (byte) 16);
        setByteField(term23732, term23732.getClass(), "minute", (byte) 10);
        setByteField(term23732, term23732.getClass(), "second", (byte) 1);
        setIntField(term23732, term23732.getClass(), "nano", 198559584);
        setField(term23727, term23727.getClass(), "time", term23732);
        setField(term23701, term23701.getClass(), "accessTime", term23727);
        setField(term23699, term23699.getClass(), "card", term23701);
        setIntField(term23699, term23699.getClass(), "lastDataVersion", 435463871);
        setField(term23699, term23699.getClass(), "userName", "DRhkpDneCC");
        setIntField(term23699, term23699.getClass(), "point", -72892619);
        setIntField(term23699, term23699.getClass(), "totalPoint", 907161445);
        setIntField(term23699, term23699.getClass(), "iconId", -107125345);
        setIntField(term23699, term23699.getClass(), "nameplateId", -1484271501);
        setIntField(term23699, term23699.getClass(), "frameId", 1994800842);
        setIntField(term23699, term23699.getClass(), "trophyId", 418349525);
        setIntField(term23699, term23699.getClass(), "playCount", 989214721);
        setIntField(term23699, term23699.getClass(), "playVsCount", 1509604);
        setIntField(term23699, term23699.getClass(), "playSyncCount", 516929449);
        setIntField(term23699, term23699.getClass(), "winCount", 86726117);
        setIntField(term23699, term23699.getClass(), "helpCount", -142908686);
        setIntField(term23699, term23699.getClass(), "comboCount", 780437076);
        setIntField(term23699, term23699.getClass(), "feverCount", -1290991126);
        setIntField(term23699, term23699.getClass(), "totalHiScore", 1579548215);
        setIntField(term23699, term23699.getClass(), "totalEasyHighScore", 518866176);
        setIntField(term23699, term23699.getClass(), "totalBasicHighScore", -1352533284);
        setIntField(term23699, term23699.getClass(), "totalAdvancedHighScore", -149022151);
        setIntField(term23699, term23699.getClass(), "totalExpertHighScore", -2128082017);
        setIntField(term23699, term23699.getClass(), "totalMasterHighScore", -626860638);
        setIntField(term23699, term23699.getClass(), "totalReMasterHighScore", 969445811);
        setIntField(term23699, term23699.getClass(), "totalHighSync", -1232355383);
        setIntField(term23699, term23699.getClass(), "totalEasySync", 1599985157);
        setIntField(term23699, term23699.getClass(), "totalBasicSync", 80735812);
        setIntField(term23699, term23699.getClass(), "totalAdvancedSync", 1616706735);
        setIntField(term23699, term23699.getClass(), "totalExpertSync", -445244024);
        setIntField(term23699, term23699.getClass(), "totalMasterSync", -1836568689);
        setIntField(term23699, term23699.getClass(), "totalReMasterSync", 367237282);
        setIntField(term23699, term23699.getClass(), "playerRating", 1917343242);
        setIntField(term23699, term23699.getClass(), "highestRating", 504552083);
        setIntField(term23699, term23699.getClass(), "rankAuthTailId", -714955265);
        setField(term23699, term23699.getClass(), "eventWatchedDate", "vuIJRrypuA");
        setField(term23699, term23699.getClass(), "webLimitDate", "AxfSZmaiyA");
        setIntField(term23699, term23699.getClass(), "challengeTrackPhase", 1191317081);
        setIntField(term23699, term23699.getClass(), "firstPlayBits", -1321805207);
        setField(term23699, term23699.getClass(), "lastPlayDate", "lBpveIKbea");
        setIntField(term23699, term23699.getClass(), "lastPlaceId", 1827794411);
        setField(term23699, term23699.getClass(), "lastPlaceName", "uyLBVQYcOV");
        setIntField(term23699, term23699.getClass(), "lastRegionId", -1377700263);
        setField(term23699, term23699.getClass(), "lastRegionName", "PoTZjDuBHa");
        setField(term23699, term23699.getClass(), "lastClientId", "MIwvgVrhzP");
        setField(term23699, term23699.getClass(), "lastCountryCode", "HcUUieXdep");
        setIntField(term23699, term23699.getClass(), "eventPoint", -38722118);
        setIntField(term23699, term23699.getClass(), "totalLv", 1123663642);
        setIntField(term23699, term23699.getClass(), "lastLoginBonusDay", 404156777);
        setIntField(term23699, term23699.getClass(), "lastSurvivalBonusDay", 74684104);
        setIntField(term23699, term23699.getClass(), "loginBonusLv", 502851553);
        term23873 = new Integer(-1149654883);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term23873;
        callMethod(klass, "setLastPlaceId", argTypes, term23699, args);
    }

};


