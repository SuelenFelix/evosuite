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

public class UserDetail_setId_1537850213237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290396;
     Object term290451;

    public UserDetail_setId_1537850213237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290396 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term290396, term290396.getClass(), "id", 0L);
        setField(term290396, term290396.getClass(), "card", null);
        setField(term290396, term290396.getClass(), "userName", null);
        setIntField(term290396, term290396.getClass(), "isNetMember", 0);
        setIntField(term290396, term290396.getClass(), "iconId", 0);
        setIntField(term290396, term290396.getClass(), "plateId", 0);
        setIntField(term290396, term290396.getClass(), "titleId", 0);
        setIntField(term290396, term290396.getClass(), "partnerId", 0);
        setIntField(term290396, term290396.getClass(), "frameId", 0);
        setIntField(term290396, term290396.getClass(), "selectMapId", 0);
        setIntField(term290396, term290396.getClass(), "totalAwake", 0);
        setIntField(term290396, term290396.getClass(), "gradeRating", 0);
        setIntField(term290396, term290396.getClass(), "musicRating", 0);
        setIntField(term290396, term290396.getClass(), "playerRating", 0);
        setIntField(term290396, term290396.getClass(), "highestRating", 0);
        setIntField(term290396, term290396.getClass(), "gradeRank", 0);
        setIntField(term290396, term290396.getClass(), "classRank", 0);
        setIntField(term290396, term290396.getClass(), "courseRank", 0);
        setField(term290396, term290396.getClass(), "charaSlot", null);
        setField(term290396, term290396.getClass(), "charaLockSlot", null);
        setLongField(term290396, term290396.getClass(), "contentBit", 0L);
        setIntField(term290396, term290396.getClass(), "playCount", 0);
        setField(term290396, term290396.getClass(), "eventWatchedDate", null);
        setField(term290396, term290396.getClass(), "lastGameId", null);
        setField(term290396, term290396.getClass(), "lastRomVersion", null);
        setField(term290396, term290396.getClass(), "lastDataVersion", null);
        setField(term290396, term290396.getClass(), "lastLoginDate", null);
        setField(term290396, term290396.getClass(), "lastPlayDate", null);
        setIntField(term290396, term290396.getClass(), "lastPlayCredit", 0);
        setIntField(term290396, term290396.getClass(), "lastPlayMode", 0);
        setIntField(term290396, term290396.getClass(), "lastPlaceId", 0);
        setField(term290396, term290396.getClass(), "lastPlaceName", null);
        setIntField(term290396, term290396.getClass(), "lastAllNetId", 0);
        setIntField(term290396, term290396.getClass(), "lastRegionId", 0);
        setField(term290396, term290396.getClass(), "lastRegionName", null);
        setField(term290396, term290396.getClass(), "lastClientId", null);
        setField(term290396, term290396.getClass(), "lastCountryCode", null);
        setIntField(term290396, term290396.getClass(), "lastSelectEMoney", 0);
        setIntField(term290396, term290396.getClass(), "lastSelectTicket", 0);
        setIntField(term290396, term290396.getClass(), "lastSelectCourse", 0);
        setIntField(term290396, term290396.getClass(), "lastCountCourse", 0);
        setField(term290396, term290396.getClass(), "firstGameId", null);
        setField(term290396, term290396.getClass(), "firstRomVersion", null);
        setField(term290396, term290396.getClass(), "firstDataVersion", null);
        setField(term290396, term290396.getClass(), "firstPlayDate", null);
        setField(term290396, term290396.getClass(), "compatibleCmVersion", null);
        setField(term290396, term290396.getClass(), "dailyBonusDate", null);
        setField(term290396, term290396.getClass(), "dailyCourseBonusDate", null);
        setField(term290396, term290396.getClass(), "lastPairLoginDate", null);
        setField(term290396, term290396.getClass(), "lastTrialPlayDate", null);
        setIntField(term290396, term290396.getClass(), "playVsCount", 0);
        setIntField(term290396, term290396.getClass(), "playSyncCount", 0);
        setIntField(term290396, term290396.getClass(), "winCount", 0);
        setIntField(term290396, term290396.getClass(), "helpCount", 0);
        setIntField(term290396, term290396.getClass(), "comboCount", 0);
        setLongField(term290396, term290396.getClass(), "totalDeluxscore", 0L);
        setLongField(term290396, term290396.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term290396, term290396.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term290396, term290396.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term290396, term290396.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term290396, term290396.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term290396, term290396.getClass(), "totalSync", 0);
        setIntField(term290396, term290396.getClass(), "totalBasicSync", 0);
        setIntField(term290396, term290396.getClass(), "totalAdvancedSync", 0);
        setIntField(term290396, term290396.getClass(), "totalExpertSync", 0);
        setIntField(term290396, term290396.getClass(), "totalMasterSync", 0);
        setIntField(term290396, term290396.getClass(), "totalReMasterSync", 0);
        setLongField(term290396, term290396.getClass(), "totalAchievement", 0L);
        setLongField(term290396, term290396.getClass(), "totalBasicAchievement", 0L);
        setLongField(term290396, term290396.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term290396, term290396.getClass(), "totalExpertAchievement", 0L);
        setLongField(term290396, term290396.getClass(), "totalMasterAchievement", 0L);
        setLongField(term290396, term290396.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term290396, term290396.getClass(), "playerOldRating", 0L);
        setLongField(term290396, term290396.getClass(), "playerNewRating", 0L);
        setIntField(term290396, term290396.getClass(), "banState", 0);
        setLongField(term290396, term290396.getClass(), "dateTime", 0L);
        term290451 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term290451;
        callMethod(klass, "setId", argTypes, term290396, args);
    }

};


