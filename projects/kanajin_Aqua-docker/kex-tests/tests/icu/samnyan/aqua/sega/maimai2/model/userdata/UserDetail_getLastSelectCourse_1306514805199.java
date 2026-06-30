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

public class UserDetail_getLastSelectCourse_1306514805199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288306;

    public UserDetail_getLastSelectCourse_1306514805199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288306 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term288306, term288306.getClass(), "id", 0L);
        setField(term288306, term288306.getClass(), "card", null);
        setField(term288306, term288306.getClass(), "userName", null);
        setIntField(term288306, term288306.getClass(), "isNetMember", 0);
        setIntField(term288306, term288306.getClass(), "iconId", 0);
        setIntField(term288306, term288306.getClass(), "plateId", 0);
        setIntField(term288306, term288306.getClass(), "titleId", 0);
        setIntField(term288306, term288306.getClass(), "partnerId", 0);
        setIntField(term288306, term288306.getClass(), "frameId", 0);
        setIntField(term288306, term288306.getClass(), "selectMapId", 0);
        setIntField(term288306, term288306.getClass(), "totalAwake", 0);
        setIntField(term288306, term288306.getClass(), "gradeRating", 0);
        setIntField(term288306, term288306.getClass(), "musicRating", 0);
        setIntField(term288306, term288306.getClass(), "playerRating", 0);
        setIntField(term288306, term288306.getClass(), "highestRating", 0);
        setIntField(term288306, term288306.getClass(), "gradeRank", 0);
        setIntField(term288306, term288306.getClass(), "classRank", 0);
        setIntField(term288306, term288306.getClass(), "courseRank", 0);
        setField(term288306, term288306.getClass(), "charaSlot", null);
        setField(term288306, term288306.getClass(), "charaLockSlot", null);
        setLongField(term288306, term288306.getClass(), "contentBit", 0L);
        setIntField(term288306, term288306.getClass(), "playCount", 0);
        setField(term288306, term288306.getClass(), "eventWatchedDate", null);
        setField(term288306, term288306.getClass(), "lastGameId", null);
        setField(term288306, term288306.getClass(), "lastRomVersion", null);
        setField(term288306, term288306.getClass(), "lastDataVersion", null);
        setField(term288306, term288306.getClass(), "lastLoginDate", null);
        setField(term288306, term288306.getClass(), "lastPlayDate", null);
        setIntField(term288306, term288306.getClass(), "lastPlayCredit", 0);
        setIntField(term288306, term288306.getClass(), "lastPlayMode", 0);
        setIntField(term288306, term288306.getClass(), "lastPlaceId", 0);
        setField(term288306, term288306.getClass(), "lastPlaceName", null);
        setIntField(term288306, term288306.getClass(), "lastAllNetId", 0);
        setIntField(term288306, term288306.getClass(), "lastRegionId", 0);
        setField(term288306, term288306.getClass(), "lastRegionName", null);
        setField(term288306, term288306.getClass(), "lastClientId", null);
        setField(term288306, term288306.getClass(), "lastCountryCode", null);
        setIntField(term288306, term288306.getClass(), "lastSelectEMoney", 0);
        setIntField(term288306, term288306.getClass(), "lastSelectTicket", 0);
        setIntField(term288306, term288306.getClass(), "lastSelectCourse", 0);
        setIntField(term288306, term288306.getClass(), "lastCountCourse", 0);
        setField(term288306, term288306.getClass(), "firstGameId", null);
        setField(term288306, term288306.getClass(), "firstRomVersion", null);
        setField(term288306, term288306.getClass(), "firstDataVersion", null);
        setField(term288306, term288306.getClass(), "firstPlayDate", null);
        setField(term288306, term288306.getClass(), "compatibleCmVersion", null);
        setField(term288306, term288306.getClass(), "dailyBonusDate", null);
        setField(term288306, term288306.getClass(), "dailyCourseBonusDate", null);
        setField(term288306, term288306.getClass(), "lastPairLoginDate", null);
        setField(term288306, term288306.getClass(), "lastTrialPlayDate", null);
        setIntField(term288306, term288306.getClass(), "playVsCount", 0);
        setIntField(term288306, term288306.getClass(), "playSyncCount", 0);
        setIntField(term288306, term288306.getClass(), "winCount", 0);
        setIntField(term288306, term288306.getClass(), "helpCount", 0);
        setIntField(term288306, term288306.getClass(), "comboCount", 0);
        setLongField(term288306, term288306.getClass(), "totalDeluxscore", 0L);
        setLongField(term288306, term288306.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term288306, term288306.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term288306, term288306.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term288306, term288306.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term288306, term288306.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term288306, term288306.getClass(), "totalSync", 0);
        setIntField(term288306, term288306.getClass(), "totalBasicSync", 0);
        setIntField(term288306, term288306.getClass(), "totalAdvancedSync", 0);
        setIntField(term288306, term288306.getClass(), "totalExpertSync", 0);
        setIntField(term288306, term288306.getClass(), "totalMasterSync", 0);
        setIntField(term288306, term288306.getClass(), "totalReMasterSync", 0);
        setLongField(term288306, term288306.getClass(), "totalAchievement", 0L);
        setLongField(term288306, term288306.getClass(), "totalBasicAchievement", 0L);
        setLongField(term288306, term288306.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term288306, term288306.getClass(), "totalExpertAchievement", 0L);
        setLongField(term288306, term288306.getClass(), "totalMasterAchievement", 0L);
        setLongField(term288306, term288306.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term288306, term288306.getClass(), "playerOldRating", 0L);
        setLongField(term288306, term288306.getClass(), "playerNewRating", 0L);
        setIntField(term288306, term288306.getClass(), "banState", 0);
        setLongField(term288306, term288306.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastSelectCourse", argTypes, term288306, args);
    }

};


