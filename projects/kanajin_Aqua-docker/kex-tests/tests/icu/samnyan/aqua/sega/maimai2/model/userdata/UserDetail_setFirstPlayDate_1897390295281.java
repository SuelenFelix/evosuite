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

public class UserDetail_setFirstPlayDate_1897390295281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292870;

    public UserDetail_setFirstPlayDate_1897390295281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292870 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term292870, term292870.getClass(), "id", 0L);
        setField(term292870, term292870.getClass(), "card", null);
        setField(term292870, term292870.getClass(), "userName", null);
        setIntField(term292870, term292870.getClass(), "isNetMember", 0);
        setIntField(term292870, term292870.getClass(), "iconId", 0);
        setIntField(term292870, term292870.getClass(), "plateId", 0);
        setIntField(term292870, term292870.getClass(), "titleId", 0);
        setIntField(term292870, term292870.getClass(), "partnerId", 0);
        setIntField(term292870, term292870.getClass(), "frameId", 0);
        setIntField(term292870, term292870.getClass(), "selectMapId", 0);
        setIntField(term292870, term292870.getClass(), "totalAwake", 0);
        setIntField(term292870, term292870.getClass(), "gradeRating", 0);
        setIntField(term292870, term292870.getClass(), "musicRating", 0);
        setIntField(term292870, term292870.getClass(), "playerRating", 0);
        setIntField(term292870, term292870.getClass(), "highestRating", 0);
        setIntField(term292870, term292870.getClass(), "gradeRank", 0);
        setIntField(term292870, term292870.getClass(), "classRank", 0);
        setIntField(term292870, term292870.getClass(), "courseRank", 0);
        setField(term292870, term292870.getClass(), "charaSlot", null);
        setField(term292870, term292870.getClass(), "charaLockSlot", null);
        setLongField(term292870, term292870.getClass(), "contentBit", 0L);
        setIntField(term292870, term292870.getClass(), "playCount", 0);
        setField(term292870, term292870.getClass(), "eventWatchedDate", null);
        setField(term292870, term292870.getClass(), "lastGameId", null);
        setField(term292870, term292870.getClass(), "lastRomVersion", null);
        setField(term292870, term292870.getClass(), "lastDataVersion", null);
        setField(term292870, term292870.getClass(), "lastLoginDate", null);
        setField(term292870, term292870.getClass(), "lastPlayDate", null);
        setIntField(term292870, term292870.getClass(), "lastPlayCredit", 0);
        setIntField(term292870, term292870.getClass(), "lastPlayMode", 0);
        setIntField(term292870, term292870.getClass(), "lastPlaceId", 0);
        setField(term292870, term292870.getClass(), "lastPlaceName", null);
        setIntField(term292870, term292870.getClass(), "lastAllNetId", 0);
        setIntField(term292870, term292870.getClass(), "lastRegionId", 0);
        setField(term292870, term292870.getClass(), "lastRegionName", null);
        setField(term292870, term292870.getClass(), "lastClientId", null);
        setField(term292870, term292870.getClass(), "lastCountryCode", null);
        setIntField(term292870, term292870.getClass(), "lastSelectEMoney", 0);
        setIntField(term292870, term292870.getClass(), "lastSelectTicket", 0);
        setIntField(term292870, term292870.getClass(), "lastSelectCourse", 0);
        setIntField(term292870, term292870.getClass(), "lastCountCourse", 0);
        setField(term292870, term292870.getClass(), "firstGameId", null);
        setField(term292870, term292870.getClass(), "firstRomVersion", null);
        setField(term292870, term292870.getClass(), "firstDataVersion", null);
        setField(term292870, term292870.getClass(), "firstPlayDate", null);
        setField(term292870, term292870.getClass(), "compatibleCmVersion", null);
        setField(term292870, term292870.getClass(), "dailyBonusDate", null);
        setField(term292870, term292870.getClass(), "dailyCourseBonusDate", null);
        setField(term292870, term292870.getClass(), "lastPairLoginDate", null);
        setField(term292870, term292870.getClass(), "lastTrialPlayDate", null);
        setIntField(term292870, term292870.getClass(), "playVsCount", 0);
        setIntField(term292870, term292870.getClass(), "playSyncCount", 0);
        setIntField(term292870, term292870.getClass(), "winCount", 0);
        setIntField(term292870, term292870.getClass(), "helpCount", 0);
        setIntField(term292870, term292870.getClass(), "comboCount", 0);
        setLongField(term292870, term292870.getClass(), "totalDeluxscore", 0L);
        setLongField(term292870, term292870.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term292870, term292870.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term292870, term292870.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term292870, term292870.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term292870, term292870.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term292870, term292870.getClass(), "totalSync", 0);
        setIntField(term292870, term292870.getClass(), "totalBasicSync", 0);
        setIntField(term292870, term292870.getClass(), "totalAdvancedSync", 0);
        setIntField(term292870, term292870.getClass(), "totalExpertSync", 0);
        setIntField(term292870, term292870.getClass(), "totalMasterSync", 0);
        setIntField(term292870, term292870.getClass(), "totalReMasterSync", 0);
        setLongField(term292870, term292870.getClass(), "totalAchievement", 0L);
        setLongField(term292870, term292870.getClass(), "totalBasicAchievement", 0L);
        setLongField(term292870, term292870.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term292870, term292870.getClass(), "totalExpertAchievement", 0L);
        setLongField(term292870, term292870.getClass(), "totalMasterAchievement", 0L);
        setLongField(term292870, term292870.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term292870, term292870.getClass(), "playerOldRating", 0L);
        setLongField(term292870, term292870.getClass(), "playerNewRating", 0L);
        setIntField(term292870, term292870.getClass(), "banState", 0);
        setLongField(term292870, term292870.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFirstPlayDate", argTypes, term292870, args);
    }

};


