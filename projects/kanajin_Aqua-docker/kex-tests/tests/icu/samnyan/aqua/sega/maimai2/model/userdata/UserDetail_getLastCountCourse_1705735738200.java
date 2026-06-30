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

public class UserDetail_getLastCountCourse_1705735738200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288361;

    public UserDetail_getLastCountCourse_1705735738200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288361 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term288361, term288361.getClass(), "id", 0L);
        setField(term288361, term288361.getClass(), "card", null);
        setField(term288361, term288361.getClass(), "userName", null);
        setIntField(term288361, term288361.getClass(), "isNetMember", 0);
        setIntField(term288361, term288361.getClass(), "iconId", 0);
        setIntField(term288361, term288361.getClass(), "plateId", 0);
        setIntField(term288361, term288361.getClass(), "titleId", 0);
        setIntField(term288361, term288361.getClass(), "partnerId", 0);
        setIntField(term288361, term288361.getClass(), "frameId", 0);
        setIntField(term288361, term288361.getClass(), "selectMapId", 0);
        setIntField(term288361, term288361.getClass(), "totalAwake", 0);
        setIntField(term288361, term288361.getClass(), "gradeRating", 0);
        setIntField(term288361, term288361.getClass(), "musicRating", 0);
        setIntField(term288361, term288361.getClass(), "playerRating", 0);
        setIntField(term288361, term288361.getClass(), "highestRating", 0);
        setIntField(term288361, term288361.getClass(), "gradeRank", 0);
        setIntField(term288361, term288361.getClass(), "classRank", 0);
        setIntField(term288361, term288361.getClass(), "courseRank", 0);
        setField(term288361, term288361.getClass(), "charaSlot", null);
        setField(term288361, term288361.getClass(), "charaLockSlot", null);
        setLongField(term288361, term288361.getClass(), "contentBit", 0L);
        setIntField(term288361, term288361.getClass(), "playCount", 0);
        setField(term288361, term288361.getClass(), "eventWatchedDate", null);
        setField(term288361, term288361.getClass(), "lastGameId", null);
        setField(term288361, term288361.getClass(), "lastRomVersion", null);
        setField(term288361, term288361.getClass(), "lastDataVersion", null);
        setField(term288361, term288361.getClass(), "lastLoginDate", null);
        setField(term288361, term288361.getClass(), "lastPlayDate", null);
        setIntField(term288361, term288361.getClass(), "lastPlayCredit", 0);
        setIntField(term288361, term288361.getClass(), "lastPlayMode", 0);
        setIntField(term288361, term288361.getClass(), "lastPlaceId", 0);
        setField(term288361, term288361.getClass(), "lastPlaceName", null);
        setIntField(term288361, term288361.getClass(), "lastAllNetId", 0);
        setIntField(term288361, term288361.getClass(), "lastRegionId", 0);
        setField(term288361, term288361.getClass(), "lastRegionName", null);
        setField(term288361, term288361.getClass(), "lastClientId", null);
        setField(term288361, term288361.getClass(), "lastCountryCode", null);
        setIntField(term288361, term288361.getClass(), "lastSelectEMoney", 0);
        setIntField(term288361, term288361.getClass(), "lastSelectTicket", 0);
        setIntField(term288361, term288361.getClass(), "lastSelectCourse", 0);
        setIntField(term288361, term288361.getClass(), "lastCountCourse", 0);
        setField(term288361, term288361.getClass(), "firstGameId", null);
        setField(term288361, term288361.getClass(), "firstRomVersion", null);
        setField(term288361, term288361.getClass(), "firstDataVersion", null);
        setField(term288361, term288361.getClass(), "firstPlayDate", null);
        setField(term288361, term288361.getClass(), "compatibleCmVersion", null);
        setField(term288361, term288361.getClass(), "dailyBonusDate", null);
        setField(term288361, term288361.getClass(), "dailyCourseBonusDate", null);
        setField(term288361, term288361.getClass(), "lastPairLoginDate", null);
        setField(term288361, term288361.getClass(), "lastTrialPlayDate", null);
        setIntField(term288361, term288361.getClass(), "playVsCount", 0);
        setIntField(term288361, term288361.getClass(), "playSyncCount", 0);
        setIntField(term288361, term288361.getClass(), "winCount", 0);
        setIntField(term288361, term288361.getClass(), "helpCount", 0);
        setIntField(term288361, term288361.getClass(), "comboCount", 0);
        setLongField(term288361, term288361.getClass(), "totalDeluxscore", 0L);
        setLongField(term288361, term288361.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term288361, term288361.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term288361, term288361.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term288361, term288361.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term288361, term288361.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term288361, term288361.getClass(), "totalSync", 0);
        setIntField(term288361, term288361.getClass(), "totalBasicSync", 0);
        setIntField(term288361, term288361.getClass(), "totalAdvancedSync", 0);
        setIntField(term288361, term288361.getClass(), "totalExpertSync", 0);
        setIntField(term288361, term288361.getClass(), "totalMasterSync", 0);
        setIntField(term288361, term288361.getClass(), "totalReMasterSync", 0);
        setLongField(term288361, term288361.getClass(), "totalAchievement", 0L);
        setLongField(term288361, term288361.getClass(), "totalBasicAchievement", 0L);
        setLongField(term288361, term288361.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term288361, term288361.getClass(), "totalExpertAchievement", 0L);
        setLongField(term288361, term288361.getClass(), "totalMasterAchievement", 0L);
        setLongField(term288361, term288361.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term288361, term288361.getClass(), "playerOldRating", 0L);
        setLongField(term288361, term288361.getClass(), "playerNewRating", 0L);
        setIntField(term288361, term288361.getClass(), "banState", 0);
        setLongField(term288361, term288361.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastCountCourse", argTypes, term288361, args);
    }

};


