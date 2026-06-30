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

public class UserDetail_getPlayerOldRating_1396436309233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290176;

    public UserDetail_getPlayerOldRating_1396436309233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290176 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term290176, term290176.getClass(), "id", 0L);
        setField(term290176, term290176.getClass(), "card", null);
        setField(term290176, term290176.getClass(), "userName", null);
        setIntField(term290176, term290176.getClass(), "isNetMember", 0);
        setIntField(term290176, term290176.getClass(), "iconId", 0);
        setIntField(term290176, term290176.getClass(), "plateId", 0);
        setIntField(term290176, term290176.getClass(), "titleId", 0);
        setIntField(term290176, term290176.getClass(), "partnerId", 0);
        setIntField(term290176, term290176.getClass(), "frameId", 0);
        setIntField(term290176, term290176.getClass(), "selectMapId", 0);
        setIntField(term290176, term290176.getClass(), "totalAwake", 0);
        setIntField(term290176, term290176.getClass(), "gradeRating", 0);
        setIntField(term290176, term290176.getClass(), "musicRating", 0);
        setIntField(term290176, term290176.getClass(), "playerRating", 0);
        setIntField(term290176, term290176.getClass(), "highestRating", 0);
        setIntField(term290176, term290176.getClass(), "gradeRank", 0);
        setIntField(term290176, term290176.getClass(), "classRank", 0);
        setIntField(term290176, term290176.getClass(), "courseRank", 0);
        setField(term290176, term290176.getClass(), "charaSlot", null);
        setField(term290176, term290176.getClass(), "charaLockSlot", null);
        setLongField(term290176, term290176.getClass(), "contentBit", 0L);
        setIntField(term290176, term290176.getClass(), "playCount", 0);
        setField(term290176, term290176.getClass(), "eventWatchedDate", null);
        setField(term290176, term290176.getClass(), "lastGameId", null);
        setField(term290176, term290176.getClass(), "lastRomVersion", null);
        setField(term290176, term290176.getClass(), "lastDataVersion", null);
        setField(term290176, term290176.getClass(), "lastLoginDate", null);
        setField(term290176, term290176.getClass(), "lastPlayDate", null);
        setIntField(term290176, term290176.getClass(), "lastPlayCredit", 0);
        setIntField(term290176, term290176.getClass(), "lastPlayMode", 0);
        setIntField(term290176, term290176.getClass(), "lastPlaceId", 0);
        setField(term290176, term290176.getClass(), "lastPlaceName", null);
        setIntField(term290176, term290176.getClass(), "lastAllNetId", 0);
        setIntField(term290176, term290176.getClass(), "lastRegionId", 0);
        setField(term290176, term290176.getClass(), "lastRegionName", null);
        setField(term290176, term290176.getClass(), "lastClientId", null);
        setField(term290176, term290176.getClass(), "lastCountryCode", null);
        setIntField(term290176, term290176.getClass(), "lastSelectEMoney", 0);
        setIntField(term290176, term290176.getClass(), "lastSelectTicket", 0);
        setIntField(term290176, term290176.getClass(), "lastSelectCourse", 0);
        setIntField(term290176, term290176.getClass(), "lastCountCourse", 0);
        setField(term290176, term290176.getClass(), "firstGameId", null);
        setField(term290176, term290176.getClass(), "firstRomVersion", null);
        setField(term290176, term290176.getClass(), "firstDataVersion", null);
        setField(term290176, term290176.getClass(), "firstPlayDate", null);
        setField(term290176, term290176.getClass(), "compatibleCmVersion", null);
        setField(term290176, term290176.getClass(), "dailyBonusDate", null);
        setField(term290176, term290176.getClass(), "dailyCourseBonusDate", null);
        setField(term290176, term290176.getClass(), "lastPairLoginDate", null);
        setField(term290176, term290176.getClass(), "lastTrialPlayDate", null);
        setIntField(term290176, term290176.getClass(), "playVsCount", 0);
        setIntField(term290176, term290176.getClass(), "playSyncCount", 0);
        setIntField(term290176, term290176.getClass(), "winCount", 0);
        setIntField(term290176, term290176.getClass(), "helpCount", 0);
        setIntField(term290176, term290176.getClass(), "comboCount", 0);
        setLongField(term290176, term290176.getClass(), "totalDeluxscore", 0L);
        setLongField(term290176, term290176.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term290176, term290176.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term290176, term290176.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term290176, term290176.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term290176, term290176.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term290176, term290176.getClass(), "totalSync", 0);
        setIntField(term290176, term290176.getClass(), "totalBasicSync", 0);
        setIntField(term290176, term290176.getClass(), "totalAdvancedSync", 0);
        setIntField(term290176, term290176.getClass(), "totalExpertSync", 0);
        setIntField(term290176, term290176.getClass(), "totalMasterSync", 0);
        setIntField(term290176, term290176.getClass(), "totalReMasterSync", 0);
        setLongField(term290176, term290176.getClass(), "totalAchievement", 0L);
        setLongField(term290176, term290176.getClass(), "totalBasicAchievement", 0L);
        setLongField(term290176, term290176.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term290176, term290176.getClass(), "totalExpertAchievement", 0L);
        setLongField(term290176, term290176.getClass(), "totalMasterAchievement", 0L);
        setLongField(term290176, term290176.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term290176, term290176.getClass(), "playerOldRating", 0L);
        setLongField(term290176, term290176.getClass(), "playerNewRating", 0L);
        setIntField(term290176, term290176.getClass(), "banState", 0);
        setLongField(term290176, term290176.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerOldRating", argTypes, term290176, args);
    }

};


