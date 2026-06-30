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

public class UserDetail_getDailyCourseBonusDate_1783334724207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288746;

    public UserDetail_getDailyCourseBonusDate_1783334724207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288746 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term288746, term288746.getClass(), "id", 0L);
        setField(term288746, term288746.getClass(), "card", null);
        setField(term288746, term288746.getClass(), "userName", null);
        setIntField(term288746, term288746.getClass(), "isNetMember", 0);
        setIntField(term288746, term288746.getClass(), "iconId", 0);
        setIntField(term288746, term288746.getClass(), "plateId", 0);
        setIntField(term288746, term288746.getClass(), "titleId", 0);
        setIntField(term288746, term288746.getClass(), "partnerId", 0);
        setIntField(term288746, term288746.getClass(), "frameId", 0);
        setIntField(term288746, term288746.getClass(), "selectMapId", 0);
        setIntField(term288746, term288746.getClass(), "totalAwake", 0);
        setIntField(term288746, term288746.getClass(), "gradeRating", 0);
        setIntField(term288746, term288746.getClass(), "musicRating", 0);
        setIntField(term288746, term288746.getClass(), "playerRating", 0);
        setIntField(term288746, term288746.getClass(), "highestRating", 0);
        setIntField(term288746, term288746.getClass(), "gradeRank", 0);
        setIntField(term288746, term288746.getClass(), "classRank", 0);
        setIntField(term288746, term288746.getClass(), "courseRank", 0);
        setField(term288746, term288746.getClass(), "charaSlot", null);
        setField(term288746, term288746.getClass(), "charaLockSlot", null);
        setLongField(term288746, term288746.getClass(), "contentBit", 0L);
        setIntField(term288746, term288746.getClass(), "playCount", 0);
        setField(term288746, term288746.getClass(), "eventWatchedDate", null);
        setField(term288746, term288746.getClass(), "lastGameId", null);
        setField(term288746, term288746.getClass(), "lastRomVersion", null);
        setField(term288746, term288746.getClass(), "lastDataVersion", null);
        setField(term288746, term288746.getClass(), "lastLoginDate", null);
        setField(term288746, term288746.getClass(), "lastPlayDate", null);
        setIntField(term288746, term288746.getClass(), "lastPlayCredit", 0);
        setIntField(term288746, term288746.getClass(), "lastPlayMode", 0);
        setIntField(term288746, term288746.getClass(), "lastPlaceId", 0);
        setField(term288746, term288746.getClass(), "lastPlaceName", null);
        setIntField(term288746, term288746.getClass(), "lastAllNetId", 0);
        setIntField(term288746, term288746.getClass(), "lastRegionId", 0);
        setField(term288746, term288746.getClass(), "lastRegionName", null);
        setField(term288746, term288746.getClass(), "lastClientId", null);
        setField(term288746, term288746.getClass(), "lastCountryCode", null);
        setIntField(term288746, term288746.getClass(), "lastSelectEMoney", 0);
        setIntField(term288746, term288746.getClass(), "lastSelectTicket", 0);
        setIntField(term288746, term288746.getClass(), "lastSelectCourse", 0);
        setIntField(term288746, term288746.getClass(), "lastCountCourse", 0);
        setField(term288746, term288746.getClass(), "firstGameId", null);
        setField(term288746, term288746.getClass(), "firstRomVersion", null);
        setField(term288746, term288746.getClass(), "firstDataVersion", null);
        setField(term288746, term288746.getClass(), "firstPlayDate", null);
        setField(term288746, term288746.getClass(), "compatibleCmVersion", null);
        setField(term288746, term288746.getClass(), "dailyBonusDate", null);
        setField(term288746, term288746.getClass(), "dailyCourseBonusDate", null);
        setField(term288746, term288746.getClass(), "lastPairLoginDate", null);
        setField(term288746, term288746.getClass(), "lastTrialPlayDate", null);
        setIntField(term288746, term288746.getClass(), "playVsCount", 0);
        setIntField(term288746, term288746.getClass(), "playSyncCount", 0);
        setIntField(term288746, term288746.getClass(), "winCount", 0);
        setIntField(term288746, term288746.getClass(), "helpCount", 0);
        setIntField(term288746, term288746.getClass(), "comboCount", 0);
        setLongField(term288746, term288746.getClass(), "totalDeluxscore", 0L);
        setLongField(term288746, term288746.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term288746, term288746.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term288746, term288746.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term288746, term288746.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term288746, term288746.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term288746, term288746.getClass(), "totalSync", 0);
        setIntField(term288746, term288746.getClass(), "totalBasicSync", 0);
        setIntField(term288746, term288746.getClass(), "totalAdvancedSync", 0);
        setIntField(term288746, term288746.getClass(), "totalExpertSync", 0);
        setIntField(term288746, term288746.getClass(), "totalMasterSync", 0);
        setIntField(term288746, term288746.getClass(), "totalReMasterSync", 0);
        setLongField(term288746, term288746.getClass(), "totalAchievement", 0L);
        setLongField(term288746, term288746.getClass(), "totalBasicAchievement", 0L);
        setLongField(term288746, term288746.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term288746, term288746.getClass(), "totalExpertAchievement", 0L);
        setLongField(term288746, term288746.getClass(), "totalMasterAchievement", 0L);
        setLongField(term288746, term288746.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term288746, term288746.getClass(), "playerOldRating", 0L);
        setLongField(term288746, term288746.getClass(), "playerNewRating", 0L);
        setIntField(term288746, term288746.getClass(), "banState", 0);
        setLongField(term288746, term288746.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDailyCourseBonusDate", argTypes, term288746, args);
    }

};


