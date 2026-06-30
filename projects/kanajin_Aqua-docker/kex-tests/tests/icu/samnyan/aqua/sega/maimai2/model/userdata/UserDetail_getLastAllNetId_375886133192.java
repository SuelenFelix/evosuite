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

public class UserDetail_getLastAllNetId_375886133192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287921;

    public UserDetail_getLastAllNetId_375886133192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287921 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term287921, term287921.getClass(), "id", 0L);
        setField(term287921, term287921.getClass(), "card", null);
        setField(term287921, term287921.getClass(), "userName", null);
        setIntField(term287921, term287921.getClass(), "isNetMember", 0);
        setIntField(term287921, term287921.getClass(), "iconId", 0);
        setIntField(term287921, term287921.getClass(), "plateId", 0);
        setIntField(term287921, term287921.getClass(), "titleId", 0);
        setIntField(term287921, term287921.getClass(), "partnerId", 0);
        setIntField(term287921, term287921.getClass(), "frameId", 0);
        setIntField(term287921, term287921.getClass(), "selectMapId", 0);
        setIntField(term287921, term287921.getClass(), "totalAwake", 0);
        setIntField(term287921, term287921.getClass(), "gradeRating", 0);
        setIntField(term287921, term287921.getClass(), "musicRating", 0);
        setIntField(term287921, term287921.getClass(), "playerRating", 0);
        setIntField(term287921, term287921.getClass(), "highestRating", 0);
        setIntField(term287921, term287921.getClass(), "gradeRank", 0);
        setIntField(term287921, term287921.getClass(), "classRank", 0);
        setIntField(term287921, term287921.getClass(), "courseRank", 0);
        setField(term287921, term287921.getClass(), "charaSlot", null);
        setField(term287921, term287921.getClass(), "charaLockSlot", null);
        setLongField(term287921, term287921.getClass(), "contentBit", 0L);
        setIntField(term287921, term287921.getClass(), "playCount", 0);
        setField(term287921, term287921.getClass(), "eventWatchedDate", null);
        setField(term287921, term287921.getClass(), "lastGameId", null);
        setField(term287921, term287921.getClass(), "lastRomVersion", null);
        setField(term287921, term287921.getClass(), "lastDataVersion", null);
        setField(term287921, term287921.getClass(), "lastLoginDate", null);
        setField(term287921, term287921.getClass(), "lastPlayDate", null);
        setIntField(term287921, term287921.getClass(), "lastPlayCredit", 0);
        setIntField(term287921, term287921.getClass(), "lastPlayMode", 0);
        setIntField(term287921, term287921.getClass(), "lastPlaceId", 0);
        setField(term287921, term287921.getClass(), "lastPlaceName", null);
        setIntField(term287921, term287921.getClass(), "lastAllNetId", 0);
        setIntField(term287921, term287921.getClass(), "lastRegionId", 0);
        setField(term287921, term287921.getClass(), "lastRegionName", null);
        setField(term287921, term287921.getClass(), "lastClientId", null);
        setField(term287921, term287921.getClass(), "lastCountryCode", null);
        setIntField(term287921, term287921.getClass(), "lastSelectEMoney", 0);
        setIntField(term287921, term287921.getClass(), "lastSelectTicket", 0);
        setIntField(term287921, term287921.getClass(), "lastSelectCourse", 0);
        setIntField(term287921, term287921.getClass(), "lastCountCourse", 0);
        setField(term287921, term287921.getClass(), "firstGameId", null);
        setField(term287921, term287921.getClass(), "firstRomVersion", null);
        setField(term287921, term287921.getClass(), "firstDataVersion", null);
        setField(term287921, term287921.getClass(), "firstPlayDate", null);
        setField(term287921, term287921.getClass(), "compatibleCmVersion", null);
        setField(term287921, term287921.getClass(), "dailyBonusDate", null);
        setField(term287921, term287921.getClass(), "dailyCourseBonusDate", null);
        setField(term287921, term287921.getClass(), "lastPairLoginDate", null);
        setField(term287921, term287921.getClass(), "lastTrialPlayDate", null);
        setIntField(term287921, term287921.getClass(), "playVsCount", 0);
        setIntField(term287921, term287921.getClass(), "playSyncCount", 0);
        setIntField(term287921, term287921.getClass(), "winCount", 0);
        setIntField(term287921, term287921.getClass(), "helpCount", 0);
        setIntField(term287921, term287921.getClass(), "comboCount", 0);
        setLongField(term287921, term287921.getClass(), "totalDeluxscore", 0L);
        setLongField(term287921, term287921.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term287921, term287921.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term287921, term287921.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term287921, term287921.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term287921, term287921.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term287921, term287921.getClass(), "totalSync", 0);
        setIntField(term287921, term287921.getClass(), "totalBasicSync", 0);
        setIntField(term287921, term287921.getClass(), "totalAdvancedSync", 0);
        setIntField(term287921, term287921.getClass(), "totalExpertSync", 0);
        setIntField(term287921, term287921.getClass(), "totalMasterSync", 0);
        setIntField(term287921, term287921.getClass(), "totalReMasterSync", 0);
        setLongField(term287921, term287921.getClass(), "totalAchievement", 0L);
        setLongField(term287921, term287921.getClass(), "totalBasicAchievement", 0L);
        setLongField(term287921, term287921.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term287921, term287921.getClass(), "totalExpertAchievement", 0L);
        setLongField(term287921, term287921.getClass(), "totalMasterAchievement", 0L);
        setLongField(term287921, term287921.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term287921, term287921.getClass(), "playerOldRating", 0L);
        setLongField(term287921, term287921.getClass(), "playerNewRating", 0L);
        setIntField(term287921, term287921.getClass(), "banState", 0);
        setLongField(term287921, term287921.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastAllNetId", argTypes, term287921, args);
    }

};


