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

public class UserDetail_setTotalMasterAchievement_426561655308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294397;
     Object term294452;

    public UserDetail_setTotalMasterAchievement_426561655308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term294397 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term294397, term294397.getClass(), "id", 0L);
        setField(term294397, term294397.getClass(), "card", null);
        setField(term294397, term294397.getClass(), "userName", null);
        setIntField(term294397, term294397.getClass(), "isNetMember", 0);
        setIntField(term294397, term294397.getClass(), "iconId", 0);
        setIntField(term294397, term294397.getClass(), "plateId", 0);
        setIntField(term294397, term294397.getClass(), "titleId", 0);
        setIntField(term294397, term294397.getClass(), "partnerId", 0);
        setIntField(term294397, term294397.getClass(), "frameId", 0);
        setIntField(term294397, term294397.getClass(), "selectMapId", 0);
        setIntField(term294397, term294397.getClass(), "totalAwake", 0);
        setIntField(term294397, term294397.getClass(), "gradeRating", 0);
        setIntField(term294397, term294397.getClass(), "musicRating", 0);
        setIntField(term294397, term294397.getClass(), "playerRating", 0);
        setIntField(term294397, term294397.getClass(), "highestRating", 0);
        setIntField(term294397, term294397.getClass(), "gradeRank", 0);
        setIntField(term294397, term294397.getClass(), "classRank", 0);
        setIntField(term294397, term294397.getClass(), "courseRank", 0);
        setField(term294397, term294397.getClass(), "charaSlot", null);
        setField(term294397, term294397.getClass(), "charaLockSlot", null);
        setLongField(term294397, term294397.getClass(), "contentBit", 0L);
        setIntField(term294397, term294397.getClass(), "playCount", 0);
        setField(term294397, term294397.getClass(), "eventWatchedDate", null);
        setField(term294397, term294397.getClass(), "lastGameId", null);
        setField(term294397, term294397.getClass(), "lastRomVersion", null);
        setField(term294397, term294397.getClass(), "lastDataVersion", null);
        setField(term294397, term294397.getClass(), "lastLoginDate", null);
        setField(term294397, term294397.getClass(), "lastPlayDate", null);
        setIntField(term294397, term294397.getClass(), "lastPlayCredit", 0);
        setIntField(term294397, term294397.getClass(), "lastPlayMode", 0);
        setIntField(term294397, term294397.getClass(), "lastPlaceId", 0);
        setField(term294397, term294397.getClass(), "lastPlaceName", null);
        setIntField(term294397, term294397.getClass(), "lastAllNetId", 0);
        setIntField(term294397, term294397.getClass(), "lastRegionId", 0);
        setField(term294397, term294397.getClass(), "lastRegionName", null);
        setField(term294397, term294397.getClass(), "lastClientId", null);
        setField(term294397, term294397.getClass(), "lastCountryCode", null);
        setIntField(term294397, term294397.getClass(), "lastSelectEMoney", 0);
        setIntField(term294397, term294397.getClass(), "lastSelectTicket", 0);
        setIntField(term294397, term294397.getClass(), "lastSelectCourse", 0);
        setIntField(term294397, term294397.getClass(), "lastCountCourse", 0);
        setField(term294397, term294397.getClass(), "firstGameId", null);
        setField(term294397, term294397.getClass(), "firstRomVersion", null);
        setField(term294397, term294397.getClass(), "firstDataVersion", null);
        setField(term294397, term294397.getClass(), "firstPlayDate", null);
        setField(term294397, term294397.getClass(), "compatibleCmVersion", null);
        setField(term294397, term294397.getClass(), "dailyBonusDate", null);
        setField(term294397, term294397.getClass(), "dailyCourseBonusDate", null);
        setField(term294397, term294397.getClass(), "lastPairLoginDate", null);
        setField(term294397, term294397.getClass(), "lastTrialPlayDate", null);
        setIntField(term294397, term294397.getClass(), "playVsCount", 0);
        setIntField(term294397, term294397.getClass(), "playSyncCount", 0);
        setIntField(term294397, term294397.getClass(), "winCount", 0);
        setIntField(term294397, term294397.getClass(), "helpCount", 0);
        setIntField(term294397, term294397.getClass(), "comboCount", 0);
        setLongField(term294397, term294397.getClass(), "totalDeluxscore", 0L);
        setLongField(term294397, term294397.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term294397, term294397.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term294397, term294397.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term294397, term294397.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term294397, term294397.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term294397, term294397.getClass(), "totalSync", 0);
        setIntField(term294397, term294397.getClass(), "totalBasicSync", 0);
        setIntField(term294397, term294397.getClass(), "totalAdvancedSync", 0);
        setIntField(term294397, term294397.getClass(), "totalExpertSync", 0);
        setIntField(term294397, term294397.getClass(), "totalMasterSync", 0);
        setIntField(term294397, term294397.getClass(), "totalReMasterSync", 0);
        setLongField(term294397, term294397.getClass(), "totalAchievement", 0L);
        setLongField(term294397, term294397.getClass(), "totalBasicAchievement", 0L);
        setLongField(term294397, term294397.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term294397, term294397.getClass(), "totalExpertAchievement", 0L);
        setLongField(term294397, term294397.getClass(), "totalMasterAchievement", 0L);
        setLongField(term294397, term294397.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term294397, term294397.getClass(), "playerOldRating", 0L);
        setLongField(term294397, term294397.getClass(), "playerNewRating", 0L);
        setIntField(term294397, term294397.getClass(), "banState", 0);
        setLongField(term294397, term294397.getClass(), "dateTime", 0L);
        term294452 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term294452;
        callMethod(klass, "setTotalMasterAchievement", argTypes, term294397, args);
    }

};


