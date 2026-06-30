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

public class UserDetail_setPlayerOldRating_789141119310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294511;
     Object term294566;

    public UserDetail_setPlayerOldRating_789141119310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term294511 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term294511, term294511.getClass(), "id", 0L);
        setField(term294511, term294511.getClass(), "card", null);
        setField(term294511, term294511.getClass(), "userName", null);
        setIntField(term294511, term294511.getClass(), "isNetMember", 0);
        setIntField(term294511, term294511.getClass(), "iconId", 0);
        setIntField(term294511, term294511.getClass(), "plateId", 0);
        setIntField(term294511, term294511.getClass(), "titleId", 0);
        setIntField(term294511, term294511.getClass(), "partnerId", 0);
        setIntField(term294511, term294511.getClass(), "frameId", 0);
        setIntField(term294511, term294511.getClass(), "selectMapId", 0);
        setIntField(term294511, term294511.getClass(), "totalAwake", 0);
        setIntField(term294511, term294511.getClass(), "gradeRating", 0);
        setIntField(term294511, term294511.getClass(), "musicRating", 0);
        setIntField(term294511, term294511.getClass(), "playerRating", 0);
        setIntField(term294511, term294511.getClass(), "highestRating", 0);
        setIntField(term294511, term294511.getClass(), "gradeRank", 0);
        setIntField(term294511, term294511.getClass(), "classRank", 0);
        setIntField(term294511, term294511.getClass(), "courseRank", 0);
        setField(term294511, term294511.getClass(), "charaSlot", null);
        setField(term294511, term294511.getClass(), "charaLockSlot", null);
        setLongField(term294511, term294511.getClass(), "contentBit", 0L);
        setIntField(term294511, term294511.getClass(), "playCount", 0);
        setField(term294511, term294511.getClass(), "eventWatchedDate", null);
        setField(term294511, term294511.getClass(), "lastGameId", null);
        setField(term294511, term294511.getClass(), "lastRomVersion", null);
        setField(term294511, term294511.getClass(), "lastDataVersion", null);
        setField(term294511, term294511.getClass(), "lastLoginDate", null);
        setField(term294511, term294511.getClass(), "lastPlayDate", null);
        setIntField(term294511, term294511.getClass(), "lastPlayCredit", 0);
        setIntField(term294511, term294511.getClass(), "lastPlayMode", 0);
        setIntField(term294511, term294511.getClass(), "lastPlaceId", 0);
        setField(term294511, term294511.getClass(), "lastPlaceName", null);
        setIntField(term294511, term294511.getClass(), "lastAllNetId", 0);
        setIntField(term294511, term294511.getClass(), "lastRegionId", 0);
        setField(term294511, term294511.getClass(), "lastRegionName", null);
        setField(term294511, term294511.getClass(), "lastClientId", null);
        setField(term294511, term294511.getClass(), "lastCountryCode", null);
        setIntField(term294511, term294511.getClass(), "lastSelectEMoney", 0);
        setIntField(term294511, term294511.getClass(), "lastSelectTicket", 0);
        setIntField(term294511, term294511.getClass(), "lastSelectCourse", 0);
        setIntField(term294511, term294511.getClass(), "lastCountCourse", 0);
        setField(term294511, term294511.getClass(), "firstGameId", null);
        setField(term294511, term294511.getClass(), "firstRomVersion", null);
        setField(term294511, term294511.getClass(), "firstDataVersion", null);
        setField(term294511, term294511.getClass(), "firstPlayDate", null);
        setField(term294511, term294511.getClass(), "compatibleCmVersion", null);
        setField(term294511, term294511.getClass(), "dailyBonusDate", null);
        setField(term294511, term294511.getClass(), "dailyCourseBonusDate", null);
        setField(term294511, term294511.getClass(), "lastPairLoginDate", null);
        setField(term294511, term294511.getClass(), "lastTrialPlayDate", null);
        setIntField(term294511, term294511.getClass(), "playVsCount", 0);
        setIntField(term294511, term294511.getClass(), "playSyncCount", 0);
        setIntField(term294511, term294511.getClass(), "winCount", 0);
        setIntField(term294511, term294511.getClass(), "helpCount", 0);
        setIntField(term294511, term294511.getClass(), "comboCount", 0);
        setLongField(term294511, term294511.getClass(), "totalDeluxscore", 0L);
        setLongField(term294511, term294511.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term294511, term294511.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term294511, term294511.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term294511, term294511.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term294511, term294511.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term294511, term294511.getClass(), "totalSync", 0);
        setIntField(term294511, term294511.getClass(), "totalBasicSync", 0);
        setIntField(term294511, term294511.getClass(), "totalAdvancedSync", 0);
        setIntField(term294511, term294511.getClass(), "totalExpertSync", 0);
        setIntField(term294511, term294511.getClass(), "totalMasterSync", 0);
        setIntField(term294511, term294511.getClass(), "totalReMasterSync", 0);
        setLongField(term294511, term294511.getClass(), "totalAchievement", 0L);
        setLongField(term294511, term294511.getClass(), "totalBasicAchievement", 0L);
        setLongField(term294511, term294511.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term294511, term294511.getClass(), "totalExpertAchievement", 0L);
        setLongField(term294511, term294511.getClass(), "totalMasterAchievement", 0L);
        setLongField(term294511, term294511.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term294511, term294511.getClass(), "playerOldRating", 0L);
        setLongField(term294511, term294511.getClass(), "playerNewRating", 0L);
        setIntField(term294511, term294511.getClass(), "banState", 0);
        setLongField(term294511, term294511.getClass(), "dateTime", 0L);
        term294566 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term294566;
        callMethod(klass, "setPlayerOldRating", argTypes, term294511, args);
    }

};


