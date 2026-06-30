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

public class UserDetail_setLastDataVersion_102322257262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291807;

    public UserDetail_setLastDataVersion_102322257262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291807 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term291807, term291807.getClass(), "id", 0L);
        setField(term291807, term291807.getClass(), "card", null);
        setField(term291807, term291807.getClass(), "userName", null);
        setIntField(term291807, term291807.getClass(), "isNetMember", 0);
        setIntField(term291807, term291807.getClass(), "iconId", 0);
        setIntField(term291807, term291807.getClass(), "plateId", 0);
        setIntField(term291807, term291807.getClass(), "titleId", 0);
        setIntField(term291807, term291807.getClass(), "partnerId", 0);
        setIntField(term291807, term291807.getClass(), "frameId", 0);
        setIntField(term291807, term291807.getClass(), "selectMapId", 0);
        setIntField(term291807, term291807.getClass(), "totalAwake", 0);
        setIntField(term291807, term291807.getClass(), "gradeRating", 0);
        setIntField(term291807, term291807.getClass(), "musicRating", 0);
        setIntField(term291807, term291807.getClass(), "playerRating", 0);
        setIntField(term291807, term291807.getClass(), "highestRating", 0);
        setIntField(term291807, term291807.getClass(), "gradeRank", 0);
        setIntField(term291807, term291807.getClass(), "classRank", 0);
        setIntField(term291807, term291807.getClass(), "courseRank", 0);
        setField(term291807, term291807.getClass(), "charaSlot", null);
        setField(term291807, term291807.getClass(), "charaLockSlot", null);
        setLongField(term291807, term291807.getClass(), "contentBit", 0L);
        setIntField(term291807, term291807.getClass(), "playCount", 0);
        setField(term291807, term291807.getClass(), "eventWatchedDate", null);
        setField(term291807, term291807.getClass(), "lastGameId", null);
        setField(term291807, term291807.getClass(), "lastRomVersion", null);
        setField(term291807, term291807.getClass(), "lastDataVersion", null);
        setField(term291807, term291807.getClass(), "lastLoginDate", null);
        setField(term291807, term291807.getClass(), "lastPlayDate", null);
        setIntField(term291807, term291807.getClass(), "lastPlayCredit", 0);
        setIntField(term291807, term291807.getClass(), "lastPlayMode", 0);
        setIntField(term291807, term291807.getClass(), "lastPlaceId", 0);
        setField(term291807, term291807.getClass(), "lastPlaceName", null);
        setIntField(term291807, term291807.getClass(), "lastAllNetId", 0);
        setIntField(term291807, term291807.getClass(), "lastRegionId", 0);
        setField(term291807, term291807.getClass(), "lastRegionName", null);
        setField(term291807, term291807.getClass(), "lastClientId", null);
        setField(term291807, term291807.getClass(), "lastCountryCode", null);
        setIntField(term291807, term291807.getClass(), "lastSelectEMoney", 0);
        setIntField(term291807, term291807.getClass(), "lastSelectTicket", 0);
        setIntField(term291807, term291807.getClass(), "lastSelectCourse", 0);
        setIntField(term291807, term291807.getClass(), "lastCountCourse", 0);
        setField(term291807, term291807.getClass(), "firstGameId", null);
        setField(term291807, term291807.getClass(), "firstRomVersion", null);
        setField(term291807, term291807.getClass(), "firstDataVersion", null);
        setField(term291807, term291807.getClass(), "firstPlayDate", null);
        setField(term291807, term291807.getClass(), "compatibleCmVersion", null);
        setField(term291807, term291807.getClass(), "dailyBonusDate", null);
        setField(term291807, term291807.getClass(), "dailyCourseBonusDate", null);
        setField(term291807, term291807.getClass(), "lastPairLoginDate", null);
        setField(term291807, term291807.getClass(), "lastTrialPlayDate", null);
        setIntField(term291807, term291807.getClass(), "playVsCount", 0);
        setIntField(term291807, term291807.getClass(), "playSyncCount", 0);
        setIntField(term291807, term291807.getClass(), "winCount", 0);
        setIntField(term291807, term291807.getClass(), "helpCount", 0);
        setIntField(term291807, term291807.getClass(), "comboCount", 0);
        setLongField(term291807, term291807.getClass(), "totalDeluxscore", 0L);
        setLongField(term291807, term291807.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term291807, term291807.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term291807, term291807.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term291807, term291807.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term291807, term291807.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term291807, term291807.getClass(), "totalSync", 0);
        setIntField(term291807, term291807.getClass(), "totalBasicSync", 0);
        setIntField(term291807, term291807.getClass(), "totalAdvancedSync", 0);
        setIntField(term291807, term291807.getClass(), "totalExpertSync", 0);
        setIntField(term291807, term291807.getClass(), "totalMasterSync", 0);
        setIntField(term291807, term291807.getClass(), "totalReMasterSync", 0);
        setLongField(term291807, term291807.getClass(), "totalAchievement", 0L);
        setLongField(term291807, term291807.getClass(), "totalBasicAchievement", 0L);
        setLongField(term291807, term291807.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term291807, term291807.getClass(), "totalExpertAchievement", 0L);
        setLongField(term291807, term291807.getClass(), "totalMasterAchievement", 0L);
        setLongField(term291807, term291807.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term291807, term291807.getClass(), "playerOldRating", 0L);
        setLongField(term291807, term291807.getClass(), "playerNewRating", 0L);
        setIntField(term291807, term291807.getClass(), "banState", 0);
        setLongField(term291807, term291807.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastDataVersion", argTypes, term291807, args);
    }

};


