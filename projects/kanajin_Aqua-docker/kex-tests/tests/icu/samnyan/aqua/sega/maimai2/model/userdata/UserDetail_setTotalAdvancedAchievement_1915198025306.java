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
import java.lang.Long;

public class UserDetail_setTotalAdvancedAchievement_1915198025306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294283;
     Object term294338;

    public UserDetail_setTotalAdvancedAchievement_1915198025306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term294283 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term294283, term294283.getClass(), "id", 0L);
        setField(term294283, term294283.getClass(), "card", null);
        setField(term294283, term294283.getClass(), "userName", null);
        setIntField(term294283, term294283.getClass(), "isNetMember", 0);
        setIntField(term294283, term294283.getClass(), "iconId", 0);
        setIntField(term294283, term294283.getClass(), "plateId", 0);
        setIntField(term294283, term294283.getClass(), "titleId", 0);
        setIntField(term294283, term294283.getClass(), "partnerId", 0);
        setIntField(term294283, term294283.getClass(), "frameId", 0);
        setIntField(term294283, term294283.getClass(), "selectMapId", 0);
        setIntField(term294283, term294283.getClass(), "totalAwake", 0);
        setIntField(term294283, term294283.getClass(), "gradeRating", 0);
        setIntField(term294283, term294283.getClass(), "musicRating", 0);
        setIntField(term294283, term294283.getClass(), "playerRating", 0);
        setIntField(term294283, term294283.getClass(), "highestRating", 0);
        setIntField(term294283, term294283.getClass(), "gradeRank", 0);
        setIntField(term294283, term294283.getClass(), "classRank", 0);
        setIntField(term294283, term294283.getClass(), "courseRank", 0);
        setField(term294283, term294283.getClass(), "charaSlot", null);
        setField(term294283, term294283.getClass(), "charaLockSlot", null);
        setLongField(term294283, term294283.getClass(), "contentBit", 0L);
        setIntField(term294283, term294283.getClass(), "playCount", 0);
        setField(term294283, term294283.getClass(), "eventWatchedDate", null);
        setField(term294283, term294283.getClass(), "lastGameId", null);
        setField(term294283, term294283.getClass(), "lastRomVersion", null);
        setField(term294283, term294283.getClass(), "lastDataVersion", null);
        setField(term294283, term294283.getClass(), "lastLoginDate", null);
        setField(term294283, term294283.getClass(), "lastPlayDate", null);
        setIntField(term294283, term294283.getClass(), "lastPlayCredit", 0);
        setIntField(term294283, term294283.getClass(), "lastPlayMode", 0);
        setIntField(term294283, term294283.getClass(), "lastPlaceId", 0);
        setField(term294283, term294283.getClass(), "lastPlaceName", null);
        setIntField(term294283, term294283.getClass(), "lastAllNetId", 0);
        setIntField(term294283, term294283.getClass(), "lastRegionId", 0);
        setField(term294283, term294283.getClass(), "lastRegionName", null);
        setField(term294283, term294283.getClass(), "lastClientId", null);
        setField(term294283, term294283.getClass(), "lastCountryCode", null);
        setIntField(term294283, term294283.getClass(), "lastSelectEMoney", 0);
        setIntField(term294283, term294283.getClass(), "lastSelectTicket", 0);
        setIntField(term294283, term294283.getClass(), "lastSelectCourse", 0);
        setIntField(term294283, term294283.getClass(), "lastCountCourse", 0);
        setField(term294283, term294283.getClass(), "firstGameId", null);
        setField(term294283, term294283.getClass(), "firstRomVersion", null);
        setField(term294283, term294283.getClass(), "firstDataVersion", null);
        setField(term294283, term294283.getClass(), "firstPlayDate", null);
        setField(term294283, term294283.getClass(), "compatibleCmVersion", null);
        setField(term294283, term294283.getClass(), "dailyBonusDate", null);
        setField(term294283, term294283.getClass(), "dailyCourseBonusDate", null);
        setField(term294283, term294283.getClass(), "lastPairLoginDate", null);
        setField(term294283, term294283.getClass(), "lastTrialPlayDate", null);
        setIntField(term294283, term294283.getClass(), "playVsCount", 0);
        setIntField(term294283, term294283.getClass(), "playSyncCount", 0);
        setIntField(term294283, term294283.getClass(), "winCount", 0);
        setIntField(term294283, term294283.getClass(), "helpCount", 0);
        setIntField(term294283, term294283.getClass(), "comboCount", 0);
        setLongField(term294283, term294283.getClass(), "totalDeluxscore", 0L);
        setLongField(term294283, term294283.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term294283, term294283.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term294283, term294283.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term294283, term294283.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term294283, term294283.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term294283, term294283.getClass(), "totalSync", 0);
        setIntField(term294283, term294283.getClass(), "totalBasicSync", 0);
        setIntField(term294283, term294283.getClass(), "totalAdvancedSync", 0);
        setIntField(term294283, term294283.getClass(), "totalExpertSync", 0);
        setIntField(term294283, term294283.getClass(), "totalMasterSync", 0);
        setIntField(term294283, term294283.getClass(), "totalReMasterSync", 0);
        setLongField(term294283, term294283.getClass(), "totalAchievement", 0L);
        setLongField(term294283, term294283.getClass(), "totalBasicAchievement", 0L);
        setLongField(term294283, term294283.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term294283, term294283.getClass(), "totalExpertAchievement", 0L);
        setLongField(term294283, term294283.getClass(), "totalMasterAchievement", 0L);
        setLongField(term294283, term294283.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term294283, term294283.getClass(), "playerOldRating", 0L);
        setLongField(term294283, term294283.getClass(), "playerNewRating", 0L);
        setIntField(term294283, term294283.getClass(), "banState", 0);
        setLongField(term294283, term294283.getClass(), "dateTime", 0L);
        term294338 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term294338;
        callMethod(klass, "setTotalAdvancedAchievement", argTypes, term294283, args);
    }

};


