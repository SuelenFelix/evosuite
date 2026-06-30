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

public class UserDetail_getDailyBonusDate_603466135206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288691;

    public UserDetail_getDailyBonusDate_603466135206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288691 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term288691, term288691.getClass(), "id", 0L);
        setField(term288691, term288691.getClass(), "card", null);
        setField(term288691, term288691.getClass(), "userName", null);
        setIntField(term288691, term288691.getClass(), "isNetMember", 0);
        setIntField(term288691, term288691.getClass(), "iconId", 0);
        setIntField(term288691, term288691.getClass(), "plateId", 0);
        setIntField(term288691, term288691.getClass(), "titleId", 0);
        setIntField(term288691, term288691.getClass(), "partnerId", 0);
        setIntField(term288691, term288691.getClass(), "frameId", 0);
        setIntField(term288691, term288691.getClass(), "selectMapId", 0);
        setIntField(term288691, term288691.getClass(), "totalAwake", 0);
        setIntField(term288691, term288691.getClass(), "gradeRating", 0);
        setIntField(term288691, term288691.getClass(), "musicRating", 0);
        setIntField(term288691, term288691.getClass(), "playerRating", 0);
        setIntField(term288691, term288691.getClass(), "highestRating", 0);
        setIntField(term288691, term288691.getClass(), "gradeRank", 0);
        setIntField(term288691, term288691.getClass(), "classRank", 0);
        setIntField(term288691, term288691.getClass(), "courseRank", 0);
        setField(term288691, term288691.getClass(), "charaSlot", null);
        setField(term288691, term288691.getClass(), "charaLockSlot", null);
        setLongField(term288691, term288691.getClass(), "contentBit", 0L);
        setIntField(term288691, term288691.getClass(), "playCount", 0);
        setField(term288691, term288691.getClass(), "eventWatchedDate", null);
        setField(term288691, term288691.getClass(), "lastGameId", null);
        setField(term288691, term288691.getClass(), "lastRomVersion", null);
        setField(term288691, term288691.getClass(), "lastDataVersion", null);
        setField(term288691, term288691.getClass(), "lastLoginDate", null);
        setField(term288691, term288691.getClass(), "lastPlayDate", null);
        setIntField(term288691, term288691.getClass(), "lastPlayCredit", 0);
        setIntField(term288691, term288691.getClass(), "lastPlayMode", 0);
        setIntField(term288691, term288691.getClass(), "lastPlaceId", 0);
        setField(term288691, term288691.getClass(), "lastPlaceName", null);
        setIntField(term288691, term288691.getClass(), "lastAllNetId", 0);
        setIntField(term288691, term288691.getClass(), "lastRegionId", 0);
        setField(term288691, term288691.getClass(), "lastRegionName", null);
        setField(term288691, term288691.getClass(), "lastClientId", null);
        setField(term288691, term288691.getClass(), "lastCountryCode", null);
        setIntField(term288691, term288691.getClass(), "lastSelectEMoney", 0);
        setIntField(term288691, term288691.getClass(), "lastSelectTicket", 0);
        setIntField(term288691, term288691.getClass(), "lastSelectCourse", 0);
        setIntField(term288691, term288691.getClass(), "lastCountCourse", 0);
        setField(term288691, term288691.getClass(), "firstGameId", null);
        setField(term288691, term288691.getClass(), "firstRomVersion", null);
        setField(term288691, term288691.getClass(), "firstDataVersion", null);
        setField(term288691, term288691.getClass(), "firstPlayDate", null);
        setField(term288691, term288691.getClass(), "compatibleCmVersion", null);
        setField(term288691, term288691.getClass(), "dailyBonusDate", null);
        setField(term288691, term288691.getClass(), "dailyCourseBonusDate", null);
        setField(term288691, term288691.getClass(), "lastPairLoginDate", null);
        setField(term288691, term288691.getClass(), "lastTrialPlayDate", null);
        setIntField(term288691, term288691.getClass(), "playVsCount", 0);
        setIntField(term288691, term288691.getClass(), "playSyncCount", 0);
        setIntField(term288691, term288691.getClass(), "winCount", 0);
        setIntField(term288691, term288691.getClass(), "helpCount", 0);
        setIntField(term288691, term288691.getClass(), "comboCount", 0);
        setLongField(term288691, term288691.getClass(), "totalDeluxscore", 0L);
        setLongField(term288691, term288691.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term288691, term288691.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term288691, term288691.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term288691, term288691.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term288691, term288691.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term288691, term288691.getClass(), "totalSync", 0);
        setIntField(term288691, term288691.getClass(), "totalBasicSync", 0);
        setIntField(term288691, term288691.getClass(), "totalAdvancedSync", 0);
        setIntField(term288691, term288691.getClass(), "totalExpertSync", 0);
        setIntField(term288691, term288691.getClass(), "totalMasterSync", 0);
        setIntField(term288691, term288691.getClass(), "totalReMasterSync", 0);
        setLongField(term288691, term288691.getClass(), "totalAchievement", 0L);
        setLongField(term288691, term288691.getClass(), "totalBasicAchievement", 0L);
        setLongField(term288691, term288691.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term288691, term288691.getClass(), "totalExpertAchievement", 0L);
        setLongField(term288691, term288691.getClass(), "totalMasterAchievement", 0L);
        setLongField(term288691, term288691.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term288691, term288691.getClass(), "playerOldRating", 0L);
        setLongField(term288691, term288691.getClass(), "playerNewRating", 0L);
        setIntField(term288691, term288691.getClass(), "banState", 0);
        setLongField(term288691, term288691.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDailyBonusDate", argTypes, term288691, args);
    }

};


