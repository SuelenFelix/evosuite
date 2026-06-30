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

public class UserDetail_getTotalBasicAchievement_728912407228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289901;

    public UserDetail_getTotalBasicAchievement_728912407228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289901 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term289901, term289901.getClass(), "id", 0L);
        setField(term289901, term289901.getClass(), "card", null);
        setField(term289901, term289901.getClass(), "userName", null);
        setIntField(term289901, term289901.getClass(), "isNetMember", 0);
        setIntField(term289901, term289901.getClass(), "iconId", 0);
        setIntField(term289901, term289901.getClass(), "plateId", 0);
        setIntField(term289901, term289901.getClass(), "titleId", 0);
        setIntField(term289901, term289901.getClass(), "partnerId", 0);
        setIntField(term289901, term289901.getClass(), "frameId", 0);
        setIntField(term289901, term289901.getClass(), "selectMapId", 0);
        setIntField(term289901, term289901.getClass(), "totalAwake", 0);
        setIntField(term289901, term289901.getClass(), "gradeRating", 0);
        setIntField(term289901, term289901.getClass(), "musicRating", 0);
        setIntField(term289901, term289901.getClass(), "playerRating", 0);
        setIntField(term289901, term289901.getClass(), "highestRating", 0);
        setIntField(term289901, term289901.getClass(), "gradeRank", 0);
        setIntField(term289901, term289901.getClass(), "classRank", 0);
        setIntField(term289901, term289901.getClass(), "courseRank", 0);
        setField(term289901, term289901.getClass(), "charaSlot", null);
        setField(term289901, term289901.getClass(), "charaLockSlot", null);
        setLongField(term289901, term289901.getClass(), "contentBit", 0L);
        setIntField(term289901, term289901.getClass(), "playCount", 0);
        setField(term289901, term289901.getClass(), "eventWatchedDate", null);
        setField(term289901, term289901.getClass(), "lastGameId", null);
        setField(term289901, term289901.getClass(), "lastRomVersion", null);
        setField(term289901, term289901.getClass(), "lastDataVersion", null);
        setField(term289901, term289901.getClass(), "lastLoginDate", null);
        setField(term289901, term289901.getClass(), "lastPlayDate", null);
        setIntField(term289901, term289901.getClass(), "lastPlayCredit", 0);
        setIntField(term289901, term289901.getClass(), "lastPlayMode", 0);
        setIntField(term289901, term289901.getClass(), "lastPlaceId", 0);
        setField(term289901, term289901.getClass(), "lastPlaceName", null);
        setIntField(term289901, term289901.getClass(), "lastAllNetId", 0);
        setIntField(term289901, term289901.getClass(), "lastRegionId", 0);
        setField(term289901, term289901.getClass(), "lastRegionName", null);
        setField(term289901, term289901.getClass(), "lastClientId", null);
        setField(term289901, term289901.getClass(), "lastCountryCode", null);
        setIntField(term289901, term289901.getClass(), "lastSelectEMoney", 0);
        setIntField(term289901, term289901.getClass(), "lastSelectTicket", 0);
        setIntField(term289901, term289901.getClass(), "lastSelectCourse", 0);
        setIntField(term289901, term289901.getClass(), "lastCountCourse", 0);
        setField(term289901, term289901.getClass(), "firstGameId", null);
        setField(term289901, term289901.getClass(), "firstRomVersion", null);
        setField(term289901, term289901.getClass(), "firstDataVersion", null);
        setField(term289901, term289901.getClass(), "firstPlayDate", null);
        setField(term289901, term289901.getClass(), "compatibleCmVersion", null);
        setField(term289901, term289901.getClass(), "dailyBonusDate", null);
        setField(term289901, term289901.getClass(), "dailyCourseBonusDate", null);
        setField(term289901, term289901.getClass(), "lastPairLoginDate", null);
        setField(term289901, term289901.getClass(), "lastTrialPlayDate", null);
        setIntField(term289901, term289901.getClass(), "playVsCount", 0);
        setIntField(term289901, term289901.getClass(), "playSyncCount", 0);
        setIntField(term289901, term289901.getClass(), "winCount", 0);
        setIntField(term289901, term289901.getClass(), "helpCount", 0);
        setIntField(term289901, term289901.getClass(), "comboCount", 0);
        setLongField(term289901, term289901.getClass(), "totalDeluxscore", 0L);
        setLongField(term289901, term289901.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term289901, term289901.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term289901, term289901.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term289901, term289901.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term289901, term289901.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term289901, term289901.getClass(), "totalSync", 0);
        setIntField(term289901, term289901.getClass(), "totalBasicSync", 0);
        setIntField(term289901, term289901.getClass(), "totalAdvancedSync", 0);
        setIntField(term289901, term289901.getClass(), "totalExpertSync", 0);
        setIntField(term289901, term289901.getClass(), "totalMasterSync", 0);
        setIntField(term289901, term289901.getClass(), "totalReMasterSync", 0);
        setLongField(term289901, term289901.getClass(), "totalAchievement", 0L);
        setLongField(term289901, term289901.getClass(), "totalBasicAchievement", 0L);
        setLongField(term289901, term289901.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term289901, term289901.getClass(), "totalExpertAchievement", 0L);
        setLongField(term289901, term289901.getClass(), "totalMasterAchievement", 0L);
        setLongField(term289901, term289901.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term289901, term289901.getClass(), "playerOldRating", 0L);
        setLongField(term289901, term289901.getClass(), "playerNewRating", 0L);
        setIntField(term289901, term289901.getClass(), "banState", 0);
        setLongField(term289901, term289901.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalBasicAchievement", argTypes, term289901, args);
    }

};


