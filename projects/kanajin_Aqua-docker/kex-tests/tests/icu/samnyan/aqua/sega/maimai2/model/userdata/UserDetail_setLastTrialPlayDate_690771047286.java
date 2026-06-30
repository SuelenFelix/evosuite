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

public class UserDetail_setLastTrialPlayDate_690771047286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293145;

    public UserDetail_setLastTrialPlayDate_690771047286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293145 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term293145, term293145.getClass(), "id", 0L);
        setField(term293145, term293145.getClass(), "card", null);
        setField(term293145, term293145.getClass(), "userName", null);
        setIntField(term293145, term293145.getClass(), "isNetMember", 0);
        setIntField(term293145, term293145.getClass(), "iconId", 0);
        setIntField(term293145, term293145.getClass(), "plateId", 0);
        setIntField(term293145, term293145.getClass(), "titleId", 0);
        setIntField(term293145, term293145.getClass(), "partnerId", 0);
        setIntField(term293145, term293145.getClass(), "frameId", 0);
        setIntField(term293145, term293145.getClass(), "selectMapId", 0);
        setIntField(term293145, term293145.getClass(), "totalAwake", 0);
        setIntField(term293145, term293145.getClass(), "gradeRating", 0);
        setIntField(term293145, term293145.getClass(), "musicRating", 0);
        setIntField(term293145, term293145.getClass(), "playerRating", 0);
        setIntField(term293145, term293145.getClass(), "highestRating", 0);
        setIntField(term293145, term293145.getClass(), "gradeRank", 0);
        setIntField(term293145, term293145.getClass(), "classRank", 0);
        setIntField(term293145, term293145.getClass(), "courseRank", 0);
        setField(term293145, term293145.getClass(), "charaSlot", null);
        setField(term293145, term293145.getClass(), "charaLockSlot", null);
        setLongField(term293145, term293145.getClass(), "contentBit", 0L);
        setIntField(term293145, term293145.getClass(), "playCount", 0);
        setField(term293145, term293145.getClass(), "eventWatchedDate", null);
        setField(term293145, term293145.getClass(), "lastGameId", null);
        setField(term293145, term293145.getClass(), "lastRomVersion", null);
        setField(term293145, term293145.getClass(), "lastDataVersion", null);
        setField(term293145, term293145.getClass(), "lastLoginDate", null);
        setField(term293145, term293145.getClass(), "lastPlayDate", null);
        setIntField(term293145, term293145.getClass(), "lastPlayCredit", 0);
        setIntField(term293145, term293145.getClass(), "lastPlayMode", 0);
        setIntField(term293145, term293145.getClass(), "lastPlaceId", 0);
        setField(term293145, term293145.getClass(), "lastPlaceName", null);
        setIntField(term293145, term293145.getClass(), "lastAllNetId", 0);
        setIntField(term293145, term293145.getClass(), "lastRegionId", 0);
        setField(term293145, term293145.getClass(), "lastRegionName", null);
        setField(term293145, term293145.getClass(), "lastClientId", null);
        setField(term293145, term293145.getClass(), "lastCountryCode", null);
        setIntField(term293145, term293145.getClass(), "lastSelectEMoney", 0);
        setIntField(term293145, term293145.getClass(), "lastSelectTicket", 0);
        setIntField(term293145, term293145.getClass(), "lastSelectCourse", 0);
        setIntField(term293145, term293145.getClass(), "lastCountCourse", 0);
        setField(term293145, term293145.getClass(), "firstGameId", null);
        setField(term293145, term293145.getClass(), "firstRomVersion", null);
        setField(term293145, term293145.getClass(), "firstDataVersion", null);
        setField(term293145, term293145.getClass(), "firstPlayDate", null);
        setField(term293145, term293145.getClass(), "compatibleCmVersion", null);
        setField(term293145, term293145.getClass(), "dailyBonusDate", null);
        setField(term293145, term293145.getClass(), "dailyCourseBonusDate", null);
        setField(term293145, term293145.getClass(), "lastPairLoginDate", null);
        setField(term293145, term293145.getClass(), "lastTrialPlayDate", null);
        setIntField(term293145, term293145.getClass(), "playVsCount", 0);
        setIntField(term293145, term293145.getClass(), "playSyncCount", 0);
        setIntField(term293145, term293145.getClass(), "winCount", 0);
        setIntField(term293145, term293145.getClass(), "helpCount", 0);
        setIntField(term293145, term293145.getClass(), "comboCount", 0);
        setLongField(term293145, term293145.getClass(), "totalDeluxscore", 0L);
        setLongField(term293145, term293145.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term293145, term293145.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term293145, term293145.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term293145, term293145.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term293145, term293145.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term293145, term293145.getClass(), "totalSync", 0);
        setIntField(term293145, term293145.getClass(), "totalBasicSync", 0);
        setIntField(term293145, term293145.getClass(), "totalAdvancedSync", 0);
        setIntField(term293145, term293145.getClass(), "totalExpertSync", 0);
        setIntField(term293145, term293145.getClass(), "totalMasterSync", 0);
        setIntField(term293145, term293145.getClass(), "totalReMasterSync", 0);
        setLongField(term293145, term293145.getClass(), "totalAchievement", 0L);
        setLongField(term293145, term293145.getClass(), "totalBasicAchievement", 0L);
        setLongField(term293145, term293145.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term293145, term293145.getClass(), "totalExpertAchievement", 0L);
        setLongField(term293145, term293145.getClass(), "totalMasterAchievement", 0L);
        setLongField(term293145, term293145.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term293145, term293145.getClass(), "playerOldRating", 0L);
        setLongField(term293145, term293145.getClass(), "playerNewRating", 0L);
        setIntField(term293145, term293145.getClass(), "banState", 0);
        setLongField(term293145, term293145.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastTrialPlayDate", argTypes, term293145, args);
    }

};


