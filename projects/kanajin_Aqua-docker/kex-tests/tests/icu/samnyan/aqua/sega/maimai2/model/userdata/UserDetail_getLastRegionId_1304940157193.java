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

public class UserDetail_getLastRegionId_1304940157193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287976;

    public UserDetail_getLastRegionId_1304940157193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287976 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term287976, term287976.getClass(), "id", 0L);
        setField(term287976, term287976.getClass(), "card", null);
        setField(term287976, term287976.getClass(), "userName", null);
        setIntField(term287976, term287976.getClass(), "isNetMember", 0);
        setIntField(term287976, term287976.getClass(), "iconId", 0);
        setIntField(term287976, term287976.getClass(), "plateId", 0);
        setIntField(term287976, term287976.getClass(), "titleId", 0);
        setIntField(term287976, term287976.getClass(), "partnerId", 0);
        setIntField(term287976, term287976.getClass(), "frameId", 0);
        setIntField(term287976, term287976.getClass(), "selectMapId", 0);
        setIntField(term287976, term287976.getClass(), "totalAwake", 0);
        setIntField(term287976, term287976.getClass(), "gradeRating", 0);
        setIntField(term287976, term287976.getClass(), "musicRating", 0);
        setIntField(term287976, term287976.getClass(), "playerRating", 0);
        setIntField(term287976, term287976.getClass(), "highestRating", 0);
        setIntField(term287976, term287976.getClass(), "gradeRank", 0);
        setIntField(term287976, term287976.getClass(), "classRank", 0);
        setIntField(term287976, term287976.getClass(), "courseRank", 0);
        setField(term287976, term287976.getClass(), "charaSlot", null);
        setField(term287976, term287976.getClass(), "charaLockSlot", null);
        setLongField(term287976, term287976.getClass(), "contentBit", 0L);
        setIntField(term287976, term287976.getClass(), "playCount", 0);
        setField(term287976, term287976.getClass(), "eventWatchedDate", null);
        setField(term287976, term287976.getClass(), "lastGameId", null);
        setField(term287976, term287976.getClass(), "lastRomVersion", null);
        setField(term287976, term287976.getClass(), "lastDataVersion", null);
        setField(term287976, term287976.getClass(), "lastLoginDate", null);
        setField(term287976, term287976.getClass(), "lastPlayDate", null);
        setIntField(term287976, term287976.getClass(), "lastPlayCredit", 0);
        setIntField(term287976, term287976.getClass(), "lastPlayMode", 0);
        setIntField(term287976, term287976.getClass(), "lastPlaceId", 0);
        setField(term287976, term287976.getClass(), "lastPlaceName", null);
        setIntField(term287976, term287976.getClass(), "lastAllNetId", 0);
        setIntField(term287976, term287976.getClass(), "lastRegionId", 0);
        setField(term287976, term287976.getClass(), "lastRegionName", null);
        setField(term287976, term287976.getClass(), "lastClientId", null);
        setField(term287976, term287976.getClass(), "lastCountryCode", null);
        setIntField(term287976, term287976.getClass(), "lastSelectEMoney", 0);
        setIntField(term287976, term287976.getClass(), "lastSelectTicket", 0);
        setIntField(term287976, term287976.getClass(), "lastSelectCourse", 0);
        setIntField(term287976, term287976.getClass(), "lastCountCourse", 0);
        setField(term287976, term287976.getClass(), "firstGameId", null);
        setField(term287976, term287976.getClass(), "firstRomVersion", null);
        setField(term287976, term287976.getClass(), "firstDataVersion", null);
        setField(term287976, term287976.getClass(), "firstPlayDate", null);
        setField(term287976, term287976.getClass(), "compatibleCmVersion", null);
        setField(term287976, term287976.getClass(), "dailyBonusDate", null);
        setField(term287976, term287976.getClass(), "dailyCourseBonusDate", null);
        setField(term287976, term287976.getClass(), "lastPairLoginDate", null);
        setField(term287976, term287976.getClass(), "lastTrialPlayDate", null);
        setIntField(term287976, term287976.getClass(), "playVsCount", 0);
        setIntField(term287976, term287976.getClass(), "playSyncCount", 0);
        setIntField(term287976, term287976.getClass(), "winCount", 0);
        setIntField(term287976, term287976.getClass(), "helpCount", 0);
        setIntField(term287976, term287976.getClass(), "comboCount", 0);
        setLongField(term287976, term287976.getClass(), "totalDeluxscore", 0L);
        setLongField(term287976, term287976.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term287976, term287976.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term287976, term287976.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term287976, term287976.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term287976, term287976.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term287976, term287976.getClass(), "totalSync", 0);
        setIntField(term287976, term287976.getClass(), "totalBasicSync", 0);
        setIntField(term287976, term287976.getClass(), "totalAdvancedSync", 0);
        setIntField(term287976, term287976.getClass(), "totalExpertSync", 0);
        setIntField(term287976, term287976.getClass(), "totalMasterSync", 0);
        setIntField(term287976, term287976.getClass(), "totalReMasterSync", 0);
        setLongField(term287976, term287976.getClass(), "totalAchievement", 0L);
        setLongField(term287976, term287976.getClass(), "totalBasicAchievement", 0L);
        setLongField(term287976, term287976.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term287976, term287976.getClass(), "totalExpertAchievement", 0L);
        setLongField(term287976, term287976.getClass(), "totalMasterAchievement", 0L);
        setLongField(term287976, term287976.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term287976, term287976.getClass(), "playerOldRating", 0L);
        setLongField(term287976, term287976.getClass(), "playerNewRating", 0L);
        setIntField(term287976, term287976.getClass(), "banState", 0);
        setLongField(term287976, term287976.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRegionId", argTypes, term287976, args);
    }

};


