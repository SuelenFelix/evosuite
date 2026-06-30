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

public class UserDetail_getFrameId_13040211469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200677;

    public UserDetail_getFrameId_13040211469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term200677 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term200677, term200677.getClass(), "id", 0L);
        setField(term200677, term200677.getClass(), "card", null);
        setField(term200677, term200677.getClass(), "userName", null);
        setIntField(term200677, term200677.getClass(), "isNetMember", 0);
        setIntField(term200677, term200677.getClass(), "iconId", 0);
        setIntField(term200677, term200677.getClass(), "plateId", 0);
        setIntField(term200677, term200677.getClass(), "titleId", 0);
        setIntField(term200677, term200677.getClass(), "partnerId", 0);
        setIntField(term200677, term200677.getClass(), "frameId", 0);
        setIntField(term200677, term200677.getClass(), "selectMapId", 0);
        setIntField(term200677, term200677.getClass(), "totalAwake", 0);
        setIntField(term200677, term200677.getClass(), "gradeRating", 0);
        setIntField(term200677, term200677.getClass(), "musicRating", 0);
        setIntField(term200677, term200677.getClass(), "playerRating", 0);
        setIntField(term200677, term200677.getClass(), "highestRating", 0);
        setIntField(term200677, term200677.getClass(), "gradeRank", 0);
        setIntField(term200677, term200677.getClass(), "classRank", 0);
        setIntField(term200677, term200677.getClass(), "courseRank", 0);
        setField(term200677, term200677.getClass(), "charaSlot", null);
        setField(term200677, term200677.getClass(), "charaLockSlot", null);
        setLongField(term200677, term200677.getClass(), "contentBit", 0L);
        setIntField(term200677, term200677.getClass(), "playCount", 0);
        setField(term200677, term200677.getClass(), "eventWatchedDate", null);
        setField(term200677, term200677.getClass(), "lastGameId", null);
        setField(term200677, term200677.getClass(), "lastRomVersion", null);
        setField(term200677, term200677.getClass(), "lastDataVersion", null);
        setField(term200677, term200677.getClass(), "lastLoginDate", null);
        setField(term200677, term200677.getClass(), "lastPlayDate", null);
        setIntField(term200677, term200677.getClass(), "lastPlayCredit", 0);
        setIntField(term200677, term200677.getClass(), "lastPlayMode", 0);
        setIntField(term200677, term200677.getClass(), "lastPlaceId", 0);
        setField(term200677, term200677.getClass(), "lastPlaceName", null);
        setIntField(term200677, term200677.getClass(), "lastAllNetId", 0);
        setIntField(term200677, term200677.getClass(), "lastRegionId", 0);
        setField(term200677, term200677.getClass(), "lastRegionName", null);
        setField(term200677, term200677.getClass(), "lastClientId", null);
        setField(term200677, term200677.getClass(), "lastCountryCode", null);
        setIntField(term200677, term200677.getClass(), "lastSelectEMoney", 0);
        setIntField(term200677, term200677.getClass(), "lastSelectTicket", 0);
        setIntField(term200677, term200677.getClass(), "lastSelectCourse", 0);
        setIntField(term200677, term200677.getClass(), "lastCountCourse", 0);
        setField(term200677, term200677.getClass(), "firstGameId", null);
        setField(term200677, term200677.getClass(), "firstRomVersion", null);
        setField(term200677, term200677.getClass(), "firstDataVersion", null);
        setField(term200677, term200677.getClass(), "firstPlayDate", null);
        setField(term200677, term200677.getClass(), "compatibleCmVersion", null);
        setField(term200677, term200677.getClass(), "dailyBonusDate", null);
        setField(term200677, term200677.getClass(), "dailyCourseBonusDate", null);
        setField(term200677, term200677.getClass(), "lastPairLoginDate", null);
        setField(term200677, term200677.getClass(), "lastTrialPlayDate", null);
        setIntField(term200677, term200677.getClass(), "playVsCount", 0);
        setIntField(term200677, term200677.getClass(), "playSyncCount", 0);
        setIntField(term200677, term200677.getClass(), "winCount", 0);
        setIntField(term200677, term200677.getClass(), "helpCount", 0);
        setIntField(term200677, term200677.getClass(), "comboCount", 0);
        setLongField(term200677, term200677.getClass(), "totalDeluxscore", 0L);
        setLongField(term200677, term200677.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term200677, term200677.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term200677, term200677.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term200677, term200677.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term200677, term200677.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term200677, term200677.getClass(), "totalSync", 0);
        setIntField(term200677, term200677.getClass(), "totalBasicSync", 0);
        setIntField(term200677, term200677.getClass(), "totalAdvancedSync", 0);
        setIntField(term200677, term200677.getClass(), "totalExpertSync", 0);
        setIntField(term200677, term200677.getClass(), "totalMasterSync", 0);
        setIntField(term200677, term200677.getClass(), "totalReMasterSync", 0);
        setLongField(term200677, term200677.getClass(), "totalAchievement", 0L);
        setLongField(term200677, term200677.getClass(), "totalBasicAchievement", 0L);
        setLongField(term200677, term200677.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term200677, term200677.getClass(), "totalExpertAchievement", 0L);
        setLongField(term200677, term200677.getClass(), "totalMasterAchievement", 0L);
        setLongField(term200677, term200677.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term200677, term200677.getClass(), "playerOldRating", 0L);
        setLongField(term200677, term200677.getClass(), "playerNewRating", 0L);
        setIntField(term200677, term200677.getClass(), "banState", 0);
        setLongField(term200677, term200677.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFrameId", argTypes, term200677, args);
    }

};


