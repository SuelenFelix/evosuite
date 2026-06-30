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

public class UserDetail_setTotalDeluxscore_1672568388292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293485;
     Object term293540;

    public UserDetail_setTotalDeluxscore_1672568388292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293485 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term293485, term293485.getClass(), "id", 0L);
        setField(term293485, term293485.getClass(), "card", null);
        setField(term293485, term293485.getClass(), "userName", null);
        setIntField(term293485, term293485.getClass(), "isNetMember", 0);
        setIntField(term293485, term293485.getClass(), "iconId", 0);
        setIntField(term293485, term293485.getClass(), "plateId", 0);
        setIntField(term293485, term293485.getClass(), "titleId", 0);
        setIntField(term293485, term293485.getClass(), "partnerId", 0);
        setIntField(term293485, term293485.getClass(), "frameId", 0);
        setIntField(term293485, term293485.getClass(), "selectMapId", 0);
        setIntField(term293485, term293485.getClass(), "totalAwake", 0);
        setIntField(term293485, term293485.getClass(), "gradeRating", 0);
        setIntField(term293485, term293485.getClass(), "musicRating", 0);
        setIntField(term293485, term293485.getClass(), "playerRating", 0);
        setIntField(term293485, term293485.getClass(), "highestRating", 0);
        setIntField(term293485, term293485.getClass(), "gradeRank", 0);
        setIntField(term293485, term293485.getClass(), "classRank", 0);
        setIntField(term293485, term293485.getClass(), "courseRank", 0);
        setField(term293485, term293485.getClass(), "charaSlot", null);
        setField(term293485, term293485.getClass(), "charaLockSlot", null);
        setLongField(term293485, term293485.getClass(), "contentBit", 0L);
        setIntField(term293485, term293485.getClass(), "playCount", 0);
        setField(term293485, term293485.getClass(), "eventWatchedDate", null);
        setField(term293485, term293485.getClass(), "lastGameId", null);
        setField(term293485, term293485.getClass(), "lastRomVersion", null);
        setField(term293485, term293485.getClass(), "lastDataVersion", null);
        setField(term293485, term293485.getClass(), "lastLoginDate", null);
        setField(term293485, term293485.getClass(), "lastPlayDate", null);
        setIntField(term293485, term293485.getClass(), "lastPlayCredit", 0);
        setIntField(term293485, term293485.getClass(), "lastPlayMode", 0);
        setIntField(term293485, term293485.getClass(), "lastPlaceId", 0);
        setField(term293485, term293485.getClass(), "lastPlaceName", null);
        setIntField(term293485, term293485.getClass(), "lastAllNetId", 0);
        setIntField(term293485, term293485.getClass(), "lastRegionId", 0);
        setField(term293485, term293485.getClass(), "lastRegionName", null);
        setField(term293485, term293485.getClass(), "lastClientId", null);
        setField(term293485, term293485.getClass(), "lastCountryCode", null);
        setIntField(term293485, term293485.getClass(), "lastSelectEMoney", 0);
        setIntField(term293485, term293485.getClass(), "lastSelectTicket", 0);
        setIntField(term293485, term293485.getClass(), "lastSelectCourse", 0);
        setIntField(term293485, term293485.getClass(), "lastCountCourse", 0);
        setField(term293485, term293485.getClass(), "firstGameId", null);
        setField(term293485, term293485.getClass(), "firstRomVersion", null);
        setField(term293485, term293485.getClass(), "firstDataVersion", null);
        setField(term293485, term293485.getClass(), "firstPlayDate", null);
        setField(term293485, term293485.getClass(), "compatibleCmVersion", null);
        setField(term293485, term293485.getClass(), "dailyBonusDate", null);
        setField(term293485, term293485.getClass(), "dailyCourseBonusDate", null);
        setField(term293485, term293485.getClass(), "lastPairLoginDate", null);
        setField(term293485, term293485.getClass(), "lastTrialPlayDate", null);
        setIntField(term293485, term293485.getClass(), "playVsCount", 0);
        setIntField(term293485, term293485.getClass(), "playSyncCount", 0);
        setIntField(term293485, term293485.getClass(), "winCount", 0);
        setIntField(term293485, term293485.getClass(), "helpCount", 0);
        setIntField(term293485, term293485.getClass(), "comboCount", 0);
        setLongField(term293485, term293485.getClass(), "totalDeluxscore", 0L);
        setLongField(term293485, term293485.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term293485, term293485.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term293485, term293485.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term293485, term293485.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term293485, term293485.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term293485, term293485.getClass(), "totalSync", 0);
        setIntField(term293485, term293485.getClass(), "totalBasicSync", 0);
        setIntField(term293485, term293485.getClass(), "totalAdvancedSync", 0);
        setIntField(term293485, term293485.getClass(), "totalExpertSync", 0);
        setIntField(term293485, term293485.getClass(), "totalMasterSync", 0);
        setIntField(term293485, term293485.getClass(), "totalReMasterSync", 0);
        setLongField(term293485, term293485.getClass(), "totalAchievement", 0L);
        setLongField(term293485, term293485.getClass(), "totalBasicAchievement", 0L);
        setLongField(term293485, term293485.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term293485, term293485.getClass(), "totalExpertAchievement", 0L);
        setLongField(term293485, term293485.getClass(), "totalMasterAchievement", 0L);
        setLongField(term293485, term293485.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term293485, term293485.getClass(), "playerOldRating", 0L);
        setLongField(term293485, term293485.getClass(), "playerNewRating", 0L);
        setIntField(term293485, term293485.getClass(), "banState", 0);
        setLongField(term293485, term293485.getClass(), "dateTime", 0L);
        term293540 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term293540;
        callMethod(klass, "setTotalDeluxscore", argTypes, term293485, args);
    }

};


