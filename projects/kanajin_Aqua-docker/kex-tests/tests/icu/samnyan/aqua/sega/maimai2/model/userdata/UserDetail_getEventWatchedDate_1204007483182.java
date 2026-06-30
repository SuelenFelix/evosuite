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

public class UserDetail_getEventWatchedDate_1204007483182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287371;

    public UserDetail_getEventWatchedDate_1204007483182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287371 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term287371, term287371.getClass(), "id", 0L);
        setField(term287371, term287371.getClass(), "card", null);
        setField(term287371, term287371.getClass(), "userName", null);
        setIntField(term287371, term287371.getClass(), "isNetMember", 0);
        setIntField(term287371, term287371.getClass(), "iconId", 0);
        setIntField(term287371, term287371.getClass(), "plateId", 0);
        setIntField(term287371, term287371.getClass(), "titleId", 0);
        setIntField(term287371, term287371.getClass(), "partnerId", 0);
        setIntField(term287371, term287371.getClass(), "frameId", 0);
        setIntField(term287371, term287371.getClass(), "selectMapId", 0);
        setIntField(term287371, term287371.getClass(), "totalAwake", 0);
        setIntField(term287371, term287371.getClass(), "gradeRating", 0);
        setIntField(term287371, term287371.getClass(), "musicRating", 0);
        setIntField(term287371, term287371.getClass(), "playerRating", 0);
        setIntField(term287371, term287371.getClass(), "highestRating", 0);
        setIntField(term287371, term287371.getClass(), "gradeRank", 0);
        setIntField(term287371, term287371.getClass(), "classRank", 0);
        setIntField(term287371, term287371.getClass(), "courseRank", 0);
        setField(term287371, term287371.getClass(), "charaSlot", null);
        setField(term287371, term287371.getClass(), "charaLockSlot", null);
        setLongField(term287371, term287371.getClass(), "contentBit", 0L);
        setIntField(term287371, term287371.getClass(), "playCount", 0);
        setField(term287371, term287371.getClass(), "eventWatchedDate", null);
        setField(term287371, term287371.getClass(), "lastGameId", null);
        setField(term287371, term287371.getClass(), "lastRomVersion", null);
        setField(term287371, term287371.getClass(), "lastDataVersion", null);
        setField(term287371, term287371.getClass(), "lastLoginDate", null);
        setField(term287371, term287371.getClass(), "lastPlayDate", null);
        setIntField(term287371, term287371.getClass(), "lastPlayCredit", 0);
        setIntField(term287371, term287371.getClass(), "lastPlayMode", 0);
        setIntField(term287371, term287371.getClass(), "lastPlaceId", 0);
        setField(term287371, term287371.getClass(), "lastPlaceName", null);
        setIntField(term287371, term287371.getClass(), "lastAllNetId", 0);
        setIntField(term287371, term287371.getClass(), "lastRegionId", 0);
        setField(term287371, term287371.getClass(), "lastRegionName", null);
        setField(term287371, term287371.getClass(), "lastClientId", null);
        setField(term287371, term287371.getClass(), "lastCountryCode", null);
        setIntField(term287371, term287371.getClass(), "lastSelectEMoney", 0);
        setIntField(term287371, term287371.getClass(), "lastSelectTicket", 0);
        setIntField(term287371, term287371.getClass(), "lastSelectCourse", 0);
        setIntField(term287371, term287371.getClass(), "lastCountCourse", 0);
        setField(term287371, term287371.getClass(), "firstGameId", null);
        setField(term287371, term287371.getClass(), "firstRomVersion", null);
        setField(term287371, term287371.getClass(), "firstDataVersion", null);
        setField(term287371, term287371.getClass(), "firstPlayDate", null);
        setField(term287371, term287371.getClass(), "compatibleCmVersion", null);
        setField(term287371, term287371.getClass(), "dailyBonusDate", null);
        setField(term287371, term287371.getClass(), "dailyCourseBonusDate", null);
        setField(term287371, term287371.getClass(), "lastPairLoginDate", null);
        setField(term287371, term287371.getClass(), "lastTrialPlayDate", null);
        setIntField(term287371, term287371.getClass(), "playVsCount", 0);
        setIntField(term287371, term287371.getClass(), "playSyncCount", 0);
        setIntField(term287371, term287371.getClass(), "winCount", 0);
        setIntField(term287371, term287371.getClass(), "helpCount", 0);
        setIntField(term287371, term287371.getClass(), "comboCount", 0);
        setLongField(term287371, term287371.getClass(), "totalDeluxscore", 0L);
        setLongField(term287371, term287371.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term287371, term287371.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term287371, term287371.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term287371, term287371.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term287371, term287371.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term287371, term287371.getClass(), "totalSync", 0);
        setIntField(term287371, term287371.getClass(), "totalBasicSync", 0);
        setIntField(term287371, term287371.getClass(), "totalAdvancedSync", 0);
        setIntField(term287371, term287371.getClass(), "totalExpertSync", 0);
        setIntField(term287371, term287371.getClass(), "totalMasterSync", 0);
        setIntField(term287371, term287371.getClass(), "totalReMasterSync", 0);
        setLongField(term287371, term287371.getClass(), "totalAchievement", 0L);
        setLongField(term287371, term287371.getClass(), "totalBasicAchievement", 0L);
        setLongField(term287371, term287371.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term287371, term287371.getClass(), "totalExpertAchievement", 0L);
        setLongField(term287371, term287371.getClass(), "totalMasterAchievement", 0L);
        setLongField(term287371, term287371.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term287371, term287371.getClass(), "playerOldRating", 0L);
        setLongField(term287371, term287371.getClass(), "playerNewRating", 0L);
        setIntField(term287371, term287371.getClass(), "banState", 0);
        setLongField(term287371, term287371.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEventWatchedDate", argTypes, term287371, args);
    }

};


