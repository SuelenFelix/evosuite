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

public class UserDetail_getTotalSync_602476303221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289516;

    public UserDetail_getTotalSync_602476303221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289516 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term289516, term289516.getClass(), "id", 0L);
        setField(term289516, term289516.getClass(), "card", null);
        setField(term289516, term289516.getClass(), "userName", null);
        setIntField(term289516, term289516.getClass(), "isNetMember", 0);
        setIntField(term289516, term289516.getClass(), "iconId", 0);
        setIntField(term289516, term289516.getClass(), "plateId", 0);
        setIntField(term289516, term289516.getClass(), "titleId", 0);
        setIntField(term289516, term289516.getClass(), "partnerId", 0);
        setIntField(term289516, term289516.getClass(), "frameId", 0);
        setIntField(term289516, term289516.getClass(), "selectMapId", 0);
        setIntField(term289516, term289516.getClass(), "totalAwake", 0);
        setIntField(term289516, term289516.getClass(), "gradeRating", 0);
        setIntField(term289516, term289516.getClass(), "musicRating", 0);
        setIntField(term289516, term289516.getClass(), "playerRating", 0);
        setIntField(term289516, term289516.getClass(), "highestRating", 0);
        setIntField(term289516, term289516.getClass(), "gradeRank", 0);
        setIntField(term289516, term289516.getClass(), "classRank", 0);
        setIntField(term289516, term289516.getClass(), "courseRank", 0);
        setField(term289516, term289516.getClass(), "charaSlot", null);
        setField(term289516, term289516.getClass(), "charaLockSlot", null);
        setLongField(term289516, term289516.getClass(), "contentBit", 0L);
        setIntField(term289516, term289516.getClass(), "playCount", 0);
        setField(term289516, term289516.getClass(), "eventWatchedDate", null);
        setField(term289516, term289516.getClass(), "lastGameId", null);
        setField(term289516, term289516.getClass(), "lastRomVersion", null);
        setField(term289516, term289516.getClass(), "lastDataVersion", null);
        setField(term289516, term289516.getClass(), "lastLoginDate", null);
        setField(term289516, term289516.getClass(), "lastPlayDate", null);
        setIntField(term289516, term289516.getClass(), "lastPlayCredit", 0);
        setIntField(term289516, term289516.getClass(), "lastPlayMode", 0);
        setIntField(term289516, term289516.getClass(), "lastPlaceId", 0);
        setField(term289516, term289516.getClass(), "lastPlaceName", null);
        setIntField(term289516, term289516.getClass(), "lastAllNetId", 0);
        setIntField(term289516, term289516.getClass(), "lastRegionId", 0);
        setField(term289516, term289516.getClass(), "lastRegionName", null);
        setField(term289516, term289516.getClass(), "lastClientId", null);
        setField(term289516, term289516.getClass(), "lastCountryCode", null);
        setIntField(term289516, term289516.getClass(), "lastSelectEMoney", 0);
        setIntField(term289516, term289516.getClass(), "lastSelectTicket", 0);
        setIntField(term289516, term289516.getClass(), "lastSelectCourse", 0);
        setIntField(term289516, term289516.getClass(), "lastCountCourse", 0);
        setField(term289516, term289516.getClass(), "firstGameId", null);
        setField(term289516, term289516.getClass(), "firstRomVersion", null);
        setField(term289516, term289516.getClass(), "firstDataVersion", null);
        setField(term289516, term289516.getClass(), "firstPlayDate", null);
        setField(term289516, term289516.getClass(), "compatibleCmVersion", null);
        setField(term289516, term289516.getClass(), "dailyBonusDate", null);
        setField(term289516, term289516.getClass(), "dailyCourseBonusDate", null);
        setField(term289516, term289516.getClass(), "lastPairLoginDate", null);
        setField(term289516, term289516.getClass(), "lastTrialPlayDate", null);
        setIntField(term289516, term289516.getClass(), "playVsCount", 0);
        setIntField(term289516, term289516.getClass(), "playSyncCount", 0);
        setIntField(term289516, term289516.getClass(), "winCount", 0);
        setIntField(term289516, term289516.getClass(), "helpCount", 0);
        setIntField(term289516, term289516.getClass(), "comboCount", 0);
        setLongField(term289516, term289516.getClass(), "totalDeluxscore", 0L);
        setLongField(term289516, term289516.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term289516, term289516.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term289516, term289516.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term289516, term289516.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term289516, term289516.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term289516, term289516.getClass(), "totalSync", 0);
        setIntField(term289516, term289516.getClass(), "totalBasicSync", 0);
        setIntField(term289516, term289516.getClass(), "totalAdvancedSync", 0);
        setIntField(term289516, term289516.getClass(), "totalExpertSync", 0);
        setIntField(term289516, term289516.getClass(), "totalMasterSync", 0);
        setIntField(term289516, term289516.getClass(), "totalReMasterSync", 0);
        setLongField(term289516, term289516.getClass(), "totalAchievement", 0L);
        setLongField(term289516, term289516.getClass(), "totalBasicAchievement", 0L);
        setLongField(term289516, term289516.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term289516, term289516.getClass(), "totalExpertAchievement", 0L);
        setLongField(term289516, term289516.getClass(), "totalMasterAchievement", 0L);
        setLongField(term289516, term289516.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term289516, term289516.getClass(), "playerOldRating", 0L);
        setLongField(term289516, term289516.getClass(), "playerNewRating", 0L);
        setIntField(term289516, term289516.getClass(), "banState", 0);
        setLongField(term289516, term289516.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalSync", argTypes, term289516, args);
    }

};


