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

public class UserDetail_getPlayerNewRating_292118478234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290231;

    public UserDetail_getPlayerNewRating_292118478234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290231 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term290231, term290231.getClass(), "id", 0L);
        setField(term290231, term290231.getClass(), "card", null);
        setField(term290231, term290231.getClass(), "userName", null);
        setIntField(term290231, term290231.getClass(), "isNetMember", 0);
        setIntField(term290231, term290231.getClass(), "iconId", 0);
        setIntField(term290231, term290231.getClass(), "plateId", 0);
        setIntField(term290231, term290231.getClass(), "titleId", 0);
        setIntField(term290231, term290231.getClass(), "partnerId", 0);
        setIntField(term290231, term290231.getClass(), "frameId", 0);
        setIntField(term290231, term290231.getClass(), "selectMapId", 0);
        setIntField(term290231, term290231.getClass(), "totalAwake", 0);
        setIntField(term290231, term290231.getClass(), "gradeRating", 0);
        setIntField(term290231, term290231.getClass(), "musicRating", 0);
        setIntField(term290231, term290231.getClass(), "playerRating", 0);
        setIntField(term290231, term290231.getClass(), "highestRating", 0);
        setIntField(term290231, term290231.getClass(), "gradeRank", 0);
        setIntField(term290231, term290231.getClass(), "classRank", 0);
        setIntField(term290231, term290231.getClass(), "courseRank", 0);
        setField(term290231, term290231.getClass(), "charaSlot", null);
        setField(term290231, term290231.getClass(), "charaLockSlot", null);
        setLongField(term290231, term290231.getClass(), "contentBit", 0L);
        setIntField(term290231, term290231.getClass(), "playCount", 0);
        setField(term290231, term290231.getClass(), "eventWatchedDate", null);
        setField(term290231, term290231.getClass(), "lastGameId", null);
        setField(term290231, term290231.getClass(), "lastRomVersion", null);
        setField(term290231, term290231.getClass(), "lastDataVersion", null);
        setField(term290231, term290231.getClass(), "lastLoginDate", null);
        setField(term290231, term290231.getClass(), "lastPlayDate", null);
        setIntField(term290231, term290231.getClass(), "lastPlayCredit", 0);
        setIntField(term290231, term290231.getClass(), "lastPlayMode", 0);
        setIntField(term290231, term290231.getClass(), "lastPlaceId", 0);
        setField(term290231, term290231.getClass(), "lastPlaceName", null);
        setIntField(term290231, term290231.getClass(), "lastAllNetId", 0);
        setIntField(term290231, term290231.getClass(), "lastRegionId", 0);
        setField(term290231, term290231.getClass(), "lastRegionName", null);
        setField(term290231, term290231.getClass(), "lastClientId", null);
        setField(term290231, term290231.getClass(), "lastCountryCode", null);
        setIntField(term290231, term290231.getClass(), "lastSelectEMoney", 0);
        setIntField(term290231, term290231.getClass(), "lastSelectTicket", 0);
        setIntField(term290231, term290231.getClass(), "lastSelectCourse", 0);
        setIntField(term290231, term290231.getClass(), "lastCountCourse", 0);
        setField(term290231, term290231.getClass(), "firstGameId", null);
        setField(term290231, term290231.getClass(), "firstRomVersion", null);
        setField(term290231, term290231.getClass(), "firstDataVersion", null);
        setField(term290231, term290231.getClass(), "firstPlayDate", null);
        setField(term290231, term290231.getClass(), "compatibleCmVersion", null);
        setField(term290231, term290231.getClass(), "dailyBonusDate", null);
        setField(term290231, term290231.getClass(), "dailyCourseBonusDate", null);
        setField(term290231, term290231.getClass(), "lastPairLoginDate", null);
        setField(term290231, term290231.getClass(), "lastTrialPlayDate", null);
        setIntField(term290231, term290231.getClass(), "playVsCount", 0);
        setIntField(term290231, term290231.getClass(), "playSyncCount", 0);
        setIntField(term290231, term290231.getClass(), "winCount", 0);
        setIntField(term290231, term290231.getClass(), "helpCount", 0);
        setIntField(term290231, term290231.getClass(), "comboCount", 0);
        setLongField(term290231, term290231.getClass(), "totalDeluxscore", 0L);
        setLongField(term290231, term290231.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term290231, term290231.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term290231, term290231.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term290231, term290231.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term290231, term290231.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term290231, term290231.getClass(), "totalSync", 0);
        setIntField(term290231, term290231.getClass(), "totalBasicSync", 0);
        setIntField(term290231, term290231.getClass(), "totalAdvancedSync", 0);
        setIntField(term290231, term290231.getClass(), "totalExpertSync", 0);
        setIntField(term290231, term290231.getClass(), "totalMasterSync", 0);
        setIntField(term290231, term290231.getClass(), "totalReMasterSync", 0);
        setLongField(term290231, term290231.getClass(), "totalAchievement", 0L);
        setLongField(term290231, term290231.getClass(), "totalBasicAchievement", 0L);
        setLongField(term290231, term290231.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term290231, term290231.getClass(), "totalExpertAchievement", 0L);
        setLongField(term290231, term290231.getClass(), "totalMasterAchievement", 0L);
        setLongField(term290231, term290231.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term290231, term290231.getClass(), "playerOldRating", 0L);
        setLongField(term290231, term290231.getClass(), "playerNewRating", 0L);
        setIntField(term290231, term290231.getClass(), "banState", 0);
        setLongField(term290231, term290231.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerNewRating", argTypes, term290231, args);
    }

};


