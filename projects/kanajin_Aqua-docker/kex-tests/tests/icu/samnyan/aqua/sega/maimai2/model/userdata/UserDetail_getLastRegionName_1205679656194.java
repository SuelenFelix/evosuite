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

public class UserDetail_getLastRegionName_1205679656194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288031;

    public UserDetail_getLastRegionName_1205679656194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288031 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term288031, term288031.getClass(), "id", 0L);
        setField(term288031, term288031.getClass(), "card", null);
        setField(term288031, term288031.getClass(), "userName", null);
        setIntField(term288031, term288031.getClass(), "isNetMember", 0);
        setIntField(term288031, term288031.getClass(), "iconId", 0);
        setIntField(term288031, term288031.getClass(), "plateId", 0);
        setIntField(term288031, term288031.getClass(), "titleId", 0);
        setIntField(term288031, term288031.getClass(), "partnerId", 0);
        setIntField(term288031, term288031.getClass(), "frameId", 0);
        setIntField(term288031, term288031.getClass(), "selectMapId", 0);
        setIntField(term288031, term288031.getClass(), "totalAwake", 0);
        setIntField(term288031, term288031.getClass(), "gradeRating", 0);
        setIntField(term288031, term288031.getClass(), "musicRating", 0);
        setIntField(term288031, term288031.getClass(), "playerRating", 0);
        setIntField(term288031, term288031.getClass(), "highestRating", 0);
        setIntField(term288031, term288031.getClass(), "gradeRank", 0);
        setIntField(term288031, term288031.getClass(), "classRank", 0);
        setIntField(term288031, term288031.getClass(), "courseRank", 0);
        setField(term288031, term288031.getClass(), "charaSlot", null);
        setField(term288031, term288031.getClass(), "charaLockSlot", null);
        setLongField(term288031, term288031.getClass(), "contentBit", 0L);
        setIntField(term288031, term288031.getClass(), "playCount", 0);
        setField(term288031, term288031.getClass(), "eventWatchedDate", null);
        setField(term288031, term288031.getClass(), "lastGameId", null);
        setField(term288031, term288031.getClass(), "lastRomVersion", null);
        setField(term288031, term288031.getClass(), "lastDataVersion", null);
        setField(term288031, term288031.getClass(), "lastLoginDate", null);
        setField(term288031, term288031.getClass(), "lastPlayDate", null);
        setIntField(term288031, term288031.getClass(), "lastPlayCredit", 0);
        setIntField(term288031, term288031.getClass(), "lastPlayMode", 0);
        setIntField(term288031, term288031.getClass(), "lastPlaceId", 0);
        setField(term288031, term288031.getClass(), "lastPlaceName", null);
        setIntField(term288031, term288031.getClass(), "lastAllNetId", 0);
        setIntField(term288031, term288031.getClass(), "lastRegionId", 0);
        setField(term288031, term288031.getClass(), "lastRegionName", null);
        setField(term288031, term288031.getClass(), "lastClientId", null);
        setField(term288031, term288031.getClass(), "lastCountryCode", null);
        setIntField(term288031, term288031.getClass(), "lastSelectEMoney", 0);
        setIntField(term288031, term288031.getClass(), "lastSelectTicket", 0);
        setIntField(term288031, term288031.getClass(), "lastSelectCourse", 0);
        setIntField(term288031, term288031.getClass(), "lastCountCourse", 0);
        setField(term288031, term288031.getClass(), "firstGameId", null);
        setField(term288031, term288031.getClass(), "firstRomVersion", null);
        setField(term288031, term288031.getClass(), "firstDataVersion", null);
        setField(term288031, term288031.getClass(), "firstPlayDate", null);
        setField(term288031, term288031.getClass(), "compatibleCmVersion", null);
        setField(term288031, term288031.getClass(), "dailyBonusDate", null);
        setField(term288031, term288031.getClass(), "dailyCourseBonusDate", null);
        setField(term288031, term288031.getClass(), "lastPairLoginDate", null);
        setField(term288031, term288031.getClass(), "lastTrialPlayDate", null);
        setIntField(term288031, term288031.getClass(), "playVsCount", 0);
        setIntField(term288031, term288031.getClass(), "playSyncCount", 0);
        setIntField(term288031, term288031.getClass(), "winCount", 0);
        setIntField(term288031, term288031.getClass(), "helpCount", 0);
        setIntField(term288031, term288031.getClass(), "comboCount", 0);
        setLongField(term288031, term288031.getClass(), "totalDeluxscore", 0L);
        setLongField(term288031, term288031.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term288031, term288031.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term288031, term288031.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term288031, term288031.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term288031, term288031.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term288031, term288031.getClass(), "totalSync", 0);
        setIntField(term288031, term288031.getClass(), "totalBasicSync", 0);
        setIntField(term288031, term288031.getClass(), "totalAdvancedSync", 0);
        setIntField(term288031, term288031.getClass(), "totalExpertSync", 0);
        setIntField(term288031, term288031.getClass(), "totalMasterSync", 0);
        setIntField(term288031, term288031.getClass(), "totalReMasterSync", 0);
        setLongField(term288031, term288031.getClass(), "totalAchievement", 0L);
        setLongField(term288031, term288031.getClass(), "totalBasicAchievement", 0L);
        setLongField(term288031, term288031.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term288031, term288031.getClass(), "totalExpertAchievement", 0L);
        setLongField(term288031, term288031.getClass(), "totalMasterAchievement", 0L);
        setLongField(term288031, term288031.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term288031, term288031.getClass(), "playerOldRating", 0L);
        setLongField(term288031, term288031.getClass(), "playerNewRating", 0L);
        setIntField(term288031, term288031.getClass(), "banState", 0);
        setLongField(term288031, term288031.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRegionName", argTypes, term288031, args);
    }

};


