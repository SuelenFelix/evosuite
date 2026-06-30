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

public class UserDetail_getLastPlaceName_250597843191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287866;

    public UserDetail_getLastPlaceName_250597843191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287866 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term287866, term287866.getClass(), "id", 0L);
        setField(term287866, term287866.getClass(), "card", null);
        setField(term287866, term287866.getClass(), "userName", null);
        setIntField(term287866, term287866.getClass(), "isNetMember", 0);
        setIntField(term287866, term287866.getClass(), "iconId", 0);
        setIntField(term287866, term287866.getClass(), "plateId", 0);
        setIntField(term287866, term287866.getClass(), "titleId", 0);
        setIntField(term287866, term287866.getClass(), "partnerId", 0);
        setIntField(term287866, term287866.getClass(), "frameId", 0);
        setIntField(term287866, term287866.getClass(), "selectMapId", 0);
        setIntField(term287866, term287866.getClass(), "totalAwake", 0);
        setIntField(term287866, term287866.getClass(), "gradeRating", 0);
        setIntField(term287866, term287866.getClass(), "musicRating", 0);
        setIntField(term287866, term287866.getClass(), "playerRating", 0);
        setIntField(term287866, term287866.getClass(), "highestRating", 0);
        setIntField(term287866, term287866.getClass(), "gradeRank", 0);
        setIntField(term287866, term287866.getClass(), "classRank", 0);
        setIntField(term287866, term287866.getClass(), "courseRank", 0);
        setField(term287866, term287866.getClass(), "charaSlot", null);
        setField(term287866, term287866.getClass(), "charaLockSlot", null);
        setLongField(term287866, term287866.getClass(), "contentBit", 0L);
        setIntField(term287866, term287866.getClass(), "playCount", 0);
        setField(term287866, term287866.getClass(), "eventWatchedDate", null);
        setField(term287866, term287866.getClass(), "lastGameId", null);
        setField(term287866, term287866.getClass(), "lastRomVersion", null);
        setField(term287866, term287866.getClass(), "lastDataVersion", null);
        setField(term287866, term287866.getClass(), "lastLoginDate", null);
        setField(term287866, term287866.getClass(), "lastPlayDate", null);
        setIntField(term287866, term287866.getClass(), "lastPlayCredit", 0);
        setIntField(term287866, term287866.getClass(), "lastPlayMode", 0);
        setIntField(term287866, term287866.getClass(), "lastPlaceId", 0);
        setField(term287866, term287866.getClass(), "lastPlaceName", null);
        setIntField(term287866, term287866.getClass(), "lastAllNetId", 0);
        setIntField(term287866, term287866.getClass(), "lastRegionId", 0);
        setField(term287866, term287866.getClass(), "lastRegionName", null);
        setField(term287866, term287866.getClass(), "lastClientId", null);
        setField(term287866, term287866.getClass(), "lastCountryCode", null);
        setIntField(term287866, term287866.getClass(), "lastSelectEMoney", 0);
        setIntField(term287866, term287866.getClass(), "lastSelectTicket", 0);
        setIntField(term287866, term287866.getClass(), "lastSelectCourse", 0);
        setIntField(term287866, term287866.getClass(), "lastCountCourse", 0);
        setField(term287866, term287866.getClass(), "firstGameId", null);
        setField(term287866, term287866.getClass(), "firstRomVersion", null);
        setField(term287866, term287866.getClass(), "firstDataVersion", null);
        setField(term287866, term287866.getClass(), "firstPlayDate", null);
        setField(term287866, term287866.getClass(), "compatibleCmVersion", null);
        setField(term287866, term287866.getClass(), "dailyBonusDate", null);
        setField(term287866, term287866.getClass(), "dailyCourseBonusDate", null);
        setField(term287866, term287866.getClass(), "lastPairLoginDate", null);
        setField(term287866, term287866.getClass(), "lastTrialPlayDate", null);
        setIntField(term287866, term287866.getClass(), "playVsCount", 0);
        setIntField(term287866, term287866.getClass(), "playSyncCount", 0);
        setIntField(term287866, term287866.getClass(), "winCount", 0);
        setIntField(term287866, term287866.getClass(), "helpCount", 0);
        setIntField(term287866, term287866.getClass(), "comboCount", 0);
        setLongField(term287866, term287866.getClass(), "totalDeluxscore", 0L);
        setLongField(term287866, term287866.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term287866, term287866.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term287866, term287866.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term287866, term287866.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term287866, term287866.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term287866, term287866.getClass(), "totalSync", 0);
        setIntField(term287866, term287866.getClass(), "totalBasicSync", 0);
        setIntField(term287866, term287866.getClass(), "totalAdvancedSync", 0);
        setIntField(term287866, term287866.getClass(), "totalExpertSync", 0);
        setIntField(term287866, term287866.getClass(), "totalMasterSync", 0);
        setIntField(term287866, term287866.getClass(), "totalReMasterSync", 0);
        setLongField(term287866, term287866.getClass(), "totalAchievement", 0L);
        setLongField(term287866, term287866.getClass(), "totalBasicAchievement", 0L);
        setLongField(term287866, term287866.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term287866, term287866.getClass(), "totalExpertAchievement", 0L);
        setLongField(term287866, term287866.getClass(), "totalMasterAchievement", 0L);
        setLongField(term287866, term287866.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term287866, term287866.getClass(), "playerOldRating", 0L);
        setLongField(term287866, term287866.getClass(), "playerNewRating", 0L);
        setIntField(term287866, term287866.getClass(), "banState", 0);
        setLongField(term287866, term287866.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlaceName", argTypes, term287866, args);
    }

};


