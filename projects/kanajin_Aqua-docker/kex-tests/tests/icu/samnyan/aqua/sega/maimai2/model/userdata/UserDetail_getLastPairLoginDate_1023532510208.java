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

public class UserDetail_getLastPairLoginDate_1023532510208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288801;

    public UserDetail_getLastPairLoginDate_1023532510208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288801 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term288801, term288801.getClass(), "id", 0L);
        setField(term288801, term288801.getClass(), "card", null);
        setField(term288801, term288801.getClass(), "userName", null);
        setIntField(term288801, term288801.getClass(), "isNetMember", 0);
        setIntField(term288801, term288801.getClass(), "iconId", 0);
        setIntField(term288801, term288801.getClass(), "plateId", 0);
        setIntField(term288801, term288801.getClass(), "titleId", 0);
        setIntField(term288801, term288801.getClass(), "partnerId", 0);
        setIntField(term288801, term288801.getClass(), "frameId", 0);
        setIntField(term288801, term288801.getClass(), "selectMapId", 0);
        setIntField(term288801, term288801.getClass(), "totalAwake", 0);
        setIntField(term288801, term288801.getClass(), "gradeRating", 0);
        setIntField(term288801, term288801.getClass(), "musicRating", 0);
        setIntField(term288801, term288801.getClass(), "playerRating", 0);
        setIntField(term288801, term288801.getClass(), "highestRating", 0);
        setIntField(term288801, term288801.getClass(), "gradeRank", 0);
        setIntField(term288801, term288801.getClass(), "classRank", 0);
        setIntField(term288801, term288801.getClass(), "courseRank", 0);
        setField(term288801, term288801.getClass(), "charaSlot", null);
        setField(term288801, term288801.getClass(), "charaLockSlot", null);
        setLongField(term288801, term288801.getClass(), "contentBit", 0L);
        setIntField(term288801, term288801.getClass(), "playCount", 0);
        setField(term288801, term288801.getClass(), "eventWatchedDate", null);
        setField(term288801, term288801.getClass(), "lastGameId", null);
        setField(term288801, term288801.getClass(), "lastRomVersion", null);
        setField(term288801, term288801.getClass(), "lastDataVersion", null);
        setField(term288801, term288801.getClass(), "lastLoginDate", null);
        setField(term288801, term288801.getClass(), "lastPlayDate", null);
        setIntField(term288801, term288801.getClass(), "lastPlayCredit", 0);
        setIntField(term288801, term288801.getClass(), "lastPlayMode", 0);
        setIntField(term288801, term288801.getClass(), "lastPlaceId", 0);
        setField(term288801, term288801.getClass(), "lastPlaceName", null);
        setIntField(term288801, term288801.getClass(), "lastAllNetId", 0);
        setIntField(term288801, term288801.getClass(), "lastRegionId", 0);
        setField(term288801, term288801.getClass(), "lastRegionName", null);
        setField(term288801, term288801.getClass(), "lastClientId", null);
        setField(term288801, term288801.getClass(), "lastCountryCode", null);
        setIntField(term288801, term288801.getClass(), "lastSelectEMoney", 0);
        setIntField(term288801, term288801.getClass(), "lastSelectTicket", 0);
        setIntField(term288801, term288801.getClass(), "lastSelectCourse", 0);
        setIntField(term288801, term288801.getClass(), "lastCountCourse", 0);
        setField(term288801, term288801.getClass(), "firstGameId", null);
        setField(term288801, term288801.getClass(), "firstRomVersion", null);
        setField(term288801, term288801.getClass(), "firstDataVersion", null);
        setField(term288801, term288801.getClass(), "firstPlayDate", null);
        setField(term288801, term288801.getClass(), "compatibleCmVersion", null);
        setField(term288801, term288801.getClass(), "dailyBonusDate", null);
        setField(term288801, term288801.getClass(), "dailyCourseBonusDate", null);
        setField(term288801, term288801.getClass(), "lastPairLoginDate", null);
        setField(term288801, term288801.getClass(), "lastTrialPlayDate", null);
        setIntField(term288801, term288801.getClass(), "playVsCount", 0);
        setIntField(term288801, term288801.getClass(), "playSyncCount", 0);
        setIntField(term288801, term288801.getClass(), "winCount", 0);
        setIntField(term288801, term288801.getClass(), "helpCount", 0);
        setIntField(term288801, term288801.getClass(), "comboCount", 0);
        setLongField(term288801, term288801.getClass(), "totalDeluxscore", 0L);
        setLongField(term288801, term288801.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term288801, term288801.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term288801, term288801.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term288801, term288801.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term288801, term288801.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term288801, term288801.getClass(), "totalSync", 0);
        setIntField(term288801, term288801.getClass(), "totalBasicSync", 0);
        setIntField(term288801, term288801.getClass(), "totalAdvancedSync", 0);
        setIntField(term288801, term288801.getClass(), "totalExpertSync", 0);
        setIntField(term288801, term288801.getClass(), "totalMasterSync", 0);
        setIntField(term288801, term288801.getClass(), "totalReMasterSync", 0);
        setLongField(term288801, term288801.getClass(), "totalAchievement", 0L);
        setLongField(term288801, term288801.getClass(), "totalBasicAchievement", 0L);
        setLongField(term288801, term288801.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term288801, term288801.getClass(), "totalExpertAchievement", 0L);
        setLongField(term288801, term288801.getClass(), "totalMasterAchievement", 0L);
        setLongField(term288801, term288801.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term288801, term288801.getClass(), "playerOldRating", 0L);
        setLongField(term288801, term288801.getClass(), "playerNewRating", 0L);
        setIntField(term288801, term288801.getClass(), "banState", 0);
        setLongField(term288801, term288801.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPairLoginDate", argTypes, term288801, args);
    }

};


