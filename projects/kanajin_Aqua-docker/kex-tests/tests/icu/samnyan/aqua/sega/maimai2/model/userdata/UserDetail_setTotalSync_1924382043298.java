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
import java.lang.Integer;

public class UserDetail_setTotalSync_1924382043298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293827;
     Object term293882;

    public UserDetail_setTotalSync_1924382043298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293827 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term293827, term293827.getClass(), "id", 0L);
        setField(term293827, term293827.getClass(), "card", null);
        setField(term293827, term293827.getClass(), "userName", null);
        setIntField(term293827, term293827.getClass(), "isNetMember", 0);
        setIntField(term293827, term293827.getClass(), "iconId", 0);
        setIntField(term293827, term293827.getClass(), "plateId", 0);
        setIntField(term293827, term293827.getClass(), "titleId", 0);
        setIntField(term293827, term293827.getClass(), "partnerId", 0);
        setIntField(term293827, term293827.getClass(), "frameId", 0);
        setIntField(term293827, term293827.getClass(), "selectMapId", 0);
        setIntField(term293827, term293827.getClass(), "totalAwake", 0);
        setIntField(term293827, term293827.getClass(), "gradeRating", 0);
        setIntField(term293827, term293827.getClass(), "musicRating", 0);
        setIntField(term293827, term293827.getClass(), "playerRating", 0);
        setIntField(term293827, term293827.getClass(), "highestRating", 0);
        setIntField(term293827, term293827.getClass(), "gradeRank", 0);
        setIntField(term293827, term293827.getClass(), "classRank", 0);
        setIntField(term293827, term293827.getClass(), "courseRank", 0);
        setField(term293827, term293827.getClass(), "charaSlot", null);
        setField(term293827, term293827.getClass(), "charaLockSlot", null);
        setLongField(term293827, term293827.getClass(), "contentBit", 0L);
        setIntField(term293827, term293827.getClass(), "playCount", 0);
        setField(term293827, term293827.getClass(), "eventWatchedDate", null);
        setField(term293827, term293827.getClass(), "lastGameId", null);
        setField(term293827, term293827.getClass(), "lastRomVersion", null);
        setField(term293827, term293827.getClass(), "lastDataVersion", null);
        setField(term293827, term293827.getClass(), "lastLoginDate", null);
        setField(term293827, term293827.getClass(), "lastPlayDate", null);
        setIntField(term293827, term293827.getClass(), "lastPlayCredit", 0);
        setIntField(term293827, term293827.getClass(), "lastPlayMode", 0);
        setIntField(term293827, term293827.getClass(), "lastPlaceId", 0);
        setField(term293827, term293827.getClass(), "lastPlaceName", null);
        setIntField(term293827, term293827.getClass(), "lastAllNetId", 0);
        setIntField(term293827, term293827.getClass(), "lastRegionId", 0);
        setField(term293827, term293827.getClass(), "lastRegionName", null);
        setField(term293827, term293827.getClass(), "lastClientId", null);
        setField(term293827, term293827.getClass(), "lastCountryCode", null);
        setIntField(term293827, term293827.getClass(), "lastSelectEMoney", 0);
        setIntField(term293827, term293827.getClass(), "lastSelectTicket", 0);
        setIntField(term293827, term293827.getClass(), "lastSelectCourse", 0);
        setIntField(term293827, term293827.getClass(), "lastCountCourse", 0);
        setField(term293827, term293827.getClass(), "firstGameId", null);
        setField(term293827, term293827.getClass(), "firstRomVersion", null);
        setField(term293827, term293827.getClass(), "firstDataVersion", null);
        setField(term293827, term293827.getClass(), "firstPlayDate", null);
        setField(term293827, term293827.getClass(), "compatibleCmVersion", null);
        setField(term293827, term293827.getClass(), "dailyBonusDate", null);
        setField(term293827, term293827.getClass(), "dailyCourseBonusDate", null);
        setField(term293827, term293827.getClass(), "lastPairLoginDate", null);
        setField(term293827, term293827.getClass(), "lastTrialPlayDate", null);
        setIntField(term293827, term293827.getClass(), "playVsCount", 0);
        setIntField(term293827, term293827.getClass(), "playSyncCount", 0);
        setIntField(term293827, term293827.getClass(), "winCount", 0);
        setIntField(term293827, term293827.getClass(), "helpCount", 0);
        setIntField(term293827, term293827.getClass(), "comboCount", 0);
        setLongField(term293827, term293827.getClass(), "totalDeluxscore", 0L);
        setLongField(term293827, term293827.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term293827, term293827.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term293827, term293827.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term293827, term293827.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term293827, term293827.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term293827, term293827.getClass(), "totalSync", 0);
        setIntField(term293827, term293827.getClass(), "totalBasicSync", 0);
        setIntField(term293827, term293827.getClass(), "totalAdvancedSync", 0);
        setIntField(term293827, term293827.getClass(), "totalExpertSync", 0);
        setIntField(term293827, term293827.getClass(), "totalMasterSync", 0);
        setIntField(term293827, term293827.getClass(), "totalReMasterSync", 0);
        setLongField(term293827, term293827.getClass(), "totalAchievement", 0L);
        setLongField(term293827, term293827.getClass(), "totalBasicAchievement", 0L);
        setLongField(term293827, term293827.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term293827, term293827.getClass(), "totalExpertAchievement", 0L);
        setLongField(term293827, term293827.getClass(), "totalMasterAchievement", 0L);
        setLongField(term293827, term293827.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term293827, term293827.getClass(), "playerOldRating", 0L);
        setLongField(term293827, term293827.getClass(), "playerNewRating", 0L);
        setIntField(term293827, term293827.getClass(), "banState", 0);
        setLongField(term293827, term293827.getClass(), "dateTime", 0L);
        term293882 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term293882;
        callMethod(klass, "setTotalSync", argTypes, term293827, args);
    }

};


