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

public class UserBoss_setId_190194035911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91961;
     Object term92145;

    public UserBoss_setId_190194035911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term91967 = new Long(-7191625829563442696L);
        term91961 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss"));
        Object term91963 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term91965 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term91981 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term91982 = newInstance(Class.forName("java.time.LocalDate"));
        Object term91986 = newInstance(Class.forName("java.time.LocalTime"));
        Object term91991 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term91992 = newInstance(Class.forName("java.time.LocalDate"));
        Object term91996 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term91961, term91961.getClass(), "id", -6246278604466261475L);
        setLongField(term91963, term91963.getClass(), "id", 9113614356317836741L);
        setLongField(term91965, term91965.getClass(), "id", 2244124922001093690L);
        setField(term91965, term91965.getClass(), "extId", term91967);
        setField(term91965, term91965.getClass(), "luid", "CanAbWJNgt");
        setIntField(term91982, term91982.getClass(), "year", 2020);
        setShortField(term91982, term91982.getClass(), "month", (short) 9);
        setShortField(term91982, term91982.getClass(), "day", (short) 29);
        setField(term91981, term91981.getClass(), "date", term91982);
        setByteField(term91986, term91986.getClass(), "hour", (byte) 4);
        setByteField(term91986, term91986.getClass(), "minute", (byte) 6);
        setByteField(term91986, term91986.getClass(), "second", (byte) 57);
        setIntField(term91986, term91986.getClass(), "nano", 936141628);
        setField(term91981, term91981.getClass(), "time", term91986);
        setField(term91965, term91965.getClass(), "registerTime", term91981);
        setIntField(term91992, term91992.getClass(), "year", 2027);
        setShortField(term91992, term91992.getClass(), "month", (short) 7);
        setShortField(term91992, term91992.getClass(), "day", (short) 24);
        setField(term91991, term91991.getClass(), "date", term91992);
        setByteField(term91996, term91996.getClass(), "hour", (byte) 10);
        setByteField(term91996, term91996.getClass(), "minute", (byte) 31);
        setByteField(term91996, term91996.getClass(), "second", (byte) 33);
        setIntField(term91996, term91996.getClass(), "nano", 451257890);
        setField(term91991, term91991.getClass(), "time", term91996);
        setField(term91965, term91965.getClass(), "accessTime", term91991);
        setField(term91963, term91963.getClass(), "card", term91965);
        setIntField(term91963, term91963.getClass(), "lastDataVersion", 994094102);
        setField(term91963, term91963.getClass(), "userName", "tFRLUuSeUt");
        setIntField(term91963, term91963.getClass(), "point", -1536607529);
        setIntField(term91963, term91963.getClass(), "totalPoint", 2103296701);
        setIntField(term91963, term91963.getClass(), "iconId", 56957852);
        setIntField(term91963, term91963.getClass(), "nameplateId", 1777669010);
        setIntField(term91963, term91963.getClass(), "frameId", 152298427);
        setIntField(term91963, term91963.getClass(), "trophyId", 450778931);
        setIntField(term91963, term91963.getClass(), "playCount", -1482855200);
        setIntField(term91963, term91963.getClass(), "playVsCount", 1147113614);
        setIntField(term91963, term91963.getClass(), "playSyncCount", -243254772);
        setIntField(term91963, term91963.getClass(), "winCount", -1721895188);
        setIntField(term91963, term91963.getClass(), "helpCount", 1090061150);
        setIntField(term91963, term91963.getClass(), "comboCount", -1849804262);
        setIntField(term91963, term91963.getClass(), "feverCount", -391323239);
        setIntField(term91963, term91963.getClass(), "totalHiScore", 563491270);
        setIntField(term91963, term91963.getClass(), "totalEasyHighScore", 1732544982);
        setIntField(term91963, term91963.getClass(), "totalBasicHighScore", 961758280);
        setIntField(term91963, term91963.getClass(), "totalAdvancedHighScore", -1645689842);
        setIntField(term91963, term91963.getClass(), "totalExpertHighScore", 1363844724);
        setIntField(term91963, term91963.getClass(), "totalMasterHighScore", 63712079);
        setIntField(term91963, term91963.getClass(), "totalReMasterHighScore", 146408738);
        setIntField(term91963, term91963.getClass(), "totalHighSync", -496409376);
        setIntField(term91963, term91963.getClass(), "totalEasySync", 1373203092);
        setIntField(term91963, term91963.getClass(), "totalBasicSync", -120921180);
        setIntField(term91963, term91963.getClass(), "totalAdvancedSync", -1303194402);
        setIntField(term91963, term91963.getClass(), "totalExpertSync", -1332211856);
        setIntField(term91963, term91963.getClass(), "totalMasterSync", 213669888);
        setIntField(term91963, term91963.getClass(), "totalReMasterSync", -1050684350);
        setIntField(term91963, term91963.getClass(), "playerRating", 1871723856);
        setIntField(term91963, term91963.getClass(), "highestRating", -159300758);
        setIntField(term91963, term91963.getClass(), "rankAuthTailId", 478919523);
        setField(term91963, term91963.getClass(), "eventWatchedDate", "KcKxvbBAHa");
        setField(term91963, term91963.getClass(), "webLimitDate", "NbFVXCPmxn");
        setIntField(term91963, term91963.getClass(), "challengeTrackPhase", -922902226);
        setIntField(term91963, term91963.getClass(), "firstPlayBits", -2136789857);
        setField(term91963, term91963.getClass(), "lastPlayDate", "ovYlGvhKKO");
        setIntField(term91963, term91963.getClass(), "lastPlaceId", 2107900783);
        setField(term91963, term91963.getClass(), "lastPlaceName", "JvoSiMCDAb");
        setIntField(term91963, term91963.getClass(), "lastRegionId", 2014990351);
        setField(term91963, term91963.getClass(), "lastRegionName", "JANJXHGMsv");
        setField(term91963, term91963.getClass(), "lastClientId", "WVQqsFGJMw");
        setField(term91963, term91963.getClass(), "lastCountryCode", "TIPSlmidwP");
        setIntField(term91963, term91963.getClass(), "eventPoint", 1711544909);
        setIntField(term91963, term91963.getClass(), "totalLv", -257220805);
        setIntField(term91963, term91963.getClass(), "lastLoginBonusDay", -32183821);
        setIntField(term91963, term91963.getClass(), "lastSurvivalBonusDay", 391771406);
        setIntField(term91963, term91963.getClass(), "loginBonusLv", 930395359);
        setField(term91961, term91961.getClass(), "user", term91963);
        setLongField(term91961, term91961.getClass(), "pandoraFlagList0", -849289244399400018L);
        setLongField(term91961, term91961.getClass(), "pandoraFlagList1", -5334920917680098031L);
        setLongField(term91961, term91961.getClass(), "pandoraFlagList2", -5681371087517724194L);
        setLongField(term91961, term91961.getClass(), "pandoraFlagList3", -2109397517777696156L);
        setLongField(term91961, term91961.getClass(), "pandoraFlagList4", 6631484353678437959L);
        setLongField(term91961, term91961.getClass(), "pandoraFlagList5", -1763360854589438694L);
        setLongField(term91961, term91961.getClass(), "pandoraFlagList6", -4225690761644993738L);
        setLongField(term91961, term91961.getClass(), "emblemFlagList", 4498588544424613697L);
        term92145 = new Long(6207481297504886524L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term92145;
        callMethod(klass, "setId", argTypes, term91961, args);
    }

};


