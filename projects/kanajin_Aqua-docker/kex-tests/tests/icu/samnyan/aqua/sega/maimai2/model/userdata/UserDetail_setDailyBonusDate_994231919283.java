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

public class UserDetail_setDailyBonusDate_994231919283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292980;

    public UserDetail_setDailyBonusDate_994231919283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292980 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term292980, term292980.getClass(), "id", 0L);
        setField(term292980, term292980.getClass(), "card", null);
        setField(term292980, term292980.getClass(), "userName", null);
        setIntField(term292980, term292980.getClass(), "isNetMember", 0);
        setIntField(term292980, term292980.getClass(), "iconId", 0);
        setIntField(term292980, term292980.getClass(), "plateId", 0);
        setIntField(term292980, term292980.getClass(), "titleId", 0);
        setIntField(term292980, term292980.getClass(), "partnerId", 0);
        setIntField(term292980, term292980.getClass(), "frameId", 0);
        setIntField(term292980, term292980.getClass(), "selectMapId", 0);
        setIntField(term292980, term292980.getClass(), "totalAwake", 0);
        setIntField(term292980, term292980.getClass(), "gradeRating", 0);
        setIntField(term292980, term292980.getClass(), "musicRating", 0);
        setIntField(term292980, term292980.getClass(), "playerRating", 0);
        setIntField(term292980, term292980.getClass(), "highestRating", 0);
        setIntField(term292980, term292980.getClass(), "gradeRank", 0);
        setIntField(term292980, term292980.getClass(), "classRank", 0);
        setIntField(term292980, term292980.getClass(), "courseRank", 0);
        setField(term292980, term292980.getClass(), "charaSlot", null);
        setField(term292980, term292980.getClass(), "charaLockSlot", null);
        setLongField(term292980, term292980.getClass(), "contentBit", 0L);
        setIntField(term292980, term292980.getClass(), "playCount", 0);
        setField(term292980, term292980.getClass(), "eventWatchedDate", null);
        setField(term292980, term292980.getClass(), "lastGameId", null);
        setField(term292980, term292980.getClass(), "lastRomVersion", null);
        setField(term292980, term292980.getClass(), "lastDataVersion", null);
        setField(term292980, term292980.getClass(), "lastLoginDate", null);
        setField(term292980, term292980.getClass(), "lastPlayDate", null);
        setIntField(term292980, term292980.getClass(), "lastPlayCredit", 0);
        setIntField(term292980, term292980.getClass(), "lastPlayMode", 0);
        setIntField(term292980, term292980.getClass(), "lastPlaceId", 0);
        setField(term292980, term292980.getClass(), "lastPlaceName", null);
        setIntField(term292980, term292980.getClass(), "lastAllNetId", 0);
        setIntField(term292980, term292980.getClass(), "lastRegionId", 0);
        setField(term292980, term292980.getClass(), "lastRegionName", null);
        setField(term292980, term292980.getClass(), "lastClientId", null);
        setField(term292980, term292980.getClass(), "lastCountryCode", null);
        setIntField(term292980, term292980.getClass(), "lastSelectEMoney", 0);
        setIntField(term292980, term292980.getClass(), "lastSelectTicket", 0);
        setIntField(term292980, term292980.getClass(), "lastSelectCourse", 0);
        setIntField(term292980, term292980.getClass(), "lastCountCourse", 0);
        setField(term292980, term292980.getClass(), "firstGameId", null);
        setField(term292980, term292980.getClass(), "firstRomVersion", null);
        setField(term292980, term292980.getClass(), "firstDataVersion", null);
        setField(term292980, term292980.getClass(), "firstPlayDate", null);
        setField(term292980, term292980.getClass(), "compatibleCmVersion", null);
        setField(term292980, term292980.getClass(), "dailyBonusDate", null);
        setField(term292980, term292980.getClass(), "dailyCourseBonusDate", null);
        setField(term292980, term292980.getClass(), "lastPairLoginDate", null);
        setField(term292980, term292980.getClass(), "lastTrialPlayDate", null);
        setIntField(term292980, term292980.getClass(), "playVsCount", 0);
        setIntField(term292980, term292980.getClass(), "playSyncCount", 0);
        setIntField(term292980, term292980.getClass(), "winCount", 0);
        setIntField(term292980, term292980.getClass(), "helpCount", 0);
        setIntField(term292980, term292980.getClass(), "comboCount", 0);
        setLongField(term292980, term292980.getClass(), "totalDeluxscore", 0L);
        setLongField(term292980, term292980.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term292980, term292980.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term292980, term292980.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term292980, term292980.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term292980, term292980.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term292980, term292980.getClass(), "totalSync", 0);
        setIntField(term292980, term292980.getClass(), "totalBasicSync", 0);
        setIntField(term292980, term292980.getClass(), "totalAdvancedSync", 0);
        setIntField(term292980, term292980.getClass(), "totalExpertSync", 0);
        setIntField(term292980, term292980.getClass(), "totalMasterSync", 0);
        setIntField(term292980, term292980.getClass(), "totalReMasterSync", 0);
        setLongField(term292980, term292980.getClass(), "totalAchievement", 0L);
        setLongField(term292980, term292980.getClass(), "totalBasicAchievement", 0L);
        setLongField(term292980, term292980.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term292980, term292980.getClass(), "totalExpertAchievement", 0L);
        setLongField(term292980, term292980.getClass(), "totalMasterAchievement", 0L);
        setLongField(term292980, term292980.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term292980, term292980.getClass(), "playerOldRating", 0L);
        setLongField(term292980, term292980.getClass(), "playerNewRating", 0L);
        setIntField(term292980, term292980.getClass(), "banState", 0);
        setLongField(term292980, term292980.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDailyBonusDate", argTypes, term292980, args);
    }

};


