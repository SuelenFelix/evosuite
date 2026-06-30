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

public class UserDetail_getLastPlayMode_2092342091189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287756;

    public UserDetail_getLastPlayMode_2092342091189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287756 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term287756, term287756.getClass(), "id", 0L);
        setField(term287756, term287756.getClass(), "card", null);
        setField(term287756, term287756.getClass(), "userName", null);
        setIntField(term287756, term287756.getClass(), "isNetMember", 0);
        setIntField(term287756, term287756.getClass(), "iconId", 0);
        setIntField(term287756, term287756.getClass(), "plateId", 0);
        setIntField(term287756, term287756.getClass(), "titleId", 0);
        setIntField(term287756, term287756.getClass(), "partnerId", 0);
        setIntField(term287756, term287756.getClass(), "frameId", 0);
        setIntField(term287756, term287756.getClass(), "selectMapId", 0);
        setIntField(term287756, term287756.getClass(), "totalAwake", 0);
        setIntField(term287756, term287756.getClass(), "gradeRating", 0);
        setIntField(term287756, term287756.getClass(), "musicRating", 0);
        setIntField(term287756, term287756.getClass(), "playerRating", 0);
        setIntField(term287756, term287756.getClass(), "highestRating", 0);
        setIntField(term287756, term287756.getClass(), "gradeRank", 0);
        setIntField(term287756, term287756.getClass(), "classRank", 0);
        setIntField(term287756, term287756.getClass(), "courseRank", 0);
        setField(term287756, term287756.getClass(), "charaSlot", null);
        setField(term287756, term287756.getClass(), "charaLockSlot", null);
        setLongField(term287756, term287756.getClass(), "contentBit", 0L);
        setIntField(term287756, term287756.getClass(), "playCount", 0);
        setField(term287756, term287756.getClass(), "eventWatchedDate", null);
        setField(term287756, term287756.getClass(), "lastGameId", null);
        setField(term287756, term287756.getClass(), "lastRomVersion", null);
        setField(term287756, term287756.getClass(), "lastDataVersion", null);
        setField(term287756, term287756.getClass(), "lastLoginDate", null);
        setField(term287756, term287756.getClass(), "lastPlayDate", null);
        setIntField(term287756, term287756.getClass(), "lastPlayCredit", 0);
        setIntField(term287756, term287756.getClass(), "lastPlayMode", 0);
        setIntField(term287756, term287756.getClass(), "lastPlaceId", 0);
        setField(term287756, term287756.getClass(), "lastPlaceName", null);
        setIntField(term287756, term287756.getClass(), "lastAllNetId", 0);
        setIntField(term287756, term287756.getClass(), "lastRegionId", 0);
        setField(term287756, term287756.getClass(), "lastRegionName", null);
        setField(term287756, term287756.getClass(), "lastClientId", null);
        setField(term287756, term287756.getClass(), "lastCountryCode", null);
        setIntField(term287756, term287756.getClass(), "lastSelectEMoney", 0);
        setIntField(term287756, term287756.getClass(), "lastSelectTicket", 0);
        setIntField(term287756, term287756.getClass(), "lastSelectCourse", 0);
        setIntField(term287756, term287756.getClass(), "lastCountCourse", 0);
        setField(term287756, term287756.getClass(), "firstGameId", null);
        setField(term287756, term287756.getClass(), "firstRomVersion", null);
        setField(term287756, term287756.getClass(), "firstDataVersion", null);
        setField(term287756, term287756.getClass(), "firstPlayDate", null);
        setField(term287756, term287756.getClass(), "compatibleCmVersion", null);
        setField(term287756, term287756.getClass(), "dailyBonusDate", null);
        setField(term287756, term287756.getClass(), "dailyCourseBonusDate", null);
        setField(term287756, term287756.getClass(), "lastPairLoginDate", null);
        setField(term287756, term287756.getClass(), "lastTrialPlayDate", null);
        setIntField(term287756, term287756.getClass(), "playVsCount", 0);
        setIntField(term287756, term287756.getClass(), "playSyncCount", 0);
        setIntField(term287756, term287756.getClass(), "winCount", 0);
        setIntField(term287756, term287756.getClass(), "helpCount", 0);
        setIntField(term287756, term287756.getClass(), "comboCount", 0);
        setLongField(term287756, term287756.getClass(), "totalDeluxscore", 0L);
        setLongField(term287756, term287756.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term287756, term287756.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term287756, term287756.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term287756, term287756.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term287756, term287756.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term287756, term287756.getClass(), "totalSync", 0);
        setIntField(term287756, term287756.getClass(), "totalBasicSync", 0);
        setIntField(term287756, term287756.getClass(), "totalAdvancedSync", 0);
        setIntField(term287756, term287756.getClass(), "totalExpertSync", 0);
        setIntField(term287756, term287756.getClass(), "totalMasterSync", 0);
        setIntField(term287756, term287756.getClass(), "totalReMasterSync", 0);
        setLongField(term287756, term287756.getClass(), "totalAchievement", 0L);
        setLongField(term287756, term287756.getClass(), "totalBasicAchievement", 0L);
        setLongField(term287756, term287756.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term287756, term287756.getClass(), "totalExpertAchievement", 0L);
        setLongField(term287756, term287756.getClass(), "totalMasterAchievement", 0L);
        setLongField(term287756, term287756.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term287756, term287756.getClass(), "playerOldRating", 0L);
        setLongField(term287756, term287756.getClass(), "playerNewRating", 0L);
        setIntField(term287756, term287756.getClass(), "banState", 0);
        setLongField(term287756, term287756.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayMode", argTypes, term287756, args);
    }

};


