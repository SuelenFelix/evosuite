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

public class UserDetail_setUserName_1767095791239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290508;

    public UserDetail_setUserName_1767095791239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290508 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term290508, term290508.getClass(), "id", 0L);
        setField(term290508, term290508.getClass(), "card", null);
        setField(term290508, term290508.getClass(), "userName", null);
        setIntField(term290508, term290508.getClass(), "isNetMember", 0);
        setIntField(term290508, term290508.getClass(), "iconId", 0);
        setIntField(term290508, term290508.getClass(), "plateId", 0);
        setIntField(term290508, term290508.getClass(), "titleId", 0);
        setIntField(term290508, term290508.getClass(), "partnerId", 0);
        setIntField(term290508, term290508.getClass(), "frameId", 0);
        setIntField(term290508, term290508.getClass(), "selectMapId", 0);
        setIntField(term290508, term290508.getClass(), "totalAwake", 0);
        setIntField(term290508, term290508.getClass(), "gradeRating", 0);
        setIntField(term290508, term290508.getClass(), "musicRating", 0);
        setIntField(term290508, term290508.getClass(), "playerRating", 0);
        setIntField(term290508, term290508.getClass(), "highestRating", 0);
        setIntField(term290508, term290508.getClass(), "gradeRank", 0);
        setIntField(term290508, term290508.getClass(), "classRank", 0);
        setIntField(term290508, term290508.getClass(), "courseRank", 0);
        setField(term290508, term290508.getClass(), "charaSlot", null);
        setField(term290508, term290508.getClass(), "charaLockSlot", null);
        setLongField(term290508, term290508.getClass(), "contentBit", 0L);
        setIntField(term290508, term290508.getClass(), "playCount", 0);
        setField(term290508, term290508.getClass(), "eventWatchedDate", null);
        setField(term290508, term290508.getClass(), "lastGameId", null);
        setField(term290508, term290508.getClass(), "lastRomVersion", null);
        setField(term290508, term290508.getClass(), "lastDataVersion", null);
        setField(term290508, term290508.getClass(), "lastLoginDate", null);
        setField(term290508, term290508.getClass(), "lastPlayDate", null);
        setIntField(term290508, term290508.getClass(), "lastPlayCredit", 0);
        setIntField(term290508, term290508.getClass(), "lastPlayMode", 0);
        setIntField(term290508, term290508.getClass(), "lastPlaceId", 0);
        setField(term290508, term290508.getClass(), "lastPlaceName", null);
        setIntField(term290508, term290508.getClass(), "lastAllNetId", 0);
        setIntField(term290508, term290508.getClass(), "lastRegionId", 0);
        setField(term290508, term290508.getClass(), "lastRegionName", null);
        setField(term290508, term290508.getClass(), "lastClientId", null);
        setField(term290508, term290508.getClass(), "lastCountryCode", null);
        setIntField(term290508, term290508.getClass(), "lastSelectEMoney", 0);
        setIntField(term290508, term290508.getClass(), "lastSelectTicket", 0);
        setIntField(term290508, term290508.getClass(), "lastSelectCourse", 0);
        setIntField(term290508, term290508.getClass(), "lastCountCourse", 0);
        setField(term290508, term290508.getClass(), "firstGameId", null);
        setField(term290508, term290508.getClass(), "firstRomVersion", null);
        setField(term290508, term290508.getClass(), "firstDataVersion", null);
        setField(term290508, term290508.getClass(), "firstPlayDate", null);
        setField(term290508, term290508.getClass(), "compatibleCmVersion", null);
        setField(term290508, term290508.getClass(), "dailyBonusDate", null);
        setField(term290508, term290508.getClass(), "dailyCourseBonusDate", null);
        setField(term290508, term290508.getClass(), "lastPairLoginDate", null);
        setField(term290508, term290508.getClass(), "lastTrialPlayDate", null);
        setIntField(term290508, term290508.getClass(), "playVsCount", 0);
        setIntField(term290508, term290508.getClass(), "playSyncCount", 0);
        setIntField(term290508, term290508.getClass(), "winCount", 0);
        setIntField(term290508, term290508.getClass(), "helpCount", 0);
        setIntField(term290508, term290508.getClass(), "comboCount", 0);
        setLongField(term290508, term290508.getClass(), "totalDeluxscore", 0L);
        setLongField(term290508, term290508.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term290508, term290508.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term290508, term290508.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term290508, term290508.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term290508, term290508.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term290508, term290508.getClass(), "totalSync", 0);
        setIntField(term290508, term290508.getClass(), "totalBasicSync", 0);
        setIntField(term290508, term290508.getClass(), "totalAdvancedSync", 0);
        setIntField(term290508, term290508.getClass(), "totalExpertSync", 0);
        setIntField(term290508, term290508.getClass(), "totalMasterSync", 0);
        setIntField(term290508, term290508.getClass(), "totalReMasterSync", 0);
        setLongField(term290508, term290508.getClass(), "totalAchievement", 0L);
        setLongField(term290508, term290508.getClass(), "totalBasicAchievement", 0L);
        setLongField(term290508, term290508.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term290508, term290508.getClass(), "totalExpertAchievement", 0L);
        setLongField(term290508, term290508.getClass(), "totalMasterAchievement", 0L);
        setLongField(term290508, term290508.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term290508, term290508.getClass(), "playerOldRating", 0L);
        setLongField(term290508, term290508.getClass(), "playerNewRating", 0L);
        setIntField(term290508, term290508.getClass(), "banState", 0);
        setLongField(term290508, term290508.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserName", argTypes, term290508, args);
    }

};


