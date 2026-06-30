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

public class UserDetail_getIsNetMember_24294529164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286381;

    public UserDetail_getIsNetMember_24294529164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286381 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term286381, term286381.getClass(), "id", 0L);
        setField(term286381, term286381.getClass(), "card", null);
        setField(term286381, term286381.getClass(), "userName", null);
        setIntField(term286381, term286381.getClass(), "isNetMember", 0);
        setIntField(term286381, term286381.getClass(), "iconId", 0);
        setIntField(term286381, term286381.getClass(), "plateId", 0);
        setIntField(term286381, term286381.getClass(), "titleId", 0);
        setIntField(term286381, term286381.getClass(), "partnerId", 0);
        setIntField(term286381, term286381.getClass(), "frameId", 0);
        setIntField(term286381, term286381.getClass(), "selectMapId", 0);
        setIntField(term286381, term286381.getClass(), "totalAwake", 0);
        setIntField(term286381, term286381.getClass(), "gradeRating", 0);
        setIntField(term286381, term286381.getClass(), "musicRating", 0);
        setIntField(term286381, term286381.getClass(), "playerRating", 0);
        setIntField(term286381, term286381.getClass(), "highestRating", 0);
        setIntField(term286381, term286381.getClass(), "gradeRank", 0);
        setIntField(term286381, term286381.getClass(), "classRank", 0);
        setIntField(term286381, term286381.getClass(), "courseRank", 0);
        setField(term286381, term286381.getClass(), "charaSlot", null);
        setField(term286381, term286381.getClass(), "charaLockSlot", null);
        setLongField(term286381, term286381.getClass(), "contentBit", 0L);
        setIntField(term286381, term286381.getClass(), "playCount", 0);
        setField(term286381, term286381.getClass(), "eventWatchedDate", null);
        setField(term286381, term286381.getClass(), "lastGameId", null);
        setField(term286381, term286381.getClass(), "lastRomVersion", null);
        setField(term286381, term286381.getClass(), "lastDataVersion", null);
        setField(term286381, term286381.getClass(), "lastLoginDate", null);
        setField(term286381, term286381.getClass(), "lastPlayDate", null);
        setIntField(term286381, term286381.getClass(), "lastPlayCredit", 0);
        setIntField(term286381, term286381.getClass(), "lastPlayMode", 0);
        setIntField(term286381, term286381.getClass(), "lastPlaceId", 0);
        setField(term286381, term286381.getClass(), "lastPlaceName", null);
        setIntField(term286381, term286381.getClass(), "lastAllNetId", 0);
        setIntField(term286381, term286381.getClass(), "lastRegionId", 0);
        setField(term286381, term286381.getClass(), "lastRegionName", null);
        setField(term286381, term286381.getClass(), "lastClientId", null);
        setField(term286381, term286381.getClass(), "lastCountryCode", null);
        setIntField(term286381, term286381.getClass(), "lastSelectEMoney", 0);
        setIntField(term286381, term286381.getClass(), "lastSelectTicket", 0);
        setIntField(term286381, term286381.getClass(), "lastSelectCourse", 0);
        setIntField(term286381, term286381.getClass(), "lastCountCourse", 0);
        setField(term286381, term286381.getClass(), "firstGameId", null);
        setField(term286381, term286381.getClass(), "firstRomVersion", null);
        setField(term286381, term286381.getClass(), "firstDataVersion", null);
        setField(term286381, term286381.getClass(), "firstPlayDate", null);
        setField(term286381, term286381.getClass(), "compatibleCmVersion", null);
        setField(term286381, term286381.getClass(), "dailyBonusDate", null);
        setField(term286381, term286381.getClass(), "dailyCourseBonusDate", null);
        setField(term286381, term286381.getClass(), "lastPairLoginDate", null);
        setField(term286381, term286381.getClass(), "lastTrialPlayDate", null);
        setIntField(term286381, term286381.getClass(), "playVsCount", 0);
        setIntField(term286381, term286381.getClass(), "playSyncCount", 0);
        setIntField(term286381, term286381.getClass(), "winCount", 0);
        setIntField(term286381, term286381.getClass(), "helpCount", 0);
        setIntField(term286381, term286381.getClass(), "comboCount", 0);
        setLongField(term286381, term286381.getClass(), "totalDeluxscore", 0L);
        setLongField(term286381, term286381.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term286381, term286381.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term286381, term286381.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term286381, term286381.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term286381, term286381.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term286381, term286381.getClass(), "totalSync", 0);
        setIntField(term286381, term286381.getClass(), "totalBasicSync", 0);
        setIntField(term286381, term286381.getClass(), "totalAdvancedSync", 0);
        setIntField(term286381, term286381.getClass(), "totalExpertSync", 0);
        setIntField(term286381, term286381.getClass(), "totalMasterSync", 0);
        setIntField(term286381, term286381.getClass(), "totalReMasterSync", 0);
        setLongField(term286381, term286381.getClass(), "totalAchievement", 0L);
        setLongField(term286381, term286381.getClass(), "totalBasicAchievement", 0L);
        setLongField(term286381, term286381.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term286381, term286381.getClass(), "totalExpertAchievement", 0L);
        setLongField(term286381, term286381.getClass(), "totalMasterAchievement", 0L);
        setLongField(term286381, term286381.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term286381, term286381.getClass(), "playerOldRating", 0L);
        setLongField(term286381, term286381.getClass(), "playerNewRating", 0L);
        setIntField(term286381, term286381.getClass(), "banState", 0);
        setLongField(term286381, term286381.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsNetMember", argTypes, term286381, args);
    }

};


