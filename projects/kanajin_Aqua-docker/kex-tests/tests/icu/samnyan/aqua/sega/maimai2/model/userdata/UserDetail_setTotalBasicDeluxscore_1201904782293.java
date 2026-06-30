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

public class UserDetail_setTotalBasicDeluxscore_1201904782293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293542;
     Object term293597;

    public UserDetail_setTotalBasicDeluxscore_1201904782293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293542 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term293542, term293542.getClass(), "id", 0L);
        setField(term293542, term293542.getClass(), "card", null);
        setField(term293542, term293542.getClass(), "userName", null);
        setIntField(term293542, term293542.getClass(), "isNetMember", 0);
        setIntField(term293542, term293542.getClass(), "iconId", 0);
        setIntField(term293542, term293542.getClass(), "plateId", 0);
        setIntField(term293542, term293542.getClass(), "titleId", 0);
        setIntField(term293542, term293542.getClass(), "partnerId", 0);
        setIntField(term293542, term293542.getClass(), "frameId", 0);
        setIntField(term293542, term293542.getClass(), "selectMapId", 0);
        setIntField(term293542, term293542.getClass(), "totalAwake", 0);
        setIntField(term293542, term293542.getClass(), "gradeRating", 0);
        setIntField(term293542, term293542.getClass(), "musicRating", 0);
        setIntField(term293542, term293542.getClass(), "playerRating", 0);
        setIntField(term293542, term293542.getClass(), "highestRating", 0);
        setIntField(term293542, term293542.getClass(), "gradeRank", 0);
        setIntField(term293542, term293542.getClass(), "classRank", 0);
        setIntField(term293542, term293542.getClass(), "courseRank", 0);
        setField(term293542, term293542.getClass(), "charaSlot", null);
        setField(term293542, term293542.getClass(), "charaLockSlot", null);
        setLongField(term293542, term293542.getClass(), "contentBit", 0L);
        setIntField(term293542, term293542.getClass(), "playCount", 0);
        setField(term293542, term293542.getClass(), "eventWatchedDate", null);
        setField(term293542, term293542.getClass(), "lastGameId", null);
        setField(term293542, term293542.getClass(), "lastRomVersion", null);
        setField(term293542, term293542.getClass(), "lastDataVersion", null);
        setField(term293542, term293542.getClass(), "lastLoginDate", null);
        setField(term293542, term293542.getClass(), "lastPlayDate", null);
        setIntField(term293542, term293542.getClass(), "lastPlayCredit", 0);
        setIntField(term293542, term293542.getClass(), "lastPlayMode", 0);
        setIntField(term293542, term293542.getClass(), "lastPlaceId", 0);
        setField(term293542, term293542.getClass(), "lastPlaceName", null);
        setIntField(term293542, term293542.getClass(), "lastAllNetId", 0);
        setIntField(term293542, term293542.getClass(), "lastRegionId", 0);
        setField(term293542, term293542.getClass(), "lastRegionName", null);
        setField(term293542, term293542.getClass(), "lastClientId", null);
        setField(term293542, term293542.getClass(), "lastCountryCode", null);
        setIntField(term293542, term293542.getClass(), "lastSelectEMoney", 0);
        setIntField(term293542, term293542.getClass(), "lastSelectTicket", 0);
        setIntField(term293542, term293542.getClass(), "lastSelectCourse", 0);
        setIntField(term293542, term293542.getClass(), "lastCountCourse", 0);
        setField(term293542, term293542.getClass(), "firstGameId", null);
        setField(term293542, term293542.getClass(), "firstRomVersion", null);
        setField(term293542, term293542.getClass(), "firstDataVersion", null);
        setField(term293542, term293542.getClass(), "firstPlayDate", null);
        setField(term293542, term293542.getClass(), "compatibleCmVersion", null);
        setField(term293542, term293542.getClass(), "dailyBonusDate", null);
        setField(term293542, term293542.getClass(), "dailyCourseBonusDate", null);
        setField(term293542, term293542.getClass(), "lastPairLoginDate", null);
        setField(term293542, term293542.getClass(), "lastTrialPlayDate", null);
        setIntField(term293542, term293542.getClass(), "playVsCount", 0);
        setIntField(term293542, term293542.getClass(), "playSyncCount", 0);
        setIntField(term293542, term293542.getClass(), "winCount", 0);
        setIntField(term293542, term293542.getClass(), "helpCount", 0);
        setIntField(term293542, term293542.getClass(), "comboCount", 0);
        setLongField(term293542, term293542.getClass(), "totalDeluxscore", 0L);
        setLongField(term293542, term293542.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term293542, term293542.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term293542, term293542.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term293542, term293542.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term293542, term293542.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term293542, term293542.getClass(), "totalSync", 0);
        setIntField(term293542, term293542.getClass(), "totalBasicSync", 0);
        setIntField(term293542, term293542.getClass(), "totalAdvancedSync", 0);
        setIntField(term293542, term293542.getClass(), "totalExpertSync", 0);
        setIntField(term293542, term293542.getClass(), "totalMasterSync", 0);
        setIntField(term293542, term293542.getClass(), "totalReMasterSync", 0);
        setLongField(term293542, term293542.getClass(), "totalAchievement", 0L);
        setLongField(term293542, term293542.getClass(), "totalBasicAchievement", 0L);
        setLongField(term293542, term293542.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term293542, term293542.getClass(), "totalExpertAchievement", 0L);
        setLongField(term293542, term293542.getClass(), "totalMasterAchievement", 0L);
        setLongField(term293542, term293542.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term293542, term293542.getClass(), "playerOldRating", 0L);
        setLongField(term293542, term293542.getClass(), "playerNewRating", 0L);
        setIntField(term293542, term293542.getClass(), "banState", 0);
        setLongField(term293542, term293542.getClass(), "dateTime", 0L);
        term293597 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term293597;
        callMethod(klass, "setTotalBasicDeluxscore", argTypes, term293542, args);
    }

};


