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

public class UserActivity_getParam4_10126032959 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46159;

    public UserActivity_getParam4_10126032959() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term46165 = new Long(-7884871963229073324L);
        term46159 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity"));
        Object term46161 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term46163 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term46179 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46180 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46184 = newInstance(Class.forName("java.time.LocalTime"));
        Object term46189 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46190 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46194 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term46159, term46159.getClass(), "id", -7005300544167632229L);
        setLongField(term46161, term46161.getClass(), "id", -278716491237139968L);
        setLongField(term46163, term46163.getClass(), "id", -629491722907628764L);
        setField(term46163, term46163.getClass(), "extId", term46165);
        setField(term46163, term46163.getClass(), "luid", "dTOUSTDdbw");
        setIntField(term46180, term46180.getClass(), "year", 2014);
        setShortField(term46180, term46180.getClass(), "month", (short) 5);
        setShortField(term46180, term46180.getClass(), "day", (short) 18);
        setField(term46179, term46179.getClass(), "date", term46180);
        setByteField(term46184, term46184.getClass(), "hour", (byte) 19);
        setByteField(term46184, term46184.getClass(), "minute", (byte) 25);
        setByteField(term46184, term46184.getClass(), "second", (byte) 8);
        setIntField(term46184, term46184.getClass(), "nano", 217186771);
        setField(term46179, term46179.getClass(), "time", term46184);
        setField(term46163, term46163.getClass(), "registerTime", term46179);
        setIntField(term46190, term46190.getClass(), "year", 2023);
        setShortField(term46190, term46190.getClass(), "month", (short) 2);
        setShortField(term46190, term46190.getClass(), "day", (short) 27);
        setField(term46189, term46189.getClass(), "date", term46190);
        setByteField(term46194, term46194.getClass(), "hour", (byte) 5);
        setByteField(term46194, term46194.getClass(), "minute", (byte) 50);
        setByteField(term46194, term46194.getClass(), "second", (byte) 50);
        setIntField(term46194, term46194.getClass(), "nano", 528521692);
        setField(term46189, term46189.getClass(), "time", term46194);
        setField(term46163, term46163.getClass(), "accessTime", term46189);
        setField(term46161, term46161.getClass(), "card", term46163);
        setIntField(term46161, term46161.getClass(), "lastDataVersion", 1889003786);
        setField(term46161, term46161.getClass(), "userName", "PECfBejlfo");
        setIntField(term46161, term46161.getClass(), "point", 452911848);
        setIntField(term46161, term46161.getClass(), "totalPoint", 2003994890);
        setIntField(term46161, term46161.getClass(), "iconId", 2135032815);
        setIntField(term46161, term46161.getClass(), "nameplateId", 2102441611);
        setIntField(term46161, term46161.getClass(), "frameId", -972921113);
        setIntField(term46161, term46161.getClass(), "trophyId", -1692479417);
        setIntField(term46161, term46161.getClass(), "playCount", -1090532898);
        setIntField(term46161, term46161.getClass(), "playVsCount", 1732323444);
        setIntField(term46161, term46161.getClass(), "playSyncCount", -1704583810);
        setIntField(term46161, term46161.getClass(), "winCount", -1057666750);
        setIntField(term46161, term46161.getClass(), "helpCount", 702126350);
        setIntField(term46161, term46161.getClass(), "comboCount", -1320161427);
        setIntField(term46161, term46161.getClass(), "feverCount", 841954160);
        setIntField(term46161, term46161.getClass(), "totalHiScore", 1417577834);
        setIntField(term46161, term46161.getClass(), "totalEasyHighScore", -1641288466);
        setIntField(term46161, term46161.getClass(), "totalBasicHighScore", 1755218175);
        setIntField(term46161, term46161.getClass(), "totalAdvancedHighScore", 647511055);
        setIntField(term46161, term46161.getClass(), "totalExpertHighScore", -1949921728);
        setIntField(term46161, term46161.getClass(), "totalMasterHighScore", 932437963);
        setIntField(term46161, term46161.getClass(), "totalReMasterHighScore", -194822585);
        setIntField(term46161, term46161.getClass(), "totalHighSync", 1420387294);
        setIntField(term46161, term46161.getClass(), "totalEasySync", 1088015655);
        setIntField(term46161, term46161.getClass(), "totalBasicSync", -1328130039);
        setIntField(term46161, term46161.getClass(), "totalAdvancedSync", 716362214);
        setIntField(term46161, term46161.getClass(), "totalExpertSync", -699487881);
        setIntField(term46161, term46161.getClass(), "totalMasterSync", 562568318);
        setIntField(term46161, term46161.getClass(), "totalReMasterSync", 297158063);
        setIntField(term46161, term46161.getClass(), "playerRating", -38995653);
        setIntField(term46161, term46161.getClass(), "highestRating", -1893842770);
        setIntField(term46161, term46161.getClass(), "rankAuthTailId", 2048873968);
        setField(term46161, term46161.getClass(), "eventWatchedDate", "SDbDgydVpg");
        setField(term46161, term46161.getClass(), "webLimitDate", "EEMaiNkiOH");
        setIntField(term46161, term46161.getClass(), "challengeTrackPhase", -1447906264);
        setIntField(term46161, term46161.getClass(), "firstPlayBits", 1527786708);
        setField(term46161, term46161.getClass(), "lastPlayDate", "sFdmTylvqh");
        setIntField(term46161, term46161.getClass(), "lastPlaceId", -360741897);
        setField(term46161, term46161.getClass(), "lastPlaceName", "rgniLaOaiz");
        setIntField(term46161, term46161.getClass(), "lastRegionId", 1762652682);
        setField(term46161, term46161.getClass(), "lastRegionName", "fzQzzdIOMC");
        setField(term46161, term46161.getClass(), "lastClientId", "hLVDOhfCKX");
        setField(term46161, term46161.getClass(), "lastCountryCode", "yXLTfzOgfX");
        setIntField(term46161, term46161.getClass(), "eventPoint", 1760408647);
        setIntField(term46161, term46161.getClass(), "totalLv", -1334125536);
        setIntField(term46161, term46161.getClass(), "lastLoginBonusDay", -385542140);
        setIntField(term46161, term46161.getClass(), "lastSurvivalBonusDay", -1652323059);
        setIntField(term46161, term46161.getClass(), "loginBonusLv", -1928764789);
        setField(term46159, term46159.getClass(), "user", term46161);
        setIntField(term46159, term46159.getClass(), "kind", -673697686);
        setIntField(term46159, term46159.getClass(), "activityId", -757914190);
        setLongField(term46159, term46159.getClass(), "sortNumber", -5552123402871285352L);
        setIntField(term46159, term46159.getClass(), "param1", 991323397);
        setIntField(term46159, term46159.getClass(), "param2", -791114332);
        setIntField(term46159, term46159.getClass(), "param3", 350325506);
        setIntField(term46159, term46159.getClass(), "param4", -283849179);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParam4", argTypes, term46159, args);
    }

};


