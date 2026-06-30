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

public class UserActivity_hashCode_23566508721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49717;

    public UserActivity_hashCode_23566508721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term49723 = new Long(-8892586408602479513L);
        term49717 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity"));
        Object term49719 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term49721 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term49737 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49738 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49742 = newInstance(Class.forName("java.time.LocalTime"));
        Object term49747 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49748 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49752 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term49717, term49717.getClass(), "id", -8992404862613425105L);
        setLongField(term49719, term49719.getClass(), "id", 3103198349031409063L);
        setLongField(term49721, term49721.getClass(), "id", 753095050088595263L);
        setField(term49721, term49721.getClass(), "extId", term49723);
        setField(term49721, term49721.getClass(), "luid", "RqnYUpQBbG");
        setIntField(term49738, term49738.getClass(), "year", 2023);
        setShortField(term49738, term49738.getClass(), "month", (short) 12);
        setShortField(term49738, term49738.getClass(), "day", (short) 3);
        setField(term49737, term49737.getClass(), "date", term49738);
        setByteField(term49742, term49742.getClass(), "hour", (byte) 14);
        setByteField(term49742, term49742.getClass(), "minute", (byte) 6);
        setByteField(term49742, term49742.getClass(), "second", (byte) 20);
        setIntField(term49742, term49742.getClass(), "nano", 660325634);
        setField(term49737, term49737.getClass(), "time", term49742);
        setField(term49721, term49721.getClass(), "registerTime", term49737);
        setIntField(term49748, term49748.getClass(), "year", 2019);
        setShortField(term49748, term49748.getClass(), "month", (short) 2);
        setShortField(term49748, term49748.getClass(), "day", (short) 13);
        setField(term49747, term49747.getClass(), "date", term49748);
        setByteField(term49752, term49752.getClass(), "hour", (byte) 5);
        setByteField(term49752, term49752.getClass(), "minute", (byte) 59);
        setByteField(term49752, term49752.getClass(), "second", (byte) 42);
        setIntField(term49752, term49752.getClass(), "nano", 720385556);
        setField(term49747, term49747.getClass(), "time", term49752);
        setField(term49721, term49721.getClass(), "accessTime", term49747);
        setField(term49719, term49719.getClass(), "card", term49721);
        setIntField(term49719, term49719.getClass(), "lastDataVersion", 513401096);
        setField(term49719, term49719.getClass(), "userName", "sKnuhmcjCC");
        setIntField(term49719, term49719.getClass(), "point", 1507226462);
        setIntField(term49719, term49719.getClass(), "totalPoint", 1948729123);
        setIntField(term49719, term49719.getClass(), "iconId", -1745923386);
        setIntField(term49719, term49719.getClass(), "nameplateId", 391874700);
        setIntField(term49719, term49719.getClass(), "frameId", -1453940077);
        setIntField(term49719, term49719.getClass(), "trophyId", -27143901);
        setIntField(term49719, term49719.getClass(), "playCount", -1875715073);
        setIntField(term49719, term49719.getClass(), "playVsCount", -785076316);
        setIntField(term49719, term49719.getClass(), "playSyncCount", 1683678906);
        setIntField(term49719, term49719.getClass(), "winCount", 930052770);
        setIntField(term49719, term49719.getClass(), "helpCount", -295365373);
        setIntField(term49719, term49719.getClass(), "comboCount", 344859953);
        setIntField(term49719, term49719.getClass(), "feverCount", 1690405484);
        setIntField(term49719, term49719.getClass(), "totalHiScore", 1722375044);
        setIntField(term49719, term49719.getClass(), "totalEasyHighScore", 1695415275);
        setIntField(term49719, term49719.getClass(), "totalBasicHighScore", -460821239);
        setIntField(term49719, term49719.getClass(), "totalAdvancedHighScore", 1355562027);
        setIntField(term49719, term49719.getClass(), "totalExpertHighScore", 1657495750);
        setIntField(term49719, term49719.getClass(), "totalMasterHighScore", -218577610);
        setIntField(term49719, term49719.getClass(), "totalReMasterHighScore", 830804491);
        setIntField(term49719, term49719.getClass(), "totalHighSync", 29751532);
        setIntField(term49719, term49719.getClass(), "totalEasySync", 16496303);
        setIntField(term49719, term49719.getClass(), "totalBasicSync", 971650028);
        setIntField(term49719, term49719.getClass(), "totalAdvancedSync", 287999347);
        setIntField(term49719, term49719.getClass(), "totalExpertSync", -1849779499);
        setIntField(term49719, term49719.getClass(), "totalMasterSync", 77244996);
        setIntField(term49719, term49719.getClass(), "totalReMasterSync", -845033467);
        setIntField(term49719, term49719.getClass(), "playerRating", 1425416046);
        setIntField(term49719, term49719.getClass(), "highestRating", -2069229498);
        setIntField(term49719, term49719.getClass(), "rankAuthTailId", -592794112);
        setField(term49719, term49719.getClass(), "eventWatchedDate", "oCBbVNwMnb");
        setField(term49719, term49719.getClass(), "webLimitDate", "miJxAzOVJy");
        setIntField(term49719, term49719.getClass(), "challengeTrackPhase", -1152540918);
        setIntField(term49719, term49719.getClass(), "firstPlayBits", -1651174160);
        setField(term49719, term49719.getClass(), "lastPlayDate", "kjqlBVaviD");
        setIntField(term49719, term49719.getClass(), "lastPlaceId", 1770880797);
        setField(term49719, term49719.getClass(), "lastPlaceName", "iVRXRDCrcM");
        setIntField(term49719, term49719.getClass(), "lastRegionId", 1281848772);
        setField(term49719, term49719.getClass(), "lastRegionName", "WAZFhrxcSM");
        setField(term49719, term49719.getClass(), "lastClientId", "gCRUlTuVMX");
        setField(term49719, term49719.getClass(), "lastCountryCode", "tYBgGQtkhi");
        setIntField(term49719, term49719.getClass(), "eventPoint", 1911440124);
        setIntField(term49719, term49719.getClass(), "totalLv", 1937143493);
        setIntField(term49719, term49719.getClass(), "lastLoginBonusDay", -96151498);
        setIntField(term49719, term49719.getClass(), "lastSurvivalBonusDay", -358719988);
        setIntField(term49719, term49719.getClass(), "loginBonusLv", -1549556875);
        setField(term49717, term49717.getClass(), "user", term49719);
        setIntField(term49717, term49717.getClass(), "kind", 966102502);
        setIntField(term49717, term49717.getClass(), "activityId", 1074765616);
        setLongField(term49717, term49717.getClass(), "sortNumber", 3643973882575578879L);
        setIntField(term49717, term49717.getClass(), "param1", 1305055843);
        setIntField(term49717, term49717.getClass(), "param2", 2092467469);
        setIntField(term49717, term49717.getClass(), "param3", 1335699725);
        setIntField(term49717, term49717.getClass(), "param4", -1329862026);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term49717, args);
    }

};


