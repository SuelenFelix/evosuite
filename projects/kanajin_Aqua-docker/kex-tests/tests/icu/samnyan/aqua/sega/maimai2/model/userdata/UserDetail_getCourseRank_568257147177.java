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

public class UserDetail_getCourseRank_568257147177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287096;

    public UserDetail_getCourseRank_568257147177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287096 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term287096, term287096.getClass(), "id", 0L);
        setField(term287096, term287096.getClass(), "card", null);
        setField(term287096, term287096.getClass(), "userName", null);
        setIntField(term287096, term287096.getClass(), "isNetMember", 0);
        setIntField(term287096, term287096.getClass(), "iconId", 0);
        setIntField(term287096, term287096.getClass(), "plateId", 0);
        setIntField(term287096, term287096.getClass(), "titleId", 0);
        setIntField(term287096, term287096.getClass(), "partnerId", 0);
        setIntField(term287096, term287096.getClass(), "frameId", 0);
        setIntField(term287096, term287096.getClass(), "selectMapId", 0);
        setIntField(term287096, term287096.getClass(), "totalAwake", 0);
        setIntField(term287096, term287096.getClass(), "gradeRating", 0);
        setIntField(term287096, term287096.getClass(), "musicRating", 0);
        setIntField(term287096, term287096.getClass(), "playerRating", 0);
        setIntField(term287096, term287096.getClass(), "highestRating", 0);
        setIntField(term287096, term287096.getClass(), "gradeRank", 0);
        setIntField(term287096, term287096.getClass(), "classRank", 0);
        setIntField(term287096, term287096.getClass(), "courseRank", 0);
        setField(term287096, term287096.getClass(), "charaSlot", null);
        setField(term287096, term287096.getClass(), "charaLockSlot", null);
        setLongField(term287096, term287096.getClass(), "contentBit", 0L);
        setIntField(term287096, term287096.getClass(), "playCount", 0);
        setField(term287096, term287096.getClass(), "eventWatchedDate", null);
        setField(term287096, term287096.getClass(), "lastGameId", null);
        setField(term287096, term287096.getClass(), "lastRomVersion", null);
        setField(term287096, term287096.getClass(), "lastDataVersion", null);
        setField(term287096, term287096.getClass(), "lastLoginDate", null);
        setField(term287096, term287096.getClass(), "lastPlayDate", null);
        setIntField(term287096, term287096.getClass(), "lastPlayCredit", 0);
        setIntField(term287096, term287096.getClass(), "lastPlayMode", 0);
        setIntField(term287096, term287096.getClass(), "lastPlaceId", 0);
        setField(term287096, term287096.getClass(), "lastPlaceName", null);
        setIntField(term287096, term287096.getClass(), "lastAllNetId", 0);
        setIntField(term287096, term287096.getClass(), "lastRegionId", 0);
        setField(term287096, term287096.getClass(), "lastRegionName", null);
        setField(term287096, term287096.getClass(), "lastClientId", null);
        setField(term287096, term287096.getClass(), "lastCountryCode", null);
        setIntField(term287096, term287096.getClass(), "lastSelectEMoney", 0);
        setIntField(term287096, term287096.getClass(), "lastSelectTicket", 0);
        setIntField(term287096, term287096.getClass(), "lastSelectCourse", 0);
        setIntField(term287096, term287096.getClass(), "lastCountCourse", 0);
        setField(term287096, term287096.getClass(), "firstGameId", null);
        setField(term287096, term287096.getClass(), "firstRomVersion", null);
        setField(term287096, term287096.getClass(), "firstDataVersion", null);
        setField(term287096, term287096.getClass(), "firstPlayDate", null);
        setField(term287096, term287096.getClass(), "compatibleCmVersion", null);
        setField(term287096, term287096.getClass(), "dailyBonusDate", null);
        setField(term287096, term287096.getClass(), "dailyCourseBonusDate", null);
        setField(term287096, term287096.getClass(), "lastPairLoginDate", null);
        setField(term287096, term287096.getClass(), "lastTrialPlayDate", null);
        setIntField(term287096, term287096.getClass(), "playVsCount", 0);
        setIntField(term287096, term287096.getClass(), "playSyncCount", 0);
        setIntField(term287096, term287096.getClass(), "winCount", 0);
        setIntField(term287096, term287096.getClass(), "helpCount", 0);
        setIntField(term287096, term287096.getClass(), "comboCount", 0);
        setLongField(term287096, term287096.getClass(), "totalDeluxscore", 0L);
        setLongField(term287096, term287096.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term287096, term287096.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term287096, term287096.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term287096, term287096.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term287096, term287096.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term287096, term287096.getClass(), "totalSync", 0);
        setIntField(term287096, term287096.getClass(), "totalBasicSync", 0);
        setIntField(term287096, term287096.getClass(), "totalAdvancedSync", 0);
        setIntField(term287096, term287096.getClass(), "totalExpertSync", 0);
        setIntField(term287096, term287096.getClass(), "totalMasterSync", 0);
        setIntField(term287096, term287096.getClass(), "totalReMasterSync", 0);
        setLongField(term287096, term287096.getClass(), "totalAchievement", 0L);
        setLongField(term287096, term287096.getClass(), "totalBasicAchievement", 0L);
        setLongField(term287096, term287096.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term287096, term287096.getClass(), "totalExpertAchievement", 0L);
        setLongField(term287096, term287096.getClass(), "totalMasterAchievement", 0L);
        setLongField(term287096, term287096.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term287096, term287096.getClass(), "playerOldRating", 0L);
        setLongField(term287096, term287096.getClass(), "playerNewRating", 0L);
        setIntField(term287096, term287096.getClass(), "banState", 0);
        setLongField(term287096, term287096.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCourseRank", argTypes, term287096, args);
    }

};


