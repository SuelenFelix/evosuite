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
import java.lang.Long;

public class UserDetail_setTotalExpertDeluxscore_1701720050295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293656;
     Object term293711;

    public UserDetail_setTotalExpertDeluxscore_1701720050295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293656 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term293656, term293656.getClass(), "id", 0L);
        setField(term293656, term293656.getClass(), "card", null);
        setField(term293656, term293656.getClass(), "userName", null);
        setIntField(term293656, term293656.getClass(), "isNetMember", 0);
        setIntField(term293656, term293656.getClass(), "iconId", 0);
        setIntField(term293656, term293656.getClass(), "plateId", 0);
        setIntField(term293656, term293656.getClass(), "titleId", 0);
        setIntField(term293656, term293656.getClass(), "partnerId", 0);
        setIntField(term293656, term293656.getClass(), "frameId", 0);
        setIntField(term293656, term293656.getClass(), "selectMapId", 0);
        setIntField(term293656, term293656.getClass(), "totalAwake", 0);
        setIntField(term293656, term293656.getClass(), "gradeRating", 0);
        setIntField(term293656, term293656.getClass(), "musicRating", 0);
        setIntField(term293656, term293656.getClass(), "playerRating", 0);
        setIntField(term293656, term293656.getClass(), "highestRating", 0);
        setIntField(term293656, term293656.getClass(), "gradeRank", 0);
        setIntField(term293656, term293656.getClass(), "classRank", 0);
        setIntField(term293656, term293656.getClass(), "courseRank", 0);
        setField(term293656, term293656.getClass(), "charaSlot", null);
        setField(term293656, term293656.getClass(), "charaLockSlot", null);
        setLongField(term293656, term293656.getClass(), "contentBit", 0L);
        setIntField(term293656, term293656.getClass(), "playCount", 0);
        setField(term293656, term293656.getClass(), "eventWatchedDate", null);
        setField(term293656, term293656.getClass(), "lastGameId", null);
        setField(term293656, term293656.getClass(), "lastRomVersion", null);
        setField(term293656, term293656.getClass(), "lastDataVersion", null);
        setField(term293656, term293656.getClass(), "lastLoginDate", null);
        setField(term293656, term293656.getClass(), "lastPlayDate", null);
        setIntField(term293656, term293656.getClass(), "lastPlayCredit", 0);
        setIntField(term293656, term293656.getClass(), "lastPlayMode", 0);
        setIntField(term293656, term293656.getClass(), "lastPlaceId", 0);
        setField(term293656, term293656.getClass(), "lastPlaceName", null);
        setIntField(term293656, term293656.getClass(), "lastAllNetId", 0);
        setIntField(term293656, term293656.getClass(), "lastRegionId", 0);
        setField(term293656, term293656.getClass(), "lastRegionName", null);
        setField(term293656, term293656.getClass(), "lastClientId", null);
        setField(term293656, term293656.getClass(), "lastCountryCode", null);
        setIntField(term293656, term293656.getClass(), "lastSelectEMoney", 0);
        setIntField(term293656, term293656.getClass(), "lastSelectTicket", 0);
        setIntField(term293656, term293656.getClass(), "lastSelectCourse", 0);
        setIntField(term293656, term293656.getClass(), "lastCountCourse", 0);
        setField(term293656, term293656.getClass(), "firstGameId", null);
        setField(term293656, term293656.getClass(), "firstRomVersion", null);
        setField(term293656, term293656.getClass(), "firstDataVersion", null);
        setField(term293656, term293656.getClass(), "firstPlayDate", null);
        setField(term293656, term293656.getClass(), "compatibleCmVersion", null);
        setField(term293656, term293656.getClass(), "dailyBonusDate", null);
        setField(term293656, term293656.getClass(), "dailyCourseBonusDate", null);
        setField(term293656, term293656.getClass(), "lastPairLoginDate", null);
        setField(term293656, term293656.getClass(), "lastTrialPlayDate", null);
        setIntField(term293656, term293656.getClass(), "playVsCount", 0);
        setIntField(term293656, term293656.getClass(), "playSyncCount", 0);
        setIntField(term293656, term293656.getClass(), "winCount", 0);
        setIntField(term293656, term293656.getClass(), "helpCount", 0);
        setIntField(term293656, term293656.getClass(), "comboCount", 0);
        setLongField(term293656, term293656.getClass(), "totalDeluxscore", 0L);
        setLongField(term293656, term293656.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term293656, term293656.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term293656, term293656.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term293656, term293656.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term293656, term293656.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term293656, term293656.getClass(), "totalSync", 0);
        setIntField(term293656, term293656.getClass(), "totalBasicSync", 0);
        setIntField(term293656, term293656.getClass(), "totalAdvancedSync", 0);
        setIntField(term293656, term293656.getClass(), "totalExpertSync", 0);
        setIntField(term293656, term293656.getClass(), "totalMasterSync", 0);
        setIntField(term293656, term293656.getClass(), "totalReMasterSync", 0);
        setLongField(term293656, term293656.getClass(), "totalAchievement", 0L);
        setLongField(term293656, term293656.getClass(), "totalBasicAchievement", 0L);
        setLongField(term293656, term293656.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term293656, term293656.getClass(), "totalExpertAchievement", 0L);
        setLongField(term293656, term293656.getClass(), "totalMasterAchievement", 0L);
        setLongField(term293656, term293656.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term293656, term293656.getClass(), "playerOldRating", 0L);
        setLongField(term293656, term293656.getClass(), "playerNewRating", 0L);
        setIntField(term293656, term293656.getClass(), "banState", 0);
        setLongField(term293656, term293656.getClass(), "dateTime", 0L);
        term293711 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term293711;
        callMethod(klass, "setTotalExpertDeluxscore", argTypes, term293656, args);
    }

};


