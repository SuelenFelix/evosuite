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

public class UserDetail_getLastDataVersion_1425892497185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287536;

    public UserDetail_getLastDataVersion_1425892497185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287536 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term287536, term287536.getClass(), "id", 0L);
        setField(term287536, term287536.getClass(), "card", null);
        setField(term287536, term287536.getClass(), "userName", null);
        setIntField(term287536, term287536.getClass(), "isNetMember", 0);
        setIntField(term287536, term287536.getClass(), "iconId", 0);
        setIntField(term287536, term287536.getClass(), "plateId", 0);
        setIntField(term287536, term287536.getClass(), "titleId", 0);
        setIntField(term287536, term287536.getClass(), "partnerId", 0);
        setIntField(term287536, term287536.getClass(), "frameId", 0);
        setIntField(term287536, term287536.getClass(), "selectMapId", 0);
        setIntField(term287536, term287536.getClass(), "totalAwake", 0);
        setIntField(term287536, term287536.getClass(), "gradeRating", 0);
        setIntField(term287536, term287536.getClass(), "musicRating", 0);
        setIntField(term287536, term287536.getClass(), "playerRating", 0);
        setIntField(term287536, term287536.getClass(), "highestRating", 0);
        setIntField(term287536, term287536.getClass(), "gradeRank", 0);
        setIntField(term287536, term287536.getClass(), "classRank", 0);
        setIntField(term287536, term287536.getClass(), "courseRank", 0);
        setField(term287536, term287536.getClass(), "charaSlot", null);
        setField(term287536, term287536.getClass(), "charaLockSlot", null);
        setLongField(term287536, term287536.getClass(), "contentBit", 0L);
        setIntField(term287536, term287536.getClass(), "playCount", 0);
        setField(term287536, term287536.getClass(), "eventWatchedDate", null);
        setField(term287536, term287536.getClass(), "lastGameId", null);
        setField(term287536, term287536.getClass(), "lastRomVersion", null);
        setField(term287536, term287536.getClass(), "lastDataVersion", null);
        setField(term287536, term287536.getClass(), "lastLoginDate", null);
        setField(term287536, term287536.getClass(), "lastPlayDate", null);
        setIntField(term287536, term287536.getClass(), "lastPlayCredit", 0);
        setIntField(term287536, term287536.getClass(), "lastPlayMode", 0);
        setIntField(term287536, term287536.getClass(), "lastPlaceId", 0);
        setField(term287536, term287536.getClass(), "lastPlaceName", null);
        setIntField(term287536, term287536.getClass(), "lastAllNetId", 0);
        setIntField(term287536, term287536.getClass(), "lastRegionId", 0);
        setField(term287536, term287536.getClass(), "lastRegionName", null);
        setField(term287536, term287536.getClass(), "lastClientId", null);
        setField(term287536, term287536.getClass(), "lastCountryCode", null);
        setIntField(term287536, term287536.getClass(), "lastSelectEMoney", 0);
        setIntField(term287536, term287536.getClass(), "lastSelectTicket", 0);
        setIntField(term287536, term287536.getClass(), "lastSelectCourse", 0);
        setIntField(term287536, term287536.getClass(), "lastCountCourse", 0);
        setField(term287536, term287536.getClass(), "firstGameId", null);
        setField(term287536, term287536.getClass(), "firstRomVersion", null);
        setField(term287536, term287536.getClass(), "firstDataVersion", null);
        setField(term287536, term287536.getClass(), "firstPlayDate", null);
        setField(term287536, term287536.getClass(), "compatibleCmVersion", null);
        setField(term287536, term287536.getClass(), "dailyBonusDate", null);
        setField(term287536, term287536.getClass(), "dailyCourseBonusDate", null);
        setField(term287536, term287536.getClass(), "lastPairLoginDate", null);
        setField(term287536, term287536.getClass(), "lastTrialPlayDate", null);
        setIntField(term287536, term287536.getClass(), "playVsCount", 0);
        setIntField(term287536, term287536.getClass(), "playSyncCount", 0);
        setIntField(term287536, term287536.getClass(), "winCount", 0);
        setIntField(term287536, term287536.getClass(), "helpCount", 0);
        setIntField(term287536, term287536.getClass(), "comboCount", 0);
        setLongField(term287536, term287536.getClass(), "totalDeluxscore", 0L);
        setLongField(term287536, term287536.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term287536, term287536.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term287536, term287536.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term287536, term287536.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term287536, term287536.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term287536, term287536.getClass(), "totalSync", 0);
        setIntField(term287536, term287536.getClass(), "totalBasicSync", 0);
        setIntField(term287536, term287536.getClass(), "totalAdvancedSync", 0);
        setIntField(term287536, term287536.getClass(), "totalExpertSync", 0);
        setIntField(term287536, term287536.getClass(), "totalMasterSync", 0);
        setIntField(term287536, term287536.getClass(), "totalReMasterSync", 0);
        setLongField(term287536, term287536.getClass(), "totalAchievement", 0L);
        setLongField(term287536, term287536.getClass(), "totalBasicAchievement", 0L);
        setLongField(term287536, term287536.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term287536, term287536.getClass(), "totalExpertAchievement", 0L);
        setLongField(term287536, term287536.getClass(), "totalMasterAchievement", 0L);
        setLongField(term287536, term287536.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term287536, term287536.getClass(), "playerOldRating", 0L);
        setLongField(term287536, term287536.getClass(), "playerNewRating", 0L);
        setIntField(term287536, term287536.getClass(), "banState", 0);
        setLongField(term287536, term287536.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastDataVersion", argTypes, term287536, args);
    }

};


