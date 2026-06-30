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

public class UserDetail_getCharaLockSlot_1869034564179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287206;

    public UserDetail_getCharaLockSlot_1869034564179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287206 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term287206, term287206.getClass(), "id", 0L);
        setField(term287206, term287206.getClass(), "card", null);
        setField(term287206, term287206.getClass(), "userName", null);
        setIntField(term287206, term287206.getClass(), "isNetMember", 0);
        setIntField(term287206, term287206.getClass(), "iconId", 0);
        setIntField(term287206, term287206.getClass(), "plateId", 0);
        setIntField(term287206, term287206.getClass(), "titleId", 0);
        setIntField(term287206, term287206.getClass(), "partnerId", 0);
        setIntField(term287206, term287206.getClass(), "frameId", 0);
        setIntField(term287206, term287206.getClass(), "selectMapId", 0);
        setIntField(term287206, term287206.getClass(), "totalAwake", 0);
        setIntField(term287206, term287206.getClass(), "gradeRating", 0);
        setIntField(term287206, term287206.getClass(), "musicRating", 0);
        setIntField(term287206, term287206.getClass(), "playerRating", 0);
        setIntField(term287206, term287206.getClass(), "highestRating", 0);
        setIntField(term287206, term287206.getClass(), "gradeRank", 0);
        setIntField(term287206, term287206.getClass(), "classRank", 0);
        setIntField(term287206, term287206.getClass(), "courseRank", 0);
        setField(term287206, term287206.getClass(), "charaSlot", null);
        setField(term287206, term287206.getClass(), "charaLockSlot", null);
        setLongField(term287206, term287206.getClass(), "contentBit", 0L);
        setIntField(term287206, term287206.getClass(), "playCount", 0);
        setField(term287206, term287206.getClass(), "eventWatchedDate", null);
        setField(term287206, term287206.getClass(), "lastGameId", null);
        setField(term287206, term287206.getClass(), "lastRomVersion", null);
        setField(term287206, term287206.getClass(), "lastDataVersion", null);
        setField(term287206, term287206.getClass(), "lastLoginDate", null);
        setField(term287206, term287206.getClass(), "lastPlayDate", null);
        setIntField(term287206, term287206.getClass(), "lastPlayCredit", 0);
        setIntField(term287206, term287206.getClass(), "lastPlayMode", 0);
        setIntField(term287206, term287206.getClass(), "lastPlaceId", 0);
        setField(term287206, term287206.getClass(), "lastPlaceName", null);
        setIntField(term287206, term287206.getClass(), "lastAllNetId", 0);
        setIntField(term287206, term287206.getClass(), "lastRegionId", 0);
        setField(term287206, term287206.getClass(), "lastRegionName", null);
        setField(term287206, term287206.getClass(), "lastClientId", null);
        setField(term287206, term287206.getClass(), "lastCountryCode", null);
        setIntField(term287206, term287206.getClass(), "lastSelectEMoney", 0);
        setIntField(term287206, term287206.getClass(), "lastSelectTicket", 0);
        setIntField(term287206, term287206.getClass(), "lastSelectCourse", 0);
        setIntField(term287206, term287206.getClass(), "lastCountCourse", 0);
        setField(term287206, term287206.getClass(), "firstGameId", null);
        setField(term287206, term287206.getClass(), "firstRomVersion", null);
        setField(term287206, term287206.getClass(), "firstDataVersion", null);
        setField(term287206, term287206.getClass(), "firstPlayDate", null);
        setField(term287206, term287206.getClass(), "compatibleCmVersion", null);
        setField(term287206, term287206.getClass(), "dailyBonusDate", null);
        setField(term287206, term287206.getClass(), "dailyCourseBonusDate", null);
        setField(term287206, term287206.getClass(), "lastPairLoginDate", null);
        setField(term287206, term287206.getClass(), "lastTrialPlayDate", null);
        setIntField(term287206, term287206.getClass(), "playVsCount", 0);
        setIntField(term287206, term287206.getClass(), "playSyncCount", 0);
        setIntField(term287206, term287206.getClass(), "winCount", 0);
        setIntField(term287206, term287206.getClass(), "helpCount", 0);
        setIntField(term287206, term287206.getClass(), "comboCount", 0);
        setLongField(term287206, term287206.getClass(), "totalDeluxscore", 0L);
        setLongField(term287206, term287206.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term287206, term287206.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term287206, term287206.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term287206, term287206.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term287206, term287206.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term287206, term287206.getClass(), "totalSync", 0);
        setIntField(term287206, term287206.getClass(), "totalBasicSync", 0);
        setIntField(term287206, term287206.getClass(), "totalAdvancedSync", 0);
        setIntField(term287206, term287206.getClass(), "totalExpertSync", 0);
        setIntField(term287206, term287206.getClass(), "totalMasterSync", 0);
        setIntField(term287206, term287206.getClass(), "totalReMasterSync", 0);
        setLongField(term287206, term287206.getClass(), "totalAchievement", 0L);
        setLongField(term287206, term287206.getClass(), "totalBasicAchievement", 0L);
        setLongField(term287206, term287206.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term287206, term287206.getClass(), "totalExpertAchievement", 0L);
        setLongField(term287206, term287206.getClass(), "totalMasterAchievement", 0L);
        setLongField(term287206, term287206.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term287206, term287206.getClass(), "playerOldRating", 0L);
        setLongField(term287206, term287206.getClass(), "playerNewRating", 0L);
        setIntField(term287206, term287206.getClass(), "banState", 0);
        setLongField(term287206, term287206.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharaLockSlot", argTypes, term287206, args);
    }

};


