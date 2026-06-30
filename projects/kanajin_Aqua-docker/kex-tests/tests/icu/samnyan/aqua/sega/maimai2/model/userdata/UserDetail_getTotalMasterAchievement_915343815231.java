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

public class UserDetail_getTotalMasterAchievement_915343815231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290066;

    public UserDetail_getTotalMasterAchievement_915343815231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290066 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term290066, term290066.getClass(), "id", 0L);
        setField(term290066, term290066.getClass(), "card", null);
        setField(term290066, term290066.getClass(), "userName", null);
        setIntField(term290066, term290066.getClass(), "isNetMember", 0);
        setIntField(term290066, term290066.getClass(), "iconId", 0);
        setIntField(term290066, term290066.getClass(), "plateId", 0);
        setIntField(term290066, term290066.getClass(), "titleId", 0);
        setIntField(term290066, term290066.getClass(), "partnerId", 0);
        setIntField(term290066, term290066.getClass(), "frameId", 0);
        setIntField(term290066, term290066.getClass(), "selectMapId", 0);
        setIntField(term290066, term290066.getClass(), "totalAwake", 0);
        setIntField(term290066, term290066.getClass(), "gradeRating", 0);
        setIntField(term290066, term290066.getClass(), "musicRating", 0);
        setIntField(term290066, term290066.getClass(), "playerRating", 0);
        setIntField(term290066, term290066.getClass(), "highestRating", 0);
        setIntField(term290066, term290066.getClass(), "gradeRank", 0);
        setIntField(term290066, term290066.getClass(), "classRank", 0);
        setIntField(term290066, term290066.getClass(), "courseRank", 0);
        setField(term290066, term290066.getClass(), "charaSlot", null);
        setField(term290066, term290066.getClass(), "charaLockSlot", null);
        setLongField(term290066, term290066.getClass(), "contentBit", 0L);
        setIntField(term290066, term290066.getClass(), "playCount", 0);
        setField(term290066, term290066.getClass(), "eventWatchedDate", null);
        setField(term290066, term290066.getClass(), "lastGameId", null);
        setField(term290066, term290066.getClass(), "lastRomVersion", null);
        setField(term290066, term290066.getClass(), "lastDataVersion", null);
        setField(term290066, term290066.getClass(), "lastLoginDate", null);
        setField(term290066, term290066.getClass(), "lastPlayDate", null);
        setIntField(term290066, term290066.getClass(), "lastPlayCredit", 0);
        setIntField(term290066, term290066.getClass(), "lastPlayMode", 0);
        setIntField(term290066, term290066.getClass(), "lastPlaceId", 0);
        setField(term290066, term290066.getClass(), "lastPlaceName", null);
        setIntField(term290066, term290066.getClass(), "lastAllNetId", 0);
        setIntField(term290066, term290066.getClass(), "lastRegionId", 0);
        setField(term290066, term290066.getClass(), "lastRegionName", null);
        setField(term290066, term290066.getClass(), "lastClientId", null);
        setField(term290066, term290066.getClass(), "lastCountryCode", null);
        setIntField(term290066, term290066.getClass(), "lastSelectEMoney", 0);
        setIntField(term290066, term290066.getClass(), "lastSelectTicket", 0);
        setIntField(term290066, term290066.getClass(), "lastSelectCourse", 0);
        setIntField(term290066, term290066.getClass(), "lastCountCourse", 0);
        setField(term290066, term290066.getClass(), "firstGameId", null);
        setField(term290066, term290066.getClass(), "firstRomVersion", null);
        setField(term290066, term290066.getClass(), "firstDataVersion", null);
        setField(term290066, term290066.getClass(), "firstPlayDate", null);
        setField(term290066, term290066.getClass(), "compatibleCmVersion", null);
        setField(term290066, term290066.getClass(), "dailyBonusDate", null);
        setField(term290066, term290066.getClass(), "dailyCourseBonusDate", null);
        setField(term290066, term290066.getClass(), "lastPairLoginDate", null);
        setField(term290066, term290066.getClass(), "lastTrialPlayDate", null);
        setIntField(term290066, term290066.getClass(), "playVsCount", 0);
        setIntField(term290066, term290066.getClass(), "playSyncCount", 0);
        setIntField(term290066, term290066.getClass(), "winCount", 0);
        setIntField(term290066, term290066.getClass(), "helpCount", 0);
        setIntField(term290066, term290066.getClass(), "comboCount", 0);
        setLongField(term290066, term290066.getClass(), "totalDeluxscore", 0L);
        setLongField(term290066, term290066.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term290066, term290066.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term290066, term290066.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term290066, term290066.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term290066, term290066.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term290066, term290066.getClass(), "totalSync", 0);
        setIntField(term290066, term290066.getClass(), "totalBasicSync", 0);
        setIntField(term290066, term290066.getClass(), "totalAdvancedSync", 0);
        setIntField(term290066, term290066.getClass(), "totalExpertSync", 0);
        setIntField(term290066, term290066.getClass(), "totalMasterSync", 0);
        setIntField(term290066, term290066.getClass(), "totalReMasterSync", 0);
        setLongField(term290066, term290066.getClass(), "totalAchievement", 0L);
        setLongField(term290066, term290066.getClass(), "totalBasicAchievement", 0L);
        setLongField(term290066, term290066.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term290066, term290066.getClass(), "totalExpertAchievement", 0L);
        setLongField(term290066, term290066.getClass(), "totalMasterAchievement", 0L);
        setLongField(term290066, term290066.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term290066, term290066.getClass(), "playerOldRating", 0L);
        setLongField(term290066, term290066.getClass(), "playerNewRating", 0L);
        setIntField(term290066, term290066.getClass(), "banState", 0);
        setLongField(term290066, term290066.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalMasterAchievement", argTypes, term290066, args);
    }

};


