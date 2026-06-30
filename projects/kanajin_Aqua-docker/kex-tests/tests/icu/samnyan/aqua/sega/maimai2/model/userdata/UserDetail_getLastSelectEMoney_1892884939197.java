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

public class UserDetail_getLastSelectEMoney_1892884939197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288196;

    public UserDetail_getLastSelectEMoney_1892884939197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288196 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term288196, term288196.getClass(), "id", 0L);
        setField(term288196, term288196.getClass(), "card", null);
        setField(term288196, term288196.getClass(), "userName", null);
        setIntField(term288196, term288196.getClass(), "isNetMember", 0);
        setIntField(term288196, term288196.getClass(), "iconId", 0);
        setIntField(term288196, term288196.getClass(), "plateId", 0);
        setIntField(term288196, term288196.getClass(), "titleId", 0);
        setIntField(term288196, term288196.getClass(), "partnerId", 0);
        setIntField(term288196, term288196.getClass(), "frameId", 0);
        setIntField(term288196, term288196.getClass(), "selectMapId", 0);
        setIntField(term288196, term288196.getClass(), "totalAwake", 0);
        setIntField(term288196, term288196.getClass(), "gradeRating", 0);
        setIntField(term288196, term288196.getClass(), "musicRating", 0);
        setIntField(term288196, term288196.getClass(), "playerRating", 0);
        setIntField(term288196, term288196.getClass(), "highestRating", 0);
        setIntField(term288196, term288196.getClass(), "gradeRank", 0);
        setIntField(term288196, term288196.getClass(), "classRank", 0);
        setIntField(term288196, term288196.getClass(), "courseRank", 0);
        setField(term288196, term288196.getClass(), "charaSlot", null);
        setField(term288196, term288196.getClass(), "charaLockSlot", null);
        setLongField(term288196, term288196.getClass(), "contentBit", 0L);
        setIntField(term288196, term288196.getClass(), "playCount", 0);
        setField(term288196, term288196.getClass(), "eventWatchedDate", null);
        setField(term288196, term288196.getClass(), "lastGameId", null);
        setField(term288196, term288196.getClass(), "lastRomVersion", null);
        setField(term288196, term288196.getClass(), "lastDataVersion", null);
        setField(term288196, term288196.getClass(), "lastLoginDate", null);
        setField(term288196, term288196.getClass(), "lastPlayDate", null);
        setIntField(term288196, term288196.getClass(), "lastPlayCredit", 0);
        setIntField(term288196, term288196.getClass(), "lastPlayMode", 0);
        setIntField(term288196, term288196.getClass(), "lastPlaceId", 0);
        setField(term288196, term288196.getClass(), "lastPlaceName", null);
        setIntField(term288196, term288196.getClass(), "lastAllNetId", 0);
        setIntField(term288196, term288196.getClass(), "lastRegionId", 0);
        setField(term288196, term288196.getClass(), "lastRegionName", null);
        setField(term288196, term288196.getClass(), "lastClientId", null);
        setField(term288196, term288196.getClass(), "lastCountryCode", null);
        setIntField(term288196, term288196.getClass(), "lastSelectEMoney", 0);
        setIntField(term288196, term288196.getClass(), "lastSelectTicket", 0);
        setIntField(term288196, term288196.getClass(), "lastSelectCourse", 0);
        setIntField(term288196, term288196.getClass(), "lastCountCourse", 0);
        setField(term288196, term288196.getClass(), "firstGameId", null);
        setField(term288196, term288196.getClass(), "firstRomVersion", null);
        setField(term288196, term288196.getClass(), "firstDataVersion", null);
        setField(term288196, term288196.getClass(), "firstPlayDate", null);
        setField(term288196, term288196.getClass(), "compatibleCmVersion", null);
        setField(term288196, term288196.getClass(), "dailyBonusDate", null);
        setField(term288196, term288196.getClass(), "dailyCourseBonusDate", null);
        setField(term288196, term288196.getClass(), "lastPairLoginDate", null);
        setField(term288196, term288196.getClass(), "lastTrialPlayDate", null);
        setIntField(term288196, term288196.getClass(), "playVsCount", 0);
        setIntField(term288196, term288196.getClass(), "playSyncCount", 0);
        setIntField(term288196, term288196.getClass(), "winCount", 0);
        setIntField(term288196, term288196.getClass(), "helpCount", 0);
        setIntField(term288196, term288196.getClass(), "comboCount", 0);
        setLongField(term288196, term288196.getClass(), "totalDeluxscore", 0L);
        setLongField(term288196, term288196.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term288196, term288196.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term288196, term288196.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term288196, term288196.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term288196, term288196.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term288196, term288196.getClass(), "totalSync", 0);
        setIntField(term288196, term288196.getClass(), "totalBasicSync", 0);
        setIntField(term288196, term288196.getClass(), "totalAdvancedSync", 0);
        setIntField(term288196, term288196.getClass(), "totalExpertSync", 0);
        setIntField(term288196, term288196.getClass(), "totalMasterSync", 0);
        setIntField(term288196, term288196.getClass(), "totalReMasterSync", 0);
        setLongField(term288196, term288196.getClass(), "totalAchievement", 0L);
        setLongField(term288196, term288196.getClass(), "totalBasicAchievement", 0L);
        setLongField(term288196, term288196.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term288196, term288196.getClass(), "totalExpertAchievement", 0L);
        setLongField(term288196, term288196.getClass(), "totalMasterAchievement", 0L);
        setLongField(term288196, term288196.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term288196, term288196.getClass(), "playerOldRating", 0L);
        setLongField(term288196, term288196.getClass(), "playerNewRating", 0L);
        setIntField(term288196, term288196.getClass(), "banState", 0);
        setLongField(term288196, term288196.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastSelectEMoney", argTypes, term288196, args);
    }

};


