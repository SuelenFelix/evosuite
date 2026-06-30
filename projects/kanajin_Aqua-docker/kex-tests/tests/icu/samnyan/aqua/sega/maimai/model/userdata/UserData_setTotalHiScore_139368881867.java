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

public class UserData_setTotalHiScore_139368881867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17787;
     Object term17961;

    public UserData_setTotalHiScore_139368881867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17791 = new Long(305759998609888272L);
        term17787 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term17789 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term17805 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17806 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17810 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17815 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17816 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17820 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term17787, term17787.getClass(), "id", -1616722610139554082L);
        setLongField(term17789, term17789.getClass(), "id", 7495904023107549024L);
        setField(term17789, term17789.getClass(), "extId", term17791);
        setField(term17789, term17789.getClass(), "luid", "uWqXrwAsDU");
        setIntField(term17806, term17806.getClass(), "year", 2023);
        setShortField(term17806, term17806.getClass(), "month", (short) 11);
        setShortField(term17806, term17806.getClass(), "day", (short) 14);
        setField(term17805, term17805.getClass(), "date", term17806);
        setByteField(term17810, term17810.getClass(), "hour", (byte) 15);
        setByteField(term17810, term17810.getClass(), "minute", (byte) 2);
        setByteField(term17810, term17810.getClass(), "second", (byte) 47);
        setIntField(term17810, term17810.getClass(), "nano", 703984770);
        setField(term17805, term17805.getClass(), "time", term17810);
        setField(term17789, term17789.getClass(), "registerTime", term17805);
        setIntField(term17816, term17816.getClass(), "year", 2024);
        setShortField(term17816, term17816.getClass(), "month", (short) 4);
        setShortField(term17816, term17816.getClass(), "day", (short) 26);
        setField(term17815, term17815.getClass(), "date", term17816);
        setByteField(term17820, term17820.getClass(), "hour", (byte) 15);
        setByteField(term17820, term17820.getClass(), "minute", (byte) 12);
        setByteField(term17820, term17820.getClass(), "second", (byte) 31);
        setIntField(term17820, term17820.getClass(), "nano", 839979637);
        setField(term17815, term17815.getClass(), "time", term17820);
        setField(term17789, term17789.getClass(), "accessTime", term17815);
        setField(term17787, term17787.getClass(), "card", term17789);
        setIntField(term17787, term17787.getClass(), "lastDataVersion", -206020926);
        setField(term17787, term17787.getClass(), "userName", "hgFbWAUtsu");
        setIntField(term17787, term17787.getClass(), "point", -2054014210);
        setIntField(term17787, term17787.getClass(), "totalPoint", 1179045520);
        setIntField(term17787, term17787.getClass(), "iconId", 1056739921);
        setIntField(term17787, term17787.getClass(), "nameplateId", 1384627927);
        setIntField(term17787, term17787.getClass(), "frameId", -1252280115);
        setIntField(term17787, term17787.getClass(), "trophyId", -120849363);
        setIntField(term17787, term17787.getClass(), "playCount", 147387583);
        setIntField(term17787, term17787.getClass(), "playVsCount", -1307347557);
        setIntField(term17787, term17787.getClass(), "playSyncCount", 1092325030);
        setIntField(term17787, term17787.getClass(), "winCount", -1901115940);
        setIntField(term17787, term17787.getClass(), "helpCount", 1934437115);
        setIntField(term17787, term17787.getClass(), "comboCount", 1820319919);
        setIntField(term17787, term17787.getClass(), "feverCount", 1444962020);
        setIntField(term17787, term17787.getClass(), "totalHiScore", 1636228804);
        setIntField(term17787, term17787.getClass(), "totalEasyHighScore", -1650533427);
        setIntField(term17787, term17787.getClass(), "totalBasicHighScore", -1076430316);
        setIntField(term17787, term17787.getClass(), "totalAdvancedHighScore", 1984492528);
        setIntField(term17787, term17787.getClass(), "totalExpertHighScore", -655764067);
        setIntField(term17787, term17787.getClass(), "totalMasterHighScore", 31238744);
        setIntField(term17787, term17787.getClass(), "totalReMasterHighScore", 680031965);
        setIntField(term17787, term17787.getClass(), "totalHighSync", -2112419098);
        setIntField(term17787, term17787.getClass(), "totalEasySync", -1649429373);
        setIntField(term17787, term17787.getClass(), "totalBasicSync", -1605518502);
        setIntField(term17787, term17787.getClass(), "totalAdvancedSync", -499081946);
        setIntField(term17787, term17787.getClass(), "totalExpertSync", 1834067063);
        setIntField(term17787, term17787.getClass(), "totalMasterSync", -1578513908);
        setIntField(term17787, term17787.getClass(), "totalReMasterSync", 312330930);
        setIntField(term17787, term17787.getClass(), "playerRating", 1635910980);
        setIntField(term17787, term17787.getClass(), "highestRating", 1560346640);
        setIntField(term17787, term17787.getClass(), "rankAuthTailId", 100626332);
        setField(term17787, term17787.getClass(), "eventWatchedDate", "HqoTWlkbwF");
        setField(term17787, term17787.getClass(), "webLimitDate", "CwNELDTAPP");
        setIntField(term17787, term17787.getClass(), "challengeTrackPhase", 763794722);
        setIntField(term17787, term17787.getClass(), "firstPlayBits", -696403395);
        setField(term17787, term17787.getClass(), "lastPlayDate", "GSzQdbHLHw");
        setIntField(term17787, term17787.getClass(), "lastPlaceId", 227321148);
        setField(term17787, term17787.getClass(), "lastPlaceName", "IkfarsYNJO");
        setIntField(term17787, term17787.getClass(), "lastRegionId", -266870537);
        setField(term17787, term17787.getClass(), "lastRegionName", "aZKOWhHMEh");
        setField(term17787, term17787.getClass(), "lastClientId", "YfkhviKZwl");
        setField(term17787, term17787.getClass(), "lastCountryCode", "DcOhhAfJTI");
        setIntField(term17787, term17787.getClass(), "eventPoint", -453010858);
        setIntField(term17787, term17787.getClass(), "totalLv", -1855427206);
        setIntField(term17787, term17787.getClass(), "lastLoginBonusDay", -647618746);
        setIntField(term17787, term17787.getClass(), "lastSurvivalBonusDay", -91129577);
        setIntField(term17787, term17787.getClass(), "loginBonusLv", 1629059877);
        term17961 = new Integer(-649940550);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term17961;
        callMethod(klass, "setTotalHiScore", argTypes, term17787, args);
    }

};


