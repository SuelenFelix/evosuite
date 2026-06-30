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

public class UserDetail_getLastGameId_1117247846183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287426;

    public UserDetail_getLastGameId_1117247846183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287426 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term287426, term287426.getClass(), "id", 0L);
        setField(term287426, term287426.getClass(), "card", null);
        setField(term287426, term287426.getClass(), "userName", null);
        setIntField(term287426, term287426.getClass(), "isNetMember", 0);
        setIntField(term287426, term287426.getClass(), "iconId", 0);
        setIntField(term287426, term287426.getClass(), "plateId", 0);
        setIntField(term287426, term287426.getClass(), "titleId", 0);
        setIntField(term287426, term287426.getClass(), "partnerId", 0);
        setIntField(term287426, term287426.getClass(), "frameId", 0);
        setIntField(term287426, term287426.getClass(), "selectMapId", 0);
        setIntField(term287426, term287426.getClass(), "totalAwake", 0);
        setIntField(term287426, term287426.getClass(), "gradeRating", 0);
        setIntField(term287426, term287426.getClass(), "musicRating", 0);
        setIntField(term287426, term287426.getClass(), "playerRating", 0);
        setIntField(term287426, term287426.getClass(), "highestRating", 0);
        setIntField(term287426, term287426.getClass(), "gradeRank", 0);
        setIntField(term287426, term287426.getClass(), "classRank", 0);
        setIntField(term287426, term287426.getClass(), "courseRank", 0);
        setField(term287426, term287426.getClass(), "charaSlot", null);
        setField(term287426, term287426.getClass(), "charaLockSlot", null);
        setLongField(term287426, term287426.getClass(), "contentBit", 0L);
        setIntField(term287426, term287426.getClass(), "playCount", 0);
        setField(term287426, term287426.getClass(), "eventWatchedDate", null);
        setField(term287426, term287426.getClass(), "lastGameId", null);
        setField(term287426, term287426.getClass(), "lastRomVersion", null);
        setField(term287426, term287426.getClass(), "lastDataVersion", null);
        setField(term287426, term287426.getClass(), "lastLoginDate", null);
        setField(term287426, term287426.getClass(), "lastPlayDate", null);
        setIntField(term287426, term287426.getClass(), "lastPlayCredit", 0);
        setIntField(term287426, term287426.getClass(), "lastPlayMode", 0);
        setIntField(term287426, term287426.getClass(), "lastPlaceId", 0);
        setField(term287426, term287426.getClass(), "lastPlaceName", null);
        setIntField(term287426, term287426.getClass(), "lastAllNetId", 0);
        setIntField(term287426, term287426.getClass(), "lastRegionId", 0);
        setField(term287426, term287426.getClass(), "lastRegionName", null);
        setField(term287426, term287426.getClass(), "lastClientId", null);
        setField(term287426, term287426.getClass(), "lastCountryCode", null);
        setIntField(term287426, term287426.getClass(), "lastSelectEMoney", 0);
        setIntField(term287426, term287426.getClass(), "lastSelectTicket", 0);
        setIntField(term287426, term287426.getClass(), "lastSelectCourse", 0);
        setIntField(term287426, term287426.getClass(), "lastCountCourse", 0);
        setField(term287426, term287426.getClass(), "firstGameId", null);
        setField(term287426, term287426.getClass(), "firstRomVersion", null);
        setField(term287426, term287426.getClass(), "firstDataVersion", null);
        setField(term287426, term287426.getClass(), "firstPlayDate", null);
        setField(term287426, term287426.getClass(), "compatibleCmVersion", null);
        setField(term287426, term287426.getClass(), "dailyBonusDate", null);
        setField(term287426, term287426.getClass(), "dailyCourseBonusDate", null);
        setField(term287426, term287426.getClass(), "lastPairLoginDate", null);
        setField(term287426, term287426.getClass(), "lastTrialPlayDate", null);
        setIntField(term287426, term287426.getClass(), "playVsCount", 0);
        setIntField(term287426, term287426.getClass(), "playSyncCount", 0);
        setIntField(term287426, term287426.getClass(), "winCount", 0);
        setIntField(term287426, term287426.getClass(), "helpCount", 0);
        setIntField(term287426, term287426.getClass(), "comboCount", 0);
        setLongField(term287426, term287426.getClass(), "totalDeluxscore", 0L);
        setLongField(term287426, term287426.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term287426, term287426.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term287426, term287426.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term287426, term287426.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term287426, term287426.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term287426, term287426.getClass(), "totalSync", 0);
        setIntField(term287426, term287426.getClass(), "totalBasicSync", 0);
        setIntField(term287426, term287426.getClass(), "totalAdvancedSync", 0);
        setIntField(term287426, term287426.getClass(), "totalExpertSync", 0);
        setIntField(term287426, term287426.getClass(), "totalMasterSync", 0);
        setIntField(term287426, term287426.getClass(), "totalReMasterSync", 0);
        setLongField(term287426, term287426.getClass(), "totalAchievement", 0L);
        setLongField(term287426, term287426.getClass(), "totalBasicAchievement", 0L);
        setLongField(term287426, term287426.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term287426, term287426.getClass(), "totalExpertAchievement", 0L);
        setLongField(term287426, term287426.getClass(), "totalMasterAchievement", 0L);
        setLongField(term287426, term287426.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term287426, term287426.getClass(), "playerOldRating", 0L);
        setLongField(term287426, term287426.getClass(), "playerNewRating", 0L);
        setIntField(term287426, term287426.getClass(), "banState", 0);
        setLongField(term287426, term287426.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastGameId", argTypes, term287426, args);
    }

};


