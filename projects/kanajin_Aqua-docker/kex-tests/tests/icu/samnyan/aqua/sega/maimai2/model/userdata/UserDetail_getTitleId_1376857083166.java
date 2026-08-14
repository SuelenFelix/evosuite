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

public class UserDetail_getTitleId_1376857083166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286491;

    public UserDetail_getTitleId_1376857083166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286491 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term286491, term286491.getClass(), "id", 0L);
        setField(term286491, term286491.getClass(), "card", null);
        setField(term286491, term286491.getClass(), "userName", null);
        setIntField(term286491, term286491.getClass(), "isNetMember", 0);
        setIntField(term286491, term286491.getClass(), "iconId", 0);
        setIntField(term286491, term286491.getClass(), "plateId", 0);
        setIntField(term286491, term286491.getClass(), "titleId", 0);
        setIntField(term286491, term286491.getClass(), "partnerId", 0);
        setIntField(term286491, term286491.getClass(), "frameId", 0);
        setIntField(term286491, term286491.getClass(), "selectMapId", 0);
        setIntField(term286491, term286491.getClass(), "totalAwake", 0);
        setIntField(term286491, term286491.getClass(), "gradeRating", 0);
        setIntField(term286491, term286491.getClass(), "musicRating", 0);
        setIntField(term286491, term286491.getClass(), "playerRating", 0);
        setIntField(term286491, term286491.getClass(), "highestRating", 0);
        setIntField(term286491, term286491.getClass(), "gradeRank", 0);
        setIntField(term286491, term286491.getClass(), "classRank", 0);
        setIntField(term286491, term286491.getClass(), "courseRank", 0);
        setField(term286491, term286491.getClass(), "charaSlot", null);
        setField(term286491, term286491.getClass(), "charaLockSlot", null);
        setLongField(term286491, term286491.getClass(), "contentBit", 0L);
        setIntField(term286491, term286491.getClass(), "playCount", 0);
        setField(term286491, term286491.getClass(), "eventWatchedDate", null);
        setField(term286491, term286491.getClass(), "lastGameId", null);
        setField(term286491, term286491.getClass(), "lastRomVersion", null);
        setField(term286491, term286491.getClass(), "lastDataVersion", null);
        setField(term286491, term286491.getClass(), "lastLoginDate", null);
        setField(term286491, term286491.getClass(), "lastPlayDate", null);
        setIntField(term286491, term286491.getClass(), "lastPlayCredit", 0);
        setIntField(term286491, term286491.getClass(), "lastPlayMode", 0);
        setIntField(term286491, term286491.getClass(), "lastPlaceId", 0);
        setField(term286491, term286491.getClass(), "lastPlaceName", null);
        setIntField(term286491, term286491.getClass(), "lastAllNetId", 0);
        setIntField(term286491, term286491.getClass(), "lastRegionId", 0);
        setField(term286491, term286491.getClass(), "lastRegionName", null);
        setField(term286491, term286491.getClass(), "lastClientId", null);
        setField(term286491, term286491.getClass(), "lastCountryCode", null);
        setIntField(term286491, term286491.getClass(), "lastSelectEMoney", 0);
        setIntField(term286491, term286491.getClass(), "lastSelectTicket", 0);
        setIntField(term286491, term286491.getClass(), "lastSelectCourse", 0);
        setIntField(term286491, term286491.getClass(), "lastCountCourse", 0);
        setField(term286491, term286491.getClass(), "firstGameId", null);
        setField(term286491, term286491.getClass(), "firstRomVersion", null);
        setField(term286491, term286491.getClass(), "firstDataVersion", null);
        setField(term286491, term286491.getClass(), "firstPlayDate", null);
        setField(term286491, term286491.getClass(), "compatibleCmVersion", null);
        setField(term286491, term286491.getClass(), "dailyBonusDate", null);
        setField(term286491, term286491.getClass(), "dailyCourseBonusDate", null);
        setField(term286491, term286491.getClass(), "lastPairLoginDate", null);
        setField(term286491, term286491.getClass(), "lastTrialPlayDate", null);
        setIntField(term286491, term286491.getClass(), "playVsCount", 0);
        setIntField(term286491, term286491.getClass(), "playSyncCount", 0);
        setIntField(term286491, term286491.getClass(), "winCount", 0);
        setIntField(term286491, term286491.getClass(), "helpCount", 0);
        setIntField(term286491, term286491.getClass(), "comboCount", 0);
        setLongField(term286491, term286491.getClass(), "totalDeluxscore", 0L);
        setLongField(term286491, term286491.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term286491, term286491.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term286491, term286491.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term286491, term286491.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term286491, term286491.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term286491, term286491.getClass(), "totalSync", 0);
        setIntField(term286491, term286491.getClass(), "totalBasicSync", 0);
        setIntField(term286491, term286491.getClass(), "totalAdvancedSync", 0);
        setIntField(term286491, term286491.getClass(), "totalExpertSync", 0);
        setIntField(term286491, term286491.getClass(), "totalMasterSync", 0);
        setIntField(term286491, term286491.getClass(), "totalReMasterSync", 0);
        setLongField(term286491, term286491.getClass(), "totalAchievement", 0L);
        setLongField(term286491, term286491.getClass(), "totalBasicAchievement", 0L);
        setLongField(term286491, term286491.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term286491, term286491.getClass(), "totalExpertAchievement", 0L);
        setLongField(term286491, term286491.getClass(), "totalMasterAchievement", 0L);
        setLongField(term286491, term286491.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term286491, term286491.getClass(), "playerOldRating", 0L);
        setLongField(term286491, term286491.getClass(), "playerNewRating", 0L);
        setIntField(term286491, term286491.getClass(), "banState", 0);
        setLongField(term286491, term286491.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitleId", argTypes, term286491, args);
    }

};


