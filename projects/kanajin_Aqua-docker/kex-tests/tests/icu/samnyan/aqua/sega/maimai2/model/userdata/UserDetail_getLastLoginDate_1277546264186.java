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

public class UserDetail_getLastLoginDate_1277546264186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287591;

    public UserDetail_getLastLoginDate_1277546264186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287591 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term287591, term287591.getClass(), "id", 0L);
        setField(term287591, term287591.getClass(), "card", null);
        setField(term287591, term287591.getClass(), "userName", null);
        setIntField(term287591, term287591.getClass(), "isNetMember", 0);
        setIntField(term287591, term287591.getClass(), "iconId", 0);
        setIntField(term287591, term287591.getClass(), "plateId", 0);
        setIntField(term287591, term287591.getClass(), "titleId", 0);
        setIntField(term287591, term287591.getClass(), "partnerId", 0);
        setIntField(term287591, term287591.getClass(), "frameId", 0);
        setIntField(term287591, term287591.getClass(), "selectMapId", 0);
        setIntField(term287591, term287591.getClass(), "totalAwake", 0);
        setIntField(term287591, term287591.getClass(), "gradeRating", 0);
        setIntField(term287591, term287591.getClass(), "musicRating", 0);
        setIntField(term287591, term287591.getClass(), "playerRating", 0);
        setIntField(term287591, term287591.getClass(), "highestRating", 0);
        setIntField(term287591, term287591.getClass(), "gradeRank", 0);
        setIntField(term287591, term287591.getClass(), "classRank", 0);
        setIntField(term287591, term287591.getClass(), "courseRank", 0);
        setField(term287591, term287591.getClass(), "charaSlot", null);
        setField(term287591, term287591.getClass(), "charaLockSlot", null);
        setLongField(term287591, term287591.getClass(), "contentBit", 0L);
        setIntField(term287591, term287591.getClass(), "playCount", 0);
        setField(term287591, term287591.getClass(), "eventWatchedDate", null);
        setField(term287591, term287591.getClass(), "lastGameId", null);
        setField(term287591, term287591.getClass(), "lastRomVersion", null);
        setField(term287591, term287591.getClass(), "lastDataVersion", null);
        setField(term287591, term287591.getClass(), "lastLoginDate", null);
        setField(term287591, term287591.getClass(), "lastPlayDate", null);
        setIntField(term287591, term287591.getClass(), "lastPlayCredit", 0);
        setIntField(term287591, term287591.getClass(), "lastPlayMode", 0);
        setIntField(term287591, term287591.getClass(), "lastPlaceId", 0);
        setField(term287591, term287591.getClass(), "lastPlaceName", null);
        setIntField(term287591, term287591.getClass(), "lastAllNetId", 0);
        setIntField(term287591, term287591.getClass(), "lastRegionId", 0);
        setField(term287591, term287591.getClass(), "lastRegionName", null);
        setField(term287591, term287591.getClass(), "lastClientId", null);
        setField(term287591, term287591.getClass(), "lastCountryCode", null);
        setIntField(term287591, term287591.getClass(), "lastSelectEMoney", 0);
        setIntField(term287591, term287591.getClass(), "lastSelectTicket", 0);
        setIntField(term287591, term287591.getClass(), "lastSelectCourse", 0);
        setIntField(term287591, term287591.getClass(), "lastCountCourse", 0);
        setField(term287591, term287591.getClass(), "firstGameId", null);
        setField(term287591, term287591.getClass(), "firstRomVersion", null);
        setField(term287591, term287591.getClass(), "firstDataVersion", null);
        setField(term287591, term287591.getClass(), "firstPlayDate", null);
        setField(term287591, term287591.getClass(), "compatibleCmVersion", null);
        setField(term287591, term287591.getClass(), "dailyBonusDate", null);
        setField(term287591, term287591.getClass(), "dailyCourseBonusDate", null);
        setField(term287591, term287591.getClass(), "lastPairLoginDate", null);
        setField(term287591, term287591.getClass(), "lastTrialPlayDate", null);
        setIntField(term287591, term287591.getClass(), "playVsCount", 0);
        setIntField(term287591, term287591.getClass(), "playSyncCount", 0);
        setIntField(term287591, term287591.getClass(), "winCount", 0);
        setIntField(term287591, term287591.getClass(), "helpCount", 0);
        setIntField(term287591, term287591.getClass(), "comboCount", 0);
        setLongField(term287591, term287591.getClass(), "totalDeluxscore", 0L);
        setLongField(term287591, term287591.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term287591, term287591.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term287591, term287591.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term287591, term287591.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term287591, term287591.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term287591, term287591.getClass(), "totalSync", 0);
        setIntField(term287591, term287591.getClass(), "totalBasicSync", 0);
        setIntField(term287591, term287591.getClass(), "totalAdvancedSync", 0);
        setIntField(term287591, term287591.getClass(), "totalExpertSync", 0);
        setIntField(term287591, term287591.getClass(), "totalMasterSync", 0);
        setIntField(term287591, term287591.getClass(), "totalReMasterSync", 0);
        setLongField(term287591, term287591.getClass(), "totalAchievement", 0L);
        setLongField(term287591, term287591.getClass(), "totalBasicAchievement", 0L);
        setLongField(term287591, term287591.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term287591, term287591.getClass(), "totalExpertAchievement", 0L);
        setLongField(term287591, term287591.getClass(), "totalMasterAchievement", 0L);
        setLongField(term287591, term287591.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term287591, term287591.getClass(), "playerOldRating", 0L);
        setLongField(term287591, term287591.getClass(), "playerNewRating", 0L);
        setIntField(term287591, term287591.getClass(), "banState", 0);
        setLongField(term287591, term287591.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastLoginDate", argTypes, term287591, args);
    }

};


