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

public class UserDetail_getTotalExpertSync_733320901224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289681;

    public UserDetail_getTotalExpertSync_733320901224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289681 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term289681, term289681.getClass(), "id", 0L);
        setField(term289681, term289681.getClass(), "card", null);
        setField(term289681, term289681.getClass(), "userName", null);
        setIntField(term289681, term289681.getClass(), "isNetMember", 0);
        setIntField(term289681, term289681.getClass(), "iconId", 0);
        setIntField(term289681, term289681.getClass(), "plateId", 0);
        setIntField(term289681, term289681.getClass(), "titleId", 0);
        setIntField(term289681, term289681.getClass(), "partnerId", 0);
        setIntField(term289681, term289681.getClass(), "frameId", 0);
        setIntField(term289681, term289681.getClass(), "selectMapId", 0);
        setIntField(term289681, term289681.getClass(), "totalAwake", 0);
        setIntField(term289681, term289681.getClass(), "gradeRating", 0);
        setIntField(term289681, term289681.getClass(), "musicRating", 0);
        setIntField(term289681, term289681.getClass(), "playerRating", 0);
        setIntField(term289681, term289681.getClass(), "highestRating", 0);
        setIntField(term289681, term289681.getClass(), "gradeRank", 0);
        setIntField(term289681, term289681.getClass(), "classRank", 0);
        setIntField(term289681, term289681.getClass(), "courseRank", 0);
        setField(term289681, term289681.getClass(), "charaSlot", null);
        setField(term289681, term289681.getClass(), "charaLockSlot", null);
        setLongField(term289681, term289681.getClass(), "contentBit", 0L);
        setIntField(term289681, term289681.getClass(), "playCount", 0);
        setField(term289681, term289681.getClass(), "eventWatchedDate", null);
        setField(term289681, term289681.getClass(), "lastGameId", null);
        setField(term289681, term289681.getClass(), "lastRomVersion", null);
        setField(term289681, term289681.getClass(), "lastDataVersion", null);
        setField(term289681, term289681.getClass(), "lastLoginDate", null);
        setField(term289681, term289681.getClass(), "lastPlayDate", null);
        setIntField(term289681, term289681.getClass(), "lastPlayCredit", 0);
        setIntField(term289681, term289681.getClass(), "lastPlayMode", 0);
        setIntField(term289681, term289681.getClass(), "lastPlaceId", 0);
        setField(term289681, term289681.getClass(), "lastPlaceName", null);
        setIntField(term289681, term289681.getClass(), "lastAllNetId", 0);
        setIntField(term289681, term289681.getClass(), "lastRegionId", 0);
        setField(term289681, term289681.getClass(), "lastRegionName", null);
        setField(term289681, term289681.getClass(), "lastClientId", null);
        setField(term289681, term289681.getClass(), "lastCountryCode", null);
        setIntField(term289681, term289681.getClass(), "lastSelectEMoney", 0);
        setIntField(term289681, term289681.getClass(), "lastSelectTicket", 0);
        setIntField(term289681, term289681.getClass(), "lastSelectCourse", 0);
        setIntField(term289681, term289681.getClass(), "lastCountCourse", 0);
        setField(term289681, term289681.getClass(), "firstGameId", null);
        setField(term289681, term289681.getClass(), "firstRomVersion", null);
        setField(term289681, term289681.getClass(), "firstDataVersion", null);
        setField(term289681, term289681.getClass(), "firstPlayDate", null);
        setField(term289681, term289681.getClass(), "compatibleCmVersion", null);
        setField(term289681, term289681.getClass(), "dailyBonusDate", null);
        setField(term289681, term289681.getClass(), "dailyCourseBonusDate", null);
        setField(term289681, term289681.getClass(), "lastPairLoginDate", null);
        setField(term289681, term289681.getClass(), "lastTrialPlayDate", null);
        setIntField(term289681, term289681.getClass(), "playVsCount", 0);
        setIntField(term289681, term289681.getClass(), "playSyncCount", 0);
        setIntField(term289681, term289681.getClass(), "winCount", 0);
        setIntField(term289681, term289681.getClass(), "helpCount", 0);
        setIntField(term289681, term289681.getClass(), "comboCount", 0);
        setLongField(term289681, term289681.getClass(), "totalDeluxscore", 0L);
        setLongField(term289681, term289681.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term289681, term289681.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term289681, term289681.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term289681, term289681.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term289681, term289681.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term289681, term289681.getClass(), "totalSync", 0);
        setIntField(term289681, term289681.getClass(), "totalBasicSync", 0);
        setIntField(term289681, term289681.getClass(), "totalAdvancedSync", 0);
        setIntField(term289681, term289681.getClass(), "totalExpertSync", 0);
        setIntField(term289681, term289681.getClass(), "totalMasterSync", 0);
        setIntField(term289681, term289681.getClass(), "totalReMasterSync", 0);
        setLongField(term289681, term289681.getClass(), "totalAchievement", 0L);
        setLongField(term289681, term289681.getClass(), "totalBasicAchievement", 0L);
        setLongField(term289681, term289681.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term289681, term289681.getClass(), "totalExpertAchievement", 0L);
        setLongField(term289681, term289681.getClass(), "totalMasterAchievement", 0L);
        setLongField(term289681, term289681.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term289681, term289681.getClass(), "playerOldRating", 0L);
        setLongField(term289681, term289681.getClass(), "playerNewRating", 0L);
        setIntField(term289681, term289681.getClass(), "banState", 0);
        setLongField(term289681, term289681.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalExpertSync", argTypes, term289681, args);
    }

};


