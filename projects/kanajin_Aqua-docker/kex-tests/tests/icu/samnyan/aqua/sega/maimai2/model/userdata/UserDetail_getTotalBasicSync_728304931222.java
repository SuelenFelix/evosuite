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

public class UserDetail_getTotalBasicSync_728304931222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289571;

    public UserDetail_getTotalBasicSync_728304931222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289571 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term289571, term289571.getClass(), "id", 0L);
        setField(term289571, term289571.getClass(), "card", null);
        setField(term289571, term289571.getClass(), "userName", null);
        setIntField(term289571, term289571.getClass(), "isNetMember", 0);
        setIntField(term289571, term289571.getClass(), "iconId", 0);
        setIntField(term289571, term289571.getClass(), "plateId", 0);
        setIntField(term289571, term289571.getClass(), "titleId", 0);
        setIntField(term289571, term289571.getClass(), "partnerId", 0);
        setIntField(term289571, term289571.getClass(), "frameId", 0);
        setIntField(term289571, term289571.getClass(), "selectMapId", 0);
        setIntField(term289571, term289571.getClass(), "totalAwake", 0);
        setIntField(term289571, term289571.getClass(), "gradeRating", 0);
        setIntField(term289571, term289571.getClass(), "musicRating", 0);
        setIntField(term289571, term289571.getClass(), "playerRating", 0);
        setIntField(term289571, term289571.getClass(), "highestRating", 0);
        setIntField(term289571, term289571.getClass(), "gradeRank", 0);
        setIntField(term289571, term289571.getClass(), "classRank", 0);
        setIntField(term289571, term289571.getClass(), "courseRank", 0);
        setField(term289571, term289571.getClass(), "charaSlot", null);
        setField(term289571, term289571.getClass(), "charaLockSlot", null);
        setLongField(term289571, term289571.getClass(), "contentBit", 0L);
        setIntField(term289571, term289571.getClass(), "playCount", 0);
        setField(term289571, term289571.getClass(), "eventWatchedDate", null);
        setField(term289571, term289571.getClass(), "lastGameId", null);
        setField(term289571, term289571.getClass(), "lastRomVersion", null);
        setField(term289571, term289571.getClass(), "lastDataVersion", null);
        setField(term289571, term289571.getClass(), "lastLoginDate", null);
        setField(term289571, term289571.getClass(), "lastPlayDate", null);
        setIntField(term289571, term289571.getClass(), "lastPlayCredit", 0);
        setIntField(term289571, term289571.getClass(), "lastPlayMode", 0);
        setIntField(term289571, term289571.getClass(), "lastPlaceId", 0);
        setField(term289571, term289571.getClass(), "lastPlaceName", null);
        setIntField(term289571, term289571.getClass(), "lastAllNetId", 0);
        setIntField(term289571, term289571.getClass(), "lastRegionId", 0);
        setField(term289571, term289571.getClass(), "lastRegionName", null);
        setField(term289571, term289571.getClass(), "lastClientId", null);
        setField(term289571, term289571.getClass(), "lastCountryCode", null);
        setIntField(term289571, term289571.getClass(), "lastSelectEMoney", 0);
        setIntField(term289571, term289571.getClass(), "lastSelectTicket", 0);
        setIntField(term289571, term289571.getClass(), "lastSelectCourse", 0);
        setIntField(term289571, term289571.getClass(), "lastCountCourse", 0);
        setField(term289571, term289571.getClass(), "firstGameId", null);
        setField(term289571, term289571.getClass(), "firstRomVersion", null);
        setField(term289571, term289571.getClass(), "firstDataVersion", null);
        setField(term289571, term289571.getClass(), "firstPlayDate", null);
        setField(term289571, term289571.getClass(), "compatibleCmVersion", null);
        setField(term289571, term289571.getClass(), "dailyBonusDate", null);
        setField(term289571, term289571.getClass(), "dailyCourseBonusDate", null);
        setField(term289571, term289571.getClass(), "lastPairLoginDate", null);
        setField(term289571, term289571.getClass(), "lastTrialPlayDate", null);
        setIntField(term289571, term289571.getClass(), "playVsCount", 0);
        setIntField(term289571, term289571.getClass(), "playSyncCount", 0);
        setIntField(term289571, term289571.getClass(), "winCount", 0);
        setIntField(term289571, term289571.getClass(), "helpCount", 0);
        setIntField(term289571, term289571.getClass(), "comboCount", 0);
        setLongField(term289571, term289571.getClass(), "totalDeluxscore", 0L);
        setLongField(term289571, term289571.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term289571, term289571.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term289571, term289571.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term289571, term289571.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term289571, term289571.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term289571, term289571.getClass(), "totalSync", 0);
        setIntField(term289571, term289571.getClass(), "totalBasicSync", 0);
        setIntField(term289571, term289571.getClass(), "totalAdvancedSync", 0);
        setIntField(term289571, term289571.getClass(), "totalExpertSync", 0);
        setIntField(term289571, term289571.getClass(), "totalMasterSync", 0);
        setIntField(term289571, term289571.getClass(), "totalReMasterSync", 0);
        setLongField(term289571, term289571.getClass(), "totalAchievement", 0L);
        setLongField(term289571, term289571.getClass(), "totalBasicAchievement", 0L);
        setLongField(term289571, term289571.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term289571, term289571.getClass(), "totalExpertAchievement", 0L);
        setLongField(term289571, term289571.getClass(), "totalMasterAchievement", 0L);
        setLongField(term289571, term289571.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term289571, term289571.getClass(), "playerOldRating", 0L);
        setLongField(term289571, term289571.getClass(), "playerNewRating", 0L);
        setIntField(term289571, term289571.getClass(), "banState", 0);
        setLongField(term289571, term289571.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalBasicSync", argTypes, term289571, args);
    }

};


