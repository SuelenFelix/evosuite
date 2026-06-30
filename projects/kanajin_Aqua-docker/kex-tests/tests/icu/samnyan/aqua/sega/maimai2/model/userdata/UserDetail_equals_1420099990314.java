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

public class UserDetail_equals_1420099990314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294739;

    public UserDetail_equals_1420099990314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term294739 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term294739, term294739.getClass(), "id", 0L);
        setField(term294739, term294739.getClass(), "card", null);
        setField(term294739, term294739.getClass(), "userName", null);
        setIntField(term294739, term294739.getClass(), "isNetMember", 0);
        setIntField(term294739, term294739.getClass(), "iconId", 0);
        setIntField(term294739, term294739.getClass(), "plateId", 0);
        setIntField(term294739, term294739.getClass(), "titleId", 0);
        setIntField(term294739, term294739.getClass(), "partnerId", 0);
        setIntField(term294739, term294739.getClass(), "frameId", 0);
        setIntField(term294739, term294739.getClass(), "selectMapId", 0);
        setIntField(term294739, term294739.getClass(), "totalAwake", 0);
        setIntField(term294739, term294739.getClass(), "gradeRating", 0);
        setIntField(term294739, term294739.getClass(), "musicRating", 0);
        setIntField(term294739, term294739.getClass(), "playerRating", 0);
        setIntField(term294739, term294739.getClass(), "highestRating", 0);
        setIntField(term294739, term294739.getClass(), "gradeRank", 0);
        setIntField(term294739, term294739.getClass(), "classRank", 0);
        setIntField(term294739, term294739.getClass(), "courseRank", 0);
        setField(term294739, term294739.getClass(), "charaSlot", null);
        setField(term294739, term294739.getClass(), "charaLockSlot", null);
        setLongField(term294739, term294739.getClass(), "contentBit", 0L);
        setIntField(term294739, term294739.getClass(), "playCount", 0);
        setField(term294739, term294739.getClass(), "eventWatchedDate", null);
        setField(term294739, term294739.getClass(), "lastGameId", null);
        setField(term294739, term294739.getClass(), "lastRomVersion", null);
        setField(term294739, term294739.getClass(), "lastDataVersion", null);
        setField(term294739, term294739.getClass(), "lastLoginDate", null);
        setField(term294739, term294739.getClass(), "lastPlayDate", null);
        setIntField(term294739, term294739.getClass(), "lastPlayCredit", 0);
        setIntField(term294739, term294739.getClass(), "lastPlayMode", 0);
        setIntField(term294739, term294739.getClass(), "lastPlaceId", 0);
        setField(term294739, term294739.getClass(), "lastPlaceName", null);
        setIntField(term294739, term294739.getClass(), "lastAllNetId", 0);
        setIntField(term294739, term294739.getClass(), "lastRegionId", 0);
        setField(term294739, term294739.getClass(), "lastRegionName", null);
        setField(term294739, term294739.getClass(), "lastClientId", null);
        setField(term294739, term294739.getClass(), "lastCountryCode", null);
        setIntField(term294739, term294739.getClass(), "lastSelectEMoney", 0);
        setIntField(term294739, term294739.getClass(), "lastSelectTicket", 0);
        setIntField(term294739, term294739.getClass(), "lastSelectCourse", 0);
        setIntField(term294739, term294739.getClass(), "lastCountCourse", 0);
        setField(term294739, term294739.getClass(), "firstGameId", null);
        setField(term294739, term294739.getClass(), "firstRomVersion", null);
        setField(term294739, term294739.getClass(), "firstDataVersion", null);
        setField(term294739, term294739.getClass(), "firstPlayDate", null);
        setField(term294739, term294739.getClass(), "compatibleCmVersion", null);
        setField(term294739, term294739.getClass(), "dailyBonusDate", null);
        setField(term294739, term294739.getClass(), "dailyCourseBonusDate", null);
        setField(term294739, term294739.getClass(), "lastPairLoginDate", null);
        setField(term294739, term294739.getClass(), "lastTrialPlayDate", null);
        setIntField(term294739, term294739.getClass(), "playVsCount", 0);
        setIntField(term294739, term294739.getClass(), "playSyncCount", 0);
        setIntField(term294739, term294739.getClass(), "winCount", 0);
        setIntField(term294739, term294739.getClass(), "helpCount", 0);
        setIntField(term294739, term294739.getClass(), "comboCount", 0);
        setLongField(term294739, term294739.getClass(), "totalDeluxscore", 0L);
        setLongField(term294739, term294739.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term294739, term294739.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term294739, term294739.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term294739, term294739.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term294739, term294739.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term294739, term294739.getClass(), "totalSync", 0);
        setIntField(term294739, term294739.getClass(), "totalBasicSync", 0);
        setIntField(term294739, term294739.getClass(), "totalAdvancedSync", 0);
        setIntField(term294739, term294739.getClass(), "totalExpertSync", 0);
        setIntField(term294739, term294739.getClass(), "totalMasterSync", 0);
        setIntField(term294739, term294739.getClass(), "totalReMasterSync", 0);
        setLongField(term294739, term294739.getClass(), "totalAchievement", 0L);
        setLongField(term294739, term294739.getClass(), "totalBasicAchievement", 0L);
        setLongField(term294739, term294739.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term294739, term294739.getClass(), "totalExpertAchievement", 0L);
        setLongField(term294739, term294739.getClass(), "totalMasterAchievement", 0L);
        setLongField(term294739, term294739.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term294739, term294739.getClass(), "playerOldRating", 0L);
        setLongField(term294739, term294739.getClass(), "playerNewRating", 0L);
        setIntField(term294739, term294739.getClass(), "banState", 0);
        setLongField(term294739, term294739.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term294739, args);
    }

};


