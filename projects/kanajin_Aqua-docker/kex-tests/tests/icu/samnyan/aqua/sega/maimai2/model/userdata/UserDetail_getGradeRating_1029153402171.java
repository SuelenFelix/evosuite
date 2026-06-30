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

public class UserDetail_getGradeRating_1029153402171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286766;

    public UserDetail_getGradeRating_1029153402171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286766 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term286766, term286766.getClass(), "id", 0L);
        setField(term286766, term286766.getClass(), "card", null);
        setField(term286766, term286766.getClass(), "userName", null);
        setIntField(term286766, term286766.getClass(), "isNetMember", 0);
        setIntField(term286766, term286766.getClass(), "iconId", 0);
        setIntField(term286766, term286766.getClass(), "plateId", 0);
        setIntField(term286766, term286766.getClass(), "titleId", 0);
        setIntField(term286766, term286766.getClass(), "partnerId", 0);
        setIntField(term286766, term286766.getClass(), "frameId", 0);
        setIntField(term286766, term286766.getClass(), "selectMapId", 0);
        setIntField(term286766, term286766.getClass(), "totalAwake", 0);
        setIntField(term286766, term286766.getClass(), "gradeRating", 0);
        setIntField(term286766, term286766.getClass(), "musicRating", 0);
        setIntField(term286766, term286766.getClass(), "playerRating", 0);
        setIntField(term286766, term286766.getClass(), "highestRating", 0);
        setIntField(term286766, term286766.getClass(), "gradeRank", 0);
        setIntField(term286766, term286766.getClass(), "classRank", 0);
        setIntField(term286766, term286766.getClass(), "courseRank", 0);
        setField(term286766, term286766.getClass(), "charaSlot", null);
        setField(term286766, term286766.getClass(), "charaLockSlot", null);
        setLongField(term286766, term286766.getClass(), "contentBit", 0L);
        setIntField(term286766, term286766.getClass(), "playCount", 0);
        setField(term286766, term286766.getClass(), "eventWatchedDate", null);
        setField(term286766, term286766.getClass(), "lastGameId", null);
        setField(term286766, term286766.getClass(), "lastRomVersion", null);
        setField(term286766, term286766.getClass(), "lastDataVersion", null);
        setField(term286766, term286766.getClass(), "lastLoginDate", null);
        setField(term286766, term286766.getClass(), "lastPlayDate", null);
        setIntField(term286766, term286766.getClass(), "lastPlayCredit", 0);
        setIntField(term286766, term286766.getClass(), "lastPlayMode", 0);
        setIntField(term286766, term286766.getClass(), "lastPlaceId", 0);
        setField(term286766, term286766.getClass(), "lastPlaceName", null);
        setIntField(term286766, term286766.getClass(), "lastAllNetId", 0);
        setIntField(term286766, term286766.getClass(), "lastRegionId", 0);
        setField(term286766, term286766.getClass(), "lastRegionName", null);
        setField(term286766, term286766.getClass(), "lastClientId", null);
        setField(term286766, term286766.getClass(), "lastCountryCode", null);
        setIntField(term286766, term286766.getClass(), "lastSelectEMoney", 0);
        setIntField(term286766, term286766.getClass(), "lastSelectTicket", 0);
        setIntField(term286766, term286766.getClass(), "lastSelectCourse", 0);
        setIntField(term286766, term286766.getClass(), "lastCountCourse", 0);
        setField(term286766, term286766.getClass(), "firstGameId", null);
        setField(term286766, term286766.getClass(), "firstRomVersion", null);
        setField(term286766, term286766.getClass(), "firstDataVersion", null);
        setField(term286766, term286766.getClass(), "firstPlayDate", null);
        setField(term286766, term286766.getClass(), "compatibleCmVersion", null);
        setField(term286766, term286766.getClass(), "dailyBonusDate", null);
        setField(term286766, term286766.getClass(), "dailyCourseBonusDate", null);
        setField(term286766, term286766.getClass(), "lastPairLoginDate", null);
        setField(term286766, term286766.getClass(), "lastTrialPlayDate", null);
        setIntField(term286766, term286766.getClass(), "playVsCount", 0);
        setIntField(term286766, term286766.getClass(), "playSyncCount", 0);
        setIntField(term286766, term286766.getClass(), "winCount", 0);
        setIntField(term286766, term286766.getClass(), "helpCount", 0);
        setIntField(term286766, term286766.getClass(), "comboCount", 0);
        setLongField(term286766, term286766.getClass(), "totalDeluxscore", 0L);
        setLongField(term286766, term286766.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term286766, term286766.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term286766, term286766.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term286766, term286766.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term286766, term286766.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term286766, term286766.getClass(), "totalSync", 0);
        setIntField(term286766, term286766.getClass(), "totalBasicSync", 0);
        setIntField(term286766, term286766.getClass(), "totalAdvancedSync", 0);
        setIntField(term286766, term286766.getClass(), "totalExpertSync", 0);
        setIntField(term286766, term286766.getClass(), "totalMasterSync", 0);
        setIntField(term286766, term286766.getClass(), "totalReMasterSync", 0);
        setLongField(term286766, term286766.getClass(), "totalAchievement", 0L);
        setLongField(term286766, term286766.getClass(), "totalBasicAchievement", 0L);
        setLongField(term286766, term286766.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term286766, term286766.getClass(), "totalExpertAchievement", 0L);
        setLongField(term286766, term286766.getClass(), "totalMasterAchievement", 0L);
        setLongField(term286766, term286766.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term286766, term286766.getClass(), "playerOldRating", 0L);
        setLongField(term286766, term286766.getClass(), "playerNewRating", 0L);
        setIntField(term286766, term286766.getClass(), "banState", 0);
        setLongField(term286766, term286766.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGradeRating", argTypes, term286766, args);
    }

};


