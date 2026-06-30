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

public class UserDetail_getLastRomVersion_1176006881184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287481;

    public UserDetail_getLastRomVersion_1176006881184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287481 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term287481, term287481.getClass(), "id", 0L);
        setField(term287481, term287481.getClass(), "card", null);
        setField(term287481, term287481.getClass(), "userName", null);
        setIntField(term287481, term287481.getClass(), "isNetMember", 0);
        setIntField(term287481, term287481.getClass(), "iconId", 0);
        setIntField(term287481, term287481.getClass(), "plateId", 0);
        setIntField(term287481, term287481.getClass(), "titleId", 0);
        setIntField(term287481, term287481.getClass(), "partnerId", 0);
        setIntField(term287481, term287481.getClass(), "frameId", 0);
        setIntField(term287481, term287481.getClass(), "selectMapId", 0);
        setIntField(term287481, term287481.getClass(), "totalAwake", 0);
        setIntField(term287481, term287481.getClass(), "gradeRating", 0);
        setIntField(term287481, term287481.getClass(), "musicRating", 0);
        setIntField(term287481, term287481.getClass(), "playerRating", 0);
        setIntField(term287481, term287481.getClass(), "highestRating", 0);
        setIntField(term287481, term287481.getClass(), "gradeRank", 0);
        setIntField(term287481, term287481.getClass(), "classRank", 0);
        setIntField(term287481, term287481.getClass(), "courseRank", 0);
        setField(term287481, term287481.getClass(), "charaSlot", null);
        setField(term287481, term287481.getClass(), "charaLockSlot", null);
        setLongField(term287481, term287481.getClass(), "contentBit", 0L);
        setIntField(term287481, term287481.getClass(), "playCount", 0);
        setField(term287481, term287481.getClass(), "eventWatchedDate", null);
        setField(term287481, term287481.getClass(), "lastGameId", null);
        setField(term287481, term287481.getClass(), "lastRomVersion", null);
        setField(term287481, term287481.getClass(), "lastDataVersion", null);
        setField(term287481, term287481.getClass(), "lastLoginDate", null);
        setField(term287481, term287481.getClass(), "lastPlayDate", null);
        setIntField(term287481, term287481.getClass(), "lastPlayCredit", 0);
        setIntField(term287481, term287481.getClass(), "lastPlayMode", 0);
        setIntField(term287481, term287481.getClass(), "lastPlaceId", 0);
        setField(term287481, term287481.getClass(), "lastPlaceName", null);
        setIntField(term287481, term287481.getClass(), "lastAllNetId", 0);
        setIntField(term287481, term287481.getClass(), "lastRegionId", 0);
        setField(term287481, term287481.getClass(), "lastRegionName", null);
        setField(term287481, term287481.getClass(), "lastClientId", null);
        setField(term287481, term287481.getClass(), "lastCountryCode", null);
        setIntField(term287481, term287481.getClass(), "lastSelectEMoney", 0);
        setIntField(term287481, term287481.getClass(), "lastSelectTicket", 0);
        setIntField(term287481, term287481.getClass(), "lastSelectCourse", 0);
        setIntField(term287481, term287481.getClass(), "lastCountCourse", 0);
        setField(term287481, term287481.getClass(), "firstGameId", null);
        setField(term287481, term287481.getClass(), "firstRomVersion", null);
        setField(term287481, term287481.getClass(), "firstDataVersion", null);
        setField(term287481, term287481.getClass(), "firstPlayDate", null);
        setField(term287481, term287481.getClass(), "compatibleCmVersion", null);
        setField(term287481, term287481.getClass(), "dailyBonusDate", null);
        setField(term287481, term287481.getClass(), "dailyCourseBonusDate", null);
        setField(term287481, term287481.getClass(), "lastPairLoginDate", null);
        setField(term287481, term287481.getClass(), "lastTrialPlayDate", null);
        setIntField(term287481, term287481.getClass(), "playVsCount", 0);
        setIntField(term287481, term287481.getClass(), "playSyncCount", 0);
        setIntField(term287481, term287481.getClass(), "winCount", 0);
        setIntField(term287481, term287481.getClass(), "helpCount", 0);
        setIntField(term287481, term287481.getClass(), "comboCount", 0);
        setLongField(term287481, term287481.getClass(), "totalDeluxscore", 0L);
        setLongField(term287481, term287481.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term287481, term287481.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term287481, term287481.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term287481, term287481.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term287481, term287481.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term287481, term287481.getClass(), "totalSync", 0);
        setIntField(term287481, term287481.getClass(), "totalBasicSync", 0);
        setIntField(term287481, term287481.getClass(), "totalAdvancedSync", 0);
        setIntField(term287481, term287481.getClass(), "totalExpertSync", 0);
        setIntField(term287481, term287481.getClass(), "totalMasterSync", 0);
        setIntField(term287481, term287481.getClass(), "totalReMasterSync", 0);
        setLongField(term287481, term287481.getClass(), "totalAchievement", 0L);
        setLongField(term287481, term287481.getClass(), "totalBasicAchievement", 0L);
        setLongField(term287481, term287481.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term287481, term287481.getClass(), "totalExpertAchievement", 0L);
        setLongField(term287481, term287481.getClass(), "totalMasterAchievement", 0L);
        setLongField(term287481, term287481.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term287481, term287481.getClass(), "playerOldRating", 0L);
        setLongField(term287481, term287481.getClass(), "playerNewRating", 0L);
        setIntField(term287481, term287481.getClass(), "banState", 0);
        setLongField(term287481, term287481.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRomVersion", argTypes, term287481, args);
    }

};


