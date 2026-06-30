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

public class UserDetail_setTotalAdvancedDeluxscore_1643689350294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293599;
     Object term293654;

    public UserDetail_setTotalAdvancedDeluxscore_1643689350294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293599 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term293599, term293599.getClass(), "id", 0L);
        setField(term293599, term293599.getClass(), "card", null);
        setField(term293599, term293599.getClass(), "userName", null);
        setIntField(term293599, term293599.getClass(), "isNetMember", 0);
        setIntField(term293599, term293599.getClass(), "iconId", 0);
        setIntField(term293599, term293599.getClass(), "plateId", 0);
        setIntField(term293599, term293599.getClass(), "titleId", 0);
        setIntField(term293599, term293599.getClass(), "partnerId", 0);
        setIntField(term293599, term293599.getClass(), "frameId", 0);
        setIntField(term293599, term293599.getClass(), "selectMapId", 0);
        setIntField(term293599, term293599.getClass(), "totalAwake", 0);
        setIntField(term293599, term293599.getClass(), "gradeRating", 0);
        setIntField(term293599, term293599.getClass(), "musicRating", 0);
        setIntField(term293599, term293599.getClass(), "playerRating", 0);
        setIntField(term293599, term293599.getClass(), "highestRating", 0);
        setIntField(term293599, term293599.getClass(), "gradeRank", 0);
        setIntField(term293599, term293599.getClass(), "classRank", 0);
        setIntField(term293599, term293599.getClass(), "courseRank", 0);
        setField(term293599, term293599.getClass(), "charaSlot", null);
        setField(term293599, term293599.getClass(), "charaLockSlot", null);
        setLongField(term293599, term293599.getClass(), "contentBit", 0L);
        setIntField(term293599, term293599.getClass(), "playCount", 0);
        setField(term293599, term293599.getClass(), "eventWatchedDate", null);
        setField(term293599, term293599.getClass(), "lastGameId", null);
        setField(term293599, term293599.getClass(), "lastRomVersion", null);
        setField(term293599, term293599.getClass(), "lastDataVersion", null);
        setField(term293599, term293599.getClass(), "lastLoginDate", null);
        setField(term293599, term293599.getClass(), "lastPlayDate", null);
        setIntField(term293599, term293599.getClass(), "lastPlayCredit", 0);
        setIntField(term293599, term293599.getClass(), "lastPlayMode", 0);
        setIntField(term293599, term293599.getClass(), "lastPlaceId", 0);
        setField(term293599, term293599.getClass(), "lastPlaceName", null);
        setIntField(term293599, term293599.getClass(), "lastAllNetId", 0);
        setIntField(term293599, term293599.getClass(), "lastRegionId", 0);
        setField(term293599, term293599.getClass(), "lastRegionName", null);
        setField(term293599, term293599.getClass(), "lastClientId", null);
        setField(term293599, term293599.getClass(), "lastCountryCode", null);
        setIntField(term293599, term293599.getClass(), "lastSelectEMoney", 0);
        setIntField(term293599, term293599.getClass(), "lastSelectTicket", 0);
        setIntField(term293599, term293599.getClass(), "lastSelectCourse", 0);
        setIntField(term293599, term293599.getClass(), "lastCountCourse", 0);
        setField(term293599, term293599.getClass(), "firstGameId", null);
        setField(term293599, term293599.getClass(), "firstRomVersion", null);
        setField(term293599, term293599.getClass(), "firstDataVersion", null);
        setField(term293599, term293599.getClass(), "firstPlayDate", null);
        setField(term293599, term293599.getClass(), "compatibleCmVersion", null);
        setField(term293599, term293599.getClass(), "dailyBonusDate", null);
        setField(term293599, term293599.getClass(), "dailyCourseBonusDate", null);
        setField(term293599, term293599.getClass(), "lastPairLoginDate", null);
        setField(term293599, term293599.getClass(), "lastTrialPlayDate", null);
        setIntField(term293599, term293599.getClass(), "playVsCount", 0);
        setIntField(term293599, term293599.getClass(), "playSyncCount", 0);
        setIntField(term293599, term293599.getClass(), "winCount", 0);
        setIntField(term293599, term293599.getClass(), "helpCount", 0);
        setIntField(term293599, term293599.getClass(), "comboCount", 0);
        setLongField(term293599, term293599.getClass(), "totalDeluxscore", 0L);
        setLongField(term293599, term293599.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term293599, term293599.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term293599, term293599.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term293599, term293599.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term293599, term293599.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term293599, term293599.getClass(), "totalSync", 0);
        setIntField(term293599, term293599.getClass(), "totalBasicSync", 0);
        setIntField(term293599, term293599.getClass(), "totalAdvancedSync", 0);
        setIntField(term293599, term293599.getClass(), "totalExpertSync", 0);
        setIntField(term293599, term293599.getClass(), "totalMasterSync", 0);
        setIntField(term293599, term293599.getClass(), "totalReMasterSync", 0);
        setLongField(term293599, term293599.getClass(), "totalAchievement", 0L);
        setLongField(term293599, term293599.getClass(), "totalBasicAchievement", 0L);
        setLongField(term293599, term293599.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term293599, term293599.getClass(), "totalExpertAchievement", 0L);
        setLongField(term293599, term293599.getClass(), "totalMasterAchievement", 0L);
        setLongField(term293599, term293599.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term293599, term293599.getClass(), "playerOldRating", 0L);
        setLongField(term293599, term293599.getClass(), "playerNewRating", 0L);
        setIntField(term293599, term293599.getClass(), "banState", 0);
        setLongField(term293599, term293599.getClass(), "dateTime", 0L);
        term293654 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term293654;
        callMethod(klass, "setTotalAdvancedDeluxscore", argTypes, term293599, args);
    }

};


