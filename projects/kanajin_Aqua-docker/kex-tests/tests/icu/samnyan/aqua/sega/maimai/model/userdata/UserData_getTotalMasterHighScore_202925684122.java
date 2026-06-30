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

public class UserData_getTotalMasterHighScore_202925684122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5809;

    public UserData_getTotalMasterHighScore_202925684122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5813 = new Long(8059786003080744426L);
        term5809 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term5811 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term5827 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5828 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5832 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5837 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5838 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5842 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term5809, term5809.getClass(), "id", 4784595517102746672L);
        setLongField(term5811, term5811.getClass(), "id", -7612550318181586304L);
        setField(term5811, term5811.getClass(), "extId", term5813);
        setField(term5811, term5811.getClass(), "luid", "XJJNClzHRf");
        setIntField(term5828, term5828.getClass(), "year", 2020);
        setShortField(term5828, term5828.getClass(), "month", (short) 5);
        setShortField(term5828, term5828.getClass(), "day", (short) 18);
        setField(term5827, term5827.getClass(), "date", term5828);
        setByteField(term5832, term5832.getClass(), "hour", (byte) 5);
        setByteField(term5832, term5832.getClass(), "minute", (byte) 46);
        setByteField(term5832, term5832.getClass(), "second", (byte) 13);
        setIntField(term5832, term5832.getClass(), "nano", 45893173);
        setField(term5827, term5827.getClass(), "time", term5832);
        setField(term5811, term5811.getClass(), "registerTime", term5827);
        setIntField(term5838, term5838.getClass(), "year", 2017);
        setShortField(term5838, term5838.getClass(), "month", (short) 4);
        setShortField(term5838, term5838.getClass(), "day", (short) 3);
        setField(term5837, term5837.getClass(), "date", term5838);
        setByteField(term5842, term5842.getClass(), "hour", (byte) 6);
        setByteField(term5842, term5842.getClass(), "minute", (byte) 51);
        setByteField(term5842, term5842.getClass(), "second", (byte) 10);
        setIntField(term5842, term5842.getClass(), "nano", 316377166);
        setField(term5837, term5837.getClass(), "time", term5842);
        setField(term5811, term5811.getClass(), "accessTime", term5837);
        setField(term5809, term5809.getClass(), "card", term5811);
        setIntField(term5809, term5809.getClass(), "lastDataVersion", -1716046610);
        setField(term5809, term5809.getClass(), "userName", "HDaezxQfQR");
        setIntField(term5809, term5809.getClass(), "point", 65264024);
        setIntField(term5809, term5809.getClass(), "totalPoint", -252449812);
        setIntField(term5809, term5809.getClass(), "iconId", -1885268968);
        setIntField(term5809, term5809.getClass(), "nameplateId", 277855691);
        setIntField(term5809, term5809.getClass(), "frameId", 675891483);
        setIntField(term5809, term5809.getClass(), "trophyId", -317900470);
        setIntField(term5809, term5809.getClass(), "playCount", -979568);
        setIntField(term5809, term5809.getClass(), "playVsCount", -1422131197);
        setIntField(term5809, term5809.getClass(), "playSyncCount", -20399281);
        setIntField(term5809, term5809.getClass(), "winCount", -830170410);
        setIntField(term5809, term5809.getClass(), "helpCount", -1742790308);
        setIntField(term5809, term5809.getClass(), "comboCount", -1592093430);
        setIntField(term5809, term5809.getClass(), "feverCount", 1178214545);
        setIntField(term5809, term5809.getClass(), "totalHiScore", -985334541);
        setIntField(term5809, term5809.getClass(), "totalEasyHighScore", -1870004228);
        setIntField(term5809, term5809.getClass(), "totalBasicHighScore", 380484139);
        setIntField(term5809, term5809.getClass(), "totalAdvancedHighScore", 1822317628);
        setIntField(term5809, term5809.getClass(), "totalExpertHighScore", -608830309);
        setIntField(term5809, term5809.getClass(), "totalMasterHighScore", -537786484);
        setIntField(term5809, term5809.getClass(), "totalReMasterHighScore", 263859424);
        setIntField(term5809, term5809.getClass(), "totalHighSync", 1436978289);
        setIntField(term5809, term5809.getClass(), "totalEasySync", 696225243);
        setIntField(term5809, term5809.getClass(), "totalBasicSync", -1421649118);
        setIntField(term5809, term5809.getClass(), "totalAdvancedSync", -511248284);
        setIntField(term5809, term5809.getClass(), "totalExpertSync", 788630042);
        setIntField(term5809, term5809.getClass(), "totalMasterSync", 1430066560);
        setIntField(term5809, term5809.getClass(), "totalReMasterSync", 836734074);
        setIntField(term5809, term5809.getClass(), "playerRating", -1747711865);
        setIntField(term5809, term5809.getClass(), "highestRating", 682812715);
        setIntField(term5809, term5809.getClass(), "rankAuthTailId", -1092883950);
        setField(term5809, term5809.getClass(), "eventWatchedDate", "iikZEapDlu");
        setField(term5809, term5809.getClass(), "webLimitDate", "nhoHrZfnIN");
        setIntField(term5809, term5809.getClass(), "challengeTrackPhase", 950385621);
        setIntField(term5809, term5809.getClass(), "firstPlayBits", -232352320);
        setField(term5809, term5809.getClass(), "lastPlayDate", "ZkMALXpEAZ");
        setIntField(term5809, term5809.getClass(), "lastPlaceId", -232333014);
        setField(term5809, term5809.getClass(), "lastPlaceName", "tXfQjSqDzN");
        setIntField(term5809, term5809.getClass(), "lastRegionId", -139694079);
        setField(term5809, term5809.getClass(), "lastRegionName", "BjugTaMcxJ");
        setField(term5809, term5809.getClass(), "lastClientId", "vGiuZVPJNH");
        setField(term5809, term5809.getClass(), "lastCountryCode", "tlzpzIjMib");
        setIntField(term5809, term5809.getClass(), "eventPoint", -1602072035);
        setIntField(term5809, term5809.getClass(), "totalLv", 1902624392);
        setIntField(term5809, term5809.getClass(), "lastLoginBonusDay", 904607217);
        setIntField(term5809, term5809.getClass(), "lastSurvivalBonusDay", 434914590);
        setIntField(term5809, term5809.getClass(), "loginBonusLv", 1983756621);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalMasterHighScore", argTypes, term5809, args);
    }

};


