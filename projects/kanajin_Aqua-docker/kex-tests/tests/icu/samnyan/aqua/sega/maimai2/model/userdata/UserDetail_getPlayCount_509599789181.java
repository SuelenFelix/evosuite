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

public class UserDetail_getPlayCount_509599789181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287316;

    public UserDetail_getPlayCount_509599789181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287316 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term287316, term287316.getClass(), "id", 0L);
        setField(term287316, term287316.getClass(), "card", null);
        setField(term287316, term287316.getClass(), "userName", null);
        setIntField(term287316, term287316.getClass(), "isNetMember", 0);
        setIntField(term287316, term287316.getClass(), "iconId", 0);
        setIntField(term287316, term287316.getClass(), "plateId", 0);
        setIntField(term287316, term287316.getClass(), "titleId", 0);
        setIntField(term287316, term287316.getClass(), "partnerId", 0);
        setIntField(term287316, term287316.getClass(), "frameId", 0);
        setIntField(term287316, term287316.getClass(), "selectMapId", 0);
        setIntField(term287316, term287316.getClass(), "totalAwake", 0);
        setIntField(term287316, term287316.getClass(), "gradeRating", 0);
        setIntField(term287316, term287316.getClass(), "musicRating", 0);
        setIntField(term287316, term287316.getClass(), "playerRating", 0);
        setIntField(term287316, term287316.getClass(), "highestRating", 0);
        setIntField(term287316, term287316.getClass(), "gradeRank", 0);
        setIntField(term287316, term287316.getClass(), "classRank", 0);
        setIntField(term287316, term287316.getClass(), "courseRank", 0);
        setField(term287316, term287316.getClass(), "charaSlot", null);
        setField(term287316, term287316.getClass(), "charaLockSlot", null);
        setLongField(term287316, term287316.getClass(), "contentBit", 0L);
        setIntField(term287316, term287316.getClass(), "playCount", 0);
        setField(term287316, term287316.getClass(), "eventWatchedDate", null);
        setField(term287316, term287316.getClass(), "lastGameId", null);
        setField(term287316, term287316.getClass(), "lastRomVersion", null);
        setField(term287316, term287316.getClass(), "lastDataVersion", null);
        setField(term287316, term287316.getClass(), "lastLoginDate", null);
        setField(term287316, term287316.getClass(), "lastPlayDate", null);
        setIntField(term287316, term287316.getClass(), "lastPlayCredit", 0);
        setIntField(term287316, term287316.getClass(), "lastPlayMode", 0);
        setIntField(term287316, term287316.getClass(), "lastPlaceId", 0);
        setField(term287316, term287316.getClass(), "lastPlaceName", null);
        setIntField(term287316, term287316.getClass(), "lastAllNetId", 0);
        setIntField(term287316, term287316.getClass(), "lastRegionId", 0);
        setField(term287316, term287316.getClass(), "lastRegionName", null);
        setField(term287316, term287316.getClass(), "lastClientId", null);
        setField(term287316, term287316.getClass(), "lastCountryCode", null);
        setIntField(term287316, term287316.getClass(), "lastSelectEMoney", 0);
        setIntField(term287316, term287316.getClass(), "lastSelectTicket", 0);
        setIntField(term287316, term287316.getClass(), "lastSelectCourse", 0);
        setIntField(term287316, term287316.getClass(), "lastCountCourse", 0);
        setField(term287316, term287316.getClass(), "firstGameId", null);
        setField(term287316, term287316.getClass(), "firstRomVersion", null);
        setField(term287316, term287316.getClass(), "firstDataVersion", null);
        setField(term287316, term287316.getClass(), "firstPlayDate", null);
        setField(term287316, term287316.getClass(), "compatibleCmVersion", null);
        setField(term287316, term287316.getClass(), "dailyBonusDate", null);
        setField(term287316, term287316.getClass(), "dailyCourseBonusDate", null);
        setField(term287316, term287316.getClass(), "lastPairLoginDate", null);
        setField(term287316, term287316.getClass(), "lastTrialPlayDate", null);
        setIntField(term287316, term287316.getClass(), "playVsCount", 0);
        setIntField(term287316, term287316.getClass(), "playSyncCount", 0);
        setIntField(term287316, term287316.getClass(), "winCount", 0);
        setIntField(term287316, term287316.getClass(), "helpCount", 0);
        setIntField(term287316, term287316.getClass(), "comboCount", 0);
        setLongField(term287316, term287316.getClass(), "totalDeluxscore", 0L);
        setLongField(term287316, term287316.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term287316, term287316.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term287316, term287316.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term287316, term287316.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term287316, term287316.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term287316, term287316.getClass(), "totalSync", 0);
        setIntField(term287316, term287316.getClass(), "totalBasicSync", 0);
        setIntField(term287316, term287316.getClass(), "totalAdvancedSync", 0);
        setIntField(term287316, term287316.getClass(), "totalExpertSync", 0);
        setIntField(term287316, term287316.getClass(), "totalMasterSync", 0);
        setIntField(term287316, term287316.getClass(), "totalReMasterSync", 0);
        setLongField(term287316, term287316.getClass(), "totalAchievement", 0L);
        setLongField(term287316, term287316.getClass(), "totalBasicAchievement", 0L);
        setLongField(term287316, term287316.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term287316, term287316.getClass(), "totalExpertAchievement", 0L);
        setLongField(term287316, term287316.getClass(), "totalMasterAchievement", 0L);
        setLongField(term287316, term287316.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term287316, term287316.getClass(), "playerOldRating", 0L);
        setLongField(term287316, term287316.getClass(), "playerNewRating", 0L);
        setIntField(term287316, term287316.getClass(), "banState", 0);
        setLongField(term287316, term287316.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayCount", argTypes, term287316, args);
    }

};


