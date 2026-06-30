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

public class UserDetail_getLastPlayDate_260894341187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287646;

    public UserDetail_getLastPlayDate_260894341187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287646 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term287646, term287646.getClass(), "id", 0L);
        setField(term287646, term287646.getClass(), "card", null);
        setField(term287646, term287646.getClass(), "userName", null);
        setIntField(term287646, term287646.getClass(), "isNetMember", 0);
        setIntField(term287646, term287646.getClass(), "iconId", 0);
        setIntField(term287646, term287646.getClass(), "plateId", 0);
        setIntField(term287646, term287646.getClass(), "titleId", 0);
        setIntField(term287646, term287646.getClass(), "partnerId", 0);
        setIntField(term287646, term287646.getClass(), "frameId", 0);
        setIntField(term287646, term287646.getClass(), "selectMapId", 0);
        setIntField(term287646, term287646.getClass(), "totalAwake", 0);
        setIntField(term287646, term287646.getClass(), "gradeRating", 0);
        setIntField(term287646, term287646.getClass(), "musicRating", 0);
        setIntField(term287646, term287646.getClass(), "playerRating", 0);
        setIntField(term287646, term287646.getClass(), "highestRating", 0);
        setIntField(term287646, term287646.getClass(), "gradeRank", 0);
        setIntField(term287646, term287646.getClass(), "classRank", 0);
        setIntField(term287646, term287646.getClass(), "courseRank", 0);
        setField(term287646, term287646.getClass(), "charaSlot", null);
        setField(term287646, term287646.getClass(), "charaLockSlot", null);
        setLongField(term287646, term287646.getClass(), "contentBit", 0L);
        setIntField(term287646, term287646.getClass(), "playCount", 0);
        setField(term287646, term287646.getClass(), "eventWatchedDate", null);
        setField(term287646, term287646.getClass(), "lastGameId", null);
        setField(term287646, term287646.getClass(), "lastRomVersion", null);
        setField(term287646, term287646.getClass(), "lastDataVersion", null);
        setField(term287646, term287646.getClass(), "lastLoginDate", null);
        setField(term287646, term287646.getClass(), "lastPlayDate", null);
        setIntField(term287646, term287646.getClass(), "lastPlayCredit", 0);
        setIntField(term287646, term287646.getClass(), "lastPlayMode", 0);
        setIntField(term287646, term287646.getClass(), "lastPlaceId", 0);
        setField(term287646, term287646.getClass(), "lastPlaceName", null);
        setIntField(term287646, term287646.getClass(), "lastAllNetId", 0);
        setIntField(term287646, term287646.getClass(), "lastRegionId", 0);
        setField(term287646, term287646.getClass(), "lastRegionName", null);
        setField(term287646, term287646.getClass(), "lastClientId", null);
        setField(term287646, term287646.getClass(), "lastCountryCode", null);
        setIntField(term287646, term287646.getClass(), "lastSelectEMoney", 0);
        setIntField(term287646, term287646.getClass(), "lastSelectTicket", 0);
        setIntField(term287646, term287646.getClass(), "lastSelectCourse", 0);
        setIntField(term287646, term287646.getClass(), "lastCountCourse", 0);
        setField(term287646, term287646.getClass(), "firstGameId", null);
        setField(term287646, term287646.getClass(), "firstRomVersion", null);
        setField(term287646, term287646.getClass(), "firstDataVersion", null);
        setField(term287646, term287646.getClass(), "firstPlayDate", null);
        setField(term287646, term287646.getClass(), "compatibleCmVersion", null);
        setField(term287646, term287646.getClass(), "dailyBonusDate", null);
        setField(term287646, term287646.getClass(), "dailyCourseBonusDate", null);
        setField(term287646, term287646.getClass(), "lastPairLoginDate", null);
        setField(term287646, term287646.getClass(), "lastTrialPlayDate", null);
        setIntField(term287646, term287646.getClass(), "playVsCount", 0);
        setIntField(term287646, term287646.getClass(), "playSyncCount", 0);
        setIntField(term287646, term287646.getClass(), "winCount", 0);
        setIntField(term287646, term287646.getClass(), "helpCount", 0);
        setIntField(term287646, term287646.getClass(), "comboCount", 0);
        setLongField(term287646, term287646.getClass(), "totalDeluxscore", 0L);
        setLongField(term287646, term287646.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term287646, term287646.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term287646, term287646.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term287646, term287646.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term287646, term287646.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term287646, term287646.getClass(), "totalSync", 0);
        setIntField(term287646, term287646.getClass(), "totalBasicSync", 0);
        setIntField(term287646, term287646.getClass(), "totalAdvancedSync", 0);
        setIntField(term287646, term287646.getClass(), "totalExpertSync", 0);
        setIntField(term287646, term287646.getClass(), "totalMasterSync", 0);
        setIntField(term287646, term287646.getClass(), "totalReMasterSync", 0);
        setLongField(term287646, term287646.getClass(), "totalAchievement", 0L);
        setLongField(term287646, term287646.getClass(), "totalBasicAchievement", 0L);
        setLongField(term287646, term287646.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term287646, term287646.getClass(), "totalExpertAchievement", 0L);
        setLongField(term287646, term287646.getClass(), "totalMasterAchievement", 0L);
        setLongField(term287646, term287646.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term287646, term287646.getClass(), "playerOldRating", 0L);
        setLongField(term287646, term287646.getClass(), "playerNewRating", 0L);
        setIntField(term287646, term287646.getClass(), "banState", 0);
        setLongField(term287646, term287646.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayDate", argTypes, term287646, args);
    }

};


