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

public class UserDetail_getLastTrialPlayDate_356574297209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288856;

    public UserDetail_getLastTrialPlayDate_356574297209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288856 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term288856, term288856.getClass(), "id", 0L);
        setField(term288856, term288856.getClass(), "card", null);
        setField(term288856, term288856.getClass(), "userName", null);
        setIntField(term288856, term288856.getClass(), "isNetMember", 0);
        setIntField(term288856, term288856.getClass(), "iconId", 0);
        setIntField(term288856, term288856.getClass(), "plateId", 0);
        setIntField(term288856, term288856.getClass(), "titleId", 0);
        setIntField(term288856, term288856.getClass(), "partnerId", 0);
        setIntField(term288856, term288856.getClass(), "frameId", 0);
        setIntField(term288856, term288856.getClass(), "selectMapId", 0);
        setIntField(term288856, term288856.getClass(), "totalAwake", 0);
        setIntField(term288856, term288856.getClass(), "gradeRating", 0);
        setIntField(term288856, term288856.getClass(), "musicRating", 0);
        setIntField(term288856, term288856.getClass(), "playerRating", 0);
        setIntField(term288856, term288856.getClass(), "highestRating", 0);
        setIntField(term288856, term288856.getClass(), "gradeRank", 0);
        setIntField(term288856, term288856.getClass(), "classRank", 0);
        setIntField(term288856, term288856.getClass(), "courseRank", 0);
        setField(term288856, term288856.getClass(), "charaSlot", null);
        setField(term288856, term288856.getClass(), "charaLockSlot", null);
        setLongField(term288856, term288856.getClass(), "contentBit", 0L);
        setIntField(term288856, term288856.getClass(), "playCount", 0);
        setField(term288856, term288856.getClass(), "eventWatchedDate", null);
        setField(term288856, term288856.getClass(), "lastGameId", null);
        setField(term288856, term288856.getClass(), "lastRomVersion", null);
        setField(term288856, term288856.getClass(), "lastDataVersion", null);
        setField(term288856, term288856.getClass(), "lastLoginDate", null);
        setField(term288856, term288856.getClass(), "lastPlayDate", null);
        setIntField(term288856, term288856.getClass(), "lastPlayCredit", 0);
        setIntField(term288856, term288856.getClass(), "lastPlayMode", 0);
        setIntField(term288856, term288856.getClass(), "lastPlaceId", 0);
        setField(term288856, term288856.getClass(), "lastPlaceName", null);
        setIntField(term288856, term288856.getClass(), "lastAllNetId", 0);
        setIntField(term288856, term288856.getClass(), "lastRegionId", 0);
        setField(term288856, term288856.getClass(), "lastRegionName", null);
        setField(term288856, term288856.getClass(), "lastClientId", null);
        setField(term288856, term288856.getClass(), "lastCountryCode", null);
        setIntField(term288856, term288856.getClass(), "lastSelectEMoney", 0);
        setIntField(term288856, term288856.getClass(), "lastSelectTicket", 0);
        setIntField(term288856, term288856.getClass(), "lastSelectCourse", 0);
        setIntField(term288856, term288856.getClass(), "lastCountCourse", 0);
        setField(term288856, term288856.getClass(), "firstGameId", null);
        setField(term288856, term288856.getClass(), "firstRomVersion", null);
        setField(term288856, term288856.getClass(), "firstDataVersion", null);
        setField(term288856, term288856.getClass(), "firstPlayDate", null);
        setField(term288856, term288856.getClass(), "compatibleCmVersion", null);
        setField(term288856, term288856.getClass(), "dailyBonusDate", null);
        setField(term288856, term288856.getClass(), "dailyCourseBonusDate", null);
        setField(term288856, term288856.getClass(), "lastPairLoginDate", null);
        setField(term288856, term288856.getClass(), "lastTrialPlayDate", null);
        setIntField(term288856, term288856.getClass(), "playVsCount", 0);
        setIntField(term288856, term288856.getClass(), "playSyncCount", 0);
        setIntField(term288856, term288856.getClass(), "winCount", 0);
        setIntField(term288856, term288856.getClass(), "helpCount", 0);
        setIntField(term288856, term288856.getClass(), "comboCount", 0);
        setLongField(term288856, term288856.getClass(), "totalDeluxscore", 0L);
        setLongField(term288856, term288856.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term288856, term288856.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term288856, term288856.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term288856, term288856.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term288856, term288856.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term288856, term288856.getClass(), "totalSync", 0);
        setIntField(term288856, term288856.getClass(), "totalBasicSync", 0);
        setIntField(term288856, term288856.getClass(), "totalAdvancedSync", 0);
        setIntField(term288856, term288856.getClass(), "totalExpertSync", 0);
        setIntField(term288856, term288856.getClass(), "totalMasterSync", 0);
        setIntField(term288856, term288856.getClass(), "totalReMasterSync", 0);
        setLongField(term288856, term288856.getClass(), "totalAchievement", 0L);
        setLongField(term288856, term288856.getClass(), "totalBasicAchievement", 0L);
        setLongField(term288856, term288856.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term288856, term288856.getClass(), "totalExpertAchievement", 0L);
        setLongField(term288856, term288856.getClass(), "totalMasterAchievement", 0L);
        setLongField(term288856, term288856.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term288856, term288856.getClass(), "playerOldRating", 0L);
        setLongField(term288856, term288856.getClass(), "playerNewRating", 0L);
        setIntField(term288856, term288856.getClass(), "banState", 0);
        setLongField(term288856, term288856.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastTrialPlayDate", argTypes, term288856, args);
    }

};


