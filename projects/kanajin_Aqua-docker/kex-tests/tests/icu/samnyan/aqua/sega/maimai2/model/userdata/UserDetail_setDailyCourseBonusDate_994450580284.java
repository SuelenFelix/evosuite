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

public class UserDetail_setDailyCourseBonusDate_994450580284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293035;

    public UserDetail_setDailyCourseBonusDate_994450580284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293035 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term293035, term293035.getClass(), "id", 0L);
        setField(term293035, term293035.getClass(), "card", null);
        setField(term293035, term293035.getClass(), "userName", null);
        setIntField(term293035, term293035.getClass(), "isNetMember", 0);
        setIntField(term293035, term293035.getClass(), "iconId", 0);
        setIntField(term293035, term293035.getClass(), "plateId", 0);
        setIntField(term293035, term293035.getClass(), "titleId", 0);
        setIntField(term293035, term293035.getClass(), "partnerId", 0);
        setIntField(term293035, term293035.getClass(), "frameId", 0);
        setIntField(term293035, term293035.getClass(), "selectMapId", 0);
        setIntField(term293035, term293035.getClass(), "totalAwake", 0);
        setIntField(term293035, term293035.getClass(), "gradeRating", 0);
        setIntField(term293035, term293035.getClass(), "musicRating", 0);
        setIntField(term293035, term293035.getClass(), "playerRating", 0);
        setIntField(term293035, term293035.getClass(), "highestRating", 0);
        setIntField(term293035, term293035.getClass(), "gradeRank", 0);
        setIntField(term293035, term293035.getClass(), "classRank", 0);
        setIntField(term293035, term293035.getClass(), "courseRank", 0);
        setField(term293035, term293035.getClass(), "charaSlot", null);
        setField(term293035, term293035.getClass(), "charaLockSlot", null);
        setLongField(term293035, term293035.getClass(), "contentBit", 0L);
        setIntField(term293035, term293035.getClass(), "playCount", 0);
        setField(term293035, term293035.getClass(), "eventWatchedDate", null);
        setField(term293035, term293035.getClass(), "lastGameId", null);
        setField(term293035, term293035.getClass(), "lastRomVersion", null);
        setField(term293035, term293035.getClass(), "lastDataVersion", null);
        setField(term293035, term293035.getClass(), "lastLoginDate", null);
        setField(term293035, term293035.getClass(), "lastPlayDate", null);
        setIntField(term293035, term293035.getClass(), "lastPlayCredit", 0);
        setIntField(term293035, term293035.getClass(), "lastPlayMode", 0);
        setIntField(term293035, term293035.getClass(), "lastPlaceId", 0);
        setField(term293035, term293035.getClass(), "lastPlaceName", null);
        setIntField(term293035, term293035.getClass(), "lastAllNetId", 0);
        setIntField(term293035, term293035.getClass(), "lastRegionId", 0);
        setField(term293035, term293035.getClass(), "lastRegionName", null);
        setField(term293035, term293035.getClass(), "lastClientId", null);
        setField(term293035, term293035.getClass(), "lastCountryCode", null);
        setIntField(term293035, term293035.getClass(), "lastSelectEMoney", 0);
        setIntField(term293035, term293035.getClass(), "lastSelectTicket", 0);
        setIntField(term293035, term293035.getClass(), "lastSelectCourse", 0);
        setIntField(term293035, term293035.getClass(), "lastCountCourse", 0);
        setField(term293035, term293035.getClass(), "firstGameId", null);
        setField(term293035, term293035.getClass(), "firstRomVersion", null);
        setField(term293035, term293035.getClass(), "firstDataVersion", null);
        setField(term293035, term293035.getClass(), "firstPlayDate", null);
        setField(term293035, term293035.getClass(), "compatibleCmVersion", null);
        setField(term293035, term293035.getClass(), "dailyBonusDate", null);
        setField(term293035, term293035.getClass(), "dailyCourseBonusDate", null);
        setField(term293035, term293035.getClass(), "lastPairLoginDate", null);
        setField(term293035, term293035.getClass(), "lastTrialPlayDate", null);
        setIntField(term293035, term293035.getClass(), "playVsCount", 0);
        setIntField(term293035, term293035.getClass(), "playSyncCount", 0);
        setIntField(term293035, term293035.getClass(), "winCount", 0);
        setIntField(term293035, term293035.getClass(), "helpCount", 0);
        setIntField(term293035, term293035.getClass(), "comboCount", 0);
        setLongField(term293035, term293035.getClass(), "totalDeluxscore", 0L);
        setLongField(term293035, term293035.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term293035, term293035.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term293035, term293035.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term293035, term293035.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term293035, term293035.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term293035, term293035.getClass(), "totalSync", 0);
        setIntField(term293035, term293035.getClass(), "totalBasicSync", 0);
        setIntField(term293035, term293035.getClass(), "totalAdvancedSync", 0);
        setIntField(term293035, term293035.getClass(), "totalExpertSync", 0);
        setIntField(term293035, term293035.getClass(), "totalMasterSync", 0);
        setIntField(term293035, term293035.getClass(), "totalReMasterSync", 0);
        setLongField(term293035, term293035.getClass(), "totalAchievement", 0L);
        setLongField(term293035, term293035.getClass(), "totalBasicAchievement", 0L);
        setLongField(term293035, term293035.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term293035, term293035.getClass(), "totalExpertAchievement", 0L);
        setLongField(term293035, term293035.getClass(), "totalMasterAchievement", 0L);
        setLongField(term293035, term293035.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term293035, term293035.getClass(), "playerOldRating", 0L);
        setLongField(term293035, term293035.getClass(), "playerNewRating", 0L);
        setIntField(term293035, term293035.getClass(), "banState", 0);
        setLongField(term293035, term293035.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDailyCourseBonusDate", argTypes, term293035, args);
    }

};


