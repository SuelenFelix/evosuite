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

public class UserDetail_getHighestRating_364365523174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286931;

    public UserDetail_getHighestRating_364365523174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286931 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term286931, term286931.getClass(), "id", 0L);
        setField(term286931, term286931.getClass(), "card", null);
        setField(term286931, term286931.getClass(), "userName", null);
        setIntField(term286931, term286931.getClass(), "isNetMember", 0);
        setIntField(term286931, term286931.getClass(), "iconId", 0);
        setIntField(term286931, term286931.getClass(), "plateId", 0);
        setIntField(term286931, term286931.getClass(), "titleId", 0);
        setIntField(term286931, term286931.getClass(), "partnerId", 0);
        setIntField(term286931, term286931.getClass(), "frameId", 0);
        setIntField(term286931, term286931.getClass(), "selectMapId", 0);
        setIntField(term286931, term286931.getClass(), "totalAwake", 0);
        setIntField(term286931, term286931.getClass(), "gradeRating", 0);
        setIntField(term286931, term286931.getClass(), "musicRating", 0);
        setIntField(term286931, term286931.getClass(), "playerRating", 0);
        setIntField(term286931, term286931.getClass(), "highestRating", 0);
        setIntField(term286931, term286931.getClass(), "gradeRank", 0);
        setIntField(term286931, term286931.getClass(), "classRank", 0);
        setIntField(term286931, term286931.getClass(), "courseRank", 0);
        setField(term286931, term286931.getClass(), "charaSlot", null);
        setField(term286931, term286931.getClass(), "charaLockSlot", null);
        setLongField(term286931, term286931.getClass(), "contentBit", 0L);
        setIntField(term286931, term286931.getClass(), "playCount", 0);
        setField(term286931, term286931.getClass(), "eventWatchedDate", null);
        setField(term286931, term286931.getClass(), "lastGameId", null);
        setField(term286931, term286931.getClass(), "lastRomVersion", null);
        setField(term286931, term286931.getClass(), "lastDataVersion", null);
        setField(term286931, term286931.getClass(), "lastLoginDate", null);
        setField(term286931, term286931.getClass(), "lastPlayDate", null);
        setIntField(term286931, term286931.getClass(), "lastPlayCredit", 0);
        setIntField(term286931, term286931.getClass(), "lastPlayMode", 0);
        setIntField(term286931, term286931.getClass(), "lastPlaceId", 0);
        setField(term286931, term286931.getClass(), "lastPlaceName", null);
        setIntField(term286931, term286931.getClass(), "lastAllNetId", 0);
        setIntField(term286931, term286931.getClass(), "lastRegionId", 0);
        setField(term286931, term286931.getClass(), "lastRegionName", null);
        setField(term286931, term286931.getClass(), "lastClientId", null);
        setField(term286931, term286931.getClass(), "lastCountryCode", null);
        setIntField(term286931, term286931.getClass(), "lastSelectEMoney", 0);
        setIntField(term286931, term286931.getClass(), "lastSelectTicket", 0);
        setIntField(term286931, term286931.getClass(), "lastSelectCourse", 0);
        setIntField(term286931, term286931.getClass(), "lastCountCourse", 0);
        setField(term286931, term286931.getClass(), "firstGameId", null);
        setField(term286931, term286931.getClass(), "firstRomVersion", null);
        setField(term286931, term286931.getClass(), "firstDataVersion", null);
        setField(term286931, term286931.getClass(), "firstPlayDate", null);
        setField(term286931, term286931.getClass(), "compatibleCmVersion", null);
        setField(term286931, term286931.getClass(), "dailyBonusDate", null);
        setField(term286931, term286931.getClass(), "dailyCourseBonusDate", null);
        setField(term286931, term286931.getClass(), "lastPairLoginDate", null);
        setField(term286931, term286931.getClass(), "lastTrialPlayDate", null);
        setIntField(term286931, term286931.getClass(), "playVsCount", 0);
        setIntField(term286931, term286931.getClass(), "playSyncCount", 0);
        setIntField(term286931, term286931.getClass(), "winCount", 0);
        setIntField(term286931, term286931.getClass(), "helpCount", 0);
        setIntField(term286931, term286931.getClass(), "comboCount", 0);
        setLongField(term286931, term286931.getClass(), "totalDeluxscore", 0L);
        setLongField(term286931, term286931.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term286931, term286931.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term286931, term286931.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term286931, term286931.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term286931, term286931.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term286931, term286931.getClass(), "totalSync", 0);
        setIntField(term286931, term286931.getClass(), "totalBasicSync", 0);
        setIntField(term286931, term286931.getClass(), "totalAdvancedSync", 0);
        setIntField(term286931, term286931.getClass(), "totalExpertSync", 0);
        setIntField(term286931, term286931.getClass(), "totalMasterSync", 0);
        setIntField(term286931, term286931.getClass(), "totalReMasterSync", 0);
        setLongField(term286931, term286931.getClass(), "totalAchievement", 0L);
        setLongField(term286931, term286931.getClass(), "totalBasicAchievement", 0L);
        setLongField(term286931, term286931.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term286931, term286931.getClass(), "totalExpertAchievement", 0L);
        setLongField(term286931, term286931.getClass(), "totalMasterAchievement", 0L);
        setLongField(term286931, term286931.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term286931, term286931.getClass(), "playerOldRating", 0L);
        setLongField(term286931, term286931.getClass(), "playerNewRating", 0L);
        setIntField(term286931, term286931.getClass(), "banState", 0);
        setLongField(term286931, term286931.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHighestRating", argTypes, term286931, args);
    }

};


