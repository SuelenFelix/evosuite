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

public class UserDetail_getTotalDeluxscore_2015103718215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289186;

    public UserDetail_getTotalDeluxscore_2015103718215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289186 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term289186, term289186.getClass(), "id", 0L);
        setField(term289186, term289186.getClass(), "card", null);
        setField(term289186, term289186.getClass(), "userName", null);
        setIntField(term289186, term289186.getClass(), "isNetMember", 0);
        setIntField(term289186, term289186.getClass(), "iconId", 0);
        setIntField(term289186, term289186.getClass(), "plateId", 0);
        setIntField(term289186, term289186.getClass(), "titleId", 0);
        setIntField(term289186, term289186.getClass(), "partnerId", 0);
        setIntField(term289186, term289186.getClass(), "frameId", 0);
        setIntField(term289186, term289186.getClass(), "selectMapId", 0);
        setIntField(term289186, term289186.getClass(), "totalAwake", 0);
        setIntField(term289186, term289186.getClass(), "gradeRating", 0);
        setIntField(term289186, term289186.getClass(), "musicRating", 0);
        setIntField(term289186, term289186.getClass(), "playerRating", 0);
        setIntField(term289186, term289186.getClass(), "highestRating", 0);
        setIntField(term289186, term289186.getClass(), "gradeRank", 0);
        setIntField(term289186, term289186.getClass(), "classRank", 0);
        setIntField(term289186, term289186.getClass(), "courseRank", 0);
        setField(term289186, term289186.getClass(), "charaSlot", null);
        setField(term289186, term289186.getClass(), "charaLockSlot", null);
        setLongField(term289186, term289186.getClass(), "contentBit", 0L);
        setIntField(term289186, term289186.getClass(), "playCount", 0);
        setField(term289186, term289186.getClass(), "eventWatchedDate", null);
        setField(term289186, term289186.getClass(), "lastGameId", null);
        setField(term289186, term289186.getClass(), "lastRomVersion", null);
        setField(term289186, term289186.getClass(), "lastDataVersion", null);
        setField(term289186, term289186.getClass(), "lastLoginDate", null);
        setField(term289186, term289186.getClass(), "lastPlayDate", null);
        setIntField(term289186, term289186.getClass(), "lastPlayCredit", 0);
        setIntField(term289186, term289186.getClass(), "lastPlayMode", 0);
        setIntField(term289186, term289186.getClass(), "lastPlaceId", 0);
        setField(term289186, term289186.getClass(), "lastPlaceName", null);
        setIntField(term289186, term289186.getClass(), "lastAllNetId", 0);
        setIntField(term289186, term289186.getClass(), "lastRegionId", 0);
        setField(term289186, term289186.getClass(), "lastRegionName", null);
        setField(term289186, term289186.getClass(), "lastClientId", null);
        setField(term289186, term289186.getClass(), "lastCountryCode", null);
        setIntField(term289186, term289186.getClass(), "lastSelectEMoney", 0);
        setIntField(term289186, term289186.getClass(), "lastSelectTicket", 0);
        setIntField(term289186, term289186.getClass(), "lastSelectCourse", 0);
        setIntField(term289186, term289186.getClass(), "lastCountCourse", 0);
        setField(term289186, term289186.getClass(), "firstGameId", null);
        setField(term289186, term289186.getClass(), "firstRomVersion", null);
        setField(term289186, term289186.getClass(), "firstDataVersion", null);
        setField(term289186, term289186.getClass(), "firstPlayDate", null);
        setField(term289186, term289186.getClass(), "compatibleCmVersion", null);
        setField(term289186, term289186.getClass(), "dailyBonusDate", null);
        setField(term289186, term289186.getClass(), "dailyCourseBonusDate", null);
        setField(term289186, term289186.getClass(), "lastPairLoginDate", null);
        setField(term289186, term289186.getClass(), "lastTrialPlayDate", null);
        setIntField(term289186, term289186.getClass(), "playVsCount", 0);
        setIntField(term289186, term289186.getClass(), "playSyncCount", 0);
        setIntField(term289186, term289186.getClass(), "winCount", 0);
        setIntField(term289186, term289186.getClass(), "helpCount", 0);
        setIntField(term289186, term289186.getClass(), "comboCount", 0);
        setLongField(term289186, term289186.getClass(), "totalDeluxscore", 0L);
        setLongField(term289186, term289186.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term289186, term289186.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term289186, term289186.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term289186, term289186.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term289186, term289186.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term289186, term289186.getClass(), "totalSync", 0);
        setIntField(term289186, term289186.getClass(), "totalBasicSync", 0);
        setIntField(term289186, term289186.getClass(), "totalAdvancedSync", 0);
        setIntField(term289186, term289186.getClass(), "totalExpertSync", 0);
        setIntField(term289186, term289186.getClass(), "totalMasterSync", 0);
        setIntField(term289186, term289186.getClass(), "totalReMasterSync", 0);
        setLongField(term289186, term289186.getClass(), "totalAchievement", 0L);
        setLongField(term289186, term289186.getClass(), "totalBasicAchievement", 0L);
        setLongField(term289186, term289186.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term289186, term289186.getClass(), "totalExpertAchievement", 0L);
        setLongField(term289186, term289186.getClass(), "totalMasterAchievement", 0L);
        setLongField(term289186, term289186.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term289186, term289186.getClass(), "playerOldRating", 0L);
        setLongField(term289186, term289186.getClass(), "playerNewRating", 0L);
        setIntField(term289186, term289186.getClass(), "banState", 0);
        setLongField(term289186, term289186.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalDeluxscore", argTypes, term289186, args);
    }

};


