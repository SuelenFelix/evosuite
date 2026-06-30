package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserDetail_getFirstRomVersion_1744796111202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288471;

    public UserDetail_getFirstRomVersion_1744796111202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288471 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term288471, term288471.getClass(), "id", 0L);
        setField(term288471, term288471.getClass(), "card", null);
        setField(term288471, term288471.getClass(), "userName", null);
        setIntField(term288471, term288471.getClass(), "isNetMember", 0);
        setIntField(term288471, term288471.getClass(), "iconId", 0);
        setIntField(term288471, term288471.getClass(), "plateId", 0);
        setIntField(term288471, term288471.getClass(), "titleId", 0);
        setIntField(term288471, term288471.getClass(), "partnerId", 0);
        setIntField(term288471, term288471.getClass(), "frameId", 0);
        setIntField(term288471, term288471.getClass(), "selectMapId", 0);
        setIntField(term288471, term288471.getClass(), "totalAwake", 0);
        setIntField(term288471, term288471.getClass(), "gradeRating", 0);
        setIntField(term288471, term288471.getClass(), "musicRating", 0);
        setIntField(term288471, term288471.getClass(), "playerRating", 0);
        setIntField(term288471, term288471.getClass(), "highestRating", 0);
        setIntField(term288471, term288471.getClass(), "gradeRank", 0);
        setIntField(term288471, term288471.getClass(), "classRank", 0);
        setIntField(term288471, term288471.getClass(), "courseRank", 0);
        setField(term288471, term288471.getClass(), "charaSlot", null);
        setField(term288471, term288471.getClass(), "charaLockSlot", null);
        setLongField(term288471, term288471.getClass(), "contentBit", 0L);
        setIntField(term288471, term288471.getClass(), "playCount", 0);
        setField(term288471, term288471.getClass(), "eventWatchedDate", null);
        setField(term288471, term288471.getClass(), "lastGameId", null);
        setField(term288471, term288471.getClass(), "lastRomVersion", null);
        setField(term288471, term288471.getClass(), "lastDataVersion", null);
        setField(term288471, term288471.getClass(), "lastLoginDate", null);
        setField(term288471, term288471.getClass(), "lastPlayDate", null);
        setIntField(term288471, term288471.getClass(), "lastPlayCredit", 0);
        setIntField(term288471, term288471.getClass(), "lastPlayMode", 0);
        setIntField(term288471, term288471.getClass(), "lastPlaceId", 0);
        setField(term288471, term288471.getClass(), "lastPlaceName", null);
        setIntField(term288471, term288471.getClass(), "lastAllNetId", 0);
        setIntField(term288471, term288471.getClass(), "lastRegionId", 0);
        setField(term288471, term288471.getClass(), "lastRegionName", null);
        setField(term288471, term288471.getClass(), "lastClientId", null);
        setField(term288471, term288471.getClass(), "lastCountryCode", null);
        setIntField(term288471, term288471.getClass(), "lastSelectEMoney", 0);
        setIntField(term288471, term288471.getClass(), "lastSelectTicket", 0);
        setIntField(term288471, term288471.getClass(), "lastSelectCourse", 0);
        setIntField(term288471, term288471.getClass(), "lastCountCourse", 0);
        setField(term288471, term288471.getClass(), "firstGameId", null);
        setField(term288471, term288471.getClass(), "firstRomVersion", null);
        setField(term288471, term288471.getClass(), "firstDataVersion", null);
        setField(term288471, term288471.getClass(), "firstPlayDate", null);
        setField(term288471, term288471.getClass(), "compatibleCmVersion", null);
        setField(term288471, term288471.getClass(), "dailyBonusDate", null);
        setField(term288471, term288471.getClass(), "dailyCourseBonusDate", null);
        setField(term288471, term288471.getClass(), "lastPairLoginDate", null);
        setField(term288471, term288471.getClass(), "lastTrialPlayDate", null);
        setIntField(term288471, term288471.getClass(), "playVsCount", 0);
        setIntField(term288471, term288471.getClass(), "playSyncCount", 0);
        setIntField(term288471, term288471.getClass(), "winCount", 0);
        setIntField(term288471, term288471.getClass(), "helpCount", 0);
        setIntField(term288471, term288471.getClass(), "comboCount", 0);
        setLongField(term288471, term288471.getClass(), "totalDeluxscore", 0L);
        setLongField(term288471, term288471.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term288471, term288471.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term288471, term288471.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term288471, term288471.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term288471, term288471.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term288471, term288471.getClass(), "totalSync", 0);
        setIntField(term288471, term288471.getClass(), "totalBasicSync", 0);
        setIntField(term288471, term288471.getClass(), "totalAdvancedSync", 0);
        setIntField(term288471, term288471.getClass(), "totalExpertSync", 0);
        setIntField(term288471, term288471.getClass(), "totalMasterSync", 0);
        setIntField(term288471, term288471.getClass(), "totalReMasterSync", 0);
        setLongField(term288471, term288471.getClass(), "totalAchievement", 0L);
        setLongField(term288471, term288471.getClass(), "totalBasicAchievement", 0L);
        setLongField(term288471, term288471.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term288471, term288471.getClass(), "totalExpertAchievement", 0L);
        setLongField(term288471, term288471.getClass(), "totalMasterAchievement", 0L);
        setLongField(term288471, term288471.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term288471, term288471.getClass(), "playerOldRating", 0L);
        setLongField(term288471, term288471.getClass(), "playerNewRating", 0L);
        setIntField(term288471, term288471.getClass(), "banState", 0);
        setLongField(term288471, term288471.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstRomVersion", argTypes, term288471, args);
    }

};


