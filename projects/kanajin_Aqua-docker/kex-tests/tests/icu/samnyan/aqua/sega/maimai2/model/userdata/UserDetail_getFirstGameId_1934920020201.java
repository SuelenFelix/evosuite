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

public class UserDetail_getFirstGameId_1934920020201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288416;

    public UserDetail_getFirstGameId_1934920020201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288416 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term288416, term288416.getClass(), "id", 0L);
        setField(term288416, term288416.getClass(), "card", null);
        setField(term288416, term288416.getClass(), "userName", null);
        setIntField(term288416, term288416.getClass(), "isNetMember", 0);
        setIntField(term288416, term288416.getClass(), "iconId", 0);
        setIntField(term288416, term288416.getClass(), "plateId", 0);
        setIntField(term288416, term288416.getClass(), "titleId", 0);
        setIntField(term288416, term288416.getClass(), "partnerId", 0);
        setIntField(term288416, term288416.getClass(), "frameId", 0);
        setIntField(term288416, term288416.getClass(), "selectMapId", 0);
        setIntField(term288416, term288416.getClass(), "totalAwake", 0);
        setIntField(term288416, term288416.getClass(), "gradeRating", 0);
        setIntField(term288416, term288416.getClass(), "musicRating", 0);
        setIntField(term288416, term288416.getClass(), "playerRating", 0);
        setIntField(term288416, term288416.getClass(), "highestRating", 0);
        setIntField(term288416, term288416.getClass(), "gradeRank", 0);
        setIntField(term288416, term288416.getClass(), "classRank", 0);
        setIntField(term288416, term288416.getClass(), "courseRank", 0);
        setField(term288416, term288416.getClass(), "charaSlot", null);
        setField(term288416, term288416.getClass(), "charaLockSlot", null);
        setLongField(term288416, term288416.getClass(), "contentBit", 0L);
        setIntField(term288416, term288416.getClass(), "playCount", 0);
        setField(term288416, term288416.getClass(), "eventWatchedDate", null);
        setField(term288416, term288416.getClass(), "lastGameId", null);
        setField(term288416, term288416.getClass(), "lastRomVersion", null);
        setField(term288416, term288416.getClass(), "lastDataVersion", null);
        setField(term288416, term288416.getClass(), "lastLoginDate", null);
        setField(term288416, term288416.getClass(), "lastPlayDate", null);
        setIntField(term288416, term288416.getClass(), "lastPlayCredit", 0);
        setIntField(term288416, term288416.getClass(), "lastPlayMode", 0);
        setIntField(term288416, term288416.getClass(), "lastPlaceId", 0);
        setField(term288416, term288416.getClass(), "lastPlaceName", null);
        setIntField(term288416, term288416.getClass(), "lastAllNetId", 0);
        setIntField(term288416, term288416.getClass(), "lastRegionId", 0);
        setField(term288416, term288416.getClass(), "lastRegionName", null);
        setField(term288416, term288416.getClass(), "lastClientId", null);
        setField(term288416, term288416.getClass(), "lastCountryCode", null);
        setIntField(term288416, term288416.getClass(), "lastSelectEMoney", 0);
        setIntField(term288416, term288416.getClass(), "lastSelectTicket", 0);
        setIntField(term288416, term288416.getClass(), "lastSelectCourse", 0);
        setIntField(term288416, term288416.getClass(), "lastCountCourse", 0);
        setField(term288416, term288416.getClass(), "firstGameId", null);
        setField(term288416, term288416.getClass(), "firstRomVersion", null);
        setField(term288416, term288416.getClass(), "firstDataVersion", null);
        setField(term288416, term288416.getClass(), "firstPlayDate", null);
        setField(term288416, term288416.getClass(), "compatibleCmVersion", null);
        setField(term288416, term288416.getClass(), "dailyBonusDate", null);
        setField(term288416, term288416.getClass(), "dailyCourseBonusDate", null);
        setField(term288416, term288416.getClass(), "lastPairLoginDate", null);
        setField(term288416, term288416.getClass(), "lastTrialPlayDate", null);
        setIntField(term288416, term288416.getClass(), "playVsCount", 0);
        setIntField(term288416, term288416.getClass(), "playSyncCount", 0);
        setIntField(term288416, term288416.getClass(), "winCount", 0);
        setIntField(term288416, term288416.getClass(), "helpCount", 0);
        setIntField(term288416, term288416.getClass(), "comboCount", 0);
        setLongField(term288416, term288416.getClass(), "totalDeluxscore", 0L);
        setLongField(term288416, term288416.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term288416, term288416.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term288416, term288416.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term288416, term288416.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term288416, term288416.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term288416, term288416.getClass(), "totalSync", 0);
        setIntField(term288416, term288416.getClass(), "totalBasicSync", 0);
        setIntField(term288416, term288416.getClass(), "totalAdvancedSync", 0);
        setIntField(term288416, term288416.getClass(), "totalExpertSync", 0);
        setIntField(term288416, term288416.getClass(), "totalMasterSync", 0);
        setIntField(term288416, term288416.getClass(), "totalReMasterSync", 0);
        setLongField(term288416, term288416.getClass(), "totalAchievement", 0L);
        setLongField(term288416, term288416.getClass(), "totalBasicAchievement", 0L);
        setLongField(term288416, term288416.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term288416, term288416.getClass(), "totalExpertAchievement", 0L);
        setLongField(term288416, term288416.getClass(), "totalMasterAchievement", 0L);
        setLongField(term288416, term288416.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term288416, term288416.getClass(), "playerOldRating", 0L);
        setLongField(term288416, term288416.getClass(), "playerNewRating", 0L);
        setIntField(term288416, term288416.getClass(), "banState", 0);
        setLongField(term288416, term288416.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstGameId", argTypes, term288416, args);
    }

};


