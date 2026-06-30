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

public class UserDetail_getDateTime_1021440729236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290341;

    public UserDetail_getDateTime_1021440729236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290341 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term290341, term290341.getClass(), "id", 0L);
        setField(term290341, term290341.getClass(), "card", null);
        setField(term290341, term290341.getClass(), "userName", null);
        setIntField(term290341, term290341.getClass(), "isNetMember", 0);
        setIntField(term290341, term290341.getClass(), "iconId", 0);
        setIntField(term290341, term290341.getClass(), "plateId", 0);
        setIntField(term290341, term290341.getClass(), "titleId", 0);
        setIntField(term290341, term290341.getClass(), "partnerId", 0);
        setIntField(term290341, term290341.getClass(), "frameId", 0);
        setIntField(term290341, term290341.getClass(), "selectMapId", 0);
        setIntField(term290341, term290341.getClass(), "totalAwake", 0);
        setIntField(term290341, term290341.getClass(), "gradeRating", 0);
        setIntField(term290341, term290341.getClass(), "musicRating", 0);
        setIntField(term290341, term290341.getClass(), "playerRating", 0);
        setIntField(term290341, term290341.getClass(), "highestRating", 0);
        setIntField(term290341, term290341.getClass(), "gradeRank", 0);
        setIntField(term290341, term290341.getClass(), "classRank", 0);
        setIntField(term290341, term290341.getClass(), "courseRank", 0);
        setField(term290341, term290341.getClass(), "charaSlot", null);
        setField(term290341, term290341.getClass(), "charaLockSlot", null);
        setLongField(term290341, term290341.getClass(), "contentBit", 0L);
        setIntField(term290341, term290341.getClass(), "playCount", 0);
        setField(term290341, term290341.getClass(), "eventWatchedDate", null);
        setField(term290341, term290341.getClass(), "lastGameId", null);
        setField(term290341, term290341.getClass(), "lastRomVersion", null);
        setField(term290341, term290341.getClass(), "lastDataVersion", null);
        setField(term290341, term290341.getClass(), "lastLoginDate", null);
        setField(term290341, term290341.getClass(), "lastPlayDate", null);
        setIntField(term290341, term290341.getClass(), "lastPlayCredit", 0);
        setIntField(term290341, term290341.getClass(), "lastPlayMode", 0);
        setIntField(term290341, term290341.getClass(), "lastPlaceId", 0);
        setField(term290341, term290341.getClass(), "lastPlaceName", null);
        setIntField(term290341, term290341.getClass(), "lastAllNetId", 0);
        setIntField(term290341, term290341.getClass(), "lastRegionId", 0);
        setField(term290341, term290341.getClass(), "lastRegionName", null);
        setField(term290341, term290341.getClass(), "lastClientId", null);
        setField(term290341, term290341.getClass(), "lastCountryCode", null);
        setIntField(term290341, term290341.getClass(), "lastSelectEMoney", 0);
        setIntField(term290341, term290341.getClass(), "lastSelectTicket", 0);
        setIntField(term290341, term290341.getClass(), "lastSelectCourse", 0);
        setIntField(term290341, term290341.getClass(), "lastCountCourse", 0);
        setField(term290341, term290341.getClass(), "firstGameId", null);
        setField(term290341, term290341.getClass(), "firstRomVersion", null);
        setField(term290341, term290341.getClass(), "firstDataVersion", null);
        setField(term290341, term290341.getClass(), "firstPlayDate", null);
        setField(term290341, term290341.getClass(), "compatibleCmVersion", null);
        setField(term290341, term290341.getClass(), "dailyBonusDate", null);
        setField(term290341, term290341.getClass(), "dailyCourseBonusDate", null);
        setField(term290341, term290341.getClass(), "lastPairLoginDate", null);
        setField(term290341, term290341.getClass(), "lastTrialPlayDate", null);
        setIntField(term290341, term290341.getClass(), "playVsCount", 0);
        setIntField(term290341, term290341.getClass(), "playSyncCount", 0);
        setIntField(term290341, term290341.getClass(), "winCount", 0);
        setIntField(term290341, term290341.getClass(), "helpCount", 0);
        setIntField(term290341, term290341.getClass(), "comboCount", 0);
        setLongField(term290341, term290341.getClass(), "totalDeluxscore", 0L);
        setLongField(term290341, term290341.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term290341, term290341.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term290341, term290341.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term290341, term290341.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term290341, term290341.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term290341, term290341.getClass(), "totalSync", 0);
        setIntField(term290341, term290341.getClass(), "totalBasicSync", 0);
        setIntField(term290341, term290341.getClass(), "totalAdvancedSync", 0);
        setIntField(term290341, term290341.getClass(), "totalExpertSync", 0);
        setIntField(term290341, term290341.getClass(), "totalMasterSync", 0);
        setIntField(term290341, term290341.getClass(), "totalReMasterSync", 0);
        setLongField(term290341, term290341.getClass(), "totalAchievement", 0L);
        setLongField(term290341, term290341.getClass(), "totalBasicAchievement", 0L);
        setLongField(term290341, term290341.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term290341, term290341.getClass(), "totalExpertAchievement", 0L);
        setLongField(term290341, term290341.getClass(), "totalMasterAchievement", 0L);
        setLongField(term290341, term290341.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term290341, term290341.getClass(), "playerOldRating", 0L);
        setLongField(term290341, term290341.getClass(), "playerNewRating", 0L);
        setIntField(term290341, term290341.getClass(), "banState", 0);
        setLongField(term290341, term290341.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDateTime", argTypes, term290341, args);
    }

};


