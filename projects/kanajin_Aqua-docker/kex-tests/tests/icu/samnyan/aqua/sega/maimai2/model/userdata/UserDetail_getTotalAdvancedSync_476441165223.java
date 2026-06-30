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

public class UserDetail_getTotalAdvancedSync_476441165223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289626;

    public UserDetail_getTotalAdvancedSync_476441165223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289626 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term289626, term289626.getClass(), "id", 0L);
        setField(term289626, term289626.getClass(), "card", null);
        setField(term289626, term289626.getClass(), "userName", null);
        setIntField(term289626, term289626.getClass(), "isNetMember", 0);
        setIntField(term289626, term289626.getClass(), "iconId", 0);
        setIntField(term289626, term289626.getClass(), "plateId", 0);
        setIntField(term289626, term289626.getClass(), "titleId", 0);
        setIntField(term289626, term289626.getClass(), "partnerId", 0);
        setIntField(term289626, term289626.getClass(), "frameId", 0);
        setIntField(term289626, term289626.getClass(), "selectMapId", 0);
        setIntField(term289626, term289626.getClass(), "totalAwake", 0);
        setIntField(term289626, term289626.getClass(), "gradeRating", 0);
        setIntField(term289626, term289626.getClass(), "musicRating", 0);
        setIntField(term289626, term289626.getClass(), "playerRating", 0);
        setIntField(term289626, term289626.getClass(), "highestRating", 0);
        setIntField(term289626, term289626.getClass(), "gradeRank", 0);
        setIntField(term289626, term289626.getClass(), "classRank", 0);
        setIntField(term289626, term289626.getClass(), "courseRank", 0);
        setField(term289626, term289626.getClass(), "charaSlot", null);
        setField(term289626, term289626.getClass(), "charaLockSlot", null);
        setLongField(term289626, term289626.getClass(), "contentBit", 0L);
        setIntField(term289626, term289626.getClass(), "playCount", 0);
        setField(term289626, term289626.getClass(), "eventWatchedDate", null);
        setField(term289626, term289626.getClass(), "lastGameId", null);
        setField(term289626, term289626.getClass(), "lastRomVersion", null);
        setField(term289626, term289626.getClass(), "lastDataVersion", null);
        setField(term289626, term289626.getClass(), "lastLoginDate", null);
        setField(term289626, term289626.getClass(), "lastPlayDate", null);
        setIntField(term289626, term289626.getClass(), "lastPlayCredit", 0);
        setIntField(term289626, term289626.getClass(), "lastPlayMode", 0);
        setIntField(term289626, term289626.getClass(), "lastPlaceId", 0);
        setField(term289626, term289626.getClass(), "lastPlaceName", null);
        setIntField(term289626, term289626.getClass(), "lastAllNetId", 0);
        setIntField(term289626, term289626.getClass(), "lastRegionId", 0);
        setField(term289626, term289626.getClass(), "lastRegionName", null);
        setField(term289626, term289626.getClass(), "lastClientId", null);
        setField(term289626, term289626.getClass(), "lastCountryCode", null);
        setIntField(term289626, term289626.getClass(), "lastSelectEMoney", 0);
        setIntField(term289626, term289626.getClass(), "lastSelectTicket", 0);
        setIntField(term289626, term289626.getClass(), "lastSelectCourse", 0);
        setIntField(term289626, term289626.getClass(), "lastCountCourse", 0);
        setField(term289626, term289626.getClass(), "firstGameId", null);
        setField(term289626, term289626.getClass(), "firstRomVersion", null);
        setField(term289626, term289626.getClass(), "firstDataVersion", null);
        setField(term289626, term289626.getClass(), "firstPlayDate", null);
        setField(term289626, term289626.getClass(), "compatibleCmVersion", null);
        setField(term289626, term289626.getClass(), "dailyBonusDate", null);
        setField(term289626, term289626.getClass(), "dailyCourseBonusDate", null);
        setField(term289626, term289626.getClass(), "lastPairLoginDate", null);
        setField(term289626, term289626.getClass(), "lastTrialPlayDate", null);
        setIntField(term289626, term289626.getClass(), "playVsCount", 0);
        setIntField(term289626, term289626.getClass(), "playSyncCount", 0);
        setIntField(term289626, term289626.getClass(), "winCount", 0);
        setIntField(term289626, term289626.getClass(), "helpCount", 0);
        setIntField(term289626, term289626.getClass(), "comboCount", 0);
        setLongField(term289626, term289626.getClass(), "totalDeluxscore", 0L);
        setLongField(term289626, term289626.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term289626, term289626.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term289626, term289626.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term289626, term289626.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term289626, term289626.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term289626, term289626.getClass(), "totalSync", 0);
        setIntField(term289626, term289626.getClass(), "totalBasicSync", 0);
        setIntField(term289626, term289626.getClass(), "totalAdvancedSync", 0);
        setIntField(term289626, term289626.getClass(), "totalExpertSync", 0);
        setIntField(term289626, term289626.getClass(), "totalMasterSync", 0);
        setIntField(term289626, term289626.getClass(), "totalReMasterSync", 0);
        setLongField(term289626, term289626.getClass(), "totalAchievement", 0L);
        setLongField(term289626, term289626.getClass(), "totalBasicAchievement", 0L);
        setLongField(term289626, term289626.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term289626, term289626.getClass(), "totalExpertAchievement", 0L);
        setLongField(term289626, term289626.getClass(), "totalMasterAchievement", 0L);
        setLongField(term289626, term289626.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term289626, term289626.getClass(), "playerOldRating", 0L);
        setLongField(term289626, term289626.getClass(), "playerNewRating", 0L);
        setIntField(term289626, term289626.getClass(), "banState", 0);
        setLongField(term289626, term289626.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalAdvancedSync", argTypes, term289626, args);
    }

};


